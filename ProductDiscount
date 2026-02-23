public class ProductDiscount{
    public static double getFinalAmount(double amount,boolean isMember) {
        double discount = 0;
        
        if (amount >= 1000){
            if(isMember){
                discount = 0.20;
            }
            else{
                discount = 0.10;
            }
        }else {
            discount = 0;
        }
        
        return amount - (amount * discount);
    }
    public static void main (String[] args) {
        System.out.println(getFinalAmount(900,false));
        System.out.println(getFinalAmount(2000,true));
        System.out.println(getFinalAmount(2000,false));
    }
}
