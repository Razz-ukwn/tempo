package p3;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.quickkonnect.silencio.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.b0;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f12441d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f12442e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12443a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f12444b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f12445c;

    public a(Context context) {
        this.f12445c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f12441d == null) {
            synchronized (f12442e) {
                if (f12441d == null) {
                    f12441d = new a(context);
                }
            }
        }
        return f12441d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f12445c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f12444b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new b0((Throwable) e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (q3.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f12443a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!hashMap.containsKey(next)) {
                            b(next, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f12445c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
