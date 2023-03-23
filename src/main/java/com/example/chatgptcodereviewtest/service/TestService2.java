package com.example.chatgptcodereviewtest.service;

import org.springframework.stereotype.Service;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@Service
public class TestService2 {

    public String getUppercaseTestLabel(String label) {
        return label.toUpperCase();
    }
}
