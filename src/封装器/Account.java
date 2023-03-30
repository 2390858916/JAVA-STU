package 封装器;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器


    public Account() {

    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <=4){
            this.name = name;
        }else {
            System.out.println("name error");
            this.name = "no name";
        }
    }
    public String getName(){
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >20){
            this.balance = balance;
        }else {
            System.out.println("balence must be 20");
            this.balance = 20;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() >= 6){
            this.pwd = pwd;
        }else {
            System.out.println("pwd error must <6");
            this.pwd = "000000";
        }
    }
    public void info(){
        System.out.println("name: " + name + "balance: "  + balance);
    }

}
