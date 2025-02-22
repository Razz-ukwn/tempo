package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b2.c;
import j7.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.a;

public final class h1 extends Fragment implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f4269d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f4270a = Collections.synchronizedMap(new a());

    /* renamed from: b  reason: collision with root package name */
    public int f4271b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f4272c;

    public final void c(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f4270a;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f4271b > 0) {
                new b(Looper.getMainLooper()).post(new g1(0, this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(c.a("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f4270a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final LifecycleCallback f(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f4270a.get(str));
    }

    public final Activity i() {
        return getActivity();
    }

    public final void onActivityResult(int i8, int i10, Intent intent) {
        super.onActivityResult(i8, i10, intent);
        for (LifecycleCallback onActivityResult : this.f4270a.values()) {
            onActivityResult.onActivityResult(i8, i10, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4271b = 1;
        this.f4272c = bundle;
        for (Map.Entry entry : this.f4270a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f4271b = 5;
        for (LifecycleCallback onDestroy : this.f4270a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f4271b = 3;
        for (LifecycleCallback onResume : this.f4270a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f4270a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f4271b = 2;
        for (LifecycleCallback onStart : this.f4270a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f4271b = 4;
        for (LifecycleCallback onStop : this.f4270a.values()) {
            onStop.onStop();
        }
    }
}
