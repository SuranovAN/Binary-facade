public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String result1 = bins.sum("0011", "1101");
        String result2 = bins.mult("1010", "0101010101");
        System.out.println(result1 + "\n" + result2);
    }
}
