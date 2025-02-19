import java.util.*;

public class FictionDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Book title: ");
        String bookTitle = scan.nextLine();
        System.out.print("Book publish year: ");
        int publicYear = scan.nextInt();
        scan.nextLine();
        System.out.print("Author name: ");
        String authorName = scan.nextLine();
        System.out.print("Author email: ");
        String authorEmail = scan.nextLine();

        FictionBook book1 = new FictionBook(bookTitle, publicYear);
        book1.setAuthorName(authorName);
        book1.setEmail(authorEmail);

        while (!book1.checkEmail()) {
            System.out.print("Author email: ");
            authorEmail = scan.nextLine();
            book1.setEmail(authorEmail);
        }

        Line();
        System.out.print(book1);

    }

    static void Line() {

        for (int i = 1; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
