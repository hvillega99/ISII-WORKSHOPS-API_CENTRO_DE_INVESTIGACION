package pruebas;

public class pruebax {

    public static void main(String[] args) {
        StatementCoverageTest scTest = new StatementCoverageTest();
        
        System.out.println("Ejecuntando casos de pruebas de Statement Coverage");
        scTest.executeTest();
        System.out.println("Statement Coverage passed");
        
        
        System.out.println("-----------------------");
        
        
        System.out.println("Tests pasados");
    }

}
