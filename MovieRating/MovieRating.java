import javax.sound.sampled.SourceDataLine;

public class MovieRating {
    private String title;
    private double cumulativeRating;
    private int numRatings;

    public MovieRating(String title) {
        this.title = title;
    }

    // TODO: Implement your compareTo method here:
    public int compareTo(MovieRating other) {
        
        if (this.cumulativeRating < other.cumlativeRating) {
            return -1;
        } else if (this.cumulativeRating > other.cumlativeRating) {
            return 1;
        } 
        return 0;
    }

    public String movieTitle() {
        return title;
    }

    public double averageRating() {
        if (numRatings == 0) {
            return Double.NaN;
        }
        return cumulativeRating / numRatings;
    }

    public void addRating(double rating) {
        cumulativeRating += rating;
        numRatings++;
    }

    public String toString() {
        return movieTitle() + " -- " + averageRating();
    }
}
