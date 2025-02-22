package l5;

import o.a;

public final class b<K, V> extends a<K, V> {
    public int G;

    public final void clear() {
        this.G = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.G == 0) {
            this.G = super.hashCode();
        }
        return this.G;
    }

    public final void j(a aVar) {
        this.G = 0;
        super.j(aVar);
    }

    public final V k(int i8) {
        this.G = 0;
        return super.k(i8);
    }

    public final V l(int i8, V v3) {
        this.G = 0;
        return super.l(i8, v3);
    }

    public final V put(K k10, V v3) {
        this.G = 0;
        return super.put(k10, v3);
    }
}
