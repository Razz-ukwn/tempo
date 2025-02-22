package tc;

import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel$isValid$3", f = "CreateAccountViewModel.kt", l = {}, m = "invokeSuspend")
public final class t extends i implements q<Boolean, Boolean, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f15600a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ boolean f15601b;

    public t(d<? super t> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        t tVar = new t((d) obj3);
        tVar.f15600a = booleanValue;
        tVar.f15601b = booleanValue2;
        return tVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return Boolean.valueOf(this.f15600a && this.f15601b);
    }
}
