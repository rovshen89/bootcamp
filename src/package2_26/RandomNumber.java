package package2_26;

public class RandomNumber {
    public static void main(String[] args) {
        //System.out.println((int)(Math.random()*100));
//        generatePassword();
        System.out.println(generateStringNum());
    }
    public static void generatePassword(){
        for (int i = 0; i < 6; i++){
            System.out.print((int)(Math.random()*10));
        }
    }

    public static String generateStringNum(){
        String result = "";
        for (int i = 0; i < 6; i++){
            result += ((int)(Math.random()*10));
        }
        return result;
    }
}
