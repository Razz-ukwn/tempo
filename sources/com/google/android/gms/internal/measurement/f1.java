package com.google.android.gms.internal.measurement;

import android.app.Activity;
import c7.b;
import u6.q;

public final class f1 extends s1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ y1 D;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Activity f5270e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f1(y1 y1Var, Activity activity, String str, String str2) {
        super(y1Var, true);
        this.D = y1Var;
        this.f5270e = activity;
        this.B = str;
        this.C = str2;
    }

    public final void a() {
        r0 r0Var = this.D.f5600h;
        q.i(r0Var);
        r0Var.setCurrentScreen(new b(this.f5270e), this.B, this.C, this.f5510a);
    }
}
