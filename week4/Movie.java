package week4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    Movie(String title,String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public Movie[] getPG(Movie[] films){
        Movie[] pgFilms=new Movie[films.length];
        int pointer=0;
        for(int i=0;i<films.length;i++){
            if(films[i].rating.toUpperCase()=="PG"){
                pgFilms[pointer++]=films[i];
            }
        }
        return pgFilms;
    }
    public static void main(String[] args){
        Movie film=new Movie("Casino Royale", "Eon Productions","PG-13");
    }
}
