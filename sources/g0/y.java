package g0;

import com.google.android.gms.internal.p000firebaseauthapi.gf;
import g0.k;
import q0.c;
import rf.l;
import sf.j;
import sf.k;

public final class y extends k implements l<c.a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f8790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f8791b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8792c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l<s, Boolean> f8793d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(s sVar, s sVar2, int i8, k.b bVar) {
        super(1);
        this.f8790a = sVar;
        this.f8791b = sVar2;
        this.f8792c = i8;
        this.f8793d = bVar;
    }

    public final Object invoke(Object obj) {
        c.a aVar = (c.a) obj;
        j.f(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(gf.l(this.f8790a, this.f8791b, this.f8792c, this.f8793d));
        if (valueOf.booleanValue() || !aVar.a()) {
            return valueOf;
        }
        return null;
    }
}
