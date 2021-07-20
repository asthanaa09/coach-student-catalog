package com.catalog.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.catalog.models.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, Long> {

}
