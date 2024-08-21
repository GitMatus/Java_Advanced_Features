package com.sda.advanced.collections.inner;

public class OuterClass {

    private int number = 10;

    public void hello() {
        System.out.println("hello from outer class");
        class LocalClass {
            private int number = 30;

            public void hello() {
                System.out.println("hello from local class");
            }

            @Override
            public String toString() {
                return "LocalClass{" +
                        "number=" + number +
                        '}';
            }
        }

        LocalClass localClass = new LocalClass();
        System.out.println(localClass);
        localClass.hello();
    }

    @Override
    public String toString() {
        return "Outer{" +
                "number=" + number +
                '}';
    }

    public class InnerClass {

        private int number = 5;

        public void hello() {
            System.out.println("hello from inner class");
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "number=" + number +
                    '}';
        }
    }

    public static class NestedClass {
        private int number = 20;

        public void hello() {
            System.out.println("hello from nested class");
        }

        @Override
        public String toString() {
            return "nextedClass{" +
                    "number=" + number +
                    '}';
        }
    }
}
