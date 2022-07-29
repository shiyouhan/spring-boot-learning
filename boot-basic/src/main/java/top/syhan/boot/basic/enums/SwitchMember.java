package top.syhan.boot.basic.enums;

/**
 * @program: spring-boot-learning
 * @description: 枚举成员
 * @author: SYH
 * @create: 2022-07-28 11:05
 **/
public class SwitchMember {
    public static void main(String[] args) {
        Platform p = Platform.ANDROID;
        System.out.println(p);
        p.platformInfo();
    }
}

enum Platform {
    /**
     * 平台枚举
     */
    ANDROID, IOS, WEB;

    /**
     * 构造方法，默认私有
     */
    private Platform() {
        System.out.println("构造方法被调用 : " + this);
    }

    public void platformInfo() {
        System.out.println("平台信息:" + this);
    }
}

