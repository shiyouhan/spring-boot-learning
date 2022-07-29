package top.syhan.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: syhan
 * @create: 2022-07-29
 **/
public class FormatUtils {
    public static String forTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
