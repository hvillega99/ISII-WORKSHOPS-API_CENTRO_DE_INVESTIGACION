package ec.edu.espol.workshops;

public class PathCoverageTest {
    public static void main(String[] args) {
        
        System.out.println("Path Coverage Test");
        CarInsurance tc = new  CarInsurance();
       
        
        ///////
        tc.setAge_customer(28);
        tc.setSex_customer("M");
        tc.setMarital_status("not married");
        
        System.out.println("Test pcdv1");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==2000) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        ///////
        tc.setAge_customer(18);
        tc.setSex_customer("F");
        tc.setMarital_status("married");
        
        
       
        System.out.println("Test pcdv2");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        //////
        
        tc.setAge_customer(30);
        tc.setSex_customer("F");
        tc.setMarital_status("married");
        
        System.out.println("Test pcdv3");
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
        tc.setMarital_status("married");
        
        System.out.println("Test pcdv4");
        System.out.println("Output : "+tc.totalCalc());
        
        if(tc.totalCalc()==400) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
    }
}