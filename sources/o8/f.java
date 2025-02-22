package o8;

import ag.b1;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import b3.b;
import b3.b0;
import b3.f0;
import b3.m;
import b3.z;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.quickkonnect.silencio.R;
import j0.q;
import o8.g;
import sf.j;

public final class f implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12236a;

    public f(BottomNavigationView bottomNavigationView) {
        this.f12236a = bottomNavigationView;
    }

    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i8;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        g gVar = this.f12236a;
        gVar.getClass();
        g.b bVar = gVar.f12241e;
        if (bVar != null) {
            m mVar = (m) ((q) bVar).f9714a;
            j.f(mVar, "$navController");
            j.f(menuItem, "item");
            boolean z11 = false;
            z g10 = mVar.g();
            j.c(g10);
            b0 b0Var = g10.f3202b;
            j.c(b0Var);
            if (b0Var.j(menuItem.getItemId(), true) instanceof b.a) {
                i12 = R.anim.nav_default_enter_anim;
                i11 = R.anim.nav_default_exit_anim;
                i10 = R.anim.nav_default_pop_enter_anim;
                i8 = R.anim.nav_default_pop_exit_anim;
            } else {
                i12 = R.animator.nav_default_enter_anim;
                i11 = R.animator.nav_default_exit_anim;
                i10 = R.animator.nav_default_pop_enter_anim;
                i8 = R.animator.nav_default_pop_exit_anim;
            }
            int i14 = i12;
            int i15 = i11;
            int i16 = i10;
            int i17 = i8;
            if ((menuItem.getOrder() & 196608) == 0) {
                int i18 = b0.K;
                i13 = b0.a.a(mVar.i()).D;
                z10 = true;
            } else {
                z10 = false;
                i13 = -1;
            }
            try {
                mVar.l(menuItem.getItemId(), (Bundle) null, new f0(true, true, i13, false, z10, i14, i15, i16, i17));
                z g11 = mVar.g();
                if (g11 != null && b1.g(g11, menuItem.getItemId())) {
                    z11 = true;
                }
            } catch (IllegalArgumentException unused) {
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    public final void b(androidx.appcompat.view.menu.f fVar) {
    }
}
