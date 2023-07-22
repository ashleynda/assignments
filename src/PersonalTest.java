//import java.util.Scanner;
//
//public class PersonalTest {
//    String A;
//    String B;
//    int extrovertCounter = 0;
//    int introvertCounter = 0;
//    int totalCounter = 0;
//    String personality = "";
//
//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter full name:  ");
//    String name = input.next();
//
//    or (int counter = 0; counter <= 20; counter++){}
//                switch (counter) {
//        case 1 -> {
//            System.out.println("""
//                            1.
//                             A. expend energy, enjoy groups
//                             B. conserve energy, enjoy one-on-one""");
//            System.out.println("Enter A or B:  ");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//
//        case 2 -> {
//            System.out.println("""
//                            2.
//                             A. interpret literally
//                             B. look for meaning and possibilities""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 3 -> {
//            System.out.println("""
//                            3.
//                             A. logical, thinking, questioning
//                             B. empathetic, feeling, accommodating""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 4 -> {
//            System.out.println("""
//                            4.
//                             A. organized, orderly
//                             B. flexible, adaptable""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 5 -> {
//            System.out.println("""
//                            5.
//                             A. more outgoing, think out loud
//                             B. more reserved, think to yourself""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 6 -> {
//            System.out.println("""
//                            6.
//                             A. practical, realistic, experiential
//                             B. imaginative, innovative, theoretical""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 7 -> {
//            System.out.println("""
//                            7.
//                             A. candid, straight forward, frank
//                             B. tactful, kind, encouraging""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 8 -> {
//            System.out.println("""
//                            8.
//                             A. plan, schedule
//                             B. unplanned, spontaneous""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 9 -> {
//            System.out.println("""
//                            9.
//                             A. seek many tasks, public activities, interaction with others
//                             B. seek private, solitary activities with quiet to concentrate""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 10 -> {
//            System.out.println("""
//                            10.
//                             A. standard, usual, conventional
//                             B. different, novel, unique""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 11 -> {
//            System.out.println("""
//                            11.
//                             A. firm, tend to criticize. hold the line
//                             B. gentle, tend to appreciate, conciliate""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 12 -> {
//            System.out.println("""
//                            12.
//                             A. regulated, structured
//                             B. easygoing, "live" and "let live" """);
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 13 -> {
//            System.out.println("""
//                            13.
//                             A. external, communicative, express yourself
//                             B. internal, reticent, keep to yourself""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 14 -> {
//            System.out.println("""
//                            14.
//                            A. focus on here-and-now
//                            B. look to the future, global perspective, "big picture""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 15 -> {
//            System.out.println("""
//                            15.
//                            A. tough-minded, just
//                            B. tender-hearted, merciful""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 16 -> {
//            System.out.println("""
//                            16.
//                            A. preparation, plan ahead
//                            B. go with the flow, adapt as you go""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
////                case 17 -> {
////                    System.out.println("""
////                            17.
////                            A. active, initiate
////                            B. reflective, deliberate""");
////                    String option = input.next();
////                    if (option.equals ("A")) extrovertCounter++;
////                    else if (option.equals ("B")) introvertCounter++;
////                    else if (option == ("A")) {
////                        System.out.println("Enter A or B:  ");
////                        String option = input.next();
////                    } else if (option == ("B")) {
////                        String option = input.next();
////                    }
////                    else {
////                        System.out.println("Wrong option");
////                    }
////                }
//        case 18 -> {
//            System.out.println("""
//                            18.
//                            A. facts, things, "what is
//                            B. ideas, dreams, "what could be", philosophical""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 19 -> {
//            System.out.println("""
//                            19.
//                            A. matter of fact, issue oriented
//                            B. sensitive, people-oriented, compassionate""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//        case 20 -> {
//            System.out.println("""
//                            20.
//                            A. control, govern
//                            B. latitude, freedom""");
//            String option = input.next();
//            if (option.equals("A")) extrovertCounter++;
//            else if (option.equals("B")) introvertCounter++;
//            else {
//                System.out.println("Wrong option");
//            }
//        }
//
//    }
//
//}
