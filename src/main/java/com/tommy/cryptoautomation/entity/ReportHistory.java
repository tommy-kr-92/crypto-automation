package com.tommy.cryptoautomation.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "report_histories")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String market;

    @Column
    private String price;

    @Column(name = "reported_at")
    private LocalDateTime reportedAt;

    public ReportHistory(String market, String price) {
        this.market = market;
        this.price = price;
        this.reportedAt = LocalDateTime.now();
    }
}
