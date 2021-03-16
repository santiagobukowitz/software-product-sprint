package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;



@WebServlet ("/quote")
public final class QuoteServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         String [] quotes = {"I would rather go 0-for-30 than 0-for-9. 0-for-9 means you beat yourself. The only reason is because you have now lost confidence in yourself. - Kobe Bryant",
         "I'm me, I do me, and I chill...Whatever you do, just do you. - Kevin Durant", "In order to succeed greatly, you have to be prepared to fail greatly. - Mike Tyson" };

         ArrayList<String> arr_list = new ArrayList<String>();
         arr_list.add("I would rather go 0-for-30 than 0-for-9. 0-for-9 means you beat yourself. The only reason is because you have now lost confidence in yourself. - Kobe Bryant");
         arr_list.add("I'm me, I do me, and I chill...Whatever you do, just do you. - Kevin Durant");
         arr_list.add("In order to succeed greatly, you have to be prepared to fail greatly. - Mike Tyson");
         Gson gson = new Gson();
         String json = gson.toJson(arr_list);

         response.setContentType("application/json;");
         response.getWriter().println(json);



   

    
        
    }
}