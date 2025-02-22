package u2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import gf.q;
import gf.u;
import java.util.LinkedHashMap;
import java.util.Set;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15701a = b.f15707c;

    public enum a {
        f15702a,
        f15703b,
        f15704c,
        f15705d,
        f15706e,
        B;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f15707c = new b();

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f15708a = u.f8980a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f15709b = new LinkedHashMap();
    }

    public static b a(p pVar) {
        while (pVar != null) {
            if (pVar.C()) {
                pVar.u();
            }
            pVar = pVar.S;
        }
        return f15701a;
    }

    public static void b(b bVar, f fVar) {
        p pVar = fVar.f15710a;
        String name = pVar.getClass().getName();
        a aVar = a.f15702a;
        Set<a> set = bVar.f15708a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), fVar);
        }
        if (set.contains(a.f15703b)) {
            a2.a aVar2 = new a2.a(1, name, fVar);
            if (pVar.C()) {
                Handler handler = pVar.u().f1985u.f1916d;
                j.e(handler, "fragment.parentFragmentManager.host.handler");
                if (j.a(handler.getLooper(), Looper.myLooper())) {
                    aVar2.run();
                } else {
                    handler.post(aVar2);
                }
            } else {
                aVar2.run();
            }
        }
    }

    public static void c(f fVar) {
        if (i0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f15710a.getClass().getName()), fVar);
        }
    }

    public static final void d(p pVar, String str) {
        j.f(pVar, "fragment");
        j.f(str, "previousFragmentId");
        a aVar = new a(pVar, str);
        c(aVar);
        b a10 = a(pVar);
        if (a10.f15708a.contains(a.f15704c) && e(a10, pVar.getClass(), a.class)) {
            b(a10, aVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f15709b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (j.a(cls2.getSuperclass(), f.class) || !q.s0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
