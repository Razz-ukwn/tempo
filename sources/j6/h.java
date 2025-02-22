package j6;

import d6.s;
import g6.c;
import java.util.Map;
import l6.b;

public final /* synthetic */ class h implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9820a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f9821b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9822c;

    public /* synthetic */ h(n nVar, Object obj, int i8) {
        this.f9820a = i8;
        this.f9821b = nVar;
        this.f9822c = obj;
    }

    public final Object b() {
        int i8 = this.f9820a;
        n nVar = this.f9821b;
        Object obj = this.f9822c;
        switch (i8) {
            case 0:
                return Boolean.valueOf(nVar.f9837c.i0((s) obj));
            default:
                nVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    nVar.f9843i.c((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }
}
