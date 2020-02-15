package com.ctrip.basebiz.cdubbowbservice.cdubbowbweb.controller;

import com.ctrip.basebiz.ctiselfservice.service.CtiselfserviceServiceClient;
import com.ctrip.basebiz.ctiselfservice.service.GetPhoneNumberRequestType;
import com.ctrip.basebiz.ctiselfservice.service.GetPhoneNumberResponseType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author b_wen
 * @date 2018/8/1 20:28
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index (){
        try {
            String _serviceUrl = "http://127.0.0.1:8080/api";
//            CtiselfserviceServiceClient client = CtiselfserviceServiceClient.getInstance(_serviceUrl);
//            GetPhoneNumberRequestType requestType = new GetPhoneNumberRequestType();
//            GetPhoneNumberResponseType responseType = client.getPhoneNumber(requestType);

           String msg = "23131313";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "welcome";
    }
}
