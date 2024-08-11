package com.example.servingwebcontent.services;

import com.example.servingwebcontent.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService{
    private long ID = 0;
    private List<User> users = new ArrayList<>();
    public List<User> listUsers(){return users;}
    public void saveUser(User user)
    {
        user.setID(++ID);
        users.add(user);
    }
    public void deleteUser(long id)
    {
        users.removeIf(user -> user.getID() == id);
    }
}
