package bd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import rf.p;
import yg.b0;
import zd.g;
import zf.n;

@e(c = "com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel$verifyNumber$1", f = "PhoneNumberViewModel.kt", l = {44}, m = "invokeSuspend")
public final class i extends lf.i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PhoneNumberViewModel f3638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3639c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(PhoneNumberViewModel phoneNumberViewModel, String str, d<? super i> dVar) {
        super(2, dVar);
        this.f3638b = phoneNumberViewModel;
        this.f3639c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f3638b, this.f3639c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f3637a;
        PhoneNumberViewModel phoneNumberViewModel = this.f3638b;
        if (i8 == 0) {
            b.J(obj);
            phoneNumberViewModel.f6848j.k(new g.c());
            if (zd.a.g(phoneNumberViewModel)) {
                mc.a aVar2 = phoneNumberViewModel.f6845g;
                VerifyNumberRequestModel verifyNumberRequestModel = new VerifyNumberRequestModel(this.f3639c, n.Z0((String) phoneNumberViewModel.f6846h.getValue()).toString(), (String) null, (String) null, (String) null, (String) null, 60, (sf.e) null);
                this.f3637a = 1;
                obj = aVar2.f11379a.t(verifyNumberRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                phoneNumberViewModel.f6848j.k(new g.a(phoneNumberViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                phoneNumberViewModel.f6848j.k(new g.a(phoneNumberViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        phoneNumberViewModel.f6848j.k(phoneNumberViewModel.f((b0) obj));
        return m.f8717a;
    }
}
