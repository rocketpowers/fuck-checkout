package com.rocketpowers.ecommerce.checkout.config;

import com.rocketpowers.ecommerce.checkout.streaming.CheckoutCreatedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

public class StreamingConfig {

    @Configuration
    @EnableBinding(value = {
            CheckoutCreatedSource.class,
            PaymentPaidSink.class
    })
    public class StreamingConfig {
    }



}
