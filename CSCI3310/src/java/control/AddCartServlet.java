/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Model.AccountReader;
import Model.Cart;
import Model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bakuano
 */
@WebServlet(name = "AddCartServlet", urlPatterns = {"/AddCartServlet"})
public class AddCartServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddCartServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddCartServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        //processRequest(request, response);
        Cart cart = new Cart();
        AccountReader reader = new AccountReader();
        boolean validated = cart.ValidateCart(reader.getUsername(), request.getParameter("menuFood"));
        
        if (!validated) {
            cart.setUserName(reader.getUsername());
            cart.setRestName(request.getParameter("menuRest"));
            cart.setDishName(request.getParameter("menuFood"));
            Date today = new Date();
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            cart.setDeliveryTime(dateFormat.format(today));
            
            Customer customer = new Customer();
            ArrayList<Customer> user;
            user = (ArrayList<Customer>) customer.getCustomers(reader.getUsername());
            
            cart.setDeliveryAddress(user.get(0).getAddress());
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //System.out.println(dateFormat.format(today));
            cart.setDeliveryDate(dateFormat.format(today));
            cart.setPayment("Debit");
            cart.setQuantity(1);
            cart.setPrice(Double.parseDouble(request.getParameter("menuPrice")));
            cart.setDishStatus("On its way");
            
            cart.setCart();
            response.sendRedirect("ListCartServlet");
        }
        else {
            response.sendRedirect("cartError.jsp");
        }
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
