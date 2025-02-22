package k7;

import ag.m;
import java.util.NoSuchElementException;

public final class a0 extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10347a;

    /* renamed from: b  reason: collision with root package name */
    public int f10348b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f10349c;

    public a0(c0 c0Var, int i8) {
        int size = c0Var.size();
        m.C(i8, size);
        this.f10347a = size;
        this.f10348b = i8;
        this.f10349c = c0Var;
    }

    /* renamed from: b */
    public final boolean hasNext() {
        return this.f10348b < this.f10347a;
    }

    /* renamed from: c */
    public final boolean hasPrevious() {
        return this.f10348b > 0;
    }

    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i8 = this.f10348b;
            this.f10348b = i8 + 1;
            return this.f10349c.get(i8);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i8 = this.f10348b - 1;
            this.f10348b = i8;
            return this.f10349c.get(i8);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f10348b;
    }

    public final int previousIndex() {
        return this.f10348b - 1;
    }
}
