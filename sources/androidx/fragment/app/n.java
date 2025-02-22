package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.k;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import b3.l0;
import com.quickkonnect.silencio.R;

public class n extends p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int A0 = 0;
    public boolean B0 = true;
    public boolean C0 = true;
    public int D0 = -1;
    public boolean E0;
    public final d F0 = new d();
    public Dialog G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public Handler f2035v0;

    /* renamed from: w0  reason: collision with root package name */
    public final a f2036w0 = new a();

    /* renamed from: x0  reason: collision with root package name */
    public final b f2037x0 = new b();

    /* renamed from: y0  reason: collision with root package name */
    public final c f2038y0 = new c();

    /* renamed from: z0  reason: collision with root package name */
    public int f2039z0 = 0;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            n nVar = n.this;
            nVar.f2038y0.onDismiss(nVar.G0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.G0;
            if (dialog != null) {
                nVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.G0;
            if (dialog != null) {
                nVar.onDismiss(dialog);
            }
        }
    }

    public class d implements w<p> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(Object obj) {
            if (((p) obj) != null) {
                n nVar = n.this;
                if (nVar.C0) {
                    View f02 = nVar.f0();
                    if (f02.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (nVar.G0 != null) {
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + nVar.G0);
                        }
                        nVar.G0.setContentView(f02);
                    }
                }
            }
        }
    }

    public class e extends z {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ z f2044b;

        public e(p.b bVar) {
            this.f2044b = bVar;
        }

        public final View r(int i8) {
            z zVar = this.f2044b;
            if (zVar.z()) {
                return zVar.r(i8);
            }
            Dialog dialog = n.this.G0;
            if (dialog != null) {
                return dialog.findViewById(i8);
            }
            return null;
        }

        public final boolean z() {
            return this.f2044b.z() || n.this.K0;
        }
    }

    public n() {
    }

    @Deprecated
    public final void F(Bundle bundle) {
        this.f2062b0 = true;
    }

    public void I(Context context) {
        super.I(context);
        this.f2077n0.f(this.F0);
        if (!this.J0) {
            this.I0 = false;
        }
    }

    public void J(Bundle bundle) {
        super.J(bundle);
        this.f2035v0 = new Handler();
        this.C0 = this.U == 0;
        if (bundle != null) {
            this.f2039z0 = bundle.getInt("android:style", 0);
            this.A0 = bundle.getInt("android:theme", 0);
            this.B0 = bundle.getBoolean("android:cancelable", true);
            this.C0 = bundle.getBoolean("android:showsDialog", this.C0);
            this.D0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void N() {
        this.f2062b0 = true;
        Dialog dialog = this.G0;
        if (dialog != null) {
            this.H0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.G0.dismiss();
            if (!this.I0) {
                onDismiss(this.G0);
            }
            this.G0 = null;
            this.K0 = false;
        }
    }

    public final void O() {
        this.f2062b0 = true;
        if (!this.J0 && !this.I0) {
            this.I0 = true;
        }
        this.f2077n0.j(this.F0);
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        boolean z10 = this.C0;
        if (!z10 || this.E0) {
            if (i0.J(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.C0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return P;
        }
        if (z10 && !this.K0) {
            try {
                this.E0 = true;
                Dialog p02 = p0();
                this.G0 = p02;
                if (this.C0) {
                    r0(p02, this.f2039z0);
                    Context q10 = q();
                    if (q10 instanceof Activity) {
                        this.G0.setOwnerActivity((Activity) q10);
                    }
                    this.G0.setCancelable(this.B0);
                    this.G0.setOnCancelListener(this.f2037x0);
                    this.G0.setOnDismissListener(this.f2038y0);
                    this.K0 = true;
                } else {
                    this.G0 = null;
                }
                this.E0 = false;
            } catch (Throwable th) {
                this.E0 = false;
                throw th;
            }
        }
        if (i0.J(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.G0;
        return dialog != null ? P.cloneInContext(dialog.getContext()) : P;
    }

    public void W(Bundle bundle) {
        Dialog dialog = this.G0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i8 = this.f2039z0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i10 = this.A0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z10 = this.B0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.C0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i11 = this.D0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    public void X() {
        this.f2062b0 = true;
        Dialog dialog = this.G0;
        if (dialog != null) {
            this.H0 = false;
            dialog.show();
            View decorView = this.G0.getWindow().getDecorView();
            s0.c(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            l0.d(decorView, this);
        }
    }

    public void Y() {
        this.f2062b0 = true;
        Dialog dialog = this.G0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void a0(Bundle bundle) {
        Bundle bundle2;
        this.f2062b0 = true;
        if (this.G0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.G0.onRestoreInstanceState(bundle2);
        }
    }

    public final void b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.b0(layoutInflater, viewGroup, bundle);
        if (this.f2066d0 == null && this.G0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.G0.onRestoreInstanceState(bundle2);
        }
    }

    public final z j() {
        return new e(new p.b());
    }

    public void n0() {
        o0(false, false);
    }

    public final void o0(boolean z10, boolean z11) {
        if (!this.I0) {
            this.I0 = true;
            this.J0 = false;
            Dialog dialog = this.G0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.G0.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f2035v0.getLooper()) {
                        onDismiss(this.G0);
                    } else {
                        this.f2035v0.post(this.f2036w0);
                    }
                }
            }
            this.H0 = true;
            if (this.D0 >= 0) {
                i0 u7 = u();
                int i8 = this.D0;
                if (i8 >= 0) {
                    u7.v(new i0.n((String) null, i8, 1), z10);
                    this.D0 = -1;
                    return;
                }
                throw new IllegalArgumentException(q.a("Bad id: ", i8));
            }
            a aVar = new a(u());
            aVar.f2120p = true;
            aVar.l(this);
            if (z10) {
                aVar.h();
            } else {
                aVar.g();
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.H0) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            o0(true, true);
        }
    }

    public Dialog p0() {
        if (i0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new k(e0(), this.A0);
    }

    public final Dialog q0() {
        Dialog dialog = this.G0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void r0(Dialog dialog, int i8) {
        if (!(i8 == 1 || i8 == 2)) {
            if (i8 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void s0(i0 i0Var, String str) {
        this.I0 = false;
        this.J0 = true;
        i0Var.getClass();
        a aVar = new a(i0Var);
        aVar.f2120p = true;
        aVar.d(0, this, str, 1);
        aVar.g();
    }

    public n(int i8) {
        super(i8);
    }
}
