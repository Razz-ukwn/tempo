package w7;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class c implements View.OnUnhandledKeyEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f16498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16499b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16500c;

    public /* synthetic */ c(AppBarLayout.BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout) {
        this.f16498a = baseBehavior;
        this.f16499b = view;
        this.f16500c = appBarLayout;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior baseBehavior = this.f16498a;
        View view2 = this.f16499b;
        AppBarLayout appBarLayout = this.f16500c;
        baseBehavior.getClass();
        AppBarLayout.BaseBehavior.C(keyEvent, view2, appBarLayout);
        return false;
    }
}
