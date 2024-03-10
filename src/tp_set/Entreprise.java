package tp_set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Entreprise {

	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;

	public Entreprise(String nomEntreprise) {

		this.nomEntreprise = nomEntreprise;
		Liste_Deps = new HashMap<>();
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public void ajoutDep(Departement d) {
		Liste_Deps.put(d.getIdDep(), d);
	}

	public void retirerDep(Departement d) {
		Liste_Deps.remove(d.getIdDep());

	}

	public void afficheE() {
		Set <Entry<Integer,Departement>> s =Liste_Deps.entrySet();
		for(Entry<Integer,Departement> e :s) {
			System.out.println(e.getKey()+ " : " + e.getValue() );
		}
		

	}

	public void UpdateDep(Employe E, int idDep) {
	    Collection<Departement> l = Liste_Deps.values();
	    for (Departement d : l) {
	        if (d.existeE(E.getCin())) {
	            Departement depcurrent = d;
	            if (depcurrent != null) {
	                depcurrent.retirerEmploye(E);
	                Departement newDep = Liste_Deps.get(idDep);
	                if (newDep != null) {
	                    newDep.ajoutEmploye(E);
	                }
	            }
	            break;
	        }
	    }
	}
                
	public boolean existeD(Departement d) {		
		return Liste_Deps.containsValue(d);
	}
	
	public void DepMinCapacity() {
	    TreeMap<Integer, Departement> t = new TreeMap<>(Liste_Deps);
	    Map.Entry<Integer, Departement> entry = t.firstEntry();
	    if (entry != null) {
	        System.out.println("le min capacity = " + entry.getKey() + " : " + entry.getValue());
	    }
	}

}
