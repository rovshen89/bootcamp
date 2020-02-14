package firstpackage;

public class Loop {
    public static void main(String[] args) {
//        for(int i = 100; i <= 1000; i++){
//            System.out.println(i);

        //all ASCII character list
//        for (int i = 0; i < 256; i++){
//            System.out.println(i + " -- " + (char)i);
//        }

        //all lower letter;
 //       for(int i = 65; i < 91; i++){
 //           System.out.print(i + " == " + (char)i + "; ");
 //       }

        //print odd number;
        for(int i = 0; i <= 100; i++ )
        if(i%2 != 0)
        {
            System.out.println("Odd numbers: " + i);
        }

        //print even numbers;
        for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }

    }
}
