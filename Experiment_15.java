import java.util.Random;

class Sqr extends Thread{
    int x;
    public Sqr(int val){
        x=val;
    }
    public void run(){
        double s = Math.pow(x,2) ;
        System.out.println("Square is for "+ x +"  is  "+ s);
    }
}

class cube extends Thread{
    int x;
    public cube (int val){
        x=val;
    }
    public void run(){
        double s = Math.pow(x,2) ;
        System.out.println("cube is "+ x +"  is  "+ s);
    }
}

class number extends Thread{

    Random r = new Random();
    public void run() {
        for (int i = 0; i < 11; i++) {
            int ran = r.nextInt();
            System.out.println("Random number generated is "+ ran);
            if (ran%2==0) {
                Sqr square = new Sqr(ran);
                square.start();
                square.setPriority(Thread.NORM_PRIORITY);
            }
            else{
                cube cb =new cube(ran);
                cb.start();
                cb.setPriority(Thread.NORM_PRIORITY);
            }


        }
    }
}

public class Experiment_15 {
    public static void main(String args[]){
            number nb = new number();
            nb.setPriority(Thread.MAX_PRIORITY);
            nb.start();
    }
}
