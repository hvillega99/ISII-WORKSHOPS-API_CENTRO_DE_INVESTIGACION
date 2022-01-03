package ec.edu.espol.workshops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PathCoverageTest {
    final CarInsurance carInsurance;
    
    public PathCoverageTest() {
        carInsurance = new CarInsurance();
    }
    
    @Test
    public void executeTest() {
        carInsurance.setAge_customer(44);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(500, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(18);
        carInsurance.setSex_customer("F");
        carInsurance.setMarital_status("married");
        assertEquals(-1, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(26);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(2000, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(30);
        carInsurance.setSex_customer("F");
        carInsurance.setMarital_status("married");
        assertEquals(300, this.carInsurance.totalCalc());
        
        carInsurance.setAge_customer(46);
        carInsurance.setSex_customer("F");
        carInsurance.setMarital_status("not married");
        assertEquals(400, this.carInsurance.totalCalc());
    }
       
    
}