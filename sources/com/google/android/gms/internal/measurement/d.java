package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f5211a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f5212b;

    public d(e eVar) {
        this.f5212b = eVar;
    }

    public final boolean hasNext() {
        return this.f5211a < this.f5212b.e();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i8 = this.f5211a;
        e eVar = this.f5212b;
        if (i8 < eVar.e()) {
            int i10 = this.f5211a;
            this.f5211a = i10 + 1;
            return eVar.f(i10);
        }
        throw new NoSuchElementException(q.a("Out of bounds index: ", this.f5211a));
    }
}
