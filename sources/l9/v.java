package l9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class v {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f11023n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f11024a;

    /* renamed from: b  reason: collision with root package name */
    public final m f11025b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11026c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f11027d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f11028e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f11029f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f11030g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f11031h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f11032i;

    /* renamed from: j  reason: collision with root package name */
    public final o f11033j = new o(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f11034k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public u f11035l;
    public IInterface m;

    public v(Context context, m mVar, Intent intent) {
        this.f11024a = context;
        this.f11025b = mVar;
        this.f11026c = "IntegrityService";
        this.f11031h = intent;
        this.f11032i = new WeakReference((Object) null);
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f11023n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f11026c)) {
                HandlerThread handlerThread = new HandlerThread(this.f11026c, 10);
                handlerThread.start();
                hashMap.put(this.f11026c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f11026c);
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f11029f) {
            Iterator it = this.f11028e.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f11026c).concat(" : Binder has died.")));
            }
            this.f11028e.clear();
        }
    }
}
