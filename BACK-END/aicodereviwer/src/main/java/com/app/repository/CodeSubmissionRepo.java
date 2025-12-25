package com.app.repository;

import com.app.entities.CodeSubmission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CodeSubmissionRepo extends JpaRepository<CodeSubmission, UUID> {

    Page<CodeSubmission> findByUserId(Pageable pageable);
}
