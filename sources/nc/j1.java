package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;

public final class j1 extends i1 {

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f11728c0;

    /* renamed from: b0  reason: collision with root package name */
    public long f11729b0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11728c0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView10, 1);
        sparseIntArray.put(R.id.imageView11, 2);
        sparseIntArray.put(R.id.tv_wallet_coin, 3);
        sparseIntArray.put(R.id.tv_wallet_invited_friend, 4);
        sparseIntArray.put(R.id.tv_subtitle_wallet_invited_friend, 5);
        sparseIntArray.put(R.id.btn_invite_more_friends, 6);
        sparseIntArray.put(R.id.textView37, 7);
        sparseIntArray.put(R.id.tv_wallet_ping_inactive_friend, 8);
        sparseIntArray.put(R.id.recycler_wallet, 9);
        sparseIntArray.put(R.id.tv_wallet_you, 10);
        sparseIntArray.put(R.id.textView40, 11);
        sparseIntArray.put(R.id.tv_wallet_friend, 12);
        sparseIntArray.put(R.id.tv_no_team_found, 13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j1(androidx.databinding.d r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = f11728c0
            r1 = 14
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r15, r1, r0)
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r1 = 7
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 11
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 13
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 12
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 10
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f11729b0 = r1
            r14 = 0
            r14 = r0[r14]
            androidx.core.widget.NestedScrollView r14 = (androidx.core.widget.NestedScrollView) r14
            r0 = 0
            r14.setTag(r0)
            r14 = 2131296668(0x7f09019c, float:1.821126E38)
            r15.setTag(r14, r13)
            monitor-enter(r13)
            r14 = 1
            r13.f11729b0 = r14     // Catch:{ all -> 0x007a }
            monitor-exit(r13)     // Catch:{ all -> 0x007a }
            r13.u()
            return
        L_0x007a:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x007a }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.j1.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void n() {
        synchronized (this) {
            this.f11729b0 = 0;
        }
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11729b0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        return false;
    }
}
