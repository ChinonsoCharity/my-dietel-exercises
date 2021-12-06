package Chapter4.exercises;

import java.util.Scanner;

public class Menu {

        public static void main(String[] args){

            String prompt = """
            MENU
            1.  PHONE BOOK>
            2.  MESSAGES>
            3.  CHAT
            4.  CALL REGISTER>
            5.  TONES>
            6.  SETTINGS>
            7.  CALL DIVERT
            8.  GAME>
            9.  CALCULATOR
            10. REMINDER
            11. CLOCK>
            12. PROFILE
            13. SIM SERVICES
            Enter an option
            """;
            System.out.println(prompt);
            Scanner scanner = new Scanner(System.in);
            int userOpt = scanner.nextInt();
            switch (userOpt){
                case 1:
                    System.out.println("1.Search");
                    System.out.println("2.Service");
                    System.out.println("3.Add Name");
                    System.out.println("4.Erase");
                    System.out.println("5.Edit");
                    System.out.println("6.Assign Tone");
                    System.out.println("7.Send b'card");
                    System.out.println("8.Options>");
                    System.out.println("9.Speed dials");
                    System.out.println("10.Voice Tags");

                    System.out.println("Pick an option ");
                    int option = scanner.nextInt();
                    switch (option){
                        case 8:
                            System.out.println("1.Type of View");
                            System.out.println("2.Memory Status");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.Write Messages");
                    System.out.println("2.Inbox");
                    System.out.println("3.Outbox");
                    System.out.println("4.Picture Messages");
                    System.out.println("5.Template");
                    System.out.println("6.Smiley");
                    System.out.println("7.Message Settings>");
                    System.out.println("8.Inf Service");
                    System.out.println("9.Voice Mail Number");
                    System.out.println("10.Service Command Editor");

                    System.out.println("Pick an option");
                    int msOpt = scanner.nextInt();
                    switch (msOpt) {
                        case 7:
                            System.out.println("1.Set>");
                            System.out.println("2.Common>");
                            System.out.println("Pick an option ");
                            int setOpt = scanner.nextInt();
                            switch (setOpt) {
                                case 1:
                                    System.out.println("1.Message Centre Number");
                                    System.out.println("2.Message Sent As");
                                    System.out.println("3.Message Validity");
                                    break;
                                case 2:
                                    System.out.println("1.Delivery Report");
                                    System.out.println("2.Reply Via Same Centre");
                                    System.out.println("3.Character Support");
                                    break;
                            }
                    }
                    break;
                case 3:
                    System.out.println("Chat");
                    break;
                case 4:
                    System.out.println("1.Missed Calls");
                    System.out.println("2.Received Calls");
                    System.out.println("3.Dialled Numbers");
                    System.out.println("4.Erase Recent Call Lists");
                    System.out.println("5.Show Call Duration>");
                    System.out.println("6.Show Call Cost>");
                    System.out.println("7.Call Cost Settings>");
                    System.out.println("8.Prepaid Credit");

                    System.out.println("Pick an option ");
                    int crOpt = scanner.nextInt();
                    switch (crOpt) {
                        case 5:
                            System.out.println("1.Last Call Duration");
                            System.out.println("2.All Calls' Duration");
                            System.out.println("3.Received Calls' Duration");
                            System.out.println("4.Dialled Calls' Duration");
                            System.out.println("5.Clear Timers");
                            break;
                        case 6:
                            System.out.println("1.Last Call Cost");
                            System.out.println("2.All Calls' Cost");
                            System.out.println("3.Clear Counters");
                            break;
                        case 7:
                            System.out.println("1.Call Cost Limit");
                            System.out.println("2.Show Calls' in");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.Ringing Tones");
                    System.out.println("2.Ringing Volume");
                    System.out.println("3.Incoming Call Alert");
                    System.out.println("4.Composer");
                    System.out.println("5.Message Alert Tones");
                    System.out.println("6.Keypad Tones");
                    System.out.println("7.Warning and Game Tones");
                    System.out.println("8.Vibrating Alert");
                    System.out.println("9.Screen Saver");
                    break;
                case 6:
                    System.out.println("1.Call Settings");
                    System.out.println("2.Phone Settings");
                    System.out.println("3.Security Settings");
                    System.out.println("4.Restore Factory Settings");

                    System.out.println("Pick an option ");
                    int stOpt = scanner.nextInt();
                    switch (stOpt) {
                        case 1:
                            System.out.println("1.Automatic Redial");
                            System.out.println("2.Speed Dialing");
                            System.out.println("3.Call Waiting Option");
                            System.out.println("4.Own Number Sending");
                            System.out.println("5.Phone lines In Use");
                            System.out.println("6.Automatic Answer");
                            break;
                        case 2:
                            System.out.println("1.Language");
                            System.out.println("2.Cell Info Display");
                            System.out.println("3.Welcome Note");
                            System.out.println("4.Network Selection");
                            System.out.println("5.Lights");
                            System.out.println("6.Confirm SIM Service Actions");
                            break;
                        case 3:
                            System.out.println("1.PIN Code Request");
                            System.out.println("2.Call Barring Service");
                            System.out.println("3.Fixed Dialling");
                            System.out.println("4.Closed User Group");
                            System.out.println("5.Phone Security");
                            System.out.println("6.Change Access Codes");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Call Divert");
                    break;
                case 8:
                    System.out.println("1.Snake");
                    System.out.println("2.Pairs II");
                    System.out.println("3.Space Impact");
                    System.out.println("4.Bantumi");
                    break;
                case 9:
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminders");
                    break;
                case 11:
                    System.out.println("1.Alarm Clock");
                    System.out.println("2.Clock Settings");
                    System.out.println("3.Date Setting");
                    System.out.println("4.Stopwatch");
                    System.out.println("5.Countdown Timer");
                    System.out.println("6.Auto Update of Data and Time");
                    break;
                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("Sim Services");
                    break;
               default:
                    System.out.println("Are you okay");


            }

        }
    }