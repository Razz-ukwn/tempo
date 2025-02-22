package cd;

import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import rf.l;
import sf.k;
import zd.g;

public final class j extends k implements l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3979a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(RegisterBottomSheet registerBottomSheet) {
        super(1);
        this.f3979a = registerBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r1 = r1.getResult();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r23
            zd.g r0 = (zd.g) r0
            boolean r1 = r0 instanceof zd.g.a
            r2 = 0
            java.lang.String r3 = "loadingAlert"
            r4 = r22
            com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet r5 = r4.f3979a
            if (r1 == 0) goto L_0x003b
            androidx.appcompat.app.b r1 = r5.V0
            if (r1 == 0) goto L_0x0037
            r1.dismiss()
            java.lang.String r7 = r0.f17949b
            if (r7 == 0) goto L_0x00ec
            android.content.Context r0 = r5.e0()
            r1 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r6 = r0.getString(r1)
            java.lang.String r0 = "getString(R.string.alert_title)"
            sf.j.e(r6, r0)
            java.lang.String r8 = "OK"
            r9 = 0
            r10 = 0
            cd.h r11 = cd.h.f3977a
            cd.i r12 = cd.i.f3978a
            zd.d.d(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00ec
        L_0x0037:
            sf.j.l(r3)
            throw r2
        L_0x003b:
            boolean r1 = r0 instanceof zd.g.b
            if (r1 != 0) goto L_0x00ec
            boolean r1 = r0 instanceof zd.g.c
            if (r1 != 0) goto L_0x00ec
            boolean r0 = r0 instanceof zd.g.d
            if (r0 == 0) goto L_0x00ec
            androidx.appcompat.app.b r0 = r5.V0
            if (r0 == 0) goto L_0x00e8
            r0.dismiss()
            q6.a r0 = r5.T0
            if (r0 == 0) goto L_0x00e2
            r0.e()
            java.lang.String r0 = "FIRE_BASE_TOKEN"
            java.lang.String r18 = zd.h.a(r0)
            b3.m r0 = ag.m.c(r5)
            cd.p r1 = r5.u0()
            com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel r6 = r1.f3989a
            com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = r5.W0
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r1.getResult()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = r1.G
            r8 = r1
            goto L_0x0076
        L_0x0075:
            r8 = r2
        L_0x0076:
            com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = r5.W0
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r1.getResult()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            if (r1 == 0) goto L_0x0084
            java.lang.String r2 = r1.H
        L_0x0084:
            r9 = r2
            com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = r5.W0
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r1 = r1.getResult()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = r1.f4150d
            if (r1 == 0) goto L_0x00ad
            java.lang.String r3 = "@"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r1 = zf.n.S0(r1, r3)
            r3 = 0
            java.lang.Object r1 = gf.q.x0(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r10 = r1
            goto L_0x00ae
        L_0x00ad:
            r10 = r2
        L_0x00ae:
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = "google"
            r17 = 0
            r19 = 0
            r20 = 5617(0x15f1, float:7.871E-42)
            r21 = 0
            com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel r1 = com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = r5.W0
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r3 = r3.getResult()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            if (r3 == 0) goto L_0x00d4
            java.lang.String r3 = r3.f4150d
            if (r3 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            java.lang.String r3 = "registerUser"
            sf.j.f(r1, r3)
            cd.q r3 = new cd.q
            r3.<init>(r1, r2)
            r0.n(r3)
            goto L_0x00ec
        L_0x00e2:
            java.lang.String r0 = "mGoogleSignInClient"
            sf.j.l(r0)
            throw r2
        L_0x00e8:
            sf.j.l(r3)
            throw r2
        L_0x00ec:
            ff.m r0 = ff.m.f8717a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.j.invoke(java.lang.Object):java.lang.Object");
    }
}
