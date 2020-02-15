package firstpackage;

public class NestedLoop {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++){
//            int count = 1;
//            for(int j = 0; j < 6; j++){
//                System.out.println("hello world" + count++);
//            }
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.println("Outer for loop I: " + i + " Inner for loop J: " + j);
//            }
            for (int i = 1; i <= 10; i++){
                for (int j = 1; j <= 10; j++){
                    System.out.println (i +" x " + j+" = "+ i * j);
                }
//                System.out.print("World ");
        }
    }
}
