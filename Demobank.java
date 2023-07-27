public class Demobank {
    public static void main(String[] args) {
        Bank b;
        b = new Mbbank();
        System.out.println("lãi xuất của Mbbank là :" + b.getInterest());
        b = new Bidvbank();
        System.out.println("lãi xuất của Bidvbank là :" + b.getInterest());
        b = new Momobank();
        System.out.println("lãi xuất của Momobank là :" + b.getInterest());
    }
}
