package com.cybercitycode.subject.repository;

import com.cybercitycode.subject.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {
}
