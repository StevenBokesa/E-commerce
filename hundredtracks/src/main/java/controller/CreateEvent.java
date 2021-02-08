	package controller;

	import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import bean.EventBean;
import bean.LoginBean;
	import bean.Personal_Info;
	import bean.User;
import model.EventDAO;
import model.ProfileDAO;

   @MultipartConfig
	public class CreateEvent extends HttpServlet {

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
	        
	        String title = request.getParameter("title");
	        String description = request.getParameter("description");
	        String price = request.getParameter("price");
	        String city = request.getParameter("city");
	        String date = request.getParameter("date");
	        String event_start = request.getParameter("start");
	        String event_end = request.getParameter("end");
	        String venue = request.getParameter("venue");
	        String seats = request.getParameter("seats");
	        Part filePart = request.getPart("photo");
	        String event_organizer = request.getParameter("organizer");
	        
	        		
	        EventBean event = new EventBean();
	        event.setTitle(title);
	        event.setDescription(description);
	        event.setPrice(price);
	        event.setCity(city);
	        event.setDate(date);
	        event.setEvent_start(event_start);
	        event.setEvent_end(event_end);
	        event.setVenue(venue);
	        event.setSeats(seats);
	        if (filePart != null) {
	        event.setImage(filePart);
	        }
	        event.setEvent_organizer(event_organizer);
	        
	        
	        EventDAO dao=new EventDAO();
	        dao.persist(event);
	        HttpSession session=request.getSession();
	        session.setAttribute("event", event);


	        PrintWriter out = response.getWriter();
	     
	        request.getRequestDispatcher("/index.jsp").forward(request, response);
	    

	            
	        
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
