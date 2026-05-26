package com.devraj.bfhl.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devraj.bfhl.dto.RequestDTO;
import com.devraj.bfhl.dto.ResponseDTO;
import com.devraj.bfhl.services.BfhlService;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO processData(RequestDTO requestDTO) {

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialChars = new ArrayList<>();

        int sum = 0;
        StringBuilder alphaConcat = new StringBuilder();

        for (String item : requestDTO.getData()) {

            if (item.matches("\\d+")) {
                int number = Integer.parseInt(item);

                sum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item.toUpperCase());
                alphaConcat.append(item);

            } else {
                specialChars.add(item);
            }
        }

        // Reverse + alternating caps
        String reversed = alphaConcat.reverse().toString();
        StringBuilder finalConcat = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                finalConcat.append(
                        Character.toUpperCase(reversed.charAt(i))
                );
            } else {
                finalConcat.append(
                        Character.toLowerCase(reversed.charAt(i))
                );
            }
        }

        ResponseDTO response = new ResponseDTO();
        response.setIs_success(true);
        response.setUser_id("devrajgehlot_11032005");
        response.setEmail("devrajgehlot231186@acropolis.in");
        response.setRoll_number("0827CS231078");
        response.setOdd_numbers(oddNumbers);
        response.setEven_numbers(evenNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialChars);
        response.setSum(String.valueOf(sum));
        response.setConcat_string(finalConcat.toString());

        return response;
    }
}