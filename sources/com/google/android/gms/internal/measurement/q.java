package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f5477a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f5478b;

    public q(s sVar) {
        this.f5478b = sVar;
    }

    public final boolean hasNext() {
        return this.f5477a < this.f5478b.f5509a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i8 = this.f5477a;
        if (i8 < this.f5478b.f5509a.length()) {
            this.f5477a = i8 + 1;
            return new s(String.valueOf(i8));
        }
        throw new NoSuchElementException();
    }
}
