package qc;

import ag.g0;
import cg.q;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;
import sf.k;
import sf.s;

@e(c = "com.quickkonnect.silencio.service.measuring.DefaultRecordingClient$getDecibelUpdates$1", f = "DefaultRecordingClient.kt", l = {33, 49}, m = "invokeSuspend")
public final class c extends i implements p<q<? super Double>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f13486a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f13487b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f13488c;

    @e(c = "com.quickkonnect.silencio.service.measuring.DefaultRecordingClient$getDecibelUpdates$1$1$1", f = "DefaultRecordingClient.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f13489a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<Double> f13490b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s f13491c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q<? super Double> qVar, s sVar, d<? super a> dVar) {
            super(2, dVar);
            this.f13490b = qVar;
            this.f13491c = sVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f13490b, this.f13491c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f13489a;
            if (i8 == 0) {
                cb.b.J(obj);
                Double d10 = new Double((double) this.f13491c.f14954a);
                this.f13489a = 1;
                if (this.f13490b.t(d10, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13492a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.f13492a = dVar;
        }

        public final Object d() {
            d dVar = this.f13492a;
            dVar.f13494b = false;
            try {
                dVar.f13493a.stop();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, d<? super c> dVar2) {
        super(2, dVar2);
        this.f13488c = dVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f13488c, dVar);
        cVar.f13487b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((q) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            qc.d r0 = r13.f13488c
            kf.a r1 = kf.a.f10464a
            int r2 = r13.f13486a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0025
            if (r2 == r5) goto L_0x001c
            if (r2 != r4) goto L_0x0014
            cb.b.J(r14)
            goto L_0x0097
        L_0x0014:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001c:
            java.lang.Object r0 = r13.f13487b
            cg.q r0 = (cg.q) r0
            cb.b.J(r14)
            r14 = r13
            goto L_0x004b
        L_0x0025:
            cb.b.J(r14)
            java.lang.Object r14 = r13.f13487b
            cg.q r14 = (cg.q) r14
            android.media.MediaRecorder r2 = r0.f13493a     // Catch:{ Exception -> 0x009a }
            r2.prepare()     // Catch:{ Exception -> 0x009a }
            android.media.MediaRecorder r0 = r0.f13493a     // Catch:{ Exception -> 0x009a }
            r0.start()     // Catch:{ Exception -> 0x009a }
            r0 = r14
            r14 = r13
        L_0x0038:
            qc.d r2 = r14.f13488c
            boolean r6 = r2.f13494b
            if (r6 == 0) goto L_0x0087
            r14.f13487b = r0
            r14.f13486a = r5
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r2 = cb.d.x(r6, r14)
            if (r2 != r1) goto L_0x004b
            return r1
        L_0x004b:
            qc.d r2 = r14.f13488c
            android.media.MediaRecorder r2 = r2.f13493a
            int r2 = r2.getMaxAmplitude()
            sf.s r6 = new sf.s
            r6.<init>()
            r7 = 20
            double r7 = (double) r7
            double r9 = (double) r2
            r11 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r11 = java.lang.Math.log10(r11)
            double r9 = r9 / r11
            double r9 = java.lang.Math.log10(r9)
            double r9 = r9 * r7
            float r2 = (float) r9
            r6.f14954a = r2
            double r7 = (double) r2
            r9 = 4626322717216342016(0x4034000000000000, double:20.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x007c
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x007c
            r2 = 1101004800(0x41a00000, float:20.0)
            r6.f14954a = r2
        L_0x007c:
            qc.c$a r2 = new qc.c$a
            r2.<init>(r0, r6, r3)
            r6 = 3
            r7 = 0
            cb.b.D(r0, r3, r7, r2, r6)
            goto L_0x0038
        L_0x0087:
            qc.c$b r5 = new qc.c$b
            r5.<init>(r2)
            r14.f13487b = r3
            r14.f13486a = r4
            java.lang.Object r14 = cg.o.a(r0, r5, r14)
            if (r14 != r1) goto L_0x0097
            return r1
        L_0x0097:
            ff.m r14 = ff.m.f8717a
            return r14
        L_0x009a:
            r14 = move-exception
            qc.j r0 = new qc.j
            java.lang.String r14 = r14.getLocalizedMessage()
            if (r14 != 0) goto L_0x00a5
            java.lang.String r14 = "Something went wrong"
        L_0x00a5:
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
