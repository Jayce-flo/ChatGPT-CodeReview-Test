package com.example.chatgptcodereviewtest.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/03/07
 */
class DateTimeUtilsTest {

    @Test
    @DisplayName("두 시간 사이에 현 시간이 포함되어 있는지 확인한다. (시작, 종료 시간(경계값) 모두 포함됨)")
    void isBetweenTest() {

        LocalTime basis = LocalDateTime.parse("2023-01-02 23:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromInclude = LocalTime.parse("23:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toInclude = LocalTime.parse("02:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basis, fromInclude, toInclude));

        LocalTime basisTwo = LocalDateTime.parse("2023-01-02 03:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeTwo = LocalTime.parse("01:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeTwo = LocalTime.parse("05:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisTwo, fromIncludeTwo, toIncludeTwo));

        LocalTime basisThree = LocalDateTime.parse("2023-01-02 02:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeThree = LocalTime.parse("23:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeThree = LocalTime.parse("02:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisThree, fromIncludeThree, toIncludeThree));

        LocalTime basisFour = LocalDateTime.parse("2023-01-02 02:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeFour = LocalTime.parse("03:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeFour = LocalTime.parse("05:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertFalse(DateTimeUtils.isBetween(basisFour, fromIncludeFour, toIncludeFour));

        LocalTime basisFive = LocalDateTime.parse("2023-01-02 02:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeFive = LocalTime.parse("02:59:59", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeFive = LocalTime.parse("02:59:59", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisFive, fromIncludeFive, toIncludeFive));

        LocalTime basisSix = LocalDateTime.parse("2023-01-03 01:00:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeSix = LocalTime.parse("01:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeSix = LocalTime.parse("01:00:59", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisSix, fromIncludeSix, toIncludeSix));

        LocalTime basisSeven = LocalDateTime.parse("2023-01-03 05:00:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeSeven = LocalTime.parse("01:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeSeven = LocalTime.parse("06:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisSeven, fromIncludeSeven, toIncludeSeven));

        LocalTime basisEight = LocalDateTime.parse("2023-01-03 00:59:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toLocalTime();
        LocalTime fromIncludeEight = LocalTime.parse("23:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toIncludeEight = LocalTime.parse("01:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

        assertTrue(DateTimeUtils.isBetween(basisEight, fromIncludeEight, toIncludeEight));
    }

}
