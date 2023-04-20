/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CONTROLADOR;

import MODELO.Canino;
import MODELO.Felino;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "ObtenerDatosServlet", urlPatterns = {"/ObtenerDatosServlet"})
public class ObtenerDatosServlet extends HttpServlet {

    
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
        
    String nombre = request.getParameter("nombrec");
    String raza = request.getParameter("razac");
    String color = request.getParameter("colorc");
    String edadci = request.getParameter("edadc");
    int edad = Integer.parseInt(edadci);
    String niv = request.getParameter("nivelEntrenamiento");
    int nivelEntrenamiento = Integer.parseInt(niv);
    
        Canino canino = new Canino(nivelEntrenamiento, nombre, edad, raza, color);
        
        HttpSession session = request.getSession(true);
        
        session.setAttribute("caninoGuardado", canino);
        
     
        
    
    
        request.getRequestDispatcher( "ConsultarMascotasCONTROLER.jsp").forward(request, response);
        //response.sendRedirect("ConsultarMascotas.jsp");
    
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
