
import java.util.Scanner;


public class Customer implements IATM{
    
    public String name;
    public String surname;
    public int balance;
    public String ID;

    public Customer(String name, String surname, int balance, String ID) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.ID = ID;
    }

    @Override
    public void login() {
        System.out.println("1-Bilgilerinizi Gorun");
        System.out.println("2-Bakiyenizi Sorgulayin");
        System.out.println("3-Para Transfer Edin");
        System.out.println("4-Hesabinizdan Para Cekin");
        System.out.println("5-Hesabiniza Para Ekleyin");
        System.out.println("Hesabinizda Hangi Islemi Yapmak Istediginizi Secin: ");
        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();
        switch(button){
            case 1:
                Customer.this.info();
                break;
            case 2:
                Customer.this.checkBalance();
                break;
            case 3:
                Customer.this.transfer();
                break;
            case 4:
                Customer.this.withdrawMoney();
                break;
            case 5:
                Customer.this.addMoney();
                break;
            default:
                System.out.println("Cikis Yapiliyor!");
                break;

        }
        
    }
        
    

    @Override
    public void info(){
        System.out.println("Adiniz: "+this.name);
        System.out.println("Adiniz: "+this.surname);
        System.out.println("Adiniz: "+this.ID);
        
    }
               

    @Override
    public void checkBalance() {
        
        System.out.println("Bakiyeniz: "+this.balance);
        
    }


    @Override
    public void transfer() {
        
        Customer2 c2 = new Customer2("Eren","Coban",4000,"987654321");
        System.out.println("Transfer etmek istediginiz miktari giriniz: ");
        Scanner scan = new Scanner(System.in);
        int cash = scan.nextInt();
        System.out.println(c2.name + " " +c2.surname + " adli kisiye istenilen miktarda para transfer edildi!");
        System.out.println("Guncel Bakiyeniz: "+(balance-cash));
        
    }

    

    @Override
    public void addMoney() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Miktar Girin: ");
        int add = scan.nextInt();
        System.out.println("Bakiyeniz: "+(balance+add));

        
    }

    

    @Override
    public void withdrawMoney() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Cekmek Istediginiz Miktari Giriniz: ");
        int withdraw = scan.nextInt();
        System.out.println("Guncel Bakiyeniz: "+(balance-withdraw));


    }
    
    
    
    
}
