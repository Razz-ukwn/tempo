package p2;

import android.view.Choreographer;
import java.util.ArrayList;
import o.f;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<a> f12398f = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final f<b, Long> f12399a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f12400b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final C0239a f12401c = new C0239a();

    /* renamed from: d  reason: collision with root package name */
    public d f12402d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12403e = false;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    public class C0239a {
        public C0239a() {
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0239a f12405a;

        public c(C0239a aVar) {
            this.f12405a = aVar;
        }
    }

    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f12406b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        public final C0240a f12407c = new C0240a();

        /* renamed from: p2.a$d$a  reason: collision with other inner class name */
        public class C0240a implements Choreographer.FrameCallback {
            public C0240a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    p2.a$d r10 = p2.a.d.this
                    p2.a$a r10 = r10.f12405a
                    r10.getClass()
                    long r0 = android.os.SystemClock.uptimeMillis()
                    p2.a r10 = p2.a.this
                    r10.getClass()
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r11 = 0
                    r4 = r11
                L_0x0016:
                    java.util.ArrayList<p2.a$b> r5 = r10.f12400b
                    int r6 = r5.size()
                    if (r4 >= r6) goto L_0x0049
                    java.lang.Object r5 = r5.get(r4)
                    p2.a$b r5 = (p2.a.b) r5
                    if (r5 != 0) goto L_0x0027
                    goto L_0x0046
                L_0x0027:
                    o.f<p2.a$b, java.lang.Long> r6 = r10.f12399a
                    r7 = 0
                    java.lang.Object r7 = r6.getOrDefault(r5, r7)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0033
                    goto L_0x003e
                L_0x0033:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L_0x0040
                    r6.remove(r5)
                L_0x003e:
                    r6 = 1
                    goto L_0x0041
                L_0x0040:
                    r6 = r11
                L_0x0041:
                    if (r6 == 0) goto L_0x0046
                    r5.a(r0)
                L_0x0046:
                    int r4 = r4 + 1
                    goto L_0x0016
                L_0x0049:
                    boolean r0 = r10.f12403e
                    if (r0 == 0) goto L_0x0061
                    int r0 = r5.size()
                L_0x0051:
                    int r0 = r0 + -1
                    if (r0 < 0) goto L_0x005f
                    java.lang.Object r1 = r5.get(r0)
                    if (r1 != 0) goto L_0x0051
                    r5.remove(r0)
                    goto L_0x0051
                L_0x005f:
                    r10.f12403e = r11
                L_0x0061:
                    int r11 = r5.size()
                    if (r11 <= 0) goto L_0x007d
                    p2.a$d r11 = r10.f12402d
                    if (r11 != 0) goto L_0x0074
                    p2.a$d r11 = new p2.a$d
                    p2.a$a r0 = r10.f12401c
                    r11.<init>(r0)
                    r10.f12402d = r11
                L_0x0074:
                    p2.a$d r10 = r10.f12402d
                    p2.a$d$a r11 = r10.f12407c
                    android.view.Choreographer r10 = r10.f12406b
                    r10.postFrameCallback(r11)
                L_0x007d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p2.a.d.C0240a.doFrame(long):void");
            }
        }

        public d(C0239a aVar) {
            super(aVar);
        }
    }
}
