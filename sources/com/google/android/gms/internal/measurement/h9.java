package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import q7.q;

public final class h9 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5311a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Iterator f5312b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterable f5313c;

    public h9(i9 i9Var) {
        this.f5313c = i9Var;
        this.f5312b = i9Var.f5327a.iterator();
    }

    public final boolean hasNext() {
        int i8 = this.f5311a;
        Iterator it = this.f5312b;
        switch (i8) {
            case 0:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    public final Object next() {
        int i8 = this.f5311a;
        Iterator it = this.f5312b;
        switch (i8) {
            case 0:
                return (String) it.next();
            default:
                return (String) it.next();
        }
    }

    public final void remove() {
        switch (this.f5311a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public h9(q qVar) {
        this.f5313c = qVar;
        this.f5312b = qVar.f13275a.keySet().iterator();
    }
}
