/**
 * @file Pair.java
 * @brief Contiene la implementación de la clase Pair, que representa un par de elementos de tipos genéricos.
 */
package es.ull.esit.utils;
import java.util.Objects;

/**
 * @class Pair<F, S>
 * @brief Clase que representa un par de elementos de tipos genéricos.
 * @param <F> Tipo del primer elemento.
 * @param <S> Tipo del segundo elemento.
 */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) o;
        return Objects.equals(p.first, first) && Objects.equals(p.second, second);
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }

    public static <A, B> Pair <A, B> create(A a, B b) {
        return new Pair<A, B>(a, b);
    }
}
