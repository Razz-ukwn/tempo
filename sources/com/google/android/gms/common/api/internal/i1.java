package com.google.android.gms.common.api.internal;

import android.os.Bundle;

public final class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f4281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j1 f4283c;

    public i1(j1 j1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f4283c = j1Var;
        this.f4281a = lifecycleCallback;
        this.f4282b = str;
    }

    public final void run() {
        j1 j1Var = this.f4283c;
        int i8 = j1Var.f4291w0;
        LifecycleCallback lifecycleCallback = this.f4281a;
        if (i8 > 0) {
            Bundle bundle = j1Var.f4292x0;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f4282b) : null);
        }
        if (j1Var.f4291w0 >= 2) {
            lifecycleCallback.onStart();
        }
        if (j1Var.f4291w0 >= 3) {
            lifecycleCallback.onResume();
        }
        if (j1Var.f4291w0 >= 4) {
            lifecycleCallback.onStop();
        }
        if (j1Var.f4291w0 >= 5) {
            lifecycleCallback.onDestroy();
        }
    }
}
