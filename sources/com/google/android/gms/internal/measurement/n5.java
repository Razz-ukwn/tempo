package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import java.util.Arrays;

public final class n5 extends l5 {
    public final void a(Object... objArr) {
        int i8 = 0;
        while (i8 < 15) {
            if (objArr[i8] != null) {
                i8++;
            } else {
                throw new NullPointerException(q.a("at index ", i8));
            }
        }
        int i10 = this.f5384b + 15;
        Object[] objArr2 = this.f5383a;
        int length = objArr2.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.f5383a = Arrays.copyOf(objArr2, i11);
            this.f5385c = false;
        } else if (this.f5385c) {
            this.f5383a = (Object[]) objArr2.clone();
            this.f5385c = false;
        }
        System.arraycopy(objArr, 0, this.f5383a, this.f5384b, 15);
        this.f5384b += 15;
    }
}
