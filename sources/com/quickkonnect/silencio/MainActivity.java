package com.quickkonnect.silencio;

import a2.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import b3.d0;
import b3.f0;
import ff.m;
import jc.k;
import nc.y0;
import rf.l;
import rf.p;
import sf.j;
import sf.w;

public final class MainActivity extends k {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f6650h0 = 0;
    public y0 Y;
    public d0 Z;

    /* renamed from: a0  reason: collision with root package name */
    public a2.e f6651a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6652b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f6653c0 = new k0(w.a(MainViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: d0  reason: collision with root package name */
    public e9.b f6654d0;

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.activity.result.e f6655e0;

    /* renamed from: f0  reason: collision with root package name */
    public final d f6656f0;

    /* renamed from: g0  reason: collision with root package name */
    public final a f6657g0;

    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainActivity f6658a;

        public a(MainActivity mainActivity) {
            this.f6658a = mainActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            j.f(context, "context");
            j.f(intent, "intent");
            String stringExtra = intent.getStringExtra("BOTTOM_NAV_BROADCAST_NAME");
            if (stringExtra != null && stringExtra.hashCode() == -795192327 && stringExtra.equals("wallet")) {
                y0 y0Var = this.f6658a.Y;
                j.c(y0Var);
                ((nc.a) y0Var.f11875c).f11623a.setSelectedItemId(R.id.walletFragment);
            }
        }
    }

    public static final class b implements e.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainActivity f6659a;

        public b(MainActivity mainActivity) {
            this.f6659a = mainActivity;
        }

        public final boolean a() {
            return this.f6659a.f6652b0;
        }
    }

    public static final class c extends sf.k implements p<String, String, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f6660a = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            j.f((String) obj, "<anonymous parameter 0>");
            j.f((String) obj2, "<anonymous parameter 1>");
            return m.f8717a;
        }
    }

    public static final class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainActivity f6661a;

        public d(MainActivity mainActivity) {
            this.f6661a = mainActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            j.f(context, "context");
            j.f(intent, "intent");
            y0 y0Var = this.f6661a.Y;
            j.c(y0Var);
            DrawerLayout drawerLayout = (DrawerLayout) y0Var.f11874b;
            View e10 = drawerLayout.e(8388611);
            if (e10 != null) {
                drawerLayout.o(e10);
                return;
            }
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388611));
        }
    }

    public static final class e implements androidx.activity.result.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f6662a = new e();

        public final /* bridge */ /* synthetic */ void a(Object obj) {
            ((Boolean) obj).booleanValue();
        }
    }

    public static final class f implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6663a;

        public f(l lVar) {
            this.f6663a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6663a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6663a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6663a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6663a.hashCode();
        }
    }

    public static final class g extends sf.k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6664a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f6664a = componentActivity;
        }

        public final Object d() {
            m0.b k10 = this.f6664a.k();
            j.e(k10, "defaultViewModelProviderFactory");
            return k10;
        }
    }

    public static final class h extends sf.k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6665a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f6665a = componentActivity;
        }

        public final Object d() {
            o0 s10 = this.f6665a.s();
            j.e(s10, "viewModelStore");
            return s10;
        }
    }

    public static final class i extends sf.k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6666a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f6666a = componentActivity;
        }

        public final Object d() {
            return this.f6666a.l();
        }
    }

    public MainActivity() {
        c.d dVar = new c.d();
        e eVar = e.f6662a;
        this.f6655e0 = this.H.c("activity_rq#" + this.G.getAndIncrement(), this, dVar, eVar);
        this.f6656f0 = new d(this);
        this.f6657g0 = new a(this);
    }

    public final void M() {
        d0 d0Var = this.Z;
        if (d0Var != null) {
            d0Var.l(R.id.profileFragment, (Bundle) null, (f0) null);
            y0 y0Var = this.Y;
            j.c(y0Var);
            ((DrawerLayout) y0Var.f11874b).b();
            return;
        }
        j.l("navController");
        throw null;
    }

    public final void onBackPressed() {
        y0 y0Var = this.Y;
        j.c(y0Var);
        View e10 = ((DrawerLayout) y0Var.f11874b).e(8388611);
        if (e10 != null ? DrawerLayout.m(e10) : false) {
            y0 y0Var2 = this.Y;
            j.c(y0Var2);
            ((DrawerLayout) y0Var2.f11874b).b();
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0442, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0443, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r36) {
        /*
            r35 = this;
            r1 = r35
            a2.e r0 = new a2.e
            r0.<init>(r1)
            a2.e$b r2 = r0.f77a
            r2.a()
            r1.f6651a0 = r0
            super.onCreate(r36)
            android.view.LayoutInflater r0 = r35.getLayoutInflater()
            r2 = 2131492953(0x7f0c0059, float:1.8609372E38)
            r3 = 0
            r4 = 0
            android.view.View r0 = r0.inflate(r2, r3, r4)
            r2 = 2131296453(0x7f0900c5, float:1.8210823E38)
            android.view.View r5 = cb.b.x(r0, r2)
            java.lang.String r6 = "Missing required view with ID: "
            if (r5 == 0) goto L_0x0536
            r2 = 2131296488(0x7f0900e8, float:1.8210894E38)
            android.view.View r7 = cb.b.x(r5, r2)
            r9 = r7
            com.google.android.material.bottomnavigation.BottomNavigationView r9 = (com.google.android.material.bottomnavigation.BottomNavigationView) r9
            if (r9 == 0) goto L_0x0524
            r2 = 2131296616(0x7f090168, float:1.8211154E38)
            android.view.View r7 = cb.b.x(r5, r2)
            r10 = r7
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            if (r10 == 0) goto L_0x0524
            r2 = 2131296788(0x7f090214, float:1.8211503E38)
            android.view.View r7 = cb.b.x(r5, r2)
            androidx.fragment.app.FragmentContainerView r7 = (androidx.fragment.app.FragmentContainerView) r7
            if (r7 == 0) goto L_0x0524
            r7 = 2131296908(0x7f09028c, float:1.8211746E38)
            android.view.View r8 = cb.b.x(r5, r7)
            r11 = r8
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x0523
            r7 = 2131297367(0x7f090457, float:1.8212677E38)
            android.view.View r8 = cb.b.x(r5, r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0523
            r7 = 2131297368(0x7f090458, float:1.8212679E38)
            android.view.View r8 = cb.b.x(r5, r7)
            r12 = r8
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x0523
            r7 = 2131297369(0x7f090459, float:1.821268E38)
            android.view.View r8 = cb.b.x(r5, r7)
            r13 = r8
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x0523
            r7 = 2131297370(0x7f09045a, float:1.8212683E38)
            android.view.View r8 = cb.b.x(r5, r7)
            r14 = r8
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x0523
            r7 = 2131297371(0x7f09045b, float:1.8212685E38)
            android.view.View r8 = cb.b.x(r5, r7)
            r15 = r8
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L_0x0523
            nc.a r18 = new nc.a
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r8 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r5 = r0
            androidx.drawerlayout.widget.DrawerLayout r5 = (androidx.drawerlayout.widget.DrawerLayout) r5
            r7 = 2131296708(0x7f0901c4, float:1.821134E38)
            android.view.View r8 = cb.b.x(r0, r7)
            r20 = r8
            com.google.android.material.navigation.NavigationView r20 = (com.google.android.material.navigation.NavigationView) r20
            if (r20 == 0) goto L_0x0521
            r7 = 2131296892(0x7f09027c, float:1.8211714E38)
            android.view.View r8 = cb.b.x(r0, r7)
            if (r8 == 0) goto L_0x0521
            r0 = 2131296807(0x7f090227, float:1.8211541E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r22 = r7
            androidx.constraintlayout.widget.Guideline r22 = (androidx.constraintlayout.widget.Guideline) r22
            if (r22 == 0) goto L_0x050f
            r0 = 2131296914(0x7f090292, float:1.8211758E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r23 = r7
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            if (r23 == 0) goto L_0x050f
            r0 = 2131296930(0x7f0902a2, float:1.821179E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r24 = r7
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            if (r24 == 0) goto L_0x050f
            r0 = 2131296931(0x7f0902a3, float:1.8211793E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r25 = r7
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            if (r25 == 0) goto L_0x050f
            r0 = 2131296932(0x7f0902a4, float:1.8211795E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r26 = r7
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            if (r26 == 0) goto L_0x050f
            r0 = 2131296933(0x7f0902a5, float:1.8211797E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r27 = r7
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            if (r27 == 0) goto L_0x050f
            r0 = 2131296934(0x7f0902a6, float:1.8211799E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r28 = r7
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            if (r28 == 0) goto L_0x050f
            r0 = 2131296935(0x7f0902a7, float:1.82118E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r29 = r7
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            if (r29 == 0) goto L_0x050f
            r0 = 2131296936(0x7f0902a8, float:1.8211803E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r30 = r7
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            if (r30 == 0) goto L_0x050f
            r0 = 2131296937(0x7f0902a9, float:1.8211805E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r31 = r7
            android.widget.LinearLayout r31 = (android.widget.LinearLayout) r31
            if (r31 == 0) goto L_0x050f
            r0 = 2131297149(0x7f09037d, float:1.8212235E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r32 = r7
            android.widget.TextView r32 = (android.widget.TextView) r32
            if (r32 == 0) goto L_0x050f
            r0 = 2131297150(0x7f09037e, float:1.8212237E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r33 = r7
            android.widget.TextView r33 = (android.widget.TextView) r33
            if (r33 == 0) goto L_0x050f
            r0 = 2131297395(0x7f090473, float:1.8212734E38)
            android.view.View r7 = cb.b.x(r8, r0)
            r34 = r7
            android.widget.TextView r34 = (android.widget.TextView) r34
            if (r34 == 0) goto L_0x050f
            nc.z0 r0 = new nc.z0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            nc.y0 r6 = new nc.y0
            r16 = r6
            r17 = r5
            r19 = r5
            r16.<init>((androidx.drawerlayout.widget.DrawerLayout) r17, (nc.a) r18, (androidx.drawerlayout.widget.DrawerLayout) r19, (com.google.android.material.navigation.NavigationView) r20, (nc.z0) r21)
            r1.Y = r6
            r1.setContentView((android.view.View) r5)
            a2.e r0 = r1.f6651a0
            if (r0 == 0) goto L_0x0509
            com.quickkonnect.silencio.MainActivity$b r5 = new com.quickkonnect.silencio.MainActivity$b
            r5.<init>(r1)
            a2.e$b r0 = r0.f77a
            r0.b(r5)
            android.view.Window r0 = r35.getWindow()
            if (r0 == 0) goto L_0x0190
            android.view.View r0 = r0.getDecorView()
            goto L_0x0191
        L_0x0190:
            r0 = r3
        L_0x0191:
            if (r0 != 0) goto L_0x0194
            goto L_0x0199
        L_0x0194:
            r5 = 1280(0x500, float:1.794E-42)
            r0.setSystemUiVisibility(r5)
        L_0x0199:
            android.view.Window r0 = r35.getWindow()
            r0.setStatusBarColor(r4)
            androidx.fragment.app.j0 r0 = r35.I()
            androidx.fragment.app.p r0 = r0.C(r2)
            java.lang.String r2 = "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"
            sf.j.d(r0, r2)
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            b3.d0 r0 = r0.f2339v0
            if (r0 == 0) goto L_0x04fd
            r1.Z = r0
            ff.j r0 = r0.B
            java.lang.Object r0 = r0.getValue()
            b3.e0 r0 = (b3.e0) r0
            r2 = 2131755008(0x7f100000, float:1.9140883E38)
            b3.b0 r0 = r0.b(r2)
            java.lang.String r2 = "IS_LOGIN"
            android.content.SharedPreferences r5 = zd.h.f17950a
            if (r5 == 0) goto L_0x04f7
            boolean r2 = r5.getBoolean(r2, r4)
            java.lang.String r5 = "IS_INTRO_COMPLETE"
            android.content.SharedPreferences r6 = zd.h.f17950a
            if (r6 == 0) goto L_0x04f1
            boolean r5 = r6.getBoolean(r5, r4)
            r6 = 2131296822(0x7f090236, float:1.8211572E38)
            if (r2 == 0) goto L_0x01e1
            if (r5 == 0) goto L_0x01e1
            r0.l(r6)
        L_0x01e1:
            r7 = 2131297038(0x7f09030e, float:1.821201E38)
            if (r2 != 0) goto L_0x01e9
            r0.l(r7)
        L_0x01e9:
            if (r5 != 0) goto L_0x01ee
            r0.l(r7)
        L_0x01ee:
            r1.f6652b0 = r4
            b3.d0 r2 = r1.Z
            if (r2 == 0) goto L_0x04eb
            r2.u(r0, r3)
            nc.y0 r0 = r1.Y
            sf.j.c(r0)
            java.lang.Object r0 = r0.f11875c
            nc.a r0 = (nc.a) r0
            com.google.android.material.bottomnavigation.BottomNavigationView r0 = r0.f11623a
            java.lang.String r2 = "binding.activityMain.bottomNavigationView"
            sf.j.e(r0, r2)
            b3.d0 r2 = r1.Z
            if (r2 == 0) goto L_0x04e5
            j0.q r5 = new j0.q
            r5.<init>(r2)
            r0.setOnItemSelectedListener(r5)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            e3.a r0 = new e3.a
            r0.<init>(r5, r2)
            r2.b(r0)
            r0 = 3
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r2[r4] = r5
            r5 = 2131296945(0x7f0902b1, float:1.821182E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r2[r6] = r5
            r5 = 2131297463(0x7f0904b7, float:1.8212872E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            r2[r7] = r5
            java.util.Set r2 = e9.c.j(r2)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r5.addAll(r2)
            b3.d0 r2 = r1.Z
            if (r2 == 0) goto L_0x04df
            jc.t r5 = new jc.t
            r5.<init>(r1)
            r2.b(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11875c
            nc.a r2 = (nc.a) r2
            android.widget.TextView r2 = r2.f11626d
            jc.m r5 = new jc.m
            r5.<init>(r1, r4)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11875c
            nc.a r2 = (nc.a) r2
            android.widget.TextView r2 = r2.f11629g
            jc.o r5 = new jc.o
            r5.<init>(r1, r6)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11875c
            nc.a r2 = (nc.a) r2
            android.widget.TextView r2 = r2.f11627e
            jc.p r5 = new jc.p
            r5.<init>(r1, r6)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11875c
            nc.a r2 = (nc.a) r2
            android.widget.TextView r2 = r2.f11628f
            jc.q r5 = new jc.q
            r5.<init>(r1, r6)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11875c
            nc.a r2 = (nc.a) r2
            android.widget.ImageView r2 = r2.f11625c
            jc.m r5 = new jc.m
            r5.<init>(r1, r7)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11884g
            jc.n r5 = new jc.n
            r5.<init>(r1, r7)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.TextView r2 = r2.m
            jc.o r5 = new jc.o
            r5.<init>(r1, r7)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.ImageView r2 = r2.f11879b
            jc.p r5 = new jc.p
            r5.<init>(r1, r7)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.TextView r2 = r2.f11888k
            jc.q r5 = new jc.q
            r5.<init>(r1, r7)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11883f
            jc.m r5 = new jc.m
            r5.<init>(r1, r0)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11882e
            jc.n r5 = new jc.n
            r5.<init>(r1, r4)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11881d
            jc.o r5 = new jc.o
            r5.<init>(r1, r4)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11880c
            jc.p r5 = new jc.p
            r5.<init>(r1, r4)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11886i
            jc.q r5 = new jc.q
            r5.<init>(r1, r4)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11887j
            jc.m r5 = new jc.m
            r5.<init>(r1, r6)
            r2.setOnClickListener(r5)
            nc.y0 r2 = r1.Y
            sf.j.c(r2)
            java.lang.Object r2 = r2.f11877e
            nc.z0 r2 = (nc.z0) r2
            android.widget.LinearLayout r2 = r2.f11885h
            jc.n r5 = new jc.n
            r5.<init>(r1, r6)
            r2.setOnClickListener(r5)
            androidx.lifecycle.k0 r2 = r1.f6653c0
            java.lang.Object r2 = r2.getValue()
            com.quickkonnect.silencio.MainViewModel r2 = (com.quickkonnect.silencio.MainViewModel) r2
            androidx.lifecycle.LiveData<java.util.List<com.quickkonnect.silencio.models.response.auth.UserModel>> r2 = r2.f6669i
            jc.u r5 = new jc.u
            r5.<init>(r1)
            com.quickkonnect.silencio.MainActivity$f r8 = new com.quickkonnect.silencio.MainActivity$f
            r8.<init>(r5)
            r2.e(r1, r8)
            androidx.lifecycle.k0 r2 = r1.f6653c0
            java.lang.Object r2 = r2.getValue()
            com.quickkonnect.silencio.MainViewModel r2 = (com.quickkonnect.silencio.MainViewModel) r2
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.UpdateCheckResponse>> r2 = r2.f6670j
            jc.w r5 = new jc.w
            r5.<init>(r1)
            com.quickkonnect.silencio.MainActivity$f r8 = new com.quickkonnect.silencio.MainActivity$f
            r8.<init>(r5)
            r2.e(r1, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r2 < r5) goto L_0x03cc
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            int r5 = t1.a.a(r1, r2)
            if (r5 == 0) goto L_0x03cc
            boolean r5 = r1.shouldShowRequestPermissionRationale(r2)
            if (r5 != 0) goto L_0x03cc
            androidx.activity.result.e r5 = r1.f6655e0
            r5.a(r2)
        L_0x03cc:
            com.quickkonnect.silencio.MainActivity$c r2 = com.quickkonnect.silencio.MainActivity.c.f6660a
            java.lang.String r5 = "callback"
            sf.j.f(r2, r5)
            r5 = 10
            t6.e r8 = t6.e.f15393d     // Catch:{ Exception -> 0x0442 }
            int r9 = r8.b(r1)     // Catch:{ Exception -> 0x0442 }
            if (r9 == 0) goto L_0x0408
            java.util.concurrent.atomic.AtomicBoolean r10 = t6.i.f15402a     // Catch:{ Exception -> 0x0442 }
            if (r9 == r6) goto L_0x03eb
            if (r9 == r7) goto L_0x03eb
            if (r9 == r0) goto L_0x03eb
            r0 = 9
            if (r9 == r0) goto L_0x03eb
            r0 = r4
            goto L_0x03ec
        L_0x03eb:
            r0 = r6
        L_0x03ec:
            if (r0 == 0) goto L_0x03fa
            r0 = 9000(0x2328, float:1.2612E-41)
            android.app.AlertDialog r0 = r8.d(r1, r9, r0, r3)     // Catch:{ Exception -> 0x0442 }
            if (r0 == 0) goto L_0x0406
            r0.show()     // Catch:{ Exception -> 0x0442 }
            goto L_0x0406
        L_0x03fa:
            bh.a$a r0 = bh.a.f3654a     // Catch:{ Exception -> 0x0442 }
            java.lang.String r3 = "==checkPlayServices==This device is not supported."
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0442 }
            r0.a(r3, r7)     // Catch:{ Exception -> 0x0442 }
            r35.finish()     // Catch:{ Exception -> 0x0442 }
        L_0x0406:
            r0 = r4
            goto L_0x0409
        L_0x0408:
            r0 = r6
        L_0x0409:
            if (r0 == 0) goto L_0x0446
            com.google.firebase.messaging.a r0 = com.google.firebase.messaging.FirebaseMessaging.m     // Catch:{ Exception -> 0x0442 }
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r3 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x0442 }
            m9.f r0 = m9.f.d()     // Catch:{ all -> 0x043f }
            com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.getInstance(r0)     // Catch:{ all -> 0x043f }
            monitor-exit(r3)     // Catch:{ Exception -> 0x0442 }
            pa.a r3 = r0.f6332b     // Catch:{ Exception -> 0x0442 }
            if (r3 == 0) goto L_0x0422
            com.google.android.gms.tasks.Task r0 = r3.b()     // Catch:{ Exception -> 0x0442 }
            goto L_0x0436
        L_0x0422:
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ Exception -> 0x0442 }
            r3.<init>()     // Catch:{ Exception -> 0x0442 }
            a2.a r7 = new a2.a     // Catch:{ Exception -> 0x0442 }
            r8 = 7
            r7.<init>(r8, r0, r3)     // Catch:{ Exception -> 0x0442 }
            java.util.concurrent.Executor r0 = r0.f6338h     // Catch:{ Exception -> 0x0442 }
            r0.execute(r7)     // Catch:{ Exception -> 0x0442 }
            com.google.android.gms.tasks.Task r0 = r3.getTask()     // Catch:{ Exception -> 0x0442 }
        L_0x0436:
            j0.p r3 = new j0.p     // Catch:{ Exception -> 0x0442 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0442 }
            r0.addOnCompleteListener(r3)     // Catch:{ Exception -> 0x0442 }
            goto L_0x0446
        L_0x043f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0442 }
            throw r0     // Catch:{ Exception -> 0x0442 }
        L_0x0442:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0446:
            nc.y0 r0 = r1.Y
            sf.j.c(r0)
            java.lang.Object r0 = r0.f11877e
            nc.z0 r0 = (nc.z0) r0
            androidx.constraintlayout.widget.Guideline r0 = r0.f11878a
            android.content.res.Resources r2 = r35.getResources()
            java.lang.String r3 = "dimen"
            java.lang.String r7 = "android"
            java.lang.String r8 = "status_bar_height"
            int r2 = r2.getIdentifier(r8, r3, r7)
            android.content.res.Resources r3 = r35.getResources()
            int r2 = r3.getDimensionPixelSize(r2)
            r0.setGuidelineBegin(r2)
            nc.y0 r0 = r1.Y
            sf.j.c(r0)
            android.view.View r0 = r0.f11874b
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            r0.setDrawerLockMode(r6)
            nc.y0 r0 = r1.Y
            sf.j.c(r0)
            java.lang.Object r0 = r0.f11877e
            nc.z0 r0 = (nc.z0) r0
            android.widget.TextView r0 = r0.f11889l
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = "1.3.0"
            r2[r4] = r3
            r3 = 2131952125(0x7f1301fd, float:1.9540684E38)
            java.lang.String r2 = r1.getString(r3, r2)
            r0.setText(r2)
            java.lang.Class<e9.c> r2 = e9.c.class
            monitor-enter(r2)
            e9.j r0 = e9.c.f7876a     // Catch:{ all -> 0x04dc }
            if (r0 != 0) goto L_0x04b3
            r3.s r0 = new r3.s     // Catch:{ all -> 0x04dc }
            r0.<init>((int) r4)     // Catch:{ all -> 0x04dc }
            androidx.lifecycle.u r3 = new androidx.lifecycle.u     // Catch:{ all -> 0x04dc }
            android.content.Context r4 = r35.getApplicationContext()     // Catch:{ all -> 0x04dc }
            if (r4 == 0) goto L_0x04a6
            goto L_0x04a7
        L_0x04a6:
            r4 = r1
        L_0x04a7:
            r3.<init>(r4, r5)     // Catch:{ all -> 0x04dc }
            r0.f13862a = r3     // Catch:{ all -> 0x04dc }
            e9.j r0 = new e9.j     // Catch:{ all -> 0x04dc }
            r0.<init>(r3)     // Catch:{ all -> 0x04dc }
            e9.c.f7876a = r0     // Catch:{ all -> 0x04dc }
        L_0x04b3:
            e9.j r0 = e9.c.f7876a     // Catch:{ all -> 0x04dc }
            monitor-exit(r2)
            f9.c r0 = r0.f7894a
            java.lang.Object r0 = r0.zza()
            e9.b r0 = (e9.b) r0
            java.lang.String r2 = "create(this)"
            sf.j.e(r0, r2)
            r1.f6654d0 = r0
            com.google.android.gms.tasks.Task r0 = r0.a()
            java.lang.String r2 = "appUpdateManager.appUpdateInfo"
            sf.j.e(r0, r2)
            jc.s r2 = new jc.s
            r2.<init>(r1)
            j6.m r3 = new j6.m
            r3.<init>(r2)
            r0.addOnSuccessListener(r3)
            return
        L_0x04dc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x04df:
            java.lang.String r0 = "navController"
            sf.j.l(r0)
            throw r3
        L_0x04e5:
            java.lang.String r0 = "navController"
            sf.j.l(r0)
            throw r3
        L_0x04eb:
            java.lang.String r0 = "navController"
            sf.j.l(r0)
            throw r3
        L_0x04f1:
            java.lang.String r0 = "prefs"
            sf.j.l(r0)
            throw r3
        L_0x04f7:
            java.lang.String r0 = "prefs"
            sf.j.l(r0)
            throw r3
        L_0x04fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "NavController is not available before onCreate()"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0509:
            java.lang.String r0 = "splashScreen"
            sf.j.l(r0)
            throw r3
        L_0x050f:
            android.content.res.Resources r2 = r8.getResources()
            java.lang.String r0 = r2.getResourceName(r0)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = r6.concat(r0)
            r2.<init>(r0)
            throw r2
        L_0x0521:
            r2 = r7
            goto L_0x0536
        L_0x0523:
            r2 = r7
        L_0x0524:
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getResourceName(r2)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = r6.concat(r0)
            r2.<init>(r0)
            throw r2
        L_0x0536:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r2)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = r6.concat(r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.MainActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        a3.a.a(this).d(this.f6656f0);
        a3.a.a(this).d(this.f6657g0);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        d0 d0Var = this.Z;
        if (d0Var != null) {
            d0Var.o();
            return true;
        }
        j.l("navController");
        throw null;
    }

    public final void onStart() {
        super.onStart();
        a3.a.a(this).b(this.f6656f0, new IntentFilter("com.quickkonnect.silencio.side_menu"));
        a3.a.a(this).b(this.f6657g0, new IntentFilter("com.quickkonnect.silencio.bottom_nav"));
    }
}
