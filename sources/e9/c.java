package e9;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.fragment.app.z0;
import b1.b;
import b7.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.quickkonnect.silencio.R;
import d2.f1;
import f1.h;
import f3.o0;
import f3.v2;
import gf.q;
import gf.s;
import gf.t;
import gf.u;
import hf.f;
import i3.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.g;
import q7.e2;
import q7.g2;
import rf.p;
import sf.j;
import x3.d;
import x3.e;
import x3.f;

public class c implements e2 {

    /* renamed from: a  reason: collision with root package name */
    public static j f7876a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f7877b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7878c = {R.attr.elevation};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ c f7879d = new c();

    public static final long a(int i8, int i10) {
        long j10 = (((long) i10) & 4294967295L) | (((long) i8) << 32);
        int i11 = h.f8036c;
        return j10;
    }

    public static final f b(f fVar) {
        hf.b<E, ?> bVar = fVar.f9327a;
        bVar.b();
        bVar.H = true;
        return fVar;
    }

    public static final void c(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            z0.c(th, th2);
        }
    }

    public static final x3.h d(Context context) {
        f.a aVar = new f.a(context);
        return new x3.h(aVar.f16930a, aVar.f16931b, a.x(new x3.c(aVar)), a.x(new d(aVar)), a.x(e.f16929a), new x3.a(), aVar.f16932c);
    }

    public static final jf.d e(Object obj, jf.d dVar, p pVar) {
        j.f(pVar, "<this>");
        j.f(dVar, "completion");
        if (pVar instanceof lf.a) {
            return ((lf.a) pVar).create(obj, dVar);
        }
        jf.f context = dVar.getContext();
        return context == g.f10014a ? new kf.b(obj, dVar, pVar) : new kf.c(dVar, context, pVar, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        c(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(n3.c r4) {
        /*
            hf.a r0 = new hf.a
            r0.<init>()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r4.e(r1)
        L_0x000b:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x004e }
            r0.add(r2)     // Catch:{ all -> 0x004e }
            goto L_0x000b
        L_0x001a:
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x004e }
            r2 = 0
            c(r1, r2)
            cb.d.p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            r1 = r0
            hf.a$a r1 = (hf.a.C0166a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004d
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "triggerName"
            sf.j.e(r1, r2)
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = zf.j.x0(r1, r2, r3)
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = "DROP TRIGGER IF EXISTS "
            java.lang.String r1 = r2.concat(r1)
            r4.l(r1)
            goto L_0x0027
        L_0x004d:
            return
        L_0x004e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            c(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.c.f(n3.c):void");
    }

    public static final jf.d g(jf.d dVar) {
        jf.d<Object> intercepted;
        j.f(dVar, "<this>");
        lf.c cVar = dVar instanceof lf.c ? (lf.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static final boolean h(i4.e eVar) {
        return j.a(eVar, i4.e.f9572c);
    }

    public static final Cursor i(i3.p pVar, r rVar) {
        j.f(pVar, "db");
        j.f(rVar, "sqLiteQuery");
        return pVar.n(rVar, (CancellationSignal) null);
    }

    public static final Set j(Object... objArr) {
        int length;
        int length2 = objArr.length;
        u uVar = u.f8980a;
        if (length2 <= 0 || (length = objArr.length) == 0) {
            return uVar;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(f1.B(objArr.length));
            for (Object add : objArr) {
                linkedHashSet.add(add);
            }
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        j.e(singleton, "singleton(element)");
        return singleton;
    }

    public static void k(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.f4176b <= 0) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(ag.d.f(status));
        }
    }

    public static final boolean l(v2 v2Var, v2 v2Var2, o0 o0Var) {
        j.f(v2Var, "<this>");
        return v2Var2 == null || ((v2Var2 instanceof v2.b) && (v2Var instanceof v2.a)) || ((!(v2Var instanceof v2.b) || !(v2Var2 instanceof v2.a)) && !(v2Var.f8521c == v2Var2.f8521c && v2Var.f8522d == v2Var2.f8522d && v2Var2.a(o0Var) <= v2Var.a(o0Var)));
    }

    public static void m(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final List n(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(q.u0(list)) : s.f8978a;
    }

    public static final Map o(Map map) {
        int size = map.size();
        if (size == 0) {
            return t.f8979a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) q.t0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final String p(float f10) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f11 = f10 * pow;
        int i8 = (int) f11;
        if (f11 - ((float) i8) >= 0.5f) {
            i8++;
        }
        float f12 = ((float) i8) / pow;
        return max > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(jf.d r8) {
        /*
            jf.f r0 = r8.getContext()
            cb.d.z(r0)
            jf.d r8 = g(r8)
            boolean r1 = r8 instanceof kotlinx.coroutines.internal.f
            r2 = 0
            if (r1 == 0) goto L_0x0013
            kotlinx.coroutines.internal.f r8 = (kotlinx.coroutines.internal.f) r8
            goto L_0x0014
        L_0x0013:
            r8 = r2
        L_0x0014:
            kf.a r1 = kf.a.f10464a
            if (r8 != 0) goto L_0x001c
            ff.m r8 = ff.m.f8717a
            goto L_0x008a
        L_0x001c:
            ag.c0 r3 = r8.f10709d
            boolean r4 = r3.H0()
            r5 = 1
            if (r4 == 0) goto L_0x002f
            ff.m r2 = ff.m.f8717a
            r8.B = r2
            r8.f474c = r5
            r3.G0(r0, r8)
            goto L_0x0089
        L_0x002f:
            ag.r2 r4 = new ag.r2
            r4.<init>()
            jf.f r0 = r0.n0(r4)
            ff.m r6 = ff.m.f8717a
            r8.B = r6
            r8.f474c = r5
            r3.G0(r0, r8)
            boolean r0 = r4.f479b
            if (r0 == 0) goto L_0x0089
            ag.y0 r0 = ag.i2.a()
            kotlinx.coroutines.internal.a<ag.q0<?>> r3 = r0.f512e
            r4 = 0
            if (r3 == 0) goto L_0x0057
            int r7 = r3.f10698b
            int r3 = r3.f10699c
            if (r7 != r3) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r3 = r4
            goto L_0x0058
        L_0x0057:
            r3 = r5
        L_0x0058:
            if (r3 == 0) goto L_0x005b
            goto L_0x007d
        L_0x005b:
            boolean r3 = r0.M0()
            if (r3 == 0) goto L_0x0069
            r8.B = r6
            r8.f474c = r5
            r0.K0(r8)
            goto L_0x007e
        L_0x0069:
            r0.L0(r5)
            r8.run()     // Catch:{ all -> 0x0076 }
        L_0x006f:
            boolean r3 = r0.O0()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x006f
            goto L_0x007a
        L_0x0076:
            r3 = move-exception
            r8.h(r3, r2)     // Catch:{ all -> 0x0084 }
        L_0x007a:
            r0.J0(r5)
        L_0x007d:
            r5 = r4
        L_0x007e:
            if (r5 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            ff.m r8 = ff.m.f8717a
            goto L_0x008a
        L_0x0084:
            r8 = move-exception
            r0.J0(r5)
            throw r8
        L_0x0089:
            r8 = r1
        L_0x008a:
            if (r8 != r1) goto L_0x008d
            return r8
        L_0x008d:
            ff.m r8 = ff.m.f8717a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.c.q(jf.d):java.lang.Object");
    }

    public Object zza() {
        List list = g2.f13022a;
        return Boolean.valueOf(((ha) ga.f5297b.f5298a.zza()).zzc());
    }
}
