package ec.edu.espol.workshops;

public class Testverification {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("***Test cases***");
        CarInsurance tc = new  CarInsurance();
        
        
        System.out.println("*Invalid cases*");
        
        ///////
        
        tc.setAge_customer(20);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_001");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///////
        
        tc.setAge_customer(81);
        tc.setSex_customer("F");
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
        
        tc.setAge_customer(21);
        tc.setSex_customer("X");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_003");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(30);
        tc.setSex_customer("01");
        tc.setMarital_status("married");
        
        System.out.println("Test tc_004");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(40);
        tc.setSex_customer("F");
        tc.setMarital_status("single");
        
        System.out.println("Test tc_005");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        
        System.out.println("*Valid cases (Prima calculation)*");
               
        ///
        
        tc.setAge_customer(21);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_006");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==2000) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ////
        
        tc.setAge_customer(24);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_007");
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
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_008");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==300) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ////
        
        tc.setAge_customer(80);
        tc.setSex_customer("M");
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
       
        tc.setAge_customer(38);
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
        
        tc.setAge_customer(45);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_011");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(55);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_012");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(64);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_013");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(25);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_014");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(37);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_015");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(44);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_016");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(65);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_017");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(72);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_018");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(80);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_019");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==500) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        
        System.out.println("*Valid cases (new requirements)*");
        
        ///
        
        tc.setAge_customer(31);
        tc.setSex_customer("F");
        tc.setMarital_status("married");
        
        System.out.println("Test tc_020");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(42);
        tc.setSex_customer("M");
        tc.setMarital_status("married");
        
        System.out.println("Test tc_021");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(59);
        tc.setSex_customer("F");
        tc.setMarital_status("married");
        
        System.out.println("Test tc_022");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(61);
        tc.setSex_customer("F");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_023");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==450) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(73);
        tc.setSex_customer("F");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_024");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==450) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
        
        tc.setAge_customer(80);
        tc.setSex_customer("F");
        tc.setMarital_status("not married");
        
        System.out.println("Test tc_025");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==450) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        
        ///
    }

}
