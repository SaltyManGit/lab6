package lab6;

public class Human implements Cloneable
{
    private FIO fio;
    private int age;
    private BodyType bodyType;
    private Address address;
    private Phone phone;

    public Human(){
    }

    public Human(FIO fio, int age, BodyType bodyType, Address address, Phone phone){
        this.fio = fio;
        this.age = age;
        this.bodyType = bodyType;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;
        Human human = (Human)obj;
        if (age != human.age) return false;
        if (!bodyType.equals(human.bodyType)) return false;
        if (!phone.equals(human.phone)) return false;
        if (!fio.equals(human.fio)) return false;
        if (!human.getFio().equals(fio)) return false;
        if (!human.getAddress().equals(address)) return false;

        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setPhone(Phone phone){
        this.phone = phone;
    }

    public Phone getPhone(){
        return phone;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public FIO getFio() {
        return fio;
    }

    public void setFio(FIO fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", возраст: " + age + ", телосложение: " + bodyType + ", адрес: " + address + ", телефон: " + phone;
    }
}
