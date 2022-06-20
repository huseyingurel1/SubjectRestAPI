package com.huseyingurel.service;

import com.huseyingurel.model.Subject;
import com.huseyingurel.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

     @Autowired
     public SubjectRepository subjectRepository;

     public List<Subject> getAllSubjects(){
         List<Subject> subjects =new ArrayList<>();
         subjectRepository.findAll().forEach(subjects::add);
         return subjects;

     }

    public void addSubject(Subject subject) {
         subjectRepository.save(subject);
    }

    public void updateSubject(Long id, Subject subject) {
//          = subjectRepository.findById(id);

         subjectRepository.save(subject);
    }

    public void deleteSubject(Long id) {
         subjectRepository.deleteById(id);

    }

    public void deleteAllubject() {
         subjectRepository.deleteAll();
    }
}
