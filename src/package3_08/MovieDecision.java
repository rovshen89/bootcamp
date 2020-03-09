package package3_08;

public class MovieDecision {
    public static void main(String[] args) {
        decideMoview(5.6, 84500, 154000.89);
    }

    public static void decideMoview(double imdb, double totalVotes, double boxOffice){
        if ((imdb * totalVotes / boxOffice)>10){
            System.out.println("Watch the Movie");
        }
        else {
            System.out.println("Do not watch the movie");
        }
    }
}
