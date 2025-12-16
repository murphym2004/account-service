package atu.ie.accountservice.PaymentServiceClient;

import atu.ie.accountservice.PaymentServiceClient.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", url = "http://payment-service:8080")
public interface PaymentServiceClient {

    @PostMapping("/payments")
    PaymentRequest createPayment(@RequestBody PaymentRequest paymentRequest);
}
