// EWA LAB WORK -- 2 sep
import java.util.*;

class cse implements Comparator<cse>{
    String Batch;
    int no_of_students;

    cse(String b,int n){
        this.Batch=b;
        this.no_of_students=n;
    }
    void printobj(){
        System.out.println(this.Batch+" "+this.no_of_students);
    }
    public int compare(cse A, cse B) {
        if(A.no_of_students<B.no_of_students){
            return -1;
        }
        else{
            return 1;
        }
    }
}

    class fillarray{
        Scanner sc=new Scanner(System.in);
        ArrayList<cse>AL=new ArrayList<cse>();

        fillarray(){
            for(int i=0;i<3;i++){
                System.out.print("ENTER BATCH : ");
                String batch=sc.next();
                System.out.print("ENTER NO OF STUDNTS : ");
                int no_of_students=sc.nextInt();
                AL.add(new cse(batch,no_of_students));
            }
        }

        void print(){
            for(cse A:AL){
                A.printobj();
            }
        }
    }

    class work{
        public static void main(String[] args) {
            fillarray ab=new fillarray();
            ab.print();
        }
    }
    
