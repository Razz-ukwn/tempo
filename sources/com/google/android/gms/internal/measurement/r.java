package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class r implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f5494a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f5495b;

    public r(s sVar) {
        this.f5495b = sVar;
    }

    public final boolean hasNext() {
        return this.f5494a < this.f5495b.f5509a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i8 = this.f5494a;
        s sVar = this.f5495b;
        if (i8 < sVar.f5509a.length()) {
            this.f5494a = i8 + 1;
            return new s(String.valueOf(sVar.f5509a.charAt(i8)));
        }
        throw new NoSuchElementException();
    }
}
