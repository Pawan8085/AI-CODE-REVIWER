package com.app.repository;

import com.app.entities.CodeVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CodeVersionRepo extends JpaRepository<CodeVersion, UUID> {

    List<CodeVersion> findByCodeSubmission(UUID submission_id);


    Optional<CodeVersion> findTopBySubmissionIdOrderByVersionNumberDesc(Long submissionId);
    // below method also does the same thing

//    @Query("""
//    SELECT c FROM CodeVersion c
//    WHERE c.submission.id = :submissionId
//      AND c.versionNumber = (
//          SELECT MAX(cv.versionNumber)
//          FROM CodeVersion cv
//          WHERE cv.submission.id = :submissionId
//      )
//""")
//    Optional<CodeVersion> findLatestBySubmissionId(Long submissionId);


}
