package f9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class t {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f8629n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f8630a;

    /* renamed from: b  reason: collision with root package name */
    public final k f8631b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8632c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8633d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f8634e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f8635f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f8636g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f8637h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f8638i;

    /* renamed from: j  reason: collision with root package name */
    public final m f8639j = new m(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f8640k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public s f8641l;
    public IInterface m;

    public t(Context context, k kVar, Intent intent) {
        this.f8630a = context;
        this.f8631b = kVar;
        this.f8632c = "AppUpdateService";
        this.f8637h = intent;
        this.f8638i = new WeakReference((Object) null);
    }

    public static void b(t tVar, l lVar) {
        IInterface iInterface = tVar.m;
        ArrayList arrayList = tVar.f8633d;
        k kVar = tVar.f8631b;
        if (iInterface == null && !tVar.f8636g) {
            kVar.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(lVar);
            s sVar = new s(tVar);
            tVar.f8641l = sVar;
            tVar.f8636g = true;
            if (!tVar.f8630a.bindService(tVar.f8637h, sVar, 1)) {
                kVar.a("Failed to bind to the service.", new Object[0]);
                tVar.f8636g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c9 c9Var = new c9();
                    TaskCompletionSource taskCompletionSource = ((l) it.next()).f8618a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(c9Var);
                    }
                }
                arrayList.clear();
            }
        } else if (tVar.f8636g) {
            kVar.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(lVar);
        } else {
            lVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f8629n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f8632c)) {
                HandlerThread handlerThread = new HandlerThread(this.f8632c, 10);
                handlerThread.start();
                hashMap.put(this.f8632c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f8632c);
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f8634e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f8632c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
