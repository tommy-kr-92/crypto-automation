package com.tommy.cryptoautomation.repository;

import com.tommy.cryptoautomation.entity.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReportHistoryJpaRepository extends JpaRepository<ReportHistory, UUID> {
}
