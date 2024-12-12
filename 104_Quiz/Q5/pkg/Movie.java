package pkg;

public class Movie{
    String Movie;
    double Rating;
    int Ratings;
    int Revenue;
    public Movie(){
        Movie = "Avengers";
        Rating = 8.0;
        Ratings = 33;
        Revenue = 623357910;
    }
    public Movie(String movie3, double rating3, int ratings3, int revenue3){
        Movie = movie3;
        Rating = rating3;
        Ratings = ratings3;
        Revenue =revenue3;
        
    }
    public void movieToString(){
        System.out.println("Movie"+ Movie);
        System.out.println("Rating"+ Rating);
        System.out.println("Ratings"+ Ratings);
        System.out.println("Revenue"+ Revenue);
        System.out.println(" ");
    }
    public String getMovieName(){
        return Movie;
    }
    public int getRevenue(){
        return Revenue;
    }

}
