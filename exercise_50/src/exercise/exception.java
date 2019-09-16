package exercise;


class OverDraftException extends Exception{
	 
    private double deficit;
 
    public double getDeficit() {
        return deficit;
    }
 
    public OverDraftException(double deficit) {
//        super(msg);
        this.deficit = deficit;
    }
     
}

public class exception {
	  
    protected double balance;
  
    public exception(double balance) {
        this.balance = balance;
    }
  
    public double getBalance() {
        return balance;
    }
      
    public void deposit(double amt){
        this.balance+=amt;
    }
    public void withdraw(double amt) throws OverDraftException{
        if(this.balance<amt)
            throw new OverDraftException( amt-this.balance);
          
        this.balance-=amt;
    }
      
    public static void main(String[] args) {
        //��������1000
        exception a = new exception(1000);
        //��Ǯ1000
        a.deposit(1000);
        //�鿴���
        System.out.println(a.getBalance());
          
        try {
            //ȡ2001
            a.withdraw(2001);
        } catch (OverDraftException e) {
            System.err.println("͸֧��"+e.getDeficit());
            e.printStackTrace();
        }
          
    }
      
}


