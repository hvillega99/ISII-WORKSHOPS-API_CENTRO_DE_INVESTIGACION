package pruebas;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ec.edu.espol.workshops.*;

public class BranchCoverageTest {

    final CarInsurance carInsurance;
    
    public BranchCoverageTest() {
        carInsurance = new CarInsurance();
    }
    
    @Test
    public void executeTest() {
        
        carInsurance.setAge_customer(24);
        carInsurance.setSex_customer("F");
        carInsurance.setMarital_status("married");
        assertEquals(300, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(30);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(300, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(18);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(-1, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(23);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("married");
        assertEquals(500, this.carInsurance.totalCalc());
        
    }
    
}
