import java.util.Scanner;

public class NokiaOne {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        String Menu = """
        Welcome to your Nokia phone !!!!

        Your Nokia menu map:

        List of menu functions:

            1 -> Phone book
            2 -> Messages 
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
        """;

        System.out.println(Menu);
        System.out.print("Enter a number: ");
        String userInput = inputCollector.nextLine();

        switch (userInput) {

            case "1" -> {
                System.out.println("You entered phonebook");

                String Phonebook = """
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

                System.out.println(Phonebook);
                String phonebookInput = inputCollector.nextLine();

                switch (phonebookInput) {
                    case "1" -> System.out.println("Enter search");
                    case "2" -> System.out.println("Enter Service Nos.");
                    case "3" -> System.out.println("Enter Add Name");
                    case "4" -> System.out.println("Enter Erase");
                    case "5" -> System.out.println("Enter Edit");
                    case "6" -> System.out.println("Enter Assign tone");
                    case "7" -> System.out.println("Enter Send b'card");

                    case "8" -> {
                        String options = """
                        Options:
                        1 -> Type of view
                        2 -> Memory status
                        """;

                        System.out.println(options);
                        String optionsInput = inputCollector.nextLine();

                        switch (optionsInput) {
                            case "1" -> System.out.println("Enter type of view");
                            case "2" -> System.out.println("Enter Memory status");
                        }
                    }

                    case "9" -> System.out.println("Enter Speed dials");
                    case "10" -> System.out.println("Enter Voice tags");
                }
            }

            case "2" -> {
                System.out.println("You entered Messages");

                String Messages = """
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture messages
                5 -> Templates
                6 -> Smiley
                7 -> Messages setting 
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service command editor
                """;

                System.out.println(Messages);
                String messagesInput = inputCollector.nextLine();

                switch (messagesInput) {
                    case "1" -> System.out.println("Write messages");
                    case "2" -> System.out.println("Inbox");
                    case "3" -> System.out.println("Outbox");
                    case "4" -> System.out.println("Picture messages");
                    case "5" -> System.out.println("Templates");
                    case "6" -> System.out.println("Smiley");

                    case "7" -> {
                        String messageSettings = """
                        Message Settings:
                        1 -> Set 1
                        2 -> Common
                        """;

                        System.out.println(messageSettings);
                        String messageSettingsInput = inputCollector.nextLine();

                        switch (messageSettingsInput) {

                            case "1" -> {
                                System.out.println("Set 1");

                                String set1 = """
                                1 -> Message centre number
                                2 -> Messages sent as
                                3 -> Message validity
                                """;

                                System.out.println(set1);
                                String set1Input = inputCollector.nextLine();


                                switch (set1Input) {
                                    case "1" -> System.out.println("Message centre number");
                                    case "2" -> System.out.println("Messages sent as");
                                    case "3" -> System.out.println("Message validity");
                                }
                            }

                            case "2" -> {
                                System.out.println("Common");

                                String common = """
                                1 -> Delivery reports
                                2 -> Reply via same centre
                                3 -> Character support
                                """;

                                System.out.println(common);
                                String commonInput = inputCollector.nextLine();

                                switch (commonInput) {
                                    case "1" -> System.out.println("Delivery reports");
                                    case "2" -> System.out.println("Reply via same centre");
                                    case "3" -> System.out.println("Character support");
                                }
                            }
                        }
                    }

                    case "8" -> System.out.println("Info service");
                    case "9" -> System.out.println("Voice mailbox number");
                    case "10" -> System.out.println("Service command editor");
                }
            }

            case "3" -> System.out.println("You entered Chat");
            case "4" -> System.out.println("You entered Call register");
            case "5" -> System.out.println("You entered Tones");
            case "6" -> System.out.println("You entered Settings");
            case "7" -> System.out.println("You entered Call divert");
            case "8" -> System.out.println("You entered Games");
            case "9" -> System.out.println("You entered Calculator");
            case "10" -> System.out.println("You entered Reminders");
            case "11" -> System.out.println("You entered Clock");
            case "12" -> System.out.println("You entered Profiles");
            case "13" -> System.out.println("You entered SIM services");
        }
    }
}
