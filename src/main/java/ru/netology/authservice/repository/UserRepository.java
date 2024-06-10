package ru.netology.authservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authservice.Authorities;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public class UserRepository {
    private ConcurrentMap<String, String> users = new ConcurrentHashMap<String, String>();
    private ConcurrentMap<String, List<Authorities>> userAuthorities = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {

        if (users.containsKey(user)) {
            if (users.get(user).equals(password)) {
                return userAuthorities.get(user);
            }
        }
        return null;
    }
}
