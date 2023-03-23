package com.example.chatgptcodereviewtest.controller;

import com.example.chatgptcodereviewtest.dto.InputDto;
import com.example.chatgptcodereviewtest.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping
    public int convertText(@RequestBody InputDto inputDto) {
        return testService.addAgeAndNameLength(inputDto);
    }
}
