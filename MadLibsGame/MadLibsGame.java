package MadLibsGame;
import java.util.*;
public class MadLibsGame {
    static void rawStory() {
        System.out.println("----- Raw Story -----\n");
        System.out.println("Today I went to a <adjective> zoo.");
        System.out.println("In an exhibit, I saw a <noun>.");
        System.out.println("The <noun> was <adjective> and <verb>!");
        System.out.println("I was <adjective>!");
        System.out.println("\n------------------------\n");
    }

    public static void main(String[] args){
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        Scanner sc=new Scanner(System.in);
        rawStory();
        System.out.print("Enter an adjective(Description):");
        adjective1=sc.nextLine();
        System.out.print("Enter an noun(animal or person)");
        noun1=sc.nextLine();
        System.out.print("Enter an adjective(Description)");
        adjective2=sc.nextLine();
        System.out.print("Enter a verb(action+ing)");
        verb1=sc.nextLine();
        System.out.print("Enter an adjective(Description)");
        adjective3=sc.nextLine();


        System.out.println("\nToday i went to a "+adjective1+ " Zoo." );
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+ " and " +verb1+ "!");
        System.out.println("I was "+adjective3+"!");
        sc.close();
    }
}
