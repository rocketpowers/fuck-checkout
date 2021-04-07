package com.rocketpowers.ecommerce.checkout.service;

import com.rocketpowers.ecommerce.checkout.checkout.CheckoutRequest;
import com.rocketpowers.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}

