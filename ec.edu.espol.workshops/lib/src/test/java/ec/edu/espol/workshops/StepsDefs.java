package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;

public class StepsDefs{
    
    private int actualAnswer;
    public CarInsurance carInsurance = new CarInsurance();
    
    //Scenario 1
    
    @Given("A male person with {int} years old")
    public void client_is(int age) {
        carInsurance.setAge_customer(age);
        carInsurance.setMarital_status("not married");
        carInsurance.setSex_customer("M");
    }
    
    @When("Calculate the insurance")
    public void calculate_insurance() {
        actualAnswer = carInsurance.totalCalc();
    }
    
    @Then("Show {int}")
    public void we_receive(int expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    //Scenario 2

    @Given("The customer age is {int}, its gender is {string} and its marital status is {string}")
    public void client_is_maleMarried(int age, String gender, String ms) {
        carInsurance.setAge_customer(age);
        carInsurance.setMarital_status(ms);
        carInsurance.setSex_customer(gender);
    }
    
    @When("Calculate the insurance2")
    public void calculate_insurance2() {
        actualAnswer = carInsurance.totalCalc();
    }
    
    @Then("Return {int}")
    public void receiveResult(int expectedValue) {
        assertEquals(expectedValue, actualAnswer);
    }
    
    //Scenario 3
    @Given("the customer age is {int}")
    public void client_is_old(int age) {
        carInsurance.setAge_customer(age);
        carInsurance.setMarital_status("married");
        carInsurance.setSex_customer("M");
    }
    
    @When("calculate the insurance3")
    public void calculate_insurance3() {
        actualAnswer = carInsurance.totalCalc();
    }
    
    @Then("return {int}")
    public void returnValue(int expectedValue) {
        assertEquals(expectedValue, actualAnswer);
    }
    
    

}