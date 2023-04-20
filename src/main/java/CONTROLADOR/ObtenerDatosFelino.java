/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CONTROLADOR;

import MODELO.Felino;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author WORKING
 */
@WebServlet(name = "ObtenerDatosFelino", urlPatterns = {"/ObtenerDatosFelino"})
public class ObtenerDatosFelino extends HttpServlet {

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
    String nombref = request.getParameter("nombref");
    String razaf = request.getParameter("razaf");
    String colorf = request.getParameter("colorf");
    String edaddf = request.getParameter("edadf");
    int edadf = Integer.parseInt(edaddf);
    String toxo = request.getParameter("toxo");

    Felino f = new Felino(toxo, nombref, edadf, razaf, colorf); 
    
    HttpSession session = request.getSession(true);
    
    session.setAttribute("felinoGuardado", f);
    
    request.getRequestDispatcher( "ConsultarMascotasCONTROLER.jsp").forward(request, response);

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
