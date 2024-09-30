package com.dbs.Datasources.towf.repo;

import com.dbs.Datasources.towf.entity.AuditReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepotRepo extends JpaRepository<AuditReport, Integer> {
}
