package ArrayList;

public class EnumMonth {
    enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        Month myMonth = Month.DECEMBER;
        if (myMonth == Month.DECEMBER){
            System.out.println("Snow time");
        }else if (myMonth == Month.FEBRUARY){
            System.out.println("Birthday");
        }else if (myMonth == Month.JUNE){
            System.out.println("Break time");
        }else if (myMonth == Month.SEPTEMBER){
            System.out.println("School time");
        }


    }
}
