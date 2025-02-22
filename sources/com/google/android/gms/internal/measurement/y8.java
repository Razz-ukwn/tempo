package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

public final class y8 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f5607a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5608b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f5609c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a9 f5610d;

    public /* synthetic */ y8(a9 a9Var) {
        this.f5610d = a9Var;
    }

    public final Iterator a() {
        if (this.f5609c == null) {
            this.f5609c = this.f5610d.f5154c.entrySet().iterator();
        }
        return this.f5609c;
    }

    public final boolean hasNext() {
        int i8 = this.f5607a + 1;
        a9 a9Var = this.f5610d;
        if (i8 < a9Var.f5153b.size()) {
            return true;
        }
        if (!a9Var.f5154c.isEmpty()) {
            return a().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f5608b = true;
        int i8 = this.f5607a + 1;
        this.f5607a = i8;
        a9 a9Var = this.f5610d;
        return i8 < a9Var.f5153b.size() ? (Map.Entry) a9Var.f5153b.get(this.f5607a) : (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f5608b) {
            this.f5608b = false;
            int i8 = a9.C;
            a9 a9Var = this.f5610d;
            a9Var.h();
            if (this.f5607a < a9Var.f5153b.size()) {
                int i10 = this.f5607a;
                this.f5607a = i10 - 1;
                a9Var.e(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
