package com.app.service;

import com.app.entities.CodeVersion;
import com.app.repository.CodeVersionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VersionService {

    private final CodeVersionRepo codeVersionRepo;
    @Autowired
    public VersionService(CodeVersionRepo codeVersionRepo) {
        this.codeVersionRepo = codeVersionRepo;
    }

    List<CodeVersion> findCodeVersions(UUID submissionId){
        return codeVersionRepo.findByCodeSubmission(submissionId);
    }
}
