package com.ctrip.bbz.cdubbowbservice.service.impl;

import com.ctrip.bbz.cdubbowbservice.api.*;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author b_wen
 * @date 2018/8/1 15:55
 */
@Component
//下面的例子服务端配置了请求超时时间是3秒，注意如果服务不是幂等的，请不要配置retries属性，CDubbo默认会配置为0
@Service(parameters = {"serviceId", "platform.soa.cdubbowbservice.v1.cdubbowb"})
public class CdubbowbImpl implements Cdubbowb {
    @Override
    public OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request){

        OperatornoInfoResponseType responseType = new OperatornoInfoResponseType();
        OperatornoInfo info = new OperatornoInfo();
        info.setDeviceID(request.getAni());
        info.setEmployeeID("s57212");
        info.setLoginKey("b_wen");
        info.setOperatorNo("123456");
        info.setOperState(OperState.W);
        responseType.setOperatornoInfo(info);
        return responseType;
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType var1) {
        return new CheckHealthResponseType();
    }
}
