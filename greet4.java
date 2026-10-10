
public class greet4 {

    void powercal(int volt, int current) {
        int power = volt * current;

        System.out.println("The value of power is " + power);
    }

    public static void main(String[] args) {
        greet4 obj = new greet4();

        obj.powercal(12, 2);
    }
}
