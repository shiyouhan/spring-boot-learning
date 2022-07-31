package top.syhan.boot.datasource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 实体类
 * @author: syhan
 * @create: 2022-07-31
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BootUser {
    private Integer id;
    private String name;
    private String detail;
}

