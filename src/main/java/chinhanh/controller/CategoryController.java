package chinhanh.controller;


import chinhanh.model.Category;
import chinhanh.service.categoryservice.CategoryServiceImpl;
import chinhanh.service.categoryservice.ICategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoryController", value = "/category")
public class CategoryController extends HttpServlet {
    CategoryServiceImpl categoryService = new CategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            default:
                showAllCategory(request,response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createNewCategory(request,response);
                break;
            default:
                break;
        }
    }
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("category/create.jsp");
       try {
           dispatcher.forward(request,response);
       } catch (ServletException e){
           e.printStackTrace();
       } catch (IOException E){
           E.printStackTrace();
       }
    }
    private void showAllCategory(HttpServletRequest request, HttpServletResponse response){
        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories", categories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("category/list.jsp");
        try {
          dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private void createNewCategory(HttpServletRequest request, HttpServletResponse response){
        String nameCategory = request.getParameter("nameCategory");
        String avatarCategory = request.getParameter("avatarCategory");
        Category category = new Category(nameCategory, avatarCategory);
        categoryService.save(category);
        RequestDispatcher dispatcher = request.getRequestDispatcher("category/create.jsp");
        request.setAttribute("message", "Create category success!");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
