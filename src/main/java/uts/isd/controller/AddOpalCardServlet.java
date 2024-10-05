package uts.isd.controller;

import uts.isd.model.dao.OpalCardDAO;
import uts.isd.model.OpalCard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddOpalCardServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Fetch request parameters
        String cardNumber = request.getParameter("cardNumber");
        String cardName = request.getParameter("cardName");
        double balance = Double.parseDouble(request.getParameter("balance"));
        int accountId = Integer.parseInt(request.getParameter("accountId"));
        OpalCard.CardStatus cardStatus = OpalCard.CardStatus.valueOf(request.getParameter("cardStatus"));

        // Get the DAO from the session
        OpalCardDAO opalCardDAO = (OpalCardDAO) session.getAttribute("opalCardDAO");

        if (opalCardDAO == null) {
            response.sendRedirect("ConnServlet");  // Redirect if DAO is not available
            return;
        }

        try {
            // Add a new Opal card using DAO
            opalCardDAO.addOpalCard(cardNumber, cardName, balance, accountId, cardStatus);

            // Create an OpalCard object and set it in the session
            OpalCard card = new OpalCard(0, cardNumber, cardName, balance, accountId, cardStatus);
            session.setAttribute("card", card);

            // Redirect to the card list page
            request.getRequestDispatcher("cardList.jsp").include(request, response);
        } catch (Exception e) {
            session.setAttribute("error", "Database error: Unable to add Opal card.");
            response.sendRedirect("addCard.jsp");
        }
    }
}
