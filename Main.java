import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Bienvenidos a la inmersion Java");
        //System.out.println("Pelicula Matrix");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;

        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media evaluacion de Matrix: " + mediaEvaluacion);
        
        if (fechaDeLanzamiento > 2023){
            System.out.println("pelicula del momento");
        }else{
            System.out.println("pelicula retro, vale la pena mirar");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota para Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La nota de la pelicula" +
        "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario /3);
    }
    
}
