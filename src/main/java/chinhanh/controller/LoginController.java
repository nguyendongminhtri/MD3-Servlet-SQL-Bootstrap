package chinhanh.controller;


import chinhanh.model.Users;
import chinhanh.service.userservice.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-login/login.jsp");
        dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserServiceImpl userService = new UserServiceImpl();

        Users user = userService.findByEmailAndPassword(email, password);
        String destPage = "form-login/login.jsp";
        System.out.println("check == "+ (user != null));
        System.out.println("user = "+user.toString());

        if (user != null) {
            HttpSession session = request.getSession();
            System.out.println("session login tren--> "+session.getAttribute("user"));
            session.setAttribute("user", user);
            System.out.println("session login duoi--> "+session.getAttribute("user"));
            destPage = "form-login/profile.jsp";
        } else {
            String message = "Invalid email/password";
            request.setAttribute("message", message);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request, response);

    }
}