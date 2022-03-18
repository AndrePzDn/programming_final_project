package users;

public abstract class User {
    private int id;
    private int ci;
    private String name;
    private String email;
    private String userPassword;
    private String nickName;
    private String gender;

    public User(int id, int ci, String email, String name, String userPassword, String nickName, String gender){
        this.id = id;
        this.ci = ci;
        this.email = email;
        this.userPassword = userPassword;
        this.nickName = nickName;
        this.gender = gender;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public int getCi(){
        return this.ci;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
    public String getNickname(){
        return this.nickName;
    }
    public String getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public void setNickname(String nickname){
        this.nickName = nickname;
    }
}
