package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class s0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f2138a;

    public s0(Rect rect) {
        this.f2138a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f2138a;
    }
}
