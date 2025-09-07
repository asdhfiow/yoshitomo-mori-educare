package jp.educure.problem5;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getter
    public String getName() { return name; }
    public String getEmail() { return email; }
}
