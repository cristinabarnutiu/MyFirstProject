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

    }
}
