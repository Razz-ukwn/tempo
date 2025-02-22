package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

public final class f6 extends x5 {

    /* renamed from: b  reason: collision with root package name */
    public int f5271b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f5272c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k6 f5273d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f6(k6 k6Var) {
        super(1);
        this.f5273d = k6Var;
        this.f5272c = k6Var.c();
    }

    public final boolean hasNext() {
        return this.f5271b < this.f5272c;
    }

    public final byte zza() {
        int i8 = this.f5271b;
        if (i8 < this.f5272c) {
            this.f5271b = i8 + 1;
            return this.f5273d.b(i8);
        }
        throw new NoSuchElementException();
    }
}
