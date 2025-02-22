package com.google.android.gms.internal.measurement;

import b3.w;

public final class f7 extends l {

    /* renamed from: b  reason: collision with root package name */
    public final w f5274b;

    public f7(w wVar) {
        this.f5274b = wVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        r4 = r5.f5274b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r3 == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r3 == 1) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r3 == 2) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r3 == 3) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r3 == 4) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3 == 5) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        return super.c(r17, r18, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        com.google.android.gms.internal.measurement.f4.h("setParamValue", 2, r2);
        r0 = r1.m((com.google.android.gms.internal.measurement.o) r2.get(0)).zzi();
        r1 = r1.m((com.google.android.gms.internal.measurement.o) r2.get(1));
        r3 = com.google.android.gms.internal.measurement.f4.f(r1);
        r2 = ((com.google.android.gms.internal.measurement.b) r4.f3198c).f5162c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        if (r3 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r2.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        r2.put(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        com.google.android.gms.internal.measurement.f4.h("setEventName", 1, r2);
        r0 = r1.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (com.google.android.gms.internal.measurement.o.f5428j.equals(r0) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (com.google.android.gms.internal.measurement.o.f5429k.equals(r0) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        ((com.google.android.gms.internal.measurement.b) r4.f3198c).f5160a = r0.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        return new com.google.android.gms.internal.measurement.s(r0.zzi());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        throw new java.lang.IllegalArgumentException("Illegal event name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        com.google.android.gms.internal.measurement.f4.h("getTimestamp", 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00eb, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) ((com.google.android.gms.internal.measurement.b) r4.f3198c).f5161b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        com.google.android.gms.internal.measurement.f4.h("getParams", 0, r2);
        r0 = ((com.google.android.gms.internal.measurement.b) r4.f3198c).f5162c;
        r1 = new com.google.android.gms.internal.measurement.l();
        r2 = r0.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0107, code lost:
        if (r2.hasNext() == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        r3 = (java.lang.String) r2.next();
        r1.b(r3, com.google.android.gms.internal.measurement.y4.b(r0.get(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        com.google.android.gms.internal.measurement.f4.h("getParamValue", 1, r2);
        r0 = r1.m((com.google.android.gms.internal.measurement.o) r2.get(0)).zzi();
        r1 = ((com.google.android.gms.internal.measurement.b) r4.f3198c).f5162c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        if (r1.containsKey(r0) == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013a, code lost:
        r0 = r1.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        return com.google.android.gms.internal.measurement.y4.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        com.google.android.gms.internal.measurement.f4.h("getEventName", 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        return new com.google.android.gms.internal.measurement.s(((com.google.android.gms.internal.measurement.b) r4.f3198c).f5160a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o c(java.lang.String r17, j1.c r18, java.util.ArrayList r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            switch(r3) {
                case 21624207: goto L_0x004e;
                case 45521504: goto L_0x0044;
                case 146575578: goto L_0x003a;
                case 700587132: goto L_0x0030;
                case 920706790: goto L_0x0028;
                case 1570616835: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0056
        L_0x001e:
            boolean r3 = r0.equals(r8)
            if (r3 == 0) goto L_0x0056
            r5 = r16
            r3 = r6
            goto L_0x0059
        L_0x0028:
            boolean r3 = r0.equals(r9)
            if (r3 == 0) goto L_0x0056
            r3 = 5
            goto L_0x0057
        L_0x0030:
            boolean r3 = r0.equals(r10)
            if (r3 == 0) goto L_0x0056
            r5 = r16
            r3 = r14
            goto L_0x0059
        L_0x003a:
            boolean r3 = r0.equals(r11)
            if (r3 == 0) goto L_0x0056
            r5 = r16
            r3 = r15
            goto L_0x0059
        L_0x0044:
            boolean r3 = r0.equals(r12)
            if (r3 == 0) goto L_0x0056
            r5 = r16
            r3 = r7
            goto L_0x0059
        L_0x004e:
            boolean r3 = r0.equals(r13)
            if (r3 == 0) goto L_0x0056
            r3 = 0
            goto L_0x0057
        L_0x0056:
            r3 = -1
        L_0x0057:
            r5 = r16
        L_0x0059:
            b3.w r4 = r5.f5274b
            if (r3 == 0) goto L_0x0145
            if (r3 == r15) goto L_0x011c
            if (r3 == r14) goto L_0x00ec
            if (r3 == r7) goto L_0x00d7
            if (r3 == r6) goto L_0x009d
            r6 = 5
            if (r3 == r6) goto L_0x006d
            com.google.android.gms.internal.measurement.o r0 = super.c(r17, r18, r19)
            return r0
        L_0x006d:
            com.google.android.gms.internal.measurement.f4.h(r9, r14, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r1.m(r0)
            java.lang.String r0 = r0.zzi()
            java.lang.Object r2 = r2.get(r15)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r1 = r1.m(r2)
            java.lang.Object r2 = r4.f3198c
            com.google.android.gms.internal.measurement.b r2 = (com.google.android.gms.internal.measurement.b) r2
            java.lang.Object r3 = com.google.android.gms.internal.measurement.f4.f(r1)
            java.util.HashMap r2 = r2.f5162c
            if (r3 != 0) goto L_0x0099
            r2.remove(r0)
            goto L_0x009c
        L_0x0099:
            r2.put(r0, r3)
        L_0x009c:
            return r1
        L_0x009d:
            com.google.android.gms.internal.measurement.f4.h(r8, r15, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r1.m(r0)
            com.google.android.gms.internal.measurement.t r1 = com.google.android.gms.internal.measurement.o.f5428j
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00cf
            com.google.android.gms.internal.measurement.m r1 = com.google.android.gms.internal.measurement.o.f5429k
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00cf
            java.lang.Object r1 = r4.f3198c
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.b) r1
            java.lang.String r2 = r0.zzi()
            r1.f5160a = r2
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.lang.String r0 = r0.zzi()
            r1.<init>(r0)
            return r1
        L_0x00cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal event name"
            r0.<init>(r1)
            throw r0
        L_0x00d7:
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r12, r0, r2)
            java.lang.Object r0 = r4.f3198c
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.b) r0
            com.google.android.gms.internal.measurement.h r1 = new com.google.android.gms.internal.measurement.h
            long r2 = r0.f5161b
            double r2 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            return r1
        L_0x00ec:
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r10, r0, r2)
            java.lang.Object r0 = r4.f3198c
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.b) r0
            java.util.HashMap r0 = r0.f5162c
            com.google.android.gms.internal.measurement.l r1 = new com.google.android.gms.internal.measurement.l
            r1.<init>()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0103:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.measurement.o r4 = com.google.android.gms.internal.measurement.y4.b(r4)
            r1.b(r3, r4)
            goto L_0x0103
        L_0x011b:
            return r1
        L_0x011c:
            com.google.android.gms.internal.measurement.f4.h(r11, r15, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r1.m(r0)
            java.lang.String r0 = r0.zzi()
            java.lang.Object r1 = r4.f3198c
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.b) r1
            java.util.HashMap r1 = r1.f5162c
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L_0x013f
            java.lang.Object r0 = r1.get(r0)
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            com.google.android.gms.internal.measurement.o r0 = com.google.android.gms.internal.measurement.y4.b(r0)
            return r0
        L_0x0145:
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r13, r0, r2)
            java.lang.Object r0 = r4.f3198c
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.b) r0
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.lang.String r0 = r0.f5160a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f7.c(java.lang.String, j1.c, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }
}
