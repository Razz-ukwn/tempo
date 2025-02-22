package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class u extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ v f2752q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context) {
        super(context);
        this.f2752q = vVar;
    }

    public final void c(View view, RecyclerView.x.a aVar) {
        v vVar = this.f2752q;
        int[] b10 = vVar.b(vVar.f2588a.getLayoutManager(), view);
        int i8 = b10[0];
        int i10 = b10[1];
        int ceil = (int) Math.ceil(((double) g(Math.max(Math.abs(i8), Math.abs(i10)))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2742j;
            aVar.f2519a = i8;
            aVar.f2520b = i10;
            aVar.f2521c = ceil;
            aVar.f2523e = decelerateInterpolator;
            aVar.f2524f = true;
        }
    }

    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int g(int i8) {
        return Math.min(100, super.g(i8));
    }
}
