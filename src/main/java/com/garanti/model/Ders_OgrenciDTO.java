package com.garanti.model;

public class Ders_OgrenciDTO {
    private Integer ID;
    private String OGRETMEN_NAME;
    private String OGRENCI_NAME;
    private String KONU;
    private Integer NOTE;
    private Integer DEVAMSIZLIK;

    public Ders_OgrenciDTO (Integer ID, String OGRETMEN_NAME, String OGRENCI_NAME, String KONU, Integer NOTE, Integer DEVAMSIZLIK) {
        this.ID = ID;
        this.OGRETMEN_NAME = OGRETMEN_NAME;
        this.OGRENCI_NAME = OGRENCI_NAME;
        this.KONU = KONU;
        this.NOTE = NOTE;
        this.DEVAMSIZLIK = DEVAMSIZLIK;
    }

    public Integer getID () {
        return ID;
    }

    public void setID (Integer ID) {
        this.ID = ID;
    }

    public String getOGRETMEN_NAME () {
        return OGRETMEN_NAME;
    }

    public void setOGRETMEN_NAME (String OGRETMEN_NAME) {
        this.OGRETMEN_NAME = OGRETMEN_NAME;
    }

    public String getOGRENCI_NAME () {
        return OGRENCI_NAME;
    }

    public void setOGRENCI_NAME (String OGRENCI_NAME) {
        this.OGRENCI_NAME = OGRENCI_NAME;
    }

    public String getKONU () {
        return KONU;
    }

    public void setKONU (String KONU) {
        this.KONU = KONU;
    }

    public Integer getNOTE () {
        return NOTE;
    }

    public void setNOTE (Integer NOTE) {
        this.NOTE = NOTE;
    }

    public Integer getDEVAMSIZLIK () {
        return DEVAMSIZLIK;
    }

    public void setDEVAMSIZLIK (Integer DEVAMSIZLIK) {
        this.DEVAMSIZLIK = DEVAMSIZLIK;
    }
}
