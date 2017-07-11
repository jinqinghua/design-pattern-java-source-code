package chapter16.sample02;


public class Client {
    public static void main(String[] args) {
        AbstractUserManager userManager = new UserManagerProxy();

        User t = new User(1L);
        userManager.create(t);
        userManager.update(t);
        userManager.findById(1L);
        userManager.deleteById(1L);
        userManager.findAll();
    }
}
