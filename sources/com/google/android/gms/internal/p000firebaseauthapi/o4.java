package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o4  reason: invalid package */
public final class o4 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f4772a;

    public o4(p4 p4Var) {
        this.f4772a = p4Var.f4804a.iterator();
    }

    public final boolean hasNext() {
        return this.f4772a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4772a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
