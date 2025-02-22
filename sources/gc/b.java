package gc;

import ag.g0;
import ag.g2;
import ag.s0;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.j0;
import cb.s;
import com.google.android.gms.internal.measurement.rb;
import d0.g;
import d2.f1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.sync.d;
import n0.a;
import q.r;
import q7.e2;
import qg.u;
import rf.l;
import s0.a0;
import s0.p1;
import sf.j;
import x0.h;

public final class b implements s, e2, u {
    public static final v B = new v("ENQUEUE_FAILED");
    public static final v C = new v("ON_CLOSE_HANDLER_INVOKED");
    public static final v D = new v("UNLOCK_FAIL");
    public static final v E;
    public static final v F;
    public static final kotlinx.coroutines.sync.b G;
    public static final kotlinx.coroutines.sync.b H;
    public static final /* synthetic */ b I = new b();
    public static final String[] J = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] K = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f8931a;

    /* renamed from: b  reason: collision with root package name */
    public static final v f8932b = new v("EMPTY");

    /* renamed from: c  reason: collision with root package name */
    public static final v f8933c = new v("OFFER_SUCCESS");

    /* renamed from: d  reason: collision with root package name */
    public static final v f8934d = new v("OFFER_FAILED");

    /* renamed from: e  reason: collision with root package name */
    public static final v f8935e = new v("POLL_FAILED");

    static {
        v vVar = new v("LOCKED");
        E = vVar;
        v vVar2 = new v("UNLOCKED");
        F = vVar2;
        G = new kotlinx.coroutines.sync.b(vVar);
        H = new kotlinx.coroutines.sync.b(vVar2);
    }

    public static final long a(int i8) {
        long j10 = (((long) i8) << 32) | (((long) 0) & 4294967295L);
        int i10 = a.f11526k;
        return j10;
    }

    public static d b() {
        return new d(false);
    }

    public static final long c(int i8, int i10) {
        boolean z10 = true;
        if (i8 >= 0) {
            if (i10 < 0) {
                z10 = false;
            }
            if (z10) {
                long j10 = (((long) i10) & 4294967295L) | (((long) i8) << 32);
                int i11 = h.f16907c;
                return j10;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i8 + ", end: " + i10 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i8 + ", end: " + i10 + ']').toString());
    }

    public static synchronized void d() {
        synchronized (b.class) {
            if (f8931a == null) {
                throw new IllegalStateException("You must first call initialize before calling any other methods");
            }
        }
    }

    public static final int e(long j10, long j11) {
        boolean p10 = p(j10);
        return p10 != p(j11) ? p10 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }

    public static final r f(double d10) {
        return d10 < 0.0d ? new r(0.0d, Math.sqrt(Math.abs(d10))) : new r(Math.sqrt(d10), 0.0d);
    }

    public static final long h(long j10, int i8) {
        int i10 = h.f16907c;
        int i11 = (int) (j10 >> 32);
        int q10 = f1.q(i11, 0, i8);
        int q11 = f1.q(h.a(j10), 0, i8);
        return (q10 == i11 && q11 == h.a(j10)) ? j10 : c(q10, q11);
    }

    public static final a0 i(a0 a0Var, l lVar) {
        j.f(a0Var, "<this>");
        j.f(lVar, "selector");
        for (a0 q10 = a0Var.q(); q10 != null; q10 = q10.q()) {
            if (((Boolean) lVar.invoke(q10)).booleanValue()) {
                return q10;
            }
        }
        return null;
    }

    public static final void j(a0 a0Var, List list) {
        u.d<a0> r10 = a0Var.r();
        int i8 = r10.f15640c;
        if (i8 > 0) {
            T[] tArr = r10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var2 = (a0) tArr[i10];
                p1 n2 = n(a0Var2);
                if (n2 != null) {
                    list.add(n2);
                } else {
                    j(a0Var2, list);
                }
                i10++;
            } while (i10 < i8);
        }
    }

    public static final int k(Cursor cursor, String str) {
        String str2;
        j.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            j.e(columnNames, "c.columnNames");
            str2 = gf.l.c0(columnNames, (String) null, (String) null, (String) null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final int l(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final p1 m(a0 a0Var) {
        j.f(a0Var, "<this>");
        g.c cVar = a0Var.V.f14404e;
        if ((cVar.f7179c & 8) != 0) {
            while (true) {
                if (cVar != null) {
                    if ((cVar.f7178b & 8) == 0 || !(cVar instanceof p1) || !((p1) cVar).c().f16062b) {
                        if ((cVar.f7179c & 8) == 0) {
                            break;
                        }
                        cVar = cVar.f7181e;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cVar = null;
        return (p1) cVar;
    }

    public static final p1 n(a0 a0Var) {
        j.f(a0Var, "<this>");
        g.c cVar = a0Var.V.f14404e;
        if ((cVar.f7179c & 8) != 0) {
            while (true) {
                if (cVar != null) {
                    if ((cVar.f7178b & 8) == 0 || !(cVar instanceof p1)) {
                        if ((cVar.f7179c & 8) == 0) {
                            break;
                        }
                        cVar = cVar.f7181e;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cVar = null;
        return (p1) cVar;
    }

    public static final g0 o(j0 j0Var) {
        Object obj;
        Object obj2;
        j.f(j0Var, "<this>");
        HashMap hashMap = j0Var.f2282a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj2 = j0Var.f2282a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj = obj2;
        }
        g0 g0Var = (g0) obj;
        if (g0Var != null) {
            return g0Var;
        }
        g2 f10 = cb.d.f();
        c cVar = s0.f480a;
        return (g0) j0Var.d(new androidx.lifecycle.d(f10.n0(m.f10728a.J0())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final boolean p(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(android.os.Bundle r8, java.lang.Object r9) {
        /*
            d()
            gc.e r0 = f8931a
            if (r8 != 0) goto L_0x000c
            r0.getClass()
            goto L_0x00c8
        L_0x000c:
            java.util.WeakHashMap r1 = r0.f8948i
            boolean r2 = r1.containsKey(r9)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.Object r8 = r1.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0034
        L_0x001e:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getName()
            r2[r4] = r6
            java.lang.String r6 = "uuid_%s"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            java.lang.String r8 = r8.getString(r2, r5)
        L_0x0034:
            if (r8 == 0) goto L_0x0039
            r1.put(r9, r8)
        L_0x0039:
            if (r8 != 0) goto L_0x003d
            goto L_0x00c8
        L_0x003d:
            java.util.HashMap r1 = r0.f8947h
            boolean r2 = r1.containsKey(r8)
            java.lang.String r6 = "bundle_%s"
            if (r2 == 0) goto L_0x004f
            java.lang.Object r1 = r1.get(r8)
            r5 = r1
            android.os.Bundle r5 = (android.os.Bundle) r5
            goto L_0x007c
        L_0x004f:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r8
            java.lang.String r1 = java.lang.String.format(r6, r1)
            android.content.SharedPreferences r2 = r0.f8950k
            java.lang.String r1 = r2.getString(r1, r5)
            if (r1 != 0) goto L_0x0060
            goto L_0x007c
        L_0x0060:
            byte[] r1 = android.util.Base64.decode(r1, r4)
            android.os.Parcel r2 = android.os.Parcel.obtain()
            int r5 = r1.length
            r2.unmarshall(r1, r4, r5)
            r2.setDataPosition(r4)
            java.lang.Class<hc.a> r1 = hc.a.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r5 = r2.readBundle(r1)
            r2.recycle()
        L_0x007c:
            if (r5 == 0) goto L_0x00a6
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0086:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r5.get(r2)
            boolean r7 = r7 instanceof ic.a
            if (r7 == 0) goto L_0x0086
            java.lang.Object r7 = r5.get(r2)
            ic.a r7 = (ic.a) r7
            android.graphics.Bitmap r7 = r7.f9650a
            r5.putParcelable(r2, r7)
            goto L_0x0086
        L_0x00a6:
            java.util.HashMap r1 = r0.f8947h
            r1.remove(r8)
            android.content.SharedPreferences r1 = r0.f8950k
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r8
            java.lang.String r8 = java.lang.String.format(r6, r2)
            android.content.SharedPreferences$Editor r8 = r1.remove(r8)
            r8.apply()
            if (r5 != 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            gc.f r8 = r0.f8949j
            r8.b(r9)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.q(android.os.Bundle, java.lang.Object):void");
    }

    public static void r(Bundle bundle, Object obj) {
        d();
        e eVar = f8931a;
        WeakHashMap weakHashMap = eVar.f8948i;
        String str = (String) weakHashMap.get(obj);
        if (str == null) {
            str = UUID.randomUUID().toString();
            weakHashMap.put(obj, str);
        }
        boolean z10 = true;
        bundle.putString(String.format("uuid_%s", new Object[]{obj.getClass().getName()}), str);
        Bundle bundle2 = new Bundle();
        eVar.f8949j.a(bundle2, obj);
        if (!bundle2.isEmpty()) {
            for (String next : bundle2.keySet()) {
                if (bundle2.get(next) instanceof Bitmap) {
                    bundle2.putParcelable(next, new ic.a((Bitmap) bundle2.get(next)));
                }
            }
            eVar.f8947h.put(str, bundle2);
            c cVar = new c(eVar, str, bundle2);
            if (eVar.f8944e == null) {
                eVar.f8944e = new CountDownLatch(1);
            }
            eVar.f8946g.add(cVar);
            eVar.f8945f.execute(cVar);
            if (eVar.f8940a <= 0 && !eVar.f8942c) {
                z10 = false;
            }
            if (!z10) {
                try {
                    eVar.f8944e.await(5000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                eVar.f8944e = null;
            }
        }
    }

    public Object g() {
        return new LinkedHashMap();
    }

    public Object zza() {
        List list = q7.g2.f13022a;
        return Boolean.valueOf(rb.f5507b.zza().zze());
    }
}
