package com.abhi;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        int k = (int)req.getAttribute("k");
//        int k = Integer.parseInt(req.getParameter("k"));

        HttpSession session = req.getSession();
        int k = (int)session.getAttribute("k");
        k =k*k;
        PrintWriter out = res.getWriter();
        out.println("Square is: " + k);
    }
}
