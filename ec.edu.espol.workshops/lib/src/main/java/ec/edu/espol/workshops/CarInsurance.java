package ec.edu.espol.workshops;

public class CarInsurance {
	
	private int age_customer;
	private String sex_customer;
	private String marital_status;
	
	private final int BASE_PREMIUM = 500;
	private final int MALE_SINGLE = 1500;
	private final int FEMALE_MARRIED = 200;
	private final int OLDER_YOUNGER = 100;

	public int getAge_customer() {
		return this.age_customer;
	}
	public string getSex_customer() {
		return this.sex_customer;
	}
	public string getMarital_status() {
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
	
	
	public int totalCalc() {
		
		int total = 0;
		
		if(this.age_customer > 80 || this.age_customer < 21) {
			return -1;
		}
		
		total = total + BASE_PREMIUM;
		
		if(this.sex_customer = "M" && this.marital_status = "not married" && this.age_customer > 25) {
			total = total + MALE_SINGLE;
		}
		else if(this.sex_customer = "F" || this.marital_status = "married") {
			total = total - FEMALE_MARRIED;
		}
		else if(this.age_customer >= 45 && this.age_customer < 65) {
			total = total - OLDER_YOUNGER;
		}
		
	}
	
	
}
