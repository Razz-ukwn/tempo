package tc;

import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel$isValid$2", f = "CreateAccountViewModel.kt", l = {}, m = "invokeSuspend")
public final class s extends i implements q<Boolean, String, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f15598a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f15599b;

    public s(d<? super s> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        s sVar = new s((d) obj3);
        sVar.f15598a = booleanValue;
        sVar.f15599b = (String) obj2;
        return sVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        boolean z10 = this.f15598a;
        String str = this.f15599b;
        boolean z11 = false;
        if (z10) {
            if (str.length() > 0) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
