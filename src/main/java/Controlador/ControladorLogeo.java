package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorLogeo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControladorLogeo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		//validar datos
		
		
		//redireccionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response); ;		
	}
}
