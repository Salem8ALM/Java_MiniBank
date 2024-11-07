package Bank;
import java.util.ArrayList;
import java.util.List;

public class BankSingleton{
    private List<User> users;

    private static BankSingleton instance;

    private BankSingleton(){
        users = new ArrayList<>();

    }

    public static BankSingleton getInstance() {
        if (instance == null){
            instance = new BankSingleton();
        }
        return instance;
    }


    public User createUser (String username, String password){
        for (User user : users ){
            if (user.getUsername().equals(username)){
                throw new IllegalArgumentException("A user with this username already exists.");
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;

    }
    public User authenticate(String username, String password) {

        for (User user : users) {
            if (user.getUsername() == username && user.getPassword() == password) {

                return user;

            };
        }
        return null;
    }

    public void removeUser(String user){
        users.remove(user);
    }
}
