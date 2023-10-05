public class DataTypes {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = 'a';
        byte myByte = 0;
        short myShort = 32767;
        int myInt = 9/2;
        long myLong = 9999999999999999L;
        float myFloat = 5.5f+8.5f;
        double myDouble = 7.753435;

        int x = 5;
        double y = x;
        double z = 5.5;
        int w = (int)z;


        System.out.println(y);
        System.out.println(w);


        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myBoolean);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);

        System.out.println(myDouble);
        System.out.println("myDouble");

        byte variabila1 = 100;
        int variabila2 = variabila1;
        float variabila3 = 5.5f;
        int variabila4 = (int) variabila3;

        System.out.println("----");
        System.out.println("Ex optionale");
        float variabila5 = 6.7f;
        float variabila6 = 7.7f;
        System.out.println(variabila5+variabila6);
        System.out.println(variabila5-variabila6);
        System.out.println(variabila5*variabila6);

    }
}
