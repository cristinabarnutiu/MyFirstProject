public class Conditionals {
    public static void main(String[] args) {
        if (5<0){
            System.out.println("5 is smaller than 0");
        }
        else
        {System.out.println("5 is not smaller than 0");
            System.out.println("another statement");}

        int time = 99;
        if (time<10){
            System.out.println("Good morning");
        }
        else if (time<18){
            System.out.println("Good day");
        }
        else if (time<24) {
            System.out.println("Good evening");
        }
        else System.out.println("only 24 hours in a day!!!");

        int day = 5;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("unknown");
        }

        int luna = 7;
        switch(luna){
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11: System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
        }

    }


}
