package uts.isd.controller;

import uts.isd.model.dao.SavedTripDAO;
import uts.isd.model.SavedTrip;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddSavedTripServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameters
        String tripName = request.getParameter("tripName");
        String currentLocation = request.getParameter("currentLocation");
        String destinationLocation = request.getParameter("destinationLocation");
        int accountId = Integer.parseInt(request.getParameter("accountId"));

        // Get the DAO from the session
        SavedTripDAO savedTripDAO = (SavedTripDAO) session.getAttribute("savedTripDAO");

        if (savedTripDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // Add a new SavedTrip using DAO
            savedTripDAO.addSavedTrip(tripName, currentLocation, destinationLocation, accountId);

            // Create a SavedTrip object and set it in the session
            SavedTrip trip = new SavedTrip(0, accountId, tripName, currentLocation, destinationLocation);
            session.setAttribute("savedTrip", trip);

            // Redirect to the saved trips list page
            request.getRequestDispatcher("savedTripList.jsp").include(request, response);
        } catch (Exception e) {
            session.setAttribute("error", "Database error: Unable to add saved trip.");
            response.sendRedirect("addSavedTrip.jsp");
        }
    }
}
