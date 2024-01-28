package study.oops.apstract;

public class MainElectronics extends Electronics {
    @Override
    void mobiles() {

        System.out.println("apple");
    }

    @Override
    void laptop() {
        System.out.println("mac apple ");
    }

    @Override
    String cars() {
        String car = "Range Rover";

        System.out.println(car);

        return car;
    }

    public static void main(String[] args) {
        MainElectronics opj = new MainElectronics();

       // opj.cars();
          opj.laptop();
        //  opj.mobiles();
    }
}
