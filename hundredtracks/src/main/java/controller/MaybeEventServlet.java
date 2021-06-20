package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EventBean;
import model.EventDAO;

public class MaybeEventServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	/**
	 * Given the user click maybe from the event
	 * When the event id has been sent through the request 
	 * Then the maybe counter should increment by one
	 * 
	 */
	int event_id = Integer.parseInt(request.getParameter("event_id"));
	try {
		EventDAO dao = new EventDAO();
		EventBean event = dao.findEventById(event_id);
		dao.updateMaybeAttending(event);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
		
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
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }


}
