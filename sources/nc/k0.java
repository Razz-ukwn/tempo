package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class k0 extends j0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f11746b0;
    public final a Z = new a();

    /* renamed from: a0  reason: collision with root package name */
    public long f11747a0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            k0 k0Var = k0.this;
            String a10 = d.a(k0Var.W);
            PhoneNumberViewModel phoneNumberViewModel = k0Var.X;
            boolean z10 = true;
            if (phoneNumberViewModel != null) {
                y0 y0Var = phoneNumberViewModel.f6846h;
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
        f11746b0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView4, 2);
        sparseIntArray.put(R.id.btn_phone_number_close, 3);
        sparseIntArray.put(R.id.textView7, 4);
        sparseIntArray.put(R.id.textView10, 5);
        sparseIntArray.put(R.id.textView13, 6);
        sparseIntArray.put(R.id.ccp_country_code, 7);
        sparseIntArray.put(R.id.textView14, 8);
        sparseIntArray.put(R.id.btn_phone_number_continue, 9);
        sparseIntArray.put(R.id.already_have_account, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k0(androidx.databinding.d r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = f11746b0
            r1 = 11
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r12, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 9
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            com.hbb20.CountryCodePicker r8 = (com.hbb20.CountryCodePicker) r8
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
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r10
            r3 = r12
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            nc.k0$a r11 = new nc.k0$a
            r11.<init>()
            r10.Z = r11
            r1 = -1
            r10.f11747a0 = r1
            android.widget.EditText r11 = r10.W
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r11.setTag(r1)
            r11 = 2131296668(0x7f09019c, float:1.821126E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 4
            r10.f11747a0 = r11     // Catch:{ all -> 0x0071 }
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            r10.u()
            return
        L_0x0071:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.k0.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.f11747a0     // Catch:{ all -> 0x003b }
            r2 = 0
            r8.f11747a0 = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel r4 = r8.X
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0017
            kotlinx.coroutines.flow.y0 r4 = r4.f6846h
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
            android.widget.EditText r4 = r8.W
            m2.d.b(r4, r6)
        L_0x002c:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            android.widget.EditText r0 = r8.W
            nc.k0$a r1 = r8.Z
            m2.d.c(r0, r1)
        L_0x003a:
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.k0.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11747a0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 != 0) {
            return false;
        }
        kotlinx.coroutines.flow.k0 k0Var = (kotlinx.coroutines.flow.k0) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f11747a0 |= 1;
        }
        return true;
    }

    public final void w(PhoneNumberViewModel phoneNumberViewModel) {
        this.X = phoneNumberViewModel;
        synchronized (this) {
            this.f11747a0 |= 2;
        }
        j(4);
        u();
    }
}
