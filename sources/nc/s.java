package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class s extends r {

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f11830c0;

    /* renamed from: a0  reason: collision with root package name */
    public final a f11831a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public long f11832b0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            s sVar = s.this;
            String a10 = d.a(sVar.X);
            CodeViewModel codeViewModel = sVar.Y;
            boolean z10 = true;
            if (codeViewModel != null) {
                y0 y0Var = codeViewModel.f6710h;
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
        f11830c0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView, 2);
        sparseIntArray.put(R.id.btn_close, 3);
        sparseIntArray.put(R.id.textView, 4);
        sparseIntArray.put(R.id.textView2, 5);
        sparseIntArray.put(R.id.textView3, 6);
        sparseIntArray.put(R.id.btn_code_continue, 7);
        sparseIntArray.put(R.id.btn_code_skip, 8);
        sparseIntArray.put(R.id.discord_link, 9);
        sparseIntArray.put(R.id.already_have_account, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(androidx.databinding.d r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = f11830c0
            r1 = 11
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r13, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 8
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            android.widget.EditText r10 = (android.widget.EditText) r10
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            nc.s$a r12 = new nc.s$a
            r12.<init>()
            r11.f11831a0 = r12
            r1 = -1
            r11.f11832b0 = r1
            android.widget.EditText r12 = r11.X
            r1 = 0
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.core.widget.NestedScrollView r12 = (androidx.core.widget.NestedScrollView) r12
            r12.setTag(r1)
            r12 = 2131296668(0x7f09019c, float:1.821126E38)
            r13.setTag(r12, r11)
            monitor-enter(r11)
            r12 = 4
            r11.f11832b0 = r12     // Catch:{ all -> 0x0072 }
            monitor-exit(r11)     // Catch:{ all -> 0x0072 }
            r11.u()
            return
        L_0x0072:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0072 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.s.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.f11832b0     // Catch:{ all -> 0x003b }
            r2 = 0
            r8.f11832b0 = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            com.quickkonnect.silencio.ui.auth.code.CodeViewModel r4 = r8.Y
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0017
            kotlinx.coroutines.flow.y0 r4 = r4.f6710h
            goto L_0x0018
        L_0x0017:
            r4 = r6
        L_0x0018:
            r7 = 0
            androidx.databinding.i.a(r8, r7, r4)
            if (r4 == 0) goto L_0x0025
            java.lang.Object r4 = r4.getValue()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
        L_0x0025:
            if (r5 == 0) goto L_0x002c
            android.widget.EditText r4 = r8.X
            m2.d.b(r4, r6)
        L_0x002c:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            android.widget.EditText r0 = r8.X
            nc.s$a r1 = r8.f11831a0
            m2.d.c(r0, r1)
        L_0x003a:
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.s.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11832b0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 != 0) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f11832b0 |= 1;
        }
        return true;
    }

    public final void w(CodeViewModel codeViewModel) {
        this.Y = codeViewModel;
        synchronized (this) {
            this.f11832b0 |= 2;
        }
        j(4);
        u();
    }
}
