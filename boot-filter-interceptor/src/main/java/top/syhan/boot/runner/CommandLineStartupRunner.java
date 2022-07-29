package top.syhan.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @description:
 * @author: syhan
 * @create: 2022-07-29
 **/
@Component
@Slf4j
public class CommandLineStartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineStartupRunner传入参数：{}", Arrays.toString(args));
    }
}
