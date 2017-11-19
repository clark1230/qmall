package com.qmall.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 格式化日期
     * @param date
     * @return
     */
    public static String format(Date date){
        return sdf.format(date);
    }

    /**
     * 解析日期
     * @param date
     * @return
     * @throws ParseException
     */
    public static  Date parse(String date) throws ParseException {
        return sdf.parse(date);
    }
}
