package com.mongorest.tenderdemo.repo;

import com.mongorest.tenderdemo.model.PatientReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "bidder", path = "opentenders")
public interface ReportRepository extends MongoRepository<PatientReport,String> {
    @Override
    List<PatientReport> findAll();
}
