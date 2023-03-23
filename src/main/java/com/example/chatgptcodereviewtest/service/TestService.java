package com.example.chatgptcodereviewtest.service;

import com.example.chatgptcodereviewtest.dto.InputDto;
import org.springframework.stereotype.Service;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@Service
public class TestService {

    public int addAgeAndNameLength(InputDto inputDto) {
        int age = inputDto.getAge();
        int nameLength = inputDto.getName().length();
        return age + nameLength;
    }
}
