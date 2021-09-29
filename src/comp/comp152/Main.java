package comp.comp152;

import Customer.Customer;
import Order.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object Customer;
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;

    public static void main(String[] args){
        public void runStore(){
            var inputReader = new Scanner(System.in);
            while(true){
                var userChoice = inputReader.nextInt();
                switch (userChoice){
                    case 1:
                        addCustomer(inputReader);
                    case 2:
                        selectCustomer(inputReader);

                }

            }


        }

    }

    private static Object selectCustomer(Scanner inputReader) {
        inputReader.nextLine();
        System.out.print("select a customer");
        return Customer;




    }

    private static void addCustomer(Scanner inputReader) {
        inputReader.nextLine();
        System.out.print("Enter new customers name");
        var newCustomerName = inputReader.nextLine();
    }
}




