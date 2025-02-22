package b1;

import ag.m0;
import ag.v1;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.p000firebaseauthapi.v0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import h4.d;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.v;
import n.c;
import q7.e2;
import q7.g2;
import q7.s3;
import r9.g0;
import r9.n;
import r9.o;
import r9.t;
import r9.u;
import t1.a;
import u6.q;
import v8.f;
import v8.h;

public final class b implements d, e2 {
    public static final v B = new v("CLOSED");
    public static final /* synthetic */ b C = new b();

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2992a = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive, R.attr.popUpToSaveState, R.attr.restoreState};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2993b = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2994c = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2995d = {R.attr.startDestination};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2996e = {16842753, 16842960, R.attr.route};

    public /* synthetic */ b() {
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static int b(int i8, int i10) {
        return v1.d.c(i8, (Color.alpha(i8) * i10) / 255);
    }

    public static v1 c(int i8) {
        return i8 != 0 ? i8 != 1 ? new h() : new v8.d() : new h();
    }

    public static Application d(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static int e(Context context, int i8, int i10) {
        TypedValue a10 = r8.b.a(context, i8);
        if (a10 == null) {
            return i10;
        }
        int i11 = a10.resourceId;
        if (i11 == 0) {
            return a10.data;
        }
        Object obj = a.f15323a;
        return a.d.a(context, i11);
    }

    public static int f(View view, int i8) {
        Context context = view.getContext();
        TypedValue c3 = r8.b.c(i8, view.getContext(), view.getClass().getCanonicalName());
        int i10 = c3.resourceId;
        if (i10 == 0) {
            return c3.data;
        }
        Object obj = a.f15323a;
        return a.d.a(context, i10);
    }

    public static boolean g(int i8) {
        boolean z10;
        if (i8 != 0) {
            ThreadLocal<double[]> threadLocal = v1.d.f16119a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i8);
            int green = Color.green(i8);
            int blue = Color.blue(i8);
            if (dArr.length == 3) {
                double d10 = ((double) red) / 255.0d;
                double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                double d11 = ((double) green) / 255.0d;
                double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                double d12 = ((double) blue) / 255.0d;
                double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static int h(float f10, int i8, int i10) {
        return v1.d.b(v1.d.c(i10, Math.round(((float) Color.alpha(i10)) * f10)), i8);
    }

    public static void i(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof f) {
            ((f) background).l(f10);
        }
    }

    public static void k(View view) {
        Drawable background = view.getBackground();
        if (background instanceof f) {
            l(view, (f) background);
        }
    }

    public static void l(View view, f fVar) {
        j8.a aVar = fVar.f16250a.f16257b;
        if (aVar != null && aVar.f9863a) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                f10 += i0.i.i((View) parent);
            }
            f.b bVar = fVar.f16250a;
            if (bVar.m != f10) {
                bVar.m = f10;
                fVar.r();
            }
        }
    }

    public static v0 n(r9.b bVar, String str) {
        q.i(bVar);
        if (o.class.isAssignableFrom(bVar.getClass())) {
            o oVar = (o) bVar;
            return new v0(oVar.f14141a, oVar.f14142b, "google.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (r9.d.class.isAssignableFrom(bVar.getClass())) {
            return new v0((String) null, ((r9.d) bVar).f14118a, "facebook.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (u.class.isAssignableFrom(bVar.getClass())) {
            u uVar = (u) bVar;
            return new v0((String) null, uVar.f14153a, "twitter.com", uVar.f14154b, (String) null, str, (String) null, (String) null);
        }
        if (n.class.isAssignableFrom(bVar.getClass())) {
            return new v0((String) null, ((n) bVar).f14140a, "github.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (t.class.isAssignableFrom(bVar.getClass())) {
            return new v0((String) null, (String) null, "playgames.google.com", (String) null, ((t) bVar).f14152a, str, (String) null, (String) null);
        }
        if (g0.class.isAssignableFrom(bVar.getClass())) {
            g0 g0Var = (g0) bVar;
            v0 v0Var = g0Var.f14127d;
            if (v0Var != null) {
                return v0Var;
            }
            return new v0(g0Var.f14125b, g0Var.f14126c, g0Var.f14124a, g0Var.B, (String) null, str, g0Var.f14128e, g0Var.C);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }

    public static String o(k6 k6Var) {
        StringBuilder sb2 = new StringBuilder(k6Var.c());
        for (int i8 = 0; i8 < k6Var.c(); i8++) {
            byte a10 = k6Var.a(i8);
            if (a10 == 34) {
                sb2.append("\\\"");
            } else if (a10 == 39) {
                sb2.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a10 >= 32 && a10 <= 126) {
                            sb2.append((char) a10);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            sb2.append((char) ((a10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String p(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < min; i8++) {
            String str2 = strArr[i8];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i8];
            }
        }
        return null;
    }

    public static String q(Context context, String str) {
        q.i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = s3.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public void j(n.a aVar, float f10) {
        CardView.a aVar2 = (CardView.a) aVar;
        n.b bVar = (n.b) aVar2.f1175a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (!(f10 == bVar.f11507e && bVar.f11508f == useCompatPadding && bVar.f11509g == preventCornerOverlap)) {
            bVar.f11507e = f10;
            bVar.f11508f = useCompatPadding;
            bVar.f11509g = preventCornerOverlap;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
        m(aVar2);
    }

    public void m(n.a aVar) {
        float f10;
        CardView.a aVar2 = (CardView.a) aVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f1175a;
        float f11 = ((n.b) drawable).f11507e;
        float f12 = ((n.b) drawable).f11503a;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - c.f11514a) * ((double) f12)) + ((double) f11));
        } else {
            int i8 = c.f11515b;
            f10 = f11;
        }
        int ceil = (int) Math.ceil((double) f10);
        int ceil2 = (int) Math.ceil((double) c.a(f11, f12, cardView.getPreventCornerOverlap()));
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzn());
    }

    public /* synthetic */ b(m0 m0Var) {
    }
}
