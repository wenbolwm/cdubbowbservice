package com.ctrip.basebiz.cdubbowbservice.cdubbowbweb.controller;

import com.ctrip.bbz.cdubbowbservice.api.Cdubbowb;
import com.ctrip.bbz.cdubbowbservice.api.OperatornoInfoRequestType;
import com.ctrip.bbz.cdubbowbservice.api.OperatornoInfoResponseType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author b_wen
 * @date 2018/8/1 20:28
 */

@RestController
@RequestMapping("/index")
public class IndexRestController {
    //serviceId与服务端的保持一致，否则无法发现服务。
    //@Reference(init = true, parameters = {"serviceId", "platform.soa.cdubbowbservice.v1.cdubbowb"})
    //private Cdubbowb cdubbowbService;

    @GetMapping("/")
    public String index (){

        try {
            OperatornoInfoRequestType requestType = new OperatornoInfoRequestType();
            requestType.setAni("888888");
            //OperatornoInfoResponseType responseType = cdubbowbService.operatornoInfo(requestType);
            String aa = "";
        }catch (Exception e){
            return "welcome";
        }



        return "welcome";
    }
}
