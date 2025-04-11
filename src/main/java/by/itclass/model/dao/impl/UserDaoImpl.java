package by.itclass.model.dao.impl;

import by.itclass.model.dao.UserDao;
import by.itclass.model.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAllUsers() {
        return new ArrayList<>();
    }
}
