package yd;

import ag.g0;
import com.quickkonnect.silencio.models.response.tabs.EarningsModel;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import ff.m;
import jf.d;
import lf.i;
import rf.p;

@lf.e(c = "com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment$setObserver$1$2$1", f = "WalletFragment.kt", l = {115}, m = "invokeSuspend")
public final class e extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17347a;

    /* renamed from: b  reason: collision with root package name */
    public int f17348b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WalletFragment f17349c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ EarningsModel f17350d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(WalletFragment walletFragment, EarningsModel earningsModel, d<? super e> dVar) {
        super(2, dVar);
        this.f17349c = walletFragment;
        this.f17350d = earningsModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f17349c, this.f17350d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r9 = r9.getTotalWalletAmount();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f A[Catch:{ Exception -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r13.f17348b
            java.lang.String r2 = "format(format, *args)"
            r3 = 0
            r4 = 0
            java.lang.String r5 = "%,.2f"
            r6 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r6) goto L_0x0016
            int r1 = r13.f17347a
            cb.b.J(r14)     // Catch:{ Exception -> 0x0094 }
            r14 = r13
            goto L_0x006c
        L_0x0016:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001e:
            cb.b.J(r14)
            com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment r14 = r13.f17349c     // Catch:{ Exception -> 0x0094 }
            boolean r14 = r14.E0     // Catch:{ Exception -> 0x0094 }
            if (r14 == 0) goto L_0x006f
            r14 = 10
            r1 = r14
            r14 = r13
        L_0x002b:
            if (r1 <= 0) goto L_0x0070
            com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment r7 = r14.f17349c     // Catch:{ Exception -> 0x0094 }
            nc.i1 r7 = r7.A0     // Catch:{ Exception -> 0x0094 }
            sf.j.c(r7)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r7 = r7.V     // Catch:{ Exception -> 0x0094 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0094 }
            com.quickkonnect.silencio.models.response.tabs.EarningsModel r9 = r14.f17350d     // Catch:{ Exception -> 0x0094 }
            if (r9 == 0) goto L_0x004e
            java.lang.Double r9 = r9.getTotalWalletAmount()     // Catch:{ Exception -> 0x0094 }
            if (r9 == 0) goto L_0x004e
            double r9 = r9.doubleValue()     // Catch:{ Exception -> 0x0094 }
            double r11 = (double) r1     // Catch:{ Exception -> 0x0094 }
            double r9 = r9 / r11
            java.lang.Double r11 = new java.lang.Double     // Catch:{ Exception -> 0x0094 }
            r11.<init>(r9)     // Catch:{ Exception -> 0x0094 }
            goto L_0x004f
        L_0x004e:
            r11 = r3
        L_0x004f:
            r8[r4] = r11     // Catch:{ Exception -> 0x0094 }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = java.lang.String.format(r5, r8)     // Catch:{ Exception -> 0x0094 }
            sf.j.e(r8, r2)     // Catch:{ Exception -> 0x0094 }
            r7.setText(r8)     // Catch:{ Exception -> 0x0094 }
            r14.f17347a = r1     // Catch:{ Exception -> 0x0094 }
            r14.f17348b = r6     // Catch:{ Exception -> 0x0094 }
            r7 = 100
            java.lang.Object r7 = cb.d.x(r7, r14)     // Catch:{ Exception -> 0x0094 }
            if (r7 != r0) goto L_0x006c
            return r0
        L_0x006c:
            int r1 = r1 + -1
            goto L_0x002b
        L_0x006f:
            r14 = r13
        L_0x0070:
            com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment r0 = r14.f17349c     // Catch:{ Exception -> 0x0094 }
            nc.i1 r0 = r0.A0     // Catch:{ Exception -> 0x0094 }
            sf.j.c(r0)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r0 = r0.V     // Catch:{ Exception -> 0x0094 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0094 }
            com.quickkonnect.silencio.models.response.tabs.EarningsModel r14 = r14.f17350d     // Catch:{ Exception -> 0x0094 }
            if (r14 == 0) goto L_0x0083
            java.lang.Double r3 = r14.getTotalWalletAmount()     // Catch:{ Exception -> 0x0094 }
        L_0x0083:
            r1[r4] = r3     // Catch:{ Exception -> 0x0094 }
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r14 = java.lang.String.format(r5, r14)     // Catch:{ Exception -> 0x0094 }
            sf.j.e(r14, r2)     // Catch:{ Exception -> 0x0094 }
            r0.setText(r14)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r14 = move-exception
            r14.printStackTrace()
        L_0x0098:
            ff.m r14 = ff.m.f8717a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
