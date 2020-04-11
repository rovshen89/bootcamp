package Train;

public class Long {
    public static void main(String args[])
    {
        //JAVA LONG ARRAY DECLARATION
        long a[];
        //MEMORY ALLOCATION FOR JAVA LONG ARRAY
        a = new long[4];
        //ASSIGNING ELEMENTS TO JAVA LONG ARRAY
        a[0] = 100000L;
        a[1] = 300000L;
        a[2] = 400000L;
        a[3] = 786777L;
        //LONG ARRAY OUTPUT
        System.out.println("Java long Array Example");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Element at Index : "+ i + " " + a[i]);
        }
    }
}
