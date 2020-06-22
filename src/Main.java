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
        String moneytoadd = scanner.next();

        try{

            double numMoney = Double.parseDouble(moneytoadd);

            if(numMoney>0){
                account.addMoney(Math.abs(numMoney));
                //account.moneyMovement.add(numMoney);
            }
            else {
                System.out.println("Number is Negative!");
            }

        }
        catch (Exception e){
            System.out.println("Please enter a numeric value");
        }

        System.out.println("Current Money: " + account.getCurMoney()); // printing current balance
      }

      if (entry.equals("subMoney")) {
            System.out.println("How Much?");
            String moneytosub = scanner.next();

            try{

                double numMoney = Double.parseDouble(moneytosub);

                if(numMoney<0){
                    account.subMoney(Math.abs(numMoney));
                    account.moneyMovement.add(numMoney);
                }
                else {
                    System.out.println("Number is positive!");
                }

            }
            catch (Exception e){
                System.out.println("Please enter a numeric value");
            }

            System.out.println("Current Money: " + account.getCurMoney()); // printing current balance
        }

      if(entry.equals("curTrend")){
        double trend = account.currentTrend();
        System.out.println("The average movement in the account is: "+trend);
      }

      if(entry.equals("getHistory")){
          account.getBankingHistory();
      }

      if (entry.equals("getLastTransaction")){
          System.out.println("Last Transaction is: "+account.getPreviousTransaction());
      }

      if (entry.equals("getLastDeposit")){
          System.out.println("Last Deposit is: "+account.getPreviousDeposit());
      }


    }

    }

}
