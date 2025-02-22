package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.p;
import b2.c;
import j7.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.a;

public final class j1 extends p implements h {

    /* renamed from: y0  reason: collision with root package name */
    public static final WeakHashMap f4289y0 = new WeakHashMap();

    /* renamed from: v0  reason: collision with root package name */
    public final Map f4290v0 = Collections.synchronizedMap(new a());

    /* renamed from: w0  reason: collision with root package name */
    public int f4291w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public Bundle f4292x0;

    public final void G(int i8, int i10, Intent intent) {
        super.G(i8, i10, intent);
        for (LifecycleCallback onActivityResult : this.f4290v0.values()) {
            onActivityResult.onActivityResult(i8, i10, intent);
        }
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        this.f4291w0 = 1;
        this.f4292x0 = bundle;
        for (Map.Entry entry : this.f4290v0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void M() {
        this.f2062b0 = true;
        this.f4291w0 = 5;
        for (LifecycleCallback onDestroy : this.f4290v0.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void V() {
        this.f2062b0 = true;
        this.f4291w0 = 3;
        for (LifecycleCallback onResume : this.f4290v0.values()) {
            onResume.onResume();
        }
    }

    public final void W(Bundle bundle) {
        for (Map.Entry entry : this.f4290v0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void X() {
        this.f2062b0 = true;
        this.f4291w0 = 2;
        for (LifecycleCallback onStart : this.f4290v0.values()) {
            onStart.onStart();
        }
    }

    public final void Y() {
        this.f2062b0 = true;
        this.f4291w0 = 4;
        for (LifecycleCallback onStop : this.f4290v0.values()) {
            onStop.onStop();
        }
    }

    public final void c(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f4290v0;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f4291w0 > 0) {
                new b(Looper.getMainLooper()).post(new i1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(c.a("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final LifecycleCallback f(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f4290v0.get(str));
    }

    public final /* synthetic */ Activity i() {
        return o();
    }

    public final void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.m(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f4290v0.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
