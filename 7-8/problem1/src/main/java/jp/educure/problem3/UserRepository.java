package jp.educure.problem3;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void save(User user) {
        // モック: 特定のメールなら例外を投げる
        if ("error@example.com".equals(user.getEmail())) {
            throw new RuntimeException("Unable to save user with email " + user.getEmail());
        }
    }
}
