package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class j implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f5335a;

    public j(Iterator it) {
        this.f5335a = it;
    }

    public final boolean hasNext() {
        return this.f5335a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new s((String) this.f5335a.next());
    }
}
