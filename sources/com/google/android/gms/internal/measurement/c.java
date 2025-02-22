package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f5170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterator f5171b;

    public c(Iterator it, Iterator it2) {
        this.f5170a = it;
        this.f5171b = it2;
    }

    public final boolean hasNext() {
        if (this.f5170a.hasNext()) {
            return true;
        }
        return this.f5171b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f5170a;
        if (it.hasNext()) {
            return new s(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f5171b;
        if (it2.hasNext()) {
            return new s((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
