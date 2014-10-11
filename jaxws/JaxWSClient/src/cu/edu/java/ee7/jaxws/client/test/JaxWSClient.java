package cu.edu.java.ee7.jaxws.client.test;

import cu.edu.java.ee7.jaxws.client.gen.EBook;
import cu.edu.java.ee7.jaxws.client.gen.EBookStore;
import cu.edu.java.ee7.jaxws.client.gen.EBookStoreImplService;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class JaxWSClient {

    public static void main(String[] args) {
        try {
            EBookStoreImplService eBookStoreService = new EBookStoreImplService(
                    new URL("http://localhost:8080/JaxWSEndPoint/EBookStoreImplService?wsdl"));
            EBookStore eBookStore = eBookStoreService.getEBookStoreImplPort();
            String response = eBookStore.welcomeMessage("PAATA");

            // ======================= 
            System.out.println("First Request. Response From WS = " + response);
            // =======================

            // First Book
            EBook eBook = new EBook();
            eBook.setTitle("The Jungle Book");
            eBook.setNumPages(225);
            eBook.setPrice(17.9);

            // Save The Book
            eBookStore.saveBook(eBook);

            // Second Book
            eBook = new EBook();
            eBook.setTitle("Java Book");
            eBook.setNumPages(425);
            eBook.setPrice(25.5);

            // Save Second Book
            eBookStore.saveBook(eBook);

            // New Book
            eBook = new EBook();
            eBook.setTitle("Animal Farm");
            eBook.setNumPages(113);
            eBook.setPrice(22.5);
            List<String> notes = Arrays.asList(new String[]{"Great book", "Not too bad"});
            eBook.getNotes().addAll(notes);

            // Save Third Book
            eBookStore.saveBook(eBook);

            // Find Book By Title
            EBook response1 = eBookStore.takeBook("Animal Farm");

            // ======================= 
            System.out.println("Second Request. Response From WS = " + response1.getTitle() + "\n\nSearch Request.");
            // =======================

            List<String> books = eBookStore.findEBooks("Book");
            for (String book : books) {
                System.out.println("Response From WS = " + book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
