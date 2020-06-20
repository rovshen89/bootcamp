package firstpackage;

public class kahoo {
    public static void main(String[] args) {

        myCar("bmw");
        System.out.println(sumDigit( 10, 110));

        int[] array = {1,2,3,4};
        idPrinter(array);

    }

    public static void myCar(String car){
        switch (car){
            case "bmw":
                System.out.println("My favourite car is " + car);
                break;
            case "toyota":
                System.out.println("My car is" + car);
                break;
            default:
                System.out.println("Car is " + car);
        }
    }

    public static Integer sumDigit(int x, int y){
        return x + y;
    }

    public static double sumDigit(double x, double y){
        return x + y;
    }

    public static void idPrinter(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Array ID: " + arr);
        }
    }

    public static void arrayPrinter(int[] array){
        for(int i = 0; i < array.length; i++){

            if(array[i] == 3) continue;
            if(array[i] == 5) break;

            System.out.println("Array ID: " + array[i]);
        }
    }


}
