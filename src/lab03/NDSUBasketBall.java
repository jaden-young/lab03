package lab03;
import java.util.Scanner;
/**
 * Demonstrates the ArrayBag class.
 * @author Jaden Young
 */
public class NDSUBasketBall {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        ArrayBag team = new ArrayBag();
        final int NUM_PLAYERS = 14; //magic numbers are icky
        
        System.out.println("--------- NDSU Basketball Team ---------");
        for(int i = 0; i < NUM_PLAYERS; i++) {
            System.out.println("Player " + i + ":");
            // get name
            System.out.print("Name > ");
            String name = scan.nextLine();
            // get position
            System.out.print("Position > ");
            String position = scan.nextLine();
            // get number
            System.out.print("Jersey number > ");
            while(!scan.hasNextInt()) {
                String garbage = scan.nextLine();
                System.out.print("Jersey number > ");
            }
            int number = scan.nextInt();
            // add player to team
            team.add(new Player(name, position, number));
            //eats extra character left behind
            scan.nextLine();
        }
        //remove a random player from the team
        team.remove();
        //add a new player with madeup info
        Player me = new Player("Jaden Young", "C", 11);
        team.add(me);
        System.out.println("Size of the team with all players and made up "
                + "player: " + team.getCurrentSize());
        //remove the added player
        team.remove(me);
        System.out.println("Size of the team after removing the made up "
                + "player: " + team.getCurrentSize());
        // print out all players on the team
        for(int i = 0; i < team.getCurrentSize(); i++) {
            try {
                System.out.println(team.getItem(i).toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }
        
        ArrayBag courses = new ArrayBag();
        courses.add("MATH 166");
        courses.add("SPAN 312");
        courses.add("CSCI 161");
        courses.add("HNES 111");
        courses.add("COMM 111");
        System.out.println("Before removal of random course:");
        for(int i = 0; i < courses.getCurrentSize(); i++) {
            System.out.println(courses.getItem(i));
        }
        courses.remove();
        System.out.println("After removal of random course:");
        for(int i = 0; i < courses.getCurrentSize(); i++) {
            System.out.println(courses.getItem(i));
        }
    }
}
