package dev.dsa.util;

import java.util.Objects;

public class Pair<A, B> {
    public final A first;
    public final B second;
    public Pair(A a, B b) { this.first = a; this.second = b; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override public int hashCode() { return Objects.hash(first, second); }

    @Override public String toString() { return "Pair[" + first + "," + second + "]"; }
}
