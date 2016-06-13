package com.springapp.mvc.Servlet;


import com.springapp.mvc.Service.myService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by Ультрамар on 07.06.2016.
 */
public class firstServlet extends HttpServlet{
int count;

    @Autowired
    private myService Service;


    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        System.out.println("init1");
        System.out.println(config.getInitParameter("init1"));
    }


    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<h1>"+ request.getSession().getAttribute("count")+"</h1>");
        out.println("<title>Стили</title>");
        out.println("</head>");
        out.println("<body>");

        try{
            double one = Double.valueOf(request.getParameter("one").toString()).doubleValue();
            double two = Double.valueOf(request.getParameter("two").toString()).doubleValue();

            String operation = String.valueOf(request.getParameter("operation"));

            HttpSession session = request.getSession(true);



            out.println("<h1>"+ request.getRequestURI()+"</h1>");
            out.println("<img src='WEB-INF/images/w.jpg/'");
            out.println("<title>Стили1</title>");
            out.println("<link rel='stylesheet' type='text/css' href='mysite.css'>");
            out.println("<link rel='stylesheet' type='text/css' href='http://www.mysite.ru/main.css'>");
            out.println("</body>");

            out.println("</html>");
        }finally {
out.close();
        }

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce)throws ServletException, IOException{
        processRequest(request,responce);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce)throws ServletException, IOException{
        processRequest(request,responce);
    }


}
