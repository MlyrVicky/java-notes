package study.oops.method_overloding;

public class ThailanMillks {

    public static void main(String[] args) {
        millksStrore(200,150,80);


    }




    public static void millksStore(){

        System.out.println("melnariyappanur");
    }

    public static String millksStore(String storeName){

        return "Thailan_cake_store";
    }

    public static void millsStore(int millkPrice, int cakePrice){



        System.out.println("millkPrice :" + millkPrice + "\n" + "cakePrice : " +cakePrice);

    }

    public static void millksStrore(int curdPrice , int butterPrice, int IceCreamPrice){
        System.out.println("curdPrice : " +curdPrice+ "\n" + "butterPrice : " +butterPrice +"\n" + "IceCreamPrice : " +IceCreamPrice);
    }

    public static void millkStrore(String storeName1, String storeName2, String storeName3){

        System.out.println("storeName :"+storeName1 + "\n" + "storeName2 :" +storeName1 +"\n"+ "storeName3 : "+ storeName3);
    }


}
