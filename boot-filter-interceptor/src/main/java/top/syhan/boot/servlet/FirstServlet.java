package top.syhan.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: Servlet测试
 * @author: syhan
 * @create: 2022-07-29
 **/
@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")
@Slf4j
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("firstServlet");
        resp.getWriter().write("firstServlet");
    }

}
