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

        String myFavouriteMovie = "Marile Sperante";
        myFavouriteMovie.toLowerCase();
        myFavouriteMovie.toLowerCase();

        /*Declarați o variabilă de tip String care să conțină un nume de tara.
Declarați o variabilă de tip int care să stocheze lungimea Stringului.
Afișați valoarea celei de-a doua variabile.*/
        System.out.println("--------");
        System.out.println("Ex 3");
        String tara = "Spania";
        int lungimeNumeTara = tara.length();
        System.out.println(lungimeNumeTara);

        System.out.println("--------");
        System.out.println("Ex optionale");
        String favouriteMovie = "Harry Potter";
        System.out.println("My favourite movie is \""+favouriteMovie+"\"");
        System.out.println(favouriteMovie.toLowerCase());
        System.out.println(favouriteMovie.toUpperCase());
        System.out.println(favouriteMovie.length());



    }
}
