/*
 * Copyright (c) 2019 DREAMUS COMPANY.
 * All right reserved.
 *
 * This software is the confidential and proprietary information of DREAMUS COMPANY.
 * You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with DREAMUS COMPANY.
 */

package com.example.chatgptcodereviewtest.utils;

import org.apache.commons.lang3.StringUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;

import static java.time.ZoneOffset.UTC;

/**
 * 설명 :
 *
 * @author 서버개발팀
 * @since 2019. 09. 18.
 */
public final class DateTimeUtils {

    /**
     * 기준 시간이 두개의 시간 사이에 존재 하는지 비교한다.
     *
     * @param basisTime   기준이 되는 사이값 시간
     * @param fromInclude 비교될 시작 시간(포함)
     * @param toInclude   비교될 종료 시간(포함)
     */
    public static boolean isBetween(LocalTime basisTime, LocalTime fromInclude, LocalTime toInclude) {

        if (fromInclude == null || toInclude == null || basisTime == null) {
            return false;
        }

        if (fromInclude.isBefore(toInclude)) {
            return !basisTime.isBefore(fromInclude) && !basisTime.isAfter(toInclude);
        } else if (fromInclude.equals(toInclude)) {
            return basisTime.equals(fromInclude);
        } else {
            return !fromInclude.isAfter(basisTime) || !toInclude.isBefore(basisTime);
        }

    }

}
