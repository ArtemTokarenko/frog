package com.springapp.mvc.Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Ультрамар on 07.06.2016.
 */
public class firstServlet extends HttpServlet{
int count;
    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        config.getInitParameter("init1");
    }


    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();

        Enumeration en = request.getParameterNames();


        while (en.hasMoreElements()){
            String p = en.nextElement().toString();
            out.println("<h1>"+ p+" = "+request.getParameter(p)+"</h1>");
        }
        count++;
        request.getSession().setAttribute("count",count);
        try{
            out.println("<html>");
            out.println("<head>");

            out.println("<img src='http://media.emirates247.com/images/2014/01/gvDSC_9387.JPG'");


            out.println("<h1>"+ request.getSession().getAttribute("count")+"</h1>");

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


//            out.println("<h1>getContextPath( "+ request.getContextPath()+"</h1>");
//            out.println("<h1>getAuthType() "+ request.getAuthType()+"</h1>");
//            out.println("<h1>getHeader(p1) "+ request.getHeader("p1")+"</h1>");
//            out.println("<h1>getPathInfo() "+ request.getPathInfo()+"</h1>");
//            out.println("<h1>getPathTranslated() "+ request.getPathTranslated()+"</h1>");
//            out.println("<h1>getQueryString() "+ request.getQueryString()+"</h1>");
//            out.println("<h1>getMethod() "+ request.getMethod()+"</h1>");
//            out.println("<h1>getRequestedSessionId() "+ request.getRequestedSessionId()+"</h1>");
            out.println("<h1>"+ request.getRequestURI()+"</h1>");
//            out.println("<h1>getServletPath() "+ request.getServletPath()+"</h1>");
//            out.println("<h1>getCharacterEncoding() "+ request.getCharacterEncoding()+"</h1>");


//            out.println("<h1>параметр1 = " + request.getParameter("p1") + "</h1>");
//            out.println("<h1>параметр2 = "+ request.getParameter("p2")+"</h1>");

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
