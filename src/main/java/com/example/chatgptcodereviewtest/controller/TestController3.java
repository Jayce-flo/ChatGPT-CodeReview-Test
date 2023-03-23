package com.example.chatgptcodereviewtest.controller;

import com.example.chatgptcodereviewtest.service.TestService3;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@RestController
@RequestMapping("/test3")
@RequiredArgsConstructor
public class TestController3 {

    private final TestService3 testService3;

    public void test3() {
        testService3.test3();
    }
}
