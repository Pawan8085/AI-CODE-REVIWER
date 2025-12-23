package com.app.controller;

import com.app.entities.CodeSubmission;
import com.app.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/code")
public class CodeReviewController {

    private final CodeService codeService;
    @Autowired
    public CodeReviewController(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello!";
    }

    @PostMapping("/upload")
    public ResponseEntity<CodeSubmission> codeSubmissionHandler(@RequestBody CodeSubmission codeSubmission){

        return  ResponseEntity.ok(codeService.createCodeSubmission(codeSubmission));
    }
}
