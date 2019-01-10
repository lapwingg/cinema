package com.lapwingg.repository;

import com.lapwingg.model.ReportSoldTickets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportSoldTicketsRepository extends CrudRepository<ReportSoldTickets, Integer> {
}
