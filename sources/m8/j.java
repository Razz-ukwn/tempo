package m8;

import android.view.View;
import d2.a;
import e2.i;
import m8.i;

public final class j extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f11273d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f11274e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i.c f11275f;

    public j(i.c cVar, int i8, boolean z10) {
        this.f11275f = cVar;
        this.f11273d = i8;
        this.f11274e = z10;
    }

    public final void d(View view, e2.i iVar) {
        i iVar2;
        this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
        int i8 = this.f11273d;
        int i10 = 0;
        int i11 = i8;
        while (true) {
            iVar2 = i.this;
            if (i10 >= i8) {
                break;
            }
            if (iVar2.f11264e.f(i10) == 2) {
                i11--;
            }
            i10++;
        }
        if (iVar2.f11261b.getChildCount() == 0) {
            i11--;
        }
        iVar.l(i.d.a(i11, 1, 1, 1, this.f11274e, view.isSelected()));
    }
}
