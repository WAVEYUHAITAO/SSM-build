package com.hito.controller;

import com.hito.pojo.Books;
import com.hito.service.BookService;
import com.hito.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍,并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPager() {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook";  //重定向到我们的@RequestMapping("/allBook")请求.
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePager(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updateBook";
    }

    //修改书籍的请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("addBook=>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";  //重定向到我们的@RequestMapping("/allBook")请求.
    }

    //删除书籍
    //这里删除使用了restful风格
    @RequestMapping("/deleteBook/{bookID}")
    public String deletePager(@PathVariable("bookID") int id) {
        bookService.deleteBookById(id);
        System.out.println("删除编号：" + id + "成功");
        return "redirect:/book/allBook";  //重定向到我们的@RequestMapping("/allBook")请求.
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String bookName, Model model) {
        List<Books> list = bookService.queryBookByName(bookName);
        for (Books books : list) {
            System.out.println(books);
        }
        model.addAttribute("list", list);
        if (bookName.equals("")) {
            model.addAttribute("error", "未查到");
        }
        return "allBook";
    }
}
