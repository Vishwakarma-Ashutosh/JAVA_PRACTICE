package GroceryBill;

import java.util.Scanner;

public class GroceryBill {
    static int total=0;
     static void addItem(String name, int price,int quantity){
        int amount= price*quantity;
        total+=amount;
        System.out.println(
            name+" price"+price+ " qty"+quantity
        );

     }
    static void showPriceList(){
        System.out.println("\n -----Grocery menu :)----- ");
        System.out.println("1. rice - 50₹ ");
        System.out.println("2. tuvar lentils 140₹");
        System.out.println("3. hajmola 48₹");
        System.out.println("4. sugar 67₹");
        System.out.println("5. wheat 35₹");
        System.out.println("6. flour 42₹");
        System.out.println("7. total");
    
      }
      public static void main(String[] args) {
        int quantity, choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("what dp you like to buy");
        do {
            showPriceList();
            System.out.println("enter your choice");
            choice=sc.nextInt();
             switch (choice) {
                case 1: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("rice", 50, quantity);

                    break;
                case 2: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("tuvar", 140, quantity);

                    break;    
             case 3: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("hajmola", 48, quantity);
                        break;
            case 4: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("sugar", 67, quantity);
                        break;

            case 5: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("wheat", 35, quantity);
                        break;
            case 6: System.out.print("enter qty:");
                        quantity=sc.nextInt();
                        addItem("flour", 42, quantity);
                        break;
            case 7: System.out.println("\n------------------------------");
                    System.out.println("TOTAL BILL: Rs " + total);
                    System.out.println("Thanks for shopping!");
                    break;
                    default:
                        System.out.println("invalid");
             }

            
                
            
        }while(choice!=7);
        
        sc.close();
      }
}
