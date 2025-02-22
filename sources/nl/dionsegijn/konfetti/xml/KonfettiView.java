package nl.dionsegijn.konfetti.xml;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import eg.d;
import java.util.ArrayList;
import java.util.List;
import sf.j;

public class KonfettiView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11995a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final a f11996b = new a();

    /* renamed from: c  reason: collision with root package name */
    public Rect f11997c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Paint f11998d = new Paint();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f11999a = -1;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final List<d> getActiveSystems() {
        return this.f11995a;
    }

    public final ig.a getOnParticleSystemUpdateListener() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: gg.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: gf.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            java.lang.String r2 = "canvas"
            sf.j.f(r1, r2)
            super.onDraw(r46)
            nl.dionsegijn.konfetti.xml.KonfettiView$a r2 = r0.f11996b
            long r3 = r2.f11999a
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x001c
            long r3 = java.lang.System.nanoTime()
            r2.f11999a = r3
        L_0x001c:
            long r3 = java.lang.System.nanoTime()
            long r7 = r2.f11999a
            long r7 = r3 - r7
            float r7 = (float) r7
            r8 = 1232348160(0x49742400, float:1000000.0)
            float r7 = r7 / r8
            r2.f11999a = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            float r3 = (float) r3
            float r7 = r7 / r3
            java.util.ArrayList r4 = r0.f11995a
            int r8 = r4.size()
            r9 = 1
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x0442
            r10 = r0
        L_0x003a:
            int r11 = r8 + -1
            java.lang.Object r12 = r4.get(r8)
            eg.d r12 = (eg.d) r12
            long r13 = r12.f8009b
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r13
            eg.b r13 = r12.f8008a
            int r14 = r13.f8005l
            long r5 = (long) r14
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            java.util.ArrayList r6 = r12.f8012e
            boolean r9 = r12.f8010c
            fg.d r12 = r12.f8011d
            if (r5 < 0) goto L_0x03f1
            android.graphics.Rect r5 = r10.f11997c
            java.lang.String r10 = "drawArea"
            sf.j.f(r5, r10)
            if (r9 == 0) goto L_0x023d
            r12.getClass()
            float r14 = r12.B
            float r14 = r14 + r7
            r12.B = r14
            fg.c r14 = r12.f8744b
            r15 = r11
            long r10 = r14.f8742a
            r21 = r2
            float r2 = (float) r10
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = r15
            float r15 = r2 / r22
            r22 = r4
            float r4 = r12.f8747e
            r20 = 0
            int r24 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r24 != 0) goto L_0x0084
            r24 = 1
            goto L_0x0086
        L_0x0084:
            r24 = 0
        L_0x0086:
            if (r24 == 0) goto L_0x008e
            int r24 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r24 <= 0) goto L_0x008e
            r12.B = r15
        L_0x008e:
            gf.s r15 = gf.s.f8978a
            r24 = r15
            float r15 = r12.B
            r25 = r8
            float r8 = r14.f8743b
            int r26 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r26 < 0) goto L_0x0225
            r18 = 0
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 != 0) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00a9
            r2 = 1
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            if (r2 != 0) goto L_0x0225
            float r15 = r15 / r8
            int r2 = (int) r15
            wf.f r4 = new wf.f
            r8 = 1
            r4.<init>(r8, r2)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r2 = gf.m.n0(r4)
            r15.<init>(r2)
            wf.e r2 = r4.iterator()
        L_0x00c1:
            boolean r4 = r2.f16719c
            if (r4 == 0) goto L_0x0216
            r2.nextInt()
            java.util.List<gg.b> r4 = r13.f7999f
            int r10 = r4.size()
            java.util.Random r11 = r12.f8746d
            int r10 = r11.nextInt(r10)
            java.lang.Object r4 = r4.get(r10)
            gg.b r4 = (gg.b) r4
            eg.e r10 = r13.f8004k
            eg.e$a r10 = r12.F(r10, r5)
            gg.c r8 = new gg.c
            r24 = r2
            float r2 = r10.f8013a
            float r10 = r10.f8014b
            r8.<init>(r2, r10)
            int r2 = r4.f8999a
            float r2 = (float) r2
            float r10 = r12.f8745c
            float r29 = r2 * r10
            float r2 = r11.nextFloat()
            float r10 = r4.f9001c
            float r2 = r2 * r10
            float r4 = r4.f9000b
            float r2 = r2 * r4
            float r30 = r2 + r4
            java.util.List<gg.a> r2 = r13.f8001h
            int r4 = r2.size()
            int r4 = r11.nextInt(r4)
            java.lang.Object r2 = r2.get(r4)
            gg.a r2 = (gg.a) r2
            boolean r4 = r2 instanceof gg.a.b
            if (r4 == 0) goto L_0x013c
            gg.a$b r2 = (gg.a.b) r2
            android.graphics.drawable.Drawable r4 = r2.f8992a
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            if (r4 != 0) goto L_0x011d
            goto L_0x0123
        L_0x011d:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()
            if (r4 != 0) goto L_0x0125
        L_0x0123:
            r4 = 0
            goto L_0x0129
        L_0x0125:
            android.graphics.drawable.Drawable r4 = r4.mutate()
        L_0x0129:
            if (r4 != 0) goto L_0x012d
            android.graphics.drawable.Drawable r4 = r2.f8992a
        L_0x012d:
            java.lang.String r10 = "shape.drawable.constantS…utate() ?: shape.drawable"
            sf.j.e(r4, r10)
            gg.a$b r10 = new gg.a$b
            boolean r2 = r2.f8993b
            r10.<init>(r4, r2)
            r31 = r10
            goto L_0x013e
        L_0x013c:
            r31 = r2
        L_0x013e:
            java.util.List<java.lang.Integer> r2 = r13.f8000g
            int r4 = r2.size()
            int r4 = r11.nextInt(r4)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r28 = r2.intValue()
            r2 = r9
            long r9 = r13.f8002i
            boolean r4 = r13.f8003j
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            r40 = r2
            float r2 = r13.f7997d
            int r26 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r26 != 0) goto L_0x0164
            r26 = 1
            goto L_0x0166
        L_0x0164:
            r26 = 0
        L_0x0166:
            float r1 = r13.f7996c
            if (r26 == 0) goto L_0x016b
            goto L_0x0174
        L_0x016b:
            float r2 = r2 - r1
            float r26 = r11.nextFloat()
            float r26 = r26 * r2
            float r1 = r26 + r1
        L_0x0174:
            int r2 = r13.f7995b
            int r0 = r13.f7994a
            if (r2 != 0) goto L_0x0181
            r42 = r5
            r41 = r6
            double r5 = (double) r0
            r0 = r3
            goto L_0x0196
        L_0x0181:
            r42 = r5
            r41 = r6
            int r2 = r2 / 2
            int r5 = r0 - r2
            int r2 = r2 + r0
            int r2 = r2 - r5
            r0 = r3
            double r2 = (double) r2
            double r26 = r11.nextDouble()
            double r26 = r26 * r2
            double r2 = (double) r5
            double r5 = r2 + r26
        L_0x0196:
            double r2 = java.lang.Math.toRadians(r5)
            double r5 = java.lang.Math.cos(r2)
            float r5 = (float) r5
            float r5 = r5 * r1
            double r2 = java.lang.Math.sin(r2)
            float r2 = (float) r2
            float r1 = r1 * r2
            gg.c r2 = new gg.c
            r2.<init>(r5, r1)
            float r1 = r13.f7998e
            eg.f r3 = r13.m
            boolean r5 = r3.f8017a
            r6 = 1073741824(0x40000000, float:2.0)
            if (r5 != 0) goto L_0x01b9
            r43 = r13
            r5 = 0
            goto L_0x01cc
        L_0x01b9:
            float r5 = r11.nextFloat()
            float r5 = r5 * r6
            r17 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r17
            float r6 = r3.f8019c
            r43 = r13
            float r13 = r3.f8018b
            float r6 = r6 * r13
            float r6 = r6 * r5
            float r5 = r6 + r13
        L_0x01cc:
            float r6 = r3.f8020d
            float r38 = r5 * r6
            boolean r5 = r3.f8017a
            if (r5 != 0) goto L_0x01d6
            r5 = 0
            goto L_0x01e8
        L_0x01d6:
            float r5 = r11.nextFloat()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r6 = r3.f8019c
            float r11 = r3.f8018b
            float r6 = r6 * r11
            float r6 = r6 * r5
            float r5 = r6 + r11
        L_0x01e8:
            float r3 = r3.f8021e
            float r37 = r5 * r3
            float r3 = r12.f8745c
            fg.a r5 = new fg.a
            r26 = r5
            r27 = r8
            r32 = r9
            r34 = r4
            r35 = r2
            r36 = r1
            r39 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39)
            r15.add(r5)
            r8 = 1
            r1 = r46
            r3 = r0
            r2 = r24
            r9 = r40
            r6 = r41
            r5 = r42
            r13 = r43
            r0 = r45
            goto L_0x00c1
        L_0x0216:
            r0 = r3
            r42 = r5
            r41 = r6
            r40 = r9
            float r1 = r12.B
            float r2 = r14.f8743b
            float r1 = r1 % r2
            r12.B = r1
            goto L_0x022e
        L_0x0225:
            r0 = r3
            r42 = r5
            r41 = r6
            r40 = r9
            r15 = r24
        L_0x022e:
            float r1 = r12.f8747e
            float r3 = r0 * r7
            float r3 = r3 + r1
            r12.f8747e = r3
            java.util.Collection r15 = (java.util.Collection) r15
            r1 = r41
            r1.addAll(r15)
            goto L_0x024b
        L_0x023d:
            r21 = r2
            r0 = r3
            r22 = r4
            r42 = r5
            r1 = r6
            r25 = r8
            r40 = r9
            r23 = r11
        L_0x024b:
            java.util.Iterator r2 = r1.iterator()
        L_0x024f:
            boolean r3 = r2.hasNext()
            r4 = 2
            if (r3 == 0) goto L_0x0334
            java.lang.Object r3 = r2.next()
            fg.a r3 = (fg.a) r3
            r3.getClass()
            gg.c r5 = r3.f8735q
            java.lang.String r6 = "force"
            sf.j.f(r5, r6)
            float r6 = r3.f8723d
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 / r6
            gg.c r6 = r3.f8727h
            r6.getClass()
            float r8 = r6.f9002a
            float r9 = r5.f9002a
            float r9 = r9 * r10
            float r9 = r9 + r8
            r6.f9002a = r9
            float r8 = r6.f9003b
            float r5 = r5.f9003b
            float r5 = r5 * r10
            float r5 = r5 + r8
            r6.f9003b = r5
            gg.c r5 = r3.f8720a
            float r8 = r5.f9003b
            int r9 = r42.height()
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0292
            r8 = 0
            r3.f8736r = r8
            goto L_0x024f
        L_0x0292:
            r8 = 0
            gg.c r9 = r3.f8728i
            r9.getClass()
            float r10 = r9.f9002a
            float r11 = r6.f9002a
            float r10 = r10 + r11
            float r11 = r9.f9003b
            float r6 = r6.f9003b
            float r11 = r11 + r6
            float r6 = r3.f8729j
            float r10 = r10 * r6
            r9.f9002a = r10
            float r11 = r11 * r6
            r9.f9003b = r11
            float r6 = r3.f8734p
            float r10 = r7 * r6
            float r11 = r3.m
            float r10 = r10 * r11
            float r11 = r5.f9002a
            float r13 = r9.f9002a
            float r13 = r13 * r10
            float r13 = r13 + r11
            r5.f9002a = r13
            float r11 = r5.f9003b
            float r9 = r9.f9003b
            float r9 = r9 * r10
            float r9 = r9 + r11
            r5.f9003b = r9
            long r9 = r3.f8725f
            float r11 = r0 * r7
            long r13 = (long) r11
            long r9 = r9 - r13
            r3.f8725f = r9
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x02e0
            boolean r9 = r3.f8726g
            if (r9 == 0) goto L_0x02dd
            r9 = 5
            float r9 = (float) r9
            float r9 = r9 * r7
            float r9 = r9 * r6
            int r10 = r3.f8736r
            int r9 = (int) r9
            int r10 = r10 - r9
            if (r10 >= 0) goto L_0x02de
        L_0x02dd:
            r10 = r8
        L_0x02de:
            r3.f8736r = r10
        L_0x02e0:
            float r9 = r3.f8732n
            float r10 = r3.f8731l
            float r10 = r10 * r7
            float r10 = r10 * r6
            float r10 = r10 + r9
            r3.f8732n = r10
            r9 = 1135869952(0x43b40000, float:360.0)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x02f3
            r9 = 0
            r3.f8732n = r9
            goto L_0x02f4
        L_0x02f3:
            r9 = 0
        L_0x02f4:
            float r10 = r3.f8733o
            float r11 = r3.f8730k
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 * r7
            float r11 = r11 * r6
            float r10 = r10 - r11
            r3.f8733o = r10
            int r6 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            float r10 = r3.f8722c
            if (r6 >= 0) goto L_0x0309
            r3.f8733o = r10
        L_0x0309:
            float r6 = r3.f8733o
            float r6 = r6 / r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            float r4 = (float) r4
            float r6 = r6 * r4
            r3.f8737s = r6
            int r4 = r3.f8736r
            int r4 = r4 << 24
            int r6 = r3.f8721b
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r10
            r4 = r4 | r6
            r3.f8738t = r4
            float r4 = r5.f9002a
            int r4 = (int) r4
            float r5 = r5.f9003b
            int r5 = (int) r5
            r6 = r42
            boolean r4 = r6.contains(r4, r5)
            r3.f8739u = r4
            goto L_0x024f
        L_0x0334:
            r8 = 0
            eg.c r2 = eg.c.f8007a
            gf.o.r0(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x0343:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0358
            java.lang.Object r5 = r3.next()
            r6 = r5
            fg.a r6 = (fg.a) r6
            boolean r6 = r6.f8739u
            if (r6 == 0) goto L_0x0343
            r2.add(r5)
            goto L_0x0343
        L_0x0358:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = gf.m.n0(r2)
            r3.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0365:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03a6
            java.lang.Object r5 = r2.next()
            fg.a r5 = (fg.a) r5
            java.lang.String r6 = "<this>"
            sf.j.f(r5, r6)
            eg.a r6 = new eg.a
            gg.c r9 = r5.f8720a
            float r10 = r9.f9002a
            float r9 = r9.f9003b
            float r11 = r5.f8722c
            int r13 = r5.f8738t
            float r14 = r5.f8732n
            float r15 = r5.f8737s
            gg.a r8 = r5.f8724e
            int r5 = r5.f8736r
            r26 = r6
            r27 = r10
            r28 = r9
            r29 = r11
            r30 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r8
            r35 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r3.add(r6)
            r8 = 0
            goto L_0x0365
        L_0x03a6:
            java.util.Iterator r2 = r3.iterator()
        L_0x03aa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03eb
            java.lang.Object r3 = r2.next()
            eg.a r3 = (eg.a) r3
            r5 = r45
            android.graphics.Paint r6 = r5.f11998d
            int r8 = r3.f7989e
            r6.setColor(r8)
            float r8 = r3.f7991g
            float r9 = r3.f7987c
            float r10 = r8 * r9
            float r11 = (float) r4
            float r10 = r10 / r11
            int r13 = r46.save()
            float r14 = r3.f7985a
            float r14 = r14 - r10
            float r15 = r3.f7986b
            r4 = r46
            r4.translate(r14, r15)
            float r11 = r9 / r11
            float r14 = r3.f7990f
            r4.rotate(r14, r10, r11)
            r10 = 1065353216(0x3f800000, float:1.0)
            r4.scale(r8, r10)
            gg.a r3 = r3.f7992h
            hg.a.a(r3, r4, r6, r9)
            r4.restoreToCount(r13)
            r4 = 2
            goto L_0x03aa
        L_0x03eb:
            r5 = r45
            r4 = r46
            r10 = r5
            goto L_0x03ff
        L_0x03f1:
            r5 = r0
            r21 = r2
            r0 = r3
            r22 = r4
            r25 = r8
            r40 = r9
            r23 = r11
            r4 = r1
            r1 = r6
        L_0x03ff:
            fg.c r2 = r12.f8744b
            long r2 = r2.f8742a
            r8 = 0
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0412
            float r6 = r12.f8747e
            float r2 = (float) r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0412
            r2 = 1
            goto L_0x0413
        L_0x0412:
            r2 = 0
        L_0x0413:
            if (r2 == 0) goto L_0x041b
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0423
        L_0x041b:
            if (r40 != 0) goto L_0x0425
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0425
        L_0x0423:
            r9 = 1
            goto L_0x0426
        L_0x0425:
            r9 = 0
        L_0x0426:
            r1 = r22
            if (r9 == 0) goto L_0x042f
            r8 = r25
            r1.remove(r8)
        L_0x042f:
            if (r23 >= 0) goto L_0x0432
            goto L_0x0446
        L_0x0432:
            r3 = r0
            r0 = r5
            r2 = r21
            r8 = r23
            r5 = -1
            r9 = 1
            r44 = r4
            r4 = r1
            r1 = r44
            goto L_0x003a
        L_0x0442:
            r5 = r0
            r21 = r2
            r1 = r4
        L_0x0446:
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0450
            r45.invalidate()
            goto L_0x0456
        L_0x0450:
            r0 = r21
            r1 = -1
            r0.f11999a = r1
        L_0x0456:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.dionsegijn.konfetti.xml.KonfettiView.onDraw(android.graphics.Canvas):void");
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        this.f11997c = new Rect(0, 0, i8, i10);
    }

    public final void onVisibilityChanged(View view, int i8) {
        j.f(view, "changedView");
        super.onVisibilityChanged(view, i8);
        this.f11996b.f11999a = -1;
    }

    public final void setOnParticleSystemUpdateListener(ig.a aVar) {
    }
}
