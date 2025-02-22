package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import androidx.fragment.app.q;

public final class g6 extends i6 {

    /* renamed from: d  reason: collision with root package name */
    public final int f5295d;

    public g6(byte[] bArr, int i8) {
        super(bArr);
        k6.i(0, i8, bArr.length);
        this.f5295d = i8;
    }

    public final byte a(int i8) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i10 = this.f5295d;
        if (((i10 - (i8 + 1)) | i8) >= 0) {
            return this.f5326c[i8];
        }
        if (i8 < 0) {
            String a10 = q.a("Index < 0: ", i8);
            throw arrayIndexOutOfBoundsException;
        }
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(d.a("Index > length: ", i8, ", ", i10));
        throw arrayIndexOutOfBoundsException;
    }

    public final byte b(int i8) {
        return this.f5326c[i8];
    }

    public final int c() {
        return this.f5295d;
    }

    public final void k() {
    }
}
