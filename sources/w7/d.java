package w7;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class d implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f16501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16502b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16503c;

    public /* synthetic */ d(AppBarLayout.BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout) {
        this.f16501a = baseBehavior;
        this.f16502b = view;
        this.f16503c = appBarLayout;
    }

    public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
        this.f16501a.getClass();
        AppBarLayout.BaseBehavior.C(keyEvent, this.f16502b, this.f16503c);
        return false;
    }
}
