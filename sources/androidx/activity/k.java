package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.s0;
import b3.l0;
import l3.a;
import l3.b;
import sf.j;

public class k extends Dialog implements p, p, b {

    /* renamed from: a  reason: collision with root package name */
    public q f592a;

    /* renamed from: b  reason: collision with root package name */
    public final a f593b = new a(this);

    /* renamed from: c  reason: collision with root package name */
    public final OnBackPressedDispatcher f594c = new OnBackPressedDispatcher(new b(this, 1));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, int i8) {
        super(context, i8);
        j.f(context, "context");
    }

    public static void a(k kVar) {
        j.f(kVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.j b() {
        q qVar = this.f592a;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.f592a = qVar2;
        return qVar2;
    }

    public final void c() {
        Window window = getWindow();
        j.c(window);
        View decorView = window.getDecorView();
        j.e(decorView, "window!!.decorView");
        s0.c(decorView, this);
        Window window2 = getWindow();
        j.c(window2);
        View decorView2 = window2.getDecorView();
        j.e(decorView2, "window!!.decorView");
        b7.a.B(decorView2, this);
        Window window3 = getWindow();
        j.c(window3);
        View decorView3 = window3.getDecorView();
        j.e(decorView3, "window!!.decorView");
        l0.d(decorView3, this);
    }

    public final OnBackPressedDispatcher d() {
        return this.f594c;
    }

    public final void onBackPressed() {
        this.f594c.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            j.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f594c;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f567e = onBackInvokedDispatcher;
            onBackPressedDispatcher.c();
        }
        this.f593b.b(bundle);
        q qVar = this.f592a;
        if (qVar == null) {
            qVar = new q(this);
            this.f592a = qVar;
        }
        qVar.f(j.a.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        sf.j.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f593b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        q qVar = this.f592a;
        if (qVar == null) {
            qVar = new q(this);
            this.f592a = qVar;
        }
        qVar.f(j.a.ON_RESUME);
    }

    public void onStop() {
        q qVar = this.f592a;
        if (qVar == null) {
            qVar = new q(this);
            this.f592a = qVar;
        }
        qVar.f(j.a.ON_DESTROY);
        this.f592a = null;
        super.onStop();
    }

    public void setContentView(int i8) {
        c();
        super.setContentView(i8);
    }

    public final androidx.savedstate.a w() {
        return this.f593b.f10968b;
    }

    public void setContentView(View view) {
        sf.j.f(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        sf.j.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
