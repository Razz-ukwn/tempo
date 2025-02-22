package cb;

import ag.a0;
import ag.b0;
import ag.f2;
import ag.g0;
import ag.i2;
import ag.m0;
import ag.p0;
import ag.p2;
import ag.s0;
import ag.v1;
import ag.w;
import ag.w1;
import ag.x1;
import ag.y0;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.j3;
import androidx.fragment.app.q;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.p000firebaseauthapi.a9;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.b9;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.c9;
import com.google.android.gms.internal.p000firebaseauthapi.fe;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.w2;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.quickkonnect.silencio.R;
import ff.h;
import ff.m;
import g4.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.LockSupport;
import jf.d;
import jf.e;
import jf.f;
import jf.g;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.x;
import q7.e2;
import q7.g2;
import rf.l;
import rf.p;
import s0.k0;
import sf.j;
import t.h;
import t4.a;
import uf.c;
import wg.z;

public class b implements s, ka, f, e2, a, SuccessContinuation {
    public static final Object[] B = new Object[0];
    public static final /* synthetic */ b C = new b();
    public static final char[] D = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f3880a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final v8 f3881b = new v8();

    /* renamed from: c  reason: collision with root package name */
    public static final w8 f3882c = new w8();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3883d = {R.attr.color_checked, R.attr.color_tick, R.attr.color_unchecked, R.attr.color_unchecked_stroke, R.attr.duration, R.attr.stroke_width};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3884e = new int[0];

    public static final int A(int i8, int i10, int i11) {
        if (i11 > 0) {
            if (i8 >= i10) {
                return i10;
            }
            int i12 = i10 % i11;
            if (i12 < 0) {
                i12 += i11;
            }
            int i13 = i8 % i11;
            if (i13 < 0) {
                i13 += i11;
            }
            int i14 = (i12 - i13) % i11;
            if (i14 < 0) {
                i14 += i11;
            }
            return i10 - i14;
        } else if (i11 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i8 <= i10) {
            return i10;
        } else {
            int i15 = -i11;
            int i16 = i8 % i15;
            if (i16 < 0) {
                i16 += i15;
            }
            int i17 = i10 % i15;
            if (i17 < 0) {
                i17 += i15;
            }
            int i18 = (i16 - i17) % i15;
            if (i18 < 0) {
                i18 += i15;
            }
            return i10 + i18;
        }
    }

    public static boolean B(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean C(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static f2 D(g0 g0Var, f.b bVar, int i8, p pVar, int i10) {
        jf.f fVar = bVar;
        if ((i10 & 1) != 0) {
            fVar = g.f10014a;
        }
        if ((i10 & 2) != 0) {
            i8 = 1;
        }
        jf.f b10 = a0.b(g0Var, fVar);
        f2 w1Var = i8 == 2 ? new w1(b10, pVar) : new f2(b10, true);
        w1Var.C0(i8, w1Var, pVar);
        return w1Var;
    }

    public static final q.p E(q.p pVar) {
        j.f(pVar, "<this>");
        q.p c3 = pVar.c();
        j.d(c3, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c3;
    }

    public static final int F(c.a aVar, wf.f fVar) {
        if (!fVar.isEmpty()) {
            int i8 = fVar.f16714a;
            int i10 = fVar.f16715b;
            return i10 < Integer.MAX_VALUE ? aVar.c(i8, i10 + 1) : i8 > Integer.MIN_VALUE ? aVar.c(i8 - 1, i10) + 1 : aVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + fVar);
    }

    public static final Object G(x1 x1Var, p pVar) {
        jf.f fVar;
        y0 y0Var;
        Thread currentThread = Thread.currentThread();
        e.a aVar = e.a.f10012a;
        e eVar = (e) x1Var.d(aVar);
        g gVar = g.f10014a;
        if (eVar == null) {
            y0Var = i2.a();
            fVar = a0.a(gVar, f.a.a(x1Var, y0Var), true);
            kotlinx.coroutines.scheduling.c cVar = s0.f480a;
            if (fVar != cVar && fVar.d(aVar) == null) {
                fVar = fVar.n0(cVar);
            }
        } else {
            if (eVar instanceof y0) {
                y0 y0Var2 = (y0) eVar;
            }
            y0Var = i2.f422a.get();
            fVar = a0.a(gVar, x1Var, true);
            kotlinx.coroutines.scheduling.c cVar2 = s0.f480a;
            if (fVar != cVar2 && fVar.d(aVar) == null) {
                fVar = fVar.n0(cVar2);
            }
        }
        ag.f fVar2 = new ag.f(fVar, currentThread, y0Var);
        fVar2.C0(1, fVar2, pVar);
        y0 y0Var3 = fVar2.f416d;
        if (y0Var3 != null) {
            int i8 = y0.B;
            y0Var3.L0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long N0 = y0Var3 != null ? y0Var3.N0() : Long.MAX_VALUE;
                if (!fVar2.v0()) {
                    LockSupport.parkNanos(fVar2, N0);
                } else {
                    Object m = v1.m(fVar2.S());
                    w wVar = m instanceof w ? (w) m : null;
                    if (wVar == null) {
                        return m;
                    }
                    throw wVar.f504a;
                }
            } finally {
                if (y0Var3 != null) {
                    int i10 = y0.B;
                    y0Var3.J0(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar2.x(interruptedException);
        throw interruptedException;
    }

    public static final void H(h hVar, Object obj, p pVar) {
        j.f(pVar, "block");
        if (hVar.f() || !j.a(hVar.d(), obj)) {
            hVar.n(obj);
            hVar.k(obj, pVar);
        }
    }

    public static final void I(Matrix matrix, float[] fArr) {
        float[] fArr2 = fArr;
        j.f(fArr2, "$this$setFrom");
        j.f(matrix, "matrix");
        matrix.getValues(fArr);
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        float f13 = fArr2[3];
        float f14 = fArr2[4];
        float f15 = fArr2[5];
        float f16 = fArr2[6];
        float f17 = fArr2[7];
        float f18 = fArr2[8];
        fArr2[0] = f10;
        fArr2[1] = f13;
        fArr2[2] = 0.0f;
        fArr2[3] = f16;
        fArr2[4] = f11;
        fArr2[5] = f14;
        fArr2[6] = 0.0f;
        fArr2[7] = f17;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f12;
        fArr2[13] = f15;
        fArr2[14] = 0.0f;
        fArr2[15] = f18;
    }

    public static final void J(Object obj) {
        if (obj instanceof h.a) {
            throw ((h.a) obj).f8709a;
        }
    }

    public static final double K(long j10) {
        return (((double) (j10 >>> 11)) * ((double) 2048)) + ((double) (j10 & 2047));
    }

    public static final int L(int i8) {
        int i10 = 306783378 & i8;
        int i11 = 613566756 & i8;
        return (i8 & -920350135) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    /* JADX INFO: finally extract failed */
    public static final Object M(jf.f fVar, p pVar, d dVar) {
        jf.f context = dVar.getContext();
        jf.f n02 = !((Boolean) fVar.p(Boolean.FALSE, b0.f394a)).booleanValue() ? context.n0(fVar) : a0.a(context, fVar, false);
        d.z(n02);
        if (n02 == context) {
            s sVar = new s(dVar, n02);
            return d.h0(sVar, sVar, pVar);
        }
        e.a aVar = e.a.f10012a;
        if (j.a(n02.d(aVar), context.d(aVar))) {
            p2 p2Var = new p2(dVar, n02);
            Object c3 = x.c(n02, (Object) null);
            try {
                Object h02 = d.h0(p2Var, p2Var, pVar);
                x.a(n02, c3);
                return h02;
            } catch (Throwable th) {
                x.a(n02, c3);
                throw th;
            }
        } else {
            p0 p0Var = new p0(dVar, n02);
            try {
                com.google.android.gms.internal.p000firebaseauthapi.g.e(e9.c.g(e9.c.e(p0Var, p0Var, pVar)), m.f8717a, (l) null);
                return p0Var.D0();
            } catch (Throwable th2) {
                p0Var.resumeWith(u(th2));
                throw th2;
            }
        }
    }

    public static int N(int i8) {
        int[] iArr = {1, 2, 3};
        int i10 = 0;
        while (i10 < 3) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            } else if (i12 == i8) {
                return i11;
            } else {
                i10++;
            }
        }
        return 1;
    }

    public static int O(int i8) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i10 = 0;
        while (i10 < 6) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            } else if (i12 == i8) {
                return i11;
            } else {
                i10++;
            }
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void P(java.lang.String r4, com.google.android.gms.internal.p000firebaseauthapi.m r5, com.google.android.gms.internal.p000firebaseauthapi.w r6, java.lang.Class r7, com.google.android.gms.internal.p000firebaseauthapi.q r8) {
        /*
            u6.q.i(r5)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.URL r0 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r0.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.URLConnection r4 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.lang.String r5 = r5.zza()     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            byte[] r5 = r5.getBytes(r1)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            int r1 = r5.length     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r4.setFixedLengthStreamingMode(r1)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r4.setRequestProperty(r2, r3)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r2 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r8.a(r4)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r8.<init>(r2, r1)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r2 = 0
            r8.write(r5, r2, r1)     // Catch:{ all -> 0x004c }
            r8.close()     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            Q(r4, r6, r7)     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            return
        L_0x0046:
            r4 = move-exception
            goto L_0x0066
        L_0x0048:
            r4 = move-exception
            goto L_0x0066
        L_0x004a:
            r4 = move-exception
            goto L_0x0066
        L_0x004c:
            r4 = move-exception
            r8.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0065
        L_0x0051:
            r5 = move-exception
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0065 }
            r1[r2] = r7     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r1)     // Catch:{ Exception -> 0x0065 }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0065 }
            r8[r2] = r5     // Catch:{ Exception -> 0x0065 }
            r7.invoke(r4, r8)     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            throw r4     // Catch:{ SocketTimeoutException -> 0x0074, UnknownHostException -> 0x006e, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
        L_0x0066:
            java.lang.String r4 = r4.getMessage()
            r6.zza(r4)
            return
        L_0x006e:
            java.lang.String r4 = "<<Network Error>>"
            r6.zza(r4)
            return
        L_0x0074:
            java.lang.String r4 = "TIMEOUT"
            r6.zza(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.P(java.lang.String, com.google.android.gms.internal.firebase-auth-api.m, com.google.android.gms.internal.firebase-auth-api.w, java.lang.Class, com.google.android.gms.internal.firebase-auth-api.q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Q(java.net.HttpURLConnection r10, com.google.android.gms.internal.p000firebaseauthapi.w r11, java.lang.Class r12) {
        /*
            int r0 = r10.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 0
            if (r0 < r2) goto L_0x0010
            if (r0 >= r1) goto L_0x0010
            r5 = r3
            goto L_0x0011
        L_0x0010:
            r5 = r4
        L_0x0011:
            if (r5 == 0) goto L_0x0018
            java.io.InputStream r5 = r10.getInputStream()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            goto L_0x001c
        L_0x0018:
            java.io.InputStream r5 = r10.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
        L_0x001c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r5, r9)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            r7.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
        L_0x002d:
            java.lang.String r5 = r7.readLine()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0037
            r6.append(r5)     // Catch:{ all -> 0x0065 }
            goto L_0x002d
        L_0x0037:
            r7.close()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            java.lang.String r5 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            if (r0 < r2) goto L_0x0043
            if (r0 >= r1) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            if (r3 != 0) goto L_0x0058
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Object r12 = com.google.android.gms.internal.p000firebaseauthapi.l.a(r5, r12)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            r11.zza(r12)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            goto L_0x0061
        L_0x0052:
            r11 = move-exception
            goto L_0x0093
        L_0x0054:
            r12 = move-exception
            goto L_0x007f
        L_0x0056:
            r12 = move-exception
            goto L_0x007f
        L_0x0058:
            java.lang.Object r12 = com.google.android.gms.internal.p000firebaseauthapi.l.a(r5, r12)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            com.google.android.gms.internal.firebase-auth-api.n r12 = (com.google.android.gms.internal.p000firebaseauthapi.n) r12     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
            r11.d(r12)     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
        L_0x0061:
            r10.disconnect()
            return
        L_0x0065:
            r12 = move-exception
            r7.close()     // Catch:{ all -> 0x006a }
            goto L_0x007e
        L_0x006a:
            r0 = move-exception
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x007e }
            r5[r4] = r1     // Catch:{ Exception -> 0x007e }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch:{ Exception -> 0x007e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007e }
            r2[r4] = r0     // Catch:{ Exception -> 0x007e }
            r1.invoke(r12, r2)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            throw r12     // Catch:{ SocketTimeoutException -> 0x008a, IOException -> 0x0056, xh -> 0x0054 }
        L_0x007f:
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0052 }
            r11.zza(r12)     // Catch:{ all -> 0x0052 }
            r10.disconnect()
            return
        L_0x008a:
            java.lang.String r12 = "TIMEOUT"
            r11.zza(r12)     // Catch:{ all -> 0x0052 }
            r10.disconnect()
            return
        L_0x0093:
            r10.disconnect()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.Q(java.net.HttpURLConnection, com.google.android.gms.internal.firebase-auth-api.w, java.lang.Class):void");
    }

    public static final f1.d e(Context context) {
        return new f1.d(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static final int f(k0 k0Var, q0.a aVar) {
        int i8;
        k0 J = k0Var.J();
        if (!(J != null)) {
            throw new IllegalStateException(("Child of " + k0Var + " cannot be null when calculating alignment line").toString());
        } else if (k0Var.N().c().containsKey(aVar)) {
            Integer num = k0Var.N().c().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int I = J.I(aVar);
            if (I == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            J.f14379e = true;
            k0Var.B = true;
            k0Var.R();
            J.f14379e = false;
            k0Var.B = false;
            if (aVar instanceof q0.e) {
                i8 = f1.h.a(J.P());
            } else {
                long P = J.P();
                int i10 = f1.h.f8036c;
                i8 = (int) (P >> 32);
            }
            return i8 + I;
        }
    }

    public static final int h(char c3) {
        boolean z10 = true;
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        char c10 = 'a';
        if (!('a' <= c3 && c3 < 'g')) {
            c10 = 'A';
            if ('A' > c3 || c3 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c3);
            }
        }
        return (c3 - c10) + 10;
    }

    public static final Object[] i(Object[] objArr, int i8, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        gf.l.X(objArr, objArr2, 0, 0, i8, 6);
        gf.l.V(i8 + 2, i8, objArr.length, objArr, objArr2);
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] j(int i8, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        gf.l.X(objArr, objArr2, 0, 0, i8, 6);
        gf.l.V(i8, i8 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] k(int i8, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        gf.l.X(objArr, objArr2, 0, 0, i8, 6);
        gf.l.V(i8, i8 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void l(s0.a0 a0Var, u.d dVar, l lVar) {
        u.d<s0.a0> s10 = a0Var.s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                s0.a0 a0Var2 = (s0.a0) tArr[i10];
                if (dVar.f15640c <= i10) {
                    dVar.b(lVar.invoke(a0Var2));
                } else {
                    T invoke = lVar.invoke(a0Var2);
                    T[] tArr2 = dVar.f15638a;
                    T t2 = tArr2[i10];
                    tArr2[i10] = invoke;
                }
                i10++;
            } while (i10 < i8);
        }
        dVar.l(a0Var.p().size(), dVar.f15640c);
    }

    public static m0 m(g0 g0Var, p pVar) {
        m0 m0Var = new m0(a0.b(g0Var, g.f10014a), true);
        m0Var.C0(1, m0Var, pVar);
        return m0Var;
    }

    public static int n(int i8, int i10, int[] iArr) {
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

    public static int o(long[] jArr, int i8, long j10) {
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = (jArr[i12] > j10 ? 1 : (jArr[i12] == j10 ? 0 : -1));
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 <= 0) {
                return i12;
            } else {
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.p(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static final kotlinx.coroutines.flow.p q(n0 n0Var) {
        return new kotlinx.coroutines.flow.p(n0Var, new kb.a((d<? super kb.a>) null));
    }

    public static final void r(int i8) {
        boolean z10 = true;
        if (i8 < 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(q.a("Expected positive parallelism level, but got ", i8).toString());
        }
    }

    public static final void s(int i8) {
        if (!new wf.f(2, 36).e(i8)) {
            StringBuilder b10 = a1.b("radix ", i8, " was not in valid range ");
            b10.append(new wf.f(2, 36));
            throw new IllegalArgumentException(b10.toString());
        }
    }

    public static final q.p t(q.p pVar) {
        j.f(pVar, "<this>");
        q.p E = E(pVar);
        int b10 = E.b();
        for (int i8 = 0; i8 < b10; i8++) {
            E.e(i8, pVar.a(i8));
        }
        return E;
    }

    public static final h.a u(Throwable th) {
        j.f(th, "exception");
        return new h.a(th);
    }

    public static final void v(z3.c cVar, z zVar) {
        try {
            Iterator it = ((ArrayList) cVar.g(zVar)).iterator();
            IOException iOException = null;
            while (it.hasNext()) {
                z zVar2 = (z) it.next();
                try {
                    if (cVar.h(zVar2).f16774b) {
                        v(cVar, zVar2);
                    }
                    cVar.d(zVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final boolean w(char c3, char c10, boolean z10) {
        if (c3 == c10) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View x(View view, int i8) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View findViewById = viewGroup.getChildAt(i10).findViewById(i8);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final Class y(xf.b bVar) {
        j.f(bVar, "<this>");
        Class<?> a10 = ((sf.c) bVar).a();
        j.d(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a10;
    }

    public static final Class z(xf.b bVar) {
        j.f(bVar, "<this>");
        Class<?> a10 = ((sf.c) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a10 : Double.class;
            case 104431:
                return !name.equals("int") ? a10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a10 : Character.class;
            case 3327612:
                return !name.equals("long") ? a10 : Long.class;
            case 3625364:
                return !name.equals("void") ? a10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a10 : Float.class;
            case 109413500:
                return !name.equals("short") ? a10 : Short.class;
            default:
                return a10;
        }
    }

    public c a(nb nbVar) {
        lb lbVar = (lb) nbVar;
        ab abVar = c9.f4455a;
        if (lbVar.f4712a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                fe w10 = fe.w(lbVar.f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    j3 j3Var = new j3();
                    int c3 = w10.x().c();
                    if (!(c3 == 32 || c3 == 48)) {
                        if (c3 != 64) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(c3)}));
                        }
                    }
                    j3Var.f1338a = Integer.valueOf(c3);
                    mg mgVar = lbVar.f4716e;
                    Map map = c9.f4460f;
                    if (map.containsKey(mgVar)) {
                        j3Var.f1339b = (a9) map.get(mgVar);
                        b9 g10 = j3Var.g();
                        com.google.android.gms.internal.p000firebaseauthapi.w8 w8Var = new com.google.android.gms.internal.p000firebaseauthapi.w8();
                        w8Var.f5046a = g10;
                        w8Var.f5047b = r3.s.i(w10.x().m());
                        w8Var.f5048c = lbVar.B;
                        return w8Var.a();
                    }
                    int zza = mgVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
    }

    public boolean b() {
        return true;
    }

    public void c(p4.f fVar, r4.g gVar) {
    }

    public File d(p4.f fVar) {
        return null;
    }

    public Object g() {
        return new TreeSet();
    }

    public void shutdown() {
    }

    public Task then(Object obj) {
        Void voidR = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().q());
    }
}
