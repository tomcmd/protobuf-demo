package com.cmd.protobuf.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 命令行工具类
 *
 * @author: tomcmd
 * @create: 2018/7/20 下午3:00
 */
@Slf4j
public class CommandUtil {
    public static String exeCmd(String commandStr) {
        BufferedReader br = null;
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(commandStr);
            p.waitFor();
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            log.error("调用命令行，执行命令异常！",e);
        } finally {
            IOUtils.closeQuietly(br);
            if (p != null) {
                p.destroy();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String commandStr = "phantomjs /data/runonce/hello.js http://runonce.oss-cn-hangzhou.aliyuncs.com/runonce/gonggongpay/certificate.html /data/runonce/certificate.pdf";
        //String commandStr = "ipconfig";
        CommandUtil.exeCmd(commandStr);

    }
}
