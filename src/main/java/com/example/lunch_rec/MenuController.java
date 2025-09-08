package com.example.lunch_rec;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/post", "/list"})
public class MenuController extends HttpServlet {
    private MenuService menuService = new MenuService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String m_name = req.getParameter("m_name");
        String price = req.getParameter("price");
        String spice = req.getParameter("spice");

        Menu menu = new Menu(m_name, spice, price);
        menuService.addMenu(menu);

        // 등록 후 목록 페이지로 이동
        res.sendRedirect(req.getContextPath() + "/list");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<Menu> menus = menuService.getMenuList();
        req.setAttribute("menuList", menus);

        req.getRequestDispatcher("/list.jsp").forward(req, res);
    }
}
