package users;

import java.util.ArrayList;

public class BasicFunctionOfUsers {

    ArrayList<User> userList;

    public BasicFunctionOfUsers(){
        ArrayList<User> list = new ArrayList<User>();
        this.userList = list;
    }
    
    public ArrayList<User> instantiateUsers(){
        User user0 = new UserAdmin(0, 76142363, "vebek33545@tonaeto.com", "Thiago Galan", "sinDavoL", "WrathCharge", "Male");
        User user1 = new UserAdmin(1, 62788958, "venojeihuta-5144@yopmail.com", "Valentin Morera", "OmBeiTyc", "NarrowVictory", "Male");
        User user2 = new UserAdmin(2, 97330028, "biprullamiffo-8039@yopmail.com", "Vicente Alvarado", "ETANTHEm", "ViperStrike", "Male");
        User user3 = new UserClient(3, 76350849, 0, 0, "braciwitefa-6891@yopmail.com", "Sheila Planas", "PeaseYwe", "HereSheIs", "Female");
        User user4 = new UserClient(4, 23114707, 0, 0, "vazauppusore-4510@yopmail.com", "Nuria Alamo", "ICHEBArD", "BellBoy", "Female");
        User user5 = new UserClient(5, 98126092, 0, 0, "xauroxaroiffa-6527@yopmail.com", "Emílio Sánchez", "alISIANd", "FlowerPower", "Male");
        User user6 = new UserClient(6, 29829424, 0, 0, "zeuddijugregre-5207@yopmail.com", "Amanda Sainz", "bRACtiOu", "Kittywake", "Female");
        User user7 = new UserClient(7, 42984587, 0, 0, "mipauketreufro-4850@yopmail.com", "Julieta Andrade", "FICHembn", "ParasiteTown", "Female");
        User user8 = new UserClient(8, 60381970, 0, 0, "woussotteubregru-6255@yopmail.com", "Eduard Yague", "AVerTUpa", "Blacklight", "Male");
        User user9 = new UserClient(9, 67873269, 0, 0, "praffaniceddau-2776@yopmail.com", "Erik Gamero", "TabySELi", "Safflower", "Male");

        this.userList.add(user0);
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        this.userList.add(user4);
        this.userList.add(user5);
        this.userList.add(user6);
        this.userList.add(user7);
        this.userList.add(user8);
        this.userList.add(user9);

        return this.userList;
    }
    public User logIn(String email, String password){
        User user = null;
        verificationOfUsers();
        for (int i = 0; i < this.userList.size(); i++){
            if (this.userList.get(i).getEmail().equalsIgnoreCase(email) && this.userList.get(i).getUserPassword().equalsIgnoreCase(password)){
                user = this.userList.get(i);
                return user;
            }
        }
        return user;
    }
    public void singUp(int ci, String email, String name, String userPassword, String nickName, String gender){
        verificationOfUsers();
        int size = this.userList.size()-1;
        this.userList.get(size);
        User user = new UserClient(size+1, ci, 0, 0, email, name, userPassword, nickName, gender);
        userList.add(user);
        size = this.userList.size()-1;
    }
    public void verificationOfUsers(){
        if (this.userList.size() == 0){
            this.userList = instantiateUsers();
        }
    }
}
