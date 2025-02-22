package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;

public final class b1 extends a1 {

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f11632b0;

    /* renamed from: a0  reason: collision with root package name */
    public long f11633a0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11632b0 = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 1);
        sparseIntArray.put(R.id.guidelineTop, 2);
        sparseIntArray.put(R.id.card_history_back, 3);
        sparseIntArray.put(R.id.imageView2, 4);
        sparseIntArray.put(R.id.textView46, 5);
        sparseIntArray.put(R.id.tv_history_total, 6);
        sparseIntArray.put(R.id.textView48, 7);
        sparseIntArray.put(R.id.tv_history_hours, 8);
        sparseIntArray.put(R.id.textView50, 9);
        sparseIntArray.put(R.id.tv_history_mins_avg, 10);
        sparseIntArray.put(R.id.textView52, 11);
        sparseIntArray.put(R.id.textView53, 12);
        sparseIntArray.put(R.id.recycler_history, 13);
        sparseIntArray.put(R.id.tv_no_history_found, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b1(androidx.databinding.d r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = f11632b0
            r1 = 15
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r14, r1, r0)
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r1 = 1
            r1 = r0[r1]
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            androidx.constraintlayout.widget.Guideline r6 = (androidx.constraintlayout.widget.Guideline) r6
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 13
            r1 = r0[r1]
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 11
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 12
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 10
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 14
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f11633a0 = r1
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r13 = 2131296668(0x7f09019c, float:1.821126E38)
            r14.setTag(r13, r12)
            monitor-enter(r12)
            r13 = 2
            r12.f11633a0 = r13     // Catch:{ all -> 0x007f }
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            r12.u()
            return
        L_0x007f:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.b1.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void n() {
        synchronized (this) {
            this.f11633a0 = 0;
        }
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11633a0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        return false;
    }
}
