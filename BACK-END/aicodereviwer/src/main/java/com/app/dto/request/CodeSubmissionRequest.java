package com.app.dto.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CodeSubmissionRequest {

    private UUID userId;

    private String filename;
    private String language;

    private String code;

}
