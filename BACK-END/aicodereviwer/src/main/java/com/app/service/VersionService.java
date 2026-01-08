package com.app.service;

import com.app.dto.response.CodeVersionResponse;
import com.app.entities.CodeVersion;
import com.app.repository.CodeVersionRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class VersionService {

    private final CodeVersionRepo codeVersionRepo;
    @Autowired

    List<CodeVersion> findCodeVersions(UUID submissionId){
        return codeVersionRepo.findByCodeSubmission(submissionId);
    }


}
