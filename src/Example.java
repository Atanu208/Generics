class BankAccount<T extends String>
{
    T t1;
    BankAccount(T t1)
    {
        this.t1=t1;
    }
    public void display()
    {
        System.out.println(t1);
    }
    public <T> void deposit(T[] arr)
    {
        for (T item: arr) {
            System.out.print(item +" ");
        }
        System.out.println();
    }
}
public class Example {
    public static void main(String[] args) {
        BankAccount<String> bank1=new BankAccount<>("SBI");
        Integer[] arr1={24,43,48,50,63,74};
        Float[] arr2={33.45f,96.679f,695.79f,40.456f};
        bank1.deposit(arr1);
        bank1.deposit(arr2);
    }
}
