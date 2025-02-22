package l8;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f11013a;

    public b(d dVar) {
        this.f11013a = dVar;
    }

    public final boolean onPreDraw() {
        d dVar = this.f11013a;
        float rotation = dVar.f5979q.getRotation();
        if (dVar.f5973j == rotation) {
            return true;
        }
        dVar.f5973j = rotation;
        dVar.m();
        return true;
    }
}
