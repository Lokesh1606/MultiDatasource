package com.dbs.Datasources.arp.repo;

import com.dbs.Datasources.arp.entity.ConfigurationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationDataRepo extends JpaRepository<ConfigurationData, Integer> {
}
