package com.company;

public class Bil {

    private String biltype;
    private String model;
    private int stelnummer;
    private int døre;
    private int hastighed;


    public String toString(){
        return   "\n" + "Biltype: " + biltype + "\n"
                + "Model: " + model + "\n"
                + "Stelnummer: " + stelnummer + "\n"
                + "Antal døre: " + døre + "\n"
                + "Hastighed: " + hastighed + " km/t";

    }
        public Bil(){
        this.biltype = "Ukendt";
        this.stelnummer = 0;
        this.døre = 0;
        this.hastighed = 0;
        this.model = "Ukendt";
        }

    public Bil(String biltype, String model, int Stelnummer, int døre, int hastighed) {

        this.biltype = biltype;
        this.stelnummer = Stelnummer;
        this.døre = døre;
        this.hastighed = hastighed;
        this.model = model;
    }


    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        biltype = biltype;
    }

    public int getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(int stelnummer) {
        stelnummer = stelnummer;
    }

    public int getDøre() {
        return døre;
    }

    public void setDøre(int døre) {
        døre = døre;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        hastighed = hastighed;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
