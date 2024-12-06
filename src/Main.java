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

    public static void choiceVersion(int clientTypeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String clientOsName;
//        if (clientTypeOS != 0 && clientTypeOS != 1) {
//            System.out.println(clientTypeOS + " - некорректная ОС");
//            return;
//        }
        if (clientDeviceYear > currentYear || clientDeviceYear < 1990) {
            System.out.println(clientDeviceYear + " - некорректный год");
            return;
        }
        switch (clientTypeOS) {
            case 0:
                clientOsName = "iOS";
                break;
            case 1:
                clientOsName = "Android";
                break;
            default:
                clientOsName = "неизвестная ОС";
        }

        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + clientOsName + " по ссылке.");
        }
        if (clientDeviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для " + clientOsName + " по ссылке.");
        }
    }

    public static int deliveryCard(int deliveryDistance) {
        int deliveryTime;
//        if(deliveryDistance < 0 || deliveryDistance >100){
//            System.out.println("");
//        }
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else {
            deliveryTime = 3;
        }
        return deliveryTime;
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        checkYear(1904);

        System.out.println("\nTask 2");
        choiceVersion(0, 2024);
        choiceVersion(1, 2022);

        System.out.println("\nTask 3");
        System.out.println("для доставки карты потребуется дней: " + deliveryCard(20));

    }
}