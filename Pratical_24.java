class InSufficientAmount extends RuntimeException{
    private String message;
    InSufficientAmount(String message){
        super(message);
        this.message = message;
    }
}
class Bank{
    int balance = 25000;
    public void withdraw(int amount) throws InSufficientAmount{
        if(amount > balance){
            throw new InSufficientAmount("Requested amount no available");
        }else{
            balance-=amount;
        }
    }
}
public class Pratical_24 {
    public static void main(String[] args){
        Bank b = new Bank();
        b.withdraw(20000);
        b.withdraw(4000);
        b.withdraw(2000);
    }
}
