package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "code_version")
public class CodeVersion {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private CodeSubmission submission;

    @Column(name = "version_number")
    private Integer versionNumber;
}
