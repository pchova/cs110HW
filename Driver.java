package hwAssignments;
//Polina Chetnikova CS110 Section C
//hwAssignments.Driver class for assignment #5
public class Driver {
    public static void main(String[] args) {
        // create hwAssignments.Author objects
        Author stevenKing = new Author("Steven", "King", "scaryman@comcast.et");
        Author danBrown = new Author("Dan", "Brown", "danbrown@gmail.com");
        Author danBrown2 = new Author("Dan", "Brown", "danbrown@gmail.com");
        // demonstrate toString( ) with Authors
        System.out.printf("Demonstrating toString with hwAssignments.Author objects\n");
        System.out.printf("stevenKing: %s\n", stevenKing);
        System.out.printf("danBrown: %s\n", danBrown);
        System.out.printf("danBrown2: %s\n", danBrown2);

        // demonstrate == and equals
        System.out.printf("\n\nDemonstrate == and equals with hwAssignments.Author objects\n");
        System.out.printf("stevenKing == danBrown: %s\n", stevenKing == danBrown);
        System.out.printf("danBrown == danBrown2: %s\n", danBrown == danBrown2);
        System.out.printf("danBrown.equals(danBrown2): %s\n", danBrown.equals(danBrown2));

        // create hwAssignments.Book objects
        Book inferno = new Book("0765360039l", "Inferno", danBrown, "Double Day", 576);
        Book inferno2 = new Book("0765360039l", "Inferno", danBrown, "Double Day", 576);
        Book inferno3 = inferno2;
        Book infernoCopy = new Book(inferno);

        // demonstrate == with hwAssignments.Book objects
        System.out.printf("\n\nDemonstrate using == operator with hwAssignments.Book objects\n");
        System.out.printf("inferno == inferno2: %s\n", inferno == inferno2);
        System.out.printf("inferno2 == inferno3: %s\n", inferno2 == inferno3);
        System.out.printf("inferno == inferno3: %s\n", inferno == inferno3);
        System.out.printf("inferno2 == infernoCopy: %s\n", inferno2 == infernoCopy);

        // demonstrate equals with hwAssignments.Book objects
        System.out.printf("\n\nDemonstrate using equals method with hwAssignments.Book objects\n");
        System.out.printf("inferno.equals(inferno2): %s\n", inferno.equals(infernoCopy));
        System.out.printf("inferno2.equals(inferno3): %s\n", inferno2.equals(inferno3));
        System.out.printf("infernor.equals(inferno3): %s\n", inferno.equals(inferno3));
        System.out.printf("inferno2.equals(infernoCopy): %s\n", inferno2.equals(infernoCopy));

        // demonstrate copy constructor
        System.out.printf("\nDemoing Copy constructor\n");
        System.out.printf("Both objects before change\n");
        System.out.printf("inferno: %s\n", inferno);
        System.out.printf("infernoCopy: %s\n", infernoCopy);
        inferno.setNumPages(100);
        System.out.printf("\nBoth objects after changing inferno\n");
        System.out.printf("inferno: %s\n", inferno);
        System.out.printf("infernoCopy: %s\n", infernoCopy);
    }
}
