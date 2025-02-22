package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class f extends e {

    /* renamed from: g0  reason: collision with root package name */
    public static final SparseIntArray f11674g0;

    /* renamed from: c0  reason: collision with root package name */
    public final a f11675c0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    public final b f11676d0 = new b();

    /* renamed from: e0  reason: collision with root package name */
    public final c f11677e0 = new c();

    /* renamed from: f0  reason: collision with root package name */
    public long f11678f0 = -1;

    public class a implements androidx.databinding.f {
        public a() {
        }

        public final void a() {
            f fVar = f.this;
            String a10 = d.a(fVar.U);
            ChangePasswordViewModel changePasswordViewModel = fVar.f11661a0;
            boolean z10 = true;
            if (changePasswordViewModel != null) {
                y0 y0Var = changePasswordViewModel.f7106k;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class b implements androidx.databinding.f {
        public b() {
        }

        public final void a() {
            f fVar = f.this;
            String a10 = d.a(fVar.X);
            ChangePasswordViewModel changePasswordViewModel = fVar.f11661a0;
            boolean z10 = true;
            if (changePasswordViewModel != null) {
                y0 y0Var = changePasswordViewModel.f7105j;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class c implements androidx.databinding.f {
        public c() {
        }

        public final void a() {
            f fVar = f.this;
            String a10 = d.a(fVar.Y);
            ChangePasswordViewModel changePasswordViewModel = fVar.f11661a0;
            boolean z10 = true;
            if (changePasswordViewModel != null) {
                y0 y0Var = changePasswordViewModel.f7104i;
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
        f11674g0 = sparseIntArray;
        sparseIntArray.put(R.id.textView49, 4);
        sparseIntArray.put(R.id.btn_close_change_password, 5);
        sparseIntArray.put(R.id.textView51, 6);
        sparseIntArray.put(R.id.textView55, 7);
        sparseIntArray.put(R.id.textView56, 8);
        sparseIntArray.put(R.id.et_layout_new_password_change_password, 9);
        sparseIntArray.put(R.id.btn_save_new_password_change_password, 10);
        sparseIntArray.put(R.id.et_layout_old_password_change_password, 11);
        sparseIntArray.put(R.id.textView57, 12);
        sparseIntArray.put(R.id.et_layout_confirm_password_change_password, 13);
        sparseIntArray.put(R.id.tv_change_password_error, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.databinding.d r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = f11674g0
            r1 = 15
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r15, r1, r0)
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.EditText r7 = (android.widget.EditText) r7
            r1 = 13
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.textfield.TextInputLayout r9 = (com.google.android.material.textfield.TextInputLayout) r9
            r1 = 11
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            android.widget.EditText r10 = (android.widget.EditText) r10
            r1 = 2
            r1 = r0[r1]
            r11 = r1
            android.widget.EditText r11 = (android.widget.EditText) r11
            r1 = 4
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
            r1 = 12
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 14
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            nc.f$a r14 = new nc.f$a
            r14.<init>()
            r13.f11675c0 = r14
            nc.f$b r14 = new nc.f$b
            r14.<init>()
            r13.f11676d0 = r14
            nc.f$c r14 = new nc.f$c
            r14.<init>()
            r13.f11677e0 = r14
            r1 = -1
            r13.f11678f0 = r1
            android.widget.EditText r14 = r13.U
            r1 = 0
            r14.setTag(r1)
            android.widget.EditText r14 = r13.X
            r14.setTag(r1)
            android.widget.EditText r14 = r13.Y
            r14.setTag(r1)
            r14 = 0
            r14 = r0[r14]
            androidx.core.widget.NestedScrollView r14 = (androidx.core.widget.NestedScrollView) r14
            r14.setTag(r1)
            r14 = 2131296668(0x7f09019c, float:1.821126E38)
            r15.setTag(r14, r13)
            monitor-enter(r13)
            r14 = 16
            r13.f11678f0 = r14     // Catch:{ all -> 0x00a4 }
            monitor-exit(r13)     // Catch:{ all -> 0x00a4 }
            r13.u()
            return
        L_0x00a4:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00a4 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.f11678f0     // Catch:{ all -> 0x00a7 }
            r4 = 0
            r1.f11678f0 = r4     // Catch:{ all -> 0x00a7 }
            monitor-exit(r17)     // Catch:{ all -> 0x00a7 }
            com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r0 = r1.f11661a0
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            if (r6 == 0) goto L_0x006a
            long r14 = r2 & r11
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0025
            kotlinx.coroutines.flow.y0 r6 = r0.f7106k
            goto L_0x0026
        L_0x0025:
            r6 = r13
        L_0x0026:
            r14 = 0
            androidx.databinding.i.a(r1, r14, r6)
            if (r6 == 0) goto L_0x0033
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0034
        L_0x0033:
            r6 = r13
        L_0x0034:
            long r14 = r2 & r9
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x004d
            if (r0 == 0) goto L_0x003f
            kotlinx.coroutines.flow.y0 r14 = r0.f7105j
            goto L_0x0040
        L_0x003f:
            r14 = r13
        L_0x0040:
            r15 = 1
            androidx.databinding.i.a(r1, r15, r14)
            if (r14 == 0) goto L_0x004d
            java.lang.Object r14 = r14.getValue()
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x004e
        L_0x004d:
            r14 = r13
        L_0x004e:
            long r15 = r2 & r7
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0059
            kotlinx.coroutines.flow.y0 r0 = r0.f7104i
            goto L_0x005a
        L_0x0059:
            r0 = r13
        L_0x005a:
            r15 = 2
            androidx.databinding.i.a(r1, r15, r0)
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
        L_0x0067:
            r0 = r13
            r13 = r6
            goto L_0x006c
        L_0x006a:
            r0 = r13
            r14 = r0
        L_0x006c:
            long r11 = r11 & r2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0076
            android.widget.EditText r6 = r1.U
            m2.d.b(r6, r13)
        L_0x0076:
            r11 = 16
            long r11 = r11 & r2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0092
            android.widget.EditText r6 = r1.U
            nc.f$a r11 = r1.f11675c0
            m2.d.c(r6, r11)
            android.widget.EditText r6 = r1.X
            nc.f$b r11 = r1.f11676d0
            m2.d.c(r6, r11)
            android.widget.EditText r6 = r1.Y
            nc.f$c r11 = r1.f11677e0
            m2.d.c(r6, r11)
        L_0x0092:
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x009c
            android.widget.EditText r6 = r1.X
            m2.d.b(r6, r14)
        L_0x009c:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00a6
            android.widget.EditText r2 = r1.Y
            m2.d.b(r2, r0)
        L_0x00a6:
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x00a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11678f0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11678f0 |= 1;
            }
            return true;
        } else if (i8 == 1) {
            k0 k0Var2 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11678f0 |= 2;
            }
            return true;
        } else if (i8 != 2) {
            return false;
        } else {
            k0 k0Var3 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11678f0 |= 4;
            }
            return true;
        }
    }

    public final void w(ChangePasswordViewModel changePasswordViewModel) {
        this.f11661a0 = changePasswordViewModel;
        synchronized (this) {
            this.f11678f0 |= 8;
        }
        j(4);
        u();
    }
}
