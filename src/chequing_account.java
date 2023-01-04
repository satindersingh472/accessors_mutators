public class chequing_account {
    private String name;
    private int balance;

    public chequing_account(String input_name, int input_balance){
        name = input_name;
        balance = input_balance;
    }

    public int getBalance(){
        return balance;
    }
    public void set_balance(int new_balance){
        balance = new_balance;
    }
}
