package movies;

public class Movie {
    private int id;
    private int count;
    private String name;
    private String gender;
    private String duration;
    private String premiere;
    private String synopsis;
    private int ranking;

    public Movie(int id, int count, String name, String gender, String duration, String premiere, String synopsis, int ranking){
        this.id = id;
        this.count = count;
        this.name = name;
        this.gender = gender;
        this.duration = duration;
        this.premiere = premiere;
        this.synopsis = synopsis;
        this.ranking = ranking;
    }

    public int getId(){
        return this.id;
    }
    public int getCount(){
        return this.count;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getDuration(){
        return this.duration;
    }
    public String getPremiere(){
        return this.premiere;
    }
    public String getSynopsis(){
        return this.synopsis;
    }
    public int getRanking(){
        return this.ranking;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public void setPremiere(String premiere){
        this.premiere = premiere;
    }
    public void setSynopsis(String synopsis){
        this.synopsis = synopsis;
    }
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
}
