package atu.ie.accountservice.PaymentServiceClient;

import lombok.Data;

@Data
public class PaymentRequest {
    private double amount;
    private String sender;
    private String receiver;
}