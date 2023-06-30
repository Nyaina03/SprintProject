package etu001956.framework.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getMethod().equals("GET")) {
            // Gérer la requête GET
            // Exemple : Rediriger la requête vers une page JSP pour l'affichage
            request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
        } else if (request.getMethod().equals("POST")) {
            // Gérer la requête POST
            // Exemple : Traiter les données du formulaire et effectuer les actions nécessaires
            String username = request.getParameter("username");
            String message = "Bonjour, " + username + "!";

            request.setAttribute("message", message);
            request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
        }
    }
}

