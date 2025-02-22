package com.google.android.gms.internal.measurement;

import androidx.activity.g;
import java.util.Iterator;

public final class s implements Iterable, o {

    /* renamed from: a  reason: collision with root package name */
    public final String f5509a;

    public s(String str) {
        if (str != null) {
            this.f5509a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017b, code lost:
        com.google.android.gms.internal.measurement.f4.h("toUpperCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018c, code lost:
        com.google.android.gms.internal.measurement.f4.h("toUpperCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
        com.google.android.gms.internal.measurement.f4.h("toString", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a7, code lost:
        com.google.android.gms.internal.measurement.f4.h(r18, 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bc, code lost:
        com.google.android.gms.internal.measurement.f4.h(r2, 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cd, code lost:
        com.google.android.gms.internal.measurement.f4.h(r5, 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01de, code lost:
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("substring", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e9, code lost:
        if (r22.isEmpty() != false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01eb, code lost:
        r2 = r21;
        r1 = (int) com.google.android.gms.internal.measurement.f4.a(r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0205, code lost:
        r2 = r21;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020d, code lost:
        if (r22.size() <= 1) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020f, code lost:
        r2 = (int) com.google.android.gms.internal.measurement.f4.a(r2.m((com.google.android.gms.internal.measurement.o) r6.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0227, code lost:
        r2 = r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022b, code lost:
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r3.length());
        r2 = java.lang.Math.min(java.lang.Math.max(r2, 0), r3.length());
        r4 = new com.google.android.gms.internal.measurement.s(r3.substring(java.lang.Math.min(r1, r2), java.lang.Math.max(r1, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0257, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("split", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0263, code lost:
        if (r3.length() != 0) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0276, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0280, code lost:
        if (r22.isEmpty() == false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0282, code lost:
        r4.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0287, code lost:
        r1 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x029a, code lost:
        if (r22.size() <= 1) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029c, code lost:
        r5 = com.google.android.gms.internal.measurement.f4.d(r2.m((com.google.android.gms.internal.measurement.o) r6.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b3, code lost:
        r5 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ba, code lost:
        if (r5 != 0) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c3, code lost:
        r2 = r3.split(java.util.regex.Pattern.quote(r1), ((int) r5) + 1);
        r3 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d3, code lost:
        if (r1.isEmpty() == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d5, code lost:
        if (r3 <= 0) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d7, code lost:
        r1 = r2[0].isEmpty();
        r7 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e6, code lost:
        if (r2[r7].isEmpty() != false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e9, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ea, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ee, code lost:
        if (((long) r3) <= r5) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f0, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f2, code lost:
        if (r1 >= r7) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f4, code lost:
        r4.add(new com.google.android.gms.internal.measurement.s(r2[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0308, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("slice", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0314, code lost:
        if (r22.isEmpty() != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0316, code lost:
        r4 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x032a, code lost:
        r4 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032c, code lost:
        r4 = com.google.android.gms.internal.measurement.f4.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0334, code lost:
        if (r4 >= 0.0d) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0336, code lost:
        r4 = java.lang.Math.max(((double) r3.length()) + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0341, code lost:
        r4 = java.lang.Math.min(r4, (double) r3.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x034f, code lost:
        if (r22.size() <= 1) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0351, code lost:
        r1 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0364, code lost:
        r1 = (double) r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0369, code lost:
        r1 = com.google.android.gms.internal.measurement.f4.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0371, code lost:
        if (r1 >= 0.0d) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0373, code lost:
        r1 = java.lang.Math.max(((double) r3.length()) + r1, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037e, code lost:
        r1 = java.lang.Math.min(r1, (double) r3.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0387, code lost:
        r4 = (int) r4;
        r2 = new com.google.android.gms.internal.measurement.s(r3.substring(r4, java.lang.Math.max(0, ((int) r1) - r4) + r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x039b, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j(r17, 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03aa, code lost:
        if (r22.isEmpty() != false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ac, code lost:
        r16 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ba, code lost:
        r1 = java.util.regex.Pattern.compile(r16).matcher(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c6, code lost:
        if (r1.find() == false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c8, code lost:
        r2 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r1.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e5, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("replace", 2, r6);
        r1 = com.google.android.gms.internal.measurement.o.f5428j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f3, code lost:
        if (r22.isEmpty() != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03f5, code lost:
        r16 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0409, code lost:
        if (r22.size() <= 1) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x040b, code lost:
        r1 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0415, code lost:
        r4 = r16;
        r5 = r3.indexOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x041b, code lost:
        if (r5 < 0) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x041f, code lost:
        if ((r1 instanceof com.google.android.gms.internal.measurement.i) == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0421, code lost:
        r1 = ((com.google.android.gms.internal.measurement.i) r1).e(r2, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{new com.google.android.gms.internal.measurement.s(r4), new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r5)), r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0446, code lost:
        r2 = new com.google.android.gms.internal.measurement.s(h0.e.b(r3.substring(0, r5), r1.zzi(), r3.substring(r4.length() + r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0463, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("match", 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x046f, code lost:
        if (r22.size() > 0) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0471, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0474, code lost:
        r1 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0483, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x048f, code lost:
        if (r1.find() == false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0491, code lost:
        r2 = new com.google.android.gms.internal.measurement.e(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{new com.google.android.gms.internal.measurement.s(r1.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04af, code lost:
        r2 = r21;
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.j("lastIndexOf", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04bc, code lost:
        if (r22.size() > 0) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04bf, code lost:
        r16 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04cd, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04d3, code lost:
        if (r22.size() >= 2) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04d5, code lost:
        r1 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d8, code lost:
        r1 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04ef, code lost:
        if (java.lang.Double.isNaN(r1) == false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04f1, code lost:
        r1 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04f4, code lost:
        r1 = com.google.android.gms.internal.measurement.f4.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04f8, code lost:
        r2 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r3.lastIndexOf(r4, (int) r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0509, code lost:
        r2 = r21;
        r6 = r22;
        r4 = 0.0d;
        com.google.android.gms.internal.measurement.f4.j("indexOf", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0517, code lost:
        if (r22.size() > 0) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x051a, code lost:
        r16 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0529, code lost:
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x052f, code lost:
        if (r22.size() >= 2) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0532, code lost:
        r4 = r2.m((com.google.android.gms.internal.measurement.o) r6.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0545, code lost:
        r2 = new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf((double) r3.indexOf(r7, (int) com.google.android.gms.internal.measurement.f4.a(r4))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x055a, code lost:
        r6 = r22;
        com.google.android.gms.internal.measurement.f4.h(r7, 1, r6);
        r1 = r21.m((com.google.android.gms.internal.measurement.o) r6.get(0));
        r2 = "length".equals(r1.zzi());
        r4 = com.google.android.gms.internal.measurement.o.f5432o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0579, code lost:
        if (r2 == false) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x057c, code lost:
        r1 = r1.zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x058a, code lost:
        if (r1 != java.lang.Math.floor(r1)) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x058c, code lost:
        r1 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x058d, code lost:
        if (r1 < 0) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0593, code lost:
        if (r1 >= r3.length()) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x059c, code lost:
        r2 = r21;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a4, code lost:
        if (r22.isEmpty() != false) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05a6, code lost:
        r1 = new java.lang.StringBuilder(r3);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05b0, code lost:
        if (r3 >= r22.size()) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05b2, code lost:
        r1.append(r2.m((com.google.android.gms.internal.measurement.o) r6.get(r3)).zzi());
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c6, code lost:
        r2 = new com.google.android.gms.internal.measurement.s(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d3, code lost:
        r2 = r21;
        r1 = r22;
        com.google.android.gms.internal.measurement.f4.j(r6, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05df, code lost:
        if (r22.isEmpty() != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05e1, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.f4.a(r2.m((com.google.android.gms.internal.measurement.o) r1.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05fa, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05fb, code lost:
        if (r1 < 0) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0601, code lost:
        if (r1 < r3.length()) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0604, code lost:
        r2 = new com.google.android.gms.internal.measurement.s(java.lang.String.valueOf(r3.charAt(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return com.google.android.gms.internal.measurement.o.f5434q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return new com.google.android.gms.internal.measurement.s(r3.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return new com.google.android.gms.internal.measurement.s(r3.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return new com.google.android.gms.internal.measurement.s(r3.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new com.google.android.gms.internal.measurement.s(r3.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new com.google.android.gms.internal.measurement.s(r3.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new com.google.android.gms.internal.measurement.e(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.o[]{r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new com.google.android.gms.internal.measurement.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new com.google.android.gms.internal.measurement.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new com.google.android.gms.internal.measurement.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return com.google.android.gms.internal.measurement.o.f5429k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return com.google.android.gms.internal.measurement.o.f5433p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0130, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013c, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0155, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0164, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0165, code lost:
        r16 = "undefined";
        r17 = "search";
        r18 = "toLowerCase";
        r2 = "toLocaleLowerCase";
        r0 = r19;
        r3 = r0.f5509a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0170, code lost:
        switch(r1) {
            case 0: goto L_0x05d3;
            case 1: goto L_0x059c;
            case 2: goto L_0x055a;
            case 3: goto L_0x0509;
            case 4: goto L_0x04af;
            case 5: goto L_0x0463;
            case 6: goto L_0x03e5;
            case 7: goto L_0x039b;
            case 8: goto L_0x0308;
            case 9: goto L_0x0257;
            case 10: goto L_0x01de;
            case com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor.MODULE_VERSION :int: goto L_0x01cd;
            case 12: goto L_0x01bc;
            case 13: goto L_0x01a7;
            case 14: goto L_0x019f;
            case 15: goto L_0x018c;
            case 16: goto L_0x017b;
            default: goto L_0x0173;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017a, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o c(java.lang.String r20, j1.c r21, java.util.ArrayList r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r8 = "indexOf"
            java.lang.String r9 = "replace"
            java.lang.String r10 = "substring"
            java.lang.String r11 = "split"
            java.lang.String r12 = "slice"
            java.lang.String r13 = "match"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "toLocaleUpperCase"
            java.lang.String r2 = "search"
            java.lang.String r3 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            r16 = r4
            java.lang.String r4 = "toString"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r15
            java.lang.String r15 = "toUpperCase"
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00b1
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r5 = r18
        L_0x00b1:
            r18 = r6
            r6 = r17
        L_0x00b5:
            int r17 = r20.hashCode()
            switch(r17) {
                case -1789698943: goto L_0x0158;
                case -1776922004: goto L_0x014a;
                case -1464939364: goto L_0x013f;
                case -1361633751: goto L_0x0133;
                case -1354795244: goto L_0x0129;
                case -1137582698: goto L_0x0120;
                case -906336856: goto L_0x0118;
                case -726908483: goto L_0x010f;
                case -467511597: goto L_0x0107;
                case -399551817: goto L_0x00fe;
                case 3568674: goto L_0x00f5;
                case 103668165: goto L_0x00ed;
                case 109526418: goto L_0x00e4;
                case 109648666: goto L_0x00db;
                case 530542161: goto L_0x00d2;
                case 1094496948: goto L_0x00c9;
                case 1943291465: goto L_0x00c0;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            r6 = r16
            goto L_0x0155
        L_0x00c0:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00bc
            r1 = 3
            goto L_0x0130
        L_0x00c9:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00bc
            r1 = 6
            goto L_0x0130
        L_0x00d2:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00bc
            r1 = 10
            goto L_0x0130
        L_0x00db:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00bc
            r1 = 9
            goto L_0x0130
        L_0x00e4:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00bc
            r1 = 8
            goto L_0x0130
        L_0x00ed:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00bc
            r1 = 5
            goto L_0x0130
        L_0x00f5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00bc
            r1 = 16
            goto L_0x0130
        L_0x00fe:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00bc
            r1 = 15
            goto L_0x0130
        L_0x0107:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00bc
            r1 = 4
            goto L_0x0130
        L_0x010f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00bc
            r1 = 11
            goto L_0x0130
        L_0x0118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00bc
            r1 = 7
            goto L_0x0130
        L_0x0120:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bc
            r1 = 13
            goto L_0x0130
        L_0x0129:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00bc
            r1 = 1
        L_0x0130:
            r6 = r16
            goto L_0x013c
        L_0x0133:
            r6 = r16
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0155
            r1 = 0
        L_0x013c:
            r7 = r18
            goto L_0x0165
        L_0x013f:
            r6 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0155
            r1 = 12
            goto L_0x013c
        L_0x014a:
            r6 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0155
            r1 = 14
            goto L_0x013c
        L_0x0155:
            r7 = r18
            goto L_0x0164
        L_0x0158:
            r6 = r16
            r7 = r18
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0164
            r1 = 2
            goto L_0x0165
        L_0x0164:
            r1 = -1
        L_0x0165:
            java.lang.String r16 = "undefined"
            r17 = r2
            r18 = r3
            r2 = r0
            r0 = r19
            java.lang.String r3 = r0.f5509a
            switch(r1) {
                case 0: goto L_0x05d3;
                case 1: goto L_0x059c;
                case 2: goto L_0x055a;
                case 3: goto L_0x0509;
                case 4: goto L_0x04af;
                case 5: goto L_0x0463;
                case 6: goto L_0x03e5;
                case 7: goto L_0x039b;
                case 8: goto L_0x0308;
                case 9: goto L_0x0257;
                case 10: goto L_0x01de;
                case 11: goto L_0x01cd;
                case 12: goto L_0x01bc;
                case 13: goto L_0x01a7;
                case 14: goto L_0x019f;
                case 15: goto L_0x018c;
                case 16: goto L_0x017b;
                default: goto L_0x0173;
            }
        L_0x0173:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x017b:
            r1 = 0
            r6 = r22
            com.google.android.gms.internal.measurement.f4.h(r15, r1, r6)
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.lang.String r2 = r3.trim()
            r1.<init>(r2)
            goto L_0x0614
        L_0x018c:
            r6 = r22
            r1 = 0
            com.google.android.gms.internal.measurement.f4.h(r15, r1, r6)
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r3.toUpperCase(r2)
            r1.<init>(r2)
            goto L_0x0614
        L_0x019f:
            r6 = r22
            r1 = 0
            com.google.android.gms.internal.measurement.f4.h(r4, r1, r6)
            goto L_0x05d1
        L_0x01a7:
            r6 = r22
            r1 = r18
            r2 = 0
            com.google.android.gms.internal.measurement.f4.h(r1, r2, r6)
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r3.toLowerCase(r2)
            r1.<init>(r2)
            goto L_0x0614
        L_0x01bc:
            r6 = r22
            r1 = 0
            com.google.android.gms.internal.measurement.f4.h(r2, r1, r6)
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.lang.String r2 = r3.toLowerCase()
            r1.<init>(r2)
            goto L_0x0614
        L_0x01cd:
            r6 = r22
            r1 = 0
            com.google.android.gms.internal.measurement.f4.h(r5, r1, r6)
            com.google.android.gms.internal.measurement.s r1 = new com.google.android.gms.internal.measurement.s
            java.lang.String r2 = r3.toUpperCase()
            r1.<init>(r2)
            goto L_0x0614
        L_0x01de:
            r6 = r22
            r1 = 2
            r2 = 0
            com.google.android.gms.internal.measurement.f4.j(r10, r1, r6)
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x0205
            java.lang.Object r1 = r6.get(r2)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            r2 = r21
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.f4.a(r4)
            int r1 = (int) r4
            goto L_0x0208
        L_0x0205:
            r2 = r21
            r1 = 0
        L_0x0208:
            int r4 = r22.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0227
            java.lang.Object r4 = r6.get(r5)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r2 = r2.m(r4)
            java.lang.Double r2 = r2.zzh()
            double r4 = r2.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.f4.a(r4)
            int r2 = (int) r4
            goto L_0x022b
        L_0x0227:
            int r2 = r3.length()
        L_0x022b:
            r4 = 0
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r3.length()
            int r1 = java.lang.Math.min(r1, r5)
            int r2 = java.lang.Math.max(r2, r4)
            int r4 = r3.length()
            int r2 = java.lang.Math.min(r2, r4)
            com.google.android.gms.internal.measurement.s r4 = new com.google.android.gms.internal.measurement.s
            int r5 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.String r1 = r3.substring(r5, r1)
            r4.<init>(r1)
            goto L_0x0595
        L_0x0257:
            r2 = r21
            r6 = r22
            r1 = 2
            com.google.android.gms.internal.measurement.f4.j(r11, r1, r6)
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0276
            com.google.android.gms.internal.measurement.e r1 = new com.google.android.gms.internal.measurement.e
            r2 = 1
            com.google.android.gms.internal.measurement.o[] r2 = new com.google.android.gms.internal.measurement.o[r2]
            r3 = 0
            r2[r3] = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            goto L_0x0614
        L_0x0276:
            r1 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r22.isEmpty()
            if (r5 == 0) goto L_0x0287
            r4.add(r0)
            goto L_0x0301
        L_0x0287:
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.String r1 = r1.zzi()
            int r5 = r22.size()
            r7 = 1
            if (r5 <= r7) goto L_0x02b3
            java.lang.Object r5 = r6.get(r7)
            com.google.android.gms.internal.measurement.o r5 = (com.google.android.gms.internal.measurement.o) r5
            com.google.android.gms.internal.measurement.o r2 = r2.m(r5)
            java.lang.Double r2 = r2.zzh()
            double r5 = r2.doubleValue()
            long r5 = com.google.android.gms.internal.measurement.f4.d(r5)
            goto L_0x02b6
        L_0x02b3:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02b6:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x02c3
            com.google.android.gms.internal.measurement.e r1 = new com.google.android.gms.internal.measurement.e
            r1.<init>()
            goto L_0x0614
        L_0x02c3:
            java.lang.String r2 = java.util.regex.Pattern.quote(r1)
            int r7 = (int) r5
            int r7 = r7 + 1
            java.lang.String[] r2 = r3.split(r2, r7)
            int r3 = r2.length
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02e9
            if (r3 <= 0) goto L_0x02e9
            r1 = 0
            r1 = r2[r1]
            boolean r1 = r1.isEmpty()
            int r7 = r3 + -1
            r8 = r2[r7]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x02eb
            goto L_0x02ea
        L_0x02e9:
            r1 = 0
        L_0x02ea:
            r7 = r3
        L_0x02eb:
            long r8 = (long) r3
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x02f2
            int r7 = r7 + -1
        L_0x02f2:
            if (r1 >= r7) goto L_0x0301
            com.google.android.gms.internal.measurement.s r3 = new com.google.android.gms.internal.measurement.s
            r5 = r2[r1]
            r3.<init>(r5)
            r4.add(r3)
            int r1 = r1 + 1
            goto L_0x02f2
        L_0x0301:
            com.google.android.gms.internal.measurement.e r1 = new com.google.android.gms.internal.measurement.e
            r1.<init>(r4)
            goto L_0x0614
        L_0x0308:
            r2 = r21
            r6 = r22
            r1 = 2
            com.google.android.gms.internal.measurement.f4.j(r12, r1, r6)
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x032a
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
            goto L_0x032c
        L_0x032a:
            r4 = 0
        L_0x032c:
            double r4 = com.google.android.gms.internal.measurement.f4.a(r4)
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0341
            int r1 = r3.length()
            double r9 = (double) r1
            double r9 = r9 + r4
            double r4 = java.lang.Math.max(r9, r7)
            goto L_0x034a
        L_0x0341:
            int r1 = r3.length()
            double r7 = (double) r1
            double r4 = java.lang.Math.min(r4, r7)
        L_0x034a:
            int r1 = r22.size()
            r7 = 1
            if (r1 <= r7) goto L_0x0364
            java.lang.Object r1 = r6.get(r7)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            goto L_0x0369
        L_0x0364:
            int r1 = r3.length()
            double r1 = (double) r1
        L_0x0369:
            double r1 = com.google.android.gms.internal.measurement.f4.a(r1)
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x037e
            int r8 = r3.length()
            double r8 = (double) r8
            double r8 = r8 + r1
            double r1 = java.lang.Math.max(r8, r6)
            goto L_0x0387
        L_0x037e:
            int r6 = r3.length()
            double r6 = (double) r6
            double r1 = java.lang.Math.min(r1, r6)
        L_0x0387:
            int r4 = (int) r4
            int r1 = (int) r1
            int r1 = r1 - r4
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = r1 + r4
            com.google.android.gms.internal.measurement.s r2 = new com.google.android.gms.internal.measurement.s
            java.lang.String r1 = r3.substring(r4, r1)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x039b:
            r2 = r21
            r6 = r22
            r1 = r17
            r4 = 0
            r5 = 1
            com.google.android.gms.internal.measurement.f4.j(r1, r5, r6)
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x03ba
            java.lang.Object r1 = r6.get(r4)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.String r16 = r1.zzi()
        L_0x03ba:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r16)
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x03d8
            com.google.android.gms.internal.measurement.h r2 = new com.google.android.gms.internal.measurement.h
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x03d8:
            com.google.android.gms.internal.measurement.h r1 = new com.google.android.gms.internal.measurement.h
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            goto L_0x0614
        L_0x03e5:
            r2 = r21
            r6 = r22
            r1 = 2
            com.google.android.gms.internal.measurement.f4.j(r9, r1, r6)
            com.google.android.gms.internal.measurement.t r1 = com.google.android.gms.internal.measurement.o.f5428j
            boolean r4 = r22.isEmpty()
            if (r4 != 0) goto L_0x0415
            r4 = 0
            java.lang.Object r4 = r6.get(r4)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r2.m(r4)
            java.lang.String r16 = r4.zzi()
            int r4 = r22.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0415
            java.lang.Object r1 = r6.get(r5)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
        L_0x0415:
            r4 = r16
            int r5 = r3.indexOf(r4)
            if (r5 < 0) goto L_0x05d1
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.i
            if (r6 == 0) goto L_0x0446
            com.google.android.gms.internal.measurement.i r1 = (com.google.android.gms.internal.measurement.i) r1
            r6 = 3
            com.google.android.gms.internal.measurement.o[] r6 = new com.google.android.gms.internal.measurement.o[r6]
            com.google.android.gms.internal.measurement.s r7 = new com.google.android.gms.internal.measurement.s
            r7.<init>(r4)
            r8 = 0
            r6[r8] = r7
            double r7 = (double) r5
            com.google.android.gms.internal.measurement.h r9 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r9.<init>(r7)
            r7 = 1
            r6[r7] = r9
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.o r1 = r1.e(r2, r6)
        L_0x0446:
            com.google.android.gms.internal.measurement.s r2 = new com.google.android.gms.internal.measurement.s
            r6 = 0
            java.lang.String r6 = r3.substring(r6, r5)
            java.lang.String r1 = r1.zzi()
            int r4 = r4.length()
            int r4 = r4 + r5
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r1 = h0.e.b(r6, r1, r3)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x0463:
            r2 = r21
            r6 = r22
            r1 = 1
            com.google.android.gms.internal.measurement.f4.j(r13, r1, r6)
            int r1 = r22.size()
            if (r1 > 0) goto L_0x0474
            java.lang.String r1 = ""
            goto L_0x0483
        L_0x0474:
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.String r1 = r1.zzi()
        L_0x0483:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.e r2 = new com.google.android.gms.internal.measurement.e
            r3 = 1
            com.google.android.gms.internal.measurement.o[] r3 = new com.google.android.gms.internal.measurement.o[r3]
            com.google.android.gms.internal.measurement.s r4 = new com.google.android.gms.internal.measurement.s
            java.lang.String r1 = r1.group()
            r4.<init>(r1)
            r1 = 0
            r3[r1] = r4
            java.util.List r1 = java.util.Arrays.asList(r3)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x04ab:
            com.google.android.gms.internal.measurement.m r1 = com.google.android.gms.internal.measurement.o.f5429k
            goto L_0x0614
        L_0x04af:
            r2 = r21
            r6 = r22
            r1 = 2
            r4 = 0
            com.google.android.gms.internal.measurement.f4.j(r14, r1, r6)
            int r5 = r22.size()
            if (r5 > 0) goto L_0x04bf
            goto L_0x04cd
        L_0x04bf:
            java.lang.Object r4 = r6.get(r4)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r2.m(r4)
            java.lang.String r16 = r4.zzi()
        L_0x04cd:
            r4 = r16
            int r5 = r22.size()
            if (r5 >= r1) goto L_0x04d8
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x04eb
        L_0x04d8:
            r1 = 1
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
        L_0x04eb:
            boolean r5 = java.lang.Double.isNaN(r1)
            if (r5 == 0) goto L_0x04f4
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x04f8
        L_0x04f4:
            double r1 = com.google.android.gms.internal.measurement.f4.a(r1)
        L_0x04f8:
            int r1 = (int) r1
            com.google.android.gms.internal.measurement.h r2 = new com.google.android.gms.internal.measurement.h
            int r1 = r3.lastIndexOf(r4, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x0509:
            r2 = r21
            r6 = r22
            r1 = 2
            r4 = 0
            com.google.android.gms.internal.measurement.f4.j(r8, r1, r6)
            int r7 = r22.size()
            if (r7 > 0) goto L_0x051a
            goto L_0x0529
        L_0x051a:
            r7 = 0
            java.lang.Object r7 = r6.get(r7)
            com.google.android.gms.internal.measurement.o r7 = (com.google.android.gms.internal.measurement.o) r7
            com.google.android.gms.internal.measurement.o r7 = r2.m(r7)
            java.lang.String r16 = r7.zzi()
        L_0x0529:
            r7 = r16
            int r8 = r22.size()
            if (r8 >= r1) goto L_0x0532
            goto L_0x0545
        L_0x0532:
            r1 = 1
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
        L_0x0545:
            double r1 = com.google.android.gms.internal.measurement.f4.a(r4)
            int r1 = (int) r1
            com.google.android.gms.internal.measurement.h r2 = new com.google.android.gms.internal.measurement.h
            int r1 = r3.indexOf(r7, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x055a:
            r2 = r21
            r6 = r22
            r1 = 1
            com.google.android.gms.internal.measurement.f4.h(r7, r1, r6)
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.String r2 = r1.zzi()
            java.lang.String r4 = "length"
            boolean r2 = r4.equals(r2)
            com.google.android.gms.internal.measurement.f r4 = com.google.android.gms.internal.measurement.o.f5432o
            if (r2 == 0) goto L_0x057c
            goto L_0x0595
        L_0x057c:
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r1)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0598
            int r1 = (int) r1
            if (r1 < 0) goto L_0x0598
            int r2 = r3.length()
            if (r1 >= r2) goto L_0x0598
        L_0x0595:
            r1 = r4
            goto L_0x0614
        L_0x0598:
            com.google.android.gms.internal.measurement.f r1 = com.google.android.gms.internal.measurement.o.f5433p
            goto L_0x0614
        L_0x059c:
            r2 = r21
            r6 = r22
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x05d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r3 = 0
        L_0x05ac:
            int r4 = r22.size()
            if (r3 >= r4) goto L_0x05c6
            java.lang.Object r4 = r6.get(r3)
            com.google.android.gms.internal.measurement.o r4 = (com.google.android.gms.internal.measurement.o) r4
            com.google.android.gms.internal.measurement.o r4 = r2.m(r4)
            java.lang.String r4 = r4.zzi()
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x05ac
        L_0x05c6:
            com.google.android.gms.internal.measurement.s r2 = new com.google.android.gms.internal.measurement.s
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
        L_0x05cf:
            r1 = r2
            goto L_0x0614
        L_0x05d1:
            r1 = r0
            goto L_0x0614
        L_0x05d3:
            r2 = r21
            r1 = r22
            r4 = 1
            com.google.android.gms.internal.measurement.f4.j(r6, r4, r1)
            boolean r4 = r22.isEmpty()
            if (r4 != 0) goto L_0x05fa
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r2.m(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = com.google.android.gms.internal.measurement.f4.a(r1)
            int r1 = (int) r1
            goto L_0x05fb
        L_0x05fa:
            r1 = 0
        L_0x05fb:
            if (r1 < 0) goto L_0x0612
            int r2 = r3.length()
            if (r1 < r2) goto L_0x0604
            goto L_0x0612
        L_0x0604:
            com.google.android.gms.internal.measurement.s r2 = new com.google.android.gms.internal.measurement.s
            char r1 = r3.charAt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            goto L_0x05cf
        L_0x0612:
            com.google.android.gms.internal.measurement.s r1 = com.google.android.gms.internal.measurement.o.f5434q
        L_0x0614:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s.c(java.lang.String, j1.c, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f5509a.equals(((s) obj).f5509a);
    }

    public final int hashCode() {
        return this.f5509a.hashCode();
    }

    public final Iterator iterator() {
        return new r(this);
    }

    public final String toString() {
        return g.a(new StringBuilder("\""), this.f5509a, "\"");
    }

    public final o zzd() {
        return new s(this.f5509a);
    }

    public final Boolean zzg() {
        return Boolean.valueOf(!this.f5509a.isEmpty());
    }

    public final Double zzh() {
        String str = this.f5509a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String zzi() {
        return this.f5509a;
    }

    public final Iterator zzl() {
        return new q(this);
    }
}
