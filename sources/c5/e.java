package c5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.h;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import h5.g;
import j5.d;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final o4.a f3733a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3734b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3735c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final m f3736d;

    /* renamed from: e  reason: collision with root package name */
    public final s4.c f3737e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3738f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3739g;

    /* renamed from: h  reason: collision with root package name */
    public l<Bitmap> f3740h;

    /* renamed from: i  reason: collision with root package name */
    public a f3741i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3742j;

    /* renamed from: k  reason: collision with root package name */
    public a f3743k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f3744l;
    public p4.l<Bitmap> m;

    /* renamed from: n  reason: collision with root package name */
    public a f3745n;

    /* renamed from: o  reason: collision with root package name */
    public int f3746o;

    /* renamed from: p  reason: collision with root package name */
    public int f3747p;

    /* renamed from: q  reason: collision with root package name */
    public int f3748q;

    public static class a extends i5.c<Bitmap> {
        public final long B;
        public Bitmap C;

        /* renamed from: d  reason: collision with root package name */
        public final Handler f3749d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3750e;

        public a(Handler handler, int i8, long j10) {
            this.f3749d = handler;
            this.f3750e = i8;
            this.B = j10;
        }

        public final void c(Object obj, d dVar) {
            this.C = (Bitmap) obj;
            Handler handler = this.f3749d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.B);
        }

        public final void k(Drawable drawable) {
            this.C = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i8 = message.what;
            e eVar = e.this;
            if (i8 == 1) {
                eVar.b((a) message.obj);
                return true;
            } else if (i8 != 2) {
                return false;
            } else {
                eVar.f3736d.l((a) message.obj);
                return false;
            }
        }
    }

    public e(com.bumptech.glide.b bVar, o4.e eVar, int i8, int i10, x4.b bVar2, Bitmap bitmap) {
        s4.c cVar = bVar.f4054a;
        h hVar = bVar.f4056c;
        Context baseContext = hVar.getBaseContext();
        m b10 = com.bumptech.glide.b.c(baseContext).b(baseContext);
        Context baseContext2 = hVar.getBaseContext();
        m b11 = com.bumptech.glide.b.c(baseContext2).b(baseContext2);
        b11.getClass();
        l<Bitmap> y10 = new l(b11.f4127a, b11, Bitmap.class, b11.f4128b).y(m.G).y(((g) ((g) ((g) new g().g(r4.m.f13930a)).w()).r()).k(i8, i10));
        this.f3736d = b10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f3737e = cVar;
        this.f3734b = handler;
        this.f3740h = y10;
        this.f3733a = eVar;
        c(bVar2, bitmap);
    }

    public final void a() {
        if (this.f3738f && !this.f3739g) {
            a aVar = this.f3745n;
            if (aVar != null) {
                this.f3745n = null;
                b(aVar);
                return;
            }
            this.f3739g = true;
            o4.a aVar2 = this.f3733a;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) aVar2.d());
            aVar2.b();
            this.f3743k = new a(this.f3734b, aVar2.e(), uptimeMillis);
            l<Bitmap> E = this.f3740h.y((g) new g().p(new k5.b(Double.valueOf(Math.random())))).E(aVar2);
            E.D(this.f3743k, E);
        }
    }

    public final void b(a aVar) {
        this.f3739g = false;
        boolean z10 = this.f3742j;
        Handler handler = this.f3734b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f3738f) {
            this.f3745n = aVar;
        } else {
            if (aVar.C != null) {
                Bitmap bitmap = this.f3744l;
                if (bitmap != null) {
                    this.f3737e.d(bitmap);
                    this.f3744l = null;
                }
                a aVar2 = this.f3741i;
                this.f3741i = aVar;
                ArrayList arrayList = this.f3735c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [p4.l, p4.l<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(p4.l<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            ag.b1.b(r4)
            r3.m = r4
            ag.b1.b(r5)
            r3.f3744l = r5
            com.bumptech.glide.l<android.graphics.Bitmap> r0 = r3.f3740h
            h5.g r1 = new h5.g
            r1.<init>()
            r2 = 1
            h5.a r4 = r1.u(r4, r2)
            com.bumptech.glide.l r4 = r0.y(r4)
            r3.f3740h = r4
            int r4 = l5.l.c(r5)
            r3.f3746o = r4
            int r4 = r5.getWidth()
            r3.f3747p = r4
            int r4 = r5.getHeight()
            r3.f3748q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.e.c(p4.l, android.graphics.Bitmap):void");
    }
}
