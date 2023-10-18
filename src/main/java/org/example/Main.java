package org.example;


import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {

            Busca_clima consulta0 = new Busca_clima();
            try{
                Consulta clima = consulta0.getClima("-23.0013818");
                System.out.println(clima.toString());
            }catch (IOException e ){
                e.printStackTrace();
            }
        }
    }

