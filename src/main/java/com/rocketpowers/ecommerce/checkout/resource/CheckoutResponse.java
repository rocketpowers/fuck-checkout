package com.rocketpowers.ecommerce.checkout.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class CheckoutResponse implements Serializable {

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor


        private String code;
    }





}
