package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.CadastroMegaSena;

@WebServlet({ "/listar-apostas" })
public class ListarApostas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CadastroMegaSena cadastro = (CadastroMegaSena) getServletContext()
				.getAttribute("CadastroMegaSena");
		request.setAttribute("cadastro", cadastro);

		request.getRequestDispatcher("listar_apostas.jsp").forward(request,
				response);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * controllers.ListarApostas JD-Core Version: 0.6.2
 */