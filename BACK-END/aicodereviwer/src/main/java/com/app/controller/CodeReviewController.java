package com.app.controller;

import com.app.dto.request.CodeSubmissionRequest;
import com.app.dto.response.CodeSubmissionResponse;
import com.app.service.CodeService;
import com.app.service.VersionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/code")
@AllArgsConstructor
public class CodeReviewController {

    private final CodeService codeService;
    private final VersionService versionService;


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello!";
    }

    @PostMapping("/upload")
    public ResponseEntity<CodeSubmissionResponse> codeSubmissionHandler(@RequestBody CodeSubmissionRequest codeSubmission){

        return  ResponseEntity.ok(codeService.createCodeSubmission(codeSubmission));
    }


}
