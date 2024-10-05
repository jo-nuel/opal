package uts.isd.controller;

import uts.isd.model.dao.OpalCardDAO;
import uts.isd.model.OpalCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListOpalCardsServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameter (accountId)
        int accountId = Integer.parseInt(request.getParameter("accountId"));

        // Get the DAO from the session
        OpalCardDAO opalCardDAO = (OpalCardDAO) session.getAttribute("opalCardDAO");

        if (opalCardDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // List all Opal cards for the given accountId
            ArrayList<OpalCard> cards = opalCardDAO.listAllCardsByAccountId(accountId);

            // Set the card list in the request
            request.setAttribute("cards", cards);

            // Forward the request to the card list JSP
            request.getRequestDispatcher("cardList.jsp").include(request, response);
        } catch (SQLException e) {
            session.setAttribute("error", "Database error: Unable to retrieve Opal cards.");
            response.sendRedirect("cardList.jsp");
        }
    }
}
