package metier;
import domaine.*;

public class Traite 
{
	public Pret calcul(Pret pret)
	{
		/* Valeurs reçues */
		int mpret = pret.getMpret();
		double tia = pret.getTia();
		int na = pret.getNa();
		
		/* Valeurs Calculées */		
		double tim = tia / 1200;
		double mmens = (mpret * tim ) / (1 - (1 / (Math.pow(1+tim, 12*na))));
		double mglobal = 12 * na * mmens;
		
		/* Valeurs Retournées ou Chargées */
		pret.setMmens(mmens);
		pret.setMglobal(mglobal);
		
		return pret;
	}
}
