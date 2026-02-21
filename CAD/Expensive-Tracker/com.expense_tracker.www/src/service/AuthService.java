package service;

import exception.AuthenticationException;
import model.User;
import repository.UserRepository;

public class AuthService {

    private UserRepository repo =
            UserRepository.getInstance();

    public void login(String username, String password) {

        User user = repo.findByUsername(username);

        if (user == null)
            throw new AuthenticationException("Invalid username");

        if (!user.getPassword().equals(password))
            throw new AuthenticationException("Invalid password");
    }
}
