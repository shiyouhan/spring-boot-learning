package top.syhan.boot.controller;

import org.springframework.web.bind.annotation.*;
import top.syhan.boot.entity.Article;
import top.syhan.boot.service.ExceptionService;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @description: 测试接口
 * @author: syhan
 * @create: 2022-07-29
 **/
@RestController
public class ArticleController {
    @Resource
    private ExceptionService exceptionService;


    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable("id") int id) {
        if (id == 0) {
            exceptionService.systemBizError();
        }
        exceptionService.userBizError(id);
        return Article.builder()
                .id(id)
                .title("SpringBoot")
                .build();
    }

    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return article;
    }

}
