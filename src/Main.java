public class Main {
    public static void main(String[] args) {

        int startingScore = 300;
        int amount = 5000;

        System.out.println("Стартовый баланс: " + startingScore);
        System.out.println("Сумма пополнения: " + amount);

        int bonus = amount / 100;
        int totalScore = startingScore + amount;


        if (amount < 1000) {
            bonus = 0;
        } else {
            totalScore = startingScore + amount + bonus;
        }

        System.out.println("Итоговая сумма на счете: " + totalScore);
        System.out.println("Сумма бонуса: " + bonus);


    }
}
