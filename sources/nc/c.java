package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel;
import kotlinx.coroutines.flow.y0;
import pc.a;

public final class c extends b implements a.C0247a {
    public static final SparseIntArray Z;
    public final a X;
    public long Y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(R.id.btn_close, 2);
        sparseIntArray.put(R.id.textView24, 3);
        sparseIntArray.put(R.id.textView25, 4);
        sparseIntArray.put(R.id.textView26, 5);
        sparseIntArray.put(R.id.textView27, 6);
        sparseIntArray.put(R.id.textView28, 7);
        sparseIntArray.put(R.id.textView29, 8);
        sparseIntArray.put(R.id.ask_button, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(androidx.databinding.d r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = Z
            r1 = 10
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r10, r1, r0)
            r1 = 9
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 3
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 4
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 5
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 6
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 7
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 8
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = -1
            r8.Y = r2
            r9 = 0
            r9 = r0[r9]
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            r0 = 0
            r9.setTag(r0)
            android.widget.TextView r9 = r8.U
            r9.setTag(r0)
            r9 = 2131296668(0x7f09019c, float:1.821126E38)
            r10.setTag(r9, r8)
            pc.a r9 = new pc.a
            r9.<init>(r8, r1)
            r8.X = r9
            monitor-enter(r8)
            r9 = 2
            r8.Y = r9     // Catch:{ all -> 0x0069 }
            monitor-exit(r8)     // Catch:{ all -> 0x0069 }
            r8.u()
            return
        L_0x0069:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0069 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.c.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void b(int i8) {
        AskSilencioViewModel askSilencioViewModel = this.V;
        if (askSilencioViewModel != null) {
            y0 y0Var = askSilencioViewModel.f7125g;
            y0Var.setValue(Boolean.valueOf(true ^ ((Boolean) y0Var.getValue()).booleanValue()));
        }
    }

    public final void n() {
        long j10;
        synchronized (this) {
            j10 = this.Y;
            this.Y = 0;
        }
        if ((j10 & 2) != 0) {
            this.U.setOnClickListener(this.X);
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

    public final void w(AskSilencioViewModel askSilencioViewModel) {
        this.V = askSilencioViewModel;
        synchronized (this) {
            this.Y |= 1;
        }
        j(4);
        u();
    }
}
