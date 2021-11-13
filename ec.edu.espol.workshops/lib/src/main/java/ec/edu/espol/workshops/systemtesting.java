package ec.edu.espol.workshops;

public class systemtesting {
    public static void main(String[] args) {
       
 // TODO Auto-generated method stub
    System.out.println("First Plan");
    CarInsurance tc_001 = new  CarInsurance();
    CarInsurance tc_002 = new  CarInsurance();
    CarInsurance tc_003 = new  CarInsurance();
    ///////
    tc_001.setAge_customer(21);
    tc_001.setSex_customer("M");
    tc_001.setMarital_status("not married");
    
    System.out.println("Test tc_001");
    System.out.println("Output : "+tc_001.totalCalc());
    
    if(tc_001.totalCalc()==500) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    ///////
    tc_002.setAge_customer(19);
    tc_002.setSex_customer("M");
    tc_002.setMarital_status("not married");
    
    
   
    System.out.println("Test tc_002");
    System.out.println("Output : "+tc_002.totalCalc());
    
    if(tc_002.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    //////
    
    tc_003.setAge_customer(40);
    tc_003.setSex_customer("F");
    tc_003.setMarital_status("not married");
    
    System.out.println("Test tc_003");
    System.out.println("Output : "+tc_003.totalCalc());
    
    if(tc_003.totalCalc()==500) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    System.out.println("Second Plan");
    CarInsurance tc_004 = new  CarInsurance();
    CarInsurance tc_005 = new  CarInsurance();
    CarInsurance tc_006 = new  CarInsurance();
    ///
    tc_004.setAge_customer(21);
    tc_004.setSex_customer("X");
    tc_004.setMarital_status("not married");
    
    System.out.println("Test tc_004");
    System.out.println("Output : "+tc_004.totalCalc());
    
    if(tc_004.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    tc_005.setAge_customer(30);
    tc_005.setSex_customer("01");
    tc_005.setMarital_status("married");
    
   
    System.out.println("Test tc_005");
    System.out.println("Output : "+tc_005.totalCalc());
    
    if(tc_005.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    tc_006.setAge_customer(36);
    tc_006.setSex_customer("M");
    tc_006.setMarital_status("not married");
    
    System.out.println("Test tc_006");
    System.out.println("Output : "+tc_006.totalCalc());
    
    if(tc_006.totalCalc()==2000) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ////
    System.out.println("Third Plan");
    CarInsurance tc_007 = new  CarInsurance();
    CarInsurance tc_008 = new  CarInsurance();
    tc_007.setAge_customer(40);
    tc_007.setSex_customer("F");
    tc_007.setMarital_status("not married");
    
    System.out.println("Test tc_007");
    System.out.println("Output : "+tc_007.totalCalc());
    
    if(tc_007.totalCalc()==500) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    tc_008.setAge_customer(40);
    tc_008.setSex_customer("F");
    tc_008.setMarital_status("single");
    
    System.out.println("Test tc_008");
    System.out.println("Output : "+tc_008.totalCalc());
    
    if(tc_008.totalCalc()==-1) {
        System.out.println("Status : Pass");
    }
    else {
        System.out.println("Status : Fail");
    }
    
    ///
    
    
   
    
    
   
    
    }
}
