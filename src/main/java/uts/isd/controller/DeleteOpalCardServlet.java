package uts.isd.controller;

import uts.isd.model.dao.OpalCardDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DeleteOpalCardServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameter
        int cardId = Integer.parseInt(request.getParameter("cardId"));

        // Get the DAO from the session
        OpalCardDAO opalCardDAO = (OpalCardDAO) session.getAttribute("opalCardDAO");

        if (opalCardDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // Delete the Opal card using DAO
            opalCardDAO.deleteOpalCard(cardId);

            // Redirect to the card list page
            request.getRequestDispatcher("cardList.jsp").include(request, response);
        } catch (Exception e) {
            session.setAttribute("error", "Database error: Unable to delete Opal card.");
            response.sendRedirect("cardList.jsp");
        }
    }
}
