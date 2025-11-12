import java.util.*;

class Account {
    String name, type;
    int accNo;
    double balance;

    Account(String n, int no, String t, double b) {
        name = n; accNo = no; type = t; balance = b;
    }

    void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    void display() {
        System.out.println(type + " Account [" + accNo + "] - Balance: $" + balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance!");
    }
}

class SavAcct extends Account {
    double rate = 0.04; 
    SavAcct(String n, int no, double b) { super(n, no, "Savings", b); }

    void addInterest() {
        balance += balance * rate;
    }
}

class CurAcct extends Account {
    final double MIN = 500, PENALTY = 50;
    CurAcct(String n, int no, double b) { super(n, no, "Current", b); }
    void withdraw(double amt) {
        super.withdraw(amt);
        if (balance < MIN) {
            balance -= PENALTY;
            System.out.println("Below min balance! Penalty of $" + PENALTY + " applied.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavAcct s = new SavAcct("Alice", 101, 2000);
        CurAcct c = new CurAcct("Bob", 202, 800);
        System.out.print("Enter the amount to be deposited: ");
        double dep_amt=sc.nextDouble();
        s.deposit(dep_amt);
        s.addInterest();
        System.out.print("Enter the amount to withdraw: ");
        double with_amt=sc.nextDouble();
        s.withdraw(with_amt);
        s.display();

        c.withdraw(400);
        c.withdraw(200);
        c.display();
        sc.close();
    }
}