public class chequing_account {
    private String name;
    private int balance;

    public chequing_account(String input_name, int input_balance){
        name = input_name;
        balance = input_balance;
    }

//    this accessor will help the private variable get accessed by other classes
    public int getBalance(){
        return balance;
    }
//    this mutator will help change value of private variable from within the other class by using set_balance method
    public void set_balance(int new_balance){
        balance = new_balance;
    }
}
