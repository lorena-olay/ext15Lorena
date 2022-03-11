package ejercicio4;

import java.util.Arrays;

public class Teatro {
    private final int FILAS = 4;
    private final int COLUMNAS = 7;
    private char[][] matriz = new char[FILAS][COLUMNAS];
    public void mostrar() {
        //rellena todos los asientos a true(habilitados) y los impares a false(deshabilitados)
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                matriz[f][c] = 'x';
                if(f%2==1 && c%2==1){
                    matriz[f][c] = 'L';
                }
            }
        }

        //Mostrar en pantalla la matriz
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public void reservar(int fila, int columna){
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                if(matriz[fila][columna]=='X' && matriz[fila][columna]=='V' ){
                    System.out.println("NO DISPONIBLE");
                }
                matriz[fila][columna]='V';
                System.out.println("RESERVADO");
            }
        }

    }

    public void cancelar(int fila, int columna){
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                if(matriz[fila][columna]=='X'){
                    System.out.println("NO");
                }
                if(matriz[fila][columna]=='V'){
                    matriz[fila][columna]='L';
                }//COMO LO HE HECHO BOOLEAN NO PUEDO CONTROLAR QUE SEAN RESERVAS O POR COVID
                System.out.println("CANCELADO");
            }
        }
    }



    public Teatro(char[][] matriz) {
        this.matriz = matriz;
    }

    public Teatro() {
    }

    public int getFILAS() {
        return FILAS;
    }

    public int getCOLUMNAS() {
        return COLUMNAS;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }


    @Override
    public String toString() {
        return "Teatro{" +
                "FILAS=" + FILAS +
                ", COLUMNAS=" + COLUMNAS +
                ", matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
