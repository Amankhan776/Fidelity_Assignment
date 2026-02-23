public class SmartBilling{
    public static double calculateBill(double amount, boolean isFirstOrder){
        double discount = 0;
        if (amount < 500){
            discount= 0;
        }
        else if (amount >= 500 && amount <1500){
            discount = 0.05;
        }
        else if (amount >= 1500){
            discount = 0.10;
        }
        double finalAmount = amount -(amount * discount);
        if (isFirstOrder){
            finalAmount = finalAmount - (finalAmount * 0.02);
        }
        
        return finalAmount;
    }
    public static void main (String[] args) {
        System.out.println(calculateBill(1000,false));
        System.out.println(calculateBill(2000,true));
    }
}
