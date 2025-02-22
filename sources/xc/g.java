package xc;

import ag.g0;
import ag.s0;
import android.os.Bundle;
import b3.f0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet$setObservers$2$2$1", f = "LoginBottomSheet.kt", l = {135}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public UserModel f17041a;

    /* renamed from: b  reason: collision with root package name */
    public int f17042b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LoginBottomSheet f17043c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ UserModel f17044d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(LoginBottomSheet loginBottomSheet, UserModel userModel, d<? super g> dVar) {
        super(2, dVar);
        this.f17043c = loginBottomSheet;
        this.f17044d = userModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f17043c, this.f17044d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        UserModel userModel;
        a aVar = a.f10464a;
        int i8 = this.f17042b;
        LoginBottomSheet loginBottomSheet = this.f17043c;
        if (i8 == 0) {
            b.J(obj);
            c cVar = s0.f480a;
            UserModel userModel2 = this.f17044d;
            int i10 = LoginBottomSheet.W0;
            UserModel copy$default = UserModel.copy$default(userModel2, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524286, (Object) null);
            this.f17041a = userModel2;
            this.f17042b = 1;
            Object a10 = loginBottomSheet.u0().f6792h.a(copy$default, this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
                return aVar;
            }
            userModel = userModel2;
        } else if (i8 == 1) {
            userModel = this.f17041a;
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h.b();
        h.c("ACCESS_TOKEN", userModel.getAuthToken());
        h.c("USER_ID", userModel.getId());
        h.c("CREATED_AT", userModel.getCreatedAt());
        ag.m.c(loginBottomSheet).l(R.id.action_loginBottomSheet_to_homeFragment, new Bundle(), (f0) null);
        return m.f8717a;
    }
}
