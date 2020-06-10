import java.util.Scanner;

public class Main {
    public static void main (String[] args) { //Basic Initialization
        //Lets make a basic Banking app through command line
        account account = new account();
        Scanner scanner = new Scanner(System.in);
    while(true) {

      System.out.println("Enter Command"); // taking input from user
      String entry = scanner.next();

      if (entry.equals("curMoney")) {
        System.out.println("Current Money: " + account.getCurMoney()); // printing current balance
      }

      if (entry.equals("addMoney")) {
        System.out.println("How Much?");
            double numMoney = Double.parseDouble(moneytoadd);
                account.addMoney(numMoney);
            }
        System.out.println("Current Money: " + account.getCurMoney()); // printing current balance
      }

    }

    }

}
