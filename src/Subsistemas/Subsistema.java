/**
 * @author Greivin
 */
package Subsistemas;

public interface Subsistema<T> {
    public void encender (T t);
    public void apagar (T t);
    public String estadoActual();
}
