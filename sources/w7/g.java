package w7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class g<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public h f16518a;

    /* renamed from: b  reason: collision with root package name */
    public int f16519b = 0;

    public g() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        t(coordinatorLayout, v3, i8);
        if (this.f16518a == null) {
            this.f16518a = new h(v3);
        }
        h hVar = this.f16518a;
        View view = hVar.f16520a;
        hVar.f16521b = view.getTop();
        hVar.f16522c = view.getLeft();
        this.f16518a.a();
        int i10 = this.f16519b;
        if (i10 == 0) {
            return true;
        }
        h hVar2 = this.f16518a;
        if (hVar2.f16523d != i10) {
            hVar2.f16523d = i10;
            hVar2.a();
        }
        this.f16519b = 0;
        return true;
    }

    public final int s() {
        h hVar = this.f16518a;
        if (hVar != null) {
            return hVar.f16523d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        coordinatorLayout.q(v3, i8);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
