public class Main { 

    public static void main(String[] args) { 

        Library library = new Library(); 

  

        library.addBook(new Book("Java Basics", "John Doe", "123")); 

        library.addBook(new Book("Advanced Java", "Jane Doe", "456")); 

  

        library.addMember(new LibraryMember("Alice", "M001")); 

        library.addMember(new LibraryMember("Bob", "M002")); 

  

        System.out.println("Books:"); 

        library.displayBooks(); 

  

        System.out.println("\nMembers:"); 

        library.displayMembers(); 

    } 

} 
