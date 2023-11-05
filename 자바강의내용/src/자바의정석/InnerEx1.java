package 자바의정석;

class InnerEx1 {
    class InstanceInner {
        int iv = 100;
        static int cv = 100;
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
    }
}

class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner();
    }

    void instanceMethod() {

    }
}