package io.github.liuhanzhi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {


    public void test(int i) {
        // ioc是单例模式，所以TestService对象只会生成一个
        log.info("test,i:{}, class.hashCode:{}", i, this.hashCode());
    }
}
