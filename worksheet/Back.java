import java.util.Scanner;

public class Back {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("press 1 for Phone book");
        System.out.println("press 2 for Messages ");
        System.out.println("press 3 for Chat");
        System.out.println("press 4 for Call register");
        System.out.println("press 5 for Tones");
        System.out.println("press 6 for Setting");
        System.out.println("press 7 for Call divert ");
        System.out.println("press 8 for Games");
        System.out.println("press 9 for Calculator ");
        System.out.println("press 10 for Reminders");
        System.out.println("press 11 for Clock");
        System.out.println("press 12 for Profiles");
        System.out.println("press 13 for SIM services ");

        int Menu = scanner.nextInt();


        switch (Menu){
            case 1 -> {
                System.out.println("Phonebook");
                int Phonebook = scanner.nextInt();
                switch (Phonebook){
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Options");
                        int Options = scanner.nextInt();
                        switch (Options){
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");

                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            }


            case 2 -> {
                System.out.println("Messages");
                int Messages = scanner.nextInt();
                switch (Messages){
                    case 1 -> System.out.println("Write message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Messagesettings");
                        int Messagesettings = scanner.nextInt();
                        switch (Messagesettings){
                            case 1 -> {
                                System.out.println("Set1");
                                int Set1 = scanner.nextInt();
                                switch (Set1){
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");


                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                int Common = scanner.nextInt();
                                switch (Common){
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }

                        }

                    }
                    case 8 -> System.out.println("Info service");
                    case 9-> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
            }
            case 3 -> System.out.println("Chat");

            case 4 -> {
                System.out.println("Call register");
                int callregister = scanner.nextInt();
                switch(callregister){
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration");
                        int showcall = scanner.nextInt();
                        switch (showcall){
                            case 1 -> System.out.println("last call duration");
                            case 2 -> System.out.println("all calls duration");
                            case 3 -> System.out.println("received calls duration");
                            case 4 -> System.out.println("dialled call duration");
                            case 5 -> System.out.println("clear timers");
                        }
                    }

                    case 6 -> {
                        System.out.println("show call cost");
                        int showcallcost = scanner.nextInt();
                        switch (showcallcost){
                            case 1 -> System.out.println("last call cost");
                            case 2 -> System.out.println("all calls cost");
                            case 3 -> System.out.println("clear counters");

                        }
                    }
                    case 7 -> {
                        System.out.println("call cost settings");
                        int callcost = scanner.nextInt();
                        switch (callcost){
                            case 1 -> System.out.println("call cost limit");
                            case 2 -> System.out.println("show costs in");
                        }
                    }

                    case 8 -> System.out.println("prepaid credit");


                }
            }
            case 5 -> {
                System.out.println("Tones");
                int tones = scanner.nextInt();
                switch (tones){
                    case 1 -> System.out.println("ringing tone");
                    case 2 -> System.out.println("ringing volume");
                    case 3 -> System.out.println("incoming call alert");
                    case 4 -> System.out.println("composer");
                    case 5 -> System.out.println("message alert tone");
                    case 6 -> System.out.println("keypad tones");
                    case 7 -> System.out.println("warning and game tones");
                    case 8 -> System.out.println("vibrating alert");
                    case 9 -> System.out.println("screen saver");
                }
            }
            case 6 -> {
                System.out.println("Setting");
                int setting = scanner.nextInt();
                switch (setting){
                    case 1 -> {
                        System.out.println("call setting");
                        int callsetting = scanner.nextInt();
                        switch (callsetting){
                            case 1 -> System.out.println("automatic redail");
                            case 2 -> System.out.println("speed dailing");
                            case 3 -> System.out.println("call waiting options");
                            case 4 -> System.out.println("own number sending");
                            case 5 -> System.out.println("phone line in use");
                            case 6 -> System.out.println("automatic answer");

                        }
                    }
                    case 2 -> {
                        System.out.println("phone setting");
                        int phonesetting = scanner.nextInt();
                        switch (phonesetting){
                            case 1 -> System.out.println("language");
                            case 2 -> System.out.println("cell info dispaly");
                            case 3 -> System.out.println("welcome note");
                            case 4 -> System.out.println("network selection");
                            case 5 -> System.out.println("lights");
                            case 6 -> System.out.println("confirm sim service actions");

                        }
                    }
                    case 3 -> {
                        System.out.println("security setting");
                        int securitysetting = scanner.nextInt();
                        switch (securitysetting){
                            case 1 -> System.out.println("pin code request");
                            case 2 -> System.out.println("call barring service");
                            case 3 -> System.out.println("fixed dailing");
                            case 4 -> System.out.println("closed user group");
                            case 5 -> System.out.println("phone security");
                            case 6 -> System.out.println("change access codes");
                        }
                    }
                    case 4 -> System.out.println("restore factory setting");

                }
            }

            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 ->System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> {
                System.out.println("Clock");
                int clock = scanner.nextInt();
                switch (clock){
                    case 1 -> System.out.println("alarm clock");
                    case 2 -> System.out.println("clock setting");
                    case 3 -> System.out.println("date setting");
                    case 4 -> System.out.println("stopwatch");
                    case 5 -> System.out.println("countdown timer");
                    case 6 -> System.out.println("auto update of date and time");



                }
            }
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM services");
        }

    }
}
