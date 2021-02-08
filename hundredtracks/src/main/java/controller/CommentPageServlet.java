package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Comment;
import bean.Post;
import model.CommentDAO;
import model.PostDAO;

public class CommentPageServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("user_id") == null) {
			response.sendRedirect("login");
			return;
		}
		int post_id = Integer.parseInt(request.getParameter("post_id"));
		
		CommentDAO commentDAO = new CommentDAO();
		ArrayList<Comment> comment = new ArrayList<>();
				
		try {
			comment = commentDAO.getAllCommentsByPost(post_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("comment", comment);
		
		request.getRequestDispatcher("WEB-INF/comment.jsp").forward(request, response);
		
	}

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
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(false);
			if (session == null || session.getAttribute("user_id") == null) {
				response.sendRedirect("login");
				return;
			}
			
			String comment = request.getParameter("comment").trim();
			int post_id = Integer.parseInt(request.getParameter("post_id"));
			
			if(!comment.equals("")) {
				try {
					CommentDAO commentDAO = new CommentDAO();
					commentDAO.insertComment((int) session.getAttribute("user_id"), post_id, comment);
					response.sendRedirect("home");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

}
