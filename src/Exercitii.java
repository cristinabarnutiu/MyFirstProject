public class Exercitii {
    public static void main(String[] args) {
        /*
        Declarati o variabila de tip int, cu numele “temperature” si dati-i o valoare la alegere.
        Daca valoarea ei este mai mica decat 18, afisati “prea frig”. Daca valoarea este intre 18 si 22, afisati “ok”. Daca valoarea este peste 22, afisati “prea cald”.*/

    int temperature = 17;
    if (temperature<18){
        System.out.println("prea frig");
    }
    else if(temperature>=18&&temperature<=22){
            System.out.println("ok");
        }
    else System.out.println("too hot");



    char gender = 'f';
    boolean married = true;
    //varianta 1
    if(gender=='m'){
        System.out.println("Domnul");
    }
    else if(gender=='f'&&married==false){
        System.out.println("Domnisoara");
    } else if (gender=='f'&&married==true) {
        System.out.println("Doamna");
    }

    //varianta 2 - IF in IF
        if(gender=='m'){
            System.out.println("Domnul");
        }
        else if(gender=='f'){
            if(married){
                System.out.println("Doamna");
            }
            else System.out.println("Domnisoara");
        }

        //varianta 3
        switch(gender){
            case 'm':
                System.out.println("Domnul"); break;
            case 'f': if(married) {
                System.out.println("Doamna");
            }   else System.out.println("Domnisoara");break;
        }

        char letter = 'u';
        if(letter=='a'||
                letter=='e'||
                letter=='i'||
                letter=='o'||
                letter=='u'){
            System.out.println(letter+" este vocala");
        }
        else System.out.println(letter+" este consoana");

    }}
