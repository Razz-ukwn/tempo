package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class i9 extends AbstractList implements RandomAccess, s7 {

    /* renamed from: a  reason: collision with root package name */
    public final s7 f5327a;

    public i9(s7 s7Var) {
        this.f5327a = s7Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((r7) this.f5327a).get(i8);
    }

    public final Iterator iterator() {
        return new h9(this);
    }

    public final ListIterator listIterator(int i8) {
        return new g9(this, i8);
    }

    public final int size() {
        return this.f5327a.size();
    }

    public final void u(k6 k6Var) {
        throw new UnsupportedOperationException();
    }

    public final s7 zze() {
        return this;
    }

    public final Object zzf(int i8) {
        return this.f5327a.zzf(i8);
    }

    public final List zzh() {
        return this.f5327a.zzh();
    }
}
