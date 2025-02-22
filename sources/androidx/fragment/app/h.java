package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d1;
import androidx.fragment.app.m;
import y1.e;

public final class h implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1959b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m.a f1960c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d1.b f1961d;

    public h(View view, ViewGroup viewGroup, m.a aVar, d1.b bVar) {
        this.f1958a = view;
        this.f1959b = viewGroup;
        this.f1960c = aVar;
        this.f1961d = bVar;
    }

    public final void onCancel() {
        View view = this.f1958a;
        view.clearAnimation();
        this.f1959b.endViewTransition(view);
        this.f1960c.a();
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1961d + " has been cancelled.");
        }
    }
}
