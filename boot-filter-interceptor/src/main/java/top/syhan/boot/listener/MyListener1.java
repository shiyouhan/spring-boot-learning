package top.syhan.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import top.syhan.boot.event.MyEvent;

/**
 * @description: 自定义事件监听器方式1：实现ApplicationListener接口
 * @author: syhan
 * @create: 2022-07-29
 **/
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
    }
}

