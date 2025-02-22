package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n4  reason: invalid package */
public final class n4 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final ListIterator f4748a;

    public n4(p4 p4Var, int i8) {
        this.f4748a = p4Var.f4804a.listIterator(i8);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f4748a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f4748a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4748a.next();
    }

    public final int nextIndex() {
        return this.f4748a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f4748a.previous();
    }

    public final int previousIndex() {
        return this.f4748a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
