package core;

public class Camera
{
    public static Car getNextCar()
    {
        //Тут объяявляется переменная - номер, генерируется случайно
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        //Тут объяявляется переменная - высота, генерируется случайно
        int randomHeight = (int) (1000 + 3500. * Math.random());
        //Тут объяявляется переменная - вес, генерируется случайно
        double randomWeight = 600 + 10000 * Math.random();

        //Тут объяявляется переменная - автомобиль
        Car car = new Car();
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = randomWeight;
        car.hasVehicle = Math.random() > 0.5;
        car.isSpecial = Math.random() < 0.15;

        return car;
    }
}