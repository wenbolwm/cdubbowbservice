package com.ctrip.bbz.cdubbowbservice.configuration;

import com.ctrip.bbz.cdubbowbservice.service.impl.CdubbowbImpl;
import com.ctriposs.baiji.rpc.extensions.springboot.BaijiRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author b_wen
 * @date 2018/8/22 17:45
 */
@Configuration
public class SOAConfiguration extends BaijiRegistrationBean {
    protected SOAConfiguration() {
        super("/*", CdubbowbImpl.class);
    }
}