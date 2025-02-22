package b3;

import rf.l;
import sf.j;
import sf.k;

public final class r extends k implements l<String, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3166a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(1);
        this.f3166a = str;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(j.a((String) obj, this.f3166a));
    }
}
