package package3_15;

public class Shapes {
    char symbol;
    int width;
    int height;
    boolean space;

    public Shapes(){
        this.symbol = '*';
        this.width = 10;
        this.height = 10;
        this.space = true;
    }

    public Shapes(char symbol, int width, int height, boolean space) {
        this.symbol = symbol;
        this.width = width;
        this.height = height;
        this.space = space;

    }

    public void printPyramid(){
        for(int i = 0; i < this.height; i++){
            for (int j = 0; j < i; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public void printPyramid(boolean space){
        for (int i = 0; i < this.height; i++){
            for (int j = 0; j < i; j++){
                if (space) {
                    System.out.print(symbol);
                }else{
                    System.out.print("-" + symbol);
                }
            }
            System.out.println();
        }
    }
}
