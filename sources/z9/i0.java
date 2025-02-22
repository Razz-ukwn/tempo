package z9;

import aa.b;
import aa.c;
import aa.g;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import ba.b0;
import ba.c0;
import ba.l;
import ba.m;
import ba.n;
import ba.p;
import ba.q;
import ba.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d6.w;
import ea.d;
import ea.e;
import fa.a;
import fa.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s0.z;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final z f17842a;

    /* renamed from: b  reason: collision with root package name */
    public final d f17843b;

    /* renamed from: c  reason: collision with root package name */
    public final a f17844c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17845d;

    /* renamed from: e  reason: collision with root package name */
    public final g f17846e;

    public i0(z zVar, d dVar, a aVar, c cVar, g gVar) {
        this.f17842a = zVar;
        this.f17843b = dVar;
        this.f17844c = aVar;
        this.f17845d = cVar;
        this.f17846e = gVar;
    }

    public static l a(l lVar, c cVar, g gVar) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        l.a aVar = new l.a(lVar);
        String b10 = cVar.f219b.b();
        if (b10 != null) {
            aVar.f3525e = new u(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", (Throwable) null);
        }
        b reference = gVar.f238a.f241a.getReference();
        synchronized (reference) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f214a));
        }
        ArrayList c3 = c(unmodifiableMap);
        b reference2 = gVar.f239b.f241a.getReference();
        synchronized (reference2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.f214a));
        }
        ArrayList c10 = c(unmodifiableMap2);
        if (!c3.isEmpty() || !c10.isEmpty()) {
            m.a f10 = lVar.f3518c.f();
            f10.f3532b = new c0<>(c3);
            f10.f3533c = new c0<>(c10);
            aVar.f3523c = f10.a();
        }
        return aVar.a();
    }

    public static i0 b(Context context, g0 g0Var, e eVar, a aVar, c cVar, g gVar, ha.a aVar2, ga.d dVar, k7.g gVar2) {
        z zVar = new z(context, g0Var, aVar, aVar2, dVar);
        d dVar2 = new d(eVar, dVar);
        ca.a aVar3 = a.f8642b;
        w.b(context);
        return new i0(zVar, dVar2, new a(new fa.c(w.a().c(new b6.a(a.f8643c, a.f8644d)).a("FIREBASE_CRASHLYTICS_REPORT", new a6.b("json"), a.f8645e), dVar.b(), gVar2)), cVar, gVar);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new ba.e(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new z(2));
        return arrayList;
    }

    public final void d(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Thread thread2 = thread;
        String str3 = str2;
        boolean equals = str3.equals("crash");
        z zVar = this.f17842a;
        Context context = zVar.f17912a;
        int i8 = context.getResources().getConfiguration().orientation;
        ha.c cVar = zVar.f17915d;
        q1.a aVar = new q1.a(th, cVar);
        l.a aVar2 = new l.a();
        aVar2.f3522b = str3;
        aVar2.f3521a = Long.valueOf(j10);
        String str4 = zVar.f17914c.f17790e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        Boolean bool = null;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            bool = Boolean.valueOf(runningAppProcessInfo.importance != 100);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i8);
        ArrayList arrayList = new ArrayList();
        arrayList.add(z.e(thread2, (StackTraceElement[]) aVar.f12826c, 4));
        if (z10) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread3 = (Thread) next.getKey();
                if (!thread3.equals(thread2)) {
                    arrayList.add(z.e(thread3, cVar.c((StackTraceElement[]) next.getValue()), 0));
                }
            }
        }
        c0 c0Var = new c0(arrayList);
        p c3 = z.c(aVar, 0);
        Long l10 = 0L;
        String str5 = "";
        String str6 = l10 == null ? " address" : str5;
        if (str6.isEmpty()) {
            n nVar = new n(c0Var, c3, (b0.a) null, new q("0", "0", l10.longValue()), zVar.a());
            if (valueOf == null) {
                str5 = str5.concat(" uiOrientation");
            }
            if (str5.isEmpty()) {
                aVar2.f3523c = new m(nVar, (c0) null, (c0) null, bool2, valueOf.intValue());
                aVar2.f3524d = zVar.b(i8);
                this.f17843b.c(a(aVar2.a(), this.f17845d, this.f17846e), str, equals);
                return;
            }
            throw new IllegalStateException("Missing required properties:".concat(str5));
        }
        throw new IllegalStateException("Missing required properties:".concat(str6));
    }

    public final Task e(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        String str2 = str;
        ArrayList b10 = this.f17843b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                ca.a aVar = d.f7897f;
                String d10 = d.d(file);
                aVar.getClass();
                arrayList.add(new b(ca.a.h(d10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a0 a0Var = (a0) it2.next();
            if (str2 == null || str2.equals(a0Var.c())) {
                a aVar2 = this.f17844c;
                boolean z10 = true;
                boolean z11 = str2 != null;
                fa.c cVar = aVar2.f8646a;
                synchronized (cVar.f8656f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z11) {
                        ((AtomicInteger) cVar.f8659i.f10366b).getAndIncrement();
                        if (cVar.f8656f.size() >= cVar.f8655e) {
                            z10 = false;
                        }
                        if (z10) {
                            cb.d dVar = cb.d.f3892c;
                            dVar.w("Enqueueing report: " + a0Var.c());
                            dVar.w("Queue size: " + cVar.f8656f.size());
                            cVar.f8657g.execute(new c.a(a0Var, taskCompletionSource));
                            dVar.w("Closing task for report: " + a0Var.c());
                            taskCompletionSource.trySetResult(a0Var);
                        } else {
                            cVar.a();
                            String str3 = "Dropping report due to queue being full: " + a0Var.c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, (Throwable) null);
                            }
                            ((AtomicInteger) cVar.f8659i.f10365a).getAndIncrement();
                            taskCompletionSource.trySetResult(a0Var);
                        }
                    } else {
                        cVar.b(a0Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new j0.n(this, 5)));
            }
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList2);
    }
}
