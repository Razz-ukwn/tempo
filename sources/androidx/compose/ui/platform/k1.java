package androidx.compose.ui.platform;

import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class k1 extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.savedstate.a f1342b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1343c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(boolean z10, androidx.savedstate.a aVar, String str) {
        super(0);
        this.f1341a = z10;
        this.f1342b = aVar;
        this.f1343c = str;
    }

    public final Object d() {
        if (this.f1341a) {
            androidx.savedstate.a aVar = this.f1342b;
            aVar.getClass();
            String str = this.f1343c;
            j.f(str, "key");
            aVar.f2769a.c(str);
        }
        return m.f8717a;
    }
}
