package konta.bai2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simpleCal", value = "/simple-calculator")
public class Bai2 extends HttpServlet {


    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        double result = 0;

        String operator = request.getParameter("operator");
        if (operator.equals("addition")) {
            operator = "+";
            result = firstOperand + secondOperand;
        }else if (operator.equals("subtraction")) {
            operator = "-";
            result = firstOperand - secondOperand;
        }else if (operator.equals("multiplication")) {
            operator = "*";
            result = firstOperand * secondOperand;
        }else if (operator.equals("division")) {
            operator = "/";
            if (secondOperand == 0){
                operator = "Can't divide by zero";
            }else {
                result = firstOperand / secondOperand;
            }
        }

        request.setAttribute("firstOperand", firstOperand);
        request.setAttribute("secondOperand", secondOperand);
        request.setAttribute("operator", operator);
        request.setAttribute("result", result);

        request.getRequestDispatcher("Result.jsp").forward(request,response);
    }

    public void destroy() {
    }
}