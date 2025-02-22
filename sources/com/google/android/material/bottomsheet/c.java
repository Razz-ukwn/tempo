package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import e.n;

public class c extends n {
    public c() {
    }

    public final void n0() {
        Dialog dialog = this.G0;
        if (dialog instanceof b) {
            boolean z10 = ((b) dialog).h().I;
        }
        o0(false, false);
    }

    public final Dialog p0() {
        return new b(q(), this.A0);
    }

    @SuppressLint({"ValidFragment"})
    public c(int i8) {
        super(i8);
    }
}
