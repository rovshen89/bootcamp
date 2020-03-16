package package3_15;

public class StringOperations {
    String value;

    public StringOperations(){
        this.value = "";
    }

    public StringOperations(String value){
        this.value = value;
    }

    public String returnReversed(){
        String result="";
        for (int i=this.value.length()-1; i >= 0; i--){
            result += this.value.charAt(i);
        }
        return result;
    }

    public String returnCapital(){
        String result ="";
        String firstLetter = "";
        firstLetter += this.value.charAt(0);
        result+=firstLetter.toUpperCase();
        String letter = "";
        for (int i = 1; i < this.value.length(); i++){
            if (value.charAt(i-1) == ' '){
                letter += this.value.charAt(i);
                letter+=letter.toUpperCase();
                result+=letter;
                letter="";
            }
            else {
                result += this.value.charAt(i);
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "StringOperations{" +
                "value='" + value + '\'' +
                '}';
    }
}
