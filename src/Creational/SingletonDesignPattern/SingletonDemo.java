package Creational.SingletonDesignPattern;

/**
 * This class demonstrates the Singleton design pattern.
 * The Singleton pattern ensures that a class has only one instance,
 * and provides a global point of access to it.
 * Example : Database Connection, Logger, Configuration Manager, Runtime, etc.
 * Different ways to implement Singleton:
 * 1. Eager Initialization
 * 2. Lazy Initialization
 * 3. Thread-Safe Method
 * 4. Thread-Safe Block
 * 5. Double-Checked Locking
 * 6. Enum Singletons
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonEager singleton = SingletonEager.getInstance();
        System.out.println(singleton);
        SingletonEager singleton2 = SingletonEager.getInstance();
        System.out.println(singleton2);

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2);

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe);
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe2);

        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking = SingletonDoubleCheckedLocking.getInstance();
        System.out.println(singletonDoubleCheckedLocking);
        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking2 = SingletonDoubleCheckedLocking.getInstance();
        System.out.println(singletonDoubleCheckedLocking2);

        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
        System.out.println(singletonBillPugh);
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();
        System.out.println(singletonBillPugh2);
    }

}


/**
 * Eager Initialization
 * it will create instance even if it is not used
 */
class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}

/**
 * Lazy Initialization
 * it will not work if two threads comes in parallel
 */
class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {}
    public static SingletonLazy getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new SingletonLazy();
        return instance;
    }
}

/**
 * Thread-Safe Method
 * it will work if two threads comes in parallel, but it will slow down the performance
 */
class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe() {}
    public static synchronized SingletonThreadSafe getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new SingletonThreadSafe();
        return instance;
    }
}

/**
 * Double-Checked Locking
 * it will work if two threads comes in parallel, but it will slow down the performance
 */
class SingletonDoubleCheckedLocking {
    private static volatile SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {}
    public static SingletonDoubleCheckedLocking getInstance() {
        if(instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
                return instance;
            }
        }
        return instance;
    }
}

/**
 * Bill Pugh Singleton Implementation
 */

class SingletonBillPugh {
    private SingletonBillPugh() {}
    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

/**
 * Enum Singleton
 * 1 instance per JVM.
 */

enum SingletonEnum {
    INSTANCE;
}
