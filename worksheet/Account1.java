public class Account1 {
    public String name;
    public String email;
    public double balance;

    public Account1(String name, String email, double balance){
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

}
