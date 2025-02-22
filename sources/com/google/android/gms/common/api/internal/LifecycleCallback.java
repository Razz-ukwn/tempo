package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.a;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import u6.q;

public class LifecycleCallback {
    protected final h mLifecycleFragment;

    public LifecycleCallback(h hVar) {
        this.mLifecycleFragment = hVar;
    }

    @Keep
    private static h getChimeraLifecycleFragmentImpl(g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static h getFragment(Activity activity) {
        return getFragment(new g(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity i8 = this.mLifecycleFragment.i();
        q.i(i8);
        return i8;
    }

    public void onActivityResult(int i8, int i10, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static h getFragment(g gVar) {
        h1 h1Var;
        j1 j1Var;
        Activity activity = gVar.f4262a;
        if (activity instanceof x) {
            x xVar = (x) activity;
            WeakHashMap weakHashMap = j1.f4289y0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(xVar);
            if (weakReference == null || (j1Var = (j1) weakReference.get()) == null) {
                try {
                    j1Var = (j1) xVar.I().D("SupportLifecycleFragmentImpl");
                    if (j1Var == null || j1Var.I) {
                        j1Var = new j1();
                        j0 I = xVar.I();
                        I.getClass();
                        a aVar = new a((i0) I);
                        aVar.d(0, j1Var, "SupportLifecycleFragmentImpl", 1);
                        aVar.h();
                    }
                    weakHashMap.put(xVar, new WeakReference(j1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return j1Var;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = h1.f4269d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (h1Var = (h1) weakReference2.get()) == null) {
                try {
                    h1Var = (h1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (h1Var == null || h1Var.isRemoving()) {
                        h1Var = new h1();
                        activity.getFragmentManager().beginTransaction().add(h1Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(h1Var));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return h1Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public static h getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
