package com.cmd.protobuf;

import com.alibaba.fastjson.JSON;
import com.cmd.protobuf.bean.AppToken;
import com.cmd.protobuf.service.AppTokenProtobuf;
import com.cmd.protobuf.util.CommandUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: tomcmd
 * @create: 2018/12/6 10:06 AM
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        AppToken appToken = new AppToken();
        appToken.setAccessExpireTime(System.currentTimeMillis());
        appToken.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ5dW5xaWFjYWRlbXkub3JnIiwiY29tcGFueSI6Inl1bnFpYWNhZGVteSIsImp0aSI6Ijc4NGM1YzFjLTIyZTYtNDkyYi1hNGVhLTFlMDY2YzZlMGViYiIsImlhdCI6MTU0Mzk5NDUwNiwiZXhwIjoxNTQ0MDAxNzA2fQ.ZRzUtivwFFTk-wG0frgTXqjUjKxEALUTS6XF9410zV0");
        appToken.setClientId("clientId2asas22222222222222222222222a");
        appToken.setAppTokenId(2121);
        String jsonString = JSON.toJSONString(appToken);
        log.info("json存储字节数组长度:{}",jsonString.getBytes().length);

        AppTokenProtobuf.app_token_protobuf.Builder protobufBuilder= AppTokenProtobuf.app_token_protobuf.newBuilder();
        protobufBuilder.setAccessExpireTime(System.currentTimeMillis());
        protobufBuilder.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ5dW5xaWFjYWRlbXkub3JnIiwiY29tcGFueSI6Inl1bnFpYWNhZGVteSIsImp0aSI6Ijc4NGM1YzFjLTIyZTYtNDkyYi1hNGVhLTFlMDY2YzZlMGViYiIsImlhdCI6MTU0Mzk5NDUwNiwiZXhwIjoxNTQ0MDAxNzA2fQ.ZRzUtivwFFTk-wG0frgTXqjUjKxEALUTS6XF9410zV0");
        protobufBuilder.setClientId("clientId2asas22222222222222222222222a");
        protobufBuilder.setAppTokenId(2121);
        AppTokenProtobuf.app_token_protobuf buildData = protobufBuilder.build();
        log.info("buildData:{}",buildData.toString());
        log.info("===== 构建build模型结束 =====");

        log.info("\n" + "bytes长度" + buildData.toByteString().size());

        log.info("===== 使用gps 反序列化生成对象开始 =====");
        AppTokenProtobuf.app_token_protobuf protobuf = null;
        try {
            protobuf = AppTokenProtobuf.app_token_protobuf.parseFrom(buildData.toByteArray());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        log.info(protobuf.toString());
        log.info("===== 使用protobuf反序列化生成对象结束 =====");
    }
    public void genBufClass(){
        String protoFile = "app_token.proto";
        String protoCmd = "protoc -I=./src/main/resources/proto --" +
                "java_out=./src/main/java/ "+protoFile;
        String exeCmd = CommandUtil.exeCmd(protoCmd);
        log.info("执行结果:{}",exeCmd);
    }
}
