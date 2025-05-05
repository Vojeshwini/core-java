package in.java.task.task12;
public class Runner {

    public static void main(String[] args) {
        // Anonymous class implementation of the interface
        MultiPurposeInterface obj = new MultiPurposeInterface() {

            // Implementing all 10 abstract methods
            @Override
            public void method1() {
                System.out.println("Anonymous Class: Implemented method1");
            }

            @Override
            public void method2() {
                System.out.println("Anonymous Class: Implemented method2");
            }

            @Override
            public void method3() {
                System.out.println("Anonymous Class: Implemented method3");
            }

            @Override
            public void method4() {
                System.out.println("Anonymous Class: Implemented method4");
            }

            @Override
            public void method5() {
                System.out.println("Anonymous Class: Implemented method5");
            }

            @Override
            public void method6() {
                System.out.println("Anonymous Class: Implemented method6");
            }

            @Override
            public void method7() {
                System.out.println("Anonymous Class: Implemented method7");
            }

            @Override
            public void method8() {
                System.out.println("Anonymous Class: Implemented method8");
            }

            @Override
            public void method9() {
                System.out.println("Anonymous Class: Implemented method9");
            }

            @Override
            public void method10() {
                System.out.println("Anonymous Class: Implemented method10");
            }
        };

        // Call implemented abstract methods
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
        obj.method8();
        obj.method9();
        obj.method10();

        // Call default methods from interface (no override)
        obj.defaultMethod1();
        obj.defaultMethod2();

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
