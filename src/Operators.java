public class Operators {
    public static void main(String[] args) {
        int sum1 = 100+50;
        int sum2 = sum1+50;
        int sum3 = sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(9/2); //catul
        System.out.println(9%2); //restul impartirii
        System.out.println(10%7);
        System.out.println(++number1);
//        System.out.println(number1);
        System.out.println(number2+10);
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

        //number2 = number2+2;
        number2+=4; //echivalent cu number2=number2+4
        number2-=2;
        number2*=2;
        System.out.println(number2);
        System.out.println(number1<number2); //100<6
        System.out.println(10>5);
        System.out.println('A'<'B');
        System.out.println(!true);
        System.out.println(number1); //101
        System.out.println(number2); //6
        boolean condition = number1>number2 || number1<100;
        System.out.println(condition);

        if(!condition){
            System.out.println("Conditia este adevarata!");
        }
        else System.out.println("Conditia nu este adevarata!");


    }
}
