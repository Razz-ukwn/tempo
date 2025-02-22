package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.g;
import androidx.activity.result.i;
import androidx.fragment.app.g0;
import androidx.fragment.app.i0;
import androidx.fragment.app.u;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b3.l0;
import c.a;
import com.google.android.recaptcha.RecaptchaDefinitions;
import com.quickkonnect.silencio.R;
import d2.q;
import d2.r;
import d2.t;
import ff.m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s1.a;
import s1.a0;
import s1.j;
import s1.k;
import s1.x;
import s1.y;

public class ComponentActivity extends j implements p0, h, l3.b, p, androidx.activity.result.h, t1.c, t1.d, x, y, q {
    public o0 B;
    public f0 C;
    public final OnBackPressedDispatcher D;
    public final e E;
    public final m F;
    public final AtomicInteger G;
    public final b H;
    public final CopyOnWriteArrayList<c2.a<Configuration>> I;
    public final CopyOnWriteArrayList<c2.a<Integer>> J;
    public final CopyOnWriteArrayList<c2.a<Intent>> K;
    public final CopyOnWriteArrayList<c2.a<k>> L;
    public final CopyOnWriteArrayList<c2.a<a0>> M;
    public boolean N;
    public boolean O;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f548b = new b.a();

    /* renamed from: c  reason: collision with root package name */
    public final r f549c = new r(new b(this, 0));

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.q f550d;

    /* renamed from: e  reason: collision with root package name */
    public final l3.a f551e;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends g {
        public b() {
        }

        public final void b(int i8, c.a aVar, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0054a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new h(this, i8, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i10 = s1.a.f14472c;
                HashSet hashSet = new HashSet();
                int i11 = 0;
                while (i11 < stringArrayExtra.length) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i11])) {
                        if (!y1.a.a() && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i11));
                        }
                        i11++;
                    } else {
                        throw new IllegalArgumentException(g.a(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[(stringArrayExtra.length - size)] : stringArrayExtra;
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                            if (!hashSet.contains(Integer.valueOf(i13))) {
                                strArr[i12] = stringArrayExtra[i13];
                                i12++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (componentActivity instanceof a.e) {
                    ((a.e) componentActivity).A();
                }
                a.b.b(componentActivity, stringArrayExtra, i8);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                i iVar = (i) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = iVar.f629a;
                    Intent intent = iVar.f630b;
                    int i14 = iVar.f631c;
                    int i15 = iVar.f632d;
                    int i16 = s1.a.f14472c;
                    a.C0273a.c(componentActivity, intentSender, i8, intent, i14, i15, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new i(this, i8, e10));
                }
            } else {
                int i17 = s1.a.f14472c;
                a.C0273a.b(componentActivity, a10, i8, bundle);
            }
        }
    }

    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public o0 f557a;
    }

    public class e implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final long f558a = (SystemClock.uptimeMillis() + RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT);

        /* renamed from: b  reason: collision with root package name */
        public Runnable f559b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f560c = false;

        public e() {
        }

        public final void a(View view) {
            if (!this.f560c) {
                this.f560c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public final void execute(Runnable runnable) {
            this.f559b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f560c) {
                decorView.postOnAnimation(new j(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f559b;
            if (runnable != null) {
                runnable.run();
                this.f559b = null;
                m mVar = ComponentActivity.this.F;
                synchronized (mVar.f598b) {
                    z10 = mVar.f599c;
                }
                if (z10) {
                    this.f560c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f558a) {
                this.f560c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        androidx.lifecycle.q qVar = new androidx.lifecycle.q(this);
        this.f550d = qVar;
        l3.a aVar = new l3.a(this);
        this.f551e = aVar;
        this.D = new OnBackPressedDispatcher(new a());
        e eVar = new e();
        this.E = eVar;
        this.F = new m(eVar, new c(this));
        this.G = new AtomicInteger();
        this.H = new b();
        this.I = new CopyOnWriteArrayList<>();
        this.J = new CopyOnWriteArrayList<>();
        this.K = new CopyOnWriteArrayList<>();
        this.L = new CopyOnWriteArrayList<>();
        this.M = new CopyOnWriteArrayList<>();
        this.N = false;
        this.O = false;
        qVar.a(new n() {
            public final void d(p pVar, j.a aVar) {
                if (aVar == j.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        qVar.a(new n() {
            public final void d(p pVar, j.a aVar) {
                if (aVar == j.a.ON_DESTROY) {
                    ComponentActivity.this.f548b.f2881b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.s().a();
                    }
                }
            }
        });
        qVar.a(new n() {
            public final void d(p pVar, j.a aVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.B == null) {
                    d dVar = (d) componentActivity.getLastNonConfigurationInstance();
                    if (dVar != null) {
                        componentActivity.B = dVar.f557a;
                    }
                    if (componentActivity.B == null) {
                        componentActivity.B = new o0();
                    }
                }
                componentActivity.f550d.c(this);
            }
        });
        aVar.a();
        c0.b(this);
        aVar.f10968b.c("android:support:activity-result", new d(this, 0));
        G(new e(this));
    }

    private void H() {
        s0.c(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        sf.j.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        l0.d(getWindow().getDecorView(), this);
        b7.a.B(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        sf.j.f(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public final void B(v vVar) {
        this.M.add(vVar);
    }

    public final void C(i0.c cVar) {
        r rVar = this.f549c;
        rVar.f7272b.remove(cVar);
        if (((r.a) rVar.f7273c.remove(cVar)) == null) {
            rVar.f7271a.run();
            return;
        }
        throw null;
    }

    public final void E(u uVar) {
        this.L.add(uVar);
    }

    public final void G(b.b bVar) {
        b.a aVar = this.f548b;
        aVar.getClass();
        if (aVar.f2881b != null) {
            bVar.a();
        }
        aVar.f2880a.add(bVar);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        H();
        this.E.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.j b() {
        return this.f550d;
    }

    public final OnBackPressedDispatcher d() {
        return this.D;
    }

    public final void i(c2.a<Configuration> aVar) {
        this.I.add(aVar);
    }

    public m0.b k() {
        if (this.C == null) {
            this.C = new f0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.C;
    }

    public final x2.a l() {
        x2.c cVar = new x2.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f16911a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.l0.f2292a, getApplication());
        }
        linkedHashMap.put(c0.f2254a, this);
        linkedHashMap.put(c0.f2255b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            linkedHashMap.put(c0.f2256c, getIntent().getExtras());
        }
        return cVar;
    }

    public final void n(g0 g0Var) {
        this.J.remove(g0Var);
    }

    public final void o(androidx.fragment.app.f0 f0Var) {
        this.I.remove(f0Var);
    }

    @Deprecated
    public void onActivityResult(int i8, int i10, Intent intent) {
        if (!this.H.a(i8, i10, intent)) {
            super.onActivityResult(i8, i10, intent);
        }
    }

    public void onBackPressed() {
        this.D.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<c2.a<Configuration>> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f551e.b(bundle);
        b.a aVar = this.f548b;
        aVar.getClass();
        aVar.f2881b = this;
        Iterator it = aVar.f2880a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a();
        }
        super.onCreate(bundle);
        int i8 = androidx.lifecycle.a0.f2238b;
        a0.b.b(this);
        if (y1.a.a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.D;
            OnBackInvokedDispatcher a10 = c.a(this);
            onBackPressedDispatcher.getClass();
            sf.j.f(a10, "invoker");
            onBackPressedDispatcher.f567e = a10;
            onBackPressedDispatcher.c();
        }
    }

    public final boolean onCreatePanelMenu(int i8, Menu menu) {
        if (i8 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i8, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator<t> it = this.f549c.f7272b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 != 0) {
            return false;
        }
        Iterator<t> it = this.f549c.f7272b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void onMultiWindowModeChanged(boolean z10) {
        if (!this.N) {
            Iterator<c2.a<k>> it = this.L.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10));
            }
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<c2.a<Intent>> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i8, Menu menu) {
        Iterator<t> it = this.f549c.f7272b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i8, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z10) {
        if (!this.O) {
            Iterator<c2.a<s1.a0>> it = this.M.iterator();
            while (it.hasNext()) {
                it.next().accept(new s1.a0(z10));
            }
        }
    }

    public final boolean onPreparePanel(int i8, View view, Menu menu) {
        if (i8 != 0) {
            return true;
        }
        super.onPreparePanel(i8, view, menu);
        Iterator<t> it = this.f549c.f7272b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (!this.H.a(i8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i8, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        o0 o0Var = this.B;
        if (o0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            o0Var = dVar.f557a;
        }
        if (o0Var == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f557a = o0Var;
        return dVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.q qVar = this.f550d;
        if (qVar instanceof androidx.lifecycle.q) {
            qVar.h(j.b.f2279c);
        }
        super.onSaveInstanceState(bundle);
        this.f551e.c(bundle);
    }

    public final void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        Iterator<c2.a<Integer>> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i8));
        }
    }

    public final void p(v vVar) {
        this.M.remove(vVar);
    }

    public final g q() {
        return this.H;
    }

    public final void reportFullyDrawn() {
        try {
            if (q3.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m mVar = this.F;
            synchronized (mVar.f598b) {
                mVar.f599c = true;
                Iterator it = mVar.f600d.iterator();
                while (it.hasNext()) {
                    ((rf.a) it.next()).d();
                }
                mVar.f600d.clear();
                m mVar2 = m.f8717a;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final o0 s() {
        if (getApplication() != null) {
            if (this.B == null) {
                d dVar = (d) getLastNonConfigurationInstance();
                if (dVar != null) {
                    this.B = dVar.f557a;
                }
                if (this.B == null) {
                    this.B = new o0();
                }
            }
            return this.B;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void setContentView(int i8) {
        H();
        this.E.a(getWindow().getDecorView());
        super.setContentView(i8);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i8) {
        super.startActivityForResult(intent, i8);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i10, int i11, int i12) {
        super.startIntentSenderForResult(intentSender, i8, intent, i10, i11, i12);
    }

    public final void u(g0 g0Var) {
        this.J.add(g0Var);
    }

    public final void v(u uVar) {
        this.L.remove(uVar);
    }

    public final androidx.savedstate.a w() {
        return this.f551e.f10968b;
    }

    public final void x(i0.c cVar) {
        r rVar = this.f549c;
        rVar.f7272b.add(cVar);
        rVar.f7271a.run();
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        super.startActivityForResult(intent, i8, bundle);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i8, intent, i10, i11, i12, bundle);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.N = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.N = false;
            Iterator<c2.a<k>> it = this.L.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10, 0));
            }
        } catch (Throwable th) {
            this.N = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.O = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.O = false;
            Iterator<c2.a<s1.a0>> it = this.M.iterator();
            while (it.hasNext()) {
                it.next().accept(new s1.a0(z10, 0));
            }
        } catch (Throwable th) {
            this.O = false;
            throw th;
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        H();
        this.E.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        H();
        this.E.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
