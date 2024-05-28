//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 50;
        int y = 3000;
        if (y > 1000) {
            System.out.println("Итоговый счёт:");
            System.out.println(x + y + y/100*1);

            System.out.println("Начислено бонусов:");
            System.out.println(y/100*1);
        }
    }
}
    