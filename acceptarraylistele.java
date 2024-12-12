import java.util.*;
class fire{
    public static void main(String args[]){
        //accepting arraylist elements
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }//also we can add elements in dynamically
        a.add(89);
        System.out.println(a);
    }
}