/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 17/02/2023 por Nicolas Gil Ruiz.
 * Esta es la versión 1.0
 */


public class EntradaBlogNGR {
    /**
    * separador es el carácter que separa ENTRADA DE del nombre del autor
    */
public static char separador=':';
private int id;
private String texto;
private String autor;

    /**
     * Constructor de la clase.
     * Recibe el número de entrada, el nombre del autor de la entrada y el texto que contiene la entrada.
     * Si el número de entrada es negativo, lanza una excepción.
     *
     * @param id El numero de la entrada
     * @param autor El nombre del autor
     * @param texto El texto que va a contener la entrada
     * @throws IllegalArgumentException Si el titulo es 0 o negativo
     */
public EntradaBlogNGR(int id, String autor, String texto)throws IllegalArgumentException{
    if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
    this.id=id;
    this.autor=autor;
    this.texto=texto;
}

    /**
     * Junta el nombre del autor con el separador y el texto a escribir, devolviendo lo que debe imprimir
     * @return cad
     */
@Override
public String toString(){
    String cad="";
    cad+="\nENTRADA DE"+separador+autor;
    cad+="\n "+texto;
    return cad;
}
    /**
     * Devuelve el número de la entrada
     * @return id
     */
public int getId(){
    return this.id;
}

    /**
     * Devuelve el texto completo de la entrada
     * @return texto
     */
    public String getTexto(){
    return this.texto;
}

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas
     * @return autor
     */
    public String getAutor(){
    return this.autor.toUpperCase();
}

    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return autor

    public String devuelveAutor(){
    return this.autor;
    }
    */

    /**
     * Ejecuta el codigo y es donde introducimos los datos que queremos
     * No tiene porqué tener argumentos.
     * @param args Argumentos introducidos en el IDE
     */
    public static void main(String[] args) {
    EntradaBlogNGR e1=new EntradaBlogNGR (3,"Nicolas Gil Ruiz","Últimas noticias, está disponible BixBy 2.0");
    System.out.println(e1);
    }
}