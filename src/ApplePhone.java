public class ApplePhone extends Phone{
    @Override
    public String Info() {
        return "Это специальный метод для класса ApplePhone.\n"
                + "Модель: " + getModel()
                + "\t, номер: " + getNumber()
                + "\t, вес: " + getWeight()
                + "\t, ID телефона: " + getPhoneID();    }
}
