package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m1  reason: invalid package */
public abstract class m1 implements Iterator {
    public final Object next() {
        l1 l1Var = (l1) this;
        int i8 = l1Var.f4698a;
        if (i8 < l1Var.f4699b) {
            l1Var.f4698a = i8 + 1;
            return Byte.valueOf(l1Var.f4700c.b(i8));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
