import java.util.Scanner;

public class financialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose A Calculator: ");
        System.out.println("Mortgage Calculator (A) \n" + "Future Value Calculator (B) \n" + "Annuity Calculator (C)" );
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("a")){
            System.out.println("Welcome To The Mortgage Calculator! \n");
            System.out.println("Enter The Principal Amount. ");
            double principalAmount = scanner.nextDouble();
            System.out.println("Enter The Annual Interest Rate. ");
            float annualInterest = scanner.nextFloat();
            System.out.println("Enter The Loan Term In Years. ");
            int loanLength = scanner.nextInt();
            //M = P[r(1+r)^n] / [(1+r)^n-1] Accept the principal (P), interest rate (r), and loan length (n) from the user as input.
            float monthlyInterestRate = annualInterest / 12 / 100;
            int numberOfPayments = loanLength * 12;
            double monthlyPayment = principalAmount * (monthlyInterestRate * (Math.pow(1+monthlyInterestRate, numberOfPayments))) /
                    (Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
            double totalInterest = (monthlyPayment * numberOfPayments) - principalAmount;
            System.out.println("A $" + principalAmount + " loan at " + annualInterest + "% for " + loanLength + " years would have a $" + monthlyPayment + "/month payment with a total interest of $" + totalInterest );


        }
        if(userInput.equalsIgnoreCase("b")) {
            System.out.println("Welcome To The Future Value Calculator. \n");
            System.out.println("Enter The Initial Deposit. ");
            double deposit = scanner.nextDouble();
            System.out.println("Enter The Annual Interest Rate. ");
            float annualInterest = scanner.nextFloat();
            System.out.println("Enter The Number Of Years. ");
            int numberOfYears = scanner.nextInt();
            float dailyInterest = annualInterest / 365;
            //FV = P(1 + r/n)^(n*t)
            double futureValue = deposit * Math.pow(1 + annualInterest / 365, 365 * numberOfYears);
            double totalInterest = futureValue - deposit;
            System.out.println("Your CD's future value will be $" + futureValue + " and you would have earned $" + totalInterest + " in interest. ");
        }
            if(userInput.equalsIgnoreCase("c")){
                System.out.println("Welcome to the Annuity Calculator. \n");
                System.out.println("Enter The Monthly Payout Amount. ");
                double pmt = scanner.nextDouble();
                System.out.println("Enter The Expected Annual Interest Rate");
                float expectedInterest = scanner.nextFloat();
                System.out.println("Enter The Number Of Years To Payout. ");
                int payoutYears = scanner.nextInt();
                //PV = PMT × [(1 - (1 + r)^(-n)) / r]  PV is the present value of the annuity.
                //    PMT is the monthly payout amount.
                //    r is the monthly interest rate (annual interest rate divided by 12 and then divided by 100 to convert to a decimal).
                //    n is the total number of monthly payments (number of years to pay out multiplied by 12).
                float monthlyInterest = expectedInterest / 12 / 100;
                int monthlyPayments = payoutYears * 12;
                double presentValue = pmt * (1- Math.pow(1+monthlyInterest, -monthlyPayments)) / (monthlyInterest);
                System.out.println("To fund an annuity that pays $" + pmt + " for " + payoutYears + " years and earns an expected " + expectedInterest + "% in interest you would need to invest $" + presentValue + " .");
            }




        }



    }

