package pruebas;
import ec.edu.espol.workshops.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
    final CarInsurance carInsurance;

    public StatementCoverageTest() {
        carInsurance = new CarInsurance();
    }

    @Test
    public void executeTest() {
    carInsurance.setAge_customer(24);
        carInsurance.setSex_customer("M");
        carInsurance.setMarital_status("not married");
        assertEquals(500, this.carInsurance.totalCalc());
    }
}
