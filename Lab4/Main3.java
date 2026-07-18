class Movie {

    private String rating;
    private int idNumber;
    private String title;

    public Movie(String rating, int idNumber, String title) {
        this.rating = rating;
        this.idNumber = idNumber;
        this.title = title;
    }

    // Setters
    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters
    public String getRating() {
        return rating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Movie) {
            Movie m = (Movie) obj;
            return this.idNumber == m.idNumber;
        }

        return false;
    }

    // Default late fee = $2/day
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}

// Action Movie
class Action extends Movie {

    public Action(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 3.0;
    }
}

// Comedy Movie
class Comedy extends Movie {

    public Comedy(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5;
    }
}

// Drama Movie
class Drama extends Movie {

    public Drama(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}

public class Main3 {

    public static void main(String[] args) {

        Action actionMovie = new Action("PG-13", 101, "Avengers");
        Comedy comedyMovie = new Comedy("PG", 102, "Home Alone");
        Drama dramaMovie = new Drama("R", 103, "Titanic");

        System.out.println("Movie Details");
        System.out.println("----------------------------");

        System.out.println("Title : " + actionMovie.getTitle());
        System.out.println("Rating: " + actionMovie.getRating());
        System.out.println("Late Fee (5 Days): $" + actionMovie.calcLateFees(5));

        System.out.println();

        System.out.println("Title : " + comedyMovie.getTitle());
        System.out.println("Rating: " + comedyMovie.getRating());
        System.out.println("Late Fee (5 Days): $" + comedyMovie.calcLateFees(5));

        System.out.println();

        System.out.println("Title : " + dramaMovie.getTitle());
        System.out.println("Rating: " + dramaMovie.getRating());
        System.out.println("Late Fee (5 Days): $" + dramaMovie.calcLateFees(5));

        System.out.println();

        Movie movie = new Movie("PG", 101, "Another Movie");

        if (actionMovie.equals(movie))
            System.out.println("Action movie and Movie object are Equal (Same ID Number).");
        else
            System.out.println("Objects are Not Equal.");
    }
}