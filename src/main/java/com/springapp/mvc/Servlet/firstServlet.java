package com.springapp.mvc.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ультрамар on 07.06.2016.
 */
public class firstServlet extends HttpServlet{
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<html>");
            out.println("<head>");

            out.println("<img src='http://media.emirates247.com/images/2014/01/gvDSC_9387.JPG'");


            out.println("<title>Стили</title>");
            out.println("<link rel='stylesheet' type='text/css' href='mysite.css'>");
            out.println("<link rel='stylesheet' type='text/css' href='http://www.mysite.ru/main.css'>");
//            out.println("<link rel="shortcut icon" type="image/png" href="/favicon.png"/>");
//            out.println("<link rel="shortcut icon" type="image/png" href="http://eg.com/favicon.png"/>");
            out.println("<title>passive</title>");
            out.println("<link rel='stylesheet' type='text/css' href='mysite.css'>");
            out.println("<link rel='stylesheet' type='text/css' href='http://www.mysite.ru/main.css'>");
            out.println("</head>");
            out.println("<body>");


            out.println("<h1>люби меня Суоми красавица "+ request.getContextPath()+"</h1>");


            out.println("<img src='WEB-INF/images/w.jpg/'");

            out.println("<title>Стили</title>");

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
