public class Main {
    public static void main(String[] args) {
  // 1. Vamos a practicar operaciones básicas con números:
        //a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        //y “b”. Su código puede arrancar (por ejemplo):
        //int numeroInicio = 5;
        //int numeroFin = 14;
        // Se deberían mostrar los números:
        //5,6,7,8,9,10,11,12,13,14

        System.out.println("Clase 1: \n Actividad 1a");
    int ni=5;
    int nf=14;

    while(ni <= nf){
        System.out.println(ni);
        ni++;
    }

//b. A lo anterior, solo muestre los números pares

        System.out.println("Solo los pares del 5 al 14");

    //*******preguntar porque no me deja renombrar la misma variable
    int numi=5;
    int numf=14;

    while(numi <= numf){
        if(numi % 2 == 0) {
            System.out.println(numi);
        }
        numi++;
    }
    //c. A lo anterior, con una variable extra, elija si se deben mostrar los números
    // pares o impares
    System.out.println("Indica si son pares o impares");
    int numinic=5;
    int numefin=14;

    while(numinic <= numefin){
        if(numinic % 2 == 0) {
            System.out.println(numinic+" Es par");
        }
        else{
            System.out.println(numinic+" Es impar");
        }
        numinic++;
    }

    //d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

    System.out.println("Orden invertido");
    int numeroi=5;
    int numerof=14;

    for(int i=numerof ; i >= numeroi ; i--){
        System.out.println(i);        
    }

    }
   }
