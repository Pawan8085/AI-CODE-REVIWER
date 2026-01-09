package com.app.transformer;

import com.app.dto.response.CodeVersionResponse;
import com.app.entities.CodeVersion;

public class CodeVersionTransformer {

    // CodeVersion -> CodeVersionResponse
    public static CodeVersionResponse codeVersionToCodeVersionResponse(CodeVersion codeVersion){

        return CodeVersionResponse.builder()
                .submission(codeVersion.getSubmission())
                .versionNumber(codeVersion.getVersionNumber())
                .code(codeVersion.getCode())
                .analysis(codeVersion.getAnalysis())
                .createdAt(codeVersion.getCreatedAt())
                .build();
    }



}
