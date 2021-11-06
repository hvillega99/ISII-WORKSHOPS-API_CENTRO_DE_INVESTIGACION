package ec.edu.espol.workshops;

public class pruebax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CarInsurance tc_001 = new  CarInsurance();
        CarInsurance tc_002 = new  CarInsurance();
        CarInsurance tc_003 = new  CarInsurance();
        tc_001.setAge_customer(20);
        tc_001.setMarital_status("not married");
        tc_001.setSex_customer("M");
        tc_002.setAge_customer(81);
        tc_002.setMarital_status("married");
        tc_002.setSex_customer("F");
        tc_003.setAge_customer(36);
        tc_003.setMarital_status("not married");
        tc_003.setSex_customer("M");
        
        System.out.println("Test tc_001");
        System.out.println("Output : "+tc_001.totalCalc());
        if(tc_001.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        System.out.println("Test tc_002");
        System.out.println("Output : "+tc_002.totalCalc()); 
        if(tc_002.totalCalc()==-1) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
        System.out.println("Test tc_003");
        System.out.println("Output : "+tc_003.totalCalc());
        if(tc_003.totalCalc()==2000) {
            System.out.println("Status : Pass");
        }
        else {
            System.out.println("Status : Fail");
        }
    }

}
