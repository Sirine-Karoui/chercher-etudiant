package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Etudiant;
import metier.EtudiantImpl;
@WebServlet("/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtudiantImpl etudiantmetier;
	public void init() throws ServletException {
		etudiantmetier = new EtudiantImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom_chercher=request.getParameter("nomchercher");
		EtudiantModele e_modele = new EtudiantModele();
				((EtudiantModele) e_modele).setMot(nom_chercher);
				List <Etudiant> etuds=etudiantmetier.Chercher_Etudiant(nom_chercher);
				((EtudiantModele) e_modele).setEtudiants(etuds);
				request.setAttribute("modele", e_modele);
				request.getRequestDispatcher("EtudiantsVue.jsp").forward(request, response);
	}

}
