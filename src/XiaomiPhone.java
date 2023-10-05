public class XiaomiPhone extends Phone{
    @Override
    public String Info() {
        return "Это определенный для класса XiaomiPhone абcтрактный метод Info() из класса Phone. Данные телефона:\n"
                + "Модель: " + getModel()
                + "\t, номер: " + getNumber()
                + "\t, вес: " + getWeight()
                + "\t, ID телефона: " + getPhoneID();    }
}
