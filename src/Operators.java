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

        //Ex 1 - varianta 1
        double result = 10*6;
        System.out.println(result);
        //varianta 2
        System.out.println(10*6);

        //ex 2
        System.out.println(10/2);

        //ex3
        int x = 10;
        //++x;
        System.out.println(++x); //x=11

        //ex 4
        x+=5; //x=16
        System.out.println(x);

        //ex 5
        int y = 1;
        int z = 2;
        int k = y+z;

        if(k>=10){
            System.out.println("suma este mai mare decat 10");
        }
        else System.out.println("suma este mai mica decat 10");

        //ex 6
        if (k%2==0){
            System.out.println("suma este nr par");
        }

        //ex optionale 1-3
        int var1, var2, var3, var4;
        var1 = 10;
        var2 = 20;
        var3 = 30;
        var4 = 40;
        int sum4 = var1+var2+var3+var4;
        int prod4 = var1*var2*var3*var4;
        System.out.println(sum4);
        System.out.println(prod4);

        System.out.println(var4%var2);

        ++var1;
        ++var1;
        ++var1;
        System.out.println(var1);

        for(int i=0;i<3;i++){
            var1++;
        }


        for(int i=0;i<2;i++){
            var2-=2;
        }

        //ex optional 4-5
        boolean cond1 = sum4>100;
        boolean cond2 = prod4>1000;
        System.out.println(cond1);
        System.out.println(cond2);

        System.out.println(cond1||cond2);
        System.out.println(cond1&&cond2);





    }
}
