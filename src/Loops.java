public class Loops {
    public static void main(String[] args) {

        //FOR
        //afisarea numerelor de la 5 la 0 in ordine descrescatoare
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }


        //afisarea numerelor de la 0 la 10 din 2 in 2
        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        //FOR EACH
        String cars[] = {"BMW","Mazda","Opel","Toyota"};
        for (String car: cars){
            System.out.println(car);
        }

        //WHILE
        int l=0;
        while(l<5){
            System.out.println(l);
            l++;
        }

        //DO WHILE
        int j=0;
        do{
            System.out.println(j);
            j++;
        } while (j<5);

        //BREAK
        for (int k=0; k<10; k++){
            if(k==4){break;}
            System.out.println(k);
        }

        int k =0;
        while (k<10){
            k++;
            if(k==4) continue;
            System.out.println(k);
        }

        //exercitiul 4 A5
        String fructe[] = {"mar", "caspuni","banane","pere"};

        //varianta1 - FOR clasic
        for (int i=0; i<fructe.length;i++){
            System.out.println("Imi place sa mananc "+fructe[i]);
        }

        //variata2 - FOR EACH
        for (String f: fructe){
            System.out.println("Imi place sa mananc "+f);
        }





    }
}
