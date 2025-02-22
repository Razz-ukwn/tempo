package com.google.android.gms.internal.measurement;

import b2.c;
import java.util.Iterator;

public final class w5 extends s5 {

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f5569d;

    public w5(Object obj) {
        this.f5569d = obj;
    }

    public final void a(Object[] objArr) {
        objArr[0] = this.f5569d;
    }

    public final boolean contains(Object obj) {
        return this.f5569d.equals(obj);
    }

    public final x5 e() {
        return new t5(this.f5569d);
    }

    public final int hashCode() {
        return this.f5569d.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new t5(this.f5569d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return c.a("[", this.f5569d.toString(), "]");
    }
}
