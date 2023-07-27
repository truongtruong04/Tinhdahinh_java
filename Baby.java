public class Baby extends Dad {
    void face() {
        System.out.println(" like mother");
    }

    public static void main(String[] args) {
        Human t1, t2, t3;
        t1 = new Human();
        t2 = new Dad();
        t3 = new Baby();
        t1.face();
        t2.face();
        t3.face();

    }
}
