package com.example.chatgptcodereviewtest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/23
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InputDto {

    private String name;
    private int age;
}
