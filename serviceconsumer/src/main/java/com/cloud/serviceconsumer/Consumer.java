package com.cloud.serviceconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

 //Consumer接口
@Service
@FeignClient(name="server-provider",fallback=ConsumerFallback.class)
public interface Consumer {

    @RequestMapping(value = "/index")
    String index();
}
