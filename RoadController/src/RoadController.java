import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController {
    //Тут объяявляется статическая переменная - максимальный вес легкового автомобиля
    private static double passengerCarMaxWeight = 3500.0; // kg
    //Тут объяявляется статическая переменная - максимальная высота легкового автомобиля
    private static int passengerCarMaxHeight = 2000; // mm
    //Тут объяявляется переменная - высота пропускного пункта
    //Изначальное значение - 4000. Уменьшаем до 3500
    private static int controllerMaxHeight = 3500; // mm

    //Тут объяявляется переменная - стоимость проезда легкового автомобиля
    private static int passengerCarPrice = 100; // RUB
    //Тут объяявляется переменная - стоимость проезда грузового автомобиля
    private static int cargoCarPrice = 250; // RUB
    //Тут объяявляется переменная - стоимость проезда с прицепом
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");
        //Тут объяявляется сканер
        Scanner scanner = new Scanner(System.in);
        //Тут объяявляется переменная - количество автомобилей
        int carsCount = scanner.nextInt();

        //Тут объяявляется переменная - итератор цикла i
        for (int i = 0; i < carsCount; i++) {
            //Тут объяявляется переменная - создаётся объект Car
            Car car = Camera.getNextCar();
            if (car.height > passengerCarMaxHeight || car.weight > passengerCarMaxWeight) car.isPassenger = false;
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Тут объяявляется переменная - стоимость проезда
            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        //Тут объяявляется переменная - высота автомобиля
        int carHeight = car.height;
        //Тут объяявляется переменная - стоимость проезда
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (!car.isPassenger) {
            price += cargoCarPrice;
        } else {
            price += passengerCarPrice;
        }
        if (car.hasVehicle) {
            price += vehicleAdditionalPrice;
        }

//            if (carHeight > passengerCarMaxHeight) {
//            double weight = car.weight;
//            //Грузовой автомобиль
//            if (weight > passengerCarMaxWeight) {
//                price = cargoCarPrice; //Тут было passangerCarPrice
//            }
//            //Легковой автомобиль
//            else {
//                price = passengerCarPrice; //тут было cargoCarPric10e
//            }
//        } else {
//            price = passengerCarPrice;
//        }
//        if (car.hasVehicle) {
//            price = price + vehicleAdditionalPrice;
//        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}