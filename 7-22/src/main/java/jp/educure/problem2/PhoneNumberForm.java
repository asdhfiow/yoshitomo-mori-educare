package jp.educure.problem2;

import jakarta.validation.constraints.NotBlank;

public class PhoneNumberForm {

    @NotBlank(message = "電話番号は必須入力です")
    @ValidPhoneNumber
    private String phoneNumber;

    // getter & setter
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
