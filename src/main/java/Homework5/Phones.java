package Homework5;

public class Phones {
        String _name;
        Integer phoneNumber;
    public Phones(String name, Integer phoneNumber){
        _name = name;
        this.phoneNumber=phoneNumber;
    }
    public static Phones person1=new Phones("Григорьев", 4678456);

   public static Phones person2=new Phones( "Шестаков", 345790);
   public static Phones person3=new Phones( "Фокин", 3489589);
    public static Phones person4=new Phones( "Хохлов", 95390294);
    public static Phones person5=new Phones( "Фокин", 3459569);
    public static Phones person6=new Phones( "Шубин", 1235759);
    public static Phones person7=new Phones( "Гущина", 4834532);
    public static Phones person8=new Phones( "Брагина", 8524577);
    public static Phones person9=new Phones( "Афанасьева", 8630734);
    public static Phones person10=new Phones( "Рыбакова", 8704360);

    public String getName(){
        return _name;
    }
    public Integer getPhoneNumber(){
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "surname='" + _name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
