package com.example.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_traffic", "root", "password")) {
            String query = "INSERT INTO users (username, email) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.executeUpdate();
            response.getWriter().println("User Registered Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}