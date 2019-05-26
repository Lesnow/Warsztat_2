package pl.coderslab;

public class Main {

    public static void main(String[] args) {
    User user = new User("randomUser", "newRandom@gmail.com", "hasło");
    UserDao userDao = new UserDao();
    User createUser = userDao.create(user);
    System.out.println(user.getId());
    }
}
