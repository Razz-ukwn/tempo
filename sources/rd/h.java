package rd;

import ag.g0;
import ag.s0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import ff.m;
import jf.d;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import sf.j;
import sf.k;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.ProfileFragment$setObservers$2$2$1", f = "ProfileFragment.kt", l = {326}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ UserModel B;
    public final /* synthetic */ g<LoginWithPhoneResponseModel> C;

    /* renamed from: a  reason: collision with root package name */
    public ProfileFragment f14219a;

    /* renamed from: b  reason: collision with root package name */
    public UserModel f14220b;

    /* renamed from: c  reason: collision with root package name */
    public g f14221c;

    /* renamed from: d  reason: collision with root package name */
    public int f14222d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14223e;

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ProfileFragment f14224a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProfileFragment profileFragment) {
            super(0);
            this.f14224a = profileFragment;
        }

        public final Object d() {
            int i8 = ProfileFragment.I0;
            this.f14224a.p0();
            return m.f8717a;
        }
    }

    public static final class b extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14225a = new b();

        public b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object d() {
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ProfileFragment profileFragment, UserModel userModel, g<LoginWithPhoneResponseModel> gVar, d<? super h> dVar) {
        super(2, dVar);
        this.f14223e = profileFragment;
        this.B = userModel;
        this.C = gVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f14223e, this.B, this.C, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        ProfileFragment profileFragment;
        UserModel userModel;
        g<LoginWithPhoneResponseModel> gVar;
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f14222d;
        if (i8 == 0) {
            cb.b.J(obj);
            c cVar = s0.f480a;
            userModel = this.B;
            int i10 = ProfileFragment.I0;
            ProfileFragment profileFragment2 = this.f14223e;
            profileFragment = profileFragment2;
            UserModel copy$default = UserModel.copy$default(userModel, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524286, (Object) null);
            this.f14219a = profileFragment;
            this.f14220b = userModel;
            g<LoginWithPhoneResponseModel> gVar2 = this.C;
            this.f14221c = gVar2;
            this.f14222d = 1;
            Object a10 = profileFragment2.o0().f7090h.a(copy$default, this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else if (i8 == 1) {
            gVar = this.f14221c;
            userModel = this.f14220b;
            profileFragment = this.f14219a;
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zd.h.b();
        zd.h.c("ACCESS_TOKEN", userModel.getAuthToken());
        zd.h.c("USER_ID", userModel.getId());
        zd.h.c("CREATED_AT", userModel.getCreatedAt());
        String string = profileFragment.e0().getString(R.string.alert_title);
        String message = ((LoginWithPhoneResponseModel) gVar.f17948a).getMessage();
        if (message == null) {
            message = "";
        }
        j.e(string, "getString(R.string.alert_title)");
        zd.d.d(profileFragment, string, message, "OK", (String) null, false, new a(profileFragment), b.f14225a);
        return m.f8717a;
    }
}
