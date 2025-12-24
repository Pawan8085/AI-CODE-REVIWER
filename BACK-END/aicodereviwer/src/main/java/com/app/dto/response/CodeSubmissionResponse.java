package com.app.dto.response;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class CodeSubmissionResponse {

    private UUID id;

    private UUID userId;

    private String filename;
    private String language;

    private String code;
    private LocalDateTime createdAt;
}
