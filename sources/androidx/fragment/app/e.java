package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d1;
import androidx.fragment.app.m;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1941c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d1.b f1942d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m.a f1943e;

    public e(ViewGroup viewGroup, View view, boolean z10, d1.b bVar, m.a aVar) {
        this.f1939a = viewGroup;
        this.f1940b = view;
        this.f1941c = z10;
        this.f1942d = bVar;
        this.f1943e = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1939a;
        View view = this.f1940b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f1941c;
        d1.b bVar = this.f1942d;
        if (z10) {
            g1.a(bVar.f1932a, view);
        }
        this.f1943e.a();
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has ended.");
        }
    }
}
