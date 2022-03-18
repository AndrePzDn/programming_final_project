package tests.user_tests;

import junit.framework.TestCase;
import users.User;
import users.UserAdmin;
import users.UserClient;

public class TestUsers extends TestCase {
    public User user;
    public UserClient userClient;
    public void testUser(){
        user = new UserClient(
            1,
            2483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertNotNull(user);
    }

    public void testUserId(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals(1, user.getId());
    }
    public void testUserCi(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals(12483137, user.getCi());
    }
    public void testUserEmail(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals("perdurandy@hotmail.com", user.getEmail());
    }
    public void testUserName(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals("Andre", user.getName());
    }
    public void testUserPassword(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals("safe_password", user.getUserPassword());
    }
    public void testUserNikname(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals("AndrePzDn", user.getNickname());
    }
    public void testUserGender(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        assertEquals("Male", user.getGender());
    }
    public void testSetUserCi(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        user.setEmail("asd");
        assertEquals("asd", user.getEmail());
    }
    public void testSetUserName(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        user.setName("Bernardo");
        assertEquals("Bernardo", user.getName());
    }
    public void testSetUserPassword(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        user.setUserPassword("Contraseña_segura");
        assertEquals("Contraseña_segura", user.getUserPassword());
    }
    public void testSetUserNickname(){
        user = new UserAdmin(
            1,
            12483137,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        user.setNickname("Amazing_nickname");
        assertEquals("Amazing_nickname", user.getNickname());
    }
    public void testGetPointsOfUserClient(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        UserClient userClient = (UserClient) user;
        assertEquals(0, userClient.getPoints());
    }
    public void testSetPointsOfUserClient(){
        user = new UserClient(
            1,
            12483137,
            0,
            0,
            "perdurandy@hotmail.com",
            "Andre",
            "safe_password",
            "AndrePzDn",
            "Male"
        );
        UserClient userClient = (UserClient) user;
        userClient.setPoints(userClient.getPoints()+10);
        assertEquals(10, userClient.getPoints());
    }
}
