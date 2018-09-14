/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 766375
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("response", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        request.setAttribute("response", "---");
        
        String numerator = request.getParameter("numerator");
        request.setAttribute("numerator", numerator);
        
        String denominator = request.getParameter("denominator");
        request.setAttribute("denominator", denominator);
        
        String operation = request.getParameter("submit");
        
        try {
            int numeratorVal = Integer.parseInt(numerator);
            
            int denominatorVal = Integer.parseInt(denominator);
            
            request.setAttribute("response", calc(numeratorVal, denominatorVal, operation));
            
        } catch(NumberFormatException e) {
            request.setAttribute("response", "invalid");
           
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    private int calc(int numerator, int denominator, String operator) {
        switch(operator){
            case "+":
                return numerator + denominator;
            case "-":
                return numerator - denominator;
            case "*":
                return numerator * denominator;
            case "%":
                return numerator % denominator;
        }
        return 0;
    }
}
