package io.github.liuhanzhi.config;

import org.springframework.cache.interceptor.KeyGenerator;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CustomKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object target, Method method, Object... params) {
        // 自定义缓存键生成逻辑
        String key = method.getName() + "_" + Arrays.toString(params);
        System.out.println("key:" + key);
        return key;
    }
}