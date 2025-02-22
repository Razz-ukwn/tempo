package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

public final class g9 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final ListIterator f5296a;

    public g9(i9 i9Var, int i8) {
        this.f5296a = i9Var.f5327a.listIterator(i8);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5296a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f5296a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5296a.next();
    }

    public final int nextIndex() {
        return this.f5296a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f5296a.previous();
    }

    public final int previousIndex() {
        return this.f5296a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
