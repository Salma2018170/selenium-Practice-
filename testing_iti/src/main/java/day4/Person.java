package day4;

public abstract class Person {
    protected  int phoneNumber;
    protected String name;
    protected String email;
    private String password;
    protected  static String organisation="ITI";
    protected String branchName;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public abstract void singUp();
    public abstract void logIn();
}
