package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.FriendId;
import com.quickkonnect.silencio.models.response.tabs.FriendListModel;
import m2.d;

public final class n1 extends m1 {
    public static final SparseIntArray Z;
    public long Y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(R.id.image_view_wallet_recycler, 2);
        sparseIntArray.put(R.id.tv_wallet_recycler_last_active, 3);
        sparseIntArray.put(R.id.tv_wallet_recycler_coin, 4);
        sparseIntArray.put(R.id.imageView12, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n1(androidx.databinding.d r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = Z
            r1 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r11, r1, r0)
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.Y = r1
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            android.widget.TextView r10 = r9.V
            r10.setTag(r0)
            r10 = 2131296668(0x7f09019c, float:1.821126E38)
            r11.setTag(r10, r9)
            monitor-enter(r9)
            r10 = 2
            r9.Y = r10     // Catch:{ all -> 0x004c }
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            r9.u()
            return
        L_0x004c:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.n1.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void n() {
        long j10;
        synchronized (this) {
            j10 = this.Y;
            this.Y = 0;
        }
        FriendListModel friendListModel = this.W;
        int i8 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str = null;
        if (i8 != 0) {
            FriendId friendId = friendListModel != null ? friendListModel.getFriendId() : null;
            if (friendId != null) {
                str = friendId.getNickName();
            }
        }
        if (i8 != 0) {
            d.b(this.V, str);
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

    public final void w(FriendListModel friendListModel) {
        this.W = friendListModel;
        synchronized (this) {
            this.Y |= 1;
        }
        j(2);
        u();
    }
}
