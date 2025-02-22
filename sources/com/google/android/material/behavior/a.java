package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import d2.d1;
import d2.i0;
import e2.m;
import java.util.WeakHashMap;

public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f5728a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5728a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f5728a;
        boolean z10 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z11 = i0.e.d(view) == 1;
        int i8 = swipeDismissBehavior.f5717e;
        if ((i8 == 0 && z11) || (i8 == 1 && !z11)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f5714b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
