/*
Basic Java:
System.out.println(); this is a command line print statement.
Scanner.next() lets you take the user input after your last print statement
EX:
                System.out.println("Enter something");
                String entry = scanner.next();
                System.out.println(entry);
*/
public class account {

    int arraySize = 3000;
    double[] moneyMovement = new double[arraySize];
    double startingMoney = 100.0;
    double currentMoney=startingMoney;

    public account() {

    }

    public double getCurMoney(){ //retrieve current money

        return this.currentMoney;

    }
    public void addMoney(double money){ //adding money to account
        currentMoney=this.currentMoney+money;

    }
    public void withdrawMoney(double money){ //taking out money from the account


    }
    public void currentTrend(){ //give an average trend of the account

    }
    public void applyInterest(){ //adds interest and returns the interest totals

    }
    public void getPreviousTransaction(){ //get the last transaction made on the account

    }
    public void getPreviousDeposit(){ //get the last deposit made on the account

    }
    public void getBankingHistory(){ //get a list of all the movement and format it nicely

    }

}
