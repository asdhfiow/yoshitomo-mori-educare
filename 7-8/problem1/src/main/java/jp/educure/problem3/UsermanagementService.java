package jp.educure.problem3;

import org.springframework.stereotype.Service;

@Service
public class UsermanagementService {

    private final UserRepository userRepository;

    public UsermanagementService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        try {
            userRepository.save(user);
            onUserSaved(user); 
        } catch (Exception e) {
            onUserSaveError(user, e);  
        }
    }

    // 成功時の処理をここにまとめる
    private void onUserSaved(User user) {
        System.out.println("User saved: " + user.getName() + ", " + user.getEmail());
    }

    // 失敗時の処理をここにまとめる
    private void onUserSaveError(User user, Exception e) {
        System.out.println("Exception while saving user: Error: " + e.getMessage());
    }
}
