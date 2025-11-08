
package movie;

public class Movie {
    
    private String title;
    private String director;
    private int duration; 

   
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

   
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    
    public String getMovieDetails() {
        return "Movie Title: " + title + "\nDirector: " + director + "\nDuration: " + duration + " minutes";
    }

   
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(148);

        
        System.out.println(movie.getMovieDetails());
    }
}
