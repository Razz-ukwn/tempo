package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p4  reason: invalid package */
public final class p4 extends AbstractList implements RandomAccess, a3 {

    /* renamed from: a  reason: collision with root package name */
    public final a3 f4804a;

    public p4(a3 a3Var) {
        this.f4804a = a3Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((z2) this.f4804a).get(i8);
    }

    public final Iterator iterator() {
        return new o4(this);
    }

    public final ListIterator listIterator(int i8) {
        return new n4(this, i8);
    }

    public final void n(q1 q1Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f4804a.size();
    }

    public final a3 zze() {
        return this;
    }

    public final Object zzf(int i8) {
        return this.f4804a.zzf(i8);
    }

    public final List zzh() {
        return this.f4804a.zzh();
    }
}
