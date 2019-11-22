package com.cloud.serviceconsumer;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerFallback implements Consumer{
    @Override
    public String index() {
        return "Feign客户端访问失败";
    }

}
