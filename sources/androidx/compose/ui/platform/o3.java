package androidx.compose.ui.platform;

import ag.g0;
import android.view.View;
import cb.b;
import com.quickkonnect.silencio.R;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import t.b2;
import t.z1;

@e(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
public final class o3 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f1383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z1 f1384b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1385c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o3(z1 z1Var, View view, d<? super o3> dVar) {
        super(2, dVar);
        this.f1384b = z1Var;
        this.f1385c = view;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o3(this.f1384b, this.f1385c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f1383a;
        z1 z1Var = this.f1384b;
        View view = this.f1385c;
        if (i8 == 0) {
            b.J(obj);
            this.f1383a = 1;
            Object B = cb.d.B(z1Var.f15310o, new b2((d<? super b2>) null), this);
            if (B != aVar) {
                B = m.f8717a;
            }
            if (B == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Throwable th) {
                if (t3.b(view) == z1Var) {
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (t3.b(view) == z1Var) {
            view.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
        }
        return m.f8717a;
    }
}
