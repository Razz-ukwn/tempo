package w8;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f16528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16529b;

    public /* synthetic */ e(SideSheetBehavior sideSheetBehavior, int i8) {
        this.f16528a = sideSheetBehavior;
        this.f16529b = i8;
    }

    public final void run() {
        SideSheetBehavior sideSheetBehavior = this.f16528a;
        View view = (View) sideSheetBehavior.f6037n.get();
        if (view != null) {
            sideSheetBehavior.t(view, this.f16529b, false);
        }
    }
}
