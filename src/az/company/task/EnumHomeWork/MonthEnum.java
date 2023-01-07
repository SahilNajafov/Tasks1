package az.company.task.EnumHomeWork;

public enum MonthEnum {
    JANUARY(1,"Yanvar","Январь","Ocak"),
    FEBRUARY(2,"Fevral","Февраль","Şubat"),
    MARCH(3,"Mart","Март","Mart"),
    APRIL(4,"Aprel","Апрель","Nisan"),
    MAY(5,"May","Май","Mayıs"),
    JUNE(6,"İyun","Июнь","Haziran"),
    JULY(7,"İyul","Июль","Temmuz"),
    AUGUST(8,"Avqust","Август","Ağustos"),
    SEPTEMBER(9,"Sentyabr","Сентябрь","Eylül"),
    OCTOBER(10,"Oktyabr","Октябрь","Ekim"),
    NOVEMBER(11,"Noyabr","Ноябрь","Kasım"),
    DECEMBER(12,"Dekabr","Декабрь","Aralık");

    private int order;
    private String nameInAz;
    private String nameInRu;
    private String nameInTr;

    public String getNameInAz() {
        return nameInAz;
    }

    public String getNameInRu() {
        return nameInRu;
    }

    public String getNameInTr() {
        return nameInTr;
    }

    MonthEnum(int order, String nameInAz, String nameInRu, String nameInTr) {
        this.order = order;
        this.nameInAz = nameInAz;
        this.nameInRu = nameInRu;
        this.nameInTr = nameInTr;
    }
}
