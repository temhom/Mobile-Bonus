public class Main {
    public static void main(String[] args) {

      int a = 500; // Начальная сумма на счету.
      int b = 1000; // Сумма пополнения.
      int c = b / 100; // Количество бонусов.
      int d = a + b + c; // Итоговая сумма с бонусами.
      int f = a + b; // Итоговая сумма без бонусов.


        if(b >= 1000){
            System.out.println("Поздравляем! Вы получили бонусы на свой счёт: " + (c) + " рублей.");
            System.out.println("Общий баланс составляет: " + (d) + " рублей.");
        }

        else {
            System.out.println("Ваш бонусный счет: 0 рублей");
            System.out.println("Общий баланс составляет: " + (f) + " рублей.");
        }
    }
}