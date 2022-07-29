package top.syhan.boot.basic.enums;

/**
 * @program: spring-boot-learning
 * @description: 枚举迭代
 * @author: SYH
 * @create: 2022-07-27 22:21
 **/
public class EnumIterator {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
