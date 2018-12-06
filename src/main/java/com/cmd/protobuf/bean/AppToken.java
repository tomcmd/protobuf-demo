package com.cmd.protobuf.bean;

import lombok.Data;

/**
 *
 *
 *
 * @author: tomcmd
 * @create: 2018/12/6 9:43 AM
 */
@Data
public class AppToken {
    private long appTokenId;
    private String clientId;
    private String accessToken;
    private long accessExpireTime;
}
