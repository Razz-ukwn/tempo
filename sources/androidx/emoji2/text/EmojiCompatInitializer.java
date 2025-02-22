package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.e;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.k;

public class EmojiCompatInitializer implements p3.b<Boolean> {

    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f1837b = 1;
        }
    }

    public static class b implements f.h {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1817a;

        public b(Context context) {
            this.f1817a = context.getApplicationContext();
        }

        public final void a(f.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(0, this, iVar, threadPoolExecutor));
        }
    }

    public static class c implements Runnable {
        public final void run() {
            try {
                int i8 = k.f17122a;
                k.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f1823k != null) {
                    f.a().c();
                }
                k.a.b();
            } catch (Throwable th) {
                int i10 = k.f17122a;
                k.a.b();
                throw th;
            }
        }
    }

    public final List<Class<? extends p3.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (f.f1823k == null) {
            synchronized (f.f1822j) {
                if (f.f1823k == null) {
                    f.f1823k = new f(aVar);
                }
            }
        }
        p3.a c3 = p3.a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c3.getClass();
        synchronized (p3.a.f12442e) {
            try {
                obj = c3.f12443a.get(cls);
                if (obj == null) {
                    obj = c3.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final j b10 = ((p) obj).b();
        b10.a(new e() {
            public final void b(p pVar) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c(), 500);
                b10.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
