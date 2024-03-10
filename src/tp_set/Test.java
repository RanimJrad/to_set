package tp_set;

public class Test {
    public static void main(String[] args) {
    	
    	Entreprise entreprise = new Entreprise("orange");
      
        Departement dep1 = new Departement(1);
        Departement dep2 = new Departement(2);
        
        entreprise.ajoutDep(dep1);
        entreprise.ajoutDep(dep2);

        
        Employe emp1 = new Employe(1, "Ranim", 2000, 1);
        Employe emp2 = new Employe(2, "soumaya", 1800, 1);
        Employe emp3 = new Employe(3, "syrine", 500, 1);
        Employe emp4 = new Employe(4, "Sami", 1000, 2);
        Employe emp5 = new Employe(5, "Amal", 1200, 2);

       
        dep1.ajoutEmploye(emp1);
        dep1.ajoutEmploye(emp2);
        dep1.ajoutEmploye(emp3);
        
        dep2.ajoutEmploye(emp4);
        dep2.ajoutEmploye(emp5);

        
        dep1.afficheDep();
        
        entreprise.afficheE();

       
        int cin = 2;
        System.out.println("cin est " + cin + " existe dans le departement : " + dep1.existeE(cin));


        dep1.retirerEmploye(emp2);


        dep1.afficheDep();

        
        Employe empSalMax = dep1.getEmpSalMax();
        System.out.println("L'employe avec le salaire maximum dans le departement est : " + empSalMax.toString());
        
    }
}