package com.huseyingurel.controller;

import com.huseyingurel.model.Subject;
import com.huseyingurel.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value ="/subjects")
    public void addSubject(@RequestBody Subject subject){

        subjectService.addSubject(subject);

    }

    @RequestMapping(method = RequestMethod.PUT, value ="/subjects/{id}")
    public void updateSubject(@PathVariable Long id,@RequestBody Subject subject){

        subjectService.updateSubject(id,subject);

    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/subjects/{id}")
    public void deleteSubject(@PathVariable Long id){

         subjectService.deleteSubject(id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/subjects")
    public void deleteAllSubject(){

        subjectService.deleteAllubject();

    }

















}
