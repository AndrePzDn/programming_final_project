package users;

public class UserClient extends User {

    private int points;
    private int cups;

    public UserClient(int id, int points, int cups, String email, String name, String userPassword, String nickName, String gender){
        super(id, email, name, userPassword, nickName, gender);
        this.points = points;
        this.cups = cups;
        
    }
    public int getPoints(){
        return this.points;
    }
    public int getCups(){
        return this.cups;
    }
    public void setPoints(int points){
        this.points = points;
    }
    public void setCups(int cups){
        this.cups = cups;
    }
}
