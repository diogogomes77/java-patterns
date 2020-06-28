package dev.dgomes.singleton;

public class CheeseBurger {

    // lazy way
    private static CheeseBurger instanceA;
    public static synchronized CheeseBurger getInstanceA() {
        if (instanceA == null) {
            instanceA = new CheeseBurger();
        }
        return instanceA;
    }

    // eager way
    private static CheeseBurger instanceB = new CheeseBurger();
    public static synchronized CheeseBurger getInstanceB() {
        return instanceB;
    }

    // double-check locking
    private volatile static CheeseBurger instanceC;
    public static CheeseBurger getInstance(){
        if(instanceC == null){
            synchronized (CheeseBurger.class) {
                if (instanceC == null) {
                    instanceC = new CheeseBurger();
                }
            }
        }
        return instanceC;
    }

}
