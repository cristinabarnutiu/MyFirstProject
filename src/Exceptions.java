public class Exceptions {
    public static void main(String[] args) {
        int numbers[] ={2,6,9,10};
        //System.out.println(numbers[4]);
            try{
            System.out.println(numbers[4]);
        }
        catch(Exception e){
            System.out.println("A aparut o eroare");
        }
    }
}
