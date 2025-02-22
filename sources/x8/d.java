package x8;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import d2.j1;
import d2.z;

public final class d implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16989a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16989a = baseTransientBottomBar;
    }

    public final j1 a(View view, j1 j1Var) {
        int a10 = j1Var.a();
        BaseTransientBottomBar baseTransientBottomBar = this.f16989a;
        baseTransientBottomBar.m = a10;
        baseTransientBottomBar.f6068n = j1Var.b();
        baseTransientBottomBar.f6069o = j1Var.c();
        baseTransientBottomBar.f();
        return j1Var;
    }
}
