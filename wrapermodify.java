import java.util.*;
class fire{
    public static void main(String args[]){
        ArrayList<Integer> a= new ArrayList<>();
        a.add(345);
        a.add(234);
        a.add(455);
        //addding particular index
        a.add(1,1000);
        //modifying
        a.set(2,2304);
        System.out.println(a);
    }
}