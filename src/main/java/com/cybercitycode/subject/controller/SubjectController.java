package com.cybercitycode.subject.controller;

import com.cybercitycode.subject.model.Subject;
import com.cybercitycode.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public Optional<Subject> getSubjectById(@PathVariable String id) {
        return subjectService.getSubjectById(id);
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable String id, @RequestBody Subject subject) {
        return subjectService.updateSubject(id, subject);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable String id) {
        subjectService.deleteSubject(id);
    }
}
