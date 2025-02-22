package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

public final class t5 extends x5 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f5525b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5526c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5(Object obj) {
        super(0);
        this.f5526c = obj;
    }

    public final boolean hasNext() {
        return !this.f5525b;
    }

    public final Object next() {
        if (!this.f5525b) {
            this.f5525b = true;
            return this.f5526c;
        }
        throw new NoSuchElementException();
    }
}
