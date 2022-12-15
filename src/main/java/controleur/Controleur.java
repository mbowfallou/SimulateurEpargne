package controleur;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.*;
import metier.*;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Traite traite = new Traite();
	private RequestDispatcher disp = null;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String lien = request.getParameter("lien");
    	
    	if (lien.equals("start")) 
    	{
			response.sendRedirect("entree.jsp");
		}
	}

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	//String texte = "";
    	String forme = request.getParameter("forme");
    	
    	if(forme.equals("forme1")) 
    	{    		
    		try {
    			int mpret = Integer.parseInt(request.getParameter("pret"));
    			int na = Integer.parseInt(request.getParameter("na"));
    			double tia = Double.parseDouble(request.getParameter("taux"));
    			
    			Pret pret = new Pret();
    			pret.setMpret(mpret);
    			pret.setNa(na);
    			pret.setTia(tia);
    			
    			pret = traite.calcul(pret); 
    			
    			request.setAttribute("pret", pret);
    			disp = request.getRequestDispatcher("sortie.jsp");
    			
    			disp.forward(request, response);
    			
    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    		}
    	}
	}

}
