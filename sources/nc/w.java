package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class w extends v {

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f11865a0;
    public final a Y = new a();
    public long Z = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            w wVar = w.this;
            String a10 = d.a(wVar.V);
            EmailViewModel emailViewModel = wVar.W;
            boolean z10 = true;
            if (emailViewModel != null) {
                y0 y0Var = emailViewModel.f6744h;
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
        f11865a0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView4, 2);
        sparseIntArray.put(R.id.btn_email_close, 3);
        sparseIntArray.put(R.id.textView7, 4);
        sparseIntArray.put(R.id.textView10, 5);
        sparseIntArray.put(R.id.textView14, 6);
        sparseIntArray.put(R.id.btn_email_continue, 7);
        sparseIntArray.put(R.id.already_have_account, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(androidx.databinding.d r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = f11865a0
            r1 = 9
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r11, r1, r0)
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 1
            r1 = r0[r1]
            r4 = r1
            android.widget.EditText r4 = (android.widget.EditText) r4
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r9
            r3 = r11
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            nc.w$a r10 = new nc.w$a
            r10.<init>()
            r9.Y = r10
            r1 = -1
            r9.Z = r1
            android.widget.EditText r10 = r9.V
            r1 = 0
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            r10.setTag(r1)
            r10 = 2131296668(0x7f09019c, float:1.821126E38)
            r11.setTag(r10, r9)
            monitor-enter(r9)
            r10 = 4
            r9.Z = r10     // Catch:{ all -> 0x0064 }
            monitor-exit(r9)     // Catch:{ all -> 0x0064 }
            r9.u()
            return
        L_0x0064:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0064 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.w.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.Z     // Catch:{ all -> 0x003b }
            r2 = 0
            r8.Z = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            com.quickkonnect.silencio.ui.auth.email.EmailViewModel r4 = r8.W
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0017
            kotlinx.coroutines.flow.y0 r4 = r4.f6744h
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
            android.widget.EditText r4 = r8.V
            m2.d.b(r4, r6)
        L_0x002c:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            android.widget.EditText r0 = r8.V
            nc.w$a r1 = r8.Y
            m2.d.c(r0, r1)
        L_0x003a:
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.w.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.Z != 0;
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
            this.Z |= 1;
        }
        return true;
    }

    public final void w(EmailViewModel emailViewModel) {
        this.W = emailViewModel;
        synchronized (this) {
            this.Z |= 2;
        }
        j(4);
        u();
    }
}
