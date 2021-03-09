package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{
	    String[] provincias = new String[7];
        boolean[][] matrix =new boolean[7][7];
        int opcion=-1;
        LlenarArreglo(provincias);
        LlenarMatriz(matrix);
        while (opcion!=7){
            opcion=preguntarProvincia();
            buscarConexiones(opcion, matrix, provincias);
        }
        out.println("Gracias por usar el programa :) ");
    }

    private static void buscarConexiones(int opcion, boolean[][] matrix, String[] provincias) {
        for (int i = 0; i < 7; i++) {
            if (matrix[opcion][i]){
                out.println("La provincia de: "+provincias[opcion]+" posee conexion con: "+provincias[i]);
            }

        }
    }

    private static int preguntarProvincia()throws IOException {
        out.println("Digite la provincia inicial");
        out.println("0. San Jose");
        out.println("1. Alajuela");
        out.println("2. Cartago");
        out.println("3. Heredia");
        out.println("4. Guanacaste");
        out.println("5. Puntarenas");
        out.println("6. Limon");
        out.println("7. Salir");
        int opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    private static void LlenarArreglo(String[] provincias) {
        provincias[0]= "San Jose";
        provincias[1]= "Alajuela";
        provincias[2]= "Cartago";
        provincias[3]= "Heredia";
        provincias[4]= "Guanacaste";
        provincias[5]= "Puntarenas";
        provincias[6]= "Limon";
    }


    private static void LlenarMatriz(boolean[][] matrix) {
        matrix[0][0]= true;
        matrix[0][1]= true;
        matrix[0][2]= true;
        matrix[0][3]= true;
        matrix[0][4]= false;
        matrix[0][5]= true;
        matrix[0][6]= true;
        //Al
        matrix[1][0]= true;
        matrix[1][1]= true;
        matrix[1][2]= false;
        matrix[1][3]= true;
        matrix[1][4]= true;
        matrix[1][5]= true;
        matrix[1][6]= false;
        //Cartago
        matrix[2][0]= true;
        matrix[2][1]= false;
        matrix[2][2]= true;
        matrix[2][3]= false;
        matrix[2][4]= false;
        matrix[2][5]= false;
        matrix[2][6]= true;
        //Heredia
        matrix[3][0]= true;
        matrix[3][1]= true;
        matrix[3][2]= false;
        matrix[3][3]= true;
        matrix[3][4]= false;
        matrix[3][5]= false;
        matrix[3][6]= true;
        //Guanacaste
        matrix[4][0]= false;
        matrix[4][1]= true;
        matrix[4][2]= false;
        matrix[4][3]= false;
        matrix[4][4]= true;
        matrix[4][5]= true;
        matrix[4][6]= false;
        //Puntarenas
        matrix[5][0]= true;
        matrix[5][1]= true;
        matrix[5][2]= false;
        matrix[5][3]= false;
        matrix[5][4]= true;
        matrix[5][5]= true;
        matrix[5][6]= true;
        //Limon
        matrix[6][0]= true;
        matrix[6][1]= false;
        matrix[6][2]= true;
        matrix[6][3]= true;
        matrix[6][4]= false;
        matrix[6][5]= true;
        matrix[6][6]= true;
    }
}
