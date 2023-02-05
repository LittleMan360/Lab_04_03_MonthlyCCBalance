public class MonthlyCCBalance
{
    public static void main(String[] args)
    {

        double cCBalance = 5000;
        double interestRate = .17;
        double interestDueM1;
        double interestDueM2;



        interestDueM1 = cCBalance * interestRate;
        cCBalance = cCBalance + interestDueM1;
        interestDueM2 = (cCBalance * interestRate);

        System.out.printf("Your credit card interest due month one is $%,.2f", + interestDueM1);
        System.out.printf(" Month two interest due is $%,.2f", + interestDueM2);
    }

}