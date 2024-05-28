//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account_status = 50;
        int refill_amount = 3000;
        if (refill_amount > 1000) {
            System.out.println("Итоговый счёт:");
            System.out.println(account_status + refill_amount + refill_amount/100*1);

            System.out.println("Начислено бонусов:");
            System.out.println(refill_amount/100*1);
        }
    }
}
