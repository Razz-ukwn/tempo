package cd;

import ab.r;
import ag.g0;
import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet$setObservers$4", f = "RegisterBottomSheet.kt", l = {224}, m = "invokeSuspend")
public final class n extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3986b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegisterBottomSheet f3987a;

        public a(RegisterBottomSheet registerBottomSheet) {
            this.f3987a = registerBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            if (((Boolean) obj).booleanValue()) {
                RegisterBottomSheet registerBottomSheet = this.f3987a;
                b bVar = registerBottomSheet.V0;
                if (bVar != null) {
                    bVar.dismiss();
                    String x10 = registerBottomSheet.x(R.string.alert_title);
                    RegisterBottomSheet registerBottomSheet2 = this.f3987a;
                    j.e(x10, "getString(R.string.alert_title)");
                    zd.d.d(registerBottomSheet2, x10, "Email already registered.", "Ok", (String) null, false, new l(registerBottomSheet), new m(registerBottomSheet));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(RegisterBottomSheet registerBottomSheet, d<? super n> dVar) {
        super(2, dVar);
        this.f3986b = registerBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new n(this.f3986b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((n) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3985a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = RegisterBottomSheet.X0;
            RegisterBottomSheet registerBottomSheet = this.f3986b;
            y0 y0Var = registerBottomSheet.v0().f6867l;
            a aVar2 = new a(registerBottomSheet);
            this.f3985a = 1;
            if (y0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            cb.b.J(obj);
        }
        throw new r();
    }
}
