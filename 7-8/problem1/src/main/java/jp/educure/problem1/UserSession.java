package jp.educure.problem1;

import org.springframework.stereotype.Component;

@Component
public class UserSession {
    private boolean loggedIn = true; // 本当は認証処理で切り替える

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}