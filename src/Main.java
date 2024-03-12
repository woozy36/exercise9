import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {

        Email email1 = new Email("dumbhead@dumbemail.com");
        PhoneNumber number1 = new PhoneNumber("dumbhead@dumbemail.com");

        email1.contact();
        number1.contact();


    }
}

abstract class Contacts {

    public abstract void contact();

}

class Email extends Contacts{

    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("EMAIL " + email);
    }
}

class PhoneNumber extends Contacts{

    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("PHONE NUMBER " + phoneNumber);
    }
}