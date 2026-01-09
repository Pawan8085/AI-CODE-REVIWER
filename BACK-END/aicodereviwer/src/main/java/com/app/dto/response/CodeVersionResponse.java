package com.app.dto.response;

import com.app.entities.CodeSubmission;
import jakarta.persistence.Column;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class CodeVersionResponse {

    private CodeSubmission submission;
    private Integer versionNumber;
    private String code;
    private String analysis;
    private LocalDateTime createdAt;

}
