package androidx.appcompat.widget;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import s1.a;
import s1.c;
import s1.d;
import s1.f;
import sf.j;

public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1024b;

    public /* synthetic */ i1(Object obj, int i8) {
        this.f1023a = i8;
        this.f1024b = obj;
    }

    public final void run() {
        Application application;
        f.a aVar;
        Handler handler;
        int i8 = this.f1023a;
        Object obj = this.f1024b;
        switch (i8) {
            case 0:
                ((Toolbar) obj).l();
                return;
            case 1:
                Activity activity = (Activity) obj;
                int i10 = a.f14472c;
                if (!activity.isFinishing()) {
                    int i11 = Build.VERSION.SDK_INT;
                    boolean z10 = true;
                    if (i11 >= 28) {
                        Class<?> cls = f.f14482a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = f.f14482a;
                        boolean z11 = i11 == 26 || i11 == 27;
                        Method method = f.f14487f;
                        if ((!z11 || method != null) && !(f.f14486e == null && f.f14485d == null)) {
                            try {
                                Object obj2 = f.f14484c.get(activity);
                                if (obj2 != null) {
                                    Object obj3 = f.f14483b.get(activity);
                                    if (obj3 != null) {
                                        application = activity.getApplication();
                                        aVar = new f.a(activity);
                                        application.registerActivityLifecycleCallbacks(aVar);
                                        handler = f.f14488g;
                                        handler.post(new c(aVar, obj2));
                                        if (i11 == 26 || i11 == 27) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj3, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new d(application, aVar));
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        z10 = false;
                    }
                    if (!z10) {
                        activity.recreate();
                        return;
                    }
                    return;
                }
                return;
            default:
                androidx.activity.f.d(obj);
                j.f((Object) null, "this$0");
                throw null;
        }
    }
}
