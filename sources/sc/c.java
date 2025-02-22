package sc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.r;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet$setObservers$1", f = "CodeBottomSheet.kt", l = {98}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CodeBottomSheet f14909b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CodeBottomSheet f14910a;

        public a(CodeBottomSheet codeBottomSheet) {
            this.f14910a = codeBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            CodeBottomSheet codeBottomSheet = this.f14910a;
            codeBottomSheet.S0 = booleanValue;
            r rVar = codeBottomSheet.Q0;
            j.c(rVar);
            rVar.U.setEnabled(booleanValue);
            r rVar2 = codeBottomSheet.Q0;
            j.c(rVar2);
            rVar2.U.setClickable(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(CodeBottomSheet codeBottomSheet, d<? super c> dVar) {
        super(2, dVar);
        this.f14909b = codeBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f14909b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f14908a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = CodeBottomSheet.U0;
            CodeBottomSheet codeBottomSheet = this.f14909b;
            CodeViewModel.a aVar2 = codeBottomSheet.u0().f6711i;
            a aVar3 = new a(codeBottomSheet);
            this.f14908a = 1;
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
