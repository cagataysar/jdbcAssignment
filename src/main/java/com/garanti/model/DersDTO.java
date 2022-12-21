package com.garanti.model;

public class DersDTO {
    private Integer ID;
    private String OGRETMEN;
    private String KONU;

    public DersDTO (Integer ID, String OGRETMEN, String KONU) {
        this.ID = ID;
        this.OGRETMEN = OGRETMEN;
        this.KONU = KONU;
    }

    public DersDTO () {
    }

    public Integer getID () {
        return ID;
    }

    public String getOGRETMEN () {
        return OGRETMEN;
    }

    public String getKONU () {
        return KONU;
    }

    @Override
    public String toString () {
        return "DersDTO{" +
                "ID=" + ID +
                ", OGRETMEN='" + OGRETMEN + '\'' +
                ", KONU='" + KONU + '\'' +
                '}';
    }
}
