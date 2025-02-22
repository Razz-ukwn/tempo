package nc;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;
import pc.a;

public final class o extends n implements a.C0247a {

    /* renamed from: z0  reason: collision with root package name */
    public static final SparseIntArray f11783z0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinearLayout f11784k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinearLayout f11785l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ConstraintLayout f11786m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LinearLayout f11787n0;

    /* renamed from: o0  reason: collision with root package name */
    public final LinearLayout f11788o0;

    /* renamed from: p0  reason: collision with root package name */
    public final LinearLayout f11789p0;

    /* renamed from: q0  reason: collision with root package name */
    public final LinearLayout f11790q0;

    /* renamed from: r0  reason: collision with root package name */
    public final pc.a f11791r0;

    /* renamed from: s0  reason: collision with root package name */
    public final pc.a f11792s0;

    /* renamed from: t0  reason: collision with root package name */
    public final pc.a f11793t0;

    /* renamed from: u0  reason: collision with root package name */
    public final pc.a f11794u0;

    /* renamed from: v0  reason: collision with root package name */
    public final pc.a f11795v0;

    /* renamed from: w0  reason: collision with root package name */
    public final pc.a f11796w0;

    /* renamed from: x0  reason: collision with root package name */
    public final a f11797x0 = new a();

    /* renamed from: y0  reason: collision with root package name */
    public long f11798y0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            o oVar = o.this;
            String a10 = d.a(oVar.f11774a0);
            ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel = oVar.f11782i0;
            boolean z10 = true;
            if (claimCoinSourceIndoorViewModel != null) {
                y0 y0Var = claimCoinSourceIndoorViewModel.f6951i;
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
        f11783z0 = sparseIntArray;
        sparseIntArray.put(R.id.textView70, 22);
        sparseIntArray.put(R.id.btn_close_claim_yor_coin_source, 23);
        sparseIntArray.put(R.id.textView76, 24);
        sparseIntArray.put(R.id.imageView18, 25);
        sparseIntArray.put(R.id.textView77, 26);
        sparseIntArray.put(R.id.imageView20, 27);
        sparseIntArray.put(R.id.card_place_other_edit, 28);
        sparseIntArray.put(R.id.btn_continue_claim_yor_coin_source, 29);
        sparseIntArray.put(R.id.textView81, 30);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(androidx.databinding.d r22, android.view.View r23) {
        /*
            r21 = this;
            r15 = r21
            r0 = r23
            r1 = r21
            r2 = r22
            r3 = r23
            android.util.SparseIntArray r4 = f11783z0
            r5 = 31
            java.lang.Object[] r20 = androidx.databinding.ViewDataBinding.r(r0, r5, r4)
            r4 = 23
            r4 = r20[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 29
            r5 = r20[r5]
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r6 = 28
            r6 = r20[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6 = 9
            r6 = r20[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r7 = 7
            r7 = r20[r7]
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r14 = 3
            r8 = r20[r14]
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            r13 = 5
            r9 = r20[r13]
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r12 = 1
            r10 = r20[r12]
            com.google.android.material.card.MaterialCardView r10 = (com.google.android.material.card.MaterialCardView) r10
            r11 = 11
            r11 = r20[r11]
            com.google.android.material.card.MaterialCardView r11 = (com.google.android.material.card.MaterialCardView) r11
            r16 = 14
            r16 = r20[r16]
            android.widget.EditText r16 = (android.widget.EditText) r16
            r12 = r16
            r16 = 25
            r16 = r20[r16]
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r16 = 27
            r16 = r20[r16]
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r16 = 22
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 24
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 26
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 30
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 16
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r13 = r16
            r16 = 19
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r16 = 17
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 21
            r16 = r20[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r17 = 15
            r17 = r20[r17]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r18 = 18
            r18 = r20[r18]
            android.widget.TextView r18 = (android.widget.TextView) r18
            r19 = 20
            r19 = r20[r19]
            android.widget.TextView r19 = (android.widget.TextView) r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            nc.o$a r1 = new nc.o$a
            r2 = r21
            r1.<init>()
            r2.f11797x0 = r1
            r3 = -1
            r2.f11798y0 = r3
            com.google.android.material.card.MaterialCardView r1 = r2.U
            r3 = 0
            r1.setTag(r3)
            com.google.android.material.card.MaterialCardView r1 = r2.V
            r1.setTag(r3)
            com.google.android.material.card.MaterialCardView r1 = r2.W
            r1.setTag(r3)
            com.google.android.material.card.MaterialCardView r1 = r2.X
            r1.setTag(r3)
            com.google.android.material.card.MaterialCardView r1 = r2.Y
            r1.setTag(r3)
            com.google.android.material.card.MaterialCardView r1 = r2.Z
            r1.setTag(r3)
            android.widget.EditText r1 = r2.f11774a0
            r1.setTag(r3)
            r1 = 0
            r1 = r20[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1.setTag(r3)
            r1 = 10
            r1 = r20[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2.f11784k0 = r1
            r1.setTag(r3)
            r1 = 12
            r1 = r20[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2.f11785l0 = r1
            r1.setTag(r3)
            r1 = 13
            r1 = r20[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11786m0 = r1
            r1.setTag(r3)
            r1 = 2
            r4 = r20[r1]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r2.f11787n0 = r4
            r4.setTag(r3)
            r4 = 4
            r5 = r20[r4]
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r2.f11788o0 = r5
            r5.setTag(r3)
            r5 = 6
            r6 = r20[r5]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r2.f11789p0 = r6
            r6.setTag(r3)
            r6 = 8
            r6 = r20[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r2.f11790q0 = r6
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11775b0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11776c0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11777d0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11778e0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11779f0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11780g0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11781h0
            r6.setTag(r3)
            r3 = 2131296668(0x7f09019c, float:1.821126E38)
            r0.setTag(r3, r2)
            pc.a r0 = new pc.a
            r3 = 3
            r0.<init>(r2, r3)
            r2.f11791r0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r4)
            r2.f11792s0 = r0
            pc.a r0 = new pc.a
            r3 = 1
            r0.<init>(r2, r3)
            r2.f11793t0 = r0
            pc.a r0 = new pc.a
            r3 = 5
            r0.<init>(r2, r3)
            r2.f11794u0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r5)
            r2.f11795v0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r1)
            r2.f11796w0 = r0
            monitor-enter(r21)
            r0 = 8
            r2.f11798y0 = r0     // Catch:{ all -> 0x0186 }
            monitor-exit(r21)     // Catch:{ all -> 0x0186 }
            r21.u()
            return
        L_0x0186:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x0186 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void b(int i8) {
        boolean z10 = true;
        switch (i8) {
            case 1:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel = this.f11782i0;
                if (claimCoinSourceIndoorViewModel == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel.h("People");
                    return;
                }
                return;
            case 2:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel2 = this.f11782i0;
                if (claimCoinSourceIndoorViewModel2 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel2.h("Animals");
                    return;
                }
                return;
            case 3:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel3 = this.f11782i0;
                if (claimCoinSourceIndoorViewModel3 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel3.h("Music");
                    return;
                }
                return;
            case 4:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel4 = this.f11782i0;
                if (claimCoinSourceIndoorViewModel4 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel4.h("TV");
                    return;
                }
                return;
            case 5:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel5 = this.f11782i0;
                if (claimCoinSourceIndoorViewModel5 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel5.h(this.U.getResources().getString(R.string.no_source));
                    return;
                }
                return;
            case 6:
                ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel6 = this.f11782i0;
                if (claimCoinSourceIndoorViewModel6 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinSourceIndoorViewModel6.h("Weather");
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f11798y0     // Catch:{ all -> 0x0106 }
            r2 = 0
            r13.f11798y0 = r2     // Catch:{ all -> 0x0106 }
            monitor-exit(r13)     // Catch:{ all -> 0x0106 }
            com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel r4 = r13.f11782i0
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            if (r5 == 0) goto L_0x004c
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x0021
            kotlinx.coroutines.flow.y0 r5 = r4.f6951i
            goto L_0x0022
        L_0x0021:
            r5 = r10
        L_0x0022:
            r11 = 0
            androidx.databinding.i.a(r13, r11, r5)
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0030
        L_0x002f:
            r5 = r10
        L_0x0030:
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x003b
            kotlinx.coroutines.flow.y0 r4 = r4.f6950h
            goto L_0x003c
        L_0x003b:
            r4 = r10
        L_0x003c:
            r11 = 1
            androidx.databinding.i.a(r13, r11, r4)
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.getValue()
            r10 = r4
            java.util.List r10 = (java.util.List) r10
        L_0x0049:
            r4 = r10
            r10 = r5
            goto L_0x004d
        L_0x004c:
            r4 = r10
        L_0x004d:
            r11 = 8
            long r11 = r11 & r0
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0085
            com.google.android.material.card.MaterialCardView r5 = r13.U
            pc.a r11 = r13.f11794u0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.V
            pc.a r11 = r13.f11792s0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.W
            pc.a r11 = r13.f11796w0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.X
            pc.a r11 = r13.f11791r0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.Y
            pc.a r11 = r13.f11793t0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.Z
            pc.a r11 = r13.f11795v0
            r5.setOnClickListener(r11)
            android.widget.EditText r5 = r13.f11774a0
            nc.o$a r11 = r13.f11797x0
            m2.d.c(r5, r11)
        L_0x0085:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x008f
            android.widget.EditText r5 = r13.f11774a0
            m2.d.b(r5, r10)
        L_0x008f:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0105
            android.widget.LinearLayout r0 = r13.f11784k0
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131952004(0x7f130184, float:1.9540438E38)
            java.lang.String r1 = r1.getString(r2)
            d2.f1.h(r0, r4, r1)
            android.widget.LinearLayout r0 = r13.f11785l0
            java.lang.String r1 = "Weather"
            d2.f1.h(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11786m0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.d(r0, r4, r1)
            android.widget.LinearLayout r0 = r13.f11787n0
            java.lang.String r1 = "People"
            d2.f1.h(r0, r4, r1)
            android.widget.LinearLayout r0 = r13.f11788o0
            java.lang.String r1 = "Animals"
            d2.f1.h(r0, r4, r1)
            android.widget.LinearLayout r0 = r13.f11789p0
            java.lang.String r1 = "Music"
            d2.f1.h(r0, r4, r1)
            android.widget.LinearLayout r0 = r13.f11790q0
            java.lang.String r1 = "TV"
            d2.f1.h(r0, r4, r1)
            android.widget.TextView r0 = r13.f11775b0
            java.lang.String r1 = "Animals"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11776c0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r2)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11777d0
            java.lang.String r1 = "Music"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11778e0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11779f0
            java.lang.String r1 = "People"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11780g0
            java.lang.String r1 = "TV"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11781h0
            java.lang.String r1 = "Weather"
            androidx.fragment.app.z0.g(r0, r4, r1)
        L_0x0105:
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0106 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11798y0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11798y0 |= 1;
            }
            return true;
        } else if (i8 != 1) {
            return false;
        } else {
            k0 k0Var2 = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11798y0 |= 2;
            }
            return true;
        }
    }

    public final void w(ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel) {
        this.f11782i0 = claimCoinSourceIndoorViewModel;
        synchronized (this) {
            this.f11798y0 |= 4;
        }
        j(4);
        u();
    }
}
