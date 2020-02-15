package com.ctrip.basebiz.cdubbowbservice.cdubbowbweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ctrip.bbz.cdubbowbservice.api.Cdubbowb;
import com.ctrip.bbz.cdubbowbservice.api.CdubbowbClient;
import com.ctrip.bbz.cdubbowbservice.api.OperatornoInfoRequestType;
import com.ctrip.bbz.cdubbowbservice.api.OperatornoInfoResponseType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author b_wen
 * @date 2018/8/1 20:28
 */

@RestController
@RequestMapping("/soa")
public class SoaRestController {
    private static CdubbowbClient client;
    static {
        // 如下代码为了SOA直接调用本地端口 只能用于开发测试，不能作为正式代码发布。
        client = CdubbowbClient.getInstance();
    }

    @GetMapping("/")
    public String soa (){
        try {
            OperatornoInfoRequestType requestType = new OperatornoInfoRequestType();
            requestType.setAni("888888");
            OperatornoInfoResponseType responseType = client.operatornoInfo(requestType);
            String aa = "";
        }catch (Exception e){
            return "welcome";
        }



        return "welcome";
    }
}
