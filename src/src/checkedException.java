



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class checkedException {

    private static String inexistente = "file_inexistente";
    private static String existente = "C:\\Users\\Felipe\\Documents\\Tarea_4_ThrowTryFinally\\src\\src\\prueba2_existente";


    /** Se utiliza el throw para señalar que el siguiente metodo puede llegar a dar un IOException, en este caso se
     *  se espera que se un IOException, más especificamente un FileNotFounException debido a que la variable inexistente
     *  no tiene un file path verdadero o existente. */
    private static String checkedException_con_Throws(String pathname) throws IOException {
        String contenido = "";
        FileInputStream fin = new FileInputStream( pathname );
        int i = 0;
        while ((i=fin.read()) != -1) {
            System.out.print((char) i);
        }
        return contenido;

    }



    public static void main(String[] args) throws IOException {

        checkedException prueba1 = new checkedException();
        checkedException prueba2 = new checkedException();

        /** Se utiliza el try para para que si se llega a un excepcion este lo atrape en el catch. */
        try {
            prueba1.checkedException_con_Throws(inexistente);

        /** Si se da el caso que se llega a una excepcion este lo notifique de manera especifica y no solo como un
         *  IOException. */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /** Se implementa un finally block para que aun asi se pueda ejecutar la linea donde se llama al metodo con
         *  un archivo existente. */
        finally {
            System.out.println("");
            System.out.println("El archivo de prueba 2, abajo de este texto, si se logro imprimir en terminal apesar de al ");
            System.out.println("excepcion que se provoco por no tener el archivo en prueba1 gracias al 'finally' block,este");
            System.out.println("siempre se ejecuta apesar de haber checkedExceptions.");
            System.out.println("");
            System.out.println(" <==Contenido del documento de prueba2." + prueba2.checkedException_con_Throws(existente));
            System.out.println("");
        }


    }


}

