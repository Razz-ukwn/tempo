package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class u0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2147b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2148c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2149d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2150e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2151f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t0 f2152g;

    public u0(t0 t0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2152g = t0Var;
        this.f2146a = obj;
        this.f2147b = arrayList;
        this.f2150e = obj2;
        this.f2151f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        t0 t0Var = this.f2152g;
        Object obj = this.f2146a;
        if (obj != null) {
            t0Var.t(obj, this.f2147b, (ArrayList<View>) null);
        }
        Object obj2 = this.f2148c;
        if (obj2 != null) {
            t0Var.t(obj2, this.f2149d, (ArrayList<View>) null);
        }
        Object obj3 = this.f2150e;
        if (obj3 != null) {
            t0Var.t(obj3, this.f2151f, (ArrayList<View>) null);
        }
    }
}
