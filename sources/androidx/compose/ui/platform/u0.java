package androidx.compose.ui.platform;

import android.view.View;
import ff.m;
import h0.d;
import sf.j;
import sf.k;

public final class u0 implements v2 {

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u0 f1474a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var) {
            super(0);
            this.f1474a = u0Var;
        }

        public final Object d() {
            this.f1474a.getClass();
            return m.f8717a;
        }
    }

    public u0(View view) {
        j.f(view, "view");
        new a(this);
        j.f(true & true ? d.f9073e : null, "rect");
    }
}
