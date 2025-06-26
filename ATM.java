import java.util.Scanner;


class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Can't deposit ₹" + amount + ". Please enter a valid amount.");
            return;
        }
        balance += amount;
        System.out.println("₹" + amount + " added to your account successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter more than ₹0.");
        } else if (amount > balance) {
            System.out.println("Not enough balance! Try a smaller amount.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. Please collect your cash.");
        }
    }

    public void showBalance() {
        System.out.printf("Your current balance is: ₹%.2f\n", balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        BankAccount myAccount = new BankAccount("Daksh Saini", 5000.0);

        System.out.println("====== Welcome to Simple ATM ======");

        while (true) {
            System.out.println("\nPlease choose one option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine()); 
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (1-4).");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmt = sc.nextDouble();
                    sc.nextLine();
                    myAccount.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmt = sc.nextDouble();
                    sc.nextLine();
                    myAccount.withdraw(withdrawAmt);
                    break;

                case 3:
                    myAccount.showBalance();
                    break;

                case 4:
                    System.out.println("Thanks for using our ATM. Have a nice day!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select between 1 to 4.");
            }
        }
    }
}
