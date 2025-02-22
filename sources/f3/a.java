package f3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.l;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import com.google.android.gms.internal.p000firebaseauthapi.a1;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e9.d;
import e9.f;
import f9.c;
import h4.e;
import h4.h;
import h4.k;
import java.util.concurrent.ScheduledFuture;
import m4.b;
import m4.g;
import m4.j;

public final class a implements OnCompleteListener, w, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8047a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8048b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8049c;

    public /* synthetic */ a(u uVar, a1 a1Var, j3 j3Var) {
        this.f8049c = uVar;
        this.f8047a = a1Var;
        this.f8048b = j3Var;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3) {
        this.f8047a = obj;
        this.f8048b = obj2;
        this.f8049c = obj3;
    }

    public static e a(h hVar, Throwable th) {
        Drawable drawable;
        if (th instanceof k) {
            drawable = b.b(hVar, hVar.K, hVar.J, hVar.M.f9122l);
            if (drawable == null) {
                drawable = b.b(hVar, hVar.I, hVar.H, hVar.M.f9121k);
            }
        } else {
            drawable = b.b(hVar, hVar.I, hVar.H, hVar.M.f9121k);
        }
        return new e(drawable, hVar, th);
    }

    public static boolean b(h hVar, Bitmap.Config config) {
        if (!(config == Bitmap.Config.HARDWARE)) {
            return true;
        }
        if (!hVar.f9159q) {
            return false;
        }
        j4.a aVar = hVar.f9146c;
        if (aVar instanceof j4.b) {
            View a10 = ((j4.b) aVar).a();
            if (a10.isAttachedToWindow() && !a10.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h4.l c(h4.h r20, i4.e r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r5 = r21
            java.util.List<k4.b> r2 = r1.f9155l
            boolean r2 = r2.isEmpty()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x001d
            android.graphics.Bitmap$Config[] r2 = m4.c.f11189a
            android.graphics.Bitmap$Config r6 = r1.f9150g
            boolean r2 = gf.l.S(r2, r6)
            if (r2 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = r3
            goto L_0x001e
        L_0x001d:
            r2 = r4
        L_0x001e:
            if (r2 == 0) goto L_0x0039
            android.graphics.Bitmap$Config r2 = r1.f9150g
            boolean r2 = b(r1, r2)
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r0.f8049c
            androidx.fragment.app.z r2 = (androidx.fragment.app.z) r2
            boolean r2 = r2.e(r5)
            if (r2 == 0) goto L_0x0034
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r2 = r3
        L_0x0035:
            if (r2 == 0) goto L_0x0039
            r2 = r4
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            android.graphics.Bitmap$Config r2 = r1.f9150g
            goto L_0x0041
        L_0x003f:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0041:
            r6 = r2
            java.lang.Object r2 = r0.f8048b
            m4.j r2 = (m4.j) r2
            boolean r2 = r2.f11211d
            if (r2 == 0) goto L_0x004d
            int r2 = r1.f9164v
            goto L_0x004e
        L_0x004d:
            r2 = 4
        L_0x004e:
            r16 = r2
            boolean r2 = r1.f9160r
            if (r2 == 0) goto L_0x0062
            java.util.List<k4.b> r2 = r1.f9155l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0062
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            if (r6 == r2) goto L_0x0062
            r8 = r4
            goto L_0x0063
        L_0x0062:
            r8 = r3
        L_0x0063:
            i4.a r2 = r5.f9573a
            i4.a$b r3 = i4.a.b.f9567a
            boolean r2 = sf.j.a(r2, r3)
            if (r2 != 0) goto L_0x0079
            i4.a r2 = r5.f9574b
            boolean r2 = sf.j.a(r2, r3)
            if (r2 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            int r2 = r1.C
            goto L_0x007a
        L_0x0079:
            r2 = 2
        L_0x007a:
            r7 = r2
            h4.l r17 = new h4.l
            android.content.Context r2 = r1.f9144a
            android.graphics.ColorSpace r4 = r1.f9151h
            boolean r9 = m4.b.a(r20)
            boolean r10 = r1.f9161s
            java.lang.String r11 = r1.f9149f
            jg.q r12 = r1.f9156n
            h4.o r13 = r1.f9157o
            h4.m r14 = r1.D
            int r15 = r1.f9162t
            int r3 = r1.f9163u
            r1 = r17
            r18 = r3
            r3 = r6
            r5 = r21
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.a.c(h4.h, i4.e):h4.l");
    }

    public final void d(n nVar) {
        a1 a1Var = (a1) this.f8047a;
        a1Var.f4368e = ((m0) nVar).f4724b;
        ((x) ((u) this.f8049c).f2324b).i(a1Var, new l((Object) this, (Object) this, 8));
    }

    public final void onComplete(Task task) {
        s6.c cVar = (s6.c) this.f8047a;
        String str = (String) this.f8048b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f8049c;
        synchronized (cVar.f14752a) {
            cVar.f14752a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Object zza() {
        Object zza = ((c) this.f8047a).zza();
        d dVar = (d) ((c) this.f8048b).zza();
        Context context = (Context) ((f) ((c) this.f8049c)).f7882a.f2324b;
        if (context != null) {
            return new e9.e((e9.h) zza, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public a(x3.f fVar, j jVar) {
        Object obj;
        this.f8047a = fVar;
        this.f8048b = jVar;
        int i8 = Build.VERSION.SDK_INT;
        if (m4.a.f11187a) {
            obj = new g(false);
        } else if (i8 == 26 || i8 == 27) {
            obj = new m4.h();
        } else {
            obj = new g(true);
        }
        this.f8049c = obj;
    }

    public final void zza(String str) {
        ((j3) this.f8048b).i(s9.j.a(str));
    }
}
