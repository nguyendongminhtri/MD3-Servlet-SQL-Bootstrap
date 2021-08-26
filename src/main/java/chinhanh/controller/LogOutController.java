package chinhanh.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

    @WebServlet("/logout")
    public class LogOutController extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public LogOutController() {
            super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession(false);
            System.out.println("check session tren-->"+(session != null));
            if (session != null) {
                session.removeAttribute("user");
                System.out.println("check session1 -->"+(session != null));
                session.invalidate();
                response.sendRedirect("form-login/login.jsp");
                System.out.println("check session 2-->"+(session != null));
//                RequestDispatcher dispatcher = request.getRequestDispatcher("form-login/login.jsp");
//                dispatcher.forward(request, response);
                return;

            }
        }
    }

