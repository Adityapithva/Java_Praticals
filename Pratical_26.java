public class Pratical_26 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=20;i++){
                if(Thread.currentThread().getName() == "Thread1"){
                    if(i % 2 == 0){
                        System.out.println("Thread 1:"+i);
                    }
                }else{
                    if(i % 2 != 0){
                        System.out.println("Thread 2:" +i);
                    }
                }
            }   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Pratical_26 t1 = new Pratical_26();
        Pratical_26 t2 = new Pratical_26();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
