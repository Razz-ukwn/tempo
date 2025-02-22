package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f2834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2835c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f2835c = fragmentStateAdapter;
        this.f2833a = frameLayout;
        this.f2834b = fVar;
    }

    public final void onLayoutChange(View view, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        FrameLayout frameLayout = this.f2833a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f2835c.t(this.f2834b);
        }
    }
}
