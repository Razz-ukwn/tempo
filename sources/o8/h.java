package o8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import m8.i;

public final class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f12243a;

    public h(NavigationView navigationView) {
        this.f12243a = navigationView;
    }

    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f12243a;
        navigationView.getLocationOnScreen(navigationView.G);
        int[] iArr = navigationView.G;
        boolean z10 = true;
        boolean z11 = iArr[1] == 0;
        i iVar = navigationView.E;
        if (iVar.S != z11) {
            iVar.S = z11;
            int i8 = (iVar.f11261b.getChildCount() != 0 || !iVar.S) ? 0 : iVar.U;
            NavigationMenuView navigationMenuView = iVar.f11260a;
            navigationMenuView.setPadding(0, i8, 0, navigationMenuView.getPaddingBottom());
        }
        navigationView.setDrawTopInsetForeground(z11 && navigationView.J);
        int i10 = iArr[0];
        navigationView.setDrawLeftInsetForeground(i10 == 0 || navigationView.getWidth() + i10 == 0);
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            navigationView.setDrawBottomInsetForeground((displayMetrics.heightPixels - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.K);
            int i11 = displayMetrics.widthPixels;
            if (!(i11 == iArr[0] || i11 - navigationView.getWidth() == iArr[0])) {
                z10 = false;
            }
            navigationView.setDrawRightInsetForeground(z10);
        }
    }
}
