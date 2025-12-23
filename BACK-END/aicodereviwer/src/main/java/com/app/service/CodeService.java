package com.app.service;

import com.app.entities.CodeSubmission;
import com.app.repository.CodeSubmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CodeService {

    private  final CodeSubmissionRepo codeSubmissionRepo;
    @Autowired
    public CodeService(CodeSubmissionRepo codeSubmissionRepo) {
        this.codeSubmissionRepo = codeSubmissionRepo;
    }


    public CodeSubmission createCodeSubmission(CodeSubmission codeSubmission){
        codeSubmission.setCreatedAt(LocalDateTime.now());
        return codeSubmissionRepo.save(codeSubmission);
    }
}
