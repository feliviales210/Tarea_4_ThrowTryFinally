

/* Los Runtime erros no se son revisados a la hora de compilar el codigo por esto es que se pude compilar con errores.
* */
public class Runtime {




    public int division(int dividendo, int divisor){

        int resultado = (int) (dividendo/divisor);

        return resultado;
    }



    public static void main(String[] args) {

        Runtime ejemplo = new Runtime();
        Runtime ejemplo2 = new Runtime();


        try
        {

            int a[] = new int[5];
            /** Si se descomenta esta variable error que se da es array our of bound debido a que
             *  la lista o array que se creo tiene 6 elementos pero el indice llega hasta el 5. */
            a[6] = 8;


            /** Si el divisor no se cambia por cualquier numero diferente de 0 el error que se ejemplara sera un
             *  ArithmeticException esto se debe a que no es posibel dividir entre cero en los numero reales. */
            System.out.println( ejemplo.division(7,0));
        }

        catch(ArithmeticException e)
        {
            System.err.println("No se puede dividir por cero ");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Fuera del limite");
        }
        /** Este ultimo catch se utiliza la calse Exception debido a que est abarca cualquiero otro runtime error que
         *  no este especificado en un catch, lo diferente sera que no se distinguira que tipo de error es. */
        catch(Exception e)
        {
            System.err.println("Hubo un error.");
        }

        /** El bloque finally se utiliza cuando se quiere o necesita que aunque se encuentre una excepcion en el codigo,
         *  y aun asi se tiene que ejecutar otras lineas de codigo, que este no se detenga y logre terminar lo que se necestario
         *  en este caso se ejecuta el printe de "finalizo" y la operacion con el metodo division. */
        finally
        {
            System.out.println("finalizo");
            System.out.println(ejemplo2.division(4,2));
            System.out.println("La liena de arriba se ejecuto auque se encontrara un exepcion");
        }

        /** Existen distinto tipos de errores que se pueden especificar en los catches no solo el ArrayIndexOutOfBoundsException
         *  y ArithmeticException.  */
    }
}
