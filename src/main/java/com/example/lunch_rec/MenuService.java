package com.example.lunch_rec;


import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private static final List<Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}
