package t;

import ag.m;
import ag.n2;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.google.android.gms.internal.p000firebaseauthapi.f2;
import com.google.android.gms.internal.p000firebaseauthapi.l5;
import com.google.android.gms.internal.p000firebaseauthapi.s0;
import com.google.android.gms.internal.p000firebaseauthapi.s7;
import com.google.android.gms.internal.p000firebaseauthapi.t7;
import com.google.android.gms.internal.p000firebaseauthapi.va;
import com.google.android.gms.internal.p000firebaseauthapi.vb;
import com.google.android.gms.internal.p000firebaseauthapi.vc;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.s;
import ea.e;
import j1.c;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.r;
import l9.v;
import o0.h;
import o0.i;
import q7.d3;
import q7.k;
import q7.k4;
import q7.s2;
import q7.t6;
import q7.u2;
import q7.x3;
import q7.y2;
import s0.c0;
import s0.m1;
import s0.q;
import sf.j;
import u.d;

public final class w2 implements l5, n, a0, u2, OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public Object f15268a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15269b;

    public /* synthetic */ w2(int i8) {
        this.f15268a = null;
        this.f15269b = s7.f4908d;
    }

    public /* synthetic */ w2(s0 s0Var) {
        vb vbVar = vb.f5020a;
        this.f15269b = s0Var;
        this.f15268a = vbVar;
    }

    public /* synthetic */ w2(Object obj, Object obj2) {
        this.f15268a = obj;
        this.f15269b = obj2;
    }

    public static w2 j() {
        zf zfVar = new zf(Pattern.compile("[.-]"));
        Matcher matcher = zfVar.f5137a.matcher("");
        matcher.getClass();
        if (!matcher.matches()) {
            return new w2((s0) new s((Object) zfVar));
        }
        throw new IllegalArgumentException(f2.a("The pattern may not match the empty string: %s", zfVar));
    }

    public final c a(o oVar) {
        c l10 = ((c) this.f15268a).l();
        l10.p((String) this.f15269b, oVar);
        return l10;
    }

    public final void b(long j10, q qVar) {
        T t2;
        j.f(qVar, "pointerInputNodes");
        i iVar = (i) this.f15269b;
        int i8 = qVar.f14416d;
        boolean z10 = true;
        for (int i10 = 0; i10 < i8; i10++) {
            m1 m1Var = (m1) qVar.f14413a[i10];
            if (z10) {
                d<h> dVar = iVar.f12061a;
                int i11 = dVar.f15640c;
                if (i11 > 0) {
                    T[] tArr = dVar.f15638a;
                    int i12 = 0;
                    while (true) {
                        t2 = tArr[i12];
                        if (j.a(((h) t2).f12053b, m1Var)) {
                            break;
                        }
                        i12++;
                        if (i12 >= i11) {
                            break;
                        }
                    }
                } else {
                    t2 = null;
                }
                h hVar = (h) t2;
                if (hVar != null) {
                    hVar.f12059h = true;
                    o0.n nVar = new o0.n(j10);
                    d<o0.n> dVar2 = hVar.f12054c;
                    if (!dVar2.g(nVar)) {
                        dVar2.b(new o0.n(j10));
                    }
                    iVar = hVar;
                } else {
                    z10 = false;
                }
            }
            h hVar2 = new h(m1Var);
            hVar2.f12054c.b(new o0.n(j10));
            iVar.f12061a.b(hVar2);
            iVar = hVar2;
        }
    }

    public final void c(a.e eVar, Object obj) {
        a aVar = k7.d.f10357k;
        ((r) eVar).H((k7.c) this.f15268a, (LocationRequest) this.f15269b, (TaskCompletionSource) obj);
    }

    public final void d() {
        try {
            e eVar = (e) this.f15269b;
            eVar.getClass();
            new File(eVar.f7904b, (String) this.f15268a).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) this.f15268a), e10);
        }
    }

    public final boolean e(o0.e eVar, boolean z10) {
        Map<o0.n, o0.o> map = eVar.f12044a;
        if (!((i) this.f15269b).a(map, (q0.h) this.f15268a, eVar, z10)) {
            return false;
        }
        return ((i) this.f15269b).d(eVar) || ((i) this.f15269b).e(map, (q0.h) this.f15268a, eVar, z10);
    }

    public final Object f() {
        z.c cVar = (z.c) ((AtomicReference) this.f15268a).get();
        int a10 = cVar.a(Thread.currentThread().getId());
        if (a10 >= 0) {
            return cVar.f17589c[a10];
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public final void g(String str, int i8, Throwable th, byte[] bArr, Map map) {
        k kVar;
        t6 t6Var = (t6) this.f15269b;
        t6Var.h().i();
        t6Var.f();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (SQLiteException e10) {
                t6Var.e().B.c(e10, "Database error while trying to delete uploaded bundles");
                ((m) t6Var.a()).getClass();
                t6Var.K = SystemClock.elapsedRealtime();
                t6Var.e().J.c(Long.valueOf(t6Var.K), "Disable upload, time");
            } catch (Throwable th2) {
                t6Var.P = false;
                t6Var.A();
                throw th2;
            }
        }
        ArrayList arrayList = t6Var.T;
        u6.q.i(arrayList);
        t6Var.T = null;
        if (i8 != 200) {
            if (i8 == 204) {
                i8 = 204;
            }
            t6Var.e().J.d(Integer.valueOf(i8), th, "Network upload failed. Will retry later. code, error");
            d3 d3Var = t6Var.E.D;
            ((m) t6Var.a()).getClass();
            d3Var.b(System.currentTimeMillis());
            if (i8 == 503 || i8 == 429) {
                d3 d3Var2 = t6Var.E.B;
                ((m) t6Var.a()).getClass();
                d3Var2.b(System.currentTimeMillis());
            }
            k kVar2 = t6Var.f13350c;
            t6.H(kVar2);
            kVar2.Q(arrayList);
            t6Var.C();
            t6Var.P = false;
            t6Var.A();
        }
        if (th == null) {
            d3 d3Var3 = t6Var.E.C;
            ((m) t6Var.a()).getClass();
            d3Var3.b(System.currentTimeMillis());
            t6Var.E.D.b(0);
            t6Var.C();
            t6Var.e().J.d(Integer.valueOf(i8), Integer.valueOf(bArr.length), "Successful upload. Got network response. code, size");
            k kVar3 = t6Var.f13350c;
            t6.H(kVar3);
            kVar3.O();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    try {
                        kVar = t6Var.f13350c;
                        t6.H(kVar);
                        long longValue = l10.longValue();
                        kVar.i();
                        kVar.j();
                        if (kVar.B().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e11) {
                        s2 s2Var = ((x3) kVar.f13121a).E;
                        x3.l(s2Var);
                        s2Var.B.c(e11, "Failed to delete a bundle in a queue table");
                        throw e11;
                    } catch (SQLiteException e12) {
                        ArrayList arrayList2 = t6Var.U;
                        if (arrayList2 == null || !arrayList2.contains(l10)) {
                            throw e12;
                        }
                    }
                }
                k kVar4 = t6Var.f13350c;
                t6.H(kVar4);
                kVar4.n();
                k kVar5 = t6Var.f13350c;
                t6.H(kVar5);
                kVar5.P();
                t6Var.U = null;
                y2 y2Var = t6Var.f13349b;
                t6.H(y2Var);
                if (!y2Var.m() || !t6Var.E()) {
                    t6Var.V = -1;
                    t6Var.C();
                } else {
                    t6Var.t();
                }
                t6Var.K = 0;
                t6Var.P = false;
                t6Var.A();
            } catch (Throwable th3) {
                k kVar6 = t6Var.f13350c;
                t6.H(kVar6);
                kVar6.P();
                throw th3;
            }
        }
        t6Var.e().J.d(Integer.valueOf(i8), th, "Network upload failed. Will retry later. code, error");
        d3 d3Var4 = t6Var.E.D;
        ((m) t6Var.a()).getClass();
        d3Var4.b(System.currentTimeMillis());
        d3 d3Var22 = t6Var.E.B;
        ((m) t6Var.a()).getClass();
        d3Var22.b(System.currentTimeMillis());
        k kVar22 = t6Var.f13350c;
        t6.H(kVar22);
        kVar22.Q(arrayList);
        t6Var.C();
        t6Var.P = false;
        t6Var.A();
    }

    public final void h(Object obj) {
        boolean z10;
        long id2 = Thread.currentThread().getId();
        synchronized (this.f15269b) {
            z.c cVar = (z.c) ((AtomicReference) this.f15268a).get();
            int a10 = cVar.a(id2);
            if (a10 < 0) {
                z10 = false;
            } else {
                cVar.f17589c[a10] = obj;
                z10 = true;
            }
            if (!z10) {
                ((AtomicReference) this.f15268a).set(cVar.b(obj, id2));
                ff.m mVar = ff.m.f8717a;
            }
        }
    }

    public final t7 i() {
        Integer num = (Integer) this.f15268a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (((s7) this.f15269b) != null) {
            return new t7(num.intValue(), (s7) this.f15269b);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }

    public final List k(CharSequence charSequence) {
        charSequence.getClass();
        Iterator a10 = ((s0) this.f15269b).a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a10.hasNext()) {
            arrayList.add((String) a10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void onComplete(Task task) {
        v vVar = (v) this.f15268a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15269b;
        synchronized (vVar.f11029f) {
            vVar.f11028e.remove(taskCompletionSource);
        }
    }

    public /* synthetic */ w2(k4 k4Var, String str) {
        this.f15269b = k4Var;
        this.f15268a = str;
    }

    public w2(e6 e6Var) {
        this.f15268a = e6Var;
        boolean b10 = e6Var.b();
        cb.c cVar = n2.f448a;
        if (b10) {
            vc a10 = va.f5017b.a();
            n2.f(e6Var);
            a10.zza();
        }
        this.f15269b = cVar;
    }

    public /* synthetic */ w2(Context context) {
        this.f15268a = context;
        this.f15269b = new rb.a(0);
    }

    public /* synthetic */ w2(d dVar, c0 c0Var) {
        this.f15268a = dVar;
        this.f15269b = c0Var;
    }

    public /* synthetic */ w2(s0.r rVar) {
        j.f(rVar, "rootCoordinates");
        this.f15268a = rVar;
        this.f15269b = new i();
    }

    public w2() {
        this.f15268a = new AtomicReference(z.d.f17590a);
        this.f15269b = new Object();
    }
}
