package study.oops.interface_;

public class Main implements Electronics{
    @Override
    public void mobiles() {
        System.out.println("apple ");
    }

    @Override
    public void cars() {
        System.out.println("BMW");
    }
}
