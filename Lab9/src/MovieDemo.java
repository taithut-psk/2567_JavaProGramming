import java.util.*;

public class MovieDemo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Input movie id        :");
        String movieId = scn.nextLine();
        System.out.print("Input movie name      :");
        String movieName = scn.nextLine();
        System.out.println();

        System.out.print("Input director name   :");
        String directorName = scn.nextLine();
        System.out.print("Input director email  :");
        String directorEmail = scn.nextLine();
        System.out.print("Input director gender :");
        char gender = Character.toLowerCase(scn.nextLine().charAt(0));

        while (!((gender == 'm') || (gender == 'f'))) {
            System.out.print("Input director gender again : ");
            gender = Character.toLowerCase(scn.nextLine().charAt(0));
        }

        Director director = new Director(directorName, directorEmail, gender);
        System.out.println();
        System.out.print("Input movie theater no. : ");
        int theaterNumber = scn.nextInt();

        while (!((theaterNumber >= 1) && (theaterNumber <= 15))) {
            System.out.print("Please input 1 - 15 only : ");
            theaterNumber = scn.nextInt();
        }
        scn.close();

        Theater theater = new Theater(movieId, movieName, director, theaterNumber);

        System.out.println();
        System.out.println(theater);

    }
}
