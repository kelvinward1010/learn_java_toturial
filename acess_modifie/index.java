package acess_modifie;

public class index {
    public static void main(String[] args) {
        Asubs.main(args);
    }
}

class A {
    public      String publicMessage = "This is a message published";
    protected   String protectedMessage = "This is a message protected";
                String defaultMessage = "This is a default message";
    private     String privateMessage = "This is a private message";
}


class Asubs extends A{
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.publicMessage + "\n" + a.defaultMessage);
    }
}