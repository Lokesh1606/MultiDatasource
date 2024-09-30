package com.dbs.Datasources;

import com.dbs.Datasources.arp.entity.ConfigurationData;
import com.dbs.Datasources.arp.repo.ConfigurationDataRepo;
import com.dbs.Datasources.towf.entity.AuditReport;
import com.dbs.Datasources.towf.repo.AuditRepotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatasourcesApplication implements CommandLineRunner {


	@Autowired
	AuditRepotRepo auditReportRepo;

	@Autowired
	ConfigurationDataRepo configurationDataRepo;

	public static void main(String[] args) {
		SpringApplication.run(DatasourcesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi every one");

		AuditReport auditReport = new AuditReport();
		auditReport.setHeads("lokesh");
		auditReport.setProduct("banda");
		auditReport.setTimeStamp(new Date());
		auditReportRepo.save(auditReport);

		System.out.println("success");

		ConfigurationData configurationData = new ConfigurationData(1,"vivek","rapaka",new Date());
		configurationDataRepo.save(configurationData);

	}
}
