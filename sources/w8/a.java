package w8;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f16525a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f16525a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f16525a;
        return Math.max(0, sideSheetBehavior.m - sideSheetBehavior.f6036l);
    }
}
