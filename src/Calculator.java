public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
            return num1 + num2;
        }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 7);
        int result = calculator.add();
        System.out.println("Hasil penjumlahan: " + result);
    }
}
