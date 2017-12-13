package lab6;

public class Address
{
    private String country, town, street;
    private int house, flat;

    public Address(){

    }

    public Address(String country, String town, String street, int house, int flat){
        this.country = country;
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return country + ", г. " + town + " ул. " + street + " " + house + "-" + flat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;

        Address address = (Address) obj;

        if (!country.equals(address.country)) return false;
        if (!town.equals(address.town)) return false;
        if (!street.equals(address.street)) return false;
        if (house != address.house) return false;
        if (flat != address.flat) return false;
        return true;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
