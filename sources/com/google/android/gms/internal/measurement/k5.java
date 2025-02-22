package com.google.android.gms.internal.measurement;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class k5 extends x5 implements ListIterator {

    /* renamed from: b  reason: collision with root package name */
    public final int f5357b;

    /* renamed from: c  reason: collision with root package name */
    public int f5358c;

    public k5(int i8, int i10) {
        super(0);
        if (i10 < 0 || i10 > i8) {
            throw new IndexOutOfBoundsException(d5.c(i10, i8, "index"));
        }
        this.f5357b = i8;
        this.f5358c = i10;
    }

    @Deprecated
    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    @Deprecated
    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5358c < this.f5357b;
    }

    public final boolean hasPrevious() {
        return this.f5358c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i8 = this.f5358c;
            this.f5358c = i8 + 1;
            return ((o5) this).f5445d.get(i8);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f5358c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i8 = this.f5358c - 1;
            this.f5358c = i8;
            return ((o5) this).f5445d.get(i8);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f5358c - 1;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        b(obj);
        throw null;
    }
}
