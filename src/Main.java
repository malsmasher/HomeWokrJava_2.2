//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int accountStatus = 50;
        int refillAmount = 3000;
        if (refillAmount > 1000) {
            System.out.println("Итоговый счёт:");
            System.out.println(accountStatus + refillAmount + refillAmount/100*1);

            System.out.println("Начислено бонусов:");
            System.out.println(refillAmount/100*1);
        }
    }
}
