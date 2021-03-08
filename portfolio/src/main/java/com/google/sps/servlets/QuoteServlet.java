package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/quote")
public class QuoteServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("I would rather go 0-for-30 than 0-for-9. 0-for-9 means you beat yourself. The only reason is because you have now lost confidence in yourself - Kobe Bryant");
    
        
    }
}