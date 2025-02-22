package w7;

import android.view.View;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final View f16520a;

    /* renamed from: b  reason: collision with root package name */
    public int f16521b;

    /* renamed from: c  reason: collision with root package name */
    public int f16522c;

    /* renamed from: d  reason: collision with root package name */
    public int f16523d;

    public h(View view) {
        this.f16520a = view;
    }

    public final void a() {
        int i8 = this.f16523d;
        View view = this.f16520a;
        int top = i8 - (view.getTop() - this.f16521b);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f16522c));
    }
}
