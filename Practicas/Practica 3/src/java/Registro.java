/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JoseAlejandro
 */
public class Registro extends HttpServlet {

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
           
            String usuario = request.getParameter("usuario");
            String usuariolimpio= limpiar(usuario);
            
            String contraseña  = request.getParameter("contraseña");
            String contraseñalimpio= limpiar(contraseña);
            
            String email = request.getParameter("email");
            String emaillimpio= limpiar(email);
            
            String mes = request.getParameter("op");
            String meslimpio= limpiar(mes);
            
            String genero = request.getParameter("genero");
            String generolimpio= limpiar(genero);
            
            String mayor = request.getParameter("mayor");
            String mayorlimpio= limpiar(mayor);
            
            String acerca = request.getParameter("acerca");
            String acercalimpio= limpiar(acerca);
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuario:    " + usuariolimpio + "</h1>");
            out.println("<h1>Contraseña:     " + contraseñalimpio + "</h1>");
            out.println("<h1>Email " + emaillimpio + "</h1>");
            out.println("<h1>Mes:  " + meslimpio + "</h1>");
            out.println("<h1>Genero:    " + generolimpio + "</h1>");
            out.println("<h1>Mayor:  " + mayorlimpio + "</h1>");
            out.println("<h1>Acerca de mi:  " + acercalimpio + "</h1>");
            out.println("<a href=\"Registro.html\">" + "regreso");
            out.println("</body>");
            out.println("</html>");
   
        }
    }
       private String limpiar(String cadenaVieja){
           try {
               String cadenaNueva= URLEncoder.encode(cadenaVieja, "UTF-8");
               
               return cadenaNueva; 
           } 
           catch(Exception e){
               return "";
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
