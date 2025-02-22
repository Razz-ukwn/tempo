package bd;

import ag.g0;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.j0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet$setObservers$1", f = "PhoneNumberBottomSheet.kt", l = {85}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PhoneNumberBottomSheet f3629b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhoneNumberBottomSheet f3630a;

        public a(PhoneNumberBottomSheet phoneNumberBottomSheet) {
            this.f3630a = phoneNumberBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            PhoneNumberBottomSheet phoneNumberBottomSheet = this.f3630a;
            phoneNumberBottomSheet.T0 = booleanValue;
            j0 j0Var = phoneNumberBottomSheet.Q0;
            j.c(j0Var);
            j0Var.U.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(PhoneNumberBottomSheet phoneNumberBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f3629b = phoneNumberBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f3629b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3628a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = PhoneNumberBottomSheet.V0;
            PhoneNumberBottomSheet phoneNumberBottomSheet = this.f3629b;
            PhoneNumberViewModel.a aVar2 = phoneNumberBottomSheet.u0().f6847i;
            a aVar3 = new a(phoneNumberBottomSheet);
            this.f3628a = 1;
            if (aVar2.a(aVar3, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
