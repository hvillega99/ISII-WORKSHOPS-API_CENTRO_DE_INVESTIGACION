package ec.edu.espol.workshops;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BranchCoverageTest {
    final CarInsurance carInsurance;
    
    public BranchCoverageTest() {
        carInsurance = new CarInsurance();
    }
    
    @Test
    public void executeTest() {
        carInsurance.setAge_customer(44);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(500, this.carInsurance.totalCalc());
    }
}
