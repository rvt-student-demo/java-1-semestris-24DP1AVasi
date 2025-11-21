package rvt;


public class Books {

    public static void main(String[] args) {
        int manyBooks = PYinput.InInt("Ievadi cik grāmatas tu gribi: ");
        Book[] bigBook = new Book[manyBooks];
        for (int book = 0; book < manyBooks; book++) {
            bigBook[book] = new Book("", "", 0, 0);
        }
        for (int book = 0; book < manyBooks; book++) {
                System.out.println("\nIevadi informāciju par " + (book + 1) + ". grāmatu:");
                bigBook[book].author = PYinput.InStr("Ievadi grāmatas autoru: ");
                bigBook[book].title = PYinput.InStr("Ievadi grāmatas nosaukumu: ");
                bigBook[book].pages = PYinput.InInt("Ievadi grāmatas lpp skaitu: ");
                bigBook[book].year = PYinput.InInt("Ievadi grāmatas izdošanas gadu: ");
        }
        System.out.println("Jūsu grāmatu saraksts:");
        for (int book = 0; book < manyBooks; book++) {
            System.out.println(bigBook[book].getAuthor() + ": " + bigBook[book].getTitle() + " (" + bigBook[book].getYear() + "), " + bigBook[book].getPages() + " lpp.");
        }
    }
}
