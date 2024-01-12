package com.TimedSend.controller;


import org.apache.commons.collections4.ListUtils;
import com.TimedSend.mapper.*;
import com.TimedSend.model.*;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.apache.ibatis.annotations.Param;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trealdeal")
@Slf4j
public class TrealdealController {
    public  int sizeTime=0;

    public  int  count=1;

    private KafkaTemplate kafkaTemplate;

    @Autowired
    TcombiMapper tcombiMapper;

    @Autowired
    TstockinfoMapper tstockinfoMapper;
    @Autowired
    KafkaSend kafkaSend;

    @Autowired
    KafkaProducerConfiguration kafkaProducer;


    @Resource
    ShlevelMapper shlevelMapper;

    @Resource
    SzlevelMapper szlevelMapper;

    @Resource
    TrskHldMapper trskHldMapper;

  @Resource
  TtrdCmdsExecutionreportMapper cmdsMapper;

    @Resource
    TrealdealMapper trealdealMapper;
    @Resource
    TcTrealdealMapper tcTrealdealMapper;

    @Resource
   TtrdOtcTradeMapper ttrdOtcTradeMapper;
    @Resource
    TradingresultMapper tradingresultMapper;
    @Resource
    TcTradingresultMapper tcTradingresultMapper;

    @Resource
    TcFuturetradingresultMapper tcFuturetradingresultMapper;

    @Resource
    FuturetradingresultMapper futuretradingresultMapper;

    @Resource
    HklevelMapper hklevelMapper;
    @Resource
    NeeqlevelMapper neeqlevelMapper;
    @Resource
    QhlevelMapper qhlevelMapper;
    @Resource
    TtrdTprtProfitDailyMapper ttrdTprtProfitDailyMapper;
    @Resource
    QqlevelMapper qqlevelMapper;
    @Resource
    HjzslevelMapper hjzslevelMapper;

    @Resource
    OptionDeltaMapper optionDeltaMapper;

    @Resource
    TtrdOtcTradePublicMapper tradePublicMapper;
    @Resource
    TrskPpAiLevelMapper trskPpAiLevelMapper;


    @PostMapping("/send")
    public void send() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                int numrond = (int) ((Math.random() * +1) * 1000000000);
                UUID.randomUUID();
                String i_code = String.valueOf(numrond);
                int price = (int) (Math.random() * 10 + 1);
                String strprice = String.valueOf(price);

                int numrond_s = (int) ((Math.random() * 9 + 1) * 1000000000);
                String i_code_s = String.valueOf(numrond_s);
                int price_s = (int) (Math.random() * 7 + 1);
                String strprice_s = String.valueOf(price_s);
                List<Map<String, Object>> mes = new ArrayList<>();
                // {"STK_CODE":"A","SEC_NAME":"8888","LST_DT_PRICE":"50","LAST_PRICE":"55","MARKET":"XSHG","DATE_TIME":"11"}
                for (int i = 0; i < 4; ++i) {
                    Map<String, Object> newMess = new HashMap<>();
                    String STK_CODEid = UUID.randomUUID().toString().substring(0, 7);
                    int numaPRICE = (int) ((Math.random() * 9 + i) * 100);

                    newMess.put("STK_CODE", STK_CODEid);
                    newMess.put("SEC_NAME", "8888");
                    newMess.put("LST_DT_PRICE", numaPRICE);
                    newMess.put("MARKET", "XSHG");
                    newMess.put("MARKET", "11");

                    mes.add(newMess);

                }
                String mNode = JSONArray.toJSONString(mes);
                List<Shlevel> shlevelList = new ArrayList<>();
                List<Szlevel> szlevelList = new ArrayList<>();
                List<String> shlevelinfos = new ArrayList<>();
                List<String> szlevelinfos = new ArrayList<>();

                QueryWrapper queryWrapper = new QueryWrapper<>();
                shlevelList = shlevelMapper.selectList(queryWrapper);
                szlevelList = szlevelMapper.selectList(queryWrapper);

                for (Shlevel i : shlevelList) {
                    String stockpriceSH;
                    stockpriceSH = i.getICode() + "|" + i.getBuyPriceQueue() + "|" + i.getSellPriceQueue() + "|" + i.getBuyAmountQueue() + "|" + i.getSellAmountQueue() +
                            "|" + i.getBondName() + "|" + i.getCurrentSeat() + "|" + i.getLeastDealPrice() + "|" + i.getHighestDealPrice() + "|" + i.getMinimumDealPrice() +
                            "|" + i.getUpdateTime() + "|" + i.getInfoDate() + "|" + i.getNewPrice() + "|" + i.getMarketOpenPrice() + "|" + i.getDealRealCp() +
                            "|" + i.getMatchPlot() + "|" + i.getIopv() + "|" + i.getDealRealAmount() + "|" + i.getSellEntrustAmount() + "|" + i.getSellEntrustAmount() +
                            "|" + i.getAvgBuyPrice() + "|" + i.getAvgSellPrice() + "|" + i.getHardenPrice() + "|" + i.getDownPrice();
                    if (StringUtils.isEmpty(i.getICode()))
                        shlevelinfos.add(stockpriceSH);
                }

                for (Szlevel j : szlevelList) {
                    String stockPriceSZ;
                    stockPriceSZ = j.getICode() + "|" + j.getBuyPriceQueue() + "|" + j.getSellPriceQueue() + "|" + j.getBuyAmountQueue() + "|" + j.getSellAmountQueue() +
                            "|" + j.getExtraDim() + "|" + j.getBondName() + "|" + j.getCurrentSeat() + "|" + j.getLeastDealPrice() + "|" + j.getHighestDealPrice() + "|" + j.getMinimumDealPrice() +
                            "|" + j.getUpdateTime() + "|" + j.getInfoDate() + "|" + j.getNewPrice() + "|" + j.getMarketOpenPrice() + "|" + j.getDealRealCp() +
                            "|" + j.getMatchPlot() + "|" + j.getIopv() + "|" + j.getStockValue() + "|" + j.getDealRealAmount() + "|" + j.getSellEntrustAmount() + "|" + j.getSellEntrustAmount() +
                            "|" + j.getAvgBuyPrice() + "|" + j.getAvgSellPrice() + "|" + j.getPePrfi01() + "|" + j.getPePrfi02() + "|" + j.getHardenPrice() + "|" + j.getDownPrice();
                    if (StringUtils.isEmpty(j.getICode()))
                        szlevelinfos.add(stockPriceSZ);
                }

                //kafkaProducer.sendMessage("level2.SHDepth",shlevelinfos);
                // kafkaProducer.sendMessage("level2.SZDepth",szlevelinfos);

//
//
//
//
//                List<Trealdeal>  trealdealList =new ArrayList<>();
//                List<Tcombi> tcombiList =new ArrayList<>();
//                List<Tstockinfo> tstockinfoList =new ArrayList<>();
//
//                List<Trealdeal>  trealdealListnew=new ArrayList<>();
//                List<Tcombi> tcombiListnew =new ArrayList<>();
//                List<Tstockinfo> tstockinfoListnew =new ArrayList<>();
//
//                QueryWrapper queryWrapperTrealDeal =new QueryWrapper<>();
//                queryWrapperTrealDeal.le("ROWNUM", "10");
//                queryWrapperTrealDeal.orderByDesc("L_REALDEAL_SERIAL_NO ");
//                //queryWrapperTrealDeal.last("limit 0,10");
//
//                QueryWrapper queryWrappercomb =new QueryWrapper<>();
//                queryWrappercomb.le("ROWNUM", "10");
//                queryWrappercomb.orderByDesc("L_COMBI_ID");
//                //queryWrappercomb.last("limit 0,10");
//
//                QueryWrapper queryWrapperinfo =new QueryWrapper<>();
//                queryWrapperinfo.le("ROWNUM", "10");
//                queryWrapperinfo.orderByDesc("VC_INTER_CODE");
//                //queryWrapperinfo.last("limit 0,10");
//
//                 trealdealList =trealdealMapper.selectList(queryWrapperTrealDeal);
//                 tcombiList = tcombiMapper.selectList(queryWrappercomb);
//                tstockinfoList =  tstockinfoMapper.selectList(queryWrapperinfo);
//                for (int i=0;i<4;++i)
//                {
//                    Tcombi tcombi = tcombiList.get(i);
//                    int numa= (int)((Math.random()*9+i)*100000000);
//                    BigDecimal id = new BigDecimal(numa);
//                    tcombi.setLCombiId(id);
//
//                    tcombiListnew.add(tcombi);
//
//                }
//                for (int j=0;j<4;++j)
//                {
//                    Tstockinfo tstockinfo =tstockinfoList.get(j);
//                    String deleteUuid = UUID.randomUUID().toString().substring(0,7);
//                    String re_i_code = UUID.randomUUID().toString().substring(0,5);
//                    tstockinfo.setVcInterCode(deleteUuid);
//                    tstockinfo.setVcReportCode(re_i_code);
//
//                    tstockinfoListnew.add(tstockinfo);
//
//                }
//                 for (int k=0;k<4;++k)
//                 {
//                     Trealdeal it = trealdealList.get(k);
//                     int a =(int)((Math.random()*(k+1)+k)*100000000);
//
//                     //String re_i_code = UUID.randomUUID().toString().substring(0,5);
//                     BigDecimal id = new BigDecimal(a);
//
//                     it.setLRealdealSerialNo(id);
//                     it.setVcReportCode(tstockinfoListnew.get(k).getVcReportCode());
//                     it.setVcInterCode(tstockinfoListnew.get(k).getVcInterCode());
//                     it.setLBasecombiId(tcombiListnew.get(k).getLCombiId());
//
//                     trealdealListnew.add(it);
//                 }
//                trealdealMapper.SaveBatch(trealdealListnew);
//                tcombiMapper.SaveBatch(tcombiListnew);
//                tstockinfoMapper.SaveBatch(tstockinfoListnew);


//                try {
//
//                    //kafkaSend.sendMessageGetResult("level2.SHDepth","key1", SHM);
//                    kafkaSend.sendMessageGetResult("level2.SHDepth","fwqtwet");
//                    //kafkaSend.sendMessageGetResult("level2.SZDepth",szM);
//                    //kafkaTemplate.send("level2.SHDepth", "test1024");
//                }
//                catch (ExecutionException e)
//                {
//
//                    throw new RuntimeException(e);
//                }
//                catch (InterruptedException e)
//                {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("打印当前时间：" + new Date());
            }
        };
        // 计时器
        Timer timer = new Timer();
        // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
        timer.schedule(timerTask, 1000, 5000);

        //kafkaSend.sendMessageGetResult(AssetNodeTopicName,"key1", mNode);
    }

    @PostMapping("/sendlevelBond")
    public synchronized void sendlevelBond(@RequestParam String baseDate,@RequestParam String time,
                                           @RequestParam String flag)
    {
        QueryWrapper queryWrapper1 = new QueryWrapper();
        List<TrskPpAiLevel>  tbsiBondPpsList = new ArrayList<>();
        queryWrapper1.eq("D_BASE", baseDate);
        tbsiBondPpsList = trskPpAiLevelMapper.selectList(queryWrapper1);
        int sizeplite = (int)Math.rint( tbsiBondPpsList.size()/2);

        List<List<TrskPpAiLevel>> splitlist = ListUtils.partition(tbsiBondPpsList, sizeplite);
        List<NpvClass>  npvClassList = new ArrayList<>();
        List<MktRealTimeClass> timePriceList = new ArrayList<>();
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String  datrStr = dateTimeFormat.format(date);

        //String dateSSSsTR = bondDateTimeFormat.get().format(date);

        MktRealTimeClass priceMtk = new MktRealTimeClass();
        List<String> aainstru = new ArrayList<>();
        List<MktContent> mtkContentlist = new ArrayList<>();
        int i=1;
        for(List<TrskPpAiLevel> groupIt: splitlist)
        {
            String num = String.valueOf(i);
            String id = "RST0" +num;
            MktContent   mtkContentOne = new MktContent();
            mtkContentOne.setMatrixID(id);
            List<MtkMatrixData> matrixDataList = new ArrayList<>();
            for(TrskPpAiLevel oneit: groupIt)
            {

                MtkMatrixData datedata = new MtkMatrixData();
                TrskPpAiLevel itpplevel = oneit;
                datedata.setI_CODE(itpplevel.getICode());
                datedata.setA_TYPE(itpplevel.getAType());
                datedata.setM_TYPE(itpplevel.getMType());
                datedata.setPE_CODE("PE_CODE");
                datedata.setTG_CODE("TG_CODE");
                datedata.setBEG_DATE(baseDate);
                datedata.setEFFECT_TIME(itpplevel.getEffectTime());
                datedata.setEFFECT_MSEC(itpplevel.getEffectMsec());
                datedata.setMK_ACCRUAL_0(itpplevel.getMkAccrual0());
                datedata.setMK_ACCRUAL_1(itpplevel.getMkAccrual1());
                datedata.setMK_TPRICE(itpplevel.getMkTprice());
                datedata.setMK_MTR_DATE(baseDate);
                datedata.setIMP_TIME(datrStr);
                //String eTime = itpplevel.getEffectTime();
                //String etimeDate = eTime.substring(0,2)+":"+eTime.substring(2,4)+":"+eTime.substring(4);
                matrixDataList.add(datedata);
            }
            mtkContentOne.setDatas(matrixDataList);
            mtkContentlist.add(mtkContentOne);
            i++;
        }

        if("PRICE".equals(flag))
        {
            for (TrskPpAiLevel itpp : tbsiBondPpsList) {
                TrskPpAiLevel itpplevel = itpp;
                aainstru.add(itpplevel.getICode()+","+itpplevel.getAType()+","
                        +itpplevel.getMType());
            }
        }
        else if ("NPV".equals(flag))
        {
        for (TrskPpAiLevel itpp : tbsiBondPpsList)
        {
            TrskPpAiLevel itpplevel =  itpp;

                NpvBody npvBody = new NpvBody();
                NpvParam npvParam = new NpvParam();
                List<String> aa = new ArrayList<>();
                aa.add(itpplevel.getICode()+","+itpplevel.getAType()+","
                        +itpplevel.getMType());

                npvParam.setInstrumentID(aa);
                npvParam.setPeCode("PE_CODE");
                npvParam.setCalcDate(itpplevel.getBegDate());
                npvParam.setCalcTime(itpplevel.getEffectTime());
                npvParam.setCalcTimeMode("1");
                npvParam.setIsInsertDB("true");
                npvParam.setContent("1");

                NpvResult npvResult = new NpvResult();
                npvResult.setErrorCode("200");
                npvResult.setErrorMsg("infoerror");
                NpvContent npvContent = new NpvContent();
                npvContent.setNpv(itpplevel.getMkTprice());
                npvResult.setContent(npvContent);

                npvBody.setParam(npvParam);
                npvBody.setResult(npvResult);
                NpvClass singleNpv = new NpvClass();
                singleNpv.setType("NPV");
                singleNpv.setId("1111");
                singleNpv.setDate(baseDate);
                singleNpv.setTime(itpplevel.getEffectTime());
                singleNpv.setBody(npvBody);
                npvClassList.add(singleNpv);
        }}
        priceMtk.setType("CALC_MKT_REALTIME");
        priceMtk.setId("1241413431");
        priceMtk.setDate(baseDate);
        priceMtk.setTime(time);
        MktBody mktBody = new MktBody();

        MktParam mtkparam = new MktParam();
        mtkparam.setInstrumentID(aainstru);
        mtkparam.setPeCode("PE_CODE");
        mtkparam.setCalcDate(baseDate);
        mtkparam.setCalcTime(datrStr);
        mtkparam.setCalcTimeMode("1");
        mtkparam.setIsInsertDB("true");
        mtkparam.setContent("1");
        mktBody.setParam(mtkparam);

        MktResult mtkReSULT = new MktResult();
        mtkReSULT.setErrorMsg("infooo");
        mtkReSULT.setErrorCode("200");
        mtkReSULT.setContent(mtkContentlist);

        mktBody.setParam(mtkparam);
        mktBody.setResult(mtkReSULT);
        priceMtk.setBody(mktBody);

        //log.info("print:"+ JSONObject.toJSONString(sendinfo));
        log.info("print:"+ JSONObject.toJSONString(priceMtk));
        //log.info("print111111");
//        if (!ObjectUtils.isEmpty(priceMtk))
//         kafkaProducer.sendMessageBondQuotation("TBSI_INST_REALTIME",priceMtk);

//        if (!CollectionUtils.isEmpty(npvClassList) && "NPV".equals(flag))
//            kafkaProducer.sendMessageBondQuotation("TBSI_INST_REALTIME",npvClassList, timePriceList,"NPV");
//        if (!CollectionUtils.isEmpty(npvClassList) && "PRICE".equals(flag))
//            kafkaProducer.sendMessageBondQuotation("TBSI_INST_REALTIME",npvClassList, timePriceList,"PRICE");
   }

    @PostMapping("/sendLevel")
    public synchronized void sendlevel(@RequestParam String baseDate, @RequestParam String flag) {
        List<Shlevel> shlevelList = new ArrayList<>();
        List<Szlevel> szlevelList = new ArrayList<>();
        List<String> shlevelinfos = new ArrayList<>();
        List<String> szlevelinfos = new ArrayList<>();

        List<Hklevel> hklevelList = new ArrayList<>();
        List<Neeqlevel> neeqlevelList = new ArrayList<>();
        List<Qhlevel> qhlevelList = new ArrayList<>();
        List<Qqlevel> qqlevelList = new ArrayList<>();
        List<Hklevel> tidxlevelList = new ArrayList<>();
        List<Hjzslevel> hjzslevelList = new ArrayList<>();
        List<hjAndIdxLevel> hjAndIdxLevelList = new ArrayList<>();
        List<OptionDelta>  optionDeltaList = new ArrayList<>();

        List<Object> hklevelinfosStr = new ArrayList<>();
        List<Object> neelevelinfosStr = new ArrayList<>();
        List<Object> qhlevelinfosStr = new ArrayList<>();
        List<Object> qqlevelinfoStr = new ArrayList<>();
        List<Object> tidxlevelinfoStr = new ArrayList<>();
        List<Object> hjzslevelStr = new ArrayList<>();
        List<Object>  optionDeltaStr = new ArrayList<>();

        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("INFO_DATE", baseDate);

        if ("LEVEL2".equals(flag))
        {
            log.info("<<<<<before  send hangqing:" + Thread.currentThread().getName());
            shlevelList = shlevelMapper.selectList(queryWrapper);
            for (Shlevel i : shlevelList) {
                String stockpriceSH;
                stockpriceSH = i.getICode() + "|" + i.getBuyPriceQueue() + "|" + i.getSellPriceQueue() + "|" + i.getBuyAmountQueue() + "|" + i.getSellAmountQueue() +
                        "|" + i.getBondName() + "|" + i.getCurrentSeat() + "|" + i.getLeastDealPrice() + "|" + i.getHighestDealPrice() + "|" + i.getMinimumDealPrice() +
                        "|" + i.getUpdateTime() + "|" + i.getInfoDate() + "|" + i.getNewPrice() + "|" + i.getMarketOpenPrice() + "|" + i.getDealRealCp() +
                        "|" + i.getMatchPlot() + "|" + i.getIopv() + "|" + i.getDealRealAmount() + "|" + i.getSellEntrustAmount() + "|" + i.getBuyEntrustAmount() +
                        "|" + i.getAvgBuyPrice() + "|" + i.getAvgSellPrice() + "|" + i.getHardenPrice() + "|" + i.getDownPrice() + "|";
                if (!StringUtils.isEmpty(i.getICode()))
                    shlevelinfos.add(stockpriceSH);
            }

            szlevelList = szlevelMapper.selectList(queryWrapper);
            for (Szlevel j : szlevelList) {
                String stockPriceSZ;
                stockPriceSZ = j.getICode() + "|" + j.getBuyPriceQueue() + "|" + j.getSellPriceQueue() + "|" + j.getBuyAmountQueue() +
                        "|" + j.getSellAmountQueue() + "|" + j.getExtraDim() + "|" + j.getBondName() + "|" + j.getCurrentSeat() +
                        "|" + j.getLeastDealPrice() + "|" + j.getHighestDealPrice() + "|" + j.getMinimumDealPrice() +
                        "|" + j.getUpdateTime() + "|" + j.getInfoDate() + "|" + j.getNewPrice() + "|" + j.getMarketOpenPrice() +
                        "|" + j.getDealRealCp() + "|" + j.getMatchPlot() + "|" + j.getIopv() + "|" + j.getStockValue() +
                        "|" + j.getDealRealAmount() + "|" + j.getSellEntrustAmount() + "|" + j.getBuyEntrustAmount() +
                        "|" + j.getAvgBuyPrice() + "|" + j.getAvgSellPrice() + "|" + j.getPePrfi01() + "|" + j.getPePrfi02() +
                        "|" + j.getHardenPrice() + "|" + j.getDownPrice() + "|";
                if (!StringUtils.isEmpty(j.getICode()))
                    szlevelinfos.add(stockPriceSZ);
            }
            if (!CollectionUtils.isEmpty(shlevelinfos))
                kafkaProducer.sendMessage("level2.SHDepth", shlevelinfos, new ArrayList<>(), "not");
            if (!CollectionUtils.isEmpty(szlevelinfos))
                kafkaProducer.sendMessage("level2.SZDepth", szlevelinfos, new ArrayList<>(), "not");
            log.info("<<<<<finished  send hangqing:" + Thread.currentThread().getName());
        }
        else if ("LEVEL1".equals(flag))
        {
            hklevelList = hklevelMapper.selectHklevel(baseDate);
            hklevelinfosStr = hklevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            neeqlevelList = neeqlevelMapper.selectnewthreelevel(baseDate);
            neelevelinfosStr = neeqlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            qhlevelList = qhlevelMapper.selectQhlevel(baseDate);
            //log.info("test1: "+ JSONArray.toJSONString(qhlevelList));
            qhlevelinfosStr = qhlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());
            //log.info("test1: "+ JSONObject.toJSONString(qhlevelinfosStr));

            hjzslevelList = hjzslevelMapper.HjandIdxlevel(baseDate);
            for (Hjzslevel hj : hjzslevelList) {//WIND_CODE, RT_VOL, RT_AMT, RT_LATEST, RT_OPEN, RT_LOW, RT_VWAP, RT_DATE, RT_TIME,type
                hjAndIdxLevel hjAndIdxLevelnew = new hjAndIdxLevel();
                hjAndIdxLevelnew.setWind_code(hj.getWindCode());
                hjAndIdxLevelnew.setRt_vol(hj.getRtVol());
                hjAndIdxLevelnew.setRt_amt(hj.getRtAmt());
                hjAndIdxLevelnew.setRt_latest(hj.getRtLatest());
                hjAndIdxLevelnew.setRt_open(hj.getRtOpen());
                hjAndIdxLevelnew.setRt_low(hj.getRtLow());
                hjAndIdxLevelnew.setRt_vwap(hj.getRtVwap());
                hjAndIdxLevelnew.setRt_date(hj.getRtDate());
                hjAndIdxLevelnew.setRt_time(hj.getRtTime());
                hjAndIdxLevelnew.setSec_type(hj.getSecType());

                hjAndIdxLevelList.add(hjAndIdxLevelnew);
            }
            hjzslevelStr = hjAndIdxLevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            tidxlevelList = hklevelMapper.selectNormalZSlevel(baseDate);
            tidxlevelinfoStr = tidxlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());


            qqlevelList = qqlevelMapper.selectQQlevel(baseDate);
            qqlevelinfoStr = qqlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(qhlevelinfosStr))
                kafkaProducer.sendMessage("level1.FUTUREDepth", new ArrayList<>(), qhlevelinfosStr, "use");
            if (!CollectionUtils.isEmpty(neelevelinfosStr))
                kafkaProducer.sendMessage("level1.NEQDepth", new ArrayList<>(), neelevelinfosStr, "use");
            if (!CollectionUtils.isEmpty(hklevelinfosStr))
                kafkaProducer.sendMessage("level1.HKDepth", new ArrayList<>(), hklevelinfosStr, "use");
            if (!CollectionUtils.isEmpty(qqlevelinfoStr))
                kafkaProducer.sendMessage("level1.OPTIONDepth", new ArrayList<>(), qqlevelinfoStr, "use");
            if (!CollectionUtils.isEmpty(tidxlevelinfoStr))
                kafkaProducer.sendMessage("level1.INDEXDepth", new ArrayList<>(), tidxlevelinfoStr, "use");
            if (!CollectionUtils.isEmpty(hjzslevelStr))
                kafkaProducer.sendMessage("level1.SPECIALDepth", new ArrayList<>(), hjzslevelStr, "use");

        }
        else if ("level1.DELTA".equals(flag))
        {
            optionDeltaList =optionDeltaMapper.selectlevelDelta(baseDate);
            List<optionDeltaClass> classList = new ArrayList<>();
            for(OptionDelta OP:optionDeltaList)
            {
                optionDeltaClass it = new optionDeltaClass();
                it.setWind_code(OP.getWindCode());
                it.setSec_type(OP.getSecType());
                it.setRt_delta(OP.getRtDelta());
                it.setRt_date(OP.getRtDate());
                it.setRt_time(OP.getRtTime());

                classList.add(it);
            }
            //optionDeltaStr
            optionDeltaStr = classList.stream().map(e -> (Object) e).collect(Collectors.toList());

            if (!CollectionUtils.isEmpty(optionDeltaStr))
                kafkaProducer.sendMessage("test", new ArrayList<>(), optionDeltaStr, "use");
        }

    }

    @PostMapping("/sendLevelTime")
    public synchronized void sendLevelTime(@RequestParam String baseDate,
        @RequestParam String flag, @RequestParam String timingInterval)
    {
        int time = 100*Integer.parseInt(timingInterval);
        List<Shlevel> shlevelList = new ArrayList<>();
        List<Szlevel> szlevelList = new ArrayList<>();
        List<String> shlevelinfos = new ArrayList<>();
        List<String> szlevelinfos = new ArrayList<>();

        List<Hklevel> hklevelList = new ArrayList<>();
        List<Neeqlevel> neeqlevelList = new ArrayList<>();
        List<Qhlevel> qhlevelList = new ArrayList<>();
        List<Qqlevel> qqlevelList = new ArrayList<>();
        List<Hklevel> tidxlevelList = new ArrayList<>();
        List<Hjzslevel> hjzslevelList = new ArrayList<>();
        List<hjAndIdxLevel> hjAndIdxLevelList = new ArrayList<>();

        List<Object> hklevelinfosStr = new ArrayList<>();
        List<Object> neelevelinfosStr = new ArrayList<>();
        List<Object> qhlevelinfosStr = new ArrayList<>();
        List<Object> qqlevelinfoStr = new ArrayList<>();
        List<Object> tidxlevelinfoStr = new ArrayList<>();
        List<Object> hjzslevelStr = new ArrayList<>();

        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("INFO_DATE", baseDate);

        if ("LEVEL2".equals(flag)) {
            log.info("<<<<<before  send hangqing:" + Thread.currentThread().getName());
            shlevelList = shlevelMapper.selectList(queryWrapper);
            for (Shlevel i : shlevelList) {
                String stockpriceSH;
                stockpriceSH = i.getICode() + "|" + i.getBuyPriceQueue() + "|" + i.getSellPriceQueue() + "|" + i.getBuyAmountQueue() + "|" + i.getSellAmountQueue() +
                        "|" + i.getBondName() + "|" + i.getCurrentSeat() + "|" + i.getLeastDealPrice() + "|" + i.getHighestDealPrice() + "|" + i.getMinimumDealPrice() +
                        "|" + i.getUpdateTime() + "|" + i.getInfoDate() + "|" + i.getNewPrice() + "|" + i.getMarketOpenPrice() + "|" + i.getDealRealCp() +
                        "|" + i.getMatchPlot() + "|" + i.getIopv() + "|" + i.getDealRealAmount() + "|" + i.getSellEntrustAmount() + "|" + i.getBuyEntrustAmount() +
                        "|" + i.getAvgBuyPrice() + "|" + i.getAvgSellPrice() + "|" + i.getHardenPrice() + "|" + i.getDownPrice() + "|";
                if (!StringUtils.isEmpty(i.getICode()))
                    shlevelinfos.add(stockpriceSH);
            }

            szlevelList = szlevelMapper.selectList(queryWrapper);
            for (Szlevel j : szlevelList) {
                String stockPriceSZ;
                stockPriceSZ = j.getICode() + "|" + j.getBuyPriceQueue() + "|" + j.getSellPriceQueue() + "|" + j.getBuyAmountQueue() +
                        "|" + j.getSellAmountQueue() + "|" + j.getExtraDim() + "|" + j.getBondName() + "|" + j.getCurrentSeat() +
                        "|" + j.getLeastDealPrice() + "|" + j.getHighestDealPrice() + "|" + j.getMinimumDealPrice() +
                        "|" + j.getUpdateTime() + "|" + j.getInfoDate() + "|" + j.getNewPrice() + "|" + j.getMarketOpenPrice() +
                        "|" + j.getDealRealCp() + "|" + j.getMatchPlot() + "|" + j.getIopv() + "|" + j.getStockValue() +
                        "|" + j.getDealRealAmount() + "|" + j.getSellEntrustAmount() + "|" + j.getBuyEntrustAmount() +
                        "|" + j.getAvgBuyPrice() + "|" + j.getAvgSellPrice() + "|" + j.getPePrfi01() + "|" + j.getPePrfi02() +
                        "|" + j.getHardenPrice() + "|" + j.getDownPrice() + "|";
                if (!StringUtils.isEmpty(j.getICode()))
                    szlevelinfos.add(stockPriceSZ);
            }

            if (!CollectionUtils.isEmpty(shlevelinfos))
                kafkaProducer.sendMessageGroup("level2.SHDepth", shlevelinfos, new ArrayList<>(), "not", time);
            if (!CollectionUtils.isEmpty(szlevelinfos))
                kafkaProducer.sendMessageGroup("level2.SZDepth", szlevelinfos, new ArrayList<>(), "not",time);
            log.info("<<<<<finished  send hangqing:" + Thread.currentThread().getName());
        }
        else if ("LEVEL1".equals(flag))
        {
            hklevelList = hklevelMapper.selectHklevel(baseDate);
            hklevelinfosStr = hklevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            neeqlevelList = neeqlevelMapper.selectnewthreelevel(baseDate);
            neelevelinfosStr = neeqlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            qhlevelList = qhlevelMapper.selectQhlevel(baseDate);
            //log.info("test1: "+ JSONArray.toJSONString(qhlevelList));
            qhlevelinfosStr = qhlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());
            //log.info("test1: "+ JSONObject.toJSONString(qhlevelinfosStr));

            hjzslevelList = hjzslevelMapper.HjandIdxlevel(baseDate);
            for (Hjzslevel hj : hjzslevelList) {//WIND_CODE, RT_VOL, RT_AMT, RT_LATEST, RT_OPEN, RT_LOW, RT_VWAP, RT_DATE, RT_TIME,type
                hjAndIdxLevel hjAndIdxLevelnew = new hjAndIdxLevel();
                hjAndIdxLevelnew.setWind_code(hj.getWindCode());
                hjAndIdxLevelnew.setRt_vol(hj.getRtVol());
                hjAndIdxLevelnew.setRt_amt(hj.getRtAmt());
                hjAndIdxLevelnew.setRt_latest(hj.getRtLatest());
                hjAndIdxLevelnew.setRt_open(hj.getRtOpen());
                hjAndIdxLevelnew.setRt_low(hj.getRtLow());
                hjAndIdxLevelnew.setRt_vwap(hj.getRtVwap());
                hjAndIdxLevelnew.setRt_date(hj.getRtDate());
                hjAndIdxLevelnew.setRt_time(hj.getRtTime());
                hjAndIdxLevelnew.setSec_type(hj.getSecType());

                hjAndIdxLevelList.add(hjAndIdxLevelnew);
            }
            hjzslevelStr = hjAndIdxLevelList.stream().map(e -> (Object) e).collect(Collectors.toList());

            tidxlevelList = hklevelMapper.selectNormalZSlevel(baseDate);
            tidxlevelinfoStr = tidxlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());


            qqlevelList = qqlevelMapper.selectQQlevel(baseDate);
            qqlevelinfoStr = qqlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(qhlevelinfosStr))
                kafkaProducer.sendMessageGroup("level1.FUTUREDepth", new ArrayList<>(), qhlevelinfosStr, "use",time);
            if (!CollectionUtils.isEmpty(neelevelinfosStr))
                kafkaProducer.sendMessageGroup("level1.NEQDepth", new ArrayList<>(), neelevelinfosStr, "use",time);
            if (!CollectionUtils.isEmpty(hklevelinfosStr))
                kafkaProducer.sendMessageGroup("level1.HKDepth", new ArrayList<>(), hklevelinfosStr, "use",time);
            if (!CollectionUtils.isEmpty(qqlevelinfoStr))
                kafkaProducer.sendMessageGroup("level1.OPTIONDepth", new ArrayList<>(), qqlevelinfoStr, "use",time);
            if (!CollectionUtils.isEmpty(tidxlevelinfoStr))
                kafkaProducer.sendMessageGroup("level1.INDEXDepth", new ArrayList<>(), tidxlevelinfoStr, "use",time);
            if (!CollectionUtils.isEmpty(hjzslevelStr))
                kafkaProducer.sendMessageGroup("level1.SPECIALDepth", new ArrayList<>(), hjzslevelStr, "use",time);

        }
    }

    @PostMapping("/testTime")
    @Transactional(rollbackFor = Exception.class)
    public synchronized void testTime(@RequestParam String baseDate)
    {
        //String OrdStatue = Integer.toString(OrdStatus);
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("HHmmssSSS");
        Date nowDate = new Date();
        String time= simpleDateFormat.format(nowDate);
    }

    @PostMapping("/sendPOClevelTimeZS")
    public synchronized void sendLevelTimeZS(@RequestParam String baseDate,
                                             @RequestParam String timingInterval,@RequestParam String countTimes)
    {
        int time = 100*Integer.parseInt(timingInterval);
        Timer timer = new Timer();
        count=1;
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("HHmmssSSS");
        TimerTask timerTasklevel1 = new TimerTask() {
            @Override
            public void run() {
                if(count>=Integer.parseInt(countTimes))
                {
                    return;
                }
                try
                {

                    List<String> shlevelinfos = new ArrayList<>();
                    List<String> szlevelinfos = new ArrayList<>();
                    QueryWrapper queryWrapper = new QueryWrapper<>();
                    queryWrapper.eq("INFO_DATE", baseDate);
                    List<Shlevel>  shlevelList = shlevelMapper.selectList(queryWrapper);
                    List<Szlevel> szlevelList  = szlevelMapper.selectList(queryWrapper);
                    Date nowDate = new Date();
                    String time= simpleDateFormat.format(nowDate);
                    for (Shlevel i : shlevelList)
                    {
                        Double price = i.getNewPrice();
                        Random newre = new Random();
                        Double chgprice = price+price*0.2*(newre.nextDouble());
                        BigDecimal roundchgprice = new BigDecimal(chgprice).setScale(4,BigDecimal.ROUND_HALF_UP);
                        chgprice = roundchgprice.doubleValue();
                        i.setNewPrice(chgprice);
                        i.setUpdateTime(time);

                        String stockpriceSH;
                        stockpriceSH = i.getICode() + "|" + i.getBuyPriceQueue() + "|" + i.getSellPriceQueue() + "|" + i.getBuyAmountQueue() + "|" + i.getSellAmountQueue() +
                                "|" + i.getBondName() + "|" + i.getCurrentSeat() + "|" + i.getLeastDealPrice() + "|" + i.getHighestDealPrice() + "|" + i.getMinimumDealPrice() +
                                "|" + i.getUpdateTime() + "|" + i.getInfoDate() + "|" + i.getNewPrice() + "|" + i.getMarketOpenPrice() + "|" + i.getDealRealCp() +
                                "|" + i.getMatchPlot() + "|" + i.getIopv() + "|" + i.getDealRealAmount() + "|" + i.getSellEntrustAmount() + "|" + i.getBuyEntrustAmount() +
                                "|" + i.getAvgBuyPrice() + "|" + i.getAvgSellPrice() + "|" + i.getHardenPrice() + "|" + i.getDownPrice() + "|";
                        if (!StringUtils.isEmpty(i.getICode()))
                            shlevelinfos.add(stockpriceSH);
                    }

                    for (Szlevel j : szlevelList)
                    {
                        Double price = j.getNewPrice();
                        Random newre = new Random();
                        Double chgprice = price+price*0.2*(newre.nextDouble());
                        BigDecimal roundchgprice = new BigDecimal(chgprice).setScale(4,BigDecimal.ROUND_HALF_UP);
                        chgprice = roundchgprice.doubleValue();
                        j.setNewPrice(chgprice);
                        j.setUpdateTime(time);

                        String stockPriceSZ;
                        stockPriceSZ = j.getICode() + "|" + j.getBuyPriceQueue() + "|" + j.getSellPriceQueue() + "|" + j.getBuyAmountQueue() +
                                "|" + j.getSellAmountQueue() + "|" + j.getExtraDim() + "|" + j.getBondName() + "|" + j.getCurrentSeat() +
                                "|" + j.getLeastDealPrice() + "|" + j.getHighestDealPrice() + "|" + j.getMinimumDealPrice() +
                                "|" + j.getUpdateTime() + "|" + j.getInfoDate() + "|" + j.getNewPrice() + "|" + j.getMarketOpenPrice() +
                                "|" + j.getDealRealCp() + "|" + j.getMatchPlot() + "|" + j.getIopv() + "|" + j.getStockValue() +
                                "|" + j.getDealRealAmount() + "|" + j.getSellEntrustAmount() + "|" + j.getBuyEntrustAmount() +
                                "|" + j.getAvgBuyPrice() + "|" + j.getAvgSellPrice() + "|" + j.getPePrfi01() + "|" + j.getPePrfi02() +
                                "|" + j.getHardenPrice() + "|" + j.getDownPrice() + "|";
                        if (!StringUtils.isEmpty(j.getICode()))
                            szlevelinfos.add(stockPriceSZ);
                        j.setNewPrice(chgprice);
                    }

                    if (!CollectionUtils.isEmpty(shlevelinfos))
                        kafkaProducer.sendMessage("level2.SHDepth", shlevelinfos, new ArrayList<>(), "not");
                    if (!CollectionUtils.isEmpty(szlevelinfos))
                        kafkaProducer.sendMessage("level2.SZDepth", szlevelinfos, new ArrayList<>(), "not");
                    log.info("<<<<<finished  send hangqing:" + Thread.currentThread().getName());
                    count++;
                }
                catch (Exception e)
                {
                    log.error("error:{}",e);
                }
            }
        };

        try {
            timer.schedule(timerTasklevel1,200,time);
        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }
    /*
     * level2.SZDepth  上交
     * level2.SHDepth	深交
     * level1.FUTUREDepth 期货
     * level1.NEQDepth	新三版
     * level1.HKDepth	港股
     * level1.OPTIONDepth  期权*/
    @PostMapping("/sendTrskHlk")
    @Transactional(rollbackFor = Exception.class)
    public synchronized void sendTrskHlk(@RequestParam String baseDate, @RequestParam String taskID) {
        //QueryWrapper queryWrapper =new QueryWrapper<>();
        //queryWrapper.eq("D_BASE",baseDate);
        //List<TcTrskHld> queryResultTrsk = tcTrskHldMapper.selectList(queryWrapper);

        //输入表搬到生产表；
        trskHldMapper.DeleteBatchbyDate(baseDate);
        trskHldMapper.insertBatch(baseDate, taskID);

    }

    @PostMapping("/sendTrealDeal")
    @Transactional(rollbackFor = Exception.class)
    public synchronized void sendTrealDeal(@RequestParam String baseDate, @RequestParam String dataType, @RequestParam String taskID) {
        //QueryWrapper queryWrapper =new QueryWrapper<>();
        //queryWrapper.eq("D_BASE",baseDate);
        //List<TcTrskHld> queryResultTrsk = tcTrskHldMapper.selectList(queryWrapper);
        List<TtrdOtcTradePublic>   bondtradeList = new ArrayList<>();
        List<TtrdOtcTradePublicSend>  sendList =new ArrayList<>();
        List<Object>  objectList = new ArrayList<>();
        //输入表搬到生产表；
        if (dataType.equals("O32")) {
            trealdealMapper.DeleteBatchbyDate(baseDate);
            trealdealMapper.insertBatch(taskID, baseDate);
        }
        else if (dataType.equals("NEQ")) {
            trealdealMapper.DeleteBatchNEQbyDate(baseDate);
            trealdealMapper.insertBatchNEQ(taskID, baseDate);
        }
        else if (dataType.equals("GW")) {
            tradingresultMapper.DeleteBatchbyDate(baseDate);
            tradingresultMapper.insertBatch(taskID, baseDate);
        } else if (dataType.equals("ETF_FUT")) {
            futuretradingresultMapper.DeleteBatchbyDate(baseDate);
            futuretradingresultMapper.insertBatch(taskID, baseDate);
        } else if (dataType.equals("XIR")) {
            ttrdOtcTradeMapper.deleteBatch(baseDate);
//            bondtradeList = tradePublicMapper.query4sendXirTc(baseDate);
//            //逐条插入；
            ttrdOtcTradeMapper.insertBatchTC(taskID,baseDate);
        }
        else if(dataType.equals("XIR_ALL"))
        {
            ttrdOtcTradeMapper.deleteBatchALL();
            ttrdOtcTradeMapper.insertBatchALL();
        }
         else if (dataType.equals("XIR_BOND")) {
            bondtradeList = tradePublicMapper.query4sendXirBond(baseDate);
            log.info("bondtradeList size:"+bondtradeList.size());
               //objectList
            setTrade(sendList,bondtradeList);
            objectList = sendList.stream().map(e ->(Object) e).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(objectList))
                kafkaProducer.sendMessageTrade("TTRD_TPRT_OTC_TRADEZZ", objectList);

            //       tidxlevelinfoStr = tidxlevelList.stream().map(e -> (Object) e).collect(Collectors.toList());
        }
    }

    @PostMapping("/updateOrdStatue")
    @Transactional(rollbackFor = Exception.class)
        public synchronized void updateOrdStatue(@RequestParam String baseDate,@RequestParam int beforeStatus,
                                                 @RequestParam int OrdStatus)
{
    //String OrdStatue = Integer.toString(OrdStatus);
    ttrdOtcTradeMapper.updateOrdStatue(baseDate,beforeStatus,OrdStatus);
}
    @PostMapping("/sendTrealDealTime")
    @Transactional(rollbackFor = Exception.class)
    public synchronized void sendTrealDealTime(@RequestParam String baseDate,
          @RequestParam String dataType, @RequestParam String taskID,@RequestParam String timingInterval) {
        int time = 100*Integer.parseInt(timingInterval);
        List<Trealdeal> trealdeals= new ArrayList<>();
        List<Tradingresult> tradingresults =new ArrayList<>();
        sizeTime=0;
        //输入表搬到生产表；
        if (dataType.equals("O32"))
        {
            trealdealMapper.DeleteBatchbyDate(baseDate);

            List<TcTrealdeal> tcTrealdeals = tcTrealdealMapper.queryTrealdealTc(taskID, baseDate);
            for(TcTrealdeal it :tcTrealdeals)
            {
                Trealdeal trealdeal = new Trealdeal();
                trealdeal.setLRealdealSerialNo(it.getLRealdealSerialNo());
                trealdeal.setLDate(it.getLDate());
                trealdeal.setLBasecombiId(it.getLBasecombiId());
                trealdeal.setCMarketNo(it.getCMarketNo());
                trealdeal.setVcInterCode(it.getVcInterCode());
                trealdeal.setVcReportCode(it.getVcReportCode());
                trealdeal.setCStockType(it.getCStockType());
                trealdeal.setCEntrustDirection(it.getCEntrustDirection());
                trealdeal.setLBusinessTime(it.getLBusinessTime());
                trealdeal.setLDealAmount(it.getLDealAmount());
                trealdeal.setEnDealPrice(it.getEnDealPrice());
                trealdeal.setLMarketDate(it.getLMarketDate());
                trealdeal.setEnFeeJyTrue(it.getEnFeeJyTrue());
                trealdeal.setTcId(it.getTcId());

                trealdeals.add(trealdeal);
            }

            //trealdealMapper.insertBatch(taskID, baseDate);
            Timer timer = new Timer();
            // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
            TimerTask timerTaskTrealdeal = new TimerTask() {
                @Override
                public void run() {
                    if(sizeTime >= trealdeals.size())
                    {
                        timer.cancel();
                        return;
                    }
                    log.info("test  OBJ: " + JSONObject.toJSONString(trealdeals.get(sizeTime)));
                    trealdealMapper.insert(trealdeals.get(sizeTime));
                    sizeTime++;
                }
            };
            timer.schedule(timerTaskTrealdeal,200,time);
        }
        else if (dataType.equals("GW"))
        {

            tradingresultMapper.DeleteBatchbyDate(baseDate);
            List<TcTradingresult> tctradingresultList = tcTradingresultMapper.querytclist(taskID, baseDate);
            for(TcTradingresult ittc:tctradingresultList)
            {
                Tradingresult tradingresult = new Tradingresult();
                tradingresult.setSerialnum(ittc.getSerialnum());
                tradingresult.setAcctid(ittc.getAcctid());
                tradingresult.setCurrencyid(ittc.getCurrencyid());
                tradingresult.setExchid(ittc.getExchid());
                tradingresult.setRegid(ittc.getRegid());
                tradingresult.setRegname(ittc.getRegname());
                tradingresult.setOfferregid(ittc.getOfferregid());
                tradingresult.setStkid(ittc.getStkid());
                tradingresult.setStkname(ittc.getStkname());
                tradingresult.setKnockqty(ittc.getKnockqty());
                tradingresult.setKnockprice(ittc.getKnockprice());
                tradingresult.setKnockamt(ittc.getKnockamt());
                tradingresult.setKnocktime(ittc.getKnocktime());
                tradingresult.setOrdertype(ittc.getOrdertype());
                tradingresult.setStktype(ittc.getStktype());
                tradingresult.setTradingresulttype(ittc.getTradingresulttype());
                tradingresult.setTcId(ittc.getTcId());

                tradingresults.add(tradingresult);
            }

            Timer timer = new Timer();
            // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
            TimerTask timerTaskTrade = new TimerTask() {
                @Override
                public void run() {
                    if(sizeTime >= tradingresults.size())
                    {
                        timer.cancel();
                        return;
                    }
                    log.info("test  OBJ: " + JSONObject.toJSONString(tradingresults.get(sizeTime)));
                    tradingresultMapper.insert(tradingresults.get(sizeTime));
                    sizeTime++;
                }
            };
            timer.schedule(timerTaskTrade,200,time);

        }
        else if (dataType.equals("ETF_FUT"))
        {
            futuretradingresultMapper.DeleteBatchbyDate(baseDate);
            List<TcFuturetradingresult> tcFuturetradingresultList = tcFuturetradingresultMapper.querytclist(taskID, baseDate);
            List<Futuretradingresult>  futuretradingresultList = new ArrayList<>();
            for(TcFuturetradingresult itfu:tcFuturetradingresultList)
            {
                Futuretradingresult futuretradingresult = new Futuretradingresult();
                futuretradingresult.setSerialnum(itfu.getSerialnum());
                futuretradingresult.setAcctid(itfu.getAcctid());
                futuretradingresult.setCurrencyid(itfu.getCurrencyid());
                futuretradingresult.setExchid(itfu.getExchid());
                futuretradingresult.setStkid(itfu.getStkid());
                futuretradingresult.setStkname(itfu.getStkname());
                futuretradingresult.setBsflag(itfu.getBsflag());
                futuretradingresult.setFOffsetflag(itfu.getFOffsetflag());
                futuretradingresult.setKnockqty(itfu.getKnockqty());
                futuretradingresult.setKnockprice(itfu.getKnockprice());
                futuretradingresult.setKnockamt(itfu.getKnockamt());
                futuretradingresult.setKnocktime(itfu.getKnocktime());
                futuretradingresult.setFProductid(itfu.getFProductid());
                futuretradingresult.setTcId(itfu.getTcId());
                futuretradingresult.setExectype(itfu.getExectype());

                futuretradingresultList.add(futuretradingresult);

            }
            Timer timer = new Timer();
            // 开始执行任务 (延迟1000毫秒执行，每3000毫秒执行一次)
            TimerTask timerTaskTrade = new TimerTask() {
                @Override
                public void run() {
                    if(sizeTime >= futuretradingresultList.size())
                    {
                        timer.cancel();
                        return;
                    }
                    log.info("test  OBJ: " + JSONObject.toJSONString(futuretradingresultList.get(sizeTime)));
                    futuretradingresultMapper.insert(futuretradingresultList.get(sizeTime));
                    sizeTime++;
                }
            };
            timer.schedule(timerTaskTrade,200,time);

            //futuretradingresultMapper.insertBatch(taskID, baseDate);
        }
    }

  public  static  void  setTrade(List<TtrdOtcTradePublicSend> sebdList ,
                                 List<TtrdOtcTradePublic>  tradeList)
  {
      for(TtrdOtcTradePublic itTrade: tradeList)
      {
          TtrdOtcTradePublicSend newTradesend = new TtrdOtcTradePublicSend();
          newTradesend.setSysordid(itTrade.getSysordid());
          newTradesend.setOrddate(itTrade.getOrddate());
          newTradesend.setSetdate(itTrade.getSetdate());
          newTradesend.setCondate(itTrade.getCondate());
          newTradesend.setContime(itTrade.getContime());
          newTradesend.setSecuAccid(itTrade.getSecuAccid());
          newTradesend.setSecuExtAccid(itTrade.getSecuExtAccid());
          newTradesend.setCurrency(itTrade.getCurrency());
          newTradesend.setTrdtype(itTrade.getTrdtype());
          newTradesend.setiCode(itTrade.getiCode());
          newTradesend.setaType(itTrade.getaType());
          newTradesend.setmType(itTrade.getmType());
          newTradesend.setiName(itTrade.getiName());
          newTradesend.setOrdcount(itTrade.getOrdcount());
          newTradesend.setOrdprice(itTrade.getOrdprice());
          newTradesend.setOrdamount(itTrade.getOrdamount());
          newTradesend.setBnd_netprice(itTrade.getBndNetprice());
          newTradesend.setBnd_aiamount(itTrade.getBndAiamount());

          sebdList.add(newTradesend);
      }
  }

  @PostMapping("/sendDSingleStock")
  @Transactional(rollbackFor = Exception.class)
    public  void getSingleStockByDate(@RequestParam String secuAcctId,@RequestParam String currDate) {

        QueryWrapper<TtrdTprtProfitDaily> queryPrftDaily = new QueryWrapper<>();
        queryPrftDaily.in("SECU_ACCT_ID", secuAcctId);
        queryPrftDaily.eq("BEG_DATE",currDate);
        queryPrftDaily.eq("SET_DATE","1900-01-01");
        List<TtrdTprtProfitDaily>  profitDailyList = ttrdTprtProfitDailyMapper.selectList(queryPrftDaily);
      SimpleDateFormat timeMMFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<DSingleStock> singleStocks = new ArrayList<>();
        for (TtrdTprtProfitDaily ttrdTprtProfit : profitDailyList) {

            DSingleStock oneData = new DSingleStock();
            oneData.setSecuAcctId(ttrdTprtProfit.getSecuAcctId());
            oneData.setExtraDim(ttrdTprtProfit.getExtraDim());
            oneData.setCurrency(ttrdTprtProfit.getCurrency());
            oneData.setIcode(ttrdTprtProfit.getiCode());
            oneData.setAtype(ttrdTprtProfit.getaType());
            oneData.setMtype(ttrdTprtProfit.getmType());
            oneData.setRealVolume(ttrdTprtProfit.getRealVolume().toPlainString());
            oneData.setRealCP(ttrdTprtProfit.getRealCp().toPlainString());
            oneData.setCurBuyVolume(ttrdTprtProfit.getCurBuyVolume().toPlainString());
            oneData.setCurBuyCP(ttrdTprtProfit.getCurBuyCp().toPlainString());
            oneData.setCurSellVolume(ttrdTprtProfit.getCurSellVolume().toPlainString());
            oneData.setCurSellCP(ttrdTprtProfit.getCurSellCp().toPlainString());
            oneData.setMtm(ttrdTprtProfit.getMtm().toPlainString());
            oneData.setYtdMtm(ttrdTprtProfit.getYtdMtm().toPlainString());
            oneData.setBuyPrftFV(ttrdTprtProfit.getBuyPrftFv().toPlainString());
            oneData.setExposure(ttrdTprtProfit.getExposure().toPlainString());
            oneData.setYtdExposure(ttrdTprtProfit.getYtdExposure().toPlainString());
            oneData.setSellPrftFV(ttrdTprtProfit.getSellPrftFv().toPlainString());
            oneData.setYtdPrftFV(ttrdTprtProfit.getYtdPrftFv().toPlainString());
            oneData.setCurPrice(ttrdTprtProfit.getCurPrice().toPlainString());
            oneData.setYtdPrice(ttrdTprtProfit.getYtdPrice().toPlainString());
            oneData.setUpdateTime(ttrdTprtProfit.getUpdateTime());
            singleStocks.add(oneData);
        }
      Timer timer = new Timer();
         //String strRtn = JSONArray.toJSONString(singleStocks);
      TimerTask timerTasklevel2 = new TimerTask() {
          @Override
          public void run() {
              try
              {
                  Date nowDate = new Date();
                  Date afterDate = new Date(nowDate.getTime() + 60000);
                  for(DSingleStock ittt: singleStocks)
                  {
                      String datetime= timeMMFormat.format(afterDate);
                      ittt.setUpdateTime(datetime);
                  }
                  List<Object> singleStocksObjList = singleStocks.stream().map(e -> (Object) e).collect(Collectors.toList());
                  kafkaProducer.sendMessagetEST("PROFIT_SEND", singleStocksObjList);
              }
              catch (Exception e)
              {
                  log.error("error:{}",e);
              }


          }
      };

      try {
          timer.schedule(timerTasklevel2,200,65000);

      } catch (Exception e) {
          log.error("<<<<<kafka send error !!!!!", e);
          throw new RuntimeException("kafka send error");
      }
    }


    @PostMapping("/sendExecutionreport")
    @Transactional(rollbackFor = Exception.class)
    public  void getExecutionreport(@RequestParam String currDate,@RequestParam String timingInterval,
                                    @RequestParam String countTimes,@RequestParam String  TRANSACTTIME) {
        int time = 100*Integer.parseInt(timingInterval);
        Timer timer = new Timer();
        count=1;
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("trddate", currDate);
        //20220209-00:00:55.880
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("HH:mm:ss.SSS");
        //UESD  USEFUL
        queryWrapper.eq("TRANSACTION_METHOD", "USEFUL");
        final  List<TtrdCmdsExecutionreport>  shlevelList = cmdsMapper.selectList(queryWrapper);
        TimerTask timerTasklevel1 = new TimerTask() {
            @Override
            public void run() {
                if(count>=Integer.parseInt(countTimes))
                {
                    return;
                }
                try
                {

                    List<TtrdCmdsExecutionreport>  shlevelListNew = shlevelList;
                    for (TtrdCmdsExecutionreport i : shlevelListNew)
                    {
                        long timestamp = System.currentTimeMillis();
                        Date newDate = new Date();
                        String timeMM = simpleDateFormat.format(newDate);
                        String dateTime=TRANSACTTIME+"-"+timeMM;
                        i.setEpid(timestamp);
                        Double priceOri = i.getPrice();
                        Random newre = new Random();
                        Double chgprice = priceOri+priceOri*0.01*(newre.nextDouble());
                        BigDecimal roundchgprice = new BigDecimal(chgprice).setScale(4,BigDecimal.ROUND_HALF_UP);
                        chgprice = roundchgprice.doubleValue();
                        i.setPrice(chgprice);
                        i.setTransacttime(dateTime);
                        i.setTransactionMethod("USED");
                    }

                    for (TtrdCmdsExecutionreport itcmd : shlevelListNew)
                    {
                        cmdsMapper.insert(itcmd);
                    }

                    log.info("<<<<<finished once  sendExecutionreport:" + Thread.currentThread().getName());
                    count++;
                }
                catch (Exception e)
                {
                    log.error("error:{}",e);
                }
            }
        };


        try {
            timer.schedule(timerTasklevel1,200,time);
            log.info("<<<<<over  sendExecutionreport:" + Thread.currentThread().getName());
        } catch (Exception e) {
            log.error("<<<<<kafka send error !!!!!", e);
            throw new RuntimeException("kafka send error");
        }
    }
}
