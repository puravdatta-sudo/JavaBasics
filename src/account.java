import java.util.ArrayList;
import java.util.Iterator;
import java.util.OptionalDouble;

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
    ArrayList<Double> moneyMovement = new ArrayList<Double>();
    double startingMoney = 100.0;
    double currentMoney=startingMoney;
    String randostring = "string";



    public account() {

    }

    public double getCurMoney(){ //retrieve current money

        return this.currentMoney;

    }
    public void addMoney(double money){ //adding money to account
        currentMoney=this.currentMoney+money;
        moneyMovement.add(money);

    }
    public void subMoney(double money){ //taking out money from the account
    currentMoney=this.currentMoney+money;

    }
    public double currentTrend(){ //give an average trend of the account
        OptionalDouble trend = moneyMovement.stream().mapToDouble(a->a).average();

        return trend.isPresent() ? trend.getAsDouble() : 0;
    }
    public void applyInterest(){ //adds interest and returns the interest totals

    }
    public double getPreviousTransaction() { //get the last transaction made on the account
        double lastNeg = 0;
        for (Double aDouble : moneyMovement) {
            if (aDouble < 0) {
                lastNeg = aDouble;
            }
        }
        return lastNeg;
    }


    public double getPreviousDeposit(){ //get the last deposit made on the account
            double lastPos = 0;
            for (Double aDouble : moneyMovement) {
                if (aDouble < 0) {
                    lastPos = aDouble;
                }
            }

            return lastPos;
    }
    public void getBankingHistory(){ //get a list of all the movement and format it nicely
        //Iterator<Double> it = moneyMovement.iterator();
        moneyMovement.forEach(System.out::println);

    }

}
