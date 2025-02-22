package ca;

import android.util.JsonReader;
import ba.b;
import ba.c;
import ba.c0;
import ba.p;
import ba.s;
import j0.o;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import la.d;
import la.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3872a;

    /* renamed from: ca.a$a  reason: collision with other inner class name */
    public interface C0060a<T> {
        T b(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        ba.a.f3294a.a(eVar);
        eVar.f11049d = true;
        f3872a = new d(eVar);
    }

    public static s a(JsonReader jsonReader) {
        s.a aVar = new s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    aVar.f3568d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f3566b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f3565a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f3567c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f3569e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static ba.e b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = str3.concat(" value");
        }
        if (str3.isEmpty()) {
            return new ba.e(str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static c c(JsonReader jsonReader) {
        c.a aVar = new c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 8;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    aVar.f3458i = d(jsonReader, new j0.e());
                    break;
                case 1:
                    aVar.f3450a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    aVar.f3454e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f3455f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    aVar.f3456g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f3451b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    aVar.f3452c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    aVar.f3457h = jsonReader.nextString();
                    break;
                case 8:
                    aVar.f3453d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> c0<T> d(JsonReader jsonReader, C0060a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.b(jsonReader));
        }
        jsonReader.endArray();
        return new c0<>(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ba.l e(android.util.JsonReader r23) {
        /*
            r0 = r23
            ba.l$a r1 = new ba.l$a
            r1.<init>()
            r23.beginObject()
        L_0x000a:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x03a6
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 4
            r6 = 1
            r7 = 2
            switch(r3) {
                case -1335157162: goto L_0x004f;
                case 96801: goto L_0x0044;
                case 107332: goto L_0x0039;
                case 3575610: goto L_0x002e;
                case 55126294: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x005a
        L_0x0023:
            java.lang.String r3 = "timestamp"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r2 = r5
            goto L_0x005b
        L_0x002e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            r2 = r4
            goto L_0x005b
        L_0x0039:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            r2 = r7
            goto L_0x005b
        L_0x0044:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            r2 = r6
            goto L_0x005b
        L_0x004f:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            r3 = 5
            if (r2 == 0) goto L_0x02ef
            java.lang.String r8 = "Missing required properties:"
            java.lang.String r9 = ""
            r10 = 0
            if (r2 == r6) goto L_0x00d6
            if (r2 == r7) goto L_0x008b
            if (r2 == r4) goto L_0x007a
            if (r2 == r5) goto L_0x006f
            r23.skipValue()
            goto L_0x000a
        L_0x006f:
            long r2 = r23.nextLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f3521a = r2
            goto L_0x000a
        L_0x007a:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x0083
            r1.f3522b = r2
            goto L_0x000a
        L_0x0083:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null type"
            r0.<init>(r1)
            throw r0
        L_0x008b:
            r23.beginObject()
        L_0x008e:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x00b6
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            java.lang.String r3 = "content"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00a7
            r23.skipValue()
            goto L_0x008e
        L_0x00a7:
            java.lang.String r10 = r23.nextString()
            if (r10 == 0) goto L_0x00ae
            goto L_0x008e
        L_0x00ae:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null content"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r23.endObject()
            if (r10 != 0) goto L_0x00bd
            java.lang.String r9 = " content"
        L_0x00bd:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00cc
            ba.u r2 = new ba.u
            r2.<init>(r10)
            r1.f3525e = r2
            goto L_0x000a
        L_0x00cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.concat(r9)
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            r23.beginObject()
            r2 = r10
            r12 = r2
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x00de:
            boolean r11 = r23.hasNext()
            if (r11 == 0) goto L_0x02c2
            java.lang.String r11 = r23.nextName()
            r11.getClass()
            int r16 = r11.hashCode()
            switch(r16) {
                case -1332194002: goto L_0x011f;
                case -1090974952: goto L_0x0114;
                case -80231855: goto L_0x0109;
                case 555169704: goto L_0x00fe;
                case 928737948: goto L_0x00f3;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x012a
        L_0x00f3:
            java.lang.String r7 = "uiOrientation"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x00fc
            goto L_0x012a
        L_0x00fc:
            r7 = r5
            goto L_0x012b
        L_0x00fe:
            java.lang.String r7 = "customAttributes"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x0107
            goto L_0x012a
        L_0x0107:
            r7 = r4
            goto L_0x012b
        L_0x0109:
            java.lang.String r7 = "internalKeys"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x0112
            goto L_0x012a
        L_0x0112:
            r7 = 2
            goto L_0x012b
        L_0x0114:
            java.lang.String r7 = "execution"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x011d
            goto L_0x012a
        L_0x011d:
            r7 = r6
            goto L_0x012b
        L_0x011f:
            java.lang.String r7 = "background"
            boolean r7 = r11.equals(r7)
            if (r7 != 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r7 = 0
            goto L_0x012b
        L_0x012a:
            r7 = -1
        L_0x012b:
            switch(r7) {
                case 0: goto L_0x02b4;
                case 1: goto L_0x0166;
                case 2: goto L_0x015a;
                case 3: goto L_0x013b;
                case 4: goto L_0x0132;
                default: goto L_0x012e;
            }
        L_0x012e:
            r23.skipValue()
            goto L_0x0163
        L_0x0132:
            int r2 = r23.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0163
        L_0x013b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r23.beginArray()
        L_0x0143:
            boolean r11 = r23.hasNext()
            if (r11 == 0) goto L_0x0151
            ba.e r11 = b(r23)
            r7.add(r11)
            goto L_0x0143
        L_0x0151:
            r23.endArray()
            ba.c0 r13 = new ba.c0
            r13.<init>(r7)
            goto L_0x0163
        L_0x015a:
            j0.o r7 = new j0.o
            r7.<init>(r3)
            ba.c0 r14 = d(r0, r7)
        L_0x0163:
            r7 = 2
            goto L_0x00de
        L_0x0166:
            r23.beginObject()
            r18 = r10
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
        L_0x0173:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x028b
            java.lang.String r3 = r23.nextName()
            r3.getClass()
            int r7 = r3.hashCode()
            switch(r7) {
                case -1375141843: goto L_0x01b4;
                case -1337936983: goto L_0x01a9;
                case -902467928: goto L_0x019e;
                case 937615455: goto L_0x0193;
                case 1481625679: goto L_0x0188;
                default: goto L_0x0187;
            }
        L_0x0187:
            goto L_0x01bf
        L_0x0188:
            java.lang.String r7 = "exception"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0191
            goto L_0x01bf
        L_0x0191:
            r3 = r5
            goto L_0x01c0
        L_0x0193:
            java.lang.String r7 = "binaries"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x019c
            goto L_0x01bf
        L_0x019c:
            r3 = r4
            goto L_0x01c0
        L_0x019e:
            java.lang.String r7 = "signal"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x01a7
            goto L_0x01bf
        L_0x01a7:
            r3 = 2
            goto L_0x01c0
        L_0x01a9:
            java.lang.String r7 = "threads"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x01b2
            goto L_0x01bf
        L_0x01b2:
            r3 = r6
            goto L_0x01c0
        L_0x01b4:
            java.lang.String r7 = "appExitInfo"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r3 = 0
            goto L_0x01c0
        L_0x01bf:
            r3 = -1
        L_0x01c0:
            switch(r3) {
                case 0: goto L_0x0282;
                case 1: goto L_0x0276;
                case 2: goto L_0x01d6;
                case 3: goto L_0x01cc;
                case 4: goto L_0x01c7;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r23.skipValue()
            goto L_0x0173
        L_0x01c7:
            ba.p r19 = f(r23)
            goto L_0x0173
        L_0x01cc:
            k6.q r3 = new k6.q
            r3.<init>(r4)
            ba.c0 r22 = d(r0, r3)
            goto L_0x0173
        L_0x01d6:
            r23.beginObject()
            r3 = r10
            r4 = r3
            r5 = r4
        L_0x01dc:
            boolean r7 = r23.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.String r7 = r23.nextName()
            r7.getClass()
            int r11 = r7.hashCode()
            switch(r11) {
                case -1147692044: goto L_0x0207;
                case 3059181: goto L_0x01fc;
                case 3373707: goto L_0x01f1;
                default: goto L_0x01f0;
            }
        L_0x01f0:
            goto L_0x0212
        L_0x01f1:
            java.lang.String r11 = "name"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01fa
            goto L_0x0212
        L_0x01fa:
            r7 = 2
            goto L_0x0213
        L_0x01fc:
            java.lang.String r11 = "code"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x0205
            goto L_0x0212
        L_0x0205:
            r7 = r6
            goto L_0x0213
        L_0x0207:
            java.lang.String r11 = "address"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x0210
            goto L_0x0212
        L_0x0210:
            r7 = 0
            goto L_0x0213
        L_0x0212:
            r7 = -1
        L_0x0213:
            switch(r7) {
                case 0: goto L_0x0238;
                case 1: goto L_0x0229;
                case 2: goto L_0x021a;
                default: goto L_0x0216;
            }
        L_0x0216:
            r23.skipValue()
            goto L_0x01dc
        L_0x021a:
            java.lang.String r3 = r23.nextString()
            if (r3 == 0) goto L_0x0221
            goto L_0x01dc
        L_0x0221:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null name"
            r0.<init>(r1)
            throw r0
        L_0x0229:
            java.lang.String r4 = r23.nextString()
            if (r4 == 0) goto L_0x0230
            goto L_0x01dc
        L_0x0230:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null code"
            r0.<init>(r1)
            throw r0
        L_0x0238:
            long r11 = r23.nextLong()
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            goto L_0x01dc
        L_0x0241:
            r23.endObject()
            if (r3 != 0) goto L_0x0249
            java.lang.String r6 = " name"
            goto L_0x024a
        L_0x0249:
            r6 = r9
        L_0x024a:
            if (r4 != 0) goto L_0x0252
            java.lang.String r7 = " code"
            java.lang.String r6 = r6.concat(r7)
        L_0x0252:
            if (r5 != 0) goto L_0x025a
            java.lang.String r7 = " address"
            java.lang.String r6 = h4.a.c(r6, r7)
        L_0x025a:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x026c
            ba.q r6 = new ba.q
            long r11 = r5.longValue()
            r6.<init>(r3, r4, r11)
            r21 = r6
            goto L_0x0286
        L_0x026c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.concat(r6)
            r0.<init>(r1)
            throw r0
        L_0x0276:
            j0.f r3 = new j0.f
            r4 = 9
            r3.<init>(r4)
            ba.c0 r18 = d(r0, r3)
            goto L_0x0286
        L_0x0282:
            ba.c r20 = c(r23)
        L_0x0286:
            r4 = 3
            r5 = 4
            r6 = 1
            goto L_0x0173
        L_0x028b:
            r23.endObject()
            if (r21 != 0) goto L_0x0293
            java.lang.String r3 = " signal"
            goto L_0x0294
        L_0x0293:
            r3 = r9
        L_0x0294:
            if (r22 != 0) goto L_0x029c
            java.lang.String r4 = " binaries"
            java.lang.String r3 = r3.concat(r4)
        L_0x029c:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02aa
            ba.n r12 = new ba.n
            r17 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x02bc
        L_0x02aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x02b4:
            boolean r3 = r23.nextBoolean()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
        L_0x02bc:
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 1
            goto L_0x0163
        L_0x02c2:
            r23.endObject()
            if (r12 != 0) goto L_0x02c9
            java.lang.String r9 = " execution"
        L_0x02c9:
            if (r2 != 0) goto L_0x02d1
            java.lang.String r3 = " uiOrientation"
            java.lang.String r9 = r9.concat(r3)
        L_0x02d1:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x02e5
            ba.m r3 = new ba.m
            int r16 = r2.intValue()
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1.f3523c = r3
            goto L_0x000a
        L_0x02e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.concat(r9)
            r0.<init>(r1)
            throw r0
        L_0x02ef:
            ba.t$a r2 = new ba.t$a
            r2.<init>()
            r23.beginObject()
        L_0x02f7:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x039b
            java.lang.String r3 = r23.nextName()
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1708606089: goto L_0x0343;
                case -1455558134: goto L_0x0338;
                case -1439500848: goto L_0x032d;
                case 279795450: goto L_0x0322;
                case 976541947: goto L_0x0317;
                case 1516795582: goto L_0x030c;
                default: goto L_0x030b;
            }
        L_0x030b:
            goto L_0x034e
        L_0x030c:
            java.lang.String r4 = "proximityOn"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0315
            goto L_0x034e
        L_0x0315:
            r3 = 5
            goto L_0x034f
        L_0x0317:
            java.lang.String r4 = "ramUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0320
            goto L_0x034e
        L_0x0320:
            r3 = 4
            goto L_0x034f
        L_0x0322:
            java.lang.String r4 = "diskUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x032b
            goto L_0x034e
        L_0x032b:
            r3 = 3
            goto L_0x034f
        L_0x032d:
            java.lang.String r4 = "orientation"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0336
            goto L_0x034e
        L_0x0336:
            r3 = 2
            goto L_0x034f
        L_0x0338:
            java.lang.String r4 = "batteryVelocity"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0341
            goto L_0x034e
        L_0x0341:
            r3 = 1
            goto L_0x034f
        L_0x0343:
            java.lang.String r4 = "batteryLevel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x034c
            goto L_0x034e
        L_0x034c:
            r3 = 0
            goto L_0x034f
        L_0x034e:
            r3 = -1
        L_0x034f:
            switch(r3) {
                case 0: goto L_0x038f;
                case 1: goto L_0x0383;
                case 2: goto L_0x0377;
                case 3: goto L_0x036c;
                case 4: goto L_0x0361;
                case 5: goto L_0x0356;
                default: goto L_0x0352;
            }
        L_0x0352:
            r23.skipValue()
            goto L_0x02f7
        L_0x0356:
            boolean r3 = r23.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f3578c = r3
            goto L_0x02f7
        L_0x0361:
            long r3 = r23.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f3580e = r3
            goto L_0x02f7
        L_0x036c:
            long r3 = r23.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f3581f = r3
            goto L_0x02f7
        L_0x0377:
            int r3 = r23.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f3579d = r3
            goto L_0x02f7
        L_0x0383:
            int r3 = r23.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f3577b = r3
            goto L_0x02f7
        L_0x038f:
            double r3 = r23.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.f3576a = r3
            goto L_0x02f7
        L_0x039b:
            r23.endObject()
            ba.t r2 = r2.a()
            r1.f3524d = r2
            goto L_0x000a
        L_0x03a6:
            r23.endObject()
            ba.l r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.e(android.util.JsonReader):ba.l");
    }

    public static p f(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        c0 c0Var = null;
        p pVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    c0Var = d(jsonReader, new o(6));
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    if (str != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    pVar = f(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (c0Var == null) {
            str3 = str3.concat(" frames");
        }
        if (num == null) {
            str3 = h4.a.c(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new p(str, str2, c0Var, pVar, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ba.b g(android.util.JsonReader r29) {
        /*
            r0 = r29
            java.nio.charset.Charset r1 = ba.b0.f3440a
            ba.b$a r1 = new ba.b$a
            r1.<init>()
            r29.beginObject()
        L_0x000c:
            boolean r2 = r29.hasNext()
            if (r2 == 0) goto L_0x0539
            java.lang.String r2 = r29.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = 8
            java.lang.String r5 = "buildVersion"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "platform"
            java.lang.String r8 = "displayVersion"
            r13 = 2
            r16 = 1
            r17 = 0
            switch(r3) {
                case -2118372775: goto L_0x0084;
                case -1962630338: goto L_0x0078;
                case -1375141843: goto L_0x006d;
                case -911706486: goto L_0x0064;
                case 344431858: goto L_0x0059;
                case 719853845: goto L_0x0050;
                case 1874684019: goto L_0x0047;
                case 1975623094: goto L_0x003e;
                case 1984987798: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0090
        L_0x0031:
            java.lang.String r3 = "session"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x0090
        L_0x003b:
            r2 = r4
            goto L_0x0091
        L_0x003e:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0045
            goto L_0x0090
        L_0x0045:
            r2 = 7
            goto L_0x0091
        L_0x0047:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x004e
            goto L_0x0090
        L_0x004e:
            r2 = 6
            goto L_0x0091
        L_0x0050:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0057
            goto L_0x0090
        L_0x0057:
            r2 = 5
            goto L_0x0091
        L_0x0059:
            java.lang.String r3 = "gmpAppId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0062
            goto L_0x0090
        L_0x0062:
            r2 = 4
            goto L_0x0091
        L_0x0064:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r2 = 3
            goto L_0x0091
        L_0x006d:
            java.lang.String r3 = "appExitInfo"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0076
            goto L_0x0090
        L_0x0076:
            r2 = r13
            goto L_0x0091
        L_0x0078:
            java.lang.String r3 = "sdkVersion"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0081
            goto L_0x0090
        L_0x0081:
            r2 = r16
            goto L_0x0091
        L_0x0084:
            java.lang.String r3 = "ndkPayload"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r2 = r17
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            java.lang.String r3 = "Null buildVersion"
            java.lang.String r18 = ""
            java.lang.String r9 = "Missing required properties:"
            r19 = 0
            switch(r2) {
                case 0: goto L_0x04e1;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04c7;
                case 3: goto L_0x04b7;
                case 4: goto L_0x04a5;
                case 5: goto L_0x0493;
                case 6: goto L_0x0487;
                case 7: goto L_0x0475;
                case 8: goto L_0x00a1;
                default: goto L_0x009c;
            }
        L_0x009c:
            r29.skipValue()
            goto L_0x000c
        L_0x00a1:
            ba.h$a r2 = new ba.h$a
            r2.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r2.f3484e = r10
            r29.beginObject()
        L_0x00ad:
            boolean r10 = r29.hasNext()
            if (r10 == 0) goto L_0x046a
            java.lang.String r10 = r29.nextName()
            r10.getClass()
            int r20 = r10.hashCode()
            java.lang.String r11 = "identifier"
            switch(r20) {
                case -2128794476: goto L_0x013a;
                case -1618432855: goto L_0x0130;
                case -1606742899: goto L_0x0125;
                case -1335157162: goto L_0x011a;
                case -1291329255: goto L_0x010f;
                case 3556: goto L_0x0104;
                case 96801: goto L_0x00f9;
                case 3599307: goto L_0x00ee;
                case 286956243: goto L_0x00e1;
                case 1025385094: goto L_0x00d3;
                case 2047016109: goto L_0x00c5;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            goto L_0x0146
        L_0x00c5:
            java.lang.String r12 = "generatorType"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00cf
            goto L_0x0146
        L_0x00cf:
            r10 = 10
            goto L_0x0147
        L_0x00d3:
            java.lang.String r12 = "crashed"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00dd
            goto L_0x0146
        L_0x00dd:
            r10 = 9
            goto L_0x0147
        L_0x00e1:
            java.lang.String r12 = "generator"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00eb
            goto L_0x0146
        L_0x00eb:
            r10 = r4
            goto L_0x0147
        L_0x00ee:
            java.lang.String r12 = "user"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00f7
            goto L_0x0146
        L_0x00f7:
            r10 = 7
            goto L_0x0147
        L_0x00f9:
            java.lang.String r12 = "app"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0102
            goto L_0x0146
        L_0x0102:
            r10 = 6
            goto L_0x0147
        L_0x0104:
            java.lang.String r12 = "os"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x010d
            goto L_0x0146
        L_0x010d:
            r10 = 5
            goto L_0x0147
        L_0x010f:
            java.lang.String r12 = "events"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0118
            goto L_0x0146
        L_0x0118:
            r10 = 4
            goto L_0x0147
        L_0x011a:
            java.lang.String r12 = "device"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0123
            goto L_0x0146
        L_0x0123:
            r10 = 3
            goto L_0x0147
        L_0x0125:
            java.lang.String r12 = "endedAt"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x012e
            goto L_0x0146
        L_0x012e:
            r10 = r13
            goto L_0x0147
        L_0x0130:
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0137
            goto L_0x0146
        L_0x0137:
            r10 = r16
            goto L_0x0147
        L_0x013a:
            java.lang.String r12 = "startedAt"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0143
            goto L_0x0146
        L_0x0143:
            r10 = r17
            goto L_0x0147
        L_0x0146:
            r10 = -1
        L_0x0147:
            java.lang.String r12 = "Null identifier"
            java.lang.String r21 = " identifier"
            java.lang.String r14 = "version"
            switch(r10) {
                case 0: goto L_0x045e;
                case 1: goto L_0x044b;
                case 2: goto L_0x043f;
                case 3: goto L_0x032a;
                case 4: goto L_0x031d;
                case 5: goto L_0x0290;
                case 6: goto L_0x01cb;
                case 7: goto L_0x017f;
                case 8: goto L_0x016d;
                case 9: goto L_0x0161;
                case 10: goto L_0x0155;
                default: goto L_0x0150;
            }
        L_0x0150:
            r29.skipValue()
            goto L_0x00ad
        L_0x0155:
            int r10 = r29.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.f3490k = r10
            goto L_0x00ad
        L_0x0161:
            boolean r10 = r29.nextBoolean()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.f3484e = r10
            goto L_0x00ad
        L_0x016d:
            java.lang.String r10 = r29.nextString()
            if (r10 == 0) goto L_0x0177
            r2.f3480a = r10
            goto L_0x00ad
        L_0x0177:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x017f:
            r29.beginObject()
            r10 = r19
        L_0x0184:
            boolean r14 = r29.hasNext()
            if (r14 == 0) goto L_0x01a8
            java.lang.String r14 = r29.nextName()
            r14.getClass()
            boolean r14 = r14.equals(r11)
            if (r14 != 0) goto L_0x019b
            r29.skipValue()
            goto L_0x0184
        L_0x019b:
            java.lang.String r10 = r29.nextString()
            if (r10 == 0) goto L_0x01a2
            goto L_0x0184
        L_0x01a2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x01a8:
            r29.endObject()
            if (r10 != 0) goto L_0x01b0
            r11 = r21
            goto L_0x01b2
        L_0x01b0:
            r11 = r18
        L_0x01b2:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x01c1
            ba.w r11 = new ba.w
            r11.<init>(r10)
            r2.f3486g = r11
            goto L_0x00ad
        L_0x01c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.concat(r11)
            r0.<init>(r1)
            throw r0
        L_0x01cb:
            r29.beginObject()
            r23 = r19
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
        L_0x01da:
            boolean r10 = r29.hasNext()
            if (r10 == 0) goto L_0x0263
            java.lang.String r10 = r29.nextName()
            r10.getClass()
            int r22 = r10.hashCode()
            switch(r22) {
                case -1618432855: goto L_0x0222;
                case -519438642: goto L_0x0216;
                case 213652010: goto L_0x020b;
                case 351608024: goto L_0x0202;
                case 719853845: goto L_0x01f9;
                case 1975623094: goto L_0x01f0;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            r15 = -1
            goto L_0x022b
        L_0x01f0:
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x01f7
            goto L_0x01ee
        L_0x01f7:
            r15 = 5
            goto L_0x022b
        L_0x01f9:
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x0200
            goto L_0x01ee
        L_0x0200:
            r15 = 4
            goto L_0x022b
        L_0x0202:
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x0209
            goto L_0x01ee
        L_0x0209:
            r15 = 3
            goto L_0x022b
        L_0x020b:
            java.lang.String r15 = "developmentPlatformVersion"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0214
            goto L_0x01ee
        L_0x0214:
            r15 = r13
            goto L_0x022b
        L_0x0216:
            java.lang.String r15 = "developmentPlatform"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x021f
            goto L_0x01ee
        L_0x021f:
            r15 = r16
            goto L_0x022b
        L_0x0222:
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0229
            goto L_0x01ee
        L_0x0229:
            r15 = r17
        L_0x022b:
            switch(r15) {
                case 0: goto L_0x0255;
                case 1: goto L_0x0250;
                case 2: goto L_0x024b;
                case 3: goto L_0x023c;
                case 4: goto L_0x0237;
                case 5: goto L_0x0232;
                default: goto L_0x022e;
            }
        L_0x022e:
            r29.skipValue()
            goto L_0x01da
        L_0x0232:
            java.lang.String r25 = r29.nextString()
            goto L_0x01da
        L_0x0237:
            java.lang.String r26 = r29.nextString()
            goto L_0x01da
        L_0x023c:
            java.lang.String r24 = r29.nextString()
            if (r24 == 0) goto L_0x0243
            goto L_0x01da
        L_0x0243:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x024b:
            java.lang.String r28 = r29.nextString()
            goto L_0x01da
        L_0x0250:
            java.lang.String r27 = r29.nextString()
            goto L_0x01da
        L_0x0255:
            java.lang.String r23 = r29.nextString()
            if (r23 == 0) goto L_0x025d
            goto L_0x01da
        L_0x025d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x0263:
            r29.endObject()
            if (r23 != 0) goto L_0x026b
            r10 = r21
            goto L_0x026d
        L_0x026b:
            r10 = r18
        L_0x026d:
            if (r24 != 0) goto L_0x0275
            java.lang.String r11 = " version"
            java.lang.String r10 = r10.concat(r11)
        L_0x0275:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0286
            ba.i r10 = new ba.i
            r22 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r2.f3485f = r10
            goto L_0x00ad
        L_0x0286:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.concat(r10)
            r0.<init>(r1)
            throw r0
        L_0x0290:
            ba.v$a r10 = new ba.v$a
            r10.<init>()
            r29.beginObject()
        L_0x0298:
            boolean r11 = r29.hasNext()
            if (r11 == 0) goto L_0x0312
            java.lang.String r11 = r29.nextName()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -911706486: goto L_0x02cc;
                case -293026577: goto L_0x02c0;
                case 351608024: goto L_0x02b7;
                case 1874684019: goto L_0x02ae;
                default: goto L_0x02ac;
            }
        L_0x02ac:
            r11 = -1
            goto L_0x02d5
        L_0x02ae:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x02b5
            goto L_0x02ac
        L_0x02b5:
            r11 = 3
            goto L_0x02d5
        L_0x02b7:
            boolean r11 = r11.equals(r14)
            if (r11 != 0) goto L_0x02be
            goto L_0x02ac
        L_0x02be:
            r11 = r13
            goto L_0x02d5
        L_0x02c0:
            java.lang.String r12 = "jailbroken"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x02c9
            goto L_0x02ac
        L_0x02c9:
            r11 = r16
            goto L_0x02d5
        L_0x02cc:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x02d3
            goto L_0x02ac
        L_0x02d3:
            r11 = r17
        L_0x02d5:
            switch(r11) {
                case 0: goto L_0x0303;
                case 1: goto L_0x02f8;
                case 2: goto L_0x02e7;
                case 3: goto L_0x02dc;
                default: goto L_0x02d8;
            }
        L_0x02d8:
            r29.skipValue()
            goto L_0x0298
        L_0x02dc:
            int r11 = r29.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f3587a = r11
            goto L_0x0298
        L_0x02e7:
            java.lang.String r11 = r29.nextString()
            if (r11 == 0) goto L_0x02f0
            r10.f3588b = r11
            goto L_0x0298
        L_0x02f0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x02f8:
            boolean r11 = r29.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.f3590d = r11
            goto L_0x0298
        L_0x0303:
            java.lang.String r11 = r29.nextString()
            if (r11 == 0) goto L_0x030c
            r10.f3589c = r11
            goto L_0x0298
        L_0x030c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0312:
            r29.endObject()
            ba.v r10 = r10.a()
            r2.f3487h = r10
            goto L_0x00ad
        L_0x031d:
            j0.f r10 = new j0.f
            r10.<init>(r4)
            ba.c0 r10 = d(r0, r10)
            r2.f3489j = r10
            goto L_0x00ad
        L_0x032a:
            ba.k$a r10 = new ba.k$a
            r10.<init>()
            r29.beginObject()
        L_0x0332:
            boolean r11 = r29.hasNext()
            if (r11 == 0) goto L_0x0434
            java.lang.String r11 = r29.nextName()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1981332476: goto L_0x03a3;
                case -1969347631: goto L_0x0397;
                case 112670: goto L_0x038c;
                case 3002454: goto L_0x0381;
                case 81784169: goto L_0x0376;
                case 94848180: goto L_0x036b;
                case 104069929: goto L_0x0360;
                case 109757585: goto L_0x0355;
                case 2078953423: goto L_0x0349;
                default: goto L_0x0346;
            }
        L_0x0346:
            r11 = -1
            goto L_0x03ae
        L_0x0349:
            java.lang.String r12 = "modelClass"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0352
            goto L_0x0346
        L_0x0352:
            r11 = r4
            goto L_0x03ae
        L_0x0355:
            java.lang.String r12 = "state"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x035e
            goto L_0x0346
        L_0x035e:
            r11 = 7
            goto L_0x03ae
        L_0x0360:
            java.lang.String r12 = "model"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0369
            goto L_0x0346
        L_0x0369:
            r11 = 6
            goto L_0x03ae
        L_0x036b:
            java.lang.String r12 = "cores"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0374
            goto L_0x0346
        L_0x0374:
            r11 = 5
            goto L_0x03ae
        L_0x0376:
            java.lang.String r12 = "diskSpace"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x037f
            goto L_0x0346
        L_0x037f:
            r11 = 4
            goto L_0x03ae
        L_0x0381:
            java.lang.String r12 = "arch"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x038a
            goto L_0x0346
        L_0x038a:
            r11 = 3
            goto L_0x03ae
        L_0x038c:
            java.lang.String r12 = "ram"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0395
            goto L_0x0346
        L_0x0395:
            r11 = r13
            goto L_0x03ae
        L_0x0397:
            java.lang.String r12 = "manufacturer"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03a0
            goto L_0x0346
        L_0x03a0:
            r11 = r16
            goto L_0x03ae
        L_0x03a3:
            java.lang.String r12 = "simulator"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03ac
            goto L_0x0346
        L_0x03ac:
            r11 = r17
        L_0x03ae:
            switch(r11) {
                case 0: goto L_0x0428;
                case 1: goto L_0x0416;
                case 2: goto L_0x040a;
                case 3: goto L_0x03fe;
                case 4: goto L_0x03f2;
                case 5: goto L_0x03e6;
                case 6: goto L_0x03d4;
                case 7: goto L_0x03c8;
                case 8: goto L_0x03b6;
                default: goto L_0x03b1;
            }
        L_0x03b1:
            r29.skipValue()
            goto L_0x0332
        L_0x03b6:
            java.lang.String r11 = r29.nextString()
            if (r11 == 0) goto L_0x03c0
            r10.f3515i = r11
            goto L_0x0332
        L_0x03c0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null modelClass"
            r0.<init>(r1)
            throw r0
        L_0x03c8:
            int r11 = r29.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f3513g = r11
            goto L_0x0332
        L_0x03d4:
            java.lang.String r11 = r29.nextString()
            if (r11 == 0) goto L_0x03de
            r10.f3508b = r11
            goto L_0x0332
        L_0x03de:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null model"
            r0.<init>(r1)
            throw r0
        L_0x03e6:
            int r11 = r29.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f3509c = r11
            goto L_0x0332
        L_0x03f2:
            long r11 = r29.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f3511e = r11
            goto L_0x0332
        L_0x03fe:
            int r11 = r29.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f3507a = r11
            goto L_0x0332
        L_0x040a:
            long r11 = r29.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f3510d = r11
            goto L_0x0332
        L_0x0416:
            java.lang.String r11 = r29.nextString()
            if (r11 == 0) goto L_0x0420
            r10.f3514h = r11
            goto L_0x0332
        L_0x0420:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null manufacturer"
            r0.<init>(r1)
            throw r0
        L_0x0428:
            boolean r11 = r29.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.f3512f = r11
            goto L_0x0332
        L_0x0434:
            r29.endObject()
            ba.k r10 = r10.a()
            r2.f3488i = r10
            goto L_0x00ad
        L_0x043f:
            long r10 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.f3483d = r10
            goto L_0x00ad
        L_0x044b:
            java.lang.String r10 = r29.nextString()
            byte[] r10 = android.util.Base64.decode(r10, r13)
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = ba.b0.f3440a
            r11.<init>(r10, r12)
            r2.f3481b = r11
            goto L_0x00ad
        L_0x045e:
            long r10 = r29.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.f3482c = r10
            goto L_0x00ad
        L_0x046a:
            r29.endObject()
            ba.h r2 = r2.a()
            r1.f3437g = r2
            goto L_0x000c
        L_0x0475:
            java.lang.String r2 = r29.nextString()
            if (r2 == 0) goto L_0x047f
            r1.f3436f = r2
            goto L_0x000c
        L_0x047f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x0487:
            int r2 = r29.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f3433c = r2
            goto L_0x000c
        L_0x0493:
            java.lang.String r2 = r29.nextString()
            if (r2 == 0) goto L_0x049d
            r1.f3434d = r2
            goto L_0x000c
        L_0x049d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x04a5:
            java.lang.String r2 = r29.nextString()
            if (r2 == 0) goto L_0x04af
            r1.f3432b = r2
            goto L_0x000c
        L_0x04af:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x04b7:
            java.lang.String r2 = r29.nextString()
            if (r2 == 0) goto L_0x04c1
            r1.f3435e = r2
            goto L_0x000c
        L_0x04c1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x04c7:
            ba.c r2 = c(r29)
            r1.f3439i = r2
            goto L_0x000c
        L_0x04cf:
            java.lang.String r2 = r29.nextString()
            if (r2 == 0) goto L_0x04d9
            r1.f3431a = r2
            goto L_0x000c
        L_0x04d9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sdkVersion"
            r0.<init>(r1)
            throw r0
        L_0x04e1:
            r29.beginObject()
            r2 = r19
            r3 = r2
        L_0x04e7:
            boolean r4 = r29.hasNext()
            if (r4 == 0) goto L_0x0517
            java.lang.String r4 = r29.nextName()
            r4.getClass()
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x050d
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0508
            r29.skipValue()
            goto L_0x04e7
        L_0x0508:
            java.lang.String r3 = r29.nextString()
            goto L_0x04e7
        L_0x050d:
            k6.q r2 = new k6.q
            r2.<init>(r13)
            ba.c0 r2 = d(r0, r2)
            goto L_0x04e7
        L_0x0517:
            r29.endObject()
            if (r2 != 0) goto L_0x051e
            java.lang.String r18 = " files"
        L_0x051e:
            r4 = r18
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x052f
            ba.f r4 = new ba.f
            r4.<init>(r2, r3)
            r1.f3438h = r4
            goto L_0x000c
        L_0x052f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.concat(r4)
            r0.<init>(r1)
            throw r0
        L_0x0539:
            r29.endObject()
            ba.b r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.g(android.util.JsonReader):ba.b");
    }

    public static b h(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            b g10 = g(jsonReader);
            jsonReader.close();
            return g10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
