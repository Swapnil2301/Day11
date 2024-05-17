import java.util.Scanner;

class credit{
    public double amount ;
    public double input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the primary amount in your account ");
        double amount = sc.nextDouble();
        this.amount = amount;
        return amount;

    }
    public void debit() {
        while (true) {
            System.out.println("enter the amount you want to withdraw : ");
            Scanner sc = new Scanner(System.in);
            int withdraw = sc.nextInt();
            if (withdraw <= amount) {
                amount = amount - withdraw;
                System.out.println("your current balance is " + amount);
            } else if (withdraw>amount) {
                System.out.println(withdraw + " amount is exceeding the current balance in your account " + amount);
            }
            if(amount==0){
                System.out.println("zero balance account please enter some money");
                input();
                System.out.println("your current balance is "+amount );
            }

        }
    }

}
public class Account {
    public static void main(String[] args) {
        credit sc = new credit();
        sc.input();
        sc.debit();



    }
}