package tc;

import ag.g0;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel$verifyNickName$1", f = "CreateAccountViewModel.kt", l = {60}, m = "invokeSuspend")
public final class v extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateAccountViewModel f15606b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(CreateAccountViewModel createAccountViewModel, d<? super v> dVar) {
        super(2, dVar);
        this.f15606b = createAccountViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new v(this.f15606b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        e9.c.c(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "=====error "
            java.lang.String r1 = "====="
            kf.a r2 = kf.a.f10464a
            int r3 = r10.f15605a
            r4 = 2131952092(0x7f1301dc, float:1.9540617E38)
            r5 = 1
            com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel r6 = r10.f15606b
            if (r3 == 0) goto L_0x001e
            if (r3 != r5) goto L_0x0016
            cb.b.J(r11)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0073
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            cb.b.J(r11)
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r11 = r6.f6732n
            zd.g$c r3 = new zd.g$c
            r3.<init>()
            r11.k(r3)
            boolean r11 = zd.a.g(r6)
            if (r11 == 0) goto L_0x0142
            mc.a r11 = r6.f6726g     // Catch:{ Exception -> 0x0114 }
            com.quickkonnect.silencio.models.request.auth.VerifyNickNameRequestModel r3 = new com.quickkonnect.silencio.models.request.auth.VerifyNickNameRequestModel     // Catch:{ Exception -> 0x0114 }
            kotlinx.coroutines.flow.y0 r7 = r6.f6728i     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0114 }
            java.lang.CharSequence r7 = zf.n.Z0(r7)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0114 }
            kotlinx.coroutines.flow.y0 r8 = r6.f6729j     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0114 }
            java.lang.CharSequence r8 = zf.n.Z0(r8)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0114 }
            kotlinx.coroutines.flow.y0 r9 = r6.f6730k     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0114 }
            java.lang.CharSequence r9 = zf.n.Z0(r9)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0114 }
            r3.<init>(r7, r8, r9)     // Catch:{ Exception -> 0x0114 }
            r10.f15605a = r5     // Catch:{ Exception -> 0x0114 }
            lc.a r11 = r11.f11379a     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r11 = r11.p(r3, r10)     // Catch:{ Exception -> 0x0114 }
            if (r11 != r2) goto L_0x0073
            return r2
        L_0x0073:
            yg.b0 r11 = (yg.b0) r11     // Catch:{ Exception -> 0x0114 }
            boolean r2 = r11.a()     // Catch:{ Exception -> 0x0114 }
            jg.d0 r3 = r11.f17447c
            r5 = 0
            if (r2 == 0) goto L_0x009e
            bh.a$a r0 = bh.a.f3654a     // Catch:{ Exception -> 0x0114 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0114 }
            T r1 = r11.f17446b     // Catch:{ Exception -> 0x0114 }
            r2.append(r1)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0114 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0114 }
            r0.b(r1, r2)     // Catch:{ Exception -> 0x0114 }
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r0 = r6.f6732n     // Catch:{ Exception -> 0x0114 }
            zd.g r11 = r6.f(r11)     // Catch:{ Exception -> 0x0114 }
            r0.k(r11)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0155
        L_0x009e:
            jg.c0 r11 = r11.f17445a     // Catch:{ Exception -> 0x0114 }
            int r11 = r11.f10054d     // Catch:{ Exception -> 0x0114 }
            r1 = 400(0x190, float:5.6E-43)
            if (r11 != r1) goto L_0x011d
            bh.a$a r11 = bh.a.f3654a     // Catch:{ Exception -> 0x0114 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0114 }
            r1.append(r3)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0114 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0114 }
            r11.b(r0, r1)     // Catch:{ Exception -> 0x0114 }
            ab.j r0 = new ab.j     // Catch:{ Exception -> 0x0114 }
            r0.<init>()     // Catch:{ Exception -> 0x0114 }
            ab.i r0 = r0.a()     // Catch:{ Exception -> 0x0114 }
            sf.j.c(r3)     // Catch:{ Exception -> 0x0114 }
            wg.h r1 = r3.e()     // Catch:{ Exception -> 0x0114 }
            jg.t r2 = r3.d()     // Catch:{ all -> 0x0116 }
            r3 = 0
            if (r2 != 0) goto L_0x00d2
            r2 = r3
            goto L_0x00d8
        L_0x00d2:
            java.nio.charset.Charset r7 = zf.a.f17962b     // Catch:{ all -> 0x0116 }
            java.nio.charset.Charset r2 = r2.a(r7)     // Catch:{ all -> 0x0116 }
        L_0x00d8:
            if (r2 != 0) goto L_0x00dc
            java.nio.charset.Charset r2 = zf.a.f17962b     // Catch:{ all -> 0x0116 }
        L_0x00dc:
            java.nio.charset.Charset r2 = kg.b.s(r1, r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r1.P(r2)     // Catch:{ all -> 0x0116 }
            e9.c.c(r1, r3)     // Catch:{ Exception -> 0x0114 }
            java.lang.Class<com.quickkonnect.silencio.models.response.auth.NickNameResponse> r1 = com.quickkonnect.silencio.models.response.auth.NickNameResponse.class
            java.lang.Object r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x0114 }
            com.quickkonnect.silencio.models.response.auth.NickNameResponse r0 = (com.quickkonnect.silencio.models.response.auth.NickNameResponse) r0     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0114 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0114 }
            r11.b(r1, r2)     // Catch:{ Exception -> 0x0114 }
            com.quickkonnect.silencio.models.response.auth.NickNameSuggestion r11 = r0.getErrors()     // Catch:{ Exception -> 0x0114 }
            if (r11 == 0) goto L_0x0109
            java.lang.String r11 = r11.getSuggestion()     // Catch:{ Exception -> 0x0114 }
            if (r11 == 0) goto L_0x0109
            kotlinx.coroutines.flow.y0 r0 = r6.f6733o     // Catch:{ Exception -> 0x0114 }
            r0.setValue(r11)     // Catch:{ Exception -> 0x0114 }
        L_0x0109:
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r11 = r6.f6732n     // Catch:{ Exception -> 0x0114 }
            zd.g$a r0 = new zd.g$a     // Catch:{ Exception -> 0x0114 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0114 }
            r11.k(r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0155
        L_0x0114:
            r11 = move-exception
            goto L_0x012e
        L_0x0116:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            e9.c.c(r1, r11)     // Catch:{ Exception -> 0x0114 }
            throw r0     // Catch:{ Exception -> 0x0114 }
        L_0x011d:
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r11 = r6.f6732n     // Catch:{ Exception -> 0x0114 }
            zd.g$a r0 = new zd.g$a     // Catch:{ Exception -> 0x0114 }
            android.app.Application r1 = r6.f17942e     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = r1.getString(r4)     // Catch:{ Exception -> 0x0114 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0114 }
            r11.k(r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0155
        L_0x012e:
            r11.printStackTrace()
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r11 = r6.f6732n
            zd.g$a r0 = new zd.g$a
            android.app.Application r1 = r6.f17942e
            java.lang.String r1 = r1.getString(r4)
            r0.<init>(r1)
            r11.k(r0)
            goto L_0x0155
        L_0x0142:
            androidx.lifecycle.v<zd.g<com.quickkonnect.silencio.models.response.auth.NickNameResponse>> r11 = r6.f6732n
            zd.g$a r0 = new zd.g$a
            android.app.Application r1 = r6.f17942e
            r2 = 2131952001(0x7f130181, float:1.9540432E38)
            java.lang.String r1 = r1.getString(r2)
            r0.<init>(r1)
            r11.k(r0)
        L_0x0155:
            ff.m r11 = ff.m.f8717a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
