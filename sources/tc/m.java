package tc;

import ag.g0;
import ag.s0;
import android.os.Bundle;
import b3.f0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import jf.d;
import kf.a;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet$setObservers$4$2$1", f = "CreateAccountBottomSheet.kt", l = {228}, m = "invokeSuspend")
public final class m extends i implements p<g0, d<? super ff.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public UserModel f15586a;

    /* renamed from: b  reason: collision with root package name */
    public int f15587b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15588c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ UserModel f15589d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(CreateAccountBottomSheet createAccountBottomSheet, UserModel userModel, d<? super m> dVar) {
        super(2, dVar);
        this.f15588c = createAccountBottomSheet;
        this.f15589d = userModel;
    }

    public final d<ff.m> create(Object obj, d<?> dVar) {
        return new m(this.f15588c, this.f15589d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((g0) obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        UserModel userModel;
        a aVar = a.f10464a;
        int i8 = this.f15587b;
        CreateAccountBottomSheet createAccountBottomSheet = this.f15588c;
        if (i8 == 0) {
            b.J(obj);
            c cVar = s0.f480a;
            UserModel userModel2 = this.f15589d;
            int i10 = CreateAccountBottomSheet.W0;
            UserModel copy$default = UserModel.copy$default(userModel2, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524286, (Object) null);
            this.f15586a = userModel2;
            this.f15587b = 1;
            Object a10 = createAccountBottomSheet.v0().f6727h.a(copy$default, this);
            if (a10 != aVar) {
                a10 = ff.m.f8717a;
            }
            if (a10 == aVar) {
                return aVar;
            }
            userModel = userModel2;
        } else if (i8 == 1) {
            userModel = this.f15586a;
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h.b();
        h.c("ACCESS_TOKEN", userModel.getAuthToken());
        h.c("USER_ID", userModel.getId());
        h.c("CREATED_AT", userModel.getCreatedAt());
        ag.m.c(createAccountBottomSheet).l(R.id.action_createAccountBottomSheet_to_homeFragment, new Bundle(), (f0) null);
        return ff.m.f8717a;
    }
}
