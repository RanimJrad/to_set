package tp_set;

import java.util.Objects;

public class Employe implements Comparable<Employe> {
	
	private int cin;
	private String nom;
	private double sal;
	private int dep;
	
	public Employe(int cin, String nom, double sal, int dep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.sal = sal;
		this.dep = dep;
	}
	
	
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDep() {
		return dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}


	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", nom=" + nom + ", sal=" + sal + ", dep=" + dep + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return cin == other.cin;
	}


	@Override
	public int compareTo(Employe E) {
		if(this.getSal()>E.getSal()) {
			return -1;
		}
		if(this.getSal()<E.getSal()) {
			return 1;
		}
		return 0;
	}
	
	

}
