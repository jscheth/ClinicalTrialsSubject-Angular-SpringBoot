package com.cybercitycode.subject.service;

import com.cybercitycode.subject.model.Subject;
import com.cybercitycode.subject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Optional<Subject> getSubjectById(UUID id) {
        return subjectRepository.findById(id);
    }

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject updateSubject(UUID id, Subject updatedSubject) {
        return subjectRepository.findById(id)
                .map(subject -> {
                    subject.setFirstName(updatedSubject.getFirstName());
                    subject.setLastName(updatedSubject.getLastName());
                    subject.setEmail(updatedSubject.getEmail());
                    subject.setPhone(updatedSubject.getPhone());
                    subject.setGender(updatedSubject.getGender());
                    subject.setBirthDate(updatedSubject.getBirthDate());
                    subject.setAddress(updatedSubject.getAddress());
                    subject.setCity(updatedSubject.getCity());
                    subject.setState(updatedSubject.getState());
                    subject.setZip(updatedSubject.getZip());
                    subject.setCountry(updatedSubject.getCountry());
                    subject.setActive(updatedSubject.isActive());
                    return subjectRepository.save(subject);
                })
                .orElseThrow(() -> new RuntimeException("Subject not found with id: " + id));
    }

    public void deleteSubject(UUID id) {
        subjectRepository.deleteById(id);
    }
}
