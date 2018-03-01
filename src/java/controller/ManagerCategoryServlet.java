/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.CategoryDAO;

/**
 *
 * @author 8470p
 */
public class ManagerCategoryServlet extends HttpServlet {

    CategoryDAO Dao = new CategoryDAO();

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
            String command = request.getParameter("command");
             String id = request.getParameter("idDanhMuc");
              String ten = request.getParameter("tenDanhMuc");
            if (command.equalsIgnoreCase("insert")) {
                
               
                Category cate = new Category(id, ten);
                if (Dao.addCategory(cate) == 1) {
                    request.setAttribute("LIST_CATEGORY", CategoryDAO.getAllCategory());
                    request.getRequestDispatcher("/admin/manager_category.jsp").forward(request, response);

                }else{
                request.getRequestDispatcher("/admin/insert_category.jsp").forward(request, response);
}

            }
            if (command.equalsIgnoreCase("delete")) {
               
                if (Dao.delmoCategory(id) == 1) {
                    request.getRequestDispatcher("/admin/manager_category.jsp").forward(request, response);
                }

            }
            if (command.equalsIgnoreCase("edit")) {
               
                
                request.setAttribute("CATEGORY", CategoryDAO.gettCategorybyID(id));
                request.setAttribute("CATEGORY_ID", CategoryDAO.gettCategorybyID(id).getCategoryID());
                request.setAttribute("LIST_CATEGORY",  CategoryDAO.getAllCategory());
                request.getRequestDispatcher("/admin/update_category.jsp").forward(request, response);

            }
             if (command.equalsIgnoreCase("update")) {
               Category cate=new Category(id, ten);
               
              Dao.UpdateCategory(cate);
                request.setAttribute("LIST_CATEGORY",  CategoryDAO.getAllCategory());
                request.getRequestDispatcher("/admin/manager_category.jsp").forward(request, response);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManagerCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
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
