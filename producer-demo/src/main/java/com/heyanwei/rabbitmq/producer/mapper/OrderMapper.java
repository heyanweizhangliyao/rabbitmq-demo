package com.heyanwei.rabbitmq.producer.mapper;

import com.heyanwei.rabbitmq.producer.model.Order;

/**
 * Created by heyanwei-thinkpad on 2019/5/31.
 */
public interface OrderMapper {

    void insert(Order order);
}
