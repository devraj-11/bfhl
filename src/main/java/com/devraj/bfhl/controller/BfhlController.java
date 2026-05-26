package com.devraj.bfhl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devraj.bfhl.dto.RequestDTO;
import com.devraj.bfhl.dto.ResponseDTO;
import com.devraj.bfhl.services.BfhlService;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public ResponseDTO processData(@RequestBody RequestDTO requestDTO) {
        return bfhlService.processData(requestDTO);
    }
}