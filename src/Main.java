public class Main {
    public static void main(String[] args) {

        // Объявляем переменную для стоимости билета
        int ticketPrice = 13676; // стоимость билета в рублях

        // Количество рублей, необходимое для одной бонусной мили
        int rublesPerMile = 20;

        // Рассчитываем количество бонусных миль, используя целочисленное деление
        int bonusMiles = ticketPrice / rublesPerMile;

        // Выводим результат
        System.out.println("Количество начисленных бонусных миль: " + bonusMiles);
    }
}