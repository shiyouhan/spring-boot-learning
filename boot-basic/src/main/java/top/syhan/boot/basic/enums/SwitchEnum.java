package top.syhan.boot.basic.enums;

/**
 * @program: spring-boot-learning
 * @description: 在switch中使用枚举
 * @author: SYH
 * @create: 2022-07-28 10:48
 **/
public class SwitchEnum {
    public static void main(String[] args) {
        Color c = Color.RED;
        switch (c) {
            case RED -> System.out.println("红色");
            case GREEN -> System.out.println("绿色");
            case BLUE -> System.out.println("蓝色");
            default -> System.out.println("默认颜色");
        }
    }
}
