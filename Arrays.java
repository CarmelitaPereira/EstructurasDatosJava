/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author CARLOS MARIO
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Args[4]:" + args[4]);

        int test1[];
        int[] test2;

        test1 = new int[100];
        test2 = new int[200];
        test1[99] = 20;
        //System.out.println("Contenido:" + test1[99]);

        int a[] = new int[50];
        a[0] = 3;
        //System.out.println("Contenido: " + a[1]);

        int b[] = new int[10];
        b[0] = 1;
        //System.out.println("Array: " + b[0]); //1

        b = new int[100];
        //System.out.println("Array: " + b[0]); //0
        b[0] = 2;
        //System.out.println("Array: " + b[0]); //2
        
        Estudiante[] est = new Estudiante[50];
        for (int i = 0; i < 50; i++) {
            est[i] = new Estudiante();
        }
        //Estudiante[] est = {new Estudiante(), new Estudiante()};

        est[3].setCedula(12);
        est[3].setNombre("Carlos");
        //System.out.println("Cedula:" + est[3].getCedula());
        //System.out.println("Nombre:" + est[3].getNombre());

        double[] notas = {3.5, 4.3, 2.2, 1.8};
        notas[3] = 2.3;
        //System.out.println("Array: " + notas[3]);

        Estudiante curso[] = {new Estudiante(), new Estudiante()};

        curso[0].setCedula(234);

        int arregloInt[] = new int[30];
        //Los datos almacenados cuando
        //se redimensiona, se pierden
        arregloInt[0] = 5;
        arregloInt = new int[40];

        //System.out.println("Posicion 0: " + arregloInt[0]); 

        //Filas Cols     
        int dosDime[][] = new int[2][2];
        dosDime[0] = new int[2];
        dosDime[1] = new int[2];
        dosDime[0][0] = 1;
        dosDime[1][0] = 2;
        //System.out.println("Dos:" + dosDime[1][0]);
        
        double notasCorc[ ][ ] = {{ 5.0, 4.0, 5.0}, 
                                  { 4.3, 4.7},
                                  { 2.7, 3.2, 4.0},
                                  { 4.3, 4.7, 5.0}};
        //notasCorc[1] = new double[3];
        //System.out.println("Dos:" + notasCorc[1][2]);
  
        String nombres[ ][ ] = {{ "Oscar", "Fonseca" },
                                { "John" , "Santos"},
                                { "Julio" , "Ruiz" }};
        //System.out.println("Dos:" + nombres[1][1]);
        

        int dosDimeExample[][] = new int[2][];
        dosDimeExample[0] = new int[5];
        dosDimeExample[1] = new int[8];
        dosDimeExample[0][4] = 8;
        
        //System.out.println("Columnas arbitrarias:" + dosDimeExample[0][6]);

        //Recorrido arrays
        int example[] = new int[5];

        for (int i = 0; i < 5; i++) {
            example[i] = i;
            //System.out.println("Array: " + example[i]);
        }
    
        for (int i = 0; i < 5; i++) {
            //System.out.println("Array: " + example[i]);
        }
        //for-each
        for (int element : example) {
            //System.out.println("For each: " + element);
        }
        //System.out.println("Example no modificado: " + example[0]);        
        //Recibe como parámetro un array de enteros
        //est[0].imprimirArray(example.clone());
        
        //System.out.println("Example modificado posición 0: " + example[0]);
    /*
        int a2[] = new int[5];
        System.out.println("a2[0]:" + a2[0]);
        int b2[] = a2;
        //int b2[] = a2.clone();
        //int b2[] = new int[5];
        System.arraycopy(a2, 0, b2, 0, 5);
        b2[0] = 5; 
        b2[1] = 4;
        System.out.println("a2[0]:" + a2[0]);
        System.out.println("b2[0]:" + b2[0]);
        System.out.println("a2[1]:" + a2[1]);
        System.out.println("b2[1]:" + b2[1]);
        */
        //Tamaño matriz
        int matriz[][] = new int[4][3];
        
        System.out.println("Tamaño filas: " + matriz.length);
        System.out.println("Tamaño columnas: " + matriz[0].length);
        java.util.Arrays.fill(matriz[1], 1);
        System.out.println("To string: " + java.util.Arrays.toString(matriz[2]));
      
    }
}
