package top.syhan.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description: 类初始化监听
 * @author: syhan
 * @create: 2022-07-29
 **/
@Component
@Slf4j
public class BeanInitListener implements InitializingBean {
    static {
        log.info("类初始化静态代码块");
    }

    public BeanInitListener() {
        log.info("类初始化构造方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("类初始化 afterPropertiesSet 方法");
    }

    @PostConstruct
    void method() {
        log.info("类初始化 postConstruct 注解方法!");
    }
}

