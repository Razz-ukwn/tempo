package w;

import java.util.Map;

public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    public final Object next() {
        int i8 = this.f16466c + 2;
        this.f16466c = i8;
        Object[] objArr = this.f16464a;
        return new b(objArr[i8 - 2], objArr[i8 - 1]);
    }
}
