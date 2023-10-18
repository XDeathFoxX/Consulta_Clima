package org.example;
import org.example.consulta.Main;

public class Consulta {
    //    private String temp;
//    private String feels_like;
    private String name;
//    private String sea_level;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    private Main main;
    String lat;
    String lon;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Clima" + "\nTemperatura =  " + getMain().getTemp() + "ºC" + "\nSensação Térmica = " + getMain().getFeelsLike() + "ºC" + "\nCidade = " + name;
    }
}
