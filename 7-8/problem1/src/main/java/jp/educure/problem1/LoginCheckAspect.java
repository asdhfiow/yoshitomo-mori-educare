package jp.educure.problem1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginCheckAspect {

    private final UserSession userSession;

    public LoginCheckAspect(UserSession userSession) {
        this.userSession = userSession;
    }

    @Before("execution(* jp.educure.problem1.UserService.getUserDetails(..))")
    public void checkLogin() {
        if (!userSession.isLoggedIn()) {
            throw new IllegalStateException("Exception: User must be logged in to access this method.");
        }
    }
}
