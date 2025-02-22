package o0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public long f12046a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f12047b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f12048c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f12049d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f12050e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f12051f = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0152, code lost:
        if (r6 != 4) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o0.q a(android.view.MotionEvent r37, o0.v r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            java.lang.String r3 = "motionEvent"
            sf.j.f(r1, r3)
            java.lang.String r3 = "positionCalculator"
            sf.j.f(r2, r3)
            int r3 = r37.getActionMasked()
            android.util.SparseLongArray r4 = r0.f12047b
            android.util.SparseBooleanArray r5 = r0.f12048c
            r6 = 3
            if (r3 != r6) goto L_0x0023
            r4.clear()
            r5.clear()
            r1 = 0
            return r1
        L_0x0023:
            int r7 = r37.getPointerCount()
            r8 = 0
            r9 = 1
            if (r7 == r9) goto L_0x002c
            goto L_0x0046
        L_0x002c:
            int r7 = r1.getToolType(r8)
            int r10 = r37.getSource()
            int r11 = r0.f12050e
            if (r7 != r11) goto L_0x003c
            int r11 = r0.f12051f
            if (r10 == r11) goto L_0x0046
        L_0x003c:
            r0.f12050e = r7
            r0.f12051f = r10
            r5.clear()
            r4.clear()
        L_0x0046:
            int r7 = r37.getActionMasked()
            r10 = 9
            r11 = 1
            if (r7 == 0) goto L_0x006a
            r13 = 5
            if (r7 == r13) goto L_0x006a
            if (r7 == r10) goto L_0x0056
            goto L_0x0090
        L_0x0056:
            int r7 = r1.getPointerId(r8)
            int r13 = r4.indexOfKey(r7)
            if (r13 >= 0) goto L_0x0090
            long r13 = r0.f12046a
            long r8 = r13 + r11
            r0.f12046a = r8
            r4.put(r7, r13)
            goto L_0x0090
        L_0x006a:
            int r7 = r37.getActionIndex()
            int r8 = r1.getPointerId(r7)
            int r9 = r4.indexOfKey(r8)
            if (r9 >= 0) goto L_0x0090
            long r13 = r0.f12046a
            r16 = r7
            long r6 = r11 + r13
            r0.f12046a = r6
            r4.put(r8, r13)
            r6 = r16
            int r6 = r1.getToolType(r6)
            r7 = 3
            if (r6 != r7) goto L_0x0090
            r6 = 1
            r5.put(r8, r6)
        L_0x0090:
            r6 = 10
            if (r3 == r6) goto L_0x009c
            r7 = 7
            if (r3 == r7) goto L_0x009c
            if (r3 != r10) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r7 = 0
            goto L_0x009d
        L_0x009c:
            r7 = 1
        L_0x009d:
            r8 = 8
            if (r3 != r8) goto L_0x00a3
            r13 = 1
            goto L_0x00a4
        L_0x00a3:
            r13 = 0
        L_0x00a4:
            if (r7 == 0) goto L_0x00b3
            int r14 = r37.getActionIndex()
            int r14 = r1.getPointerId(r14)
            r9 = 1
            r5.put(r14, r9)
            goto L_0x00b4
        L_0x00b3:
            r9 = 1
        L_0x00b4:
            r14 = 6
            if (r3 == r9) goto L_0x00c0
            if (r3 == r14) goto L_0x00bb
            r3 = -1
            goto L_0x00c1
        L_0x00bb:
            int r3 = r37.getActionIndex()
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            java.util.ArrayList r9 = r0.f12049d
            r9.clear()
            int r15 = r37.getPointerCount()
            r14 = 0
        L_0x00cb:
            if (r14 >= r15) goto L_0x020b
            if (r7 != 0) goto L_0x00dc
            if (r14 == r3) goto L_0x00dc
            if (r13 == 0) goto L_0x00d9
            int r17 = r37.getButtonState()
            if (r17 == 0) goto L_0x00dc
        L_0x00d9:
            r27 = 1
            goto L_0x00de
        L_0x00dc:
            r27 = 0
        L_0x00de:
            int r10 = r1.getPointerId(r14)
            int r6 = r4.indexOfKey(r10)
            if (r6 < 0) goto L_0x00f3
            long r18 = r4.valueAt(r6)
            r35 = r7
            r34 = r9
            r19 = r18
            goto L_0x0102
        L_0x00f3:
            r34 = r9
            long r8 = r0.f12046a
            r35 = r7
            long r6 = r8 + r11
            r0.f12046a = r6
            r4.put(r10, r8)
            r19 = r8
        L_0x0102:
            float r28 = r1.getPressure(r14)
            float r6 = r1.getX(r14)
            float r7 = r1.getY(r14)
            long r6 = d2.f1.f(r6, r7)
            if (r14 != 0) goto L_0x0125
            float r6 = r37.getRawX()
            float r7 = r37.getRawY()
            long r6 = d2.f1.f(r6, r7)
            long r8 = r2.r(r6)
            goto L_0x0135
        L_0x0125:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x013a
            o0.g r6 = o0.g.f12052a
            long r6 = r6.a(r1, r14)
            long r8 = r2.r(r6)
        L_0x0135:
            r23 = r6
            r25 = r8
            goto L_0x0142
        L_0x013a:
            long r8 = r2.j(r6)
            r25 = r6
            r23 = r8
        L_0x0142:
            int r6 = r1.getToolType(r14)
            if (r6 == 0) goto L_0x015d
            r7 = 1
            if (r6 == r7) goto L_0x0159
            r7 = 2
            r8 = 3
            if (r6 == r7) goto L_0x0155
            if (r6 == r8) goto L_0x0156
            r7 = 4
            if (r6 == r7) goto L_0x0156
            goto L_0x015e
        L_0x0155:
            r7 = r8
        L_0x0156:
            r29 = r7
            goto L_0x0160
        L_0x0159:
            r8 = 3
            r29 = 1
            goto L_0x0160
        L_0x015d:
            r8 = 3
        L_0x015e:
            r29 = 0
        L_0x0160:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r37.getHistorySize()
            r9 = 0
        L_0x016a:
            if (r9 >= r7) goto L_0x01bc
            float r10 = r1.getHistoricalX(r14, r9)
            float r8 = r1.getHistoricalY(r14, r9)
            boolean r21 = java.lang.Float.isInfinite(r10)
            if (r21 != 0) goto L_0x0183
            boolean r21 = java.lang.Float.isNaN(r10)
            if (r21 != 0) goto L_0x0183
            r21 = 1
            goto L_0x0185
        L_0x0183:
            r21 = 0
        L_0x0185:
            if (r21 == 0) goto L_0x01ae
            boolean r21 = java.lang.Float.isInfinite(r8)
            if (r21 != 0) goto L_0x0196
            boolean r21 = java.lang.Float.isNaN(r8)
            if (r21 != 0) goto L_0x0196
            r21 = 1
            goto L_0x0198
        L_0x0196:
            r21 = 0
        L_0x0198:
            if (r21 == 0) goto L_0x01ae
            o0.d r11 = new o0.d
            r12 = r3
            long r2 = r1.getHistoricalEventTime(r9)
            r21 = r7
            long r7 = d2.f1.f(r10, r8)
            r11.<init>(r2, r7)
            r6.add(r11)
            goto L_0x01b1
        L_0x01ae:
            r12 = r3
            r21 = r7
        L_0x01b1:
            int r9 = r9 + 1
            r2 = r38
            r3 = r12
            r7 = r21
            r8 = 3
            r11 = 1
            goto L_0x016a
        L_0x01bc:
            r12 = r3
            int r2 = r37.getActionMasked()
            r3 = 8
            if (r2 != r3) goto L_0x01d9
            r2 = 10
            float r7 = r1.getAxisValue(r2)
            r8 = 9
            float r9 = r1.getAxisValue(r8)
            float r9 = -r9
            r10 = 0
            float r9 = r9 + r10
            long r9 = d2.f1.f(r7, r9)
            goto L_0x01df
        L_0x01d9:
            r2 = 10
            r8 = 9
            long r9 = h0.c.f9068b
        L_0x01df:
            r32 = r9
            int r7 = r1.getPointerId(r14)
            r9 = 0
            boolean r30 = r5.get(r7, r9)
            o0.r r9 = new o0.r
            long r21 = r37.getEventTime()
            r18 = r9
            r31 = r6
            r18.<init>(r19, r21, r23, r25, r27, r28, r29, r30, r31, r32)
            r6 = r34
            r6.add(r9)
            int r14 = r14 + 1
            r9 = r6
            r10 = r8
            r7 = r35
            r6 = r2
            r8 = r3
            r3 = r12
            r11 = 1
            r2 = r38
            goto L_0x00cb
        L_0x020b:
            r6 = r9
            int r2 = r37.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L_0x0218
            r3 = 6
            if (r2 == r3) goto L_0x0218
            r3 = 0
            goto L_0x022d
        L_0x0218:
            int r2 = r37.getActionIndex()
            int r2 = r1.getPointerId(r2)
            r3 = 0
            boolean r7 = r5.get(r2, r3)
            if (r7 != 0) goto L_0x022d
            r4.delete(r2)
            r5.delete(r2)
        L_0x022d:
            int r2 = r4.size()
            int r7 = r37.getPointerCount()
            if (r2 <= r7) goto L_0x0262
            int r2 = r4.size()
            r7 = 1
            int r2 = r2 - r7
            r8 = -1
        L_0x023e:
            if (r8 >= r2) goto L_0x0262
            int r9 = r4.keyAt(r2)
            int r10 = r37.getPointerCount()
            r11 = r3
        L_0x0249:
            if (r11 >= r10) goto L_0x0256
            int r12 = r1.getPointerId(r11)
            if (r12 != r9) goto L_0x0253
            r10 = r7
            goto L_0x0257
        L_0x0253:
            int r11 = r11 + 1
            goto L_0x0249
        L_0x0256:
            r10 = r3
        L_0x0257:
            if (r10 != 0) goto L_0x025f
            r4.removeAt(r2)
            r5.delete(r9)
        L_0x025f:
            int r2 = r2 + -1
            goto L_0x023e
        L_0x0262:
            o0.q r2 = new o0.q
            r37.getEventTime()
            r2.<init>(r6, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.f.a(android.view.MotionEvent, o0.v):o0.q");
    }
}
