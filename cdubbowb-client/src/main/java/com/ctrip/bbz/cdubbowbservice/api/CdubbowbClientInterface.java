package com.ctrip.bbz.cdubbowbservice.api;

import com.google.common.util.concurrent.ListenableFuture;
import com.ctrip.soa.caravan.common.delegate.Func;
import com.ctriposs.baiji.rpc.client.*;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;

@SuppressWarnings("all")
public interface CdubbowbClientInterface {
    OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request) throws Exception;

    OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request, Func<OperatornoInfoResponseType> fallbackProvider) throws Exception;

    ListenableFuture<OperatornoInfoResponseType> operatornoInfoAsync(OperatornoInfoRequestType request) throws Exception;

    CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception;

    CheckHealthResponseType checkHealth(CheckHealthRequestType request, Func<CheckHealthResponseType> fallbackProvider) throws Exception;

    ListenableFuture<CheckHealthResponseType> checkHealthAsync(CheckHealthRequestType request) throws Exception;
}