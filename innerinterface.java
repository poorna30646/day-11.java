import java.util.*;
    interface out{
        void outm();
        interface in{
            void innm();
        }
    }
    class  main implements out.in{
        public void innm(){
            System.out.println("hello iam in inner method");
        }
        public static void main(String args[]){
            main h=new main();
            
        }
    }

