public class multithreading {

 public static void main(String[] args) {
  Shared sp = new Shared();
  Thread t1 = new Thread(new EvenNumProducer(sp, 1000));
  Thread t2 = new Thread(new OddNumProducer(sp, 1000));
  t1.start();
  t2.start();
 }

}

class Shared{
 boolean evenFlag = false;

 public void printEvenNum(int num){
  synchronized (this) {
   while(!evenFlag){
    try {

     wait();
    } 
    catch (Exception e) {
      System.out.println("Exception caught");
    }
   }
   System.out.println(num);
   evenFlag = false;
   notify();
   
  }
  
 }
 
 public void printOddNum(int num){
  synchronized (this) {
   while(evenFlag){
    try {
     wait();
    } catch (InterruptedException e) {
      System.out.println(e);
    }
   }
   System.out.println(num);
   evenFlag = true;
   notify();
   
  }
 }
}

class EvenNumProducer implements Runnable{
    Shared sp;
    int index;
    EvenNumProducer(Shared sp, int index){
        this.sp = sp;
        this.index = index;
    }
    @Override
    public void run() {
        for(int i = 2; i <= index; i = i+2){
            sp.printEvenNum(i);
        }
        
    }
    
}

class OddNumProducer implements Runnable{
    Shared sp;
    int index;
    OddNumProducer(Shared sp, int index){
        this.sp = sp;
        this.index = index;
    }
    @Override
    public void run() {
        for(int i = 1; i <= index; i = i+2){
            sp.printOddNum(i);
        }
    }
}