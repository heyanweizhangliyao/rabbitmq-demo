package com.heyanwei.rabbitmq.producer.util;

import java.util.Date;

/**
 * Created by heyanwei-thinkpad on 2019/5/31.
 */
public class DateUtils {
    public static Date addMinutes(Date orderTime, int orderTimeout) {
        Date afterDate = new Date(orderTime.getTime() + 60000*orderTimeout);
        return afterDate;
    }
}
