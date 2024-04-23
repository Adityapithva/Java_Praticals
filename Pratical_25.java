public class Pratical_25 extends Thread{
    public void run(){
        try{
            if(Thread.currentThread().getName() == "Thread1"){
                System.out.println("Thread1");
                Thread.sleep(1000);
            }else{
                System.out.println("Thread2");
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Pratical_25 t1 = new Pratical_25();
        Pratical_25 t2 = new Pratical_25();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
