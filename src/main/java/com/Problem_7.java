package com;

public class Problem_7 {
    class A {
        private int aValue;
        private B bValue = null;

        public A() {
            aValue = 0;
//            bValue = new B();
        }

        public A(B b){
            aValue = 0;
            bValue = new B();
        }

        @Override
        public String toString() {
            return "";
        }
    }

    class B {
        private int bValue;
        private A aInstance = null;

        public B() {
            bValue = 10;
            aInstance = new A();
        }

        public B(A a){
            bValue = 10;
            aInstance = new A();
        }

        @Override
        public String toString() {
            return "";
        }
    }

    public static void main(String[] args) {
        A obj = new Problem_7().new A(new Problem_7().new B());
        System.out.println(obj.toString());
    }

}
