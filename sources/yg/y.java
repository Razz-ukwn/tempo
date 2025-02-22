package yg;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f17557c = ("Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new y());

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17558a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f17559b;

    public static final class a extends y {

        /* renamed from: yg.y$a$a  reason: collision with other inner class name */
        public static final class C0326a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f17560a = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f17560a.post(runnable);
            }
        }

        public final Executor a() {
            return new C0326a();
        }

        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            return y.super.b(method, cls, obj, objArr);
        }
    }

    public y() {
        Constructor<MethodHandles.Lookup> constructor;
        Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
        try {
            constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f17559b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f17559b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
