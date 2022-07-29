package top.syhan.boot.basic.enums;

/**
 * @program: spring-boot-learning
 * @description: 内部类中使用枚举
 * 每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的
 * @author: SYH
 * @create: 2022-07-28 10:45
 **/
public class InnerEnum {
    //等同于
    //class SEASON
    //{
    //    public static final SEASON SPRING = new SEASON();
    //    public static final SEASON SUMMER = new SEASON();
    //    public static final SEASON AUTUMN = new SEASON();
    //    public static final SEASON WINTER = new SEASON();
    //}
    enum SEASON {
        /**
         * 季节枚举
         */
        SPRING, SUMMER, AUTUMN, WINTER;
    }
}
