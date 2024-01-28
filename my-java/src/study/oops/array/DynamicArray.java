package study.oops.array;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);

        for(int i = 0 ;i<=arrayList.size();i++){


            System.out.println(arrayList.get(i));
        }
    }
}
