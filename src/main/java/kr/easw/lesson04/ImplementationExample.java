package kr.easw.lesson04;

public class ImplementationExample {

    public static void main(String[] args) {
        if (onTest(1000).equals("TestValue - 34300")) {
            System.out.println("정답입니다.");
            return;
        }
        System.out.println("오답입니다.");
    }

    private static String onTest(int value) {
        TestClass testClass = new TestClass();
        return testClass.eval(testClass.getString(), value);
    }


    private static class TestClass {
        public String getString() {
            return "TestValue";
        }

        public String eval(String first, int data) {
            int result = ((data / 2) * 7 * (int)Math.pow(3, 2)) / 5;
            return first + " - " + result;
        }
    }
}
