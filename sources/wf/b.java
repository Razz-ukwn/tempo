package wf;

import java.lang.Comparable;

public interface b<T extends Comparable<? super T>> extends c<T> {
    boolean a(T t2, T t10);

    boolean isEmpty();
}
