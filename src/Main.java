public class Main {
    public static void main(String[] args) {

        int accountSum = 500; // Начальная сумма на счету.
        int plusSum = 1000; // Сумма пополнения.
        int bonus = plusSum / 100; // Количество бонусов.
        int summaryWithBonus = accountSum + plusSum + bonus; // Итоговая сумма с бонусами.
        int summaryWithoutBonus = accountSum + plusSum; // Итоговая сумма без бонусов.


        if (plusSum >= 1000) {
            System.out.println("Поздравляем! Вы получили бонусы на свой счёт: " + (bonus) + " рублей.");
            System.out.println("Общий баланс составляет: " + (summaryWithBonus) + " рублей.");
        } else {
            System.out.println("Ваш бонусный счет: 0 рублей");
            System.out.println("Общий баланс составляет: " + (summaryWithoutBonus) + " рублей.");
        }
    }
}