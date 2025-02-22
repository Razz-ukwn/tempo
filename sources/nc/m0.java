package nc;

import android.util.SparseIntArray;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel;
import kotlinx.coroutines.flow.y0;
import pc.a;

public final class m0 extends l0 implements a.C0247a {

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f11772a0;
    public final a Y;
    public long Z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11772a0 = sparseIntArray;
        sparseIntArray.put(R.id.popup_title, 2);
        sparseIntArray.put(R.id.popup_subtitle, 3);
        sparseIntArray.put(R.id.continue_button, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(androidx.databinding.d r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = f11772a0
            r1 = 5
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.r(r11, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 1
            r2 = r0[r1]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = -1
            r9.Z = r2
            r10 = 0
            r10 = r0[r10]
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            r0 = 0
            r10.setTag(r0)
            android.widget.TextView r10 = r9.V
            r10.setTag(r0)
            r10 = 2131296668(0x7f09019c, float:1.821126E38)
            r11.setTag(r10, r9)
            pc.a r10 = new pc.a
            r10.<init>(r9, r1)
            r9.Y = r10
            monitor-enter(r9)
            r10 = 2
            r9.Z = r10     // Catch:{ all -> 0x004e }
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            r9.u()
            return
        L_0x004e:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.m0.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void b(int i8) {
        PopupViewModel popupViewModel = this.W;
        if (popupViewModel != null) {
            y0 y0Var = popupViewModel.f7055g;
            y0Var.setValue(Boolean.valueOf(true ^ ((Boolean) y0Var.getValue()).booleanValue()));
        }
    }

    public final void n() {
        long j10;
        synchronized (this) {
            j10 = this.Z;
            this.Z = 0;
        }
        if ((j10 & 2) != 0) {
            this.V.setOnClickListener(this.Y);
        }
    }

    public final boolean o() {
        synchronized (this) {
            return this.Z != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        return false;
    }

    public final void w(PopupViewModel popupViewModel) {
        this.W = popupViewModel;
        synchronized (this) {
            this.Z |= 1;
        }
        j(4);
        u();
    }
}
