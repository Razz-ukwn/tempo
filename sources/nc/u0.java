package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class u0 extends t0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f11849b0;
    public final a Y = new a();
    public final b Z = new b();

    /* renamed from: a0  reason: collision with root package name */
    public long f11850a0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            u0 u0Var = u0.this;
            String a10 = d.a(u0Var.U);
            ResetPasswordViewModel resetPasswordViewModel = u0Var.W;
            boolean z10 = true;
            if (resetPasswordViewModel != null) {
                y0 y0Var = resetPasswordViewModel.f6877h;
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
            u0 u0Var = u0.this;
            String a10 = d.a(u0Var.V);
            ResetPasswordViewModel resetPasswordViewModel = u0Var.W;
            boolean z10 = true;
            if (resetPasswordViewModel != null) {
                y0 y0Var = resetPasswordViewModel.f6878i;
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
        f11849b0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView16, 3);
        sparseIntArray.put(R.id.btn_close_reset_password, 4);
        sparseIntArray.put(R.id.textView6, 5);
        sparseIntArray.put(R.id.textView8, 6);
        sparseIntArray.put(R.id.textView18, 7);
        sparseIntArray.put(R.id.textView20, 8);
        sparseIntArray.put(R.id.btn_reset_password_continue, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u0(androidx.databinding.d r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = f11849b0
            r1 = 10
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r11, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.EditText r7 = (android.widget.EditText) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.widget.EditText r8 = (android.widget.EditText) r8
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            nc.u0$a r10 = new nc.u0$a
            r10.<init>()
            r9.Y = r10
            nc.u0$b r10 = new nc.u0$b
            r10.<init>()
            r9.Z = r10
            r1 = -1
            r9.f11850a0 = r1
            android.widget.EditText r10 = r9.U
            r1 = 0
            r10.setTag(r1)
            android.widget.EditText r10 = r9.V
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            r10.setTag(r1)
            r10 = 2131296668(0x7f09019c, float:1.821126E38)
            r11.setTag(r10, r9)
            monitor-enter(r9)
            r10 = 8
            r9.f11850a0 = r10     // Catch:{ all -> 0x0076 }
            monitor-exit(r9)     // Catch:{ all -> 0x0076 }
            r9.u()
            return
        L_0x0076:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0076 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.u0.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f11850a0     // Catch:{ all -> 0x0075 }
            r2 = 0
            r13.f11850a0 = r2     // Catch:{ all -> 0x0075 }
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel r4 = r13.W
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 13
            r8 = 14
            r10 = 0
            if (r5 == 0) goto L_0x004a
            long r11 = r0 & r6
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x0021
            kotlinx.coroutines.flow.y0 r5 = r4.f6878i
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
            long r11 = r0 & r8
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x003b
            kotlinx.coroutines.flow.y0 r4 = r4.f6877h
            goto L_0x003c
        L_0x003b:
            r4 = r10
        L_0x003c:
            r11 = 1
            androidx.databinding.i.a(r13, r11, r4)
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r4.getValue()
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x004b
        L_0x004a:
            r5 = r10
        L_0x004b:
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0055
            android.widget.EditText r4 = r13.U
            m2.d.b(r4, r10)
        L_0x0055:
            r8 = 8
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            android.widget.EditText r4 = r13.U
            nc.u0$a r8 = r13.Y
            m2.d.c(r4, r8)
            android.widget.EditText r4 = r13.V
            nc.u0$b r8 = r13.Z
            m2.d.c(r4, r8)
        L_0x006a:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            android.widget.EditText r0 = r13.V
            m2.d.b(r0, r5)
        L_0x0074:
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.u0.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11850a0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11850a0 |= 1;
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
                this.f11850a0 |= 2;
            }
            return true;
        }
    }

    public final void w(ResetPasswordViewModel resetPasswordViewModel) {
        this.W = resetPasswordViewModel;
        synchronized (this) {
            this.f11850a0 |= 4;
        }
        j(4);
        u();
    }
}
