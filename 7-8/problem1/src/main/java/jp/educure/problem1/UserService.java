package jp.educure.problem1;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserDetails() {
        return "User details accessed.";
    }
}
