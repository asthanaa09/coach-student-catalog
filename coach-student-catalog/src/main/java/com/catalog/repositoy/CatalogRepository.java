package com.catalog.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.catalog.models.Catalog;

@Repository
public interface CatalogRepository extends MongoRepository<Catalog, Long> {

	@Query("db.catalog.find({'student.$id': :studentID, 'subject.$id': :subjectID})")
	public Catalog findByStudentIDAndSubjectID(@Param("studentID") Long studentID, @Param("subjectID") Long subjectID);
}
