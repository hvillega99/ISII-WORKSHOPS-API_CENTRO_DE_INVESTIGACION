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
	
}
