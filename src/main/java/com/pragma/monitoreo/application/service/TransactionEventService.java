package com.pragma.monitoreo.application.service;

import com.pragma.monitoreo.domain.model.TransactionEvent;
import com.pragma.monitoreo.infrastructure.reactive.WebClientConfig;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Instant;

@Service
public class TransactionEventService {
    private final WebClient.Builder webClientBuilder;

    public TransactionEventService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Flux<TransactionEvent> processEvents() {
        return Flux.just(
            new TransactionEvent("1", 100.0, Instant.now(), "Bank A"),
            new TransactionEvent("2", 200.0, Instant.now(), "Fintech B")
        ).map(event -> {
            // Simulate processing
            return event;
        });
    }
}