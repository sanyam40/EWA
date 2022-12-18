import java.util.HashMap;
import java.util.Scanner;

public class canvas_p7{

    public Boolean func(){
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>map1=new HashMap<String,String>();
        System.out.println("1.ADD 2.REMOVE 3.MODIFY GRADES 4.PRINT_ALLGRADES");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.print("ENTER NAME : ");
            String name=sc.next();
            System.out.print("ENTER GRADE : ");
            String Grade=sc.next();
            map1.put(name,Grade);
            System.out.println(map1.entrySet());
            break;

            case 2:
            System.out.println("ENTER NAME U WANT TO REMOVE");
            String a=sc.next();
            map1.remove(a);
            System.out.println(map1.entrySet());
        }
        System.out.print("WANT TO PERFROM MORE OPERATIONS : ");
        int m=sc.nextInt();
        if(m==1){
            return false;
        }
        else return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        canvas_p7 p1=new canvas_p7();
        boolean a=p1.func();
        if(a==true){
            p1.func();
        }

        
    }

}