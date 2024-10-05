package uts.isd.controller;

import uts.isd.model.dao.OpalCardDAO;
import uts.isd.model.OpalCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UpdateOpalCardServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameters
        int cardId = Integer.parseInt(request.getParameter("cardId"));
        String cardName = request.getParameter("cardName");
        double balance = Double.parseDouble(request.getParameter("balance"));
        OpalCard.CardStatus cardStatus = OpalCard.CardStatus.valueOf(request.getParameter("cardStatus"));

        // Get the DAO from the session
        OpalCardDAO opalCardDAO = (OpalCardDAO) session.getAttribute("opalCardDAO");

        if (opalCardDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // Update the Opal card using DAO
            opalCardDAO.updateOpalCard(cardId, cardName, balance, cardStatus);

            // Redirect to the card list page
            request.getRequestDispatcher("cardList.jsp").include(request, response);
        } catch (Exception e) {
            session.setAttribute("error", "Database error: Unable to update Opal card.");
            response.sendRedirect("updateCard.jsp");
        }
    }
}
