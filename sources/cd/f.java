package cd;

import ag.g0;
import ag.s0;
import android.os.Bundle;
import b3.f0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import sf.j;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet$setObservers$1$2$1", f = "RegisterBottomSheet.kt", l = {141}, m = "invokeSuspend")
public final class f extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public UserModel f3972a;

    /* renamed from: b  reason: collision with root package name */
    public int f3973b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3974c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ UserModel f3975d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(RegisterBottomSheet registerBottomSheet, UserModel userModel, d<? super f> dVar) {
        super(2, dVar);
        this.f3974c = registerBottomSheet;
        this.f3975d = userModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f3974c, this.f3975d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        UserModel userModel;
        a aVar = a.f10464a;
        int i8 = this.f3973b;
        RegisterBottomSheet registerBottomSheet = this.f3974c;
        if (i8 == 0) {
            b.J(obj);
            c cVar = s0.f480a;
            UserModel userModel2 = this.f3975d;
            int i10 = RegisterBottomSheet.X0;
            UserModel copy$default = UserModel.copy$default(userModel2, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524286, (Object) null);
            this.f3972a = userModel2;
            this.f3973b = 1;
            Object a10 = registerBottomSheet.v0().f6863h.a(copy$default, this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
                return aVar;
            }
            userModel = userModel2;
        } else if (i8 == 1) {
            userModel = this.f3972a;
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h.b();
        h.c("ACCESS_TOKEN", userModel.getAuthToken());
        h.c("USER_ID", userModel.getId());
        h.c("CREATED_AT", userModel.getCreatedAt());
        q6.a aVar2 = registerBottomSheet.T0;
        if (aVar2 != null) {
            aVar2.e();
            ag.m.c(registerBottomSheet).l(R.id.action_registerBottomSheet_to_homeFragment, new Bundle(), (f0) null);
            return m.f8717a;
        }
        j.l("mGoogleSignInClient");
        throw null;
    }
}
