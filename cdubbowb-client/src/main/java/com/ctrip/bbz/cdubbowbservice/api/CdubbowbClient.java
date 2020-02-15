package com.ctrip.bbz.cdubbowbservice.api;

import com.google.common.util.concurrent.ListenableFuture;
import com.ctrip.soa.caravan.common.delegate.Func;
import com.ctriposs.baiji.rpc.client.*;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;

@SuppressWarnings("all")
public class CdubbowbClient extends ServiceClientBase<CdubbowbClient> implements CdubbowbClientInterface {
    public static final String ORIGINAL_SERVICE_NAME = "cdubbowb";

    public static final String ORIGINAL_SERVICE_NAMESPACE = "http://soa.ctrip.com/platform/soa/cdubbowbservice/v1";

    public static final String CODE_GENERATOR_VERSION = "BJCG-2.4.6.1";

    private CdubbowbClient(String baseUri) {
        super(CdubbowbClient.class, baseUri);
    }

    private CdubbowbClient(String serviceName, String serviceNamespace, String subEnv) throws ServiceLookupException {
        super(CdubbowbClient.class, serviceName, serviceNamespace, subEnv);
    }

    public static CdubbowbClient getInstance() {
        return ServiceClientBase.getInstance(CdubbowbClient.class);
    }

    public static CdubbowbClient getInstance(String baseUrl) {
        return ServiceClientBase.getInstance(CdubbowbClient.class, baseUrl);
    }

    @Override
    public OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request)
                                    throws Exception {
        return super.invoke("operatornoInfo", request, OperatornoInfoResponseType.class);
    }

    @Override
    public OperatornoInfoResponseType operatornoInfo(OperatornoInfoRequestType request, Func<OperatornoInfoResponseType> fallbackProvider)
                                    throws Exception {
        return super.invoke("operatornoInfo", request, fallbackProvider, OperatornoInfoResponseType.class);
    }

    @Override
    public ListenableFuture<OperatornoInfoResponseType> operatornoInfoAsync(OperatornoInfoRequestType request)
                                    throws Exception {
        return super.invokeAsync("operatornoInfo", request, OperatornoInfoResponseType.class);
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request)
                                    throws Exception {
        return super.invoke("checkHealth", request, CheckHealthResponseType.class);
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request, Func<CheckHealthResponseType> fallbackProvider)
                                    throws Exception {
        return super.invoke("checkHealth", request, fallbackProvider, CheckHealthResponseType.class);
    }

    @Override
    public ListenableFuture<CheckHealthResponseType> checkHealthAsync(CheckHealthRequestType request)
                                    throws Exception {
        return super.invokeAsync("checkHealth", request, CheckHealthResponseType.class);
    }
}