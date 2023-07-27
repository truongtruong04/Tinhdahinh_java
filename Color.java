public class Color extends Bike {
    void run() {
        System.out.println("đạp với tốc độ 50km");
    }

    public static void main(String[] args) {
        Bike t = new Color();
        t.run();
    }
}
