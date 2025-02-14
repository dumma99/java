package Runner;

import Things.BookInformation;

public class BookInformationRunner {
    public static void main(String[]args){
        BookInformation BookInformation= new BookInformation();
        System.out.println(BookInformation);
        BookInformation.bookName="Core Java";
        BookInformation.author="Robin Hood";
        BookInformation.price="250.24"
    }
}
