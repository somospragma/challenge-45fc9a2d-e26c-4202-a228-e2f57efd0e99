package com.pragma.monitoreo.application.service;

import com.pragma.monitoreo.domain.model.TransactionEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

import java.time.Instant;

@SpringBootTest
class TransactionEventServiceTest {

    @Autowired
    private TransactionEventService transactionEventService;

    @Test
    void processEvents() {
        StepVerifier.create(transactionEventService.processEvents())
           .expectNextMatches(event -> "1".equals(event.getTransactionId()))
           .expectNextMatches(event -> "2".equals(event.getTransactionId()))
           .verifyComplete();
    }
}