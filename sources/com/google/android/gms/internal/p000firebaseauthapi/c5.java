package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c5  reason: invalid package */
public final class c5 extends h5 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4441a;

    /* renamed from: b  reason: collision with root package name */
    public int f4442b;

    /* renamed from: c  reason: collision with root package name */
    public final e5 f4443c;

    public c5(e5 e5Var, int i8) {
        int size = e5Var.size();
        wh.b(i8, size);
        this.f4441a = size;
        this.f4442b = i8;
        this.f4443c = e5Var;
    }

    /* renamed from: b */
    public final boolean hasNext() {
        return this.f4442b < this.f4441a;
    }

    /* renamed from: c */
    public final boolean hasPrevious() {
        return this.f4442b > 0;
    }

    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i8 = this.f4442b;
            this.f4442b = i8 + 1;
            return this.f4443c.get(i8);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i8 = this.f4442b - 1;
            this.f4442b = i8;
            return this.f4443c.get(i8);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4442b;
    }

    public final int previousIndex() {
        return this.f4442b - 1;
    }
}
