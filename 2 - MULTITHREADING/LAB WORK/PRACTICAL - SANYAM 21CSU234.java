// SANYAM 21CSU234 FS-III-A
// EWA MID TERM TEST 

class SmokerThread extends Thread{
    int matches=0;
    int paper=0;
    int tobacco=0;
}

class Agent extends Thrrad{
        wait(donesmoking);
        int r=rand()%3;
        switch(r){
            case 0:
            signal(tabacco,paper);
            break;

            case 1 :
            signal(matches,tabacco);
            break;

            case 2 :
            signal(paper,matches);
            break;
        }

        void smoker(){
            while(true){
                wait(matches,tabacco);
                smoke();
                signal(donesmoking);
            }
        }
    }

public class PRACTICAL{
    public static void main(String[] args) {
        Agent t1=new Agent();
        t1.start();
        
    }
}    

        
