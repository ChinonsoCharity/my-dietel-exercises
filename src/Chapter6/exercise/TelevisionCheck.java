//package Chapter6.exercise;
//
////public class TelevisionCheck {
//
//import java.util.Scanner;
//
//    public class TelevisionDriver {
//
//        private static final Scanner input = new Scanner(System.in);
//        public static  Television lG = new Television("lG");
//
//        public static void main(String[] args) {
//            displayOption();
//        }
//
//        public static void displayOption(){
//            int select = 0;
//
//            do {
//                String option = """
//                    Press 1 to turn On Tv
//                    Press 2 to turn Off Tv
//                    Press 3 for Volume
//                    press 4 for channel
//
//                    """;
//                System.out.print(option);
//                System.out.println("\"Enter Option\"");
//                select = input.nextInt();
//                do {
//                    switch (select) {
//
//                        case 1 -> {
//                            lG.turnOn();
//                            System.out.print(lG);
//                            System.out.println("Life is good with lG" +" \n");
//                        }
//
//
//                        case 2 -> {
//                            lG.turnOff();
//                            System.out.println(lG.toString());
//                            System.exit(1);
//                        }
//
//                        case 3 -> {
//                            do {
//                                String subOption = """
//                            Press 1 to increase volume
//                            Press 2 to decrease volume
//                            Press 3 to go back to main
//                            """;
//                                System.out.print(subOption);
//                                System.out.println("\"Enter Option\"");
//                                select = input.nextInt();
//
//                                switch (select) {
//                                    case 1 -> {
//                                        lG.turnOn();
//                                        lG.increaseVolume();
//                                        System.out.print(lG + " \n\n");
//
//                                    }
//                                    case 2 -> {
//                                        lG.turnOn();
//                                        lG.decreaseVolume();
//                                        System.out.println(lG + " \n\n");
//
//                                    }
//                                    case 3 -> {displayOption();}
//                                }
//                            }
//                            while (true);
//                        }
//                        case 4 -> {
//                            String channelOption = """
//                            Press 1 to increase channel
//                            Press 2 to decrease channel
//                            Press 3 to enter your preferred channel
//                            press 4 to go back to main
//                            """;
//                            System.out.print(channelOption);
//                            System.out.println("\"Enter Option\"");
//                            select = input.nextInt();
//
//                            switch (select) {
//                                case 1 -> {
//                                    lG.turnOn();
//                                    lG.getVolume();
//                                    lG.increaseChannel();
//                                    System.out.print(lG + " \n\n");
//
//                                }
//                                case 2 -> {
//                                    lG.turnOn();
//                                    lG.getVolume();
//                                    lG.decreaseChannel();
//                                    System.out.println(lG + " \n\n");
//
//                                }
//                                case 3 -> {
//                                    lG.turnOn();
//                                    System.out.println("Enter your preferred channel between 1 and 10");
//                                    int userInput = input.nextInt();
//                                    lG.setChannel(userInput);
//                                    System.out.println("You are on channel " +lG.getChannel() + "\n");
//                                }
//                                case 4 ->{displayOption();}
//
//                            }
//                        }
//
//                    }
//                    break;
//
//                }
//                while (true);
//
//            }
//            while (true);
//        }
//    }
//
//
