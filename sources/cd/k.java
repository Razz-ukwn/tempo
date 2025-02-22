package cd;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet$setObservers$3", f = "RegisterBottomSheet.kt", l = {201}, m = "invokeSuspend")
public final class k extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3980a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3981b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegisterBottomSheet f3982a;

        public a(RegisterBottomSheet registerBottomSheet) {
            this.f3982a = registerBottomSheet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
            r5 = r5.getResult();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r22, jf.d r23) {
            /*
                r21 = this;
                r0 = r22
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00b6
                r0 = r21
                com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet r1 = r0.f3982a
                androidx.appcompat.app.b r2 = r1.V0
                r3 = 0
                if (r2 == 0) goto L_0x00b0
                r2.dismiss()
                q6.a r2 = r1.T0
                if (r2 == 0) goto L_0x00aa
                r2.e()
                java.lang.String r2 = "FIRE_BASE_TOKEN"
                java.lang.String r16 = zd.h.a(r2)
                b3.m r2 = ag.m.c(r1)
                cd.p r4 = r1.u0()
                com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel r4 = r4.f3989a
                com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r5 = r1.W0
                if (r5 == 0) goto L_0x003d
                java.lang.Object r5 = r5.getResult()
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
                if (r5 == 0) goto L_0x003d
                java.lang.String r5 = r5.G
                r6 = r5
                goto L_0x003e
            L_0x003d:
                r6 = r3
            L_0x003e:
                com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r5 = r1.W0
                if (r5 == 0) goto L_0x004c
                java.lang.Object r5 = r5.getResult()
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
                if (r5 == 0) goto L_0x004c
                java.lang.String r3 = r5.H
            L_0x004c:
                r7 = r3
                com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = r1.W0
                java.lang.String r20 = ""
                if (r3 == 0) goto L_0x0075
                java.lang.Object r3 = r3.getResult()
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
                if (r3 == 0) goto L_0x0075
                java.lang.String r3 = r3.f4150d
                if (r3 == 0) goto L_0x0075
                java.lang.String r5 = "@"
                java.lang.String[] r5 = new java.lang.String[]{r5}
                java.util.List r3 = zf.n.S0(r3, r5)
                r5 = 0
                java.lang.Object r3 = r3.get(r5)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                r8 = r3
                goto L_0x0077
            L_0x0075:
                r8 = r20
            L_0x0077:
                r5 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r14 = "google"
                r15 = 0
                r17 = 0
                r18 = 5617(0x15f1, float:7.871E-42)
                r19 = 0
                com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel r3 = com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = r1.W0
                if (r1 == 0) goto L_0x009a
                java.lang.Object r1 = r1.getResult()
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
                if (r1 == 0) goto L_0x009a
                java.lang.String r1 = r1.f4150d
                if (r1 != 0) goto L_0x009c
            L_0x009a:
                r1 = r20
            L_0x009c:
                java.lang.String r4 = "registerUser"
                sf.j.f(r3, r4)
                cd.q r4 = new cd.q
                r4.<init>(r3, r1)
                r2.n(r4)
                goto L_0x00b8
            L_0x00aa:
                java.lang.String r1 = "mGoogleSignInClient"
                sf.j.l(r1)
                throw r3
            L_0x00b0:
                java.lang.String r1 = "loadingAlert"
                sf.j.l(r1)
                throw r3
            L_0x00b6:
                r0 = r21
            L_0x00b8:
                ff.m r1 = ff.m.f8717a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.k.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(RegisterBottomSheet registerBottomSheet, d<? super k> dVar) {
        super(2, dVar);
        this.f3981b = registerBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f3981b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((k) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3980a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = RegisterBottomSheet.X0;
            RegisterBottomSheet registerBottomSheet = this.f3981b;
            y0 y0Var = registerBottomSheet.v0().f6866k;
            a aVar2 = new a(registerBottomSheet);
            this.f3980a = 1;
            if (y0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b.J(obj);
        }
        throw new r();
    }
}
