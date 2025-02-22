package sd;

import ag.g0;
import ag.s0;
import cb.b;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet;
import ff.m;
import kf.a;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet$setObserver$2$2$1", f = "ChangePasswordBottomSheet.kt", l = {173}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public UserModel f14925a;

    /* renamed from: b  reason: collision with root package name */
    public int f14926b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordBottomSheet f14927c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ UserModel f14928d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ChangePasswordBottomSheet changePasswordBottomSheet, UserModel userModel, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f14927c = changePasswordBottomSheet;
        this.f14928d = userModel;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f14927c, this.f14928d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        UserModel userModel;
        a aVar = a.f10464a;
        int i8 = this.f14926b;
        ChangePasswordBottomSheet changePasswordBottomSheet = this.f14927c;
        if (i8 == 0) {
            b.J(obj);
            c cVar = s0.f480a;
            UserModel userModel2 = this.f14928d;
            int i10 = ChangePasswordBottomSheet.T0;
            UserModel copy$default = UserModel.copy$default(userModel2, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524286, (Object) null);
            this.f14925a = userModel2;
            this.f14926b = 1;
            Object a10 = changePasswordBottomSheet.u0().f7103h.a(copy$default, this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
                return aVar;
            }
            userModel = userModel2;
        } else if (i8 == 1) {
            userModel = this.f14925a;
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h.b();
        h.c("ACCESS_TOKEN", userModel.getAuthToken());
        h.c("USER_ID", userModel.getId());
        h.c("CREATED_AT", userModel.getCreatedAt());
        ag.m.c(changePasswordBottomSheet).o();
        return m.f8717a;
    }
}
