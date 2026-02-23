public class LoanApproval{
    public static String loanDecision(int age,int salary,int creditScore){
        if (age>=21){
            if (salary >= 25000){
                if(creditScore >= 700){
                    return "Approved";
                } 
                else{
                    return "Low Credit Score";
                }
            }
            else{
                return "Low salary";
            }
        }
        else{
            return "Less Age";
        }
    }
    public static void main (String[] args) {
        System.out.println(loanDecision(24,26000,750));
    }
}
