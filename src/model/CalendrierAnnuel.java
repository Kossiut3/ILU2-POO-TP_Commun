package model;

public class CalendrierAnnuel {

	Mois[] calendrier = new Mois[12];

	public CalendrierAnnuel() {
		String[] mois_nom = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Decembre" };
		int[] mois_long = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		for (int i=0; i<12;i++) {
			Mois mois = new Mois(mois_nom[i],mois_long[i]);
			calendrier[i] = mois;
		}
	}
		
		
		
		public boolean estLibre(int jour, int mois) {
			// TODO
			return true ;
		}
		
		public boolean reserver(int jour, int mois) {
			//TODO
			return true;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static class Mois {
		private static final Exception IllegalStateException = null;
		String nom;
		boolean[] jours;

		public Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}

		private boolean estlibre(int jour) {
			return !jours[jour-1];
		}

		private void reserver(int jour)  {
			if (!estlibre(jour))
				throw new  IllegalStateException("Le jour est reservé");
			else
				jours[jour] = true;

		}

	}
}
