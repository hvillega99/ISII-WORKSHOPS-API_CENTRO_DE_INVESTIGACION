package ec.edu.espol.workshops;

/**
* Car Insurance class.
*
*@author Carlos
*@version 1.0
*@since 2021-10-21
*/
public class CarInsurance {

	
	private int age_customer;
	private String sex_customer;
	private String marital_status;
	
	private static int BASE_PREMIUM = 500;
	private static int MALE_SINGLE = 1500;
	private static int OLDER_YOUNGER = 100;
	private static int FEMALE_MARRIED = 1500;

	public int getAge_customer() {
		return this.age_customer;
	}
	public String getSex_customer() {
		return this.sex_customer;
	}
	public String getMarital_status() {
		return this.marital_status;
	}
	public void setAge_customer(int age_customer) {
		this.age_customer = age_customer;
	}
	public void setSex_customer(String sex_customer) {
		this.sex_customer = sex_customer;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	
    
    /**
    * The totalCalc method makes the operation to get the
    * correct value of the insurance.
    * 
    * @return int Returns the value of the insurance or -1 in error
    */
    public int totalCalc() {

        int total = 0;

        if (this.age_customer > 80 || this.age_customer < 21) {
            return -1;
        }

        total = total + BASE_PREMIUM;

        if (this.sex_customer.equals("M") && this.marital_status.equals("not married")  && this.age_customer > 25) {
            total = total + MALE_SINGLE;
        } else if (this.sex_customer.equals("F")  || this.marital_status.equals("married") ) {
            total = total - FEMALE_MARRIED;
        } else if (this.age_customer >= 45 && this.age_customer < 65) {
            total = total - OLDER_YOUNGER;
        }
        return total;
    }

}
