package nc;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;
import pc.a;

public final class k extends j implements a.C0247a {
    public static final SparseIntArray C0;
    public final a A0 = new a();
    public long B0 = -1;

    /* renamed from: l0  reason: collision with root package name */
    public final ConstraintLayout f11730l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ConstraintLayout f11731m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ConstraintLayout f11732n0;

    /* renamed from: o0  reason: collision with root package name */
    public final ConstraintLayout f11733o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ConstraintLayout f11734p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ConstraintLayout f11735q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ConstraintLayout f11736r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ConstraintLayout f11737s0;

    /* renamed from: t0  reason: collision with root package name */
    public final pc.a f11738t0;

    /* renamed from: u0  reason: collision with root package name */
    public final pc.a f11739u0;

    /* renamed from: v0  reason: collision with root package name */
    public final pc.a f11740v0;

    /* renamed from: w0  reason: collision with root package name */
    public final pc.a f11741w0;

    /* renamed from: x0  reason: collision with root package name */
    public final pc.a f11742x0;

    /* renamed from: y0  reason: collision with root package name */
    public final pc.a f11743y0;

    /* renamed from: z0  reason: collision with root package name */
    public final pc.a f11744z0;

    public class a implements f {
        public a() {
        }

        public final void a() {
            k kVar = k.this;
            String a10 = d.a(kVar.f11719b0);
            ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel = kVar.f11727j0;
            boolean z10 = true;
            if (claimCoinPlaceIndoorViewModel != null) {
                y0 y0Var = claimCoinPlaceIndoorViewModel.f6915h;
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
        C0 = sparseIntArray;
        sparseIntArray.put(R.id.textView64, 24);
        sparseIntArray.put(R.id.btn_close_claim_yor_coin_place, 25);
        sparseIntArray.put(R.id.textView75, 26);
        sparseIntArray.put(R.id.btn_radio_home, 27);
        sparseIntArray.put(R.id.btn_radio_office, 28);
        sparseIntArray.put(R.id.btn_radio_gym, 29);
        sparseIntArray.put(R.id.btn_radio_hotel, 30);
        sparseIntArray.put(R.id.btn_radio_restaurant, 31);
        sparseIntArray.put(R.id.btn_radio_bar, 32);
        sparseIntArray.put(R.id.btn_radio_shop, 33);
        sparseIntArray.put(R.id.card_place_other_edit, 34);
        sparseIntArray.put(R.id.btn_continue_claim_coin_place, 35);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(androidx.databinding.d r23, android.view.View r24) {
        /*
            r22 = this;
            r15 = r22
            r0 = r24
            r1 = r22
            r2 = r23
            r3 = r24
            android.util.SparseIntArray r4 = C0
            r5 = 36
            java.lang.Object[] r21 = androidx.databinding.ViewDataBinding.r(r0, r5, r4)
            r4 = 25
            r4 = r21[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 35
            r5 = r21[r5]
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r6 = 32
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 29
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 27
            r6 = r21[r6]
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 30
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 28
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 31
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 33
            r6 = r21[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 34
            r6 = r21[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6 = 11
            r6 = r21[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r14 = 5
            r7 = r21[r14]
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r13 = 1
            r8 = r21[r13]
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            r12 = 7
            r9 = r21[r12]
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r11 = 3
            r10 = r21[r11]
            com.google.android.material.card.MaterialCardView r10 = (com.google.android.material.card.MaterialCardView) r10
            r16 = 9
            r16 = r21[r16]
            com.google.android.material.card.MaterialCardView r16 = (com.google.android.material.card.MaterialCardView) r16
            r11 = r16
            r16 = 13
            r16 = r21[r16]
            com.google.android.material.card.MaterialCardView r16 = (com.google.android.material.card.MaterialCardView) r16
            r12 = r16
            r16 = 16
            r16 = r21[r16]
            android.widget.EditText r16 = (android.widget.EditText) r16
            r13 = r16
            r16 = 24
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 26
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 21
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r16 = 20
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 17
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r17 = 18
            r17 = r21[r17]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r18 = 23
            r18 = r21[r18]
            android.widget.TextView r18 = (android.widget.TextView) r18
            r19 = 19
            r19 = r21[r19]
            android.widget.TextView r19 = (android.widget.TextView) r19
            r20 = 22
            r20 = r21[r20]
            android.widget.TextView r20 = (android.widget.TextView) r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            nc.k$a r1 = new nc.k$a
            r2 = r22
            r1.<init>()
            r2.A0 = r1
            r3 = -1
            r2.B0 = r3
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
            com.google.android.material.card.MaterialCardView r1 = r2.f11718a0
            r1.setTag(r3)
            android.widget.EditText r1 = r2.f11719b0
            r1.setTag(r3)
            r1 = 0
            r1 = r21[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1.setTag(r3)
            r1 = 10
            r1 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11730l0 = r1
            r1.setTag(r3)
            r1 = 12
            r1 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11731m0 = r1
            r1.setTag(r3)
            r1 = 14
            r1 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11732n0 = r1
            r1.setTag(r3)
            r1 = 15
            r1 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11733o0 = r1
            r1.setTag(r3)
            r1 = 2
            r4 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.f11734p0 = r4
            r4.setTag(r3)
            r4 = 4
            r5 = r21[r4]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r2.f11735q0 = r5
            r5.setTag(r3)
            r5 = 6
            r6 = r21[r5]
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r2.f11736r0 = r6
            r6.setTag(r3)
            r6 = 8
            r6 = r21[r6]
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r2.f11737s0 = r6
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11720c0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11721d0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11722e0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11723f0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11724g0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11725h0
            r6.setTag(r3)
            android.widget.TextView r6 = r2.f11726i0
            r6.setTag(r3)
            r3 = 2131296668(0x7f09019c, float:1.821126E38)
            r0.setTag(r3, r2)
            pc.a r0 = new pc.a
            r3 = 7
            r0.<init>(r2, r3)
            r2.f11738t0 = r0
            pc.a r0 = new pc.a
            r3 = 3
            r0.<init>(r2, r3)
            r2.f11739u0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r4)
            r2.f11740v0 = r0
            pc.a r0 = new pc.a
            r3 = 5
            r0.<init>(r2, r3)
            r2.f11741w0 = r0
            pc.a r0 = new pc.a
            r3 = 1
            r0.<init>(r2, r3)
            r2.f11742x0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r5)
            r2.f11743y0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r1)
            r2.f11744z0 = r0
            monitor-enter(r22)
            r0 = 8
            r2.B0 = r0     // Catch:{ all -> 0x01b8 }
            monitor-exit(r22)     // Catch:{ all -> 0x01b8 }
            r22.u()
            return
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01b8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.k.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void b(int i8) {
        boolean z10 = true;
        switch (i8) {
            case 1:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel.h(this.W.getResources().getString(R.string.home));
                    return;
                }
                return;
            case 2:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel2 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel2 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel2.h(this.Y.getResources().getString(R.string.office));
                    return;
                }
                return;
            case 3:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel3 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel3 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel3.h(this.V.getResources().getString(R.string.gym));
                    return;
                }
                return;
            case 4:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel4 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel4 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel4.h(this.X.getResources().getString(R.string.hotel));
                    return;
                }
                return;
            case 5:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel5 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel5 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel5.h(this.Z.getResources().getString(R.string.restaurant));
                    return;
                }
                return;
            case 6:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel6 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel6 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel6.h(this.U.getResources().getString(R.string.bar));
                    return;
                }
                return;
            case 7:
                ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel7 = this.f11727j0;
                if (claimCoinPlaceIndoorViewModel7 == null) {
                    z10 = false;
                }
                if (z10) {
                    claimCoinPlaceIndoorViewModel7.h(this.f11718a0.getResources().getString(R.string.shop));
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
            long r0 = r13.B0     // Catch:{ all -> 0x0168 }
            r2 = 0
            r13.B0 = r2     // Catch:{ all -> 0x0168 }
            monitor-exit(r13)     // Catch:{ all -> 0x0168 }
            com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel r4 = r13.f11727j0
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
            kotlinx.coroutines.flow.y0 r5 = r4.f6915h
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
            kotlinx.coroutines.flow.y0 r4 = r4.f6914g
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
            if (r5 == 0) goto L_0x008c
            com.google.android.material.card.MaterialCardView r5 = r13.U
            pc.a r11 = r13.f11743y0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.V
            pc.a r11 = r13.f11739u0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.W
            pc.a r11 = r13.f11742x0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.X
            pc.a r11 = r13.f11740v0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.Y
            pc.a r11 = r13.f11744z0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.Z
            pc.a r11 = r13.f11741w0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.f11718a0
            pc.a r11 = r13.f11738t0
            r5.setOnClickListener(r11)
            android.widget.EditText r5 = r13.f11719b0
            nc.k$a r11 = r13.A0
            m2.d.c(r5, r11)
        L_0x008c:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0096
            android.widget.EditText r5 = r13.f11719b0
            m2.d.b(r5, r10)
        L_0x0096:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0167
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11730l0
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131952068(0x7f1301c4, float:1.9540568E38)
            java.lang.String r1 = r1.getString(r2)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11731m0
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131951685(0x7f130045, float:1.9539791E38)
            java.lang.String r1 = r1.getString(r3)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11732n0
            android.content.res.Resources r1 = r0.getResources()
            r5 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r1 = r1.getString(r5)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11733o0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11734p0
            android.content.res.Resources r1 = r0.getResources()
            r6 = 2131951845(0x7f1300e5, float:1.9540116E38)
            java.lang.String r1 = r1.getString(r6)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11735q0
            android.content.res.Resources r1 = r0.getResources()
            r7 = 2131952009(0x7f130189, float:1.9540449E38)
            java.lang.String r1 = r1.getString(r7)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11736r0
            android.content.res.Resources r1 = r0.getResources()
            r8 = 2131951830(0x7f1300d6, float:1.9540086E38)
            java.lang.String r1 = r1.getString(r8)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11737s0
            android.content.res.Resources r1 = r0.getResources()
            r9 = 2131951846(0x7f1300e6, float:1.9540118E38)
            java.lang.String r1 = r1.getString(r9)
            androidx.fragment.app.z0.d(r0, r4, r1)
            android.widget.TextView r0 = r13.f11720c0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r3)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11721d0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r8)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11722e0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r6)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11723f0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r7)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11724g0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11725h0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r2)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11726i0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r5)
            androidx.fragment.app.z0.g(r0, r4, r1)
        L_0x0167:
            return
        L_0x0168:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0168 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.k.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.B0 |= 1;
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
                this.B0 |= 2;
            }
            return true;
        }
    }

    public final void w(ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel) {
        this.f11727j0 = claimCoinPlaceIndoorViewModel;
        synchronized (this) {
            this.B0 |= 4;
        }
        j(4);
        u();
    }
}
