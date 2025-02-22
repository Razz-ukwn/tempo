package nc;

import android.util.SparseIntArray;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import m2.d;

public final class f1 extends e1 {

    /* renamed from: p0  reason: collision with root package name */
    public static final SparseIntArray f11688p0;

    /* renamed from: m0  reason: collision with root package name */
    public final a f11689m0 = new a();

    /* renamed from: n0  reason: collision with root package name */
    public final b f11690n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    public long f11691o0 = -1;

    public class a implements f {
        public a() {
        }

        public final void a() {
            f1 f1Var = f1.this;
            String a10 = d.a(f1Var.X);
            ProfileViewModel profileViewModel = f1Var.f11673k0;
            boolean z10 = true;
            if (profileViewModel != null) {
                y0 y0Var = profileViewModel.f7092j;
                if (y0Var == null) {
                    z10 = false;
                }
                if (z10) {
                    y0Var.setValue(a10);
                }
            }
        }
    }

    public class b implements f {
        public b() {
        }

        public final void a() {
            f1 f1Var = f1.this;
            String a10 = d.a(f1Var.Y);
            ProfileViewModel profileViewModel = f1Var.f11673k0;
            boolean z10 = true;
            if (profileViewModel != null) {
                y0 y0Var = profileViewModel.f7093k;
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
        f11688p0 = sparseIntArray;
        sparseIntArray.put(R.id.guidelineTopStatus, 7);
        sparseIntArray.put(R.id.cl_main, 8);
        sparseIntArray.put(R.id.guidelineTop, 9);
        sparseIntArray.put(R.id.card_profile_back, 10);
        sparseIntArray.put(R.id.imageView2, 11);
        sparseIntArray.put(R.id.textView57, 12);
        sparseIntArray.put(R.id.textView58, 13);
        sparseIntArray.put(R.id.textView59, 14);
        sparseIntArray.put(R.id.tv_profile_phone_number, 15);
        sparseIntArray.put(R.id.et_profile_phone_number, 16);
        sparseIntArray.put(R.id.tv_profile_email, 17);
        sparseIntArray.put(R.id.et_profile_email, 18);
        sparseIntArray.put(R.id.btn_edit_profile_img, 19);
        sparseIntArray.put(R.id.btn_edit_profile_save, 20);
        sparseIntArray.put(R.id.tv_profile_change_password, 21);
        sparseIntArray.put(R.id.tv_profile_delete_account, 22);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f1(androidx.databinding.d r23, android.view.View r24) {
        /*
            r22 = this;
            r15 = r22
            r0 = r24
            r1 = r22
            r2 = r23
            r3 = r24
            android.util.SparseIntArray r4 = f11688p0
            r5 = 23
            java.lang.Object[] r21 = androidx.databinding.ViewDataBinding.r(r0, r5, r4)
            r4 = 19
            r4 = r21[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 20
            r5 = r21[r5]
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r6 = 10
            r6 = r21[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r7 = 8
            r7 = r21[r7]
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r8 = 18
            r8 = r21[r8]
            android.widget.EditText r8 = (android.widget.EditText) r8
            r9 = 5
            r9 = r21[r9]
            android.widget.EditText r9 = (android.widget.EditText) r9
            r10 = 6
            r10 = r21[r10]
            android.widget.EditText r10 = (android.widget.EditText) r10
            r11 = 16
            r11 = r21[r11]
            android.widget.EditText r11 = (android.widget.EditText) r11
            r12 = 4
            r12 = r21[r12]
            android.widget.EditText r12 = (android.widget.EditText) r12
            r13 = 9
            r13 = r21[r13]
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            r13 = 7
            r13 = r21[r13]
            androidx.constraintlayout.widget.Guideline r13 = (androidx.constraintlayout.widget.Guideline) r13
            r14 = 11
            r14 = r21[r14]
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r14 = 3
            r14 = r21[r14]
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r16 = 12
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 13
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 14
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r16 = 21
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 22
            r16 = r21[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r17 = 17
            r17 = r21[r17]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r18 = 1
            r18 = r21[r18]
            android.widget.TextView r18 = (android.widget.TextView) r18
            r19 = 2
            r19 = r21[r19]
            android.widget.TextView r19 = (android.widget.TextView) r19
            r20 = 15
            r20 = r21[r20]
            android.widget.TextView r20 = (android.widget.TextView) r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            nc.f1$a r1 = new nc.f1$a
            r2 = r22
            r1.<init>()
            r2.f11689m0 = r1
            nc.f1$b r1 = new nc.f1$b
            r1.<init>()
            r2.f11690n0 = r1
            r3 = -1
            r2.f11691o0 = r3
            android.widget.EditText r1 = r2.X
            r3 = 0
            r1.setTag(r3)
            android.widget.EditText r1 = r2.Y
            r1.setTag(r3)
            android.widget.EditText r1 = r2.f11663a0
            r1.setTag(r3)
            android.widget.ImageView r1 = r2.f11665c0
            r1.setTag(r3)
            r1 = 0
            r1 = r21[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r3)
            android.widget.TextView r1 = r2.f11669g0
            r1.setTag(r3)
            android.widget.TextView r1 = r2.f11670h0
            r1.setTag(r3)
            r1 = 2131296668(0x7f09019c, float:1.821126E38)
            r0.setTag(r1, r2)
            monitor-enter(r22)
            r0 = 16
            r2.f11691o0 = r0     // Catch:{ all -> 0x00e1 }
            monitor-exit(r22)     // Catch:{ all -> 0x00e1 }
            r22.u()
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x00e1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f1.<init>(androidx.databinding.d, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f11691o0     // Catch:{ all -> 0x0110 }
            r4 = 0
            r1.f11691o0 = r4     // Catch:{ all -> 0x0110 }
            monitor-exit(r19)     // Catch:{ all -> 0x0110 }
            com.quickkonnect.silencio.models.response.auth.UserModel r0 = r1.f11672j0
            com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel r6 = r1.f11673k0
            r7 = 20
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x0028
            java.lang.String r8 = r0.getProfileImg()
            java.lang.String r9 = r0.getFirstName()
            java.lang.String r10 = r0.getLastName()
            java.lang.String r0 = r0.getNickName()
            goto L_0x002c
        L_0x0028:
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r9 = 32
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = h4.a.c(r9, r10)
            goto L_0x0045
        L_0x0042:
            r0 = 0
            r8 = 0
            r9 = 0
        L_0x0045:
            r10 = 27
            long r10 = r10 & r2
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 0
            r12 = 1
            r13 = 25
            r15 = 26
            if (r10 == 0) goto L_0x0085
            long r17 = r2 & r13
            int r10 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x005d
            kotlinx.coroutines.flow.y0 r10 = r6.f7093k
            goto L_0x005e
        L_0x005d:
            r10 = 0
        L_0x005e:
            androidx.databinding.i.a(r1, r11, r10)
            if (r10 == 0) goto L_0x006a
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x006b
        L_0x006a:
            r10 = 0
        L_0x006b:
            long r17 = r2 & r15
            int r17 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0083
            if (r6 == 0) goto L_0x0076
            kotlinx.coroutines.flow.y0 r6 = r6.f7092j
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            androidx.databinding.i.a(r1, r12, r6)
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0087
        L_0x0083:
            r6 = 0
            goto L_0x0087
        L_0x0085:
            r6 = 0
            r10 = 0
        L_0x0087:
            long r15 = r15 & r2
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0091
            android.widget.EditText r15 = r1.X
            m2.d.b(r15, r6)
        L_0x0091:
            r15 = 16
            long r15 = r15 & r2
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00a6
            android.widget.EditText r6 = r1.X
            nc.f1$a r15 = r1.f11689m0
            m2.d.c(r6, r15)
            android.widget.EditText r6 = r1.Y
            nc.f1$b r15 = r1.f11690n0
            m2.d.c(r6, r15)
        L_0x00a6:
            long r2 = r2 & r13
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00b0
            android.widget.EditText r2 = r1.Y
            m2.d.b(r2, r10)
        L_0x00b0:
            if (r7 == 0) goto L_0x010f
            android.widget.EditText r2 = r1.f11663a0
            m2.d.b(r2, r0)
            android.widget.ImageView r2 = r1.f11665c0
            java.lang.String r3 = "imageView"
            sf.j.f(r2, r3)
            android.content.Context r3 = r2.getContext()
            x3.f r3 = cb.f.e(r3)
            h4.h$a r4 = new h4.h$a
            android.content.Context r5 = r2.getContext()
            r4.<init>(r5)
            r4.f9171c = r8
            r4.c(r2)
            k4.b[] r2 = new k4.b[r12]
            k4.a r5 = new k4.a
            r5.<init>()
            r2[r11] = r5
            java.util.List r2 = gf.l.f0(r2)
            java.util.List r2 = e9.c.n(r2)
            r4.m = r2
            r4.b(r12)
            r2 = 2131165825(0x7f070281, float:1.7945878E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.D = r5
            r5 = 0
            r4.E = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.F = r2
            r4.G = r5
            h4.h r2 = r4.a()
            r3.a(r2)
            android.widget.TextView r2 = r1.f11669g0
            m2.d.b(r2, r9)
            android.widget.TextView r2 = r1.f11670h0
            m2.d.b(r2, r0)
        L_0x010f:
            return
        L_0x0110:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0110 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f1.n():void");
    }

    public final boolean o() {
        synchronized (this) {
            return this.f11691o0 != 0;
        }
    }

    public final boolean s(Object obj, int i8, int i10) {
        if (i8 == 0) {
            k0 k0Var = (k0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f11691o0 |= 1;
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
                this.f11691o0 |= 2;
            }
            return true;
        }
    }

    public final void w(UserModel userModel) {
        this.f11672j0 = userModel;
        synchronized (this) {
            this.f11691o0 |= 4;
        }
        j(3);
        u();
    }

    public final void x(ProfileViewModel profileViewModel) {
        this.f11673k0 = profileViewModel;
        synchronized (this) {
            this.f11691o0 |= 8;
        }
        j(4);
        u();
    }
}
