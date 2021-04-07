package com.rocketpowers.ecommerce.checkout.listener;

import com.rocketpowers.ecommerce.checkout.entity.CheckoutEntity;
import com.rocketpowers.ecommerce.checkout.repository.CheckoutRepository;
import com.rocketpowers.ecommerce.checkout.service.CheckoutService;
import com.rocketpowers.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        final CheckoutEntity checkoutEntity = checkoutRepository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
      checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
      checkoutRepository.save(checkoutEntity);
    }
}
