public class CarLoan {
        public static void main(String[] args) {
            int carLoan = 10000, loanLenght = 3, interestRate = 5, downPayment = 2000;
            if (loanLenght <= 0 || interestRate <= 0) {
                System.out.println("Error! You must take out a valid car loan");
            }
            else if(downPayment >= carLoan) {
                System.out.println("The car can be paid in full");
            }
            else if (loanLenght > 0 || interestRate > 0 || downPayment < carLoan) {
                double P = 8000; // principal amount
                double r = 0.05/12; // monthly interest rate
                int n = 36; // number of months

                double monthlyPayment = (P*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);

                System.out.println("Monthly payment: $" + monthlyPayment);
            }
        }
    }
    
