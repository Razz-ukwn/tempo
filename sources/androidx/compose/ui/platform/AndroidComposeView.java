package androidx.compose.ui.platform;

import a1.a;
import a1.n;
import a1.o;
import a1.r;
import a1.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.key.OnKeyEventElement;
import androidx.compose.ui.input.rotary.OnRotaryScrollEventElement;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.n0;
import androidx.lifecycle.p;
import b0.u;
import b0.w;
import d2.f1;
import d2.i0;
import d2.v0;
import e.s;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o0.v;
import q0.y;
import s0.a0;
import s0.a1;
import s0.b1;
import s0.c;
import s0.d1;
import s0.e0;
import s0.k1;
import s0.m0;
import s0.o1;
import s0.z0;
import t.b3;
import t.h2;
import t.n1;
import v0.q;
import v0.x;
import z0.e;
import z0.f;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements b1, o1, v, androidx.lifecycle.e {
    public static Class<?> L0;
    public static Method M0;
    public MotionEvent A0;
    public final l3 B;
    public long B0;
    public final s C;
    public final j3 C0;
    public final a0 D;
    public final u.d<rf.a<ff.m>> D0;
    public final AndroidComposeView E;
    public final j E0;
    public final q F;
    public final androidx.activity.b F0;
    public final s G;
    public boolean G0;
    public final e0.g H;
    public final i H0;
    public final ArrayList I;
    public final b1 I0;
    public ArrayList J;
    public boolean J0;
    public boolean K;
    public final h K0;
    public final o0.f L;
    public final o0.s M;
    public rf.l<? super Configuration, ff.m> N;
    public final e0.a O;
    public boolean P;
    public final l Q;
    public final k R;
    public final k1 S;
    public boolean T;
    public a1 U;
    public o1 V;
    public f1.a W;

    /* renamed from: a  reason: collision with root package name */
    public long f1181a = h0.c.f9070d;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1182a0;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1183b = true;

    /* renamed from: b0  reason: collision with root package name */
    public final m0 f1184b0;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f1185c = new e0();

    /* renamed from: c0  reason: collision with root package name */
    public final z0 f1186c0;

    /* renamed from: d  reason: collision with root package name */
    public f1.d f1187d;

    /* renamed from: d0  reason: collision with root package name */
    public long f1188d0;

    /* renamed from: e  reason: collision with root package name */
    public final g0.k f1189e;

    /* renamed from: e0  reason: collision with root package name */
    public final int[] f1190e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float[] f1191f0;

    /* renamed from: g0  reason: collision with root package name */
    public final float[] f1192g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f1193h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1194i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f1195j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1196k0;

    /* renamed from: l0  reason: collision with root package name */
    public final n1 f1197l0;

    /* renamed from: m0  reason: collision with root package name */
    public rf.l<? super b, ff.m> f1198m0;

    /* renamed from: n0  reason: collision with root package name */
    public final n f1199n0;

    /* renamed from: o0  reason: collision with root package name */
    public final o f1200o0;

    /* renamed from: p0  reason: collision with root package name */
    public final p f1201p0;

    /* renamed from: q0  reason: collision with root package name */
    public final r f1202q0;

    /* renamed from: r0  reason: collision with root package name */
    public final a1.a0 f1203r0;

    /* renamed from: s0  reason: collision with root package name */
    public final t0 f1204s0;

    /* renamed from: t0  reason: collision with root package name */
    public final n1 f1205t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1206u0;

    /* renamed from: v0  reason: collision with root package name */
    public final n1 f1207v0;

    /* renamed from: w0  reason: collision with root package name */
    public final cb.f f1208w0;

    /* renamed from: x0  reason: collision with root package name */
    public final m0.c f1209x0;

    /* renamed from: y0  reason: collision with root package name */
    public final r0.e f1210y0;

    /* renamed from: z0  reason: collision with root package name */
    public final u0 f1211z0;

    public static final class a {
        public static final boolean a() {
            Object obj;
            Class<?> cls = AndroidComposeView.L0;
            try {
                if (AndroidComposeView.L0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.L0 = cls2;
                    AndroidComposeView.M0 = cls2.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                }
                Method method = AndroidComposeView.M0;
                Boolean bool = null;
                if (method != null) {
                    obj = method.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final p f1212a;

        /* renamed from: b  reason: collision with root package name */
        public final l3.b f1213b;

        public b(p pVar, l3.b bVar) {
            this.f1212a = pVar;
            this.f1213b = bVar;
        }
    }

    public static final class c extends sf.k implements rf.l<m0.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1214a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AndroidComposeView androidComposeView) {
            super(1);
            this.f1214a = androidComposeView;
        }

        public final Object invoke(Object obj) {
            int i8 = ((m0.a) obj).f11116a;
            boolean z10 = false;
            boolean z11 = i8 == 1;
            AndroidComposeView androidComposeView = this.f1214a;
            if (z11) {
                z10 = androidComposeView.isInTouchMode();
            } else {
                if (i8 == 2) {
                    z10 = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class d extends sf.k implements rf.l<Configuration, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1215a = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f((Configuration) obj, "it");
            return ff.m.f8717a;
        }
    }

    public static final class e extends sf.k implements rf.l<rf.a<? extends ff.m>, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1216a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(AndroidComposeView androidComposeView) {
            super(1);
            this.f1216a = androidComposeView;
        }

        public final Object invoke(Object obj) {
            rf.a aVar = (rf.a) obj;
            sf.j.f(aVar, "it");
            this.f1216a.q(aVar);
            return ff.m.f8717a;
        }
    }

    public static final class f extends sf.k implements rf.l<n0.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1217a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(AndroidComposeView androidComposeView) {
            super(1);
            this.f1217a = androidComposeView;
        }

        public final Object invoke(Object obj) {
            g0.b bVar;
            KeyEvent keyEvent = ((n0.b) obj).f11527a;
            sf.j.f(keyEvent, "it");
            AndroidComposeView androidComposeView = this.f1217a;
            androidComposeView.getClass();
            long a10 = gc.b.a(keyEvent.getKeyCode());
            boolean z10 = true;
            if (n0.a.a(a10, n0.a.f11522g)) {
                bVar = new g0.b(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (n0.a.a(a10, n0.a.f11520e)) {
                bVar = new g0.b(4);
            } else if (n0.a.a(a10, n0.a.f11519d)) {
                bVar = new g0.b(3);
            } else if (n0.a.a(a10, n0.a.f11517b)) {
                bVar = new g0.b(5);
            } else if (n0.a.a(a10, n0.a.f11518c)) {
                bVar = new g0.b(6);
            } else {
                if (n0.a.a(a10, n0.a.f11521f) ? true : n0.a.a(a10, n0.a.f11523h) ? true : n0.a.a(a10, n0.a.f11525j)) {
                    bVar = new g0.b(7);
                } else {
                    bVar = n0.a.a(a10, n0.a.f11516a) ? true : n0.a.a(a10, n0.a.f11524i) ? new g0.b(8) : null;
                }
            }
            if (bVar != null) {
                int action = keyEvent.getAction();
                if (!(action != 0 ? action == 1 : true)) {
                    z10 = false;
                }
                if (z10) {
                    return Boolean.valueOf(androidComposeView.getFocusOwner().h(bVar.f8749a));
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class g extends sf.k implements rf.p<a1.p<?>, n, o> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1218a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(AndroidComposeView androidComposeView) {
            super(2);
            this.f1218a = androidComposeView;
        }

        public final Object invoke(Object obj, Object obj2) {
            a1.p pVar = (a1.p) obj;
            n nVar = (n) obj2;
            sf.j.f(pVar, "factory");
            sf.j.f(nVar, "platformTextInput");
            return pVar.a(this.f1218a, nVar);
        }
    }

    public static final class h implements o0.m {
    }

    public static final class i extends sf.k implements rf.a<ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1219a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(AndroidComposeView androidComposeView) {
            super(0);
            this.f1219a = androidComposeView;
        }

        public final Object d() {
            int actionMasked;
            AndroidComposeView androidComposeView = this.f1219a;
            MotionEvent motionEvent = androidComposeView.A0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.B0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.E0);
            }
            return ff.m.f8717a;
        }
    }

    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1220a;

        public j(AndroidComposeView androidComposeView) {
            this.f1220a = androidComposeView;
        }

        public final void run() {
            AndroidComposeView androidComposeView = this.f1220a;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.A0;
            if (motionEvent != null) {
                boolean z10 = false;
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z11 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z10 = true;
                }
                if (z10) {
                    int i8 = 7;
                    if (!(actionMasked == 7 || actionMasked == 9)) {
                        i8 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.f1220a;
                    androidComposeView2.K(motionEvent, i8, androidComposeView2.B0, false);
                }
            }
        }
    }

    public static final class k extends sf.k implements rf.l<p0.c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f1221a = new k();

        public k() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f((p0.c) obj, "it");
            return Boolean.FALSE;
        }
    }

    public static final class l extends sf.k implements rf.l<x, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f1222a = new l();

        public l() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f((x) obj, "$this$$receiver");
            return ff.m.f8717a;
        }
    }

    public static final class m extends sf.k implements rf.l<rf.a<? extends ff.m>, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1223a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(AndroidComposeView androidComposeView) {
            super(1);
            this.f1223a = androidComposeView;
        }

        public final Object invoke(Object obj) {
            rf.a aVar = (rf.a) obj;
            sf.j.f(aVar, "command");
            AndroidComposeView androidComposeView = this.f1223a;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.d();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new androidx.activity.l(aVar, 3));
                }
            }
            return ff.m.f8717a;
        }
    }

    static {
        new a();
    }

    public AndroidComposeView(Context context) {
        super(context);
        this.f1187d = cb.b.e(context);
        v0.m mVar = new v0.m(l.f1222a);
        this.f1189e = new g0.k(new e(this));
        this.B = new l3();
        OnKeyEventElement onKeyEventElement = new OnKeyEventElement(new f(this));
        k kVar = k.f1221a;
        sf.j.f(kVar, "onRotaryScrollEvent");
        OnRotaryScrollEventElement onRotaryScrollEventElement = new OnRotaryScrollEventElement(kVar);
        this.C = new s();
        a0 a0Var = new a0(3, false, 0);
        a0Var.g(y.f12820a);
        a0Var.c(getDensity());
        a0Var.e(mVar.k(onRotaryScrollEventElement).k(getFocusOwner().b()).k(onKeyEventElement));
        this.D = a0Var;
        this.E = this;
        this.F = new q(getRoot());
        s sVar = new s(this);
        this.G = sVar;
        this.H = new e0.g();
        this.I = new ArrayList();
        this.L = new o0.f();
        this.M = new o0.s(getRoot());
        this.N = d.f1215a;
        this.O = new e0.a(this, getAutofillTree());
        this.Q = new l(context);
        this.R = new k(context);
        this.S = new k1(new m(this));
        this.f1184b0 = new m0(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        sf.j.e(viewConfiguration, "get(context)");
        this.f1186c0 = new z0(viewConfiguration);
        this.f1188d0 = e9.c.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f1190e0 = new int[]{0, 0};
        this.f1191f0 = b7.a.s();
        this.f1192g0 = b7.a.s();
        this.f1193h0 = -1;
        this.f1195j0 = h0.c.f9069c;
        this.f1196k0 = true;
        this.f1197l0 = cb.d.R((Object) null, b3.f14997a);
        this.f1199n0 = new n(this);
        this.f1200o0 = new o(this);
        this.f1201p0 = new p(this);
        this.f1202q0 = new r(new g(this));
        r platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        a1.a aVar = a1.a.f15a;
        platformTextInputPluginRegistry.getClass();
        u<a1.p<?>, r.b<?>> uVar = platformTextInputPluginRegistry.f49b;
        r.b bVar = uVar.get(aVar);
        if (bVar == null) {
            o invoke = platformTextInputPluginRegistry.f48a.invoke(aVar, new r.a());
            sf.j.d(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
            r.b bVar2 = new r.b(invoke);
            uVar.put(aVar, bVar2);
            bVar = bVar2;
        }
        bVar.f52b.setValue(Integer.valueOf(bVar.a() + 1));
        new a1.s(bVar);
        T t2 = bVar.f51a;
        sf.j.f(t2, "adapter");
        this.f1203r0 = ((a.C0003a) t2).f16a;
        this.f1204s0 = new t0(context);
        this.f1205t0 = cb.d.R(z0.k.a(context), h2.f15064a);
        Configuration configuration = context.getResources().getConfiguration();
        sf.j.e(configuration, "context.resources.configuration");
        int i8 = Build.VERSION.SDK_INT;
        this.f1206u0 = i8 >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        sf.j.e(configuration2, "context.resources.configuration");
        n0.a aVar2 = n0.f1355a;
        int layoutDirection = configuration2.getLayoutDirection();
        f1.j jVar = f1.j.f8039a;
        if (layoutDirection != 0 && layoutDirection == 1) {
            jVar = f1.j.f8040b;
        }
        this.f1207v0 = cb.d.R(jVar, b3.f14997a);
        this.f1208w0 = new cb.f(this);
        this.f1209x0 = new m0.c(isInTouchMode() ? 1 : 2, new c(this));
        this.f1210y0 = new r0.e(this);
        this.f1211z0 = new u0(this);
        this.C0 = new j3(0);
        this.D0 = new u.d<>(new rf.a[16]);
        this.E0 = new j(this);
        this.F0 = new androidx.activity.b(this, 2);
        this.H0 = new i(this);
        this.I0 = i8 >= 29 ? new e1() : new c1();
        setWillNotDraw(false);
        setFocusable(true);
        m0.f1349a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        i0.n(this, sVar);
        getRoot().i(this);
        if (i8 >= 29) {
            k0.f1340a.a(this);
        }
        this.K0 = new h();
    }

    public static boolean B(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (!(!Float.isInfinite(x10) && !Float.isNaN(x10))) {
            return true;
        }
        float y10 = motionEvent.getY();
        if (!(!Float.isInfinite(y10) && !Float.isNaN(y10))) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!(!Float.isInfinite(rawX) && !Float.isNaN(rawX))) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private void setFontFamilyResolver(f.a aVar) {
        this.f1205t0.setValue(aVar);
    }

    private void setLayoutDirection(f1.j jVar) {
        this.f1207v0.setValue(jVar);
    }

    private final void setViewTreeOwners(b bVar) {
        this.f1197l0.setValue(bVar);
    }

    public static void v(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).m();
            } else if (childAt instanceof ViewGroup) {
                v((ViewGroup) childAt);
            }
        }
    }

    public static ff.g w(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            return new ff.g(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new ff.g(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new ff.g(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View x(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (sf.j.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i8))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            sf.j.e(childAt, "currentView.getChildAt(i)");
            View x10 = x(childAt, i8);
            if (x10 != null) {
                return x10;
            }
        }
        return null;
    }

    public static void z(a0 a0Var) {
        a0Var.v();
        u.d<a0> s10 = a0Var.s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                z((a0) tArr[i10]);
                i10++;
            } while (i10 < i8);
        }
    }

    public final void A(a0 a0Var) {
        int i8 = 0;
        this.f1184b0.n(a0Var, false);
        u.d<a0> s10 = a0Var.s();
        int i10 = s10.f15640c;
        if (i10 > 0) {
            T[] tArr = s10.f15638a;
            do {
                A((a0) tArr[i8]);
                i8++;
            } while (i8 < i10);
        }
    }

    public final boolean C(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.A0) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
    }

    public final void E(boolean z10) {
        i iVar;
        m0 m0Var = this.f1184b0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                iVar = this.H0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            iVar = null;
        }
        if (m0Var.f(iVar)) {
            requestLayout();
        }
        m0Var.a(false);
        ff.m mVar = ff.m.f8717a;
        Trace.endSection();
    }

    public final void F(a1 a1Var, boolean z10) {
        sf.j.f(a1Var, "layer");
        ArrayList arrayList = this.I;
        if (!z10) {
            if (!this.K) {
                arrayList.remove(a1Var);
                ArrayList arrayList2 = this.J;
                if (arrayList2 != null) {
                    arrayList2.remove(a1Var);
                }
            }
        } else if (!this.K) {
            arrayList.add(a1Var);
        } else {
            ArrayList arrayList3 = this.J;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                this.J = arrayList3;
            }
            arrayList3.add(a1Var);
        }
    }

    public final void G() {
        if (!this.f1194i0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f1193h0) {
                this.f1193h0 = currentAnimationTimeMillis;
                b1 b1Var = this.I0;
                float[] fArr = this.f1191f0;
                b1Var.a(this, fArr);
                b7.a.u(fArr, this.f1192g0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.f1190e0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.f1195j0 = f1.f(((float) iArr[0]) - ((float) iArr[0]), ((float) iArr[1]) - ((float) iArr[1]));
            }
        }
    }

    public final void H(a1 a1Var) {
        j3 j3Var;
        Reference poll;
        sf.j.f(a1Var, "layer");
        if (this.V != null) {
            e3.b bVar = e3.K;
        }
        do {
            j3Var = this.C0;
            poll = ((ReferenceQueue) j3Var.f1339b).poll();
            if (poll != null) {
                ((u.d) j3Var.f1338a).j(poll);
                continue;
            }
        } while (poll != null);
        ((u.d) j3Var.f1338a).b(new WeakReference(a1Var, (ReferenceQueue) j3Var.f1339b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(s0.a0 r7) {
        /*
            r6 = this;
            boolean r0 = r6.isLayoutRequested()
            if (r0 != 0) goto L_0x0075
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x0061
        L_0x000e:
            if (r7 == 0) goto L_0x0057
            int r0 = r7.Q
            r1 = 1
            if (r0 != r1) goto L_0x0057
            boolean r0 = r6.f1182a0
            if (r0 != 0) goto L_0x0050
            s0.a0 r0 = r7.q()
            r2 = 0
            if (r0 == 0) goto L_0x004b
            s0.p0 r0 = r0.V
            s0.r r0 = r0.f14401b
            long r3 = r0.f12812d
            int r0 = f1.a.b(r3)
            int r5 = f1.a.d(r3)
            if (r0 != r5) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            int r0 = f1.a.a(r3)
            int r3 = f1.a.c(r3)
            if (r0 != r3) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r2
        L_0x0042:
            if (r0 == 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x004b
            r0 = r1
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            if (r1 == 0) goto L_0x0057
            s0.a0 r7 = r7.q()
            goto L_0x000e
        L_0x0057:
            s0.a0 r0 = r6.getRoot()
            if (r7 != r0) goto L_0x0061
            r6.requestLayout()
            return
        L_0x0061:
            int r7 = r6.getWidth()
            if (r7 == 0) goto L_0x0072
            int r7 = r6.getHeight()
            if (r7 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            r6.invalidate()
            goto L_0x0075
        L_0x0072:
            r6.requestLayout()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.I(s0.a0):void");
    }

    public final int J(MotionEvent motionEvent) {
        o0.r rVar;
        boolean z10 = false;
        if (this.J0) {
            this.J0 = false;
            int metaState = motionEvent.getMetaState();
            this.B.getClass();
            l3.f1347b.setValue(new o0.u(metaState));
        }
        o0.f fVar = this.L;
        o0.q a10 = fVar.a(motionEvent, this);
        o0.s sVar = this.M;
        if (a10 != null) {
            List<o0.r> list = a10.f12085a;
            ListIterator<o0.r> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = null;
                    break;
                }
                rVar = listIterator.previous();
                if (rVar.f12091e) {
                    break;
                }
            }
            o0.r rVar2 = rVar;
            if (rVar2 != null) {
                this.f1181a = rVar2.f12090d;
            }
            int a11 = sVar.a(a10, this, C(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if ((a11 & 1) != 0) {
                    z10 = true;
                }
                if (!z10) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    fVar.f12048c.delete(pointerId);
                    fVar.f12047b.delete(pointerId);
                }
            }
            return a11;
        }
        sVar.b();
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(android.view.MotionEvent r19, int r20, long r21, boolean r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r5 = r20
            int r2 = r19.getActionMasked()
            r3 = 0
            r15 = 1
            if (r2 == r15) goto L_0x0017
            r4 = 6
            if (r2 == r4) goto L_0x0012
            goto L_0x0021
        L_0x0012:
            int r2 = r19.getActionIndex()
            goto L_0x0022
        L_0x0017:
            r2 = 9
            if (r5 == r2) goto L_0x0021
            r2 = 10
            if (r5 == r2) goto L_0x0021
            r2 = r3
            goto L_0x0022
        L_0x0021:
            r2 = -1
        L_0x0022:
            int r4 = r19.getPointerCount()
            if (r2 < 0) goto L_0x002a
            r6 = r15
            goto L_0x002b
        L_0x002a:
            r6 = r3
        L_0x002b:
            int r6 = r4 - r6
            if (r6 != 0) goto L_0x0030
            return
        L_0x0030:
            android.view.MotionEvent$PointerProperties[] r7 = new android.view.MotionEvent.PointerProperties[r6]
            r4 = r3
        L_0x0033:
            if (r4 >= r6) goto L_0x003f
            android.view.MotionEvent$PointerProperties r8 = new android.view.MotionEvent$PointerProperties
            r8.<init>()
            r7[r4] = r8
            int r4 = r4 + 1
            goto L_0x0033
        L_0x003f:
            android.view.MotionEvent$PointerCoords[] r8 = new android.view.MotionEvent.PointerCoords[r6]
            r4 = r3
        L_0x0042:
            if (r4 >= r6) goto L_0x004e
            android.view.MotionEvent$PointerCoords r9 = new android.view.MotionEvent$PointerCoords
            r9.<init>()
            r8[r4] = r9
            int r4 = r4 + 1
            goto L_0x0042
        L_0x004e:
            r4 = r3
        L_0x004f:
            if (r4 >= r6) goto L_0x007f
            if (r2 < 0) goto L_0x0058
            if (r4 >= r2) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r9 = r15
            goto L_0x0059
        L_0x0058:
            r9 = r3
        L_0x0059:
            int r9 = r9 + r4
            r10 = r7[r4]
            r1.getPointerProperties(r9, r10)
            r10 = r8[r4]
            r1.getPointerCoords(r9, r10)
            float r9 = r10.x
            float r11 = r10.y
            long r11 = d2.f1.f(r9, r11)
            long r11 = r0.j(r11)
            float r9 = h0.c.b(r11)
            r10.x = r9
            float r9 = h0.c.c(r11)
            r10.y = r9
            int r4 = r4 + 1
            goto L_0x004f
        L_0x007f:
            if (r23 == 0) goto L_0x0083
            r10 = r3
            goto L_0x0088
        L_0x0083:
            int r2 = r19.getButtonState()
            r10 = r2
        L_0x0088:
            long r2 = r19.getDownTime()
            long r11 = r19.getEventTime()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            r2 = r21
            goto L_0x009b
        L_0x0097:
            long r2 = r19.getDownTime()
        L_0x009b:
            int r9 = r19.getMetaState()
            float r11 = r19.getXPrecision()
            float r12 = r19.getYPrecision()
            int r13 = r19.getDeviceId()
            int r14 = r19.getEdgeFlags()
            int r16 = r19.getSource()
            int r17 = r19.getFlags()
            r1 = r2
            r3 = r21
            r5 = r20
            r15 = r16
            r16 = r17
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "event"
            sf.j.e(r1, r2)
            o0.f r2 = r0.L
            o0.q r2 = r2.a(r1, r0)
            sf.j.c(r2)
            o0.s r3 = r0.M
            r4 = 1
            r3.a(r2, r0, r4)
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.K(android.view.MotionEvent, int, long, boolean):void");
    }

    public final void L() {
        int[] iArr = this.f1190e0;
        getLocationOnScreen(iArr);
        long j10 = this.f1188d0;
        int i8 = (int) (j10 >> 32);
        int a10 = f1.h.a(j10);
        boolean z10 = false;
        int i10 = iArr[0];
        if (!(i8 == i10 && a10 == iArr[1])) {
            this.f1188d0 = e9.c.a(i10, iArr[1]);
            if (!(i8 == Integer.MAX_VALUE || a10 == Integer.MAX_VALUE)) {
                getRoot().W.f14344i.H();
                z10 = true;
            }
        }
        this.f1184b0.a(z10);
    }

    public final void a(a0 a0Var) {
        sf.j.f(a0Var, "node");
    }

    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        sf.j.f(sparseArray, "values");
        e0.a aVar = this.O;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i8 = 0; i8 < size; i8++) {
                int keyAt = sparseArray.keyAt(i8);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                e0.d dVar = e0.d.f7763a;
                sf.j.e(autofillValue, "value");
                if (dVar.d(autofillValue)) {
                    String obj = dVar.i(autofillValue).toString();
                    e0.g gVar = aVar.f7760b;
                    gVar.getClass();
                    sf.j.f(obj, "value");
                    e0.f fVar = (e0.f) gVar.f7765a.get(Integer.valueOf(keyAt));
                } else if (dVar.b(autofillValue)) {
                    throw new ff.f("An operation is not implemented: b/138604541: Add onFill() callback for date");
                } else if (dVar.c(autofillValue)) {
                    throw new ff.f("An operation is not implemented: b/138604541: Add onFill() callback for list");
                } else if (dVar.e(autofillValue)) {
                    throw new ff.f("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public final void b(p pVar) {
        sf.j.f(pVar, "owner");
        setShowLayoutBounds(a.a());
    }

    public final boolean canScrollHorizontally(int i8) {
        this.G.l(i8, this.f1181a, false);
        return false;
    }

    public final boolean canScrollVertically(int i8) {
        this.G.l(i8, this.f1181a, true);
        return false;
    }

    public final void dispatchDraw(Canvas canvas) {
        sf.j.f(canvas, "canvas");
        if (!isAttachedToWindow()) {
            z(getRoot());
        }
        E(true);
        this.K = true;
        s sVar = this.C;
        i0.a aVar = (i0.a) sVar.f7705a;
        Canvas canvas2 = aVar.f9359a;
        aVar.getClass();
        aVar.f9359a = canvas;
        i0.a aVar2 = (i0.a) sVar.f7705a;
        getRoot().o(aVar2);
        aVar2.p(canvas2);
        ArrayList arrayList = this.I;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((a1) arrayList.get(i8)).g();
            }
        }
        if (e3.P) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.K = false;
        ArrayList arrayList2 = this.J;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        sf.j.f(motionEvent, "event");
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (B(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : (y(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        getContext();
        getContext();
        return getFocusOwner().c(new p0.c(v0.b(viewConfiguration) * f10, v0.a(viewConfiguration) * f10, motionEvent.getEventTime()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0107, code lost:
        if (r3 != Integer.MIN_VALUE) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "event"
            sf.j.f(r1, r2)
            boolean r2 = r0.G0
            androidx.activity.b r3 = r0.F0
            if (r2 == 0) goto L_0x0015
            r0.removeCallbacks(r3)
            r3.run()
        L_0x0015:
            boolean r2 = B(r18)
            r4 = 0
            if (r2 != 0) goto L_0x014c
            boolean r2 = r17.isAttachedToWindow()
            if (r2 != 0) goto L_0x0024
            goto L_0x014c
        L_0x0024:
            r2 = 4098(0x1002, float:5.743E-42)
            boolean r2 = r1.isFromSource(r2)
            r5 = 1
            r6 = 10
            r7 = 7
            if (r2 == 0) goto L_0x010d
            int r2 = r1.getToolType(r4)
            if (r2 != r5) goto L_0x010d
            androidx.compose.ui.platform.s r2 = r0.G
            r2.getClass()
            android.view.accessibility.AccessibilityManager r3 = r2.f1418f
            boolean r8 = r3.isEnabled()
            if (r8 == 0) goto L_0x004b
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L_0x004b
            r3 = r5
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            if (r3 != 0) goto L_0x0050
            goto L_0x010c
        L_0x0050:
            int r3 = r18.getAction()
            androidx.compose.ui.platform.AndroidComposeView r8 = r2.f1416d
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r7) goto L_0x0076
            r7 = 9
            if (r3 == r7) goto L_0x0076
            if (r3 == r6) goto L_0x0062
            goto L_0x010c
        L_0x0062:
            int r3 = r2.f1417e
            if (r3 == r9) goto L_0x006b
            r2.I(r9)
            goto L_0x010b
        L_0x006b:
            androidx.compose.ui.platform.a1 r2 = r8.getAndroidViewsHandler$ui_release()
            boolean r1 = r2.dispatchGenericMotionEvent(r1)
        L_0x0073:
            r4 = r1
            goto L_0x010c
        L_0x0076:
            float r3 = r18.getX()
            float r6 = r18.getY()
            r8.E(r5)
            s0.q r7 = new s0.q
            r7.<init>()
            s0.a0 r10 = r8.getRoot()
            long r11 = d2.f1.f(r3, r6)
            s0.a0$c r3 = s0.a0.f14306e0
            r16 = 1
            r10.getClass()
            s0.p0 r3 = r10.V
            s0.s0 r6 = r3.f14402c
            long r12 = r6.a0(r11)
            s0.s0 r10 = r3.f14402c
            s0.s0$b r11 = s0.s0.f14430a0
            r15 = 1
            r14 = r7
            r10.i0(r11, r12, r14, r15, r16)
            java.lang.Object r3 = gf.q.C0(r7)
            s0.p1 r3 = (s0.p1) r3
            if (r3 == 0) goto L_0x00b9
            s0.a0 r3 = s0.i.e(r3)
            if (r3 == 0) goto L_0x00b9
            s0.p1 r3 = gc.b.n(r3)
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r3 == 0) goto L_0x00fb
            v0.p r6 = new v0.p
            s0.a0 r7 = s0.i.e(r3)
            r6.<init>(r3, r4, r7)
            s0.s0 r7 = r6.b()
            if (r7 == 0) goto L_0x00d0
            boolean r7 = r7.m0()
            goto L_0x00d1
        L_0x00d0:
            r7 = r4
        L_0x00d1:
            if (r7 != 0) goto L_0x00de
            v0.w<ff.m> r7 = v0.r.m
            v0.j r6 = r6.f16074f
            boolean r6 = r6.b(r7)
            if (r6 != 0) goto L_0x00de
            r4 = r5
        L_0x00de:
            if (r4 == 0) goto L_0x00fb
            s0.a0 r3 = s0.i.e(r3)
            androidx.compose.ui.platform.a1 r4 = r8.getAndroidViewsHandler$ui_release()
            java.util.HashMap r4 = r4.getLayoutNodeToHolder()
            java.lang.Object r4 = r4.get(r3)
            g1.a r4 = (g1.a) r4
            if (r4 != 0) goto L_0x00fb
            int r3 = r3.f14312b
            int r3 = r2.w(r3)
            goto L_0x00fc
        L_0x00fb:
            r3 = r9
        L_0x00fc:
            androidx.compose.ui.platform.a1 r4 = r8.getAndroidViewsHandler$ui_release()
            boolean r1 = r4.dispatchGenericMotionEvent(r1)
            r2.I(r3)
            if (r3 != r9) goto L_0x010b
            goto L_0x0073
        L_0x010b:
            r4 = r5
        L_0x010c:
            return r4
        L_0x010d:
            int r2 = r18.getActionMasked()
            if (r2 == r7) goto L_0x013d
            if (r2 == r6) goto L_0x0116
            goto L_0x0144
        L_0x0116:
            boolean r2 = r17.C(r18)
            if (r2 == 0) goto L_0x0144
            int r2 = r1.getToolType(r4)
            r6 = 3
            if (r2 == r6) goto L_0x0136
            android.view.MotionEvent r2 = r0.A0
            if (r2 == 0) goto L_0x012a
            r2.recycle()
        L_0x012a:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r18)
            r0.A0 = r1
            r0.G0 = r5
            r0.post(r3)
            return r4
        L_0x0136:
            int r2 = r18.getButtonState()
            if (r2 == 0) goto L_0x0144
            return r4
        L_0x013d:
            boolean r2 = r17.D(r18)
            if (r2 != 0) goto L_0x0144
            return r4
        L_0x0144:
            int r1 = r17.y(r18)
            r1 = r1 & r5
            if (r1 == 0) goto L_0x014c
            r4 = r5
        L_0x014c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        sf.j.f(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int metaState = keyEvent.getMetaState();
        this.B.getClass();
        l3.f1347b.setValue(new o0.u(metaState));
        return getFocusOwner().l(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sf.j.f(motionEvent, "motionEvent");
        if (this.G0) {
            androidx.activity.b bVar = this.F0;
            removeCallbacks(bVar);
            MotionEvent motionEvent2 = this.A0;
            sf.j.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.G0 = false;
                }
            }
            bVar.run();
        }
        if (B(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !D(motionEvent)) {
            return false;
        }
        int y10 = y(motionEvent);
        if ((y10 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (y10 & 1) != 0;
    }

    public final long e(long j10) {
        G();
        return b7.a.y(this.f1191f0, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001f A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s0.a1 f(s0.s0.h r4, rf.l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "drawBlock"
            sf.j.f(r5, r0)
            java.lang.String r0 = "invalidateParentLayer"
            sf.j.f(r4, r0)
        L_0x000a:
            androidx.compose.ui.platform.j3 r0 = r3.C0
            java.lang.Object r1 = r0.f1339b
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r2 = r0.f1338a
            u.d r2 = (u.d) r2
            r2.j(r1)
        L_0x001d:
            if (r1 != 0) goto L_0x000a
        L_0x001f:
            java.lang.Object r1 = r0.f1338a
            u.d r1 = (u.d) r1
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.f1338a
            u.d r1 = (u.d) r1
            int r2 = r1.f15640c
            int r2 = r2 + -1
            java.lang.Object r1 = r1.k(r2)
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x001f
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            s0.a1 r1 = (s0.a1) r1
            if (r1 == 0) goto L_0x0047
            r1.e(r4, r5)
            return r1
        L_0x0047:
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.f1196k0
            if (r0 == 0) goto L_0x005a
            androidx.compose.ui.platform.q2 r0 = new androidx.compose.ui.platform.q2     // Catch:{ all -> 0x0057 }
            r0.<init>(r3, r5, r4)     // Catch:{ all -> 0x0057 }
            return r0
        L_0x0057:
            r0 = 0
            r3.f1196k0 = r0
        L_0x005a:
            androidx.compose.ui.platform.o1 r0 = r3.V
            if (r0 != 0) goto L_0x0092
            boolean r0 = androidx.compose.ui.platform.e3.O
            if (r0 != 0) goto L_0x006e
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            androidx.compose.ui.platform.e3.c.a(r0)
        L_0x006e:
            boolean r0 = androidx.compose.ui.platform.e3.P
            java.lang.String r1 = "context"
            if (r0 == 0) goto L_0x0081
            androidx.compose.ui.platform.o1 r0 = new androidx.compose.ui.platform.o1
            android.content.Context r2 = r3.getContext()
            sf.j.e(r2, r1)
            r0.<init>(r2)
            goto L_0x008d
        L_0x0081:
            androidx.compose.ui.platform.f3 r0 = new androidx.compose.ui.platform.f3
            android.content.Context r2 = r3.getContext()
            sf.j.e(r2, r1)
            r0.<init>(r2)
        L_0x008d:
            r3.V = r0
            r3.addView(r0)
        L_0x0092:
            androidx.compose.ui.platform.e3 r0 = new androidx.compose.ui.platform.e3
            androidx.compose.ui.platform.o1 r1 = r3.V
            sf.j.c(r1)
            r0.<init>(r3, r1, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.f(s0.s0$h, rf.l):s0.a1");
    }

    public final View findViewByAccessibilityIdTraversal(int i8) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return x(this, i8);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i8)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void g(a0 a0Var, boolean z10, boolean z11) {
        sf.j.f(a0Var, "layoutNode");
        m0 m0Var = this.f1184b0;
        if (z10) {
            if (m0Var.l(a0Var, z11)) {
                I(a0Var);
            }
        } else if (m0Var.n(a0Var, z11)) {
            I(a0Var);
        }
    }

    public final a1 getAndroidViewsHandler$ui_release() {
        if (this.U == null) {
            Context context = getContext();
            sf.j.e(context, "context");
            a1 a1Var = new a1(context);
            this.U = a1Var;
            addView(a1Var);
        }
        a1 a1Var2 = this.U;
        sf.j.c(a1Var2);
        return a1Var2;
    }

    public e0.b getAutofill() {
        return this.O;
    }

    public e0.g getAutofillTree() {
        return this.H;
    }

    public final rf.l<Configuration, ff.m> getConfigurationChangeObserver() {
        return this.N;
    }

    public f1.c getDensity() {
        return this.f1187d;
    }

    public g0.j getFocusOwner() {
        return this.f1189e;
    }

    public final void getFocusedRect(Rect rect) {
        ff.m mVar;
        sf.j.f(rect, "rect");
        h0.d g10 = getFocusOwner().g();
        if (g10 != null) {
            rect.left = q4.a.g(g10.f9074a);
            rect.top = q4.a.g(g10.f9075b);
            rect.right = q4.a.g(g10.f9076c);
            rect.bottom = q4.a.g(g10.f9077d);
            mVar = ff.m.f8717a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public f.a getFontFamilyResolver() {
        return (f.a) this.f1205t0.getValue();
    }

    public e.a getFontLoader() {
        return this.f1204s0;
    }

    public l0.a getHapticFeedBack() {
        return this.f1208w0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.f1184b0.f14386b.f14384a.isEmpty();
    }

    public m0.b getInputModeManager() {
        return this.f1209x0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f1193h0;
    }

    public f1.j getLayoutDirection() {
        return (f1.j) this.f1207v0.getValue();
    }

    public long getMeasureIteration() {
        m0 m0Var = this.f1184b0;
        if (m0Var.f14387c) {
            return m0Var.f14390f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public r0.e getModifierLocalManager() {
        return this.f1210y0;
    }

    public o0.m getPointerIconService() {
        return this.K0;
    }

    public a0 getRoot() {
        return this.D;
    }

    public o1 getRootForTest() {
        return this.E;
    }

    public q getSemanticsOwner() {
        return this.F;
    }

    public e0 getSharedDrawScope() {
        return this.f1185c;
    }

    public boolean getShowLayoutBounds() {
        return this.T;
    }

    public k1 getSnapshotObserver() {
        return this.S;
    }

    public z getTextInputForTests() {
        r.b bVar = getPlatformTextInputPluginRegistry().f49b.get((Object) null);
        T t2 = bVar != null ? bVar.f51a : null;
        if (t2 != null) {
            return t2.a();
        }
        return null;
    }

    public a1.a0 getTextInputService() {
        return this.f1203r0;
    }

    public v2 getTextToolbar() {
        return this.f1211z0;
    }

    public View getView() {
        return this;
    }

    public d3 getViewConfiguration() {
        return this.f1186c0;
    }

    public final b getViewTreeOwners() {
        return (b) this.f1197l0.getValue();
    }

    public k3 getWindowInfo() {
        return this.B;
    }

    public final void h(a0 a0Var) {
        m0 m0Var = this.f1184b0;
        m0Var.getClass();
        z0 z0Var = m0Var.f14388d;
        z0Var.getClass();
        z0Var.f14471a.b(a0Var);
        a0Var.f14313b0 = true;
        I((a0) null);
    }

    public final void i(a0 a0Var) {
        sf.j.f(a0Var, "layoutNode");
        this.f1184b0.d(a0Var);
    }

    public final long j(long j10) {
        G();
        long y10 = b7.a.y(this.f1191f0, j10);
        return f1.f(h0.c.b(this.f1195j0) + h0.c.b(y10), h0.c.c(this.f1195j0) + h0.c.c(y10));
    }

    public final void k(a0 a0Var) {
        sf.j.f(a0Var, "node");
        m0 m0Var = this.f1184b0;
        m0Var.getClass();
        m0Var.f14386b.b(a0Var);
        this.P = true;
    }

    public final void m() {
        if (this.P) {
            w wVar = getSnapshotObserver().f14380a;
            d1 d1Var = d1.f14327a;
            wVar.getClass();
            sf.j.f(d1Var, "predicate");
            synchronized (wVar.f2969f) {
                u.d<w.a> dVar = wVar.f2969f;
                int i8 = dVar.f15640c;
                if (i8 > 0) {
                    T[] tArr = dVar.f15638a;
                    int i10 = 0;
                    do {
                        ((w.a) tArr[i10]).d(d1Var);
                        i10++;
                    } while (i10 < i8);
                }
                ff.m mVar = ff.m.f8717a;
            }
            this.P = false;
        }
        a1 a1Var = this.U;
        if (a1Var != null) {
            v(a1Var);
        }
        while (this.D0.i()) {
            int i11 = this.D0.f15640c;
            for (int i12 = 0; i12 < i11; i12++) {
                T[] tArr2 = this.D0.f15638a;
                rf.a aVar = (rf.a) tArr2[i12];
                tArr2[i12] = null;
                if (aVar != null) {
                    aVar.d();
                }
            }
            this.D0.l(0, i11);
        }
    }

    public final void n(a0 a0Var) {
        sf.j.f(a0Var, "layoutNode");
        s sVar = this.G;
        sVar.getClass();
        sVar.f1430s = true;
        if (sVar.t()) {
            sVar.u(a0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        r4 = r2.f1212a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            s0.a0 r0 = r5.getRoot()
            r5.A(r0)
            s0.a0 r0 = r5.getRoot()
            z(r0)
            s0.k1 r0 = r5.getSnapshotObserver()
            b0.w r0 = r0.f14380a
            b0.x r1 = r0.f2967d
            java.lang.String r2 = "observer"
            sf.j.f(r1, r2)
            b0.m$a r2 = b0.m.f2940a
            b0.m.f(r2)
            java.lang.Object r2 = b0.m.f2942c
            monitor-enter(r2)
            java.util.ArrayList r3 = b0.m.f2946g     // Catch:{ all -> 0x00f7 }
            r3.add(r1)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r2)
            b0.g r2 = new b0.g
            r2.<init>(r1)
            r0.f2970g = r2
            e0.a r0 = r5.O
            if (r0 == 0) goto L_0x003c
            e0.e r1 = e0.e.f7764a
            r1.a(r0)
        L_0x003c:
            androidx.lifecycle.q0 r0 = androidx.lifecycle.q0.f2312a
            yf.g r0 = yf.k.o0(r5, r0)
            androidx.lifecycle.r0 r1 = androidx.lifecycle.r0.f2313a
            yf.e r0 = yf.o.q0(r0, r1)
            java.lang.Object r0 = yf.o.p0(r0)
            androidx.lifecycle.p r0 = (androidx.lifecycle.p) r0
            l3.c r1 = l3.c.f10970a
            yf.g r1 = yf.k.o0(r5, r1)
            l3.d r2 = l3.d.f10971a
            yf.e r1 = yf.o.q0(r1, r2)
            java.lang.Object r1 = yf.o.p0(r1)
            l3.b r1 = (l3.b) r1
            androidx.compose.ui.platform.AndroidComposeView$b r2 = r5.getViewTreeOwners()
            r3 = 1
            if (r2 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            androidx.lifecycle.p r4 = r2.f1212a
            if (r0 != r4) goto L_0x0074
            if (r1 == r4) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 0
            goto L_0x0075
        L_0x0074:
            r4 = r3
        L_0x0075:
            if (r4 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00a4
            if (r2 == 0) goto L_0x008a
            androidx.lifecycle.p r2 = r2.f1212a
            if (r2 == 0) goto L_0x008a
            androidx.lifecycle.j r2 = r2.b()
            if (r2 == 0) goto L_0x008a
            r2.c(r5)
        L_0x008a:
            androidx.lifecycle.j r2 = r0.b()
            r2.a(r5)
            androidx.compose.ui.platform.AndroidComposeView$b r2 = new androidx.compose.ui.platform.AndroidComposeView$b
            r2.<init>(r0, r1)
            r5.setViewTreeOwners(r2)
            rf.l<? super androidx.compose.ui.platform.AndroidComposeView$b, ff.m> r0 = r5.f1198m0
            if (r0 == 0) goto L_0x00a0
            r0.invoke(r2)
        L_0x00a0:
            r0 = 0
            r5.f1198m0 = r0
            goto L_0x00b4
        L_0x00a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!"
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            boolean r0 = r5.isInTouchMode()
            if (r0 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r3 = 2
        L_0x00bc:
            m0.c r0 = r5.f1209x0
            r0.getClass()
            m0.a r1 = new m0.a
            r1.<init>(r3)
            t.n1 r0 = r0.f11118b
            r0.setValue(r1)
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r5.getViewTreeOwners()
            sf.j.c(r0)
            androidx.lifecycle.p r0 = r0.f1212a
            androidx.lifecycle.j r0 = r0.b()
            r0.a(r5)
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            androidx.compose.ui.platform.n r1 = r5.f1199n0
            r0.addOnGlobalLayoutListener(r1)
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            androidx.compose.ui.platform.o r1 = r5.f1200o0
            r0.addOnScrollChangedListener(r1)
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            androidx.compose.ui.platform.p r1 = r5.f1201p0
            r0.addOnTouchModeChangeListener(r1)
            return
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow():void");
    }

    public final boolean onCheckIsTextEditor() {
        T t2 = null;
        r.b bVar = getPlatformTextInputPluginRegistry().f49b.get((Object) null);
        if (bVar != null) {
            t2 = bVar.f51a;
        }
        return t2 != null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        sf.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        sf.j.e(context, "context");
        this.f1187d = cb.b.e(context);
        int i8 = Build.VERSION.SDK_INT;
        int i10 = 0;
        if ((i8 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f1206u0) {
            if (i8 >= 31) {
                i10 = configuration.fontWeightAdjustment;
            }
            this.f1206u0 = i10;
            Context context2 = getContext();
            sf.j.e(context2, "context");
            setFontFamilyResolver(z0.k.a(context2));
        }
        this.N.invoke(configuration);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        sf.j.f(editorInfo, "outAttrs");
        r.b bVar = getPlatformTextInputPluginRegistry().f49b.get((Object) null);
        T t2 = bVar != null ? bVar.f51a : null;
        if (t2 != null) {
            return t2.b(editorInfo);
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        p pVar;
        androidx.lifecycle.j b10;
        super.onDetachedFromWindow();
        w wVar = getSnapshotObserver().f14380a;
        b0.g gVar = wVar.f2970g;
        if (gVar != null) {
            gVar.a();
        }
        synchronized (wVar.f2969f) {
            u.d<w.a> dVar = wVar.f2969f;
            int i8 = dVar.f15640c;
            if (i8 > 0) {
                T[] tArr = dVar.f15638a;
                int i10 = 0;
                do {
                    w.a aVar = (w.a) tArr[i10];
                    aVar.f2977e.b();
                    u.b bVar = aVar.f2978f;
                    bVar.f15631a = 0;
                    gf.l.a0(bVar.f15632b, (kotlinx.coroutines.internal.v) null);
                    gf.l.a0((Object[]) bVar.f15633c, (kotlinx.coroutines.internal.v) null);
                    aVar.f2983k.b();
                    aVar.f2984l.clear();
                    i10++;
                } while (i10 < i8);
            }
            ff.m mVar = ff.m.f8717a;
        }
        b viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (pVar = viewTreeOwners.f1212a) == null || (b10 = pVar.b()) == null)) {
            b10.c(this);
        }
        e0.a aVar2 = this.O;
        if (aVar2 != null) {
            e0.e.f7764a.b(aVar2);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1199n0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1200o0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1201p0);
    }

    public final void onDraw(Canvas canvas) {
        sf.j.f(canvas, "canvas");
    }

    public final void onFocusChanged(boolean z10, int i8, Rect rect) {
        super.onFocusChanged(z10, i8, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        if (z10) {
            getFocusOwner().d();
        } else {
            getFocusOwner().i();
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        this.f1184b0.f(this.H0);
        this.W = null;
        L();
        if (this.U != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i11 - i8, i12 - i10);
        }
    }

    public final void onMeasure(int i8, int i10) {
        m0 m0Var = this.f1184b0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                A(getRoot());
            }
            ff.g w10 = w(i8);
            int intValue = ((Number) w10.f8706a).intValue();
            int intValue2 = ((Number) w10.f8707b).intValue();
            ff.g w11 = w(i10);
            long a10 = f1.b.a(intValue, intValue2, ((Number) w11.f8706a).intValue(), ((Number) w11.f8707b).intValue());
            f1.a aVar = this.W;
            boolean z10 = false;
            if (aVar == null) {
                this.W = new f1.a(a10);
                this.f1182a0 = false;
            } else {
                if (aVar.f8025a == a10) {
                    z10 = true;
                }
                if (!z10) {
                    this.f1182a0 = true;
                }
            }
            m0Var.o(a10);
            m0Var.g();
            setMeasuredDimension(getRoot().W.f14344i.f12809a, getRoot().W.f14344i.f12810b);
            if (this.U != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().W.f14344i.f12809a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().W.f14344i.f12810b, 1073741824));
            }
            ff.m mVar = ff.m.f8717a;
        } finally {
            Trace.endSection();
        }
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i8) {
        e0.a aVar;
        if (viewStructure != null && (aVar = this.O) != null) {
            e0.c cVar = e0.c.f7762a;
            e0.g gVar = aVar.f7760b;
            int a10 = cVar.a(viewStructure, gVar.f7765a.size());
            for (Map.Entry entry : gVar.f7765a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                e0.f fVar = (e0.f) entry.getValue();
                ViewStructure b10 = cVar.b(viewStructure, a10);
                if (b10 == null) {
                    a10++;
                } else {
                    e0.d dVar = e0.d.f7763a;
                    AutofillId a11 = dVar.a(viewStructure);
                    sf.j.c(a11);
                    dVar.g(b10, a11, intValue);
                    cVar.d(b10, intValue, aVar.f7759a.getContext().getPackageName(), (String) null, (String) null);
                    dVar.h(b10, 1);
                    fVar.getClass();
                    throw null;
                }
            }
        }
    }

    public final void onRtlPropertiesChanged(int i8) {
        if (this.f1183b) {
            n0.a aVar = n0.f1355a;
            f1.j jVar = f1.j.f8039a;
            if (i8 != 0 && i8 == 1) {
                jVar = f1.j.f8040b;
            }
            setLayoutDirection(jVar);
            getFocusOwner().a(jVar);
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        boolean a10;
        this.B.f1348a.setValue(Boolean.valueOf(z10));
        this.J0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a10 = a.a())) {
            setShowLayoutBounds(a10);
            z(getRoot());
        }
    }

    public final void p() {
        s sVar = this.G;
        sVar.f1430s = true;
        if (sVar.t() && !sVar.C) {
            sVar.C = true;
            sVar.f1422j.post(sVar.D);
        }
    }

    public final void q(rf.a<ff.m> aVar) {
        sf.j.f(aVar, "listener");
        u.d<rf.a<ff.m>> dVar = this.D0;
        if (!dVar.g(aVar)) {
            dVar.b(aVar);
        }
    }

    public final long r(long j10) {
        G();
        return b7.a.y(this.f1192g0, f1.f(h0.c.b(j10) - h0.c.b(this.f1195j0), h0.c.c(j10) - h0.c.c(this.f1195j0)));
    }

    public final void setConfigurationChangeObserver(rf.l<? super Configuration, ff.m> lVar) {
        sf.j.f(lVar, "<set-?>");
        this.N = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f1193h0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(rf.l<? super b, ff.m> lVar) {
        sf.j.f(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f1198m0 = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.T = z10;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(a0 a0Var, boolean z10, boolean z11) {
        sf.j.f(a0Var, "layoutNode");
        m0 m0Var = this.f1184b0;
        if (z10) {
            if (m0Var.k(a0Var, z11)) {
                I((a0) null);
            }
        } else if (m0Var.m(a0Var, z11)) {
            I((a0) null);
        }
    }

    public final void u(c.b bVar) {
        m0 m0Var = this.f1184b0;
        m0Var.getClass();
        m0Var.f14389e.b(bVar);
        I((a0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c A[Catch:{ all -> 0x0076, all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[Catch:{ all -> 0x0076, all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a A[Catch:{ all -> 0x0076, all -> 0x00f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int y(android.view.MotionEvent r13) {
        /*
            r12 = this;
            float[] r0 = r12.f1191f0
            androidx.compose.ui.platform.AndroidComposeView$j r1 = r12.E0
            r12.removeCallbacks(r1)
            r1 = 0
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x00f3 }
            r12.f1193h0 = r2     // Catch:{ all -> 0x00f3 }
            androidx.compose.ui.platform.b1 r2 = r12.I0     // Catch:{ all -> 0x00f3 }
            r2.a(r12, r0)     // Catch:{ all -> 0x00f3 }
            float[] r2 = r12.f1192g0     // Catch:{ all -> 0x00f3 }
            b7.a.u(r0, r2)     // Catch:{ all -> 0x00f3 }
            float r2 = r13.getX()     // Catch:{ all -> 0x00f3 }
            float r3 = r13.getY()     // Catch:{ all -> 0x00f3 }
            long r2 = d2.f1.f(r2, r3)     // Catch:{ all -> 0x00f3 }
            long r2 = b7.a.y(r0, r2)     // Catch:{ all -> 0x00f3 }
            float r0 = r13.getRawX()     // Catch:{ all -> 0x00f3 }
            float r4 = h0.c.b(r2)     // Catch:{ all -> 0x00f3 }
            float r0 = r0 - r4
            float r4 = r13.getRawY()     // Catch:{ all -> 0x00f3 }
            float r2 = h0.c.c(r2)     // Catch:{ all -> 0x00f3 }
            float r4 = r4 - r2
            long r2 = d2.f1.f(r0, r4)     // Catch:{ all -> 0x00f3 }
            r12.f1195j0 = r2     // Catch:{ all -> 0x00f3 }
            r0 = 1
            r12.f1194i0 = r0     // Catch:{ all -> 0x00f3 }
            r12.E(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x00f3 }
            int r2 = r13.getActionMasked()     // Catch:{ all -> 0x0076 }
            android.view.MotionEvent r9 = r12.A0     // Catch:{ all -> 0x0076 }
            r10 = 3
            if (r9 == 0) goto L_0x005c
            int r3 = r9.getToolType(r1)     // Catch:{ all -> 0x0076 }
            if (r3 != r10) goto L_0x005c
            r11 = r0
            goto L_0x005d
        L_0x005c:
            r11 = r1
        L_0x005d:
            if (r9 == 0) goto L_0x00b0
            int r3 = r9.getSource()     // Catch:{ all -> 0x0076 }
            int r4 = r13.getSource()     // Catch:{ all -> 0x0076 }
            if (r3 != r4) goto L_0x0079
            int r3 = r9.getToolType(r1)     // Catch:{ all -> 0x0076 }
            int r4 = r13.getToolType(r1)     // Catch:{ all -> 0x0076 }
            if (r3 == r4) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r3 = r1
            goto L_0x007a
        L_0x0076:
            r13 = move-exception
            goto L_0x00ef
        L_0x0079:
            r3 = r0
        L_0x007a:
            if (r3 == 0) goto L_0x00b0
            int r3 = r9.getButtonState()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0083
            goto L_0x0091
        L_0x0083:
            int r3 = r9.getActionMasked()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0091
            r4 = 2
            if (r3 == r4) goto L_0x0091
            r4 = 6
            if (r3 == r4) goto L_0x0091
            r3 = r1
            goto L_0x0092
        L_0x0091:
            r3 = r0
        L_0x0092:
            if (r3 == 0) goto L_0x009a
            o0.s r3 = r12.M     // Catch:{ all -> 0x0076 }
            r3.b()     // Catch:{ all -> 0x0076 }
            goto L_0x00b0
        L_0x009a:
            int r3 = r9.getActionMasked()     // Catch:{ all -> 0x0076 }
            r4 = 10
            if (r3 == r4) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            r5 = 10
            long r6 = r9.getEventTime()     // Catch:{ all -> 0x0076 }
            r8 = 1
            r3 = r12
            r4 = r9
            r3.K(r4, r5, r6, r8)     // Catch:{ all -> 0x0076 }
        L_0x00b0:
            int r3 = r13.getToolType(r1)     // Catch:{ all -> 0x0076 }
            if (r3 != r10) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r0 = r1
        L_0x00b8:
            if (r11 != 0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d4
            if (r2 == r10) goto L_0x00d4
            r0 = 9
            if (r2 == r0) goto L_0x00d4
            boolean r0 = r12.C(r13)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x00d4
            r4 = 9
            long r5 = r13.getEventTime()     // Catch:{ all -> 0x0076 }
            r7 = 1
            r2 = r12
            r3 = r13
            r2.K(r3, r4, r5, r7)     // Catch:{ all -> 0x0076 }
        L_0x00d4:
            if (r9 == 0) goto L_0x00d9
            r9.recycle()     // Catch:{ all -> 0x0076 }
        L_0x00d9:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r13)     // Catch:{ all -> 0x0076 }
            r12.A0 = r0     // Catch:{ all -> 0x0076 }
            int r13 = r12.J(r13)     // Catch:{ all -> 0x0076 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f3 }
            androidx.compose.ui.platform.l0 r0 = androidx.compose.ui.platform.l0.f1345a     // Catch:{ all -> 0x00f3 }
            r2 = 0
            r0.a(r12, r2)     // Catch:{ all -> 0x00f3 }
            r12.f1194i0 = r1
            return r13
        L_0x00ef:
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f3 }
            throw r13     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r13 = move-exception
            r12.f1194i0 = r1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.y(android.view.MotionEvent):int");
    }

    public k getAccessibilityManager() {
        return this.R;
    }

    public l getClipboardManager() {
        return this.Q;
    }

    public r getPlatformTextInputPluginRegistry() {
        return this.f1202q0;
    }
}
