package lab6;

public class FIO
{
    private String fName, iName, oName;

    public FIO(){
        fName = "Иванов";
        iName = "Иван";
        oName = "Иванович";
    }

    public FIO(String fName,String iName,String oName){
        this.fName = fName;
        this.iName = iName;
        this.oName = oName;
    }

    @Override
    public String toString() {
        return fName + " " + iName + " " + oName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;

        FIO fio = (FIO) obj;

        if (!fName.equals(fio.fName)) return false;
        if (!iName.equals(fio.iName)) return false;
        if (!oName.equals(fio.oName)) return false;
        return true;
    }
}
