package e;

import d2.e1;
import d2.f1;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f7680a;

    public class a extends f1 {
        public a() {
        }

        public final void a() {
            i iVar = i.this;
            iVar.f7680a.R.setAlpha(1.0f);
            f fVar = iVar.f7680a;
            fVar.U.d((e1) null);
            fVar.U = null;
        }

        public final void d() {
            i.this.f7680a.R.setVisibility(0);
        }
    }

    public i(f fVar) {
        this.f7680a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            e.f r0 = r5.f7680a
            android.widget.PopupWindow r1 = r0.S
            androidx.appcompat.widget.ActionBarContextView r2 = r0.R
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            d2.d1 r1 = r0.U
            if (r1 == 0) goto L_0x0013
            r1.b()
        L_0x0013:
            boolean r1 = r0.W
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup r1 = r0.X
            if (r1 == 0) goto L_0x0025
            java.util.WeakHashMap<android.view.View, d2.d1> r2 = d2.i0.f7217a
            boolean r1 = d2.i0.g.c(r1)
            if (r1 == 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0044
            androidx.appcompat.widget.ActionBarContextView r1 = r0.R
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.R
            d2.d1 r1 = d2.i0.a(r1)
            r1.a(r2)
            r0.U = r1
            e.i$a r0 = new e.i$a
            r0.<init>()
            r1.d(r0)
            goto L_0x004e
        L_0x0044:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.R
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            r0.setVisibility(r4)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.run():void");
    }
}
