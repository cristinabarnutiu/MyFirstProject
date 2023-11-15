import java.sql.SQLOutput;

public class Algorythms {
    public static void main(String[] args) {
        //Ex1: 1, -25, 34, -2, 67, 5
        int numere[] ={1,-25,34,-2,67,5};
        for(int i=0; i<numere.length;i++){
            int inainte = numere[i]-1;//0
            int dupa = numere[i]+1;//2
            System.out.println(inainte+" "+dupa);
        }

        int maxim = numere[0];
        int minim = numere[0];
        for(int i=0;i<numere.length;i++){
            if(numere[i]>=maxim){
                maxim = numere[i];
            }
            if(numere[i]<=minim){
                minim = numere[i];
            }
        }
        System.out.println("Min si max");
        System.out.println("max="+maxim+"min="+minim);

        for (int i =0; i<numere.length;i++){
            if(numere[i]<0) {
                System.out.println(numere[i]);
            }
        }

        String tari[]={"Anglia", "Romania", "Albania", "SUA","Franta", "Elveția", "Afghanistan", "China"};
        for(String t: tari){
            System.out.println(t);
            System.out.println(t.charAt(0));
            System.out.println(t.length());
            System.out.println(t.contains("n"));
        }

        System.out.println("Ex 6 - Algoritmi");
        for (String t: tari){
            //if(t.startsWith("A"))
            //if (t.charAt(0)=='A')
            if(t.indexOf('A')==0)
            {
                System.out.println(t);
            }
        }
        for (String t: tari){
            //if(t.startsWith("A"))
            //if (t.charAt(0)=='A')
            if(t.contains("n"))
            {
                System.out.println(t);
            }
        }

        int max = 0;
        int min = tari[0].length();
        String taraCuLungimeMaxima = "";
        String taraCuLungimeMinima = "";
        System.out.println("Ex 8 - Algoritmi");
        for(int i = 0; i<tari.length;i++){
            if (tari[i].length()>=max){
                max = tari[i].length();
                taraCuLungimeMaxima = tari[i];
            }
            if (tari[i].length()<=min){
                min = tari[i].length();
                taraCuLungimeMinima = tari[i];
            }
        }
        System.out.println(max);
        System.out.println(taraCuLungimeMaxima);
        System.out.println(min);
        System.out.println(taraCuLungimeMinima);

        }



    }









