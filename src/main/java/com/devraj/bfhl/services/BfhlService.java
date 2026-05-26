package com.devraj.bfhl.services;

import com.devraj.bfhl.dto.RequestDTO;
import com.devraj.bfhl.dto.ResponseDTO;

public interface BfhlService {
    ResponseDTO processData(RequestDTO requestDTO);
}