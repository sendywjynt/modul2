/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.tarifBBM;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sendy
 */
public class tarifServlet extends HttpServlet {

    @EJB
    private tarifBBM tarifBBM;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
            
        try {            
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-grid.css\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-grid.min.css\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-reboot.css\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-reboot.min.css\" />");
            out.println("<script href=\"js/bootstrap.bundle.js\" > </script>");
            out.println("<script href=\"js/bootstrap.bundle.min.js\" > </script>");
            out.println("<script href=\"js/bootstrap.js\" > </script>");
            out.println("<script href=\"js/bootstrap.min.js\" > </script>");
            out.println("</head>");
            out.println("<body class=\"container\" background-image : url(\"img/besar>");
            out.println("<nav class=\"navbar navbar-light bg-light\">\n" +
"  <a class=\"navbar-brand\" href=\"#\"><h1><center>TUGAS KEL17 TARIF BBM</h1></center></a>\n" +
"</nav>");
            //out.println("<h1><center>TUGAS KEL17 TARIF BBM</center></h1>");
            
            String tarif = request.getParameter("tarif");
            
            if ((tarif != null) && (tarif.length() > 0)) {
                double d = Double.parseDouble(tarif);
                if (request.getParameter("Tarif Pertamax") != null){
                    String cefa = tarifBBM.Tarif_Pertamax(d);
                    out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
" Bensin berhasil diisi silahkan bayar !\n" +
"</div>");
                    out.println("<p> TARIF BBM: Rp. "+cefa+"</p>");
                }  
                if (request.getParameter("Tarif Pertalite") != null) {
                    String cere = tarifBBM.Tarif_Pertalite(d);
                     out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
" Bensin berhasil diisi silahkan bayar !\n" +
"</div>");
                    out.println("<p> TARIF BBM: Rp. "+cere+ " .</p>");
                }
                if (request.getParameter("Tarif Dex") != null) {
                    String rece = tarifBBM.Tarif_Dex(d);
                     out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
" Bensin berhasil diisi silahkan bayar !\n" +
"</div>");
                    out.println("<p> TARIF BBM: Rp. " +rece+ " .</p>");
                }
                if (request.getParameter("Tarif Premium") != null) {
                    String refa = tarifBBM.Tarif_Premium(d);
                     out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
" Bensin berhasil diisi silahkan bayar !\n" +
"</div>");
                    out.println("<p> TARIF BBM: Rp. "+refa+ " .</p>");
                }
                if (request.getParameter("Tarif Bio Solar") != null) {
                    String face = tarifBBM.Tarif_BioSolar(d);
                     out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
" Bensin berhasil diisi silahkan bayar !\n" +
"</div>");
                    out.println("<p> TARIF BBM: Rp. "+face+ " .</p>");
                }                
              
            } else {
                out.println("<center>");
                out.println("<p>Masukan Liter:</p>");
                out.println("<form method=\"get\">");
                out.println("<p><input type=\"text\" name=\"tarif\" size=\"20\"></p>");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Tarif Pertamax\" class=\"btn btn-primary\" value=\"Tarif Pertamax\">"   +   "<input type=\"submit\" name=\"Tarif Pertalite\" class=\"btn btn-primary\" value=\"Tarif Pertalite\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Tarif Dex\" class=\"btn btn-primary\" value=\"Tarif Dex\">"   +   "<input type=\"submit\" name=\"Tarif Premium\" class=\"btn btn-primary\" value=\"Tarif Premium\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Tarif Bio Solar\" class=\"btn btn-primary\" value=\"Tarif Bio Solar\">");
                
                
                out.println("</center>");
                out.println("</form>");
            }
        
        } finally {
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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
