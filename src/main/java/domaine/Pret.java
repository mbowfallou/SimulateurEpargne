package domaine;

import java.io.Serializable;

public class Pret implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int mpret; // Montant du prêt
	private double tia; // Taux d'Intêret Annuel
	private int na; // Nombre d'Année
	private double mmens; // Montant Mensuel
	private double mglobal; // Montant Global
	
	public Pret() {	}

	public int getMpret() {
		return mpret;
	}

	public void setMpret(int mpret) {
		this.mpret = mpret;
	}

	public double getTia() {
		return tia;
	}

	public void setTia(double tia) {
		this.tia = tia;
	}

	public int getNa() {
		return na;
	}

	public void setNa(int na) {
		this.na = na;
	}

	public double getMmens() {
		return mmens;
	}

	public void setMmens(double mmens) {
		this.mmens = mmens;
	}

	public double getMglobal() {
		return mglobal;
	}

	public void setMglobal(double mglobal) {
		this.mglobal = mglobal;
	}
	
	// Les 5 Diagrammes nécessaires dans UML : UseCase, Séquence, Classe, Composant et Déploiement	
}

