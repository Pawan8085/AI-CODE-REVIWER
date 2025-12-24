package com.app.transformer;

import com.app.dto.request.CodeSubmissionRequest;
import com.app.dto.response.CodeSubmissionResponse;
import com.app.entities.CodeSubmission;

public class CodeSubmissionTransformer {

    public static CodeSubmission codeSubmissionRequestToCodeSubmission(CodeSubmissionRequest codeSubmission){
        // CodeSubmissionRequest to CodeSubmission

        return
                CodeSubmission.builder()
                        .userId(codeSubmission.getUserId())
                        .language(codeSubmission.getLanguage())
                        .filename(codeSubmission.getFilename())
                        .code(codeSubmission.getCode())
                        .build();

    }

    public static CodeSubmissionResponse codeSubmissionToCodeSubmissionResponse(CodeSubmission codeSubmission){
        // CodeSubmission to CodeSubmissionResponse

        return
                CodeSubmissionResponse.builder()
                        .id(codeSubmission.getId())
                        .userId(codeSubmission.getUserId())
                        .language(codeSubmission.getLanguage())
                        .filename(codeSubmission.getFilename())
                        .createdAt(codeSubmission.getCreatedAt())
                        .build();
    }
}
