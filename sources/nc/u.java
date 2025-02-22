package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;

public final class u extends t {

    /* renamed from: h0  reason: collision with root package name */
    public static final SparseIntArray f11839h0;

    /* renamed from: c0  reason: collision with root package name */
    public final a f11840c0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    public final b f11841d0 = new b();

    /* renamed from: e0  reason: collision with root package name */
    public final c f11842e0 = new c();

    /* renamed from: f0  reason: collision with root package name */
    public final d f11843f0 = new d();

    /* renamed from: g0  reason: collision with root package name */
    public long f11844g0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            u uVar = u.this;
            String a10 = m2.d.a(uVar.V);
            CreateAccountViewModel createAccountViewModel = uVar.f11838a0;
            boolean z10 = true;
            if (createAccountViewModel != null) {
                y0 y0Var = createAccountViewModel.f6728i;
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
            u uVar = u.this;
            String a10 = m2.d.a(uVar.W);
            CreateAccountViewModel createAccountViewModel = uVar.f11838a0;
            boolean z10 = true;
            if (createAccountViewModel != null) {
                y0 y0Var = createAccountViewModel.f6729j;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class c implements f {
        public c() {
        }

        public final void a() {
            u uVar = u.this;
            String a10 = m2.d.a(uVar.X);
            CreateAccountViewModel createAccountViewModel = uVar.f11838a0;
            boolean z10 = true;
            if (createAccountViewModel != null) {
                y0 y0Var = createAccountViewModel.f6730k;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class d implements f {
        public d() {
        }

        public final void a() {
            u uVar = u.this;
            boolean isChecked = uVar.Y.isChecked();
            CreateAccountViewModel createAccountViewModel = uVar.f11838a0;
            boolean z10 = true;
            if (createAccountViewModel != null) {
                y0 y0Var = createAccountViewModel.f6731l;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11839h0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView5, 5);
        sparseIntArray.put(R.id.btn_close_create_account, 6);
        sparseIntArray.put(R.id.textView9, 7);
        sparseIntArray.put(R.id.textView11, 8);
        sparseIntArray.put(R.id.textView15, 9);
        sparseIntArray.put(R.id.textView16, 10);
        sparseIntArray.put(R.id.textView17, 11);
        sparseIntArray.put(R.id.tv_tnc, 12);
        sparseIntArray.put(R.id.btn_create_account_continue, 13);
        sparseIntArray.put(R.id.already_have_account, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(androidx.databinding.d r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = f11839h0
            r1 = 15
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r15, r1, r0)
            r1 = 14
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 6
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 13
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.EditText r8 = (android.widget.EditText) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            android.widget.EditText r9 = (android.widget.EditText) r9
            r1 = 3
            r1 = r0[r1]
            r10 = r1
            android.widget.EditText r10 = (android.widget.EditText) r10
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 4
            r1 = r0[r1]
            r11 = r1
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 10
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 11
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 12
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            nc.u$a r14 = new nc.u$a
            r14.<init>()
            r13.f11840c0 = r14
            nc.u$b r14 = new nc.u$b
            r14.<init>()
            r13.f11841d0 = r14
            nc.u$c r14 = new nc.u$c
            r14.<init>()
            r13.f11842e0 = r14
            nc.u$d r14 = new nc.u$d
            r14.<init>()
            r13.f11843f0 = r14
            r1 = -1
            r13.f11844g0 = r1
            android.widget.EditText r14 = r13.V
            r1 = 0
            r14.setTag(r1)
            android.widget.EditText r14 = r13.W
            r14.setTag(r1)
            android.widget.EditText r14 = r13.X
            r14.setTag(r1)
            r14 = 0
            r14 = r0[r14]
            androidx.core.widget.NestedScrollView r14 = (androidx.core.widget.NestedScrollView) r14
            r14.setTag(r1)
            android.widget.RadioButton r14 = r13.Y
            r14.setTag(r1)
            r14 = 2131296668(0x7f09019c, float:1.821126E38)
            r15.setTag(r14, r13)
            monitor-enter(r13)
            r14 = 32
            r13.f11844g0 = r14     // Catch:{ all -> 0x00b0 }
            monitor-exit(r13)     // Catch:{ all -> 0x00b0 }
            r13.u()
            return
        L_0x00b0:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00b0 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.u.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.f11844g0     // Catch:{ all -> 0x00f6 }
            r4 = 0
            r1.f11844g0 = r4     // Catch:{ all -> 0x00f6 }
            monitor-exit(r20)     // Catch:{ all -> 0x00f6 }
            com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel r0 = r1.f11838a0
            r6 = 63
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r9 = 50
            r11 = 0
            r12 = 49
            r14 = 52
            r7 = 0
            if (r6 == 0) goto L_0x008f
            long r16 = r2 & r12
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0026
            kotlinx.coroutines.flow.y0 r6 = r0.f6729j
            goto L_0x0027
        L_0x0026:
            r6 = r7
        L_0x0027:
            androidx.databinding.i.a(r1, r11, r6)
            if (r6 == 0) goto L_0x0033
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0034
        L_0x0033:
            r6 = r7
        L_0x0034:
            long r16 = r2 & r9
            int r8 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0057
            if (r0 == 0) goto L_0x003f
            kotlinx.coroutines.flow.y0 r8 = r0.f6731l
            goto L_0x0040
        L_0x003f:
            r8 = r7
        L_0x0040:
            r11 = 1
            androidx.databinding.i.a(r1, r11, r8)
            if (r8 == 0) goto L_0x004d
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L_0x004e
        L_0x004d:
            r8 = r7
        L_0x004e:
            if (r8 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            boolean r8 = r8.booleanValue()
            r11 = r8
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            long r16 = r2 & r14
            int r8 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0063
            kotlinx.coroutines.flow.y0 r8 = r0.f6728i
            goto L_0x0064
        L_0x0063:
            r8 = r7
        L_0x0064:
            r9 = 2
            androidx.databinding.i.a(r1, r9, r8)
            if (r8 == 0) goto L_0x0071
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0072
        L_0x0071:
            r8 = r7
        L_0x0072:
            r9 = 56
            long r18 = r2 & r9
            int r9 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x008d
            if (r0 == 0) goto L_0x007f
            kotlinx.coroutines.flow.y0 r0 = r0.f6730k
            goto L_0x0080
        L_0x007f:
            r0 = r7
        L_0x0080:
            r9 = 3
            androidx.databinding.i.a(r1, r9, r0)
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0093
        L_0x008d:
            r0 = r7
            goto L_0x0093
        L_0x008f:
            r0 = r7
            r6 = r0
            r8 = r6
            r11 = 0
        L_0x0093:
            long r9 = r2 & r14
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x009e
            android.widget.EditText r9 = r1.V
            m2.d.b(r9, r8)
        L_0x009e:
            r8 = 32
            long r8 = r8 & r2
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00cc
            android.widget.EditText r8 = r1.V
            nc.u$a r9 = r1.f11840c0
            m2.d.c(r8, r9)
            android.widget.EditText r8 = r1.W
            nc.u$b r9 = r1.f11841d0
            m2.d.c(r8, r9)
            android.widget.EditText r8 = r1.X
            nc.u$c r9 = r1.f11842e0
            m2.d.c(r8, r9)
            android.widget.RadioButton r8 = r1.Y
            nc.u$d r9 = r1.f11843f0
            if (r9 != 0) goto L_0x00c4
            r8.setOnCheckedChangeListener(r7)
            goto L_0x00cc
        L_0x00c4:
            m2.a r7 = new m2.a
            r7.<init>(r9)
            r8.setOnCheckedChangeListener(r7)
        L_0x00cc:
            long r7 = r2 & r12
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00d7
            android.widget.EditText r7 = r1.W
            m2.d.b(r7, r6)
        L_0x00d7:
            r6 = 56
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00e3
            android.widget.EditText r6 = r1.X
            m2.d.b(r6, r0)
        L_0x00e3:
            r6 = 50
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00f5
            android.widget.RadioButton r0 = r1.Y
            boolean r2 = r0.isChecked()
            if (r2 == r11) goto L_0x00f5
            r0.setChecked(r11)
        L_0x00f5:
            return
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x00f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.u.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11844g0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11844g0 |= 1;
            }
            return true;
        } else if (i8 == 1) {
            k0 k0Var2 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11844g0 |= 2;
            }
            return true;
        } else if (i8 == 2) {
            k0 k0Var3 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11844g0 |= 4;
            }
            return true;
        } else if (i8 != 3) {
            return false;
        } else {
            k0 k0Var4 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11844g0 |= 8;
            }
            return true;
        }
    }

    public final void w(CreateAccountViewModel createAccountViewModel) {
        this.f11838a0 = createAccountViewModel;
        synchronized (this) {
            this.f11844g0 |= 16;
        }
        j(4);
        u();
    }
}
