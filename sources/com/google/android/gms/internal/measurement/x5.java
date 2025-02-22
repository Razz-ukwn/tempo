package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public abstract class x5 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5581a;

    public /* synthetic */ x5(int i8) {
        this.f5581a = i8;
    }

    public /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    public final void remove() {
        switch (this.f5581a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract byte zza();
}
