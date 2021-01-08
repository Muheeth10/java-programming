import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;


class Fibonacii extends Thread{
    PipedWriter fr =new PipedWriter();
    public void run(){
        super.run();
        fibo();
    }

    void wrt(int n){
        try{
            fr.write(n);
        }
        catch(IOException e) {
            System.out.print("An exception occurred");
        }
    }

    void fibo(){
        int a=0,b=1,c;
        wrt(a);
        for(int i=0;i<=10;i++){
            c=a+b;
            a=b;
            wrt(b);
            b=c;
            if(i==(10-2)){
                wrt(c);
            }
        }
    }
}

class Prime extends Thread{
    PipedWriter pr= new PipedWriter();

    public void run(){
        super.run();
        prime();
    }
    void wrt2 (int n){
        try{
            pr.write(n);
        }
        catch(IOException e) {
            System.out.print("An exception occurred");
        }
    }
    void prime(){
        for(int i=2;i<10;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }
                if(count==1 && j==i){
                    wrt2(i);
                }
            }
        }
    }
}

class Receiver extends Thread{
    PipedReader pwr,fwr;
    public Receiver(Fibonacii fb, Prime pri) throws IOException{
        fwr = new PipedReader(fb.fr);
        pwr = new PipedReader(pri.pr);
    }

    public void run(){
        int fib_read=0,pri_read=0;
        try{
            fib_read = fwr.read();
            pri_read = pwr.read();
        }
        catch (IOException e){

        }

        while(true){
            try {
                if (fib_read == pri_read) {
                    System.out.println(fib_read);
                    fib_read = fwr.read();
                    pri_read= pwr.read();
                }
                else if(fib_read > pri_read){
                    pri_read = pwr.read();
                }
                else{
                    fib_read= fwr.read();
                }
            }
            catch (IOException e){
                System.exit(-1);
            }
        }
    }
}

public class Experiment_14{
    public static void main (String args[]) throws IOException{
        Fibonacii fi = new Fibonacii();
        Prime pi = new Prime();
        Receiver re = new Receiver(fi,pi);
        fi.start();
        pi.start();
        try{
            pi.join();
            fi.join();
        }
        catch (Exception e){
        }
        re.start();
    }
}