package principal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calcular extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        double consumo = Double.parseDouble(request.getParameter("consumo"));
        ModelEnergia obj_energia = new ModelEnergia(consumo);
        obj_energia.calcularFornecimento(obj_energia.getConsumo());
        obj_energia.calcularIcms(obj_energia.getConsumo(), obj_energia.getFornecimento());
        obj_energia.calcularCofins(obj_energia.getConsumo(), obj_energia.getFornecimento());
        obj_energia.calcularPisPasep(obj_energia.getConsumo(), obj_energia.getFornecimento());
        obj_energia.calcularIcmsCofins(obj_energia.getConsumo(), obj_energia.getFornecimento());
        obj_energia.calcularIcmsPisPasep(obj_energia.getConsumo(), obj_energia.getFornecimento());
        obj_energia.calcularFatura(obj_energia.getFornecimento(), obj_energia.getIcms(), obj_energia.getCofins(), 
                obj_energia.getPispasep(), obj_energia.getIcmscofins(), obj_energia.getIcmspispasep());
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcular</title>");            
            out.println("</head>");
            out.println("<body bgcolor=orange>");
            out.println("<h2>Fornecimento:  " + obj_energia.getFornecimento() + "</h2>");
            out.println("<h2>ICMS:  " + obj_energia.getIcms() + "</h2>");
            out.println("<h2>COFINS:  " + obj_energia.getCofins() + "</h2>");
            out.println("<h2>PIS/PASEP:  " + obj_energia.getPispasep() + "</h2>");
            out.println("<h2>ICMS/COFINS:  " + obj_energia.getIcmscofins()+ "</h2>");
            out.println("<h2>ICMS/PIS/PASEP:  " + obj_energia.getIcmspispasep()+ "</h2>");
            out.println("<h2>FATURA:  " + obj_energia.getFatura()+ "</h2>");
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
