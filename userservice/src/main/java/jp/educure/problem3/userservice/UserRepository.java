package jp.educure.problem3.userservice;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String getUserData() {
        return "Sample User Data";
    }
}
