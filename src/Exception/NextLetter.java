package Exception;

public class NextLetter {
    String sentence;

    public NextLetter(){

    }

    public NextLetter(String sentence){
        this.sentence = sentence;
    }

    public void printNextLetter(){
        char letter;
        try{
            for (int i = 0; i < this.sentence.length(); i++){
                letter = this.sentence.charAt(i);
                letter++;
                System.out.print(letter);
            }
        }catch (NullPointerException e){
            System.out.println("String is null!");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("You exceeded ");
        }catch (Exception e){
            System.out.println("Exception occured");
        }
    }
}
