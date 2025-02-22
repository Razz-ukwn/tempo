package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class e implements Iterable, o, k {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f5249a;

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f5250b;

    public e() {
        this.f5249a = new TreeMap();
        this.f5250b = new TreeMap();
    }

    public final boolean a(String str) {
        return "length".equals(str) || this.f5250b.containsKey(str);
    }

    public final void b(String str, o oVar) {
        TreeMap treeMap = this.f5250b;
        if (oVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, oVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e6, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f5, code lost:
        r7 = ",";
        r28 = com.google.android.gms.internal.measurement.o.f5428j;
        r16 = "every";
        r1 = r27;
        r8 = r1.f5249a;
        r17 = com.google.android.gms.internal.measurement.o.f5433p;
        r18 = com.google.android.gms.internal.measurement.o.f5432o;
        r21 = r5;
        r24 = r12;
        r23 = "forEach";
        r12 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0211, code lost:
        switch(r22) {
            case 0: goto L_0x0843;
            case 1: goto L_0x0803;
            case 2: goto L_0x079f;
            case 3: goto L_0x076f;
            case 4: goto L_0x06dc;
            case 5: goto L_0x069c;
            case 6: goto L_0x05f6;
            case 7: goto L_0x05c3;
            case 8: goto L_0x05a9;
            case 9: goto L_0x0573;
            case 10: goto L_0x0568;
            case com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor.MODULE_VERSION :int: goto L_0x055d;
            case 12: goto L_0x0525;
            case 13: goto L_0x050e;
            case 14: goto L_0x048b;
            case 15: goto L_0x041a;
            case 16: goto L_0x03c1;
            case 17: goto L_0x02ba;
            case 18: goto L_0x02a9;
            case 19: goto L_0x021c;
            default: goto L_0x0214;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021b, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0220, code lost:
        if (r30.isEmpty() != false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0222, code lost:
        r0 = new com.google.android.gms.internal.measurement.e();
        r2 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022f, code lost:
        if (r2.hasNext() == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0231, code lost:
        r3 = r29.m((com.google.android.gms.internal.measurement.o) r2.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023f, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0241, code lost:
        r0.k(r0.e(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0250, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0251, code lost:
        r2 = r0.e();
        r3 = h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025d, code lost:
        if (r3.hasNext() == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025f, code lost:
        r4 = (java.lang.Integer) r3.next();
        r0.k(r4.intValue() + r2, f(r4.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0276, code lost:
        r8.clear();
        r2 = r0.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0281, code lost:
        if (r2.hasNext() == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0283, code lost:
        r3 = (java.lang.Integer) r2.next();
        k(r3.intValue(), r0.f(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a9, code lost:
        com.google.android.gms.internal.measurement.f4.h(r6, 0, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ba, code lost:
        r4 = r29;
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c3, code lost:
        if (r30.isEmpty() == false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02cc, code lost:
        r3 = (int) com.google.android.gms.internal.measurement.f4.a(r4.m((com.google.android.gms.internal.measurement.o) r2.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e3, code lost:
        if (r3 >= 0) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e5, code lost:
        r3 = java.lang.Math.max(0, e() + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f3, code lost:
        if (r3 <= e()) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f5, code lost:
        r3 = e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f9, code lost:
        r0 = e();
        r5 = new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0307, code lost:
        if (r30.size() <= 1) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0309, code lost:
        r6 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.f4.a(r4.m((com.google.android.gms.internal.measurement.o) r2.get(1)).zzh().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0325, code lost:
        if (r6 <= 0) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0327, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x032e, code lost:
        if (r7 >= java.lang.Math.min(r0, r3 + r6)) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0330, code lost:
        r5.k(r5.e(), f(r3));
        j(r3);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0346, code lost:
        if (r30.size() <= 2) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0348, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034d, code lost:
        if (r0 >= r30.size()) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034f, code lost:
        r6 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035b, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035d, code lost:
        r7 = (r3 + r0) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0361, code lost:
        if (r7 < 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0367, code lost:
        if (r7 < e()) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0369, code lost:
        k(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036d, code lost:
        r9 = ((java.lang.Integer) r8.lastKey()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0377, code lost:
        if (r9 < r7) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0379, code lost:
        r10 = java.lang.Integer.valueOf(r9);
        r11 = (com.google.android.gms.internal.measurement.o) r8.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0383, code lost:
        if (r11 == null) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0385, code lost:
        k(r9 + 1, r11);
        r8.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038d, code lost:
        r9 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0390, code lost:
        k(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0393, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03a1, code lost:
        throw new java.lang.IllegalArgumentException(androidx.fragment.app.q.a("Invalid value index: ", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a9, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03aa, code lost:
        if (r3 >= r0) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ac, code lost:
        r5.k(r5.e(), f(r3));
        k(r3, (com.google.android.gms.internal.measurement.o) null);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c1, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.j(r0, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ce, code lost:
        if (e() >= 2) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d2, code lost:
        r0 = i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03da, code lost:
        if (r30.isEmpty() != false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03dc, code lost:
        r2 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e9, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03eb, code lost:
        r2 = (com.google.android.gms.internal.measurement.i) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f5, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f7, code lost:
        java.util.Collections.sort(r0, new com.google.android.gms.internal.measurement.z(r2, r4));
        r8.clear();
        r0 = r0.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x040b, code lost:
        if (r0.hasNext() == false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040d, code lost:
        k(r2, (com.google.android.gms.internal.measurement.o) r0.next());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x041a, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.h(r10, 1, r2);
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x042f, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0435, code lost:
        if (e() != 0) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0439, code lost:
        r0 = (com.google.android.gms.internal.measurement.i) r0;
        r2 = h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0443, code lost:
        if (r2.hasNext() == false) goto L_0x0837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0445, code lost:
        r3 = ((java.lang.Integer) r2.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0453, code lost:
        if (l(r3) == false) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x047f, code lost:
        if (r0.e(r4, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{f(r3), new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r3)), r1})).zzg().booleanValue() == false) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0481, code lost:
        r17 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x048a, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x048b, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.j("slice", 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0497, code lost:
        if (r30.isEmpty() == false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x049f, code lost:
        r5 = (double) e();
        r7 = com.google.android.gms.internal.measurement.f4.a(r4.m((com.google.android.gms.internal.measurement.o) r2.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04bd, code lost:
        if (r7 >= 0.0d) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04bf, code lost:
        r7 = java.lang.Math.max(r7 + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04c5, code lost:
        r7 = java.lang.Math.min(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ce, code lost:
        if (r30.size() != 2) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d0, code lost:
        r2 = com.google.android.gms.internal.measurement.f4.a(r4.m((com.google.android.gms.internal.measurement.o) r2.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e9, code lost:
        if (r2 >= 0.0d) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04eb, code lost:
        r5 = java.lang.Math.max(r5 + r2, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04f1, code lost:
        r5 = java.lang.Math.min(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04f5, code lost:
        r0 = new com.google.android.gms.internal.measurement.e();
        r2 = (int) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04fe, code lost:
        if (((double) r2) >= r5) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0500, code lost:
        r0.k(r0.e(), f(r2));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x050e, code lost:
        com.google.android.gms.internal.measurement.f4.h("shift", 0, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0518, code lost:
        if (e() != 0) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051c, code lost:
        r2 = f(0);
        j(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0525, code lost:
        com.google.android.gms.internal.measurement.f4.h("reverse", 0, r30);
        r0 = e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052f, code lost:
        if (r0 == 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0531, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0534, code lost:
        if (r2 >= (r0 / 2)) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x053a, code lost:
        if (l(r2) == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x053c, code lost:
        r3 = f(r2);
        k(r2, (com.google.android.gms.internal.measurement.o) null);
        r4 = (r0 - 1) - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054b, code lost:
        if (l(r4) == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x054d, code lost:
        k(r2, f(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0554, code lost:
        k(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0557, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0573, code lost:
        r4 = r29;
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x057b, code lost:
        if (r30.isEmpty() != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x057d, code lost:
        r0 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0585, code lost:
        if (r0.hasNext() == false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0587, code lost:
        k(e(), r4.m((com.google.android.gms.internal.measurement.o) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05a9, code lost:
        com.google.android.gms.internal.measurement.f4.h("pop", 0, r30);
        r0 = e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05b3, code lost:
        if (r0 != 0) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b7, code lost:
        r0 = r0 - 1;
        r2 = f(r0);
        j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05c3, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.h("map", 1, r2);
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05d8, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05de, code lost:
        if (e() != 0) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05f5, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05f6, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.j("lastIndexOf", 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0602, code lost:
        if (r30.isEmpty() != false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0604, code lost:
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0610, code lost:
        r0 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0612, code lost:
        r3 = e() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x061d, code lost:
        if (r30.size() <= 1) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x061f, code lost:
        r2 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0635, code lost:
        if (java.lang.Double.isNaN(r2.zzh().doubleValue()) == false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0637, code lost:
        r2 = (double) (e() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x063f, code lost:
        r2 = com.google.android.gms.internal.measurement.f4.a(r2.zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x064d, code lost:
        if (r2 >= 0.0d) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x064f, code lost:
        r2 = r2 + ((double) e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0656, code lost:
        r2 = (double) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0659, code lost:
        if (r2 >= 0.0d) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0666, code lost:
        r2 = (int) java.lang.Math.min((double) e(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0670, code lost:
        if (r2 < 0) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0676, code lost:
        if (l(r2) == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0680, code lost:
        if (com.google.android.gms.internal.measurement.f4.l(f(r2), r0) == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x068e, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x069c, code lost:
        r4 = r29;
        r2 = r30;
        com.google.android.gms.internal.measurement.f4.j(r24, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06aa, code lost:
        if (e() != 0) goto L_0x06b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06b4, code lost:
        if (r30.isEmpty() != false) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06b6, code lost:
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06c3, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.m) != false) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06c7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.t) == false) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06ca, code lost:
        r7 = r0.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06cf, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06dc, code lost:
        r4 = r29;
        r0 = r30;
        com.google.android.gms.internal.measurement.f4.j("indexOf", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06e8, code lost:
        if (r30.isEmpty() != false) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06ea, code lost:
        r2 = r4.m((com.google.android.gms.internal.measurement.o) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06f6, code lost:
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06fd, code lost:
        if (r30.size() <= 1) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06ff, code lost:
        r3 = com.google.android.gms.internal.measurement.f4.a(r4.m((com.google.android.gms.internal.measurement.o) r0.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x071c, code lost:
        if (r3 < ((double) e())) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x072b, code lost:
        if (r3 >= 0.0d) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x072d, code lost:
        r12 = ((double) e()) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0735, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0736, code lost:
        r0 = h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x073e, code lost:
        if (r0.hasNext() == false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0740, code lost:
        r3 = ((java.lang.Integer) r0.next()).intValue();
        r4 = (double) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x074d, code lost:
        if (r4 < r12) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0757, code lost:
        if (com.google.android.gms.internal.measurement.f4.l(f(r3), r2) == false) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x076f, code lost:
        r4 = r29;
        r0 = r30;
        com.google.android.gms.internal.measurement.f4.h(r23, 1, r0);
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0786, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x078c, code lost:
        if (r8.size() != 0) goto L_0x078f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x078f, code lost:
        ag.b1.k(r1, r4, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x079e, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x079f, code lost:
        r4 = r29;
        r0 = r30;
        com.google.android.gms.internal.measurement.f4.h(r21, 1, r0);
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07b6, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x07fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07bc, code lost:
        if (r8.size() != 0) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07c5, code lost:
        r2 = zzd();
        r0 = ag.b1.k(r1, r4, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r3 = new com.google.android.gms.internal.measurement.e();
        r0 = r0.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07df, code lost:
        if (r0.hasNext() == false) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07e1, code lost:
        r3.k(r3.e(), ((com.google.android.gms.internal.measurement.e) r2).f(((java.lang.Integer) r0.next()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0802, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0803, code lost:
        r4 = r29;
        r0 = r30;
        com.google.android.gms.internal.measurement.f4.h(r16, 1, r0);
        r0 = r4.m((com.google.android.gms.internal.measurement.o) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x081a, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.n) == false) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0820, code lost:
        if (e() != 0) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0835, code lost:
        if (ag.b1.k(r1, r4, (com.google.android.gms.internal.measurement.n) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).e() == e()) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0842, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0843, code lost:
        r4 = r29;
        r0 = r30;
        r2 = zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x084f, code lost:
        if (r30.isEmpty() != false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0851, code lost:
        r0 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0859, code lost:
        if (r0.hasNext() == false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x085b, code lost:
        r3 = r4.m((com.google.android.gms.internal.measurement.o) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0867, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.g) != false) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0869, code lost:
        r5 = (com.google.android.gms.internal.measurement.e) r2;
        r6 = r5.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0872, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.e) == false) goto L_0x0897;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0874, code lost:
        r3 = (com.google.android.gms.internal.measurement.e) r3;
        r7 = r3.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x087e, code lost:
        if (r7.hasNext() == false) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0880, code lost:
        r8 = (java.lang.Integer) r7.next();
        r5.k(r8.intValue() + r6, r3.f(r8.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0897, code lost:
        r5.k(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08a2, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) e()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        return new com.google.android.gms.internal.measurement.s(g(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        return new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return ag.b1.m(r1, r29, r30, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        return ag.b1.m(r1, r29, r30, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) e()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        return new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:?, code lost:
        return ag.b1.k(r1, r4, (com.google.android.gms.internal.measurement.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        return com.google.android.gms.internal.measurement.o.f5434q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        return new com.google.android.gms.internal.measurement.s(g(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        return r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        return new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:?, code lost:
        return r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:?, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ab, code lost:
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b6, code lost:
        r5 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o c(java.lang.String r28, j1.c r29, java.util.ArrayList r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "reduceRight"
            java.lang.String r7 = "push"
            java.lang.String r8 = "unshift"
            java.lang.String r9 = "splice"
            java.lang.String r10 = "reduce"
            java.lang.String r11 = "toString"
            java.lang.String r12 = "filter"
            java.lang.String r13 = "forEach"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "map"
            r16 = r4
            java.lang.String r4 = "pop"
            java.lang.String r0 = "join"
            java.lang.String r2 = "some"
            java.lang.String r3 = "sort"
            r17 = r8
            java.lang.String r8 = "every"
            r18 = r11
            java.lang.String r11 = "shift"
            r19 = r9
            java.lang.String r9 = "slice"
            r20 = r3
            java.lang.String r3 = "reverse"
            r21 = r2
            java.lang.String r2 = "indexOf"
            if (r5 != 0) goto L_0x0117
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x0117
            r5 = r21
            boolean r21 = r5.equals(r1)
            if (r21 != 0) goto L_0x0108
            r21 = r0
            r0 = r20
            boolean r20 = r0.equals(r1)
            if (r20 != 0) goto L_0x00fc
            r20 = r0
            r0 = r19
            boolean r19 = r0.equals(r1)
            if (r19 != 0) goto L_0x00ec
            r19 = r5
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d7
            r18 = r5
            r5 = r17
            boolean r17 = r5.equals(r1)
            if (r17 == 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            com.google.android.gms.internal.measurement.s r0 = new com.google.android.gms.internal.measurement.s
            r0.<init>(r1)
            r1 = r27
            r2 = r29
            r3 = r30
            com.google.android.gms.internal.measurement.o r0 = ag.b1.h(r1, r0, r2, r3)
            return r0
        L_0x00d7:
            r18 = r5
            r5 = r17
        L_0x00db:
            r17 = r12
            r12 = r21
            r25 = r20
            r20 = r0
            r0 = r25
            r26 = r19
            r19 = r10
            r10 = r26
            goto L_0x0124
        L_0x00ec:
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            r25 = r20
            r20 = r0
            r0 = r25
            goto L_0x0124
        L_0x00fc:
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            goto L_0x0124
        L_0x0108:
            r25 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r25
            goto L_0x0124
        L_0x0117:
            r5 = r17
            r17 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r21
        L_0x0124:
            int r21 = r28.hashCode()
            r22 = -1
            switch(r21) {
                case -1776922004: goto L_0x01e9;
                case -1354795244: goto L_0x01da;
                case -1274492040: goto L_0x01cf;
                case -934873754: goto L_0x01c4;
                case -895859076: goto L_0x01b9;
                case -678635926: goto L_0x01ae;
                case -467511597: goto L_0x01a4;
                case -277637751: goto L_0x019b;
                case 107868: goto L_0x0193;
                case 111185: goto L_0x018a;
                case 3267882: goto L_0x0182;
                case 3452698: goto L_0x0179;
                case 3536116: goto L_0x0170;
                case 3536286: goto L_0x0167;
                case 96891675: goto L_0x015e;
                case 109407362: goto L_0x0155;
                case 109526418: goto L_0x014c;
                case 965561430: goto L_0x0142;
                case 1099846370: goto L_0x0138;
                case 1943291465: goto L_0x012f;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x01b6
        L_0x012f:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01b6
            r1 = 4
            goto L_0x01ab
        L_0x0138:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01b6
            r1 = 12
            goto L_0x01ab
        L_0x0142:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01b6
            r1 = 11
            goto L_0x01ab
        L_0x014c:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x01b6
            r1 = 14
            goto L_0x01ab
        L_0x0155:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b6
            r1 = 13
            goto L_0x01ab
        L_0x015e:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x01b6
            r22 = 1
            goto L_0x01b6
        L_0x0167:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b6
            r1 = 16
            goto L_0x01ab
        L_0x0170:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x01b6
            r1 = 15
            goto L_0x01ab
        L_0x0179:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x01b6
            r1 = 9
            goto L_0x01ab
        L_0x0182:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x01b6
            r1 = 5
            goto L_0x01ab
        L_0x018a:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b6
            r1 = 8
            goto L_0x01ab
        L_0x0193:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x01b6
            r1 = 7
            goto L_0x01ab
        L_0x019b:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01b6
            r1 = 19
            goto L_0x01ab
        L_0x01a4:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x01b6
            r1 = 6
        L_0x01ab:
            r22 = r1
            goto L_0x01b6
        L_0x01ae:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x01b6
            r22 = 3
        L_0x01b6:
            r5 = r17
            goto L_0x01e6
        L_0x01b9:
            r5 = r20
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01b6
            r1 = 17
            goto L_0x01ab
        L_0x01c4:
            r5 = r19
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01b6
            r1 = 10
            goto L_0x01ab
        L_0x01cf:
            r5 = r17
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01e6
            r22 = 2
            goto L_0x01e6
        L_0x01da:
            r6 = r16
            r5 = r17
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01e6
            r22 = 0
        L_0x01e6:
            r6 = r18
            goto L_0x01f5
        L_0x01e9:
            r5 = r17
            r6 = r18
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01f5
            r22 = 18
        L_0x01f5:
            com.google.android.gms.internal.measurement.t r1 = com.google.android.gms.internal.measurement.o.f5428j
            java.lang.String r7 = ","
            r28 = r1
            r16 = r8
            r1 = r27
            java.util.TreeMap r8 = r1.f5249a
            com.google.android.gms.internal.measurement.f r17 = com.google.android.gms.internal.measurement.o.f5433p
            com.google.android.gms.internal.measurement.f r18 = com.google.android.gms.internal.measurement.o.f5432o
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r21 = r5
            java.lang.String r5 = "Callback should be a method"
            r24 = r12
            r23 = r13
            r12 = 0
            switch(r22) {
                case 0: goto L_0x0843;
                case 1: goto L_0x0803;
                case 2: goto L_0x079f;
                case 3: goto L_0x076f;
                case 4: goto L_0x06dc;
                case 5: goto L_0x069c;
                case 6: goto L_0x05f6;
                case 7: goto L_0x05c3;
                case 8: goto L_0x05a9;
                case 9: goto L_0x0573;
                case 10: goto L_0x0568;
                case 11: goto L_0x055d;
                case 12: goto L_0x0525;
                case 13: goto L_0x050e;
                case 14: goto L_0x048b;
                case 15: goto L_0x041a;
                case 16: goto L_0x03c1;
                case 17: goto L_0x02ba;
                case 18: goto L_0x02a9;
                case 19: goto L_0x021c;
                default: goto L_0x0214;
            }
        L_0x0214:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r0.<init>(r2)
            throw r0
        L_0x021c:
            boolean r0 = r30.isEmpty()
            if (r0 != 0) goto L_0x0299
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            java.util.Iterator r2 = r30.iterator()
        L_0x022b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0251
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            r4 = r29
            com.google.android.gms.internal.measurement.o r3 = r4.m(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.measurement.g
            if (r5 != 0) goto L_0x0249
            int r5 = r0.e()
            r0.k(r5, r3)
            goto L_0x022b
        L_0x0249:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Argument evaluation failed"
            r0.<init>(r2)
            throw r0
        L_0x0251:
            int r2 = r0.e()
            java.util.Iterator r3 = r27.h()
        L_0x0259:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            int r5 = r5 + r2
            int r4 = r4.intValue()
            com.google.android.gms.internal.measurement.o r4 = r1.f(r4)
            r0.k(r5, r4)
            goto L_0x0259
        L_0x0276:
            r8.clear()
            java.util.Iterator r2 = r0.h()
        L_0x027d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0299
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.o r3 = r0.f(r3)
            r1.k(r4, r3)
            goto L_0x027d
        L_0x0299:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            int r2 = r27.e()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x02a9:
            r0 = 0
            r2 = r30
            com.google.android.gms.internal.measurement.f4.h(r6, r0, r2)
            com.google.android.gms.internal.measurement.s r0 = new com.google.android.gms.internal.measurement.s
            java.lang.String r2 = r1.g(r7)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x02ba:
            r4 = r29
            r2 = r30
            r0 = 0
            boolean r3 = r30.isEmpty()
            if (r3 == 0) goto L_0x02cc
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            goto L_0x08a3
        L_0x02cc:
            java.lang.Object r3 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            com.google.android.gms.internal.measurement.o r3 = r4.m(r3)
            java.lang.Double r3 = r3.zzh()
            double r5 = r3.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.f4.a(r5)
            int r3 = (int) r5
            if (r3 >= 0) goto L_0x02ef
            int r5 = r27.e()
            int r5 = r5 + r3
            int r3 = java.lang.Math.max(r0, r5)
            goto L_0x02f9
        L_0x02ef:
            int r0 = r27.e()
            if (r3 <= r0) goto L_0x02f9
            int r3 = r27.e()
        L_0x02f9:
            int r0 = r27.e()
            com.google.android.gms.internal.measurement.e r5 = new com.google.android.gms.internal.measurement.e
            r5.<init>()
            int r6 = r30.size()
            r7 = 1
            if (r6 <= r7) goto L_0x03aa
            java.lang.Object r6 = r2.get(r7)
            com.google.android.gms.internal.measurement.o r6 = (com.google.android.gms.internal.measurement.o) r6
            com.google.android.gms.internal.measurement.o r6 = r4.m(r6)
            java.lang.Double r6 = r6.zzh()
            double r6 = r6.doubleValue()
            double r6 = com.google.android.gms.internal.measurement.f4.a(r6)
            int r6 = (int) r6
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)
            if (r6 <= 0) goto L_0x0341
            r7 = r3
        L_0x0328:
            int r9 = r3 + r6
            int r9 = java.lang.Math.min(r0, r9)
            if (r7 >= r9) goto L_0x0341
            com.google.android.gms.internal.measurement.o r9 = r1.f(r3)
            int r10 = r5.e()
            r5.k(r10, r9)
            r1.j(r3)
            int r7 = r7 + 1
            goto L_0x0328
        L_0x0341:
            int r0 = r30.size()
            r6 = 2
            if (r0 <= r6) goto L_0x03be
            r0 = 2
        L_0x0349:
            int r6 = r30.size()
            if (r0 >= r6) goto L_0x03be
            java.lang.Object r6 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r6 = (com.google.android.gms.internal.measurement.o) r6
            com.google.android.gms.internal.measurement.o r6 = r4.m(r6)
            boolean r7 = r6 instanceof com.google.android.gms.internal.measurement.g
            if (r7 != 0) goto L_0x03a2
            int r7 = r3 + r0
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0396
            int r9 = r27.e()
            if (r7 < r9) goto L_0x036d
            r1.k(r7, r6)
            goto L_0x0393
        L_0x036d:
            java.lang.Object r9 = r8.lastKey()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
        L_0x0377:
            if (r9 < r7) goto L_0x0390
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r11 = r8.get(r10)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            if (r11 == 0) goto L_0x038d
            int r12 = r9 + 1
            r1.k(r12, r11)
            r8.remove(r10)
        L_0x038d:
            int r9 = r9 + -1
            goto L_0x0377
        L_0x0390:
            r1.k(r7, r6)
        L_0x0393:
            int r0 = r0 + 1
            goto L_0x0349
        L_0x0396:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid value index: "
            java.lang.String r2 = androidx.fragment.app.q.a(r2, r7)
            r0.<init>(r2)
            throw r0
        L_0x03a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to parse elements to add"
            r0.<init>(r2)
            throw r0
        L_0x03aa:
            if (r3 >= r0) goto L_0x03be
            com.google.android.gms.internal.measurement.o r2 = r1.f(r3)
            int r4 = r5.e()
            r5.k(r4, r2)
            r2 = 0
            r1.k(r3, r2)
            int r3 = r3 + 1
            goto L_0x03aa
        L_0x03be:
            r0 = r5
            goto L_0x08a3
        L_0x03c1:
            r4 = r29
            r2 = r30
            r3 = 1
            com.google.android.gms.internal.measurement.f4.j(r0, r3, r2)
            int r0 = r27.e()
            r3 = 2
            if (r0 >= r3) goto L_0x03d2
            goto L_0x055a
        L_0x03d2:
            java.util.ArrayList r0 = r27.i()
            boolean r3 = r30.isEmpty()
            if (r3 != 0) goto L_0x03f6
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r4.m(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.i
            if (r3 == 0) goto L_0x03ee
            com.google.android.gms.internal.measurement.i r2 = (com.google.android.gms.internal.measurement.i) r2
            goto L_0x03f7
        L_0x03ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparator should be a method"
            r0.<init>(r2)
            throw r0
        L_0x03f6:
            r2 = 0
        L_0x03f7:
            com.google.android.gms.internal.measurement.z r3 = new com.google.android.gms.internal.measurement.z
            r3.<init>(r2, r4)
            java.util.Collections.sort(r0, r3)
            r8.clear()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0407:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x055a
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            int r4 = r2 + 1
            r1.k(r2, r3)
            r2 = r4
            goto L_0x0407
        L_0x041a:
            r4 = r29
            r2 = r30
            r0 = 1
            com.google.android.gms.internal.measurement.f4.h(r10, r0, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.i
            if (r2 == 0) goto L_0x0485
            int r2 = r27.e()
            if (r2 != 0) goto L_0x0439
            goto L_0x0837
        L_0x0439:
            com.google.android.gms.internal.measurement.i r0 = (com.google.android.gms.internal.measurement.i) r0
            java.util.Iterator r2 = r27.h()
        L_0x043f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0837
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x043f
            r5 = 3
            com.google.android.gms.internal.measurement.o[] r5 = new com.google.android.gms.internal.measurement.o[r5]
            com.google.android.gms.internal.measurement.o r6 = r1.f(r3)
            r7 = 0
            r5[r7] = r6
            double r6 = (double) r3
            com.google.android.gms.internal.measurement.h r3 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r3.<init>(r6)
            r6 = 1
            r5[r6] = r3
            r3 = 2
            r5[r3] = r1
            java.util.List r3 = java.util.Arrays.asList(r5)
            com.google.android.gms.internal.measurement.o r3 = r0.e(r4, r3)
            java.lang.Boolean r3 = r3.zzg()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x043f
            r17 = r18
            goto L_0x0837
        L_0x0485:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x048b:
            r4 = r29
            r2 = r30
            r0 = 2
            com.google.android.gms.internal.measurement.f4.j(r9, r0, r2)
            boolean r0 = r30.isEmpty()
            if (r0 == 0) goto L_0x049f
            com.google.android.gms.internal.measurement.o r0 = r27.zzd()
            goto L_0x08a3
        L_0x049f:
            int r0 = r27.e()
            double r5 = (double) r0
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            java.lang.Double r0 = r0.zzh()
            double r7 = r0.doubleValue()
            double r7 = com.google.android.gms.internal.measurement.f4.a(r7)
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x04c5
            double r7 = r7 + r5
            double r7 = java.lang.Math.max(r7, r12)
            goto L_0x04c9
        L_0x04c5:
            double r7 = java.lang.Math.min(r7, r5)
        L_0x04c9:
            int r0 = r30.size()
            r3 = 2
            if (r0 != r3) goto L_0x04f5
            r0 = 1
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            java.lang.Double r0 = r0.zzh()
            double r2 = r0.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.f4.a(r2)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f1
            double r5 = r5 + r2
            double r5 = java.lang.Math.max(r5, r12)
            goto L_0x04f5
        L_0x04f1:
            double r5 = java.lang.Math.min(r5, r2)
        L_0x04f5:
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            int r2 = (int) r7
        L_0x04fb:
            double r3 = (double) r2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x08a3
            com.google.android.gms.internal.measurement.o r3 = r1.f(r2)
            int r4 = r0.e()
            r0.k(r4, r3)
            int r2 = r2 + 1
            goto L_0x04fb
        L_0x050e:
            r2 = r30
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r11, r0, r2)
            int r2 = r27.e()
            if (r2 != 0) goto L_0x051c
            goto L_0x0795
        L_0x051c:
            com.google.android.gms.internal.measurement.o r2 = r1.f(r0)
            r1.j(r0)
            goto L_0x05c0
        L_0x0525:
            r2 = r30
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r3, r0, r2)
            int r0 = r27.e()
            if (r0 == 0) goto L_0x055a
            r2 = 0
        L_0x0532:
            int r3 = r0 / 2
            if (r2 >= r3) goto L_0x055a
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0557
            com.google.android.gms.internal.measurement.o r3 = r1.f(r2)
            r4 = 0
            r1.k(r2, r4)
            int r4 = r0 + -1
            int r4 = r4 - r2
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0554
            com.google.android.gms.internal.measurement.o r5 = r1.f(r4)
            r1.k(r2, r5)
        L_0x0554:
            r1.k(r4, r3)
        L_0x0557:
            int r2 = r2 + 1
            goto L_0x0532
        L_0x055a:
            r0 = r1
            goto L_0x08a3
        L_0x055d:
            r4 = r29
            r2 = r30
            r0 = 0
            com.google.android.gms.internal.measurement.o r0 = ag.b1.m(r1, r4, r2, r0)
            goto L_0x08a3
        L_0x0568:
            r4 = r29
            r2 = r30
            r0 = 1
            com.google.android.gms.internal.measurement.o r0 = ag.b1.m(r1, r4, r2, r0)
            goto L_0x08a3
        L_0x0573:
            r4 = r29
            r2 = r30
            boolean r0 = r30.isEmpty()
            if (r0 != 0) goto L_0x0599
            java.util.Iterator r0 = r30.iterator()
        L_0x0581:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0599
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r4.m(r2)
            int r3 = r27.e()
            r1.k(r3, r2)
            goto L_0x0581
        L_0x0599:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            int r2 = r27.e()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x05a9:
            r2 = r30
            r0 = 0
            com.google.android.gms.internal.measurement.f4.h(r4, r0, r2)
            int r0 = r27.e()
            if (r0 != 0) goto L_0x05b7
            goto L_0x0795
        L_0x05b7:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.o r2 = r1.f(r0)
            r1.j(r0)
        L_0x05c0:
            r0 = r2
            goto L_0x08a3
        L_0x05c3:
            r4 = r29
            r2 = r30
            r0 = 0
            r3 = 1
            com.google.android.gms.internal.measurement.f4.h(r15, r3, r2)
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r2 == 0) goto L_0x05f0
            int r2 = r27.e()
            if (r2 != 0) goto L_0x05e7
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            goto L_0x08a3
        L_0x05e7:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            r2 = 0
            com.google.android.gms.internal.measurement.e r0 = ag.b1.k(r1, r4, r0, r2, r2)
            goto L_0x08a3
        L_0x05f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x05f6:
            r4 = r29
            r2 = r30
            r0 = 2
            com.google.android.gms.internal.measurement.f4.j(r14, r0, r2)
            boolean r0 = r30.isEmpty()
            if (r0 != 0) goto L_0x0610
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            goto L_0x0612
        L_0x0610:
            r0 = r28
        L_0x0612:
            int r3 = r27.e()
            int r3 = r3 + -1
            int r5 = r30.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0656
            java.lang.Object r2 = r2.get(r6)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r4.m(r2)
            java.lang.Double r3 = r2.zzh()
            double r3 = r3.doubleValue()
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L_0x063f
            int r2 = r27.e()
            int r2 = r2 + -1
            double r2 = (double) r2
            goto L_0x064b
        L_0x063f:
            java.lang.Double r2 = r2.zzh()
            double r2 = r2.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.f4.a(r2)
        L_0x064b:
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0657
            int r4 = r27.e()
            double r4 = (double) r4
            double r2 = r2 + r4
            goto L_0x0657
        L_0x0656:
            double r2 = (double) r3
        L_0x0657:
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0666
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r19)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x0666:
            int r4 = r27.e()
            double r4 = (double) r4
            double r2 = java.lang.Math.min(r4, r2)
            int r2 = (int) r2
        L_0x0670:
            if (r2 < 0) goto L_0x0691
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x068e
            com.google.android.gms.internal.measurement.o r3 = r1.f(r2)
            boolean r3 = com.google.android.gms.internal.measurement.f4.l(r3, r0)
            if (r3 == 0) goto L_0x068e
            double r2 = (double) r2
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x068e:
            int r2 = r2 + -1
            goto L_0x0670
        L_0x0691:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r19)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x069c:
            r4 = r29
            r2 = r30
            r0 = 1
            r3 = r24
            com.google.android.gms.internal.measurement.f4.j(r3, r0, r2)
            int r0 = r27.e()
            if (r0 != 0) goto L_0x06b0
            com.google.android.gms.internal.measurement.s r0 = com.google.android.gms.internal.measurement.o.f5434q
            goto L_0x08a3
        L_0x06b0:
            boolean r0 = r30.isEmpty()
            if (r0 != 0) goto L_0x06d1
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.m
            if (r2 != 0) goto L_0x06cf
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.t
            if (r2 == 0) goto L_0x06ca
            goto L_0x06cf
        L_0x06ca:
            java.lang.String r7 = r0.zzi()
            goto L_0x06d1
        L_0x06cf:
            java.lang.String r7 = ""
        L_0x06d1:
            com.google.android.gms.internal.measurement.s r0 = new com.google.android.gms.internal.measurement.s
            java.lang.String r2 = r1.g(r7)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x06dc:
            r4 = r29
            r0 = r30
            r3 = 2
            com.google.android.gms.internal.measurement.f4.j(r2, r3, r0)
            boolean r2 = r30.isEmpty()
            if (r2 != 0) goto L_0x06f6
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            com.google.android.gms.internal.measurement.o r2 = r4.m(r2)
            goto L_0x06f8
        L_0x06f6:
            r2 = r28
        L_0x06f8:
            int r3 = r30.size()
            r5 = 1
            if (r3 <= r5) goto L_0x0736
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            java.lang.Double r0 = r0.zzh()
            double r3 = r0.doubleValue()
            double r3 = com.google.android.gms.internal.measurement.f4.a(r3)
            int r0 = r27.e()
            double r5 = (double) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0729
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r19)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x0729:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0735
            int r0 = r27.e()
            double r5 = (double) r0
            double r12 = r5 + r3
            goto L_0x0736
        L_0x0735:
            r12 = r3
        L_0x0736:
            java.util.Iterator r0 = r27.h()
        L_0x073a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0764
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            double r4 = (double) r3
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x073a
            com.google.android.gms.internal.measurement.o r3 = r1.f(r3)
            boolean r3 = com.google.android.gms.internal.measurement.f4.l(r3, r2)
            if (r3 == 0) goto L_0x073a
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x0764:
            com.google.android.gms.internal.measurement.h r0 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r2 = java.lang.Double.valueOf(r19)
            r0.<init>(r2)
            goto L_0x08a3
        L_0x076f:
            r4 = r29
            r0 = r30
            r2 = 1
            r3 = r23
            com.google.android.gms.internal.measurement.f4.h(r3, r2, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r2 == 0) goto L_0x0799
            int r2 = r8.size()
            if (r2 != 0) goto L_0x078f
            goto L_0x0795
        L_0x078f:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            r2 = 0
            ag.b1.k(r1, r4, r0, r2, r2)
        L_0x0795:
            r0 = r28
            goto L_0x08a3
        L_0x0799:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x079f:
            r4 = r29
            r0 = r30
            r2 = 1
            r3 = r21
            com.google.android.gms.internal.measurement.f4.h(r3, r2, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r2 == 0) goto L_0x07fd
            int r2 = r8.size()
            if (r2 != 0) goto L_0x07c5
            com.google.android.gms.internal.measurement.e r0 = new com.google.android.gms.internal.measurement.e
            r0.<init>()
            goto L_0x08a3
        L_0x07c5:
            com.google.android.gms.internal.measurement.o r2 = r27.zzd()
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r5 = 0
            com.google.android.gms.internal.measurement.e r0 = ag.b1.k(r1, r4, r0, r5, r3)
            com.google.android.gms.internal.measurement.e r3 = new com.google.android.gms.internal.measurement.e
            r3.<init>()
            java.util.Iterator r0 = r0.h()
        L_0x07db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x07fa
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r2
            com.google.android.gms.internal.measurement.e r5 = (com.google.android.gms.internal.measurement.e) r5
            com.google.android.gms.internal.measurement.o r4 = r5.f(r4)
            int r5 = r3.e()
            r3.k(r5, r4)
            goto L_0x07db
        L_0x07fa:
            r0 = r3
            goto L_0x08a3
        L_0x07fd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0803:
            r4 = r29
            r0 = r30
            r2 = 1
            r3 = r16
            com.google.android.gms.internal.measurement.f4.h(r3, r2, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r4.m(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.n
            if (r2 == 0) goto L_0x083d
            int r2 = r27.e()
            if (r2 != 0) goto L_0x0823
            goto L_0x083a
        L_0x0823:
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.n) r0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.e r0 = ag.b1.k(r1, r4, r0, r2, r3)
            int r0 = r0.e()
            int r2 = r27.e()
            if (r0 == r2) goto L_0x083a
        L_0x0837:
            r0 = r17
            goto L_0x08a3
        L_0x083a:
            r0 = r18
            goto L_0x08a3
        L_0x083d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0843:
            r4 = r29
            r0 = r30
            com.google.android.gms.internal.measurement.o r2 = r27.zzd()
            boolean r3 = r30.isEmpty()
            if (r3 != 0) goto L_0x05c0
            java.util.Iterator r0 = r30.iterator()
        L_0x0855:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x05c0
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            com.google.android.gms.internal.measurement.o r3 = r4.m(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.measurement.g
            if (r5 != 0) goto L_0x089b
            r5 = r2
            com.google.android.gms.internal.measurement.e r5 = (com.google.android.gms.internal.measurement.e) r5
            int r6 = r5.e()
            boolean r7 = r3 instanceof com.google.android.gms.internal.measurement.e
            if (r7 == 0) goto L_0x0897
            com.google.android.gms.internal.measurement.e r3 = (com.google.android.gms.internal.measurement.e) r3
            java.util.Iterator r7 = r3.h()
        L_0x087a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0855
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            int r9 = r9 + r6
            int r8 = r8.intValue()
            com.google.android.gms.internal.measurement.o r8 = r3.f(r8)
            r5.k(r9, r8)
            goto L_0x087a
        L_0x0897:
            r5.k(r6, r3)
            goto L_0x0855
        L_0x089b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed evaluation of arguments"
            r0.<init>(r2)
            throw r0
        L_0x08a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.c(java.lang.String, j1.c, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.o) r2.f5250b.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.h r3 = new com.google.android.gms.internal.measurement.h
            int r0 = r2.e()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.a(r3)
            if (r0 == 0) goto L_0x0028
            java.util.TreeMap r0 = r2.f5250b
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.t r3 = com.google.android.gms.internal.measurement.o.f5428j
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.d(java.lang.String):com.google.android.gms.internal.measurement.o");
    }

    public final int e() {
        TreeMap treeMap = this.f5249a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e() != eVar.e()) {
            return false;
        }
        TreeMap treeMap = this.f5249a;
        if (treeMap.isEmpty()) {
            return eVar.f5249a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!f(intValue).equals(eVar.f(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.o) r1.f5249a.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o f(int r2) {
        /*
            r1 = this;
            int r0 = r1.e()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.l(r2)
            if (r0 == 0) goto L_0x001b
            java.util.TreeMap r0 = r1.f5249a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.o r2 = (com.google.android.gms.internal.measurement.o) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.t r2 = com.google.android.gms.internal.measurement.o.f5428j
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.f(int):com.google.android.gms.internal.measurement.o");
    }

    public final String g(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f5249a.isEmpty()) {
            int i8 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i8 >= e()) {
                    break;
                }
                o f10 = f(i8);
                sb2.append(str2);
                if (!(f10 instanceof t) && !(f10 instanceof m)) {
                    sb2.append(f10.zzi());
                }
                i8++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final Iterator h() {
        return this.f5249a.keySet().iterator();
    }

    public final int hashCode() {
        return this.f5249a.hashCode() * 31;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList(e());
        for (int i8 = 0; i8 < e(); i8++) {
            arrayList.add(f(i8));
        }
        return arrayList;
    }

    public final Iterator iterator() {
        return new d(this);
    }

    public final void j(int i8) {
        TreeMap treeMap = this.f5249a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i8 <= intValue && i8 >= 0) {
            treeMap.remove(Integer.valueOf(i8));
            if (i8 == intValue) {
                int i10 = i8 - 1;
                Integer valueOf = Integer.valueOf(i10);
                if (!treeMap.containsKey(valueOf) && i10 >= 0) {
                    treeMap.put(valueOf, o.f5428j);
                    return;
                }
                return;
            }
            while (true) {
                i8++;
                if (i8 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i8);
                    o oVar = (o) treeMap.get(valueOf2);
                    if (oVar != null) {
                        treeMap.put(Integer.valueOf(i8 - 1), oVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void k(int i8, o oVar) {
        if (i8 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i8 >= 0) {
            TreeMap treeMap = this.f5249a;
            if (oVar == null) {
                treeMap.remove(Integer.valueOf(i8));
            } else {
                treeMap.put(Integer.valueOf(i8), oVar);
            }
        } else {
            throw new IndexOutOfBoundsException(q.a("Out of bounds index: ", i8));
        }
    }

    public final boolean l(int i8) {
        if (i8 >= 0) {
            TreeMap treeMap = this.f5249a;
            if (i8 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i8));
            }
        }
        throw new IndexOutOfBoundsException(q.a("Out of bounds index: ", i8));
    }

    public final String toString() {
        return g(",");
    }

    public final o zzd() {
        e eVar = new e();
        for (Map.Entry entry : this.f5249a.entrySet()) {
            boolean z10 = entry.getValue() instanceof k;
            TreeMap treeMap = eVar.f5249a;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (o) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((o) entry.getValue()).zzd());
            }
        }
        return eVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        TreeMap treeMap = this.f5249a;
        return treeMap.size() == 1 ? f(0).zzh() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return g(",");
    }

    public final Iterator zzl() {
        return new c(this.f5249a.keySet().iterator(), this.f5250b.keySet().iterator());
    }

    public e(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                k(i8, (o) list.get(i8));
            }
        }
    }
}
