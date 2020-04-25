package core;

public class Car
{
    //Тут объяявляется переменная - номер
    public String number;
    //Тут объяявляется переменная - высота
    public int height;
    //Тут объяявляется переменная - вес
    public double weight;
    //Тут объяявляется переменная - имееется ли прицеп
    public boolean hasVehicle;
    //Тут объяявляется переменная - является ли ТС спецтранспортом
    public boolean isSpecial;
    //Тут объяявляется переменная - является ли автомобиль легковым
    public boolean isPassenger = true;

    public String toString()
    {
        //Тут объяявляется переменная - спецтранспорт или нет
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        //Тут объяявляется переменная - с прицепом или без
        String hasVehilce = hasVehicle ? "Да" : "Нет";
        //Тут объяявляется переменная - легковой автомобиль или нет
        String isPassanger = isPassenger ? "Легковой " : " Грузовой ";
        return "\n=========================================\n" +
            special + isPassanger + "автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг" +
                "\n\tНаличие прицепа: " + hasVehilce;
    }
}