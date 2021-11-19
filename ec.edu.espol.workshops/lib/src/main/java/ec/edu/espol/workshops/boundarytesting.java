package ec.edu.espol.workshops;

public class boundarytesting {
    public static void main(String[] args) {
       
 // TODO Auto-generated method stub
    System.out.println("First Plan- Age customer");
    CarInsurance tc = new  CarInsurance();
   
    
    ///////
    tc.setAge_customer(21);
    tc.setSex_customer("M");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_001");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==500) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    ///////
    tc.setAge_customer(20);
    tc.setSex_customer("M");
    tc.setMarital_status("not married");
    
    
   
    System.out.println("Test tc_002");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    //////
    
    tc.setAge_customer(40);
    tc.setSex_customer("F");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_003");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==300) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    
    tc.setAge_customer(80);
    tc.setSex_customer("F");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_004");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==300) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    
    
    tc.setAge_customer(81);
    tc.setSex_customer("F");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_005");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    
    ///
    System.out.println("Second Plan- Gender customer");
    ///
    tc.setAge_customer(21);
    tc.setSex_customer("X");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_006");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    tc.setAge_customer(30);
    tc.setSex_customer("01");
    tc.setMarital_status("married");
    
   
    System.out.println("Test tc_007");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    tc.setAge_customer(36);
    tc.setSex_customer("M");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_008");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==2000) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    tc.setAge_customer(40);
    tc.setSex_customer("F");
    tc.setMarital_status("married");
    
    System.out.println("Test tc_009");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==300) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    
    ///
    System.out.println("Third Plan - Married status customer");
    tc.setAge_customer(40);
    tc.setSex_customer("F");
    tc.setMarital_status("not married");
    
    System.out.println("Test tc_010");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==300) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    tc.setAge_customer(40);
    tc.setSex_customer("F");
    tc.setMarital_status("married");
    
    System.out.println("Test tc_011");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==300) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    
    tc.setAge_customer(40);
    tc.setSex_customer("F");
    tc.setMarital_status("single");
    
    System.out.println("Test tc_012");
    System.out.println("Output : "+tc.totalCalc());
    
    if(tc.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
   
    
    
   
    
    }
}