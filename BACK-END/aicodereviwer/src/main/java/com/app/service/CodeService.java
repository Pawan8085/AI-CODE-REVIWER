package com.app.service;

import com.app.dto.request.CodeSubmissionRequest;
import com.app.dto.response.CodeSubmissionResponse;
import com.app.entities.CodeSubmission;
import com.app.entities.CodeVersion;
import com.app.repository.CodeSubmissionRepo;
import com.app.repository.CodeVersionRepo;
import com.app.transformer.CodeSubmissionTransformer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CodeService {

    private  final CodeSubmissionRepo codeSubmissionRepo;
    private final CodeVersionRepo codeVersionRepo;



    public CodeSubmissionResponse createCodeSubmission(CodeSubmissionRequest codeSubmissionReq){
        // convert request obj into CodeSubmission obj
        CodeSubmission codeSubmission = CodeSubmissionTransformer.codeSubmissionRequestToCodeSubmission(codeSubmissionReq);
        codeSubmission.setCreatedAt(LocalDateTime.now());

        CodeSubmission savedCodeSubmission = codeSubmissionRepo.save(codeSubmission);

        CodeVersion version = new CodeVersion();
        version.setSubmission(savedCodeSubmission);

        // convert and return CodeSubmissionObject
        return CodeSubmissionTransformer.codeSubmissionToCodeSubmissionResponse(savedCodeSubmission);


    }
}
