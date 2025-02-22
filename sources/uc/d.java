package uc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.v;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet$setObservers$1", f = "EmailBottomSheet.kt", l = {138}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmailBottomSheet f16009b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EmailBottomSheet f16010a;

        public a(EmailBottomSheet emailBottomSheet) {
            this.f16010a = emailBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            EmailBottomSheet emailBottomSheet = this.f16010a;
            emailBottomSheet.T0 = booleanValue;
            v vVar = emailBottomSheet.Q0;
            j.c(vVar);
            vVar.U.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(EmailBottomSheet emailBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f16009b = emailBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f16009b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f16008a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = EmailBottomSheet.W0;
            EmailBottomSheet emailBottomSheet = this.f16009b;
            EmailViewModel.a aVar2 = emailBottomSheet.v0().f6745i;
            a aVar3 = new a(emailBottomSheet);
            this.f16008a = 1;
            if (aVar2.a(aVar3, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
