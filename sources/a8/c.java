package a8;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e2.m;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f129b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i8) {
        this.f129b = bottomSheetBehavior;
        this.f128a = i8;
    }

    public final boolean a(View view) {
        this.f129b.C(this.f128a);
        return true;
    }
}
