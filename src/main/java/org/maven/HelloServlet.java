package org.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // Very simple - just return some plain text
        //PrintWriter writer = response.getWriter();
        //writer.print("H3G WORLD");
        //writer.print("This Deployment happened through CI/CD using DevOps Tools");
        System.out.println("Yeshwanth here");;
        PrintWriter out = response.getWriter();
              try {
                      out.println("<!DOCTYPE html>");
                      out.println("<html><head>");
                      out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                      out.println("<title>H3G World</title></head>");
                      out.println("<body>");
                      out.println("<h1>H3G World</h1>");
                      out.println("<h2>This Deployment happened through CI/CD using DevOps Tools</h2>");

                      out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
                      out.println("<p>Protocol: " + request.getProtocol() + "</p>");
                      out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
                      out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");

                      out.println("</body>");
                      out.println("</html>");
                  }
              finally {
                      out.close();  // Always close the output writer
                      }

    }
}
