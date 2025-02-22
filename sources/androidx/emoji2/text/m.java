package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.l;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z1.d;
import z1.e;
import z1.k;

public final class m extends f.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1865d = new a();

    public static class a {
    }

    public static class b implements f.h {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1866a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1867b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1868c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1869d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1870e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1871f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1872g;

        /* renamed from: h  reason: collision with root package name */
        public f.i f1873h;

        public b(Context context, e eVar) {
            a aVar = m.f1865d;
            if (context != null) {
                this.f1866a = context.getApplicationContext();
                this.f1867b = eVar;
                this.f1868c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        public final void a(f.i iVar) {
            synchronized (this.f1869d) {
                this.f1873h = iVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1869d) {
                this.f1873h = null;
                Handler handler = this.f1870e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f1870e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1872g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1871f = null;
                this.f1872g = null;
            }
        }

        public final void c() {
            synchronized (this.f1869d) {
                if (this.f1873h != null) {
                    if (this.f1871f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1872g = threadPoolExecutor;
                        this.f1871f = threadPoolExecutor;
                    }
                    this.f1871f.execute(new l(this, 4));
                }
            }
        }

        public final z1.l d() {
            try {
                a aVar = this.f1868c;
                Context context = this.f1866a;
                e eVar = this.f1867b;
                aVar.getClass();
                k a10 = d.a(context, eVar);
                int i8 = a10.f17650a;
                if (i8 == 0) {
                    z1.l[] lVarArr = a10.f17651b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(d.a.a("fetchFonts failed (", i8, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public m(Context context, e eVar) {
        super(new b(context, eVar));
    }
}
