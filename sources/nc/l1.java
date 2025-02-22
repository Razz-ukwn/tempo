package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;

public final class l1 extends k1 {
    public static final SparseIntArray Z;
    public long Y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(R.id.image_view_history_recycler, 1);
        sparseIntArray.put(R.id.tv_history_recycler_lati_long_time, 2);
        sparseIntArray.put(R.id.tv_history_recycler_coin, 3);
        sparseIntArray.put(R.id.imageView14, 4);
        sparseIntArray.put(R.id.tv_history_recycler_decibel, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l1(androidx.databinding.d r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = Z
            r1 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r12, r1, r0)
            r1 = 0
            r1 = r0[r1]
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 2
            r0 = r0[r1]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r10.Y = r0
            androidx.constraintlayout.widget.ConstraintLayout r11 = r10.S
            r0 = 0
            r11.setTag(r0)
            r11 = 2131296668(0x7f09019c, float:1.821126E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 2
            r10.Y = r11     // Catch:{ all -> 0x004a }
            monitor-exit(r10)     // Catch:{ all -> 0x004a }
            r10.u()
            return
        L_0x004a:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x004a }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.l1.<init>(androidx.databinding.d, android.view.View):void");
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
