package j9;

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

public final class p {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f9881n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9882a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9883b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9884c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9885d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f9886e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f9887f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f9888g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f9889h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f9890i;

    /* renamed from: j  reason: collision with root package name */
    public final i f9891j = new i(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f9892k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public o f9893l;
    public IInterface m;

    public p(Context context, g gVar, Intent intent) {
        this.f9882a = context;
        this.f9883b = gVar;
        this.f9884c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f9889h = intent;
        this.f9890i = new WeakReference((Object) null);
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f9881n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f9884c)) {
                HandlerThread handlerThread = new HandlerThread(this.f9884c, 10);
                handlerThread.start();
                hashMap.put(this.f9884c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f9884c);
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f9887f) {
            Iterator it = this.f9886e.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f9884c).concat(" : Binder has died.")));
            }
            this.f9886e.clear();
        }
    }
}
