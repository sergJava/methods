import java.time.LocalDate;

public class Main {

    public static void checkYear(int year) {
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год - високосный год.");
            } else {
                System.out.println(year + " год - не високосный год.");
            }
        } else {
            System.out.println("год должен быть больше, чем 1584");
        }
    }

    public static void choiceVersion(int typeOS, int yearOfProduction) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS != 0 && typeOS != 1) {
            System.out.println(typeOS + " - некорректная ОС");
            return;
        }
        if (yearOfProduction > currentYear || yearOfProduction < 1990) {
            System.out.println(yearOfProduction + " - некорректный год");
            return;
        }

        if (yearOfProduction < currentYear && typeOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        if (yearOfProduction < currentYear && typeOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (yearOfProduction == currentYear && typeOS == 0) {
            System.out.println("Установите обычную версию приложения для IOS по ссылке.");
        }
        if (yearOfProduction == currentYear && typeOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        }
    }

    public static int deliveryCard(int deliveryDistance){
        int deliveryTime = 1;
        if(deliveryDistance < 0 || deliveryDistance >100){
            throw new RuntimeException("доставки нет.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime+=2;
        }
        return deliveryTime;
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        checkYear(1904);

        System.out.println("\nTask 2");
        choiceVersion(0, 2024);

        System.out.println("\nTask 3");
        System.out.println("для доставки карты потребуется дней: " + deliveryCard(20));

    }
}