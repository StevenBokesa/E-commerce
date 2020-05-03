package controller;

import bean.LoginBean;
import bean.Personal_Info;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bean.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ProfileDAO;

/**
 *
 * Login class in servlet which is the part of MVC working as Controller which call the DAO class and Login 
 * beans class to start login auth workflow
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        LoginBean loginBean = new LoginBean();
        loginBean.setUserName(email);
        loginBean.setPassword(password);
        
        ProfileDAO dao = new ProfileDAO();
        String userValidate = dao.authenticateUser(loginBean);
        
               
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
            if(userValidate.equals("SUCCESS")){
                
                HttpSession session = request.getSession();
            	User user = new User();
                user.setEmail(email);
                user.setFullName(dao.findName(request.getParameter("email")));
                user.setMemberSince(dao.findMembersince(request.getParameter("email")));
                session.setAttribute("user", user);
                
                
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }                
            else {    
            	String login = "email and password wrong";
               	HttpSession session = request.getSession();
                session.setAttribute("login_message", login);
            	request.getRequestDispatcher("/login.jsp").forward(request, response);//forwarding the request
            }

            
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

