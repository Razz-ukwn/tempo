package androidx.appcompat.widget;

import androidx.emoji2.text.m;
import i3.k;
import i3.o;
import sf.j;

public final /* synthetic */ class n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1093b;

    public /* synthetic */ n1(Object obj, int i8) {
        this.f1092a = i8;
        this.f1093b = obj;
    }

    public final void run() {
        int i8 = this.f1092a;
        Object obj = this.f1093b;
        switch (i8) {
            case 0:
                ((o1) obj).a();
                throw null;
            case 1:
                ((m.b) obj).c();
                return;
            case 2:
                i3.m mVar = (i3.m) obj;
                j.f(mVar, "this$0");
                k.c cVar = mVar.f9495e;
                if (cVar != null) {
                    mVar.f9492b.c(cVar);
                    return;
                } else {
                    j.l("observer");
                    throw null;
                }
            default:
                j.f((o) obj, "this$0");
                throw null;
        }
    }
}
