package top.syhan.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: syhan
 * @create: 2022-07-29
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Min(4)
    private Integer id;
    @NotNull(message = "文章标题不能为空")
    private String title;
}
