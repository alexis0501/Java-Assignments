import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil{
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int weeks){
        int sum = 0;
        for (int i = 1; i < (weeks + 1); i++){
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(double price: prices){
        total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu){
        for(int i = 0; i<menu.size(); i++){
            System.out.printf("%s", menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s,", userName);
        System.out.printf("there are %s in front of you \n", customers.size());
        customers.add(userName);
    }





}