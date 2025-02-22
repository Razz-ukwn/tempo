package nc;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;
import pc.a;

public final class m extends l implements a.C0247a {

    /* renamed from: v0  reason: collision with root package name */
    public static final SparseIntArray f11757v0;

    /* renamed from: i0  reason: collision with root package name */
    public final ConstraintLayout f11758i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ConstraintLayout f11759j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ConstraintLayout f11760k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ConstraintLayout f11761l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ConstraintLayout f11762m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ConstraintLayout f11763n0;

    /* renamed from: o0  reason: collision with root package name */
    public final pc.a f11764o0;

    /* renamed from: p0  reason: collision with root package name */
    public final pc.a f11765p0;

    /* renamed from: q0  reason: collision with root package name */
    public final pc.a f11766q0;

    /* renamed from: r0  reason: collision with root package name */
    public final pc.a f11767r0;

    /* renamed from: s0  reason: collision with root package name */
    public final pc.a f11768s0;

    /* renamed from: t0  reason: collision with root package name */
    public final a f11769t0 = new a();

    /* renamed from: u0  reason: collision with root package name */
    public long f11770u0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            m mVar = m.this;
            String a10 = d.a(mVar.Z);
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel = mVar.f11756g0;
            boolean z10 = true;
            if (claimCoinPlaceOutdoorViewModel != null) {
                y0 y0Var = claimCoinPlaceOutdoorViewModel.f6932h;
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
        f11757v0 = sparseIntArray;
        sparseIntArray.put(R.id.textView64, 19);
        sparseIntArray.put(R.id.btn_close_claim_yor_coin_place, 20);
        sparseIntArray.put(R.id.textView75, 21);
        sparseIntArray.put(R.id.btn_radio_street, 22);
        sparseIntArray.put(R.id.btn_radio_public_space, 23);
        sparseIntArray.put(R.id.btn_radio_gastronomy, 24);
        sparseIntArray.put(R.id.btn_radio_nature, 25);
        sparseIntArray.put(R.id.btn_radio_centric_spaces, 26);
        sparseIntArray.put(R.id.card_place_other_edit, 27);
        sparseIntArray.put(R.id.btn_continue_claim_coin_place, 28);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(androidx.databinding.d r20, android.view.View r21) {
        /*
            r19 = this;
            r15 = r19
            r0 = r21
            r1 = r19
            r2 = r20
            r3 = r21
            android.util.SparseIntArray r4 = f11757v0
            r5 = 29
            java.lang.Object[] r18 = androidx.databinding.ViewDataBinding.r(r0, r5, r4)
            r4 = 20
            r4 = r18[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 28
            r5 = r18[r5]
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r6 = 26
            r6 = r18[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 24
            r6 = r18[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 25
            r6 = r18[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 23
            r6 = r18[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 22
            r6 = r18[r6]
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r6 = 27
            r6 = r18[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6 = 9
            r6 = r18[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r7 = 7
            r7 = r18[r7]
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r14 = 5
            r8 = r18[r14]
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            r13 = 3
            r9 = r18[r13]
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r12 = 1
            r10 = r18[r12]
            com.google.android.material.card.MaterialCardView r10 = (com.google.android.material.card.MaterialCardView) r10
            r11 = 12
            r11 = r18[r11]
            android.widget.EditText r11 = (android.widget.EditText) r11
            r16 = 19
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 21
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 17
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r12 = r16
            r16 = 15
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r13 = r16
            r16 = 16
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r16 = 14
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 18
            r16 = r18[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r17 = 13
            r17 = r18[r17]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            nc.m$a r1 = new nc.m$a
            r2 = r19
            r1.<init>()
            r2.f11769t0 = r1
            r3 = -1
            r2.f11770u0 = r3
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
            android.widget.EditText r1 = r2.Z
            r1.setTag(r3)
            r1 = 0
            r1 = r18[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1.setTag(r3)
            r1 = 10
            r1 = r18[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11758i0 = r1
            r1.setTag(r3)
            r1 = 11
            r1 = r18[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2.f11759j0 = r1
            r1.setTag(r3)
            r1 = 2
            r4 = r18[r1]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.f11760k0 = r4
            r4.setTag(r3)
            r4 = 4
            r5 = r18[r4]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r2.f11761l0 = r5
            r5.setTag(r3)
            r5 = 6
            r5 = r18[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r2.f11762m0 = r5
            r5.setTag(r3)
            r5 = 8
            r5 = r18[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r2.f11763n0 = r5
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11750a0
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11751b0
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11752c0
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11753d0
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11754e0
            r5.setTag(r3)
            android.widget.TextView r5 = r2.f11755f0
            r5.setTag(r3)
            r3 = 2131296668(0x7f09019c, float:1.821126E38)
            r0.setTag(r3, r2)
            pc.a r0 = new pc.a
            r3 = 5
            r0.<init>(r2, r3)
            r2.f11764o0 = r0
            pc.a r0 = new pc.a
            r3 = 1
            r0.<init>(r2, r3)
            r2.f11765p0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r4)
            r2.f11766q0 = r0
            pc.a r0 = new pc.a
            r3 = 3
            r0.<init>(r2, r3)
            r2.f11767r0 = r0
            pc.a r0 = new pc.a
            r0.<init>(r2, r1)
            r2.f11768s0 = r0
            monitor-enter(r19)
            r0 = 8
            r2.f11770u0 = r0     // Catch:{ all -> 0x0164 }
            monitor-exit(r19)     // Catch:{ all -> 0x0164 }
            r19.u()
            return
        L_0x0164:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0164 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.m.<init>(androidx.databinding.d, android.view.View):void");
    }

    public final void b(int i8) {
        boolean z10 = false;
        if (i8 == 1) {
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel = this.f11756g0;
            if (claimCoinPlaceOutdoorViewModel != null) {
                z10 = true;
            }
            if (z10) {
                claimCoinPlaceOutdoorViewModel.h(this.Y.getResources().getString(R.string.street));
            }
        } else if (i8 == 2) {
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel2 = this.f11756g0;
            if (claimCoinPlaceOutdoorViewModel2 != null) {
                z10 = true;
            }
            if (z10) {
                claimCoinPlaceOutdoorViewModel2.h(this.X.getResources().getString(R.string.public_space));
            }
        } else if (i8 == 3) {
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel3 = this.f11756g0;
            if (claimCoinPlaceOutdoorViewModel3 != null) {
                z10 = true;
            }
            if (z10) {
                claimCoinPlaceOutdoorViewModel3.h(this.W.getResources().getString(R.string.park));
            }
        } else if (i8 == 4) {
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel4 = this.f11756g0;
            if (claimCoinPlaceOutdoorViewModel4 != null) {
                z10 = true;
            }
            if (z10) {
                claimCoinPlaceOutdoorViewModel4.h(this.V.getResources().getString(R.string.nature));
            }
        } else if (i8 == 5) {
            ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel5 = this.f11756g0;
            if (claimCoinPlaceOutdoorViewModel5 != null) {
                z10 = true;
            }
            if (z10) {
                claimCoinPlaceOutdoorViewModel5.h(this.U.getResources().getString(R.string.centric_spaces));
            }
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
            long r0 = r13.f11770u0     // Catch:{ all -> 0x012d }
            r2 = 0
            r13.f11770u0 = r2     // Catch:{ all -> 0x012d }
            monitor-exit(r13)     // Catch:{ all -> 0x012d }
            com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel r4 = r13.f11756g0
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
            kotlinx.coroutines.flow.y0 r5 = r4.f6932h
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
            kotlinx.coroutines.flow.y0 r4 = r4.f6931g
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
            if (r5 == 0) goto L_0x007e
            com.google.android.material.card.MaterialCardView r5 = r13.U
            pc.a r11 = r13.f11764o0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.V
            pc.a r11 = r13.f11766q0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.W
            pc.a r11 = r13.f11767r0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.X
            pc.a r11 = r13.f11768s0
            r5.setOnClickListener(r11)
            com.google.android.material.card.MaterialCardView r5 = r13.Y
            pc.a r11 = r13.f11765p0
            r5.setOnClickListener(r11)
            android.widget.EditText r5 = r13.Z
            nc.m$a r11 = r13.f11769t0
            m2.d.c(r5, r11)
        L_0x007e:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0088
            android.widget.EditText r5 = r13.Z
            m2.d.b(r5, r10)
        L_0x0088:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x012c
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11758i0
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131951707(0x7f13005b, float:1.9539836E38)
            java.lang.String r1 = r1.getString(r2)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11759j0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11760k0
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131952100(0x7f1301e4, float:1.9540633E38)
            java.lang.String r1 = r1.getString(r3)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11761l0
            android.content.res.Resources r1 = r0.getResources()
            r5 = 2131952055(0x7f1301b7, float:1.9540542E38)
            java.lang.String r1 = r1.getString(r5)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11762m0
            android.content.res.Resources r1 = r0.getResources()
            r6 = 2131952028(0x7f13019c, float:1.9540487E38)
            java.lang.String r1 = r1.getString(r6)
            androidx.fragment.app.z0.d(r0, r4, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f11763n0
            android.content.res.Resources r1 = r0.getResources()
            r7 = 2131951990(0x7f130176, float:1.954041E38)
            java.lang.String r1 = r1.getString(r7)
            androidx.fragment.app.z0.d(r0, r4, r1)
            android.widget.TextView r0 = r13.f11750a0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r2)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11751b0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r6)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11752c0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r7)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11753d0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r5)
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11754e0
            java.lang.String r1 = "Other"
            androidx.fragment.app.z0.g(r0, r4, r1)
            android.widget.TextView r0 = r13.f11755f0
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r1 = r1.getString(r3)
            androidx.fragment.app.z0.g(r0, r4, r1)
        L_0x012c:
            return
        L_0x012d:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x012d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.m.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11770u0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11770u0 |= 1;
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
                this.f11770u0 |= 2;
            }
            return true;
        }
    }

    public final void w(ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel) {
        this.f11756g0 = claimCoinPlaceOutdoorViewModel;
        synchronized (this) {
            this.f11770u0 |= 4;
        }
        j(4);
        u();
    }
}
