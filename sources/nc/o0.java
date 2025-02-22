package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;

public final class o0 extends n0 {
    public static final SparseIntArray Z;
    public long Y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(R.id.imageView2, 1);
        sparseIntArray.put(R.id.btn_register_close, 2);
        sparseIntArray.put(R.id.textView4, 3);
        sparseIntArray.put(R.id.textView5, 4);
        sparseIntArray.put(R.id.btn_continue_with_email, 5);
        sparseIntArray.put(R.id.btn_continue_with_phone_number, 6);
        sparseIntArray.put(R.id.already_have_account, 7);
        sparseIntArray.put(R.id.register_with_google, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o0(androidx.databinding.d r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = Z
            r1 = 9
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r12, r1, r0)
            r1 = 7
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 8
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.Y = r1
            r11 = 0
            r11 = r0[r11]
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r0 = 0
            r11.setTag(r0)
            r11 = 2131296668(0x7f09019c, float:1.821126E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 1
            r10.Y = r11     // Catch:{ all -> 0x0059 }
            monitor-exit(r10)     // Catch:{ all -> 0x0059 }
            r10.u()
            return
        L_0x0059:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0059 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o0.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void n() {
        synchronized (this) {
            this.Y = 0;
        }
    }

    public final boolean o() {
        synchronized (this) {
            return this.Y != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        return false;
    }
}
