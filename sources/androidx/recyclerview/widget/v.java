package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class v extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public s f2753c;

    /* renamed from: d  reason: collision with root package name */
    public r f2754d;

    public static int e(View view, t tVar) {
        return ((tVar.c(view) / 2) + tVar.e(view)) - ((tVar.l() / 2) + tVar.k());
    }

    public static View f(RecyclerView.m mVar, t tVar) {
        int w10 = mVar.w();
        View view = null;
        if (w10 == 0) {
            return null;
        }
        int l10 = (tVar.l() / 2) + tVar.k();
        int i8 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < w10; i10++) {
            View v3 = mVar.v(i10);
            int abs = Math.abs(((tVar.c(v3) / 2) + tVar.e(v3)) - l10);
            if (abs < i8) {
                view = v3;
                i8 = abs;
            }
        }
        return view;
    }

    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.d()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.e()) {
            iArr[1] = e(view, h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View c(RecyclerView.m mVar) {
        if (mVar.e()) {
            return f(mVar, h(mVar));
        }
        if (mVar.d()) {
            return f(mVar, g(mVar));
        }
        return null;
    }

    public final t g(RecyclerView.m mVar) {
        r rVar = this.f2754d;
        if (rVar == null || rVar.f2749a != mVar) {
            this.f2754d = new r(mVar);
        }
        return this.f2754d;
    }

    public final t h(RecyclerView.m mVar) {
        s sVar = this.f2753c;
        if (sVar == null || sVar.f2749a != mVar) {
            this.f2753c = new s(mVar);
        }
        return this.f2753c;
    }
}
