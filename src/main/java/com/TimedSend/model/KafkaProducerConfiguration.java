package com.TimedSend.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.StringEscapeUtils;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.*;

/**
 * kafka 生产者配置类
 *
 * @author Leo
 * @create 2020/12/31 15:09
 **/
@Slf4j
@Configuration
public class KafkaProducerConfiguration {
    public  int sizeTime = 0;
    @Value("${kafka.url}")
    private String kafkaIp;
    /**
     * 不包含事务 producerFactory
     * @return
     */
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> props = new HashMap<>();
        //kafka 集群地址
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaIp);
        //重试次数
        props.put(ProducerConfig.RETRIES_CONFIG, 3);
        //应答级别
        //acks=0 把消息发送到kafka就认为发送成功
        //acks=1 把消息发送到kafka leader分区，并且写入磁盘就认为发送成功
        //acks=all 把消息发送到kafka leader分区，并且leader分区的副本follower对消息进行了同步就任务发送成功
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        //KafkaProducer.send() 和 partitionsFor() 方法的最长阻塞时间 单位 ms
        props.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, 6000);
        //批量处理的最大大小 单位 byte
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 4096);
        //发送延时,当生产端积累的消息达到batch-size或接收到消息linger.ms后,生产者就会将消息提交给kafka
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1000);
        //生产者可用缓冲区的最大值 单位 byte
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        //每条消息最大的大小
        props.put(ProducerConfig.MAX_REQUEST_SIZE_CONFIG, 1048576);
        //客户端ID
        //props.put(ProducerConfig.CLIENT_ID_CONFIG, "kafka");
        //Key 序列化方式
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        //Value 序列化方式
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        //消息压缩：none、lz4、gzip、snappy，默认为 none。
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "none");
        //自定义分区器
        //props.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "0");

        //System.setProperty("java.security.auth.login.config", "E:\\code\\xtprtanalysis\\jaas.conf");
        //System.setProperty("java.security.krb5.conf", "E:\\code\\xtprtanalysis\\krb5.conf");
        //props.put("sasl.mechanism", "GSSAPI");
        //props.put("security.protocol", "SASL_PLAINTEXT");
        //properties.put("sasl.kerberos.service.name", "kafka");
        //props.put("sasl.kerberos.service.name", "kafka");
        return new DefaultKafkaProducerFactory<>(props);
    }

    /**
     * kafkaTemplate
     * @return
     */
    @Bean("kafkaTemplate")
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    public void sendMessage(String topic,List<String>  listStr, List<Object> listObj, String useMap) {
        KafkaTemplate<String, String>  kafkaTemplate =new KafkaTemplate<>(producerFactory());
        int groupSize = 500;
        int length = listStr.size();
        // 计算可以分成多少组
        int num = (length + groupSize - 1) / groupSize;
        log.info("<<<<<num:" + num);
        log.info("<<<<< TopicName" + topic );
        String alllevel="";
        String sendstr="";
        JSONObject hangqingMap=new JSONObject();
        try {
//            for (int i = 0; i < num; i++) {
//                // 开始位置
//                int fromIndex = i * groupSize;
//                // 结束位置
//                int toIndex = (i + 1) * groupSize < length ? (i + 1) * groupSize : length;
//                List<String> ts = list.subList(fromIndex, toIndex);
//                log.info("<<<<<sendMessageSync => topic: {},  message: {}", topic, ts.size());
//                kafkaTemplate.send(topic, JSONArray.toJSONString(ts));
            if ("not".equals(useMap)) {
                for (String a : listStr) {
                    String singleStr = a;
                    log.info(singleStr);
                    alllevel = alllevel + singleStr;
                }
                //sendstr= StringEscapeUtils.unescapeJava(data);
                kafkaTemplate.send(topic, JSONArray.toJSONString(alllevel));
            }
            else if("use".equals(useMap))
            {
                log.info("test  OBJ: " + JSONObject.toJSONString(listObj));
                hangqingMap.put("hq.px",listObj);
                log.info("test  JOSN  : " + JSON.toJSONString(hangqingMap));
                kafkaTemplate.send(topic, JSON.toJSONString(hangqingMap));
            }

        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }

    public void sendMessageTrade(String topic, List<Object> listObj) {
        KafkaTemplate<String, String>  kafkaTemplate =new KafkaTemplate<>(producerFactory());
        int groupSize = 500;
        // 计算可以分成多少组
        log.info("<<<<< TopicName" + topic );

        JSONObject hangqingMap=new JSONObject();
        try {
            for(Object itObj: listObj)
            {
                kafkaTemplate.send(topic, JSON.toJSONString(itObj));
                log.info(JSON.toJSONString(itObj));
            }


        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }



    public void sendMessageBondQuotation(String topic,MktRealTimeClass listObj) {
        KafkaTemplate<String, String>  kafkaTemplate =new KafkaTemplate<>(producerFactory());

        log.info("<<<<< TopicName" + topic );
//
//        JSONObject hangqingMap=new JSONObject();
//        try {
//            for(Object itObj: listObj)
//            {
//                //String key  = JSONObject.toJSONString(topic);
//                kafkaTemplate.send(topic, JSON.toJSONString(itObj));
//                log.info(JSON.toJSONString(itObj));
//            }

        try{

             kafkaTemplate.send(topic, JSON.toJSONString(listObj));

            log.info(JSON.toJSONString(listObj));

        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }

    public void sendMessageGroup(String topic,List<String>  listStr, List<Object> listObj, String useMap,int time) {
        KafkaTemplate<String, String>  kafkaTemplate =new KafkaTemplate<>(producerFactory());
        sizeTime = 0;
        log.info("<<<<< TopicName" + topic );
        JSONObject hangMap = new JSONObject();
        Timer timer = new Timer();
        // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
        TimerTask timerTasklevel1 = new TimerTask() {
            @Override
            public void run() {
                if(sizeTime >= listStr.size())
                {
                    timer.cancel();
                    return;
                }
                log.info("test  OBJ: " + JSONObject.toJSONString(listStr.get(sizeTime)));
                kafkaTemplate.send(topic, JSONObject.toJSONString(listStr.get(sizeTime)));
                sizeTime++;
            }
        };

        TimerTask timerTasklevel2 = new TimerTask() {
            @Override
            public void run() {
                if(sizeTime >= listObj.size())
                {
                    timer.cancel();
                    return;
                }
                log.info("test  OBJ: " + JSONObject.toJSONString(listObj.get(sizeTime)));
                hangMap.put("hq.px",listObj.get(sizeTime));
                kafkaTemplate.send(topic, JSONObject.toJSONString(hangMap));
                sizeTime++;
                //kafkaTemplate.send(topic, JSONObject.toJSONString(singleStr));
            }
        };

        try {
            if ("not".equals(useMap)) {
                timer.schedule(timerTasklevel1,200,time);
            }
            else if("use".equals(useMap))
            {
                timer.schedule(timerTasklevel2,200,time);
            }

        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }

    public void sendMessagetEST(String topic, List<Object> listObj) {
        KafkaTemplate<String, String>  kafkaTemplate =new KafkaTemplate<>(producerFactory());
        log.info("<<<<< TopicName" + topic );
        log.info("<<<<< listObj" +  JSONObject.toJSONString(listObj) );
        kafkaTemplate.send(topic, JSONObject.toJSONString(listObj));
    }


}