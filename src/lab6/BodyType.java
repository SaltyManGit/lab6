package lab6;

public enum BodyType
{
    ECTOMORPH("Эктоморф"),
    MESOMORPH("Мезоморф"),
    ENDOMORF("Эндоморф");

    private String name;

    BodyType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
