package study.oops.interface_;

public class MainFun implements Electronics ,Vehicle{

    @Override
    public void mobiles() {
        System.out.println("apple");
    }

    @Override
    public void cars() {
        System.out.println("Range Rover ");
    }


    @Override
    public void car() {
        System.out.println("BMW");
    }

    @Override
    public void heavyVehicle() {
        System.out.println( "truck");
    }

    public static void main(String[] args) {
        MainFun mainFun = new MainFun();
        mainFun.car();
        mainFun.heavyVehicle();
    }
}
