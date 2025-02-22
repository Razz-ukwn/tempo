package qe;

import android.content.Context;
import androidx.lifecycle.u;
import b2.c;
import cb.d;
import j0.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.s;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f13537h = Logger.getLogger(e.class.getName());

    /* renamed from: i  reason: collision with root package name */
    public static final Map<Integer, String> f13538i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<Integer> f13539j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<Integer> f13540k;

    /* renamed from: l  reason: collision with root package name */
    public static final Map<Character, Character> f13541l;
    public static final Map<Character, Character> m;

    /* renamed from: n  reason: collision with root package name */
    public static final Map<Character, Character> f13542n;

    /* renamed from: o  reason: collision with root package name */
    public static final Map<Character, Character> f13543o;

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f13544p = Pattern.compile("[+＋]+");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f13545q = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f13546r = Pattern.compile("(\\p{Nd})");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f13547s = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f13548t = Pattern.compile("[\\\\/] *x");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f13549u = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f13550v = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f13551w = Pattern.compile("(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f13552x;

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f13553y = Pattern.compile("(\\$\\d)");

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f13554z = Pattern.compile("\\(?\\$1\\)?");

    /* renamed from: a  reason: collision with root package name */
    public final c f13555a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, List<String>> f13556b;

    /* renamed from: c  reason: collision with root package name */
    public final s f13557c = new s(13, 0);

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f13558d = new HashSet(35);

    /* renamed from: e  reason: collision with root package name */
    public final re.a f13559e = new re.a(100);

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f13560f = new HashSet(320);

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f13561g = new HashSet();

    public enum a {
        f13562a,
        f13563b,
        f13564c,
        f13565d,
        f13566e,
        B,
        C,
        D,
        E,
        F,
        G,
        H;

        /* access modifiers changed from: public */
        a() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        f13538i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f13539j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f13540k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f13542n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f13541l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : unmodifiableMap.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        f13543o = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map = m;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        String a10 = c.a("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*", sb3, "\\p{Nd}]*");
        f13552x = Pattern.compile(a10 + "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        Pattern.compile("(\\D+)");
    }

    public e(c cVar, HashMap hashMap) {
        this.f13555a = cVar;
        this.f13556b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f13560f.addAll(list);
            } else {
                this.f13561g.add((Integer) entry.getKey());
            }
        }
        if (this.f13560f.remove("001")) {
            f13537h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f13558d.addAll((Collection) hashMap.get(1));
    }

    public static e a(Context context) {
        if (context != null) {
            return new e(new c(new u(context.getAssets(), 15)), d.F());
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    public static String h(i iVar) {
        int i8;
        StringBuilder sb2 = new StringBuilder();
        if (iVar.B && (i8 = iVar.D) > 0) {
            char[] cArr = new char[i8];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(iVar.f13608b);
        return sb2.toString();
    }

    public static h i(g gVar, a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 2:
                return gVar.f13578d;
            case 1:
                return gVar.B;
            case 3:
                return gVar.D;
            case 4:
                return gVar.F;
            case 5:
                return gVar.H;
            case 6:
                return gVar.L;
            case 7:
                return gVar.J;
            case 8:
                return gVar.N;
            case 9:
                return gVar.P;
            case 10:
                return gVar.T;
            default:
                return gVar.f13574b;
        }
    }

    public static void q(StringBuilder sb2) {
        if (f13550v.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), s(sb2, f13542n));
        } else {
            sb2.replace(0, sb2.length(), r(sb2));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            int digit = Character.digit(charSequence.charAt(i8), 10);
            if (digit != -1) {
                sb2.append(digit);
            }
        }
        return sb2.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i8))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        return sb2.toString();
    }

    public static void u(int i8, int i10, StringBuilder sb2) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                sb2.insert(0, i8).insert(0, '+');
            } else if (i11 == 1) {
                sb2.insert(0, " ").insert(0, i8).insert(0, '+');
            } else if (i11 == 3) {
                sb2.insert(0, "-").insert(0, i8).insert(0, '+').insert(0, "tel:");
            }
        } else {
            throw null;
        }
    }

    public static int v(StringBuilder sb2, g gVar, a aVar) {
        h i8 = i(gVar, aVar);
        ArrayList arrayList = i8.f13604c.isEmpty() ? gVar.f13574b.f13604c : i8.f13604c;
        ArrayList arrayList2 = i8.f13605d;
        if (aVar == a.f13564c) {
            h i10 = i(gVar, a.f13562a);
            boolean z10 = (i10.f13604c.size() == 1 && ((Integer) i10.f13604c.get(0)).intValue() == -1) ? false : true;
            a aVar2 = a.f13563b;
            if (!z10) {
                return v(sb2, gVar, aVar2);
            }
            h i11 = i(gVar, aVar2);
            if ((i11.f13604c.size() == 1 && ((Integer) i11.f13604c.get(0)).intValue() == -1) ? false : true) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = i11.f13604c;
                if (arrayList4.size() == 0) {
                    arrayList4 = gVar.f13574b.f13604c;
                }
                arrayList3.addAll(arrayList4);
                Collections.sort(arrayList3);
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList5 = i11.f13605d;
                if (isEmpty) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    arrayList6.addAll(arrayList5);
                    Collections.sort(arrayList6);
                    arrayList2 = arrayList6;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? 1 : 5;
    }

    public final int b(StringBuilder sb2, StringBuilder sb3) {
        if (!(sb2.length() == 0 || sb2.charAt(0) == '0')) {
            int length = sb2.length();
            int i8 = 1;
            while (i8 <= 3 && i8 <= length) {
                int parseInt = Integer.parseInt(sb2.substring(0, i8));
                if (this.f13556b.containsKey(Integer.valueOf(parseInt))) {
                    sb3.append(sb2.substring(i8));
                    return parseInt;
                }
                i8++;
            }
        }
        return 0;
    }

    public final String c(i iVar, int i8) {
        re.a aVar;
        f fVar;
        int i10 = (iVar.f13608b > 0 ? 1 : (iVar.f13608b == 0 ? 0 : -1));
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        int i11 = iVar.f13607a;
        String h3 = h(iVar);
        if (i8 == 1) {
            sb2.append(h3);
            u(i11, 1, sb2);
        } else if (!this.f13556b.containsKey(Integer.valueOf(i11))) {
            sb2.append(h3);
        } else {
            g g10 = g(i11, k(i11));
            Iterator it = ((g10.f13596t0.size() == 0 || i8 == 3) ? g10.f13595s0 : g10.f13596t0).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar = this.f13559e;
                if (!hasNext) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                int size = fVar.f13569c.size();
                if (size != 0) {
                    if (!aVar.a((String) fVar.f13569c.get(size - 1)).matcher(h3).lookingAt()) {
                        continue;
                    }
                }
                if (aVar.a(fVar.f13567a).matcher(h3).matches()) {
                    break;
                }
            }
            if (fVar != null) {
                String str = fVar.f13568b;
                Matcher matcher = aVar.a(fVar.f13567a).matcher(h3);
                String str2 = fVar.f13571e;
                h3 = (i8 != 3 || str2 == null || str2.length() <= 0) ? matcher.replaceAll(str) : matcher.replaceAll(f13553y.matcher(str).replaceFirst(str2));
                if (i8 == 4) {
                    Matcher matcher2 = f13545q.matcher(h3);
                    if (matcher2.lookingAt()) {
                        h3 = matcher2.replaceFirst("");
                    }
                    h3 = matcher2.reset(h3).replaceAll("-");
                }
            }
            sb2.append(h3);
            if (iVar.f13609c && iVar.f13610d.length() > 0) {
                if (i8 == 4) {
                    sb2.append(";ext=");
                    sb2.append(iVar.f13610d);
                } else if (g10.f13588l0) {
                    sb2.append(g10.f13589m0);
                    sb2.append(iVar.f13610d);
                } else {
                    sb2.append(" ext. ");
                    sb2.append(iVar.f13610d);
                }
            }
            u(i11, i8, sb2);
        }
        return sb2.toString();
    }

    public final int d(String str) {
        g f10 = f(str);
        if (f10 != null) {
            return f10.f13582f0;
        }
        throw new IllegalArgumentException(t.a("Invalid region code: ", str));
    }

    public final g e(int i8) {
        if (!this.f13556b.containsKey(Integer.valueOf(i8))) {
            return null;
        }
        c cVar = this.f13555a;
        cVar.getClass();
        List list = (List) d.F().get(Integer.valueOf(i8));
        boolean z10 = false;
        if (list.size() == 1 && "001".equals(list.get(0))) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        return cVar.f13532b.a(Integer.valueOf(i8), cVar.f13534d, cVar.f13531a);
    }

    public final g f(String str) {
        if (!n(str)) {
            return null;
        }
        c cVar = this.f13555a;
        return cVar.f13532b.a(str, cVar.f13533c, cVar.f13531a);
    }

    public final g g(int i8, String str) {
        return "001".equals(str) ? e(i8) : f(str);
    }

    public final a j(String str, g gVar) {
        boolean l10 = l(str, gVar.f13574b);
        a aVar = a.H;
        if (!l10) {
            return aVar;
        }
        if (l(str, gVar.F)) {
            return a.f13566e;
        }
        if (l(str, gVar.D)) {
            return a.f13565d;
        }
        if (l(str, gVar.H)) {
            return a.B;
        }
        if (l(str, gVar.L)) {
            return a.C;
        }
        if (l(str, gVar.J)) {
            return a.D;
        }
        if (l(str, gVar.N)) {
            return a.E;
        }
        if (l(str, gVar.P)) {
            return a.F;
        }
        if (l(str, gVar.T)) {
            return a.G;
        }
        if (!l(str, gVar.f13578d)) {
            return (gVar.f13594r0 || !l(str, gVar.B)) ? aVar : a.f13563b;
        }
        boolean z10 = gVar.f13594r0;
        a aVar2 = a.f13564c;
        return (!z10 && !l(str, gVar.B)) ? a.f13562a : aVar2;
    }

    public final String k(int i8) {
        List list = this.f13556b.get(Integer.valueOf(i8));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean l(String str, h hVar) {
        int length = str.length();
        ArrayList arrayList = hVar.f13604c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.f13557c.b(str, hVar);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(qe.i r9) {
        /*
            r8 = this;
            int r0 = r9.f13607a
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r1 = r8.f13556b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            qe.e$a r2 = qe.e.a.H
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0024
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.String r5 = "Missing/invalid country_code ("
            java.lang.String r6 = ")"
            java.lang.String r0 = d.a.a(r5, r0, r6)
            java.util.logging.Logger r5 = f13537h
            r5.log(r1, r0)
            goto L_0x0068
        L_0x0024:
            int r0 = r1.size()
            if (r0 != r4) goto L_0x0031
            java.lang.Object r0 = r1.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0069
        L_0x0031:
            java.lang.String r0 = h(r9)
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            qe.g r6 = r8.f(r5)
            boolean r7 = r6.f13598v0
            if (r7 == 0) goto L_0x0060
            java.lang.String r6 = r6.f13599w0
            re.a r7 = r8.f13559e
            java.util.regex.Pattern r6 = r7.a(r6)
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r6 = r6.lookingAt()
            if (r6 == 0) goto L_0x0039
            goto L_0x0066
        L_0x0060:
            qe.e$a r6 = r8.j(r0, r6)
            if (r6 == r2) goto L_0x0039
        L_0x0066:
            r0 = r5
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            int r1 = r9.f13607a
            qe.g r5 = r8.g(r1, r0)
            if (r5 == 0) goto L_0x008b
            java.lang.String r6 = "001"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0080
            int r0 = r8.d(r0)
            if (r1 == r0) goto L_0x0080
            goto L_0x008b
        L_0x0080:
            java.lang.String r9 = h(r9)
            qe.e$a r9 = r8.j(r9, r5)
            if (r9 == r2) goto L_0x008b
            r3 = r4
        L_0x008b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.e.m(qe.i):boolean");
    }

    public final boolean n(String str) {
        return str != null && this.f13560f.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(java.lang.CharSequence r8, qe.g r9, java.lang.StringBuilder r10, qe.i r11) {
        /*
            r7 = this;
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            if (r9 == 0) goto L_0x0012
            java.lang.String r8 = r9.f13583g0
            goto L_0x0014
        L_0x0012:
            java.lang.String r8 = "NonMatch"
        L_0x0014:
            int r2 = r0.length()
            r3 = 2
            r4 = 1
            r5 = 4
            if (r2 != 0) goto L_0x001e
            goto L_0x0078
        L_0x001e:
            java.util.regex.Pattern r2 = f13544p
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r6 = r2.lookingAt()
            if (r6 == 0) goto L_0x0036
            int r8 = r2.end()
            r0.delete(r1, r8)
            q(r0)
            r8 = r4
            goto L_0x0079
        L_0x0036:
            re.a r2 = r7.f13559e
            java.util.regex.Pattern r8 = r2.a(r8)
            q(r0)
            java.util.regex.Matcher r8 = r8.matcher(r0)
            boolean r2 = r8.lookingAt()
            if (r2 == 0) goto L_0x0073
            int r8 = r8.end()
            java.lang.String r2 = r0.substring(r8)
            java.util.regex.Pattern r6 = f13546r
            java.util.regex.Matcher r2 = r6.matcher(r2)
            boolean r6 = r2.find()
            if (r6 == 0) goto L_0x006e
            java.lang.String r2 = r2.group(r4)
            java.lang.String r2 = r(r2)
            java.lang.String r6 = "0"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            r0.delete(r1, r8)
            r8 = r4
            goto L_0x0074
        L_0x0073:
            r8 = r1
        L_0x0074:
            if (r8 == 0) goto L_0x0078
            r8 = r3
            goto L_0x0079
        L_0x0078:
            r8 = r5
        L_0x0079:
            if (r8 == r5) goto L_0x009b
            int r8 = r0.length()
            if (r8 <= r3) goto L_0x0092
            int r8 = r7.b(r0, r10)
            if (r8 == 0) goto L_0x008a
            r11.f13607a = r8
            return r8
        L_0x008a:
            qe.d r8 = new qe.d
            java.lang.String r9 = "Country calling code supplied was not recognised."
            r8.<init>(r4, r9)
            throw r8
        L_0x0092:
            qe.d r8 = new qe.d
            r9 = 3
            java.lang.String r10 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            r8.<init>(r9, r10)
            throw r8
        L_0x009b:
            if (r9 == 0) goto L_0x00dd
            int r8 = r9.f13582f0
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r3 = r0.toString()
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto L_0x00dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2.length()
            java.lang.String r2 = r3.substring(r2)
            r4.<init>(r2)
            qe.h r2 = r9.f13574b
            r3 = 0
            r7.p(r4, r9, r3)
            r3.s r3 = r7.f13557c
            boolean r5 = r3.b(r0, r2)
            if (r5 != 0) goto L_0x00ce
            boolean r2 = r3.b(r4, r2)
            if (r2 != 0) goto L_0x00d7
        L_0x00ce:
            qe.e$a r2 = qe.e.a.H
            int r9 = v(r0, r9, r2)
            r0 = 6
            if (r9 != r0) goto L_0x00dd
        L_0x00d7:
            r10.append(r4)
            r11.f13607a = r8
            return r8
        L_0x00dd:
            r11.f13607a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.e.o(java.lang.CharSequence, qe.g, java.lang.StringBuilder, qe.i):int");
    }

    public final void p(StringBuilder sb2, g gVar, StringBuilder sb3) {
        int length = sb2.length();
        String str = gVar.f13591o0;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.f13559e.a(str).matcher(sb2);
            if (matcher.lookingAt()) {
                h hVar = gVar.f13574b;
                s sVar = this.f13557c;
                boolean b10 = sVar.b(sb2, hVar);
                int groupCount = matcher.groupCount();
                String str2 = gVar.f13593q0;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb4 = new StringBuilder(sb2);
                    sb4.replace(0, length, matcher.replaceFirst(str2));
                    if (!b10 || sVar.b(sb4.toString(), hVar)) {
                        if (sb3 != null && groupCount > 1) {
                            sb3.append(matcher.group(1));
                        }
                        sb2.replace(0, sb2.length(), sb4.toString());
                    }
                } else if (!b10 || sVar.b(sb2.substring(matcher.end()), hVar)) {
                    if (!(sb3 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                }
            }
        }
    }

    public final i t(String str, String str2) {
        int i8;
        CharSequence charSequence;
        i iVar = new i();
        if (str == null) {
            throw new d(2, "The phone number supplied was null.");
        } else if (str.length() <= 250) {
            StringBuilder sb2 = new StringBuilder();
            String str3 = str.toString();
            int indexOf = str3.indexOf(";phone-context=");
            String str4 = "";
            if (indexOf >= 0) {
                int i10 = indexOf + 15;
                if (i10 < str3.length() - 1 && str3.charAt(i10) == '+') {
                    int indexOf2 = str3.indexOf(59, i10);
                    if (indexOf2 > 0) {
                        sb2.append(str3.substring(i10, indexOf2));
                    } else {
                        sb2.append(str3.substring(i10));
                    }
                }
                int indexOf3 = str3.indexOf("tel:");
                sb2.append(str3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                Matcher matcher = f13547s.matcher(str3);
                if (matcher.find()) {
                    charSequence = str3.subSequence(matcher.start(), str3.length());
                    Matcher matcher2 = f13549u.matcher(charSequence);
                    if (matcher2.find()) {
                        charSequence = charSequence.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = f13548t.matcher(charSequence);
                    if (matcher3.find()) {
                        charSequence = charSequence.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence = str4;
                }
                sb2.append(charSequence);
            }
            int indexOf4 = sb2.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb2.delete(indexOf4, sb2.length());
            }
            int length = sb2.length();
            Pattern pattern = f13552x;
            if (length < 2 ? false : pattern.matcher(sb2).matches()) {
                boolean n2 = n(str2);
                Pattern pattern2 = f13544p;
                if (n2 || (sb2.length() != 0 && pattern2.matcher(sb2).lookingAt())) {
                    Matcher matcher4 = f13551w.matcher(sb2);
                    if (matcher4.find()) {
                        String substring = sb2.substring(0, matcher4.start());
                        if (substring.length() < 2 ? false : pattern.matcher(substring).matches()) {
                            int groupCount = matcher4.groupCount();
                            int i11 = 1;
                            while (true) {
                                if (i11 > groupCount) {
                                    break;
                                } else if (matcher4.group(i11) != null) {
                                    str4 = matcher4.group(i11);
                                    sb2.delete(matcher4.start(), sb2.length());
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    if (str4.length() > 0) {
                        iVar.f13609c = true;
                        iVar.f13610d = str4;
                    }
                    g f10 = f(str2);
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        i8 = o(sb2, f10, sb3, iVar);
                    } catch (d e10) {
                        Matcher matcher5 = pattern2.matcher(sb2);
                        int i12 = e10.f13535a;
                        if (i12 != 1 || !matcher5.lookingAt()) {
                            throw new d(i12, e10.getMessage());
                        }
                        i8 = o(sb2.substring(matcher5.end()), f10, sb3, iVar);
                        if (i8 == 0) {
                            throw new d(1, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    if (i8 != 0) {
                        String k10 = k(i8);
                        if (!k10.equals(str2)) {
                            f10 = g(i8, k10);
                        }
                    } else {
                        q(sb2);
                        sb3.append(sb2);
                        if (str2 != null) {
                            iVar.f13607a = f10.f13582f0;
                        }
                    }
                    if (sb3.length() >= 2) {
                        if (f10 != null) {
                            StringBuilder sb4 = new StringBuilder();
                            StringBuilder sb5 = new StringBuilder(sb3);
                            p(sb5, f10, sb4);
                            int v3 = v(sb5, f10, a.H);
                            if (!(v3 == 4 || v3 == 2 || v3 == 5)) {
                                sb3 = sb5;
                            }
                        }
                        int length2 = sb3.length();
                        if (length2 < 2) {
                            throw new d(4, "The string supplied is too short to be a phone number.");
                        } else if (length2 <= 17) {
                            if (sb3.length() > 1 && sb3.charAt(0) == '0') {
                                iVar.f13611e = true;
                                iVar.B = true;
                                int i13 = 1;
                                while (i13 < sb3.length() - 1 && sb3.charAt(i13) == '0') {
                                    i13++;
                                }
                                if (i13 != 1) {
                                    iVar.C = true;
                                    iVar.D = i13;
                                }
                            }
                            iVar.f13608b = Long.parseLong(sb3.toString());
                            return iVar;
                        } else {
                            throw new d(5, "The string supplied is too long to be a phone number.");
                        }
                    } else {
                        throw new d(4, "The string supplied is too short to be a phone number.");
                    }
                } else {
                    throw new d(1, "Missing or invalid default region.");
                }
            } else {
                throw new d(2, "The string supplied did not seem to be a phone number.");
            }
        } else {
            throw new d(5, "The string supplied was too long to parse.");
        }
    }
}
