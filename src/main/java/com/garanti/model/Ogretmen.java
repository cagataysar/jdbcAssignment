package com.garanti.model;

public class Ogretmen {
    private Integer ID;
    private String NAME;
    private boolean IS_GICIK;

    public Ogretmen (String NAME, boolean IS_GICIK) {
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
    }

    public Ogretmen (Integer ID, String NAME, boolean IS_GICIK) {
        this.ID = ID;
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
    }

    public Integer getID () {
        return ID;
    }

    public String getNAME () {
        return NAME;
    }

    public boolean isIS_GICIK () {
        return IS_GICIK;
    }

    @Override
    public String toString () {
        return "Ogretmen{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", IS_GICIK=" + IS_GICIK +
                '}';
    }
}
