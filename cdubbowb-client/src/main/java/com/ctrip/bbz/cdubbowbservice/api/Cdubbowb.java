package com.ctrip.bbz.cdubbowbservice.api;

import com.ctriposs.baiji.rpc.common.BaijiContract;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;

@SuppressWarnings("all")
@BaijiContract(serviceName = "cdubbowb", serviceNamespace = "http://soa.ctrip.com/platform/soa/cdubbowbservice/v1", codeGeneratorVersion = "BJCG-2.4.6.1")
public interface Cdubbowb {

    OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request) throws Exception;

    CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception;
}