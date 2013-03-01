package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.CadastroMegaSena;
import apostas.Aposta;
import exceptions.ApostaNaoEncontradaException;

@WebServlet({ "/detalhar-aposta" })
public class DetalharAposta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CadastroMegaSena cadastro = (CadastroMegaSena) getServletContext()
				.getAttribute("CadastroMegaSena");
		request.setAttribute("cadastro", cadastro);
		try {
			Aposta aposta = cadastro.obterAposta(Integer.parseInt(request
					.getParameter("id")));
			request.setAttribute("aposta", aposta);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ApostaNaoEncontradaException e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("detalhar_aposta.jsp").forward(request,
				response);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * controllers.DetalharAposta JD-Core Version: 0.6.2
 */