package Principal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Salario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        double salarioBruto = Double.parseDouble(request.getParameter("salBruto"));
        ModelSalario obj_salario = new ModelSalario(salarioBruto);
        double fgts = obj_salario.calcularFgts(obj_salario.getSalBruto());
        double inss = obj_salario.calcularInss(obj_salario.getSalBruto());
        double ir = obj_salario.calcularIr(obj_salario.getSalBruto());
        double salarioLiquido = obj_salario.calcularSalarioLiquido(obj_salario.getSalBruto(), inss, ir);
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salario</title>"); 
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculo do Salario Liquido</h1>");
            out.println("<h2>Salario Bruto:  " + obj_salario.getSalBruto() + "</h2>");
            out.println("<h2>Fgts " + fgts + "</h2>");
            out.println("<h2>Inss " + inss + "</h2>");
            out.println("<h2>Imposto de Renda: " + ir + "</h2>");
            out.println("<h2>Salario Liquido: " + salarioLiquido + "</h2>");
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
