public class MyString {
    public static void main(String[] args) {
        String myString = "This is a text";
        int lungime = myString.length();
        System.out.println("lungimea textului este "+lungime);
        String myName = "Cristina Barnutiu";
        int lungimeaNumelui = myName.length() ;
        System.out.println(lungimeaNumelui);
        System.out.println("lungimea numelui \""+myName+"\" este \n"+lungimeaNumelui);
        String myNameWithoutSpace = myName.replace(" ","");
        int lungimeaNumeluiFaraSpatii = myNameWithoutSpace.length();
        System.out.println(lungimeaNumeluiFaraSpatii);
//      System.out.println(lungimeaNumelui);
        char aPatraLitera = myName.charAt(4);
        char primaLitera = myName.charAt(0);
        System.out.println(aPatraLitera);
        System.out.println(primaLitera);


    }
}
