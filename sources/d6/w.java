package d6;

import a6.b;
import android.content.Context;
import androidx.activity.j;
import d6.j;
import i6.e;
import j6.n;
import j6.p;
import java.util.Collections;
import java.util.Set;
import m6.a;

public final class w implements v {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f7367e;

    /* renamed from: a  reason: collision with root package name */
    public final a f7368a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7369b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7370c;

    /* renamed from: d  reason: collision with root package name */
    public final n f7371d;

    public w(a aVar, a aVar2, e eVar, n nVar, p pVar) {
        this.f7368a = aVar;
        this.f7369b = aVar2;
        this.f7370c = eVar;
        this.f7371d = nVar;
        pVar.getClass();
        pVar.f9853a.execute(new j(pVar, 8));
    }

    public static w a() {
        k kVar = f7367e;
        if (kVar != null) {
            return kVar.C.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f7367e == null) {
            synchronized (w.class) {
                if (f7367e == null) {
                    context.getClass();
                    f7367e = new k(context);
                }
            }
        }
    }

    public final t c(b6.a aVar) {
        Set<T> set;
        if (aVar instanceof l) {
            aVar.getClass();
            set = Collections.unmodifiableSet(b6.a.f3250d);
        } else {
            set = Collections.singleton(new b("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f7346b = aVar.b();
        return new t(set, a10.a(), this);
    }
}
