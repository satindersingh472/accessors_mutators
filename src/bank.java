public class bank {
    private chequing_account account_one;
    private chequing_account account_two;

    public bank() {
        account_one = new chequing_account("satinder", 5000);
        account_two = new chequing_account("sam", 10000);
    }

    public static void main(String[] args){
        bank scotiabank = new bank();
        System.out.println(scotiabank.account_one.getBalance());
        scotiabank.account_one.set_balance(200);
        System.out.println(scotiabank.account_one.getBalance());
    }
}
