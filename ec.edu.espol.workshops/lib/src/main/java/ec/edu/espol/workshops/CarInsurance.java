package ec.edu.espol.workshops;

/**
* Car Insurance class.
*
*@author Carlos
*@version 1.0
*@since 2021-10-21
*/
public class CarInsurance {

	
	private int agecustomer;
	private String sexcustomer;
	private String maritalstatus;
	
	private final static int basepremium = 500;
    private final static int malesingle = 1500;
    private final static int femalemarried = 200;
    private final static int olderyounger = 100;

	public int getAge_customer() {
		return this.agecustomer;
	}
	public String getSex_customer() {
		return this.sexcustomer;
	}
	public String getMarital_status() {
		return this.maritalstatus;
	}
	public void setAge_customer(int age_customer) {
		this.agecustomer = age_customer;
	}
	public void setSex_customer(String sex_customer) {
		this.sexcustomer = sex_customer;
	}
	public void setMarital_status(String marital_status) {
		this.maritalstatus = marital_status;
	}
	
    
    /**
    * The totalCalc method makes the operation to get the
    * correct value of the insurance.
    * 
    * @return int Returns the value of the insurance or -1 in error
    */
	public int totalCalc() {

        int total = 0;

        if (this.agecustomer > 80 || this.agecustomer < 21) {
            return -1;
        }
        
        if (!this.sexcustomer.equals("M") && !this.sexcustomer.equals("F")){
            return -1;
        }

        if (!this.maritalstatus.equals("married") && !this.maritalstatus.equals("not married")){
            return -1;
        }

        total = total + basepremium;

        if (this.sexcustomer.equals("M") && this.maritalstatus.equals("not married")  && this.agecustomer < 25) {
            total = total + malesingle;
        } else if(this.maritalstatus.equals("not married") && this.sexcustomer.equals("F") && this.agecustomer > 60) {
            total = total - 50;
        } else if (this.maritalstatus.equals("married") && this.agecustomer > 30 && this.agecustomer < 60) {
            total = total - 100;
        } else if (this.sexcustomer.equals("F") || this.maritalstatus.equals("married") ) {
            total = total - femalemarried;
        } else if (this.agecustomer >= 45 && this.agecustomer < 65) {
            total = total - olderyounger;
        } 
        return total;
    }

}
