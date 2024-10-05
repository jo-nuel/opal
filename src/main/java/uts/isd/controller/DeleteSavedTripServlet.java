package uts.isd.controller;

import uts.isd.model.dao.SavedTripDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DeleteSavedTripServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameter
        int tripId = Integer.parseInt(request.getParameter("tripId"));

        // Get the DAO from the session
        SavedTripDAO savedTripDAO = (SavedTripDAO) session.getAttribute("savedTripDAO");

        if (savedTripDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // Delete the SavedTrip using DAO
            savedTripDAO.deleteSavedTrip(tripId);

            // Redirect to the saved trips list page
            request.getRequestDispatcher("savedTripList.jsp").include(request, response);
        } catch (Exception e) {
            session.setAttribute("error", "Database error: Unable to delete saved trip.");
            response.sendRedirect("savedTripList.jsp");
        }
    }
}
