package com.TimedSend.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Slf4j
@Service
public class KafkaSend {
    @Qualifier("kafkaTemplate")
    @Resource
    private KafkaTemplate kafkaTemplate;

    public void sendMessageGetResult(String topic, String message) throws ExecutionException, InterruptedException {
        ListenableFuture<SendResult> future =kafkaTemplate.send("level2.SHDepth",message);
        SendResult<String, String> sendResult =future.get();
        long mes =sendResult.getRecordMetadata().offset();
        log.info("sendMessageSync => topic: {}, message: {}", topic, message);
        log.info("The partition the message was sent to: " + sendResult.getRecordMetadata().partition());
    }


}
