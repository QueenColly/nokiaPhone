import java.util.Scanner;
public class NokiaOne { 
public static void main (String[] args){
Scanner inputCollector = new Scanner (System.in);
//System.out.print("Welcome to Nokia!!!");
//String input = inputCollector.nextLine();
//
    String Option= """

    Welcome to your Nokia phone !!!!

    Your Nokia menu map:

    List of menu functions:

        1 -> Phone book
        2 -> Message 
        3 -> Chat
        4 -> Call register
        5 -> Tones
        6 -> Settings
        7 -> Call divert
        8 -> Games
        9 -> Calculator
       10 -> Reminders
       11 -> Clock
       12 -> Profiles
       13 -> SIM services

    """ ; 
    System.out.println(Option); 
    System.out.print("Enter a number: ");
    int userInput = inputCollector.nextInt();

    switch (userInput){
    case 1 -> {
                String Phonebook = """

            Phonebook:

        1 -> Search
        2 -> Service Nos.
        3 -> Add Name
        4 -> Erase
        5 -> Edit
        6 -> Assign tone
        7 -> Send b'card
        8 -> Options
        9 -> Speed dials
        10 -> Voice tags
    """;
        System.out.print(Phonebook);
        System.out.print("Enter a number: ");
        int phonebookInput = inputCollector.nextInt();

        switch(phonebookInput){
     case 1 -> System.out.println("Enter search");
     case 2 -> System.out.println("Enter Service Nos.");
     case 3 -> System.out.println("Enter Add Name");
     case 4 -> System.out.println("Enter Erase");
     case 5 -> System.out.println("Enter Edit");
     case 6 -> System.out.println("Enter Assign tone");
     case 7 -> System.out.println("Enter Send b'card");

     case 8 -> { 
     String options = """

                    Options:
            1 -> Type of view
            2 -> Memory status
    """;

                System.out.println(options);
                 System.out.print("Enter a number: ");
                  int optionsInput = inputCollector.nextInt();
        switch(optionsInput){

     case 1 -> System.out.println("Enter type of view");
     case 2 -> System.out.println("Enter Memory status");
}
   }            

     case 9 -> System.out.println("Enter Speed dials");
     case 10 -> System.out.println("Enter Voice tags");

}
}

      case 2 -> {
                
}    
}
}
        

}

