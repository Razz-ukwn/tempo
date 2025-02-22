package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class h extends g {

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f11694c0;
    public final a Z = new a();

    /* renamed from: a0  reason: collision with root package name */
    public final b f11695a0 = new b();

    /* renamed from: b0  reason: collision with root package name */
    public long f11696b0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            h hVar = h.this;
            String a10 = d.a(hVar.V);
            ChoosePasswordViewModel choosePasswordViewModel = hVar.X;
            boolean z10 = true;
            if (choosePasswordViewModel != null) {
                y0 y0Var = choosePasswordViewModel.f6698i;
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
            h hVar = h.this;
            String a10 = d.a(hVar.W);
            ChoosePasswordViewModel choosePasswordViewModel = hVar.X;
            boolean z10 = true;
            if (choosePasswordViewModel != null) {
                y0 y0Var = choosePasswordViewModel.f6699j;
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
        f11694c0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView6, 3);
        sparseIntArray.put(R.id.btn_close_choose_password, 4);
        sparseIntArray.put(R.id.textView12, 5);
        sparseIntArray.put(R.id.textView19, 6);
        sparseIntArray.put(R.id.textView21, 7);
        sparseIntArray.put(R.id.et_layout_enter_password, 8);
        sparseIntArray.put(R.id.textView22, 9);
        sparseIntArray.put(R.id.et_layout_repeat_password, 10);
        sparseIntArray.put(R.id.btn_choose_password_continue, 11);
        sparseIntArray.put(R.id.already_have_account, 12);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(androidx.databinding.d r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = f11694c0
            r1 = 13
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r12, r1, r0)
            r1 = 12
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 11
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.EditText r8 = (android.widget.EditText) r8
            r1 = 8
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 10
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            android.widget.EditText r9 = (android.widget.EditText) r9
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            nc.h$a r11 = new nc.h$a
            r11.<init>()
            r10.Z = r11
            nc.h$b r11 = new nc.h$b
            r11.<init>()
            r10.f11695a0 = r11
            r1 = -1
            r10.f11696b0 = r1
            android.widget.EditText r11 = r10.V
            r1 = 0
            r11.setTag(r1)
            android.widget.EditText r11 = r10.W
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r11.setTag(r1)
            r11 = 2131296668(0x7f09019c, float:1.821126E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 8
            r10.f11696b0 = r11     // Catch:{ all -> 0x0089 }
            monitor-exit(r10)     // Catch:{ all -> 0x0089 }
            r10.u()
            return
        L_0x0089:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0089 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.h.<init>(androidx.databinding.d, android.view.View):void");
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
            long r0 = r13.f11696b0     // Catch:{ all -> 0x0075 }
            r2 = 0
            r13.f11696b0 = r2     // Catch:{ all -> 0x0075 }
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel r4 = r13.X
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
            kotlinx.coroutines.flow.y0 r5 = r4.f6699j
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
            kotlinx.coroutines.flow.y0 r4 = r4.f6698i
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
            android.widget.EditText r4 = r13.V
            m2.d.b(r4, r10)
        L_0x0055:
            r8 = 8
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            android.widget.EditText r4 = r13.V
            nc.h$a r8 = r13.Z
            m2.d.c(r4, r8)
            android.widget.EditText r4 = r13.W
            nc.h$b r8 = r13.f11695a0
            m2.d.c(r4, r8)
        L_0x006a:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            android.widget.EditText r0 = r13.W
            m2.d.b(r0, r5)
        L_0x0074:
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.h.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11696b0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11696b0 |= 1;
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
                this.f11696b0 |= 2;
            }
            return true;
        }
    }

    public final void w(ChoosePasswordViewModel choosePasswordViewModel) {
        this.X = choosePasswordViewModel;
        synchronized (this) {
            this.f11696b0 |= 4;
        }
        j(4);
        u();
    }
}
