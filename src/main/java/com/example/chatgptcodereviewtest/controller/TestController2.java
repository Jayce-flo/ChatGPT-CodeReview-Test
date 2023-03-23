package com.example.chatgptcodereviewtest.controller;

import com.example.chatgptcodereviewtest.service.TestService2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@RestController
@RequestMapping("/test2")
@RequiredArgsConstructor
public class TestController2 {

    private final TestService2 testService2;

    @GetMapping
    public String getText(@RequestParam(value = "label", required = false) String label) {
        return testService2.getUppercaseTestLabel(label);
    }
}