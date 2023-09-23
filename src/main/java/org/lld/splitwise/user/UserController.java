package org.lld.splitwise.user;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    // todo: CRUD for users.
    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserId(String id){
        for(User user: users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
}
