public class FloaringPointTest {
    public static void main(String[] args) {
        float value = 1.36f;
        double value2 = 1.36;
        System.out.println(value == value2);

        float value3 = 0.1f;
        value3 += 0.6f;
        System.out.println(value3);

        float frac = 1 / 49;
        System.out.println(frac * 49.0);
        
        double frac2 = 1.0 / 49.0;
        System.out.println(frac2 * 49.0);
    }
}
