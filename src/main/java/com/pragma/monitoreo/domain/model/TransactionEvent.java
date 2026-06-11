package com.pragma.monitoreo.domain.model;

import java.time.Instant;

public class TransactionEvent {
    private String transactionId;
    private double amount;
    private Instant timestamp;
    private String origin;

    public TransactionEvent(String transactionId, double amount, Instant timestamp, String origin) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.origin = origin;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getOrigin() {
        return origin;
    }
}