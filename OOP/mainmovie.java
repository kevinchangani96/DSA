package OOP;

public class mainmovie {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers","Marvel","4 star");
        Movie m2 = new Movie("KGF","hombale","5 star");
        Movie m3 = new Movie("RRR","AAA");
        Movie m4 = new Movie("Abc","Marvel","5 star");

        Movie[] movies = new Movie[4];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;

        Movie.get5StarMovies(movies);
    }
}
class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title,String studio,String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }
    public static void get5StarMovies(Movie[] movies){
        int count = 0;
        for(int i = 0; i < movies.length; i++){
            if(movies[i].rating.equals("5 star")){
                count++;
            }
        }
        Movie[] fiveStarMovies = new Movie[count];
        int index = 0;
        for(int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("5 star")) {
                fiveStarMovies[index] = movies[i];
                index++;
            }
        }
        for(int i = 0; i < fiveStarMovies.length; i++){
            System.out.println(fiveStarMovies[i].title+" "+fiveStarMovies[i].studio+" "+fiveStarMovies[i].rating);
        }
    }
}

