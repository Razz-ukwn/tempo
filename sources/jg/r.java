package jg;

import androidx.activity.result.d;
import androidx.appcompat.widget.a1;
import androidx.fragment.app.q;
import d2.f1;
import gf.m;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import sf.j;
import wg.e;
import zf.n;

public final class r {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f10152k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f10153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10154b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10155c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10156d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10157e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f10158f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f10159g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10160h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10161i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10162j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10163a;

        /* renamed from: b  reason: collision with root package name */
        public String f10164b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f10165c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f10166d;

        /* renamed from: e  reason: collision with root package name */
        public int f10167e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f10168f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f10169g;

        /* renamed from: h  reason: collision with root package name */
        public String f10170h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f10168f = arrayList;
            arrayList.add("");
        }

        public final r a() {
            ArrayList arrayList;
            String str = this.f10163a;
            if (str != null) {
                String d10 = b.d(this.f10164b, 0, 0, false, 7);
                String d11 = b.d(this.f10165c, 0, 0, false, 7);
                String str2 = this.f10166d;
                if (str2 != null) {
                    int b10 = b();
                    ArrayList arrayList2 = this.f10168f;
                    ArrayList arrayList3 = new ArrayList(m.n0(arrayList2));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.d((String) it.next(), 0, 0, false, 7));
                    }
                    List<String> list = this.f10169g;
                    String str3 = null;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        Iterable<String> iterable = list;
                        arrayList = new ArrayList(m.n0(iterable));
                        for (String str4 : iterable) {
                            arrayList.add(str4 == null ? null : b.d(str4, 0, 0, true, 3));
                        }
                    }
                    String str5 = this.f10170h;
                    if (str5 != null) {
                        str3 = b.d(str5, 0, 0, false, 7);
                    }
                    return new r(str, d10, d11, str2, b10, arrayList3, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i8 = this.f10167e;
            if (i8 != -1) {
                return i8;
            }
            String str = this.f10163a;
            j.c(str);
            if (j.a(str, "http")) {
                return 80;
            }
            return j.a(str, "https") ? 443 : -1;
        }

        public final void c(String str) {
            this.f10169g = str == null ? null : b.e(b.a(str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0285, code lost:
            if ((1 <= r10 && r10 < 65536) != false) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
            if (r8 == ':') goto L_0x00a2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x02e4  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x02e6  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02e9  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x02f4  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x041e  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0433  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0101 A[EDGE_INSN: B:215:0x0101->B:67:0x0101 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x0248 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x015c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(jg.r r32, java.lang.String r33) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                r11 = r33
                java.lang.String r2 = "input"
                sf.j.f(r11, r2)
                byte[] r2 = kg.b.f10474a
                int r2 = r33.length()
                r12 = 0
                int r2 = kg.b.n(r12, r2, r11)
                int r3 = r33.length()
                int r13 = kg.b.o(r2, r3, r11)
                int r3 = r13 - r2
                r14 = 91
                r4 = 2
                r15 = 58
                r10 = -1
                r9 = 1
                if (r3 >= r4) goto L_0x002b
                goto L_0x00a1
            L_0x002b:
                char r3 = r11.charAt(r2)
                r5 = 97
                int r6 = sf.j.h(r3, r5)
                r7 = 65
                if (r6 < 0) goto L_0x0041
                r6 = 122(0x7a, float:1.71E-43)
                int r6 = sf.j.h(r3, r6)
                if (r6 <= 0) goto L_0x0051
            L_0x0041:
                int r6 = sf.j.h(r3, r7)
                if (r6 < 0) goto L_0x00a1
                r6 = 90
                int r3 = sf.j.h(r3, r6)
                if (r3 <= 0) goto L_0x0051
                goto L_0x00a1
            L_0x0051:
                int r3 = r2 + 1
            L_0x0053:
                if (r3 >= r13) goto L_0x00a1
                int r6 = r3 + 1
                char r8 = r11.charAt(r3)
                if (r5 > r8) goto L_0x0063
                r5 = 123(0x7b, float:1.72E-43)
                if (r8 >= r5) goto L_0x0063
                r5 = r9
                goto L_0x0064
            L_0x0063:
                r5 = r12
            L_0x0064:
                if (r5 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                if (r7 > r8) goto L_0x006d
                if (r8 >= r14) goto L_0x006d
            L_0x006b:
                r5 = r9
                goto L_0x006e
            L_0x006d:
                r5 = r12
            L_0x006e:
                if (r5 == 0) goto L_0x0071
                goto L_0x0077
            L_0x0071:
                r5 = 48
                if (r5 > r8) goto L_0x0079
                if (r8 >= r15) goto L_0x0079
            L_0x0077:
                r5 = r9
                goto L_0x007a
            L_0x0079:
                r5 = r12
            L_0x007a:
                if (r5 == 0) goto L_0x007d
                goto L_0x0081
            L_0x007d:
                r5 = 43
                if (r8 != r5) goto L_0x0083
            L_0x0081:
                r5 = r9
                goto L_0x0084
            L_0x0083:
                r5 = r12
            L_0x0084:
                if (r5 == 0) goto L_0x0087
                goto L_0x008b
            L_0x0087:
                r5 = 45
                if (r8 != r5) goto L_0x008d
            L_0x008b:
                r5 = r9
                goto L_0x008e
            L_0x008d:
                r5 = r12
            L_0x008e:
                if (r5 == 0) goto L_0x0091
                goto L_0x0095
            L_0x0091:
                r5 = 46
                if (r8 != r5) goto L_0x0097
            L_0x0095:
                r5 = r9
                goto L_0x0098
            L_0x0097:
                r5 = r12
            L_0x0098:
                if (r5 == 0) goto L_0x009e
                r3 = r6
                r5 = 97
                goto L_0x0053
            L_0x009e:
                if (r8 != r15) goto L_0x00a1
                goto L_0x00a2
            L_0x00a1:
                r3 = r10
            L_0x00a2:
                java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
                if (r3 == r10) goto L_0x00e4
                java.lang.String r5 = "https:"
                boolean r5 = zf.j.w0(r2, r11, r5, r9)
                if (r5 == 0) goto L_0x00b5
                java.lang.String r3 = "https"
                r0.f10163a = r3
                int r2 = r2 + 6
                goto L_0x00ea
            L_0x00b5:
                java.lang.String r5 = "http:"
                boolean r5 = zf.j.w0(r2, r11, r5, r9)
                if (r5 == 0) goto L_0x00c4
                java.lang.String r3 = "http"
                r0.f10163a = r3
                int r2 = r2 + 5
                goto L_0x00ea
            L_0x00c4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r4)
                java.lang.String r3 = r11.substring(r12, r3)
                sf.j.e(r3, r8)
                r2.append(r3)
                r3 = 39
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00e4:
                if (r1 == 0) goto L_0x0455
                java.lang.String r3 = r1.f10153a
                r0.f10163a = r3
            L_0x00ea:
                r3 = r2
                r5 = r12
            L_0x00ec:
                r7 = 92
                r6 = 47
                if (r3 >= r13) goto L_0x0101
                int r16 = r3 + 1
                char r3 = r11.charAt(r3)
                if (r3 == r7) goto L_0x00fc
                if (r3 != r6) goto L_0x0101
            L_0x00fc:
                int r5 = r5 + 1
                r3 = r16
                goto L_0x00ec
            L_0x0101:
                java.util.ArrayList r3 = r0.f10168f
                r12 = 63
                r14 = 35
                if (r5 >= r4) goto L_0x0149
                if (r1 == 0) goto L_0x0149
                java.lang.String r4 = r0.f10163a
                java.lang.String r9 = r1.f10153a
                boolean r4 = sf.j.a(r9, r4)
                if (r4 != 0) goto L_0x0116
                goto L_0x0149
            L_0x0116:
                java.lang.String r4 = r32.e()
                r0.f10164b = r4
                java.lang.String r4 = r32.a()
                r0.f10165c = r4
                java.lang.String r4 = r1.f10156d
                r0.f10166d = r4
                int r4 = r1.f10157e
                r0.f10167e = r4
                r3.clear()
                java.util.ArrayList r4 = r32.c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x013c
                char r4 = r11.charAt(r2)
                if (r4 != r14) goto L_0x0143
            L_0x013c:
                java.lang.String r1 = r32.d()
                r0.c(r1)
            L_0x0143:
                r18 = r3
                r10 = 0
                r15 = 1
                goto L_0x02ea
            L_0x0149:
                int r2 = r2 + r5
                r9 = r2
                r19 = 0
                r20 = 0
            L_0x014f:
                java.lang.String r1 = "@/\\?#"
                int r5 = kg.b.g(r11, r9, r13, r1)
                if (r5 == r13) goto L_0x015c
                char r1 = r11.charAt(r5)
                goto L_0x015d
            L_0x015c:
                r1 = r10
            L_0x015d:
                if (r1 == r10) goto L_0x0221
                if (r1 == r14) goto L_0x0221
                if (r1 == r6) goto L_0x0221
                if (r1 == r7) goto L_0x0221
                if (r1 == r12) goto L_0x0221
                r2 = 64
                if (r1 == r2) goto L_0x016c
                goto L_0x014f
            L_0x016c:
                java.lang.String r4 = "%40"
                if (r19 != 0) goto L_0x01dc
                int r2 = kg.b.f(r11, r15, r9, r5)
                java.lang.String r21 = " \"':;<=>@[]^`{}|/\\?#"
                r22 = 1
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 240(0xf0, float:3.36E-43)
                r1 = r33
                r32 = r2
                r2 = r9
                r9 = r3
                r3 = r32
                r14 = r4
                r4 = r21
                r12 = r5
                r5 = r22
                r6 = r23
                r7 = r24
                r28 = r8
                r8 = r25
                r18 = r9
                r15 = 1
                r9 = r26
                r10 = r27
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r20 == 0) goto L_0x01b9
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f10164b
                r2.append(r3)
                r2.append(r14)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x01b9:
                r0.f10164b = r1
                r1 = r32
                if (r1 == r12) goto L_0x01d5
                int r2 = r1 + 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 240(0xf0, float:3.36E-43)
                r1 = r33
                r3 = r12
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.f10165c = r1
                r9 = r15
                goto L_0x01d7
            L_0x01d5:
                r9 = r19
            L_0x01d7:
                r19 = r9
                r20 = r15
                goto L_0x020e
            L_0x01dc:
                r18 = r3
                r14 = r4
                r12 = r5
                r28 = r8
                r15 = 1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = r0.f10165c
                r10.append(r1)
                r10.append(r14)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r14 = 0
                r23 = 240(0xf0, float:3.36E-43)
                r1 = r33
                r2 = r9
                r3 = r12
                r9 = r14
                r14 = r10
                r10 = r23
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f10165c = r1
            L_0x020e:
                int r9 = r12 + 1
                r3 = r18
                r8 = r28
                r6 = 47
                r7 = 92
                r10 = -1
                r12 = 63
                r14 = 35
                r15 = 58
                goto L_0x014f
            L_0x0221:
                r18 = r3
                r12 = r5
                r28 = r8
                r15 = 1
                r5 = r9
            L_0x0228:
                if (r5 >= r12) goto L_0x0248
                char r1 = r11.charAt(r5)
                r2 = 91
                if (r1 != r2) goto L_0x0240
            L_0x0232:
                int r5 = r5 + r15
                if (r5 >= r12) goto L_0x023d
                char r1 = r11.charAt(r5)
                r3 = 93
                if (r1 != r3) goto L_0x0232
            L_0x023d:
                r3 = 58
                goto L_0x0246
            L_0x0240:
                r3 = 58
                if (r1 != r3) goto L_0x0246
                r14 = r5
                goto L_0x0249
            L_0x0246:
                int r5 = r5 + r15
                goto L_0x0228
            L_0x0248:
                r14 = r12
            L_0x0249:
                int r10 = r14 + 1
                r8 = 34
                r1 = 4
                if (r10 >= r12) goto L_0x02c7
                r2 = 0
                java.lang.String r1 = jg.r.b.d(r11, r9, r14, r2, r1)
                java.lang.String r1 = d2.f1.N(r1)
                r0.f10166d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r17 = 0
                r19 = 0
                r20 = 248(0xf8, float:3.48E-43)
                r1 = r33
                r2 = r10
                r3 = r12
                r8 = r17
                r29 = r9
                r9 = r19
                r30 = r10
                r10 = r20
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NumberFormatException -> 0x028c }
                int r10 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x028c }
                if (r15 > r10) goto L_0x0284
                r1 = 65536(0x10000, float:9.18355E-41)
                if (r10 >= r1) goto L_0x0284
                r9 = r15
                goto L_0x0285
            L_0x0284:
                r9 = 0
            L_0x0285:
                if (r9 == 0) goto L_0x028c
                goto L_0x028d
            L_0x0288:
                r29 = r9
                r30 = r10
            L_0x028c:
                r10 = -1
            L_0x028d:
                r0.f10167e = r10
                r1 = -1
                if (r10 == r1) goto L_0x0294
                r9 = r15
                goto L_0x0295
            L_0x0294:
                r9 = 0
            L_0x0295:
                if (r9 == 0) goto L_0x029f
                r3 = r28
                r9 = r29
                r2 = 34
                r10 = 0
                goto L_0x02e0
            L_0x029f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid URL port: \""
                r1.<init>(r2)
                r14 = r30
                java.lang.String r2 = r11.substring(r14, r12)
                r3 = r28
                sf.j.e(r2, r3)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x02c7:
                r2 = r8
                r3 = r28
                r10 = 0
                java.lang.String r1 = jg.r.b.d(r11, r9, r14, r10, r1)
                java.lang.String r1 = d2.f1.N(r1)
                r0.f10166d = r1
                java.lang.String r1 = r0.f10163a
                sf.j.c(r1)
                int r1 = jg.r.b.b(r1)
                r0.f10167e = r1
            L_0x02e0:
                java.lang.String r1 = r0.f10166d
                if (r1 == 0) goto L_0x02e6
                r1 = r15
                goto L_0x02e7
            L_0x02e6:
                r1 = r10
            L_0x02e7:
                if (r1 == 0) goto L_0x0433
                r2 = r12
            L_0x02ea:
                java.lang.String r1 = "?#"
                int r12 = kg.b.g(r11, r2, r13, r1)
                if (r2 != r12) goto L_0x02f4
                goto L_0x03eb
            L_0x02f4:
                char r1 = r11.charAt(r2)
                java.lang.String r14 = ""
                r3 = 47
                if (r1 == r3) goto L_0x030e
                r3 = 92
                if (r1 != r3) goto L_0x0303
                goto L_0x030e
            L_0x0303:
                int r1 = r18.size()
                int r1 = r1 - r15
                r9 = r18
                r9.set(r1, r14)
                goto L_0x0318
            L_0x030e:
                r9 = r18
                r9.clear()
                r9.add(r14)
                int r2 = r2 + 1
            L_0x0318:
                if (r2 >= r12) goto L_0x03eb
                java.lang.String r1 = "/\\"
                int r8 = kg.b.g(r11, r2, r12, r1)
                if (r8 >= r12) goto L_0x0325
                r16 = r15
                goto L_0x0327
            L_0x0325:
                r16 = r10
            L_0x0327:
                r5 = 1
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r6 = 0
                r7 = 0
                r17 = 0
                r18 = 0
                r19 = 240(0xf0, float:3.36E-43)
                r1 = r33
                r3 = r8
                r20 = r8
                r8 = r17
                r32 = r9
                r9 = r18
                r17 = r10
                r10 = r19
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r2 = "."
                boolean r2 = sf.j.a(r1, r2)
                if (r2 != 0) goto L_0x0359
                java.lang.String r2 = "%2e"
                boolean r2 = zf.j.s0(r1, r2, r15)
                if (r2 == 0) goto L_0x0356
                goto L_0x0359
            L_0x0356:
                r9 = r17
                goto L_0x035a
            L_0x0359:
                r9 = r15
            L_0x035a:
                if (r9 == 0) goto L_0x0360
                r2 = r32
                goto L_0x03de
            L_0x0360:
                java.lang.String r2 = ".."
                boolean r2 = sf.j.a(r1, r2)
                if (r2 != 0) goto L_0x0384
                java.lang.String r2 = "%2e."
                boolean r2 = zf.j.s0(r1, r2, r15)
                if (r2 != 0) goto L_0x0384
                java.lang.String r2 = ".%2e"
                boolean r2 = zf.j.s0(r1, r2, r15)
                if (r2 != 0) goto L_0x0384
                java.lang.String r2 = "%2e%2e"
                boolean r2 = zf.j.s0(r1, r2, r15)
                if (r2 == 0) goto L_0x0381
                goto L_0x0384
            L_0x0381:
                r9 = r17
                goto L_0x0385
            L_0x0384:
                r9 = r15
            L_0x0385:
                if (r9 == 0) goto L_0x03b4
                int r1 = r32.size()
                int r1 = r1 - r15
                r2 = r32
                java.lang.Object r1 = r2.remove(r1)
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x039c
                r9 = r15
                goto L_0x039e
            L_0x039c:
                r9 = r17
            L_0x039e:
                if (r9 == 0) goto L_0x03b0
                boolean r1 = r2.isEmpty()
                r1 = r1 ^ r15
                if (r1 == 0) goto L_0x03b0
                int r1 = r2.size()
                int r1 = r1 - r15
                r2.set(r1, r14)
                goto L_0x03de
            L_0x03b0:
                r2.add(r14)
                goto L_0x03de
            L_0x03b4:
                r2 = r32
                int r3 = r2.size()
                int r3 = r3 - r15
                java.lang.Object r3 = r2.get(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03c9
                r9 = r15
                goto L_0x03cb
            L_0x03c9:
                r9 = r17
            L_0x03cb:
                if (r9 == 0) goto L_0x03d6
                int r3 = r2.size()
                int r3 = r3 - r15
                r2.set(r3, r1)
                goto L_0x03d9
            L_0x03d6:
                r2.add(r1)
            L_0x03d9:
                if (r16 == 0) goto L_0x03de
                r2.add(r14)
            L_0x03de:
                if (r16 == 0) goto L_0x03e4
                int r8 = r20 + 1
                r20 = r8
            L_0x03e4:
                r9 = r2
                r10 = r17
                r2 = r20
                goto L_0x0318
            L_0x03eb:
                if (r12 >= r13) goto L_0x0414
                char r1 = r11.charAt(r12)
                r2 = 63
                if (r1 != r2) goto L_0x0414
                r1 = 35
                int r14 = kg.b.f(r11, r1, r12, r13)
                int r2 = r12 + 1
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 208(0xd0, float:2.91E-43)
                r1 = r33
                r3 = r14
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.ArrayList r1 = jg.r.b.e(r1)
                r0.f10169g = r1
                r12 = r14
            L_0x0414:
                if (r12 >= r13) goto L_0x0432
                char r1 = r11.charAt(r12)
                r2 = 35
                if (r1 != r2) goto L_0x0432
                int r2 = r12 + 1
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 176(0xb0, float:2.47E-43)
                r1 = r33
                r3 = r13
                java.lang.String r1 = jg.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.f10170h = r1
            L_0x0432:
                return
            L_0x0433:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "Invalid URL host: \""
                r1.<init>(r4)
                java.lang.String r4 = r11.substring(r9, r14)
                sf.j.e(r4, r3)
                r1.append(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0455:
                int r1 = r33.length()
                r2 = 6
                if (r1 <= r2) goto L_0x0467
                java.lang.String r1 = zf.o.a1(r2, r11)
                java.lang.String r2 = "..."
                java.lang.String r1 = sf.j.k(r2, r1)
                goto L_0x0468
            L_0x0467:
                r1 = r11
            L_0x0468:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                java.lang.String r1 = sf.j.k(r1, r3)
                r2.<init>(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.r.a.d(jg.r, java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r7.f10165c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
            if (r1 != r2) goto L_0x009a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r7.f10163a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r7.f10164b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r7.f10165c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r2
                goto L_0x0033
            L_0x0032:
                r1 = r3
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r7.f10164b
                r0.append(r1)
                java.lang.String r1 = r7.f10165c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = r3
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r7.f10165c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r7.f10166d
                if (r1 == 0) goto L_0x0072
                boolean r1 = zf.n.z0(r1, r4)
                if (r1 == 0) goto L_0x006d
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r7.f10166d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0072
            L_0x006d:
                java.lang.String r1 = r7.f10166d
                r0.append(r1)
            L_0x0072:
                int r1 = r7.f10167e
                r2 = -1
                if (r1 != r2) goto L_0x007b
                java.lang.String r1 = r7.f10163a
                if (r1 == 0) goto L_0x00a0
            L_0x007b:
                int r1 = r7.b()
                java.lang.String r5 = r7.f10163a
                if (r5 == 0) goto L_0x009a
                java.lang.String r6 = "http"
                boolean r6 = sf.j.a(r5, r6)
                if (r6 == 0) goto L_0x008e
                r2 = 80
                goto L_0x0098
            L_0x008e:
                java.lang.String r6 = "https"
                boolean r5 = sf.j.a(r5, r6)
                if (r5 == 0) goto L_0x0098
                r2 = 443(0x1bb, float:6.21E-43)
            L_0x0098:
                if (r1 == r2) goto L_0x00a0
            L_0x009a:
                r0.append(r4)
                r0.append(r1)
            L_0x00a0:
                java.util.ArrayList r1 = r7.f10168f
                java.lang.String r2 = "<this>"
                sf.j.f(r1, r2)
                int r2 = r1.size()
            L_0x00ab:
                if (r3 >= r2) goto L_0x00bf
                int r4 = r3 + 1
                r5 = 47
                r0.append(r5)
                java.lang.Object r3 = r1.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                r3 = r4
                goto L_0x00ab
            L_0x00bf:
                java.util.List<java.lang.String> r1 = r7.f10169g
                if (r1 == 0) goto L_0x00d0
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r7.f10169g
                sf.j.c(r1)
                jg.r.b.f(r1, r0)
            L_0x00d0:
                java.lang.String r1 = r7.f10170h
                if (r1 == 0) goto L_0x00de
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r7.f10170h
                r0.append(r1)
            L_0x00de:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                sf.j.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.r.a.toString():java.lang.String");
        }
    }

    public static final class b {
        public static String a(String str, int i8, int i10, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i11) {
            if ((i11 & 1) != 0) {
                i8 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            if ((i11 & 32) != 0) {
                z12 = false;
            }
            if ((i11 & 64) != 0) {
                z13 = false;
            }
            int i12 = 128;
            if ((i11 & 128) != 0) {
                charset = null;
            }
            j.f(str, "<this>");
            int i13 = i8;
            while (i13 < i10) {
                int codePointAt = str.codePointAt(i13);
                int i14 = 127;
                int i15 = 32;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= i12 && !z13) || n.z0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z10 || (z11 && !c(i13, i10, str)))) || (codePointAt == 43 && z12)))) {
                    e eVar = new e();
                    eVar.q0(i8, i13, str);
                    e eVar2 = null;
                    while (i13 < i10) {
                        int codePointAt2 = str.codePointAt(i13);
                        if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 == 43 && z12) {
                                eVar.v0(z10 ? "+" : "%2B");
                            } else if (codePointAt2 < i15 || codePointAt2 == i14 || ((codePointAt2 >= 128 && !z13) || n.z0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z10 || (z11 && !c(i13, i10, str)))))) {
                                if (eVar2 == null) {
                                    eVar2 = new e();
                                }
                                if (charset == null || j.a(charset, StandardCharsets.UTF_8)) {
                                    eVar2.w0(codePointAt2);
                                } else {
                                    int charCount = Character.charCount(codePointAt2) + i13;
                                    boolean z14 = true;
                                    if (i13 >= 0) {
                                        if (charCount >= i13) {
                                            if (charCount > str.length()) {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                StringBuilder b10 = a1.b("endIndex > string.length: ", charCount, " > ");
                                                b10.append(str.length());
                                                throw new IllegalArgumentException(b10.toString().toString());
                                            } else if (j.a(charset, zf.a.f17962b)) {
                                                eVar2.q0(i13, charCount, str);
                                            } else {
                                                String substring = str.substring(i13, charCount);
                                                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                byte[] bytes = substring.getBytes(charset);
                                                j.e(bytes, "this as java.lang.String).getBytes(charset)");
                                                eVar2.write(bytes, 0, bytes.length);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(d.a("endIndex < beginIndex: ", charCount, " < ", i13).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(q.a("beginIndex < 0: ", i13).toString());
                                    }
                                }
                                while (!eVar2.y()) {
                                    byte readByte = eVar2.readByte() & 255;
                                    eVar.g0(37);
                                    char[] cArr = r.f10152k;
                                    eVar.g0(cArr[(readByte >> 4) & 15]);
                                    eVar.g0(cArr[readByte & 15]);
                                }
                            } else {
                                eVar.w0(codePointAt2);
                            }
                        }
                        i13 += Character.charCount(codePointAt2);
                        i14 = 127;
                        i15 = 32;
                    }
                    return eVar.X();
                }
                i13 += Character.charCount(codePointAt);
                i12 = 128;
            }
            String substring2 = str.substring(i8, i10);
            j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }

        public static int b(String str) {
            j.f(str, "scheme");
            if (j.a(str, "http")) {
                return 80;
            }
            return j.a(str, "https") ? 443 : -1;
        }

        public static boolean c(int i8, int i10, String str) {
            int i11 = i8 + 2;
            return i11 < i10 && str.charAt(i8) == '%' && kg.b.r(str.charAt(i8 + 1)) != -1 && kg.b.r(str.charAt(i11)) != -1;
        }

        public static String d(String str, int i8, int i10, boolean z10, int i11) {
            int i12;
            int i13;
            if ((i11 & 1) != 0) {
                i8 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            j.f(str, "<this>");
            int i14 = i8;
            while (i12 < i10) {
                int i15 = i12 + 1;
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    e eVar = new e();
                    eVar.q0(i8, i12, str);
                    while (i12 < i10) {
                        int codePointAt = str.codePointAt(i12);
                        if (codePointAt == 37 && (i13 = i12 + 2) < i10) {
                            int r10 = kg.b.r(str.charAt(i12 + 1));
                            int r11 = kg.b.r(str.charAt(i13));
                            if (!(r10 == -1 || r11 == -1)) {
                                eVar.g0((r10 << 4) + r11);
                                i12 = Character.charCount(codePointAt) + i13;
                            }
                        } else if (codePointAt == 43 && z10) {
                            eVar.g0(32);
                            i12++;
                        }
                        eVar.w0(codePointAt);
                        i12 += Character.charCount(codePointAt);
                    }
                    return eVar.X();
                }
                i14 = i15;
            }
            String substring = str.substring(i8, i10);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList e(String str) {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            while (i8 <= str.length()) {
                int F0 = n.F0(str, '&', i8, false, 4);
                if (F0 == -1) {
                    F0 = str.length();
                }
                int F02 = n.F0(str, '=', i8, false, 4);
                if (F02 == -1 || F02 > F0) {
                    String substring = str.substring(i8, F0);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i8, F02);
                    j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(F02 + 1, F0);
                    j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i8 = F0 + 1;
            }
            return arrayList;
        }

        public static void f(List list, StringBuilder sb2) {
            j.f(list, "<this>");
            wf.d K = f1.K(f1.P(0, list.size()), 2);
            int i8 = K.f16714a;
            int i10 = K.f16715b;
            int i11 = K.f16716c;
            if ((i11 > 0 && i8 <= i10) || (i11 < 0 && i10 <= i8)) {
                while (true) {
                    int i12 = i8 + i11;
                    String str = (String) list.get(i8);
                    String str2 = (String) list.get(i8 + 1);
                    if (i8 > 0) {
                        sb2.append('&');
                    }
                    sb2.append(str);
                    if (str2 != null) {
                        sb2.append('=');
                        sb2.append(str2);
                    }
                    if (i8 != i10) {
                        i8 = i12;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static {
        new b();
    }

    public r(String str, String str2, String str3, String str4, int i8, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f10153a = str;
        this.f10154b = str2;
        this.f10155c = str3;
        this.f10156d = str4;
        this.f10157e = i8;
        this.f10158f = arrayList;
        this.f10159g = arrayList2;
        this.f10160h = str5;
        this.f10161i = str6;
        this.f10162j = j.a(str, "https");
    }

    public final String a() {
        if (this.f10155c.length() == 0) {
            return "";
        }
        String str = this.f10161i;
        String substring = str.substring(n.F0(str, ':', this.f10153a.length() + 3, false, 4) + 1, n.F0(str, '@', 0, false, 6));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        String str = this.f10161i;
        int F0 = n.F0(str, '/', this.f10153a.length() + 3, false, 4);
        String substring = str.substring(F0, kg.b.g(str, F0, str.length(), "?#"));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f10161i;
        int F0 = n.F0(str, '/', this.f10153a.length() + 3, false, 4);
        int g10 = kg.b.g(str, F0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (F0 < g10) {
            int i8 = F0 + 1;
            int f10 = kg.b.f(str, '/', i8, g10);
            String substring = str.substring(i8, f10);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            F0 = f10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f10159g == null) {
            return null;
        }
        String str = this.f10161i;
        int F0 = n.F0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(F0, kg.b.f(str, '#', F0, str.length()));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f10154b.length() == 0) {
            return "";
        }
        int length = this.f10153a.length() + 3;
        String str = this.f10161i;
        String substring = str.substring(length, kg.b.g(str, length, str.length(), ":@"));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && j.a(((r) obj).f10161i, this.f10161i);
    }

    public final String f() {
        a aVar;
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        j.c(aVar);
        aVar.f10164b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        aVar.f10165c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return aVar.a().f10161i;
    }

    public final URI g() {
        String str;
        String str2;
        a aVar = new a();
        String str3 = this.f10153a;
        aVar.f10163a = str3;
        aVar.f10164b = e();
        aVar.f10165c = a();
        aVar.f10166d = this.f10156d;
        int b10 = b.b(str3);
        int i8 = this.f10157e;
        if (i8 == b10) {
            i8 = -1;
        }
        aVar.f10167e = i8;
        ArrayList arrayList = aVar.f10168f;
        arrayList.clear();
        arrayList.addAll(c());
        aVar.c(d());
        int i10 = 0;
        String str4 = null;
        if (this.f10160h == null) {
            str = null;
        } else {
            String str5 = this.f10161i;
            str = str5.substring(n.F0(str5, '#', 0, false, 6) + 1);
            j.e(str, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f10170h = str;
        String str6 = aVar.f10166d;
        if (str6 == null) {
            str2 = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            j.e(compile, "compile(pattern)");
            str2 = compile.matcher(str6).replaceAll("");
            j.e(str2, "nativePattern.matcher(in…).replaceAll(replacement)");
        }
        aVar.f10166d = str2;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, b.a((String) arrayList.get(i11), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        List<String> list = aVar.f10169g;
        if (list != null) {
            int size2 = list.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                String str7 = list.get(i10);
                list.set(i10, str7 == null ? null : b.a(str7, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195));
                i10 = i12;
            }
        }
        String str8 = aVar.f10170h;
        if (str8 != null) {
            str4 = b.a(str8, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        aVar.f10170h = str4;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                j.e(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(aVar2).replaceAll("");
                j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                j.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f10161i.hashCode();
    }

    public final String toString() {
        return this.f10161i;
    }
}
