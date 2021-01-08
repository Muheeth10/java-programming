class implement{
    int n;
    boolean valueset = false;


    void exception(){
        try{
            wait();
        }
        catch(Exception e){
            System.out.println("An exception as occurred"+e);
        }
    }
    void waiting(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Exception occurred : "+e);
        }
    }
    synchronized int put(int n){
        if(valueset){
            exception();
        }
        this.n=n;
        this.valueset = true;
        System.out.println("put : "+n);
        waiting();
        notify();
        return n;
    }
    synchronized int get(){
            if(!valueset){
                exception();
            }

            this.valueset = false;
            System.out.println("get : "+n);
            waiting();
            notify();
            return n;

        }
}

class Producer implements Runnable{
    implement t;

    public Producer(implement t){
        this.t=t;
        new Thread(this,"Producer") .start();
    }

    public void run(){
        int i=0;
        while (true){
            t.put(i++);
        }
    }
}

class Consumer implements Runnable{
    implement t;

    Consumer(implement t){
        this.t=t;
        new Thread(this,"Consumer").start();
    }

    public void run(){
        int i=0;
        while(true){
            t.get();
        }
    }

}

public class Experiment_16 {
    public static void main(String args[]){
        implement t = new implement();
        new Producer(t);
        new Consumer(t);
        System.out.println("Press Control+c to exit");
    }
}