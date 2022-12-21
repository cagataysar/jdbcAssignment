package com.garanti.model;

public class Ders_Ogrenci {
    private Integer ID;
    private Integer NOTE;
    private Integer DEVAMSIZLIK;
    private Integer DERS_ID;
    private Integer OGRENCI_ID;

    public Ders_Ogrenci (Integer ID, Integer NOTE, Integer DEVAMSIZLIK, Integer DERS_ID, Integer OGRENCI_ID) {
        this.ID = ID;
        this.NOTE = NOTE;
        this.DEVAMSIZLIK = DEVAMSIZLIK;
        this.DERS_ID = DERS_ID;
        this.OGRENCI_ID = OGRENCI_ID;
    }

    public Ders_Ogrenci (Integer NOTE, Integer DEVAMSIZLIK, Integer DERS_ID, Integer OGRENCI_ID) {
        this.NOTE = NOTE;
        this.DEVAMSIZLIK = DEVAMSIZLIK;
        this.DERS_ID = DERS_ID;
        this.OGRENCI_ID = OGRENCI_ID;
    }

    public Ders_Ogrenci (Integer ID, Integer DERS_ID, Integer OGRENCI_ID) {
        this.ID = ID;
        this.DERS_ID = DERS_ID;
        this.OGRENCI_ID = OGRENCI_ID;
    }

    public Ders_Ogrenci (Integer DERS_ID, Integer OGRENCI_ID) {
        this.DERS_ID = DERS_ID;
        this.OGRENCI_ID = OGRENCI_ID;
    }

    public Ders_Ogrenci () {

    }

    public Integer getID () {
        return ID;
    }

    public Integer getNOTE () {
        return NOTE;
    }

    public Integer getDEVAMSIZLIK () {
        return DEVAMSIZLIK;
    }

    public Integer getDERS_ID () {
        return DERS_ID;
    }

    public Integer getOGRENCI_ID () {
        return OGRENCI_ID;
    }

    public void setNOTE (Integer NOTE) {
        this.NOTE = NOTE;
    }

    public void setDEVAMSIZLIK (Integer DEVAMSIZLIK) {
        this.DEVAMSIZLIK = DEVAMSIZLIK;
    }

    @Override
    public String toString () {
        return "Ders_Ogrenci{" +
                "ID=" + ID +
                ", DERS_ID=" + DERS_ID +
                ", OGRENCI_ID=" + OGRENCI_ID +
                ", NOTE=" + NOTE +
                ", DEVAMSIZLIK=" + DEVAMSIZLIK +
                '}';
    }
}
