package in.java.task.task1.task11;
public class Runner {

    public static void main(String[] args) {

        Subclass subclass = new Subclass();

        // Call implemented abstract methods
        subclass.method1();
        subclass.method2();
        subclass.method3();
        subclass.method4();
        subclass.method5();
        subclass.method6();
        subclass.method7();
        subclass.method8();
        subclass.method9();
        subclass.method10();

        // Call overridden default methods from subclass
        subclass.defaultMethod1();
        subclass.defaultMethod2();

        // Call static methods from interface
        MultiPurposeInterface.staticMethod1();
        MultiPurposeInterface.staticMethod2();
        MultiPurposeInterface.staticMethod3();
        MultiPurposeInterface.staticMethod4();
        MultiPurposeInterface.staticMethod5();
        MultiPurposeInterface.staticMethod6();
        MultiPurposeInterface.staticMethod7();
        MultiPurposeInterface.staticMethod8();
        MultiPurposeInterface.staticMethod9();
        MultiPurposeInterface.staticMethod10();
    }
}

