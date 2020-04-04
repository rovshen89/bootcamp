package package3_17;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myIns = new CarInsurance(2015, 0, 0);
        double myOffer = myIns.makeOffer(2020);
        System.out.println(myOffer);
        CarInsurance second = new CarInsurance(2019, 0,0);
        System.out.println(second.makeOffer(2020));

//        String name = "enisret";
//        for (int i = name.length()-1; i >=0; i--){
//            System.out.print(name.charAt(i));
//        }


    }
}
