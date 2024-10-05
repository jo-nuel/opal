package uts.isd.controller;

import uts.isd.model.dao.SavedTripDAO;
import uts.isd.model.SavedTrip;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListSavedTripsServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameter (accountId)
        int accountId = Integer.parseInt(request.getParameter("accountId"));

        // Get the DAO from the session
        SavedTripDAO savedTripDAO = (SavedTripDAO) session.getAttribute("savedTripDAO");

        if (savedTripDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // List all SavedTrips for the given accountId
            ArrayList<SavedTrip> trips = savedTripDAO.getTripsByAccountId(accountId);

            // Set the trip list in the request
            request.setAttribute("trips", trips);

            // Forward the request to the saved trips list JSP
            request.getRequestDispatcher("savedTripList.jsp").include(request, response);
        } catch (SQLException e) {
            session.setAttribute("error", "Database error: Unable to retrieve saved trips.");
            response.sendRedirect("savedTripList.jsp");
        }
    }
}
