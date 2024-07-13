package web.service;

import web.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}
