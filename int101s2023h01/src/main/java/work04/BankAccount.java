
package work04;

public class BankAccount {
    private int number;
        private Person owner;
        private double balance;
    
        public BankAccount(int number, Person owner){
            this.number = number;
            this.owner = owner;
            this.balance = 0.0;
        }
        public Person getOwner() {return owner;}
        public double getBalance() {return balance;}
        
        public double deposit(double amount){
            balance += amount;
            return balance;
        }
        public double withdraw(double amount){
            if(amount > balance){
                System.out.println("Not enough money");
            }else{
                balance -= amount;
            }
                return balance;
        }
        public void tranfer(double amount, BankAccount account){
             if (balance >= amount) {
            balance -= amount;
            account.deposit(amount);
        }
        }

        @Override
        public String toString() {
            return "BankAccount(" + number + ")";
        }
        
    }

   
