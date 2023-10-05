public class MyArray {
    public static void main(String[] args) {
        int []myArray = {1,2,3,4};
        String []myStringArray = {"Unu","Doi","Trei"};
        System.out.println(myArray[3]);
        int length = myArray.length;


//        System.out.println(myStringArray[0]);
//        System.out.println(myStringArray[1]);
//        System.out.println(myStringArray[2]);
        for (int i=0;i<myStringArray.length;i++){
            System.out.println(myStringArray[i]);
        }

        for(String str:myStringArray){
            System.out.println(str);
        }

        /*Declarați un șir (array) de tip double cu patru elemente și stocați cele patru valori.
a. Afișați elementul de pe a doua poziție.
b. Afișați elementul de pe ultima poziție.
c. Afișați numărul de elemente din șir*/
        double myDoubleArray[] = {3.4,4.5,7.9,9.0};
        System.out.println("-----");
        System.out.println("Ex 4");
        System.out.println(myDoubleArray[1]);
        System.out.println(myDoubleArray[3]);

        for(int i=0;i<myDoubleArray.length;i++){
            System.out.println(myDoubleArray[i]);
        }
        System.out.println("-----");
        System.out.println("Ex optional");
        char myCharArray[] = {'a','b','c','d'};
        System.out.println(myCharArray[0]);
        System.out.println(myCharArray[1]);
        System.out.println(myCharArray[3]);

        for (int i=0; i<myCharArray.length; i++){
            System.out.println(myCharArray[i]);
        }



    }
}
