package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class f0 extends e0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final SparseIntArray f11682d0;

    /* renamed from: a0  reason: collision with root package name */
    public final a f11683a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public final b f11684b0 = new b();

    /* renamed from: c0  reason: collision with root package name */
    public long f11685c0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            f0 f0Var = f0.this;
            String a10 = d.a(f0Var.U);
            LoginViewModel loginViewModel = f0Var.Y;
            boolean z10 = true;
            if (loginViewModel != null) {
                y0 y0Var = loginViewModel.f6793i;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class b implements f {
        public b() {
        }

        public final void a() {
            f0 f0Var = f0.this;
            String a10 = d.a(f0Var.V);
            LoginViewModel loginViewModel = f0Var.Y;
            boolean z10 = true;
            if (loginViewModel != null) {
                y0 y0Var = loginViewModel.f6794j;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11682d0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView7, 3);
        sparseIntArray.put(R.id.btn_close_login, 4);
        sparseIntArray.put(R.id.textView23, 5);
        sparseIntArray.put(R.id.textView25, 6);
        sparseIntArray.put(R.id.textView26, 7);
        sparseIntArray.put(R.id.textView27, 8);
        sparseIntArray.put(R.id.et_layout_password_login, 9);
        sparseIntArray.put(R.id.btn_login, 10);
        sparseIntArray.put(R.id.login_with_google, 11);
        sparseIntArray.put(R.id.forgot_password, 12);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f0(androidx.databinding.d r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = f11682d0
            r1 = 13
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r13, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 9
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.EditText r7 = (android.widget.EditText) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.widget.EditText r8 = (android.widget.EditText) r8
            r1 = 12
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 11
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            nc.f0$a r12 = new nc.f0$a
            r12.<init>()
            r11.f11683a0 = r12
            nc.f0$b r12 = new nc.f0$b
            r12.<init>()
            r11.f11684b0 = r12
            r1 = -1
            r11.f11685c0 = r1
            android.widget.EditText r12 = r11.U
            r1 = 0
            r12.setTag(r1)
            android.widget.EditText r12 = r11.V
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.core.widget.NestedScrollView r12 = (androidx.core.widget.NestedScrollView) r12
            r12.setTag(r1)
            r12 = 2131296668(0x7f09019c, float:1.821126E38)
            r13.setTag(r12, r11)
            monitor-enter(r11)
            r12 = 8
            r11.f11685c0 = r12     // Catch:{ all -> 0x008a }
            monitor-exit(r11)     // Catch:{ all -> 0x008a }
            r11.u()
            return
        L_0x008a:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x008a }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f0.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f11685c0     // Catch:{ all -> 0x0077 }
            r2 = 0
            r13.f11685c0 = r2     // Catch:{ all -> 0x0077 }
            monitor-exit(r13)     // Catch:{ all -> 0x0077 }
            com.quickkonnect.silencio.ui.auth.login.LoginViewModel r4 = r13.Y
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            if (r5 == 0) goto L_0x004c
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x0021
            kotlinx.coroutines.flow.y0 r5 = r4.f6793i
            goto L_0x0022
        L_0x0021:
            r5 = r10
        L_0x0022:
            r11 = 0
            androidx.databinding.i.a(r13, r11, r5)
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0030
        L_0x002f:
            r5 = r10
        L_0x0030:
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x003b
            kotlinx.coroutines.flow.y0 r4 = r4.f6794j
            goto L_0x003c
        L_0x003b:
            r4 = r10
        L_0x003c:
            r11 = 1
            androidx.databinding.i.a(r13, r11, r4)
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.getValue()
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
        L_0x0049:
            r4 = r10
            r10 = r5
            goto L_0x004d
        L_0x004c:
            r4 = r10
        L_0x004d:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0057
            android.widget.EditText r5 = r13.U
            m2.d.b(r5, r10)
        L_0x0057:
            r8 = 8
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x006c
            android.widget.EditText r5 = r13.U
            nc.f0$a r8 = r13.f11683a0
            m2.d.c(r5, r8)
            android.widget.EditText r5 = r13.V
            nc.f0$b r8 = r13.f11684b0
            m2.d.c(r5, r8)
        L_0x006c:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            android.widget.EditText r0 = r13.V
            m2.d.b(r0, r4)
        L_0x0076:
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f0.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11685c0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11685c0 |= 1;
            }
            return true;
        } else if (i8 != 1) {
            return false;
        } else {
            k0 k0Var2 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11685c0 |= 2;
            }
            return true;
        }
    }

    public final void w(LoginViewModel loginViewModel) {
        this.Y = loginViewModel;
        synchronized (this) {
            this.f11685c0 |= 4;
        }
        j(4);
        u();
    }
}
