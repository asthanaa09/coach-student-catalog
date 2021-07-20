package com.catalog.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.catalog.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

}
