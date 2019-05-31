package com.heyanwei.rabbitmq.producer.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.heyanwei.rabbitmq.producer.model.Order;

/**
 * @Author: heyanwei
 * @CreateDate: 2019/5/31 15:41
 */
public class FastJsonConvertUtil {

    /**
     * 对象转json
     * @param object
     * @return
     */
    public static String convertObject2Json(Object object){
        String text = JSON.toJSONString(object);
        return text;
    }

    /**
     * json转对象
     * @param object
     * @return
     */
    public static Order convertJson2Object(String message, Object object){
        Order order = JSON.parseObject(message,new TypeReference<Order>(){});
        return order;
    }
}