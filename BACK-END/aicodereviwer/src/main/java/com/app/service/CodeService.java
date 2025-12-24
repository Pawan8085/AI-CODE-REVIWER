package com.app.service;

import com.app.dto.request.CodeSubmissionRequest;
import com.app.dto.response.CodeSubmissionResponse;
import com.app.entities.CodeSubmission;
import com.app.repository.CodeSubmissionRepo;
import com.app.transformer.CodeSubmissionTransformer;
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


    public CodeSubmissionResponse createCodeSubmission(CodeSubmissionRequest codeSubmissionReq){
        // convert request obj into CodeSubmission obj
        CodeSubmission codeSubmission = CodeSubmissionTransformer.codeSubmissionRequestToCodeSubmission(codeSubmissionReq);
        codeSubmission.setCreatedAt(LocalDateTime.now());

        CodeSubmission savedCodeSubmission = codeSubmissionRepo.save(codeSubmission);
        // convert and return CodeSubmissionObject
        return CodeSubmissionTransformer.codeSubmissionToCodeSubmissionResponse(savedCodeSubmission);
    }
}
