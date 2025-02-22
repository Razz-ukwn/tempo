package ag;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.View;
import cb.b;
import cb.s;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import com.google.android.gms.internal.p000firebaseauthapi.eb;
import com.google.android.gms.internal.p000firebaseauthapi.hc;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import e5.g;
import e9.c;
import i3.p;
import i3.w;
import java.lang.reflect.Field;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.crypto.Mac;
import jf.d;
import kotlinx.coroutines.internal.v;
import q7.e2;
import q7.g2;
import r3.u;
import sf.j;
import t9.e;
import v8.l;
import x9.a;

public class v1 implements s, eb, g, dh, a, e2, e {
    public static final x0 B = new x0(false);
    public static final x0 C = new x0(true);
    public static final byte[] D = new byte[0];
    public static final /* synthetic */ v1 E = new v1();
    public static final /* synthetic */ v1 F = new v1();
    public static Field G;
    public static boolean H;
    public static final /* synthetic */ v1 I = new v1();
    public static final int[] J = new int[0];
    public static final Object[] K = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public static final v f498a = new v("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final v f499b = new v("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    public static final v f500c = new v("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    public static final v f501d = new v("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    public static final v f502e = new v("SEALED");

    public static final int f(int i8, int i10, int[] iArr) {
        j.f(iArr, "<this>");
        int i11 = i8 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 <= i10) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d9, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap h(android.graphics.drawable.Drawable r7, android.graphics.Bitmap.Config r8, i4.e r9, int r10, boolean r11) {
        /*
            boolean r0 = r7 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0065
            r0 = r7
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r3 = r0.getConfig()
            if (r8 == 0) goto L_0x001f
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r4) goto L_0x0019
            r4 = r1
            goto L_0x001a
        L_0x0019:
            r4 = r2
        L_0x001a:
            if (r4 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r4 = r8
            goto L_0x0021
        L_0x001f:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0021:
            if (r3 != r4) goto L_0x0025
            r3 = r1
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            if (r3 == 0) goto L_0x0065
            if (r11 == 0) goto L_0x002b
            goto L_0x005f
        L_0x002b:
            int r11 = r0.getWidth()
            int r3 = r0.getHeight()
            boolean r4 = e9.c.h(r9)
            if (r4 == 0) goto L_0x003e
            int r4 = r0.getWidth()
            goto L_0x0044
        L_0x003e:
            i4.a r4 = r9.f9573a
            int r4 = m4.c.d(r4, r10)
        L_0x0044:
            boolean r5 = e9.c.h(r9)
            if (r5 == 0) goto L_0x004f
            int r5 = r0.getHeight()
            goto L_0x0055
        L_0x004f:
            i4.a r5 = r9.f9574b
            int r5 = m4.c.d(r5, r10)
        L_0x0055:
            double r3 = cb.f.c(r11, r3, r4, r5, r10)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0061
        L_0x005f:
            r11 = r1
            goto L_0x0062
        L_0x0061:
            r11 = r2
        L_0x0062:
            if (r11 == 0) goto L_0x0065
            return r0
        L_0x0065:
            android.graphics.drawable.Drawable r7 = r7.mutate()
            android.graphics.Bitmap$Config[] r11 = m4.c.f11189a
            boolean r11 = r7 instanceof android.graphics.drawable.BitmapDrawable
            r0 = 0
            if (r11 == 0) goto L_0x0074
            r3 = r7
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            goto L_0x0075
        L_0x0074:
            r3 = r0
        L_0x0075:
            if (r3 == 0) goto L_0x0082
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 == 0) goto L_0x0082
            int r3 = r3.getWidth()
            goto L_0x0086
        L_0x0082:
            int r3 = r7.getIntrinsicWidth()
        L_0x0086:
            r4 = 512(0x200, float:7.175E-43)
            if (r3 <= 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r3 = r4
        L_0x008c:
            if (r11 == 0) goto L_0x0091
            r0 = r7
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
        L_0x0091:
            if (r0 == 0) goto L_0x009e
            android.graphics.Bitmap r11 = r0.getBitmap()
            if (r11 == 0) goto L_0x009e
            int r11 = r11.getHeight()
            goto L_0x00a2
        L_0x009e:
            int r11 = r7.getIntrinsicHeight()
        L_0x00a2:
            if (r11 <= 0) goto L_0x00a5
            r4 = r11
        L_0x00a5:
            boolean r11 = e9.c.h(r9)
            if (r11 == 0) goto L_0x00ad
            r11 = r3
            goto L_0x00b3
        L_0x00ad:
            i4.a r11 = r9.f9573a
            int r11 = m4.c.d(r11, r10)
        L_0x00b3:
            boolean r0 = e9.c.h(r9)
            if (r0 == 0) goto L_0x00bb
            r9 = r4
            goto L_0x00c1
        L_0x00bb:
            i4.a r9 = r9.f9574b
            int r9 = m4.c.d(r9, r10)
        L_0x00c1:
            double r9 = cb.f.c(r3, r4, r11, r9, r10)
            double r5 = (double) r3
            double r5 = r5 * r9
            int r11 = q4.a.f(r5)
            double r3 = (double) r4
            double r9 = r9 * r3
            int r9 = q4.a.f(r9)
            if (r8 == 0) goto L_0x00db
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r10) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r1 = r2
        L_0x00d9:
            if (r1 == 0) goto L_0x00dd
        L_0x00db:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00dd:
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r11, r9, r8)
            java.lang.String r10 = "createBitmap(width, height, config)"
            sf.j.e(r8, r10)
            android.graphics.Rect r10 = r7.getBounds()
            int r0 = r10.left
            int r1 = r10.top
            int r3 = r10.right
            int r10 = r10.bottom
            r7.setBounds(r2, r2, r11, r9)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            r7.draw(r9)
            r7.setBounds(r0, r1, r3, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.v1.h(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, i4.e, int, boolean):android.graphics.Bitmap");
    }

    public static final Object i(p pVar, CancellationSignal cancellationSignal, Callable callable, d dVar) {
        if (pVar.m() && pVar.i()) {
            return callable.call();
        }
        w wVar = (w) dVar.getContext().d(w.f9561a);
        c0 L = cb.d.L(pVar);
        l lVar = new l(1, c.g(dVar));
        lVar.t();
        lVar.v(new i3.d(cancellationSignal, b.D(f1.f418a, L, 0, new i3.e(callable, lVar, (d<? super i3.e>) null), 2)));
        return lVar.s();
    }

    public static final Object j(p pVar, Callable callable, d dVar) {
        if (pVar.m() && pVar.i()) {
            return callable.call();
        }
        w wVar = (w) dVar.getContext().d(w.f9561a);
        return b.M(cb.d.M(pVar), new i3.c(callable, (d<? super i3.c>) null), dVar);
    }

    public static final Object m(Object obj) {
        h1 h1Var;
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        return (i1Var == null || (h1Var = i1Var.f421a) == null) ? obj : h1Var;
    }

    public Object a(cb.c cVar) {
        return new u((hc) cVar);
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    public void c(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable) null);
        }
    }

    public void d() {
    }

    public Object e(t9.v vVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(vVar);
    }

    public Object g() {
        return new ArrayList();
    }

    public void k(float f10, float f11, l lVar) {
        throw null;
    }

    public void l(View view, int i8) {
        if (!H) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                G = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            H = true;
        }
        Field field = G;
        if (field != null) {
            try {
                G.setInt(view, i8 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzm());
    }
}
