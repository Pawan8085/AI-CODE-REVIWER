package com.app.repository;

import com.app.entities.CodeVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CodeVersionRepo extends JpaRepository<CodeVersion, UUID> {

    List<CodeVersion> findByCodeSubmission(UUID submission_id);
}
