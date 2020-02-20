package package2_19;

public class Stars {
    public static void main(String[] args) {
//        for(int i = 0; i < 11; i++ ){                     //for loop
//            for(int j = 0; j < 11; j++){
//                System.out.print("* \t");
//            }
//            System.out.println(" ");
//
//        }
//         int i = 0; int j = 0;
//        while(i<40){
//            j=0;
//            while(j<11){
//                System.out.print("* \t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        int i = 0; int j = 0;
        do{
            j = 0;
            do{
                System.out.print("* \t");
                j++;
            }while (j<10);
            System.out.println();
            i++;
        }while(i<20);

    }
}
