package b3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import b3.o0;
import b3.u;
import cb.c;
import gf.k;
import gf.m;
import gf.o;
import gf.q;
import gf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.g;
import o.h;
import sf.j;

public class z {
    public static final /* synthetic */ int F = 0;
    public final g<e> B = new g<>();
    public final LinkedHashMap C = new LinkedHashMap();
    public int D;
    public String E;

    /* renamed from: a  reason: collision with root package name */
    public final String f3201a;

    /* renamed from: b  reason: collision with root package name */
    public b0 f3202b;

    /* renamed from: c  reason: collision with root package name */
    public String f3203c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f3204d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f3205e = new ArrayList();

    public static final class a {
        public static String a(Context context, int i8) {
            String str;
            j.f(context, "context");
            if (i8 <= 16777215) {
                return String.valueOf(i8);
            }
            try {
                str = context.getResources().getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i8);
            }
            j.e(str, "try {\n                co….toString()\n            }");
            return str;
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final z f3206a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f3207b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3208c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3209d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3210e;

        public b(z zVar, Bundle bundle, boolean z10, boolean z11, int i8) {
            j.f(zVar, "destination");
            this.f3206a = zVar;
            this.f3207b = bundle;
            this.f3208c = z10;
            this.f3209d = z11;
            this.f3210e = i8;
        }

        /* renamed from: a */
        public final int compareTo(b bVar) {
            j.f(bVar, "other");
            boolean z10 = bVar.f3208c;
            boolean z11 = this.f3208c;
            if (z11 && !z10) {
                return 1;
            }
            if (!z11 && z10) {
                return -1;
            }
            Bundle bundle = bVar.f3207b;
            Bundle bundle2 = this.f3207b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                j.c(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = bVar.f3209d;
            boolean z13 = this.f3209d;
            if (z13 && !z12) {
                return 1;
            }
            if (z13 || !z12) {
                return this.f3210e - bVar.f3210e;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public z(m0<? extends z> m0Var) {
        j.f(m0Var, "navigator");
        LinkedHashMap linkedHashMap = o0.f3151b;
        this.f3201a = o0.a.a(m0Var.getClass());
    }

    public final void a(u uVar) {
        Map<String, i> e10 = e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, i>> it = e10.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            i iVar = (i) next.getValue();
            if (iVar.f3080b || iVar.f3081c) {
                z10 = false;
            }
            if (z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next2 : keySet) {
            String str = (String) next2;
            ArrayList arrayList2 = uVar.f3177d;
            ArrayList arrayList3 = new ArrayList();
            for (u.a aVar : uVar.f3178e.values()) {
                o.p0(aVar.f3187b, arrayList3);
            }
            if (!q.G0(arrayList3, arrayList2).contains(str)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            this.f3205e.add(uVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + uVar.f3174a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle b(android.os.Bundle r9) {
        /*
            r8 = this;
            java.util.LinkedHashMap r0 = r8.C
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L_0x0016
            if (r0 == 0) goto L_0x0011
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r3 = r1
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            if (r3 == 0) goto L_0x0016
            r9 = 0
            return r9
        L_0x0016:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "name"
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            b3.i r5 = (b3.i) r5
            r5.getClass()
            sf.j.f(r7, r6)
            boolean r6 = r5.f3081c
            if (r6 == 0) goto L_0x0023
            b3.h0<java.lang.Object> r6 = r5.f3079a
            java.lang.Object r5 = r5.f3082d
            r6.d(r3, r7, r5)
            goto L_0x0023
        L_0x004f:
            if (r9 == 0) goto L_0x00b8
            r3.putAll(r9)
            java.util.Set r9 = r0.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x005c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.getValue()
            b3.i r0 = (b3.i) r0
            r0.getClass()
            sf.j.f(r4, r6)
            boolean r5 = r0.f3080b
            b3.h0<java.lang.Object> r0 = r0.f3079a
            if (r5 != 0) goto L_0x008d
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x008d
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r0.a(r3, r4)     // Catch:{ ClassCastException -> 0x0092 }
            r5 = r2
            goto L_0x0093
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 == 0) goto L_0x0096
            goto L_0x005c
        L_0x0096:
            java.lang.String r9 = "Wrong argument type for '"
            java.lang.String r1 = "' in argument bundle. "
            java.lang.StringBuilder r9 = androidx.activity.result.d.c(r9, r4, r1)
            java.lang.String r0 = r0.b()
            r9.append(r0)
            java.lang.String r0 = " expected."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x00b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.z.b(android.os.Bundle):android.os.Bundle");
    }

    public final int[] c(z zVar) {
        k kVar = new k();
        b0 b0Var = this;
        while (true) {
            b0 b0Var2 = b0Var.f3202b;
            if ((zVar != null ? zVar.f3202b : null) != null) {
                b0 b0Var3 = zVar.f3202b;
                j.c(b0Var3);
                if (b0Var3.j(b0Var.D, true) == b0Var) {
                    kVar.addFirst(b0Var);
                    break;
                }
            }
            if (b0Var2 == null || b0Var2.H != b0Var.D) {
                kVar.addFirst(b0Var);
            }
            if (j.a(b0Var2, zVar) || b0Var2 == null) {
                break;
            }
            b0Var = b0Var2;
        }
        Iterable<z> O0 = q.O0(kVar);
        ArrayList arrayList = new ArrayList(m.n0(O0));
        for (z zVar2 : O0) {
            arrayList.add(Integer.valueOf(zVar2.D));
        }
        return q.N0(arrayList);
    }

    public final e d(int i8) {
        g<e> gVar = this.B;
        e eVar = gVar.j() == 0 ? null : (e) gVar.h(i8, (Integer) null);
        if (eVar != null) {
            return eVar;
        }
        b0 b0Var = this.f3202b;
        if (b0Var != null) {
            return b0Var.d(i8);
        }
        return null;
    }

    public final Map<String, i> e() {
        return y.W(this.C);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0175
            boolean r1 = r12 instanceof b3.z
            if (r1 != 0) goto L_0x0009
            goto L_0x0175
        L_0x0009:
            java.util.ArrayList r1 = r11.f3205e
            b3.z r12 = (b3.z) r12
            java.util.ArrayList r2 = r12.f3205e
            java.lang.String r3 = "<this>"
            sf.j.f(r1, r3)
            java.lang.String r4 = "other"
            sf.j.f(r2, r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r1)
            r4.retainAll(r2)
            int r2 = r4.size()
            int r1 = r1.size()
            r4 = 1
            if (r2 != r1) goto L_0x002e
            r1 = r4
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            o.g<b3.e> r2 = r11.B
            int r5 = r2.j()
            o.g<b3.e> r6 = r12.B
            int r7 = r6.j()
            if (r5 != r7) goto L_0x00b6
            o.h r5 = cb.c.l(r2)
            yf.g r5 = yf.k.n0(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0049:
            boolean r7 = r5.hasNext()
            r8 = -1
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r5.next()
            b3.e r7 = (b3.e) r7
            boolean r9 = r6.f12034a
            if (r9 == 0) goto L_0x005d
            r6.g()
        L_0x005d:
            r9 = r0
        L_0x005e:
            int r10 = r6.f12037d
            if (r9 >= r10) goto L_0x006c
            java.lang.Object[] r10 = r6.f12036c
            r10 = r10[r9]
            if (r10 != r7) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            int r9 = r9 + 1
            goto L_0x005e
        L_0x006c:
            r9 = r8
        L_0x006d:
            if (r9 < 0) goto L_0x0071
            r7 = r4
            goto L_0x0072
        L_0x0071:
            r7 = r0
        L_0x0072:
            if (r7 != 0) goto L_0x0049
            r5 = r0
            goto L_0x0077
        L_0x0076:
            r5 = r4
        L_0x0077:
            if (r5 == 0) goto L_0x00b6
            o.h r5 = cb.c.l(r6)
            yf.g r5 = yf.k.n0(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0085:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r5.next()
            b3.e r6 = (b3.e) r6
            boolean r7 = r2.f12034a
            if (r7 == 0) goto L_0x0098
            r2.g()
        L_0x0098:
            r7 = r0
        L_0x0099:
            int r9 = r2.f12037d
            if (r7 >= r9) goto L_0x00a7
            java.lang.Object[] r9 = r2.f12036c
            r9 = r9[r7]
            if (r9 != r6) goto L_0x00a4
            goto L_0x00a8
        L_0x00a4:
            int r7 = r7 + 1
            goto L_0x0099
        L_0x00a7:
            r7 = r8
        L_0x00a8:
            if (r7 < 0) goto L_0x00ac
            r6 = r4
            goto L_0x00ad
        L_0x00ac:
            r6 = r0
        L_0x00ad:
            if (r6 != 0) goto L_0x0085
            r2 = r0
            goto L_0x00b2
        L_0x00b1:
            r2 = r4
        L_0x00b2:
            if (r2 == 0) goto L_0x00b6
            r2 = r4
            goto L_0x00b7
        L_0x00b6:
            r2 = r0
        L_0x00b7:
            java.util.Map r5 = r11.e()
            int r5 = r5.size()
            java.util.Map r6 = r12.e()
            int r6 = r6.size()
            if (r5 != r6) goto L_0x015d
            java.util.Map r5 = r11.e()
            java.util.Set r5 = r5.entrySet()
            sf.j.f(r5, r3)
            java.util.Iterator r5 = r5.iterator()
        L_0x00d8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010f
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r7 = r12.e()
            java.lang.Object r8 = r6.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x010a
            java.util.Map r7 = r12.e()
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = sf.j.a(r7, r6)
            if (r6 == 0) goto L_0x010a
            r6 = r4
            goto L_0x010b
        L_0x010a:
            r6 = r0
        L_0x010b:
            if (r6 != 0) goto L_0x00d8
            r5 = r0
            goto L_0x0110
        L_0x010f:
            r5 = r4
        L_0x0110:
            if (r5 == 0) goto L_0x015d
            java.util.Map r5 = r12.e()
            java.util.Set r5 = r5.entrySet()
            sf.j.f(r5, r3)
            java.util.Iterator r3 = r5.iterator()
        L_0x0121:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0158
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r11.e()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x0153
            java.util.Map r6 = r11.e()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = sf.j.a(r6, r5)
            if (r5 == 0) goto L_0x0153
            r5 = r4
            goto L_0x0154
        L_0x0153:
            r5 = r0
        L_0x0154:
            if (r5 != 0) goto L_0x0121
            r3 = r0
            goto L_0x0159
        L_0x0158:
            r3 = r4
        L_0x0159:
            if (r3 == 0) goto L_0x015d
            r3 = r4
            goto L_0x015e
        L_0x015d:
            r3 = r0
        L_0x015e:
            int r5 = r11.D
            int r6 = r12.D
            if (r5 != r6) goto L_0x0175
            java.lang.String r5 = r11.E
            java.lang.String r12 = r12.E
            boolean r12 = sf.j.a(r5, r12)
            if (r12 == 0) goto L_0x0175
            if (r1 == 0) goto L_0x0175
            if (r2 == 0) goto L_0x0175
            if (r3 == 0) goto L_0x0175
            r0 = r4
        L_0x0175:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.z.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.util.regex.Matcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b3.z.b g(b3.w r22) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            java.util.ArrayList r0 = r6.f3205e
            boolean r1 = r0.isEmpty()
            r8 = 0
            if (r1 == 0) goto L_0x000e
            return r8
        L_0x000e:
            java.util.Iterator r9 = r0.iterator()
            r10 = r8
        L_0x0013:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r9.next()
            b3.u r0 = (b3.u) r0
            java.lang.Object r1 = r7.f3197b
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x018c
            java.util.Map r4 = r21.e()
            r0.getClass()
            ff.j r5 = r0.f3180g
            java.lang.Object r5 = r5.getValue()
            java.util.regex.Pattern r5 = (java.util.regex.Pattern) r5
            if (r5 == 0) goto L_0x003f
            java.lang.String r11 = r1.toString()
            java.util.regex.Matcher r5 = r5.matcher(r11)
            goto L_0x0040
        L_0x003f:
            r5 = r8
        L_0x0040:
            if (r5 != 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            boolean r11 = r5.matches()
            if (r11 != 0) goto L_0x004c
        L_0x0049:
            r11 = r8
            goto L_0x018a
        L_0x004c:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.util.ArrayList r12 = r0.f3177d
            int r13 = r12.size()
            r14 = 0
        L_0x0058:
            if (r14 >= r13) goto L_0x007c
            java.lang.Object r15 = r12.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            int r14 = r14 + 1
            java.lang.String r16 = r5.group(r14)
            java.lang.String r8 = android.net.Uri.decode(r16)
            java.lang.Object r16 = r4.get(r15)
            r2 = r16
            b3.i r2 = (b3.i) r2
            java.lang.String r3 = "value"
            sf.j.e(r8, r3)     // Catch:{ IllegalArgumentException -> 0x0189 }
            b3.u.b(r11, r15, r8, r2)     // Catch:{ IllegalArgumentException -> 0x0189 }
            r8 = 0
            goto L_0x0058
        L_0x007c:
            boolean r2 = r0.f3181h
            if (r2 == 0) goto L_0x0154
            java.util.LinkedHashMap r2 = r0.f3178e
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0154
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r2.get(r5)
            b3.u$a r8 = (b3.u.a) r8
            java.lang.String r5 = r1.getQueryParameter(r5)
            boolean r12 = r0.f3182i
            if (r12 == 0) goto L_0x00ba
            java.lang.String r12 = r1.toString()
            java.lang.String r13 = "deepLink.toString()"
            sf.j.e(r12, r13)
            r13 = 63
            java.lang.String r13 = zf.n.U0(r12, r13)
            boolean r12 = sf.j.a(r13, r12)
            if (r12 != 0) goto L_0x00ba
            r5 = r13
        L_0x00ba:
            if (r5 == 0) goto L_0x00d3
            sf.j.c(r8)
            java.lang.String r12 = r8.f3186a
            r13 = 32
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12, r13)
            java.util.regex.Matcher r5 = r12.matcher(r5)
            boolean r12 = r5.matches()
            if (r12 != 0) goto L_0x00d4
            goto L_0x0189
        L_0x00d3:
            r5 = 0
        L_0x00d4:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            sf.j.c(r8)     // Catch:{ IllegalArgumentException -> 0x0146 }
            java.util.ArrayList r8 = r8.f3187b
            int r13 = r8.size()     // Catch:{ IllegalArgumentException -> 0x0146 }
            r14 = 0
        L_0x00e3:
            if (r14 >= r13) goto L_0x013c
            if (r5 == 0) goto L_0x00f2
            int r15 = r14 + 1
            java.lang.String r15 = r5.group(r15)     // Catch:{ IllegalArgumentException -> 0x0146 }
            if (r15 != 0) goto L_0x00f3
            java.lang.String r15 = ""
            goto L_0x00f3
        L_0x00f2:
            r15 = 0
        L_0x00f3:
            java.lang.Object r17 = r8.get(r14)     // Catch:{ IllegalArgumentException -> 0x0146 }
            r18 = r1
            r1 = r17
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalArgumentException -> 0x0148 }
            java.lang.Object r17 = r4.get(r1)     // Catch:{ IllegalArgumentException -> 0x0148 }
            r19 = r2
            r2 = r17
            b3.i r2 = (b3.i) r2     // Catch:{ IllegalArgumentException -> 0x014a }
            if (r15 == 0) goto L_0x012d
            r17 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x014c }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x014c }
            r20 = r5
            r5 = 123(0x7b, float:1.72E-43)
            r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x014c }
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x014c }
            r5 = 125(0x7d, float:1.75E-43)
            r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x014c }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x014c }
            boolean r3 = sf.j.a(r15, r3)     // Catch:{ IllegalArgumentException -> 0x014c }
            if (r3 != 0) goto L_0x0131
            b3.u.b(r12, r1, r15, r2)     // Catch:{ IllegalArgumentException -> 0x014c }
            goto L_0x0131
        L_0x012d:
            r17 = r3
            r20 = r5
        L_0x0131:
            int r14 = r14 + 1
            r3 = r17
            r1 = r18
            r2 = r19
            r5 = r20
            goto L_0x00e3
        L_0x013c:
            r18 = r1
            r19 = r2
            r17 = r3
            r11.putAll(r12)     // Catch:{ IllegalArgumentException -> 0x014c }
            goto L_0x014c
        L_0x0146:
            r18 = r1
        L_0x0148:
            r19 = r2
        L_0x014a:
            r17 = r3
        L_0x014c:
            r3 = r17
            r1 = r18
            r2 = r19
            goto L_0x008a
        L_0x0154:
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x015c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x018a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            b3.i r2 = (b3.i) r2
            if (r2 == 0) goto L_0x0180
            boolean r4 = r2.f3080b
            if (r4 != 0) goto L_0x0180
            boolean r2 = r2.f3081c
            if (r2 != 0) goto L_0x0180
            r2 = 1
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            if (r2 == 0) goto L_0x015c
            boolean r2 = r11.containsKey(r3)
            if (r2 != 0) goto L_0x015c
        L_0x0189:
            r11 = 0
        L_0x018a:
            r2 = r11
            goto L_0x018d
        L_0x018c:
            r2 = 0
        L_0x018d:
            java.lang.Object r1 = r7.f3198c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x019d
            java.lang.String r3 = r0.f3175b
            boolean r1 = sf.j.a(r1, r3)
            if (r1 == 0) goto L_0x019d
            r4 = 1
            goto L_0x019e
        L_0x019d:
            r4 = 0
        L_0x019e:
            java.lang.Object r1 = r7.f3199d
            java.lang.String r1 = (java.lang.String) r1
            r3 = -1
            if (r1 == 0) goto L_0x026d
            r0.getClass()
            java.lang.String r5 = r0.f3176c
            if (r5 == 0) goto L_0x026a
            ff.j r8 = r0.f3184k
            java.lang.Object r8 = r8.getValue()
            java.util.regex.Pattern r8 = (java.util.regex.Pattern) r8
            sf.j.c(r8)
            java.util.regex.Matcher r8 = r8.matcher(r1)
            boolean r8 = r8.matches()
            if (r8 != 0) goto L_0x01c3
            goto L_0x026a
        L_0x01c3:
            zf.c r8 = new zf.c
            java.lang.String r11 = "/"
            r8.<init>(r11)
            java.util.List r5 = r8.a(r5)
            boolean r8 = r5.isEmpty()
            gf.s r12 = gf.s.f8978a
            if (r8 != 0) goto L_0x0202
            int r8 = r5.size()
            java.util.ListIterator r8 = r5.listIterator(r8)
        L_0x01de:
            boolean r13 = r8.hasPrevious()
            if (r13 == 0) goto L_0x0202
            java.lang.Object r13 = r8.previous()
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            if (r13 != 0) goto L_0x01f2
            r13 = 1
            goto L_0x01f3
        L_0x01f2:
            r13 = 0
        L_0x01f3:
            if (r13 != 0) goto L_0x01de
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r8 = r8.nextIndex()
            r13 = 1
            int r8 = r8 + r13
            java.util.List r5 = gf.q.K0(r5, r8)
            goto L_0x0204
        L_0x0202:
            r13 = 1
            r5 = r12
        L_0x0204:
            r8 = 0
            java.lang.Object r14 = r5.get(r8)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r5 = r5.get(r13)
            java.lang.String r5 = (java.lang.String) r5
            zf.c r8 = new zf.c
            r8.<init>(r11)
            java.util.List r1 = r8.a(r1)
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L_0x024c
            int r8 = r1.size()
            java.util.ListIterator r8 = r1.listIterator(r8)
        L_0x0228:
            boolean r11 = r8.hasPrevious()
            if (r11 == 0) goto L_0x024c
            java.lang.Object r11 = r8.previous()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            if (r11 != 0) goto L_0x023c
            r13 = 1
            goto L_0x023d
        L_0x023c:
            r13 = 0
        L_0x023d:
            if (r13 != 0) goto L_0x0228
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r8 = r8.nextIndex()
            r11 = 1
            int r8 = r8 + r11
            java.util.List r12 = gf.q.K0(r1, r8)
            goto L_0x024d
        L_0x024c:
            r11 = 1
        L_0x024d:
            r1 = 0
            java.lang.Object r8 = r12.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r12.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r8 = sf.j.a(r14, r8)
            if (r8 == 0) goto L_0x0261
            r1 = 2
        L_0x0261:
            boolean r5 = sf.j.a(r5, r11)
            if (r5 == 0) goto L_0x026b
            int r1 = r1 + 1
            goto L_0x026b
        L_0x026a:
            r1 = r3
        L_0x026b:
            r5 = r1
            goto L_0x026e
        L_0x026d:
            r5 = r3
        L_0x026e:
            if (r2 != 0) goto L_0x0274
            if (r4 != 0) goto L_0x0274
            if (r5 <= r3) goto L_0x0287
        L_0x0274:
            b3.z$b r8 = new b3.z$b
            boolean r3 = r0.f3185l
            r0 = r8
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L_0x0286
            int r0 = r8.compareTo(r10)
            if (r0 <= 0) goto L_0x0287
        L_0x0286:
            r10 = r8
        L_0x0287:
            r8 = 0
            goto L_0x0013
        L_0x028a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.z.g(b3.w):b3.z$b");
    }

    public void h(Context context, AttributeSet attributeSet) {
        Object obj;
        j.f(context, "context");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b1.b.f2996e);
        j.e(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.D = 0;
            this.f3203c = null;
        } else if (!zf.j.t0(string)) {
            String concat = "android-app://androidx.navigation/".concat(string);
            this.D = concat.hashCode();
            this.f3203c = null;
            a(new u(concat, (String) null, (String) null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f3205e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((u) obj).f3174a;
            String str2 = this.E;
            if (j.a(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : "")) {
                break;
            }
        }
        sf.y.a(arrayList);
        arrayList.remove(obj);
        this.E = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.D = resourceId;
            this.f3203c = null;
            this.f3203c = a.a(context, resourceId);
        }
        this.f3204d = obtainAttributes.getText(0);
        ff.m mVar = ff.m.f8717a;
        obtainAttributes.recycle();
    }

    public int hashCode() {
        int i8;
        Set<String> keySet;
        int i10 = this.D * 31;
        String str = this.E;
        int hashCode = i10 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f3205e.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            int i11 = i8 * 31;
            String str2 = uVar.f3174a;
            int hashCode2 = (i11 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = uVar.f3175b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = uVar.f3176c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        h l10 = c.l(this.B);
        while (l10.hasNext()) {
            e eVar = (e) l10.next();
            int i12 = ((i8 * 31) + eVar.f3038a) * 31;
            f0 f0Var = eVar.f3039b;
            i8 = i12 + (f0Var != null ? f0Var.hashCode() : 0);
            Bundle bundle = eVar.f3040c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (String str5 : keySet) {
                    int i13 = i8 * 31;
                    Bundle bundle2 = eVar.f3040c;
                    j.c(bundle2);
                    Object obj = bundle2.get(str5);
                    i8 = i13 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str6 : e().keySet()) {
            int a10 = x.a(str6, i8 * 31, 31);
            i iVar = e().get(str6);
            i8 = a10 + (iVar != null ? iVar.hashCode() : 0);
        }
        return i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f3203c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.D));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.E;
        if (!(str2 == null || zf.j.t0(str2))) {
            sb2.append(" route=");
            sb2.append(this.E);
        }
        if (this.f3204d != null) {
            sb2.append(" label=");
            sb2.append(this.f3204d);
        }
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }
}
