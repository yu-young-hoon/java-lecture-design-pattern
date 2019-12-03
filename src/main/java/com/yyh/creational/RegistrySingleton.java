package main.java.com.yyh.creational;

public class RegistrySingleton {
    private volatile static RegistrySingleton instance;

    private RegistrySingleton() { }

    public static RegistrySingleton getInstance() {
        if (instance == null) {
            synchronized (RegistrySingleton.class) {
                instance = new RegistrySingleton();
            }
        }
        return instance;
    }
}
