package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f4  reason: invalid package */
public final class f4 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f4536a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4537b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f4538c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h4 f4539d;

    public /* synthetic */ f4(h4 h4Var) {
        this.f4539d = h4Var;
    }

    public final Iterator a() {
        if (this.f4538c == null) {
            this.f4538c = this.f4539d.f4612c.entrySet().iterator();
        }
        return this.f4538c;
    }

    public final boolean hasNext() {
        int i8 = this.f4536a + 1;
        h4 h4Var = this.f4539d;
        if (i8 < h4Var.f4611b.size()) {
            return true;
        }
        if (!h4Var.f4612c.isEmpty()) {
            return a().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f4537b = true;
        int i8 = this.f4536a + 1;
        this.f4536a = i8;
        h4 h4Var = this.f4539d;
        return i8 < h4Var.f4611b.size() ? (Map.Entry) h4Var.f4611b.get(this.f4536a) : (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f4537b) {
            this.f4537b = false;
            int i8 = h4.C;
            h4 h4Var = this.f4539d;
            h4Var.h();
            if (this.f4536a < h4Var.f4611b.size()) {
                int i10 = this.f4536a;
                this.f4536a = i10 - 1;
                h4Var.e(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
