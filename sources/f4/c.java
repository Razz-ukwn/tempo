package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.q;
import c4.j;
import f3.a;
import f4.b;
import ff.g;
import gf.t;
import gf.y;
import h4.h;
import h4.l;
import h4.m;
import h4.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x3.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f8580a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8581b;

    public c(f fVar, a aVar) {
        this.f8580a = fVar;
        this.f8581b = aVar;
    }

    public static n c(j jVar, h hVar, b.a aVar, b.C0153b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(hVar.f9144a.getResources(), bVar.f8578a);
        Map<String, Object> map = bVar.f8579b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = m4.c.f11189a;
        return new n(bitmapDrawable, hVar, 1, aVar, str, booleanValue, (jVar instanceof j) && jVar.f3710g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r7 != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (java.lang.Math.abs(((double) r3) - (r11 * ((double) r19))) > 1.0d) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        if (java.lang.Math.abs(r3 - r5) > 1) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        if (r1 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ff, code lost:
        if (r7 != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f4.b.C0153b a(h4.h r18, f4.b.a r19, i4.e r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r1.f9162t
            boolean r4 = h4.a.a(r4)
            r5 = 0
            if (r4 != 0) goto L_0x0012
            return r5
        L_0x0012:
            x3.f r4 = r0.f8580a
            f4.b r4 = r4.b()
            if (r4 == 0) goto L_0x001f
            f4.b$b r4 = r4.b(r2)
            goto L_0x0020
        L_0x001f:
            r4 = r5
        L_0x0020:
            if (r4 == 0) goto L_0x0108
            android.graphics.Bitmap r6 = r4.f8578a
            android.graphics.Bitmap$Config r7 = r6.getConfig()
            if (r7 != 0) goto L_0x002c
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x002c:
            f3.a r8 = r0.f8581b
            r8.getClass()
            boolean r7 = f3.a.b(r1, r7)
            if (r7 != 0) goto L_0x0039
            goto L_0x0101
        L_0x0039:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r4.f8579b
            java.lang.String r9 = "coil#is_sampled"
            java.lang.Object r7 = r7.get(r9)
            boolean r9 = r7 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x0048
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L_0x0049
        L_0x0048:
            r7 = r5
        L_0x0049:
            if (r7 == 0) goto L_0x0050
            boolean r7 = r7.booleanValue()
            goto L_0x0051
        L_0x0050:
            r7 = 0
        L_0x0051:
            boolean r9 = e9.c.h(r20)
            r10 = 1
            if (r9 == 0) goto L_0x005c
            if (r7 == 0) goto L_0x0103
            goto L_0x0101
        L_0x005c:
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f8577b
            java.lang.String r9 = "coil#transformation_size"
            java.lang.Object r2 = r2.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0072
            java.lang.String r1 = r20.toString()
            boolean r8 = sf.j.a(r2, r1)
            goto L_0x0104
        L_0x0072:
            int r2 = r6.getWidth()
            int r6 = r6.getHeight()
            i4.a r9 = r3.f9573a
            boolean r11 = r9 instanceof i4.a.C0176a
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto L_0x0088
            i4.a$a r9 = (i4.a.C0176a) r9
            int r9 = r9.f9566a
            goto L_0x0089
        L_0x0088:
            r9 = r12
        L_0x0089:
            i4.a r3 = r3.f9574b
            boolean r11 = r3 instanceof i4.a.C0176a
            if (r11 == 0) goto L_0x0096
            i4.a$a r3 = (i4.a.C0176a) r3
            int r3 = r3.f9566a
            r11 = r21
            goto L_0x0099
        L_0x0096:
            r11 = r21
            r3 = r12
        L_0x0099:
            double r13 = cb.f.c(r2, r6, r9, r3, r11)
            boolean r1 = m4.b.a(r18)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto L_0x00c9
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ab
            r11 = r15
            goto L_0x00ac
        L_0x00ab:
            r11 = r13
        L_0x00ac:
            double r8 = (double) r9
            r19 = r6
            double r5 = (double) r2
            double r5 = r5 * r11
            double r8 = r8 - r5
            double r5 = java.lang.Math.abs(r8)
            int r2 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            double r2 = (double) r3
            r5 = r19
            double r5 = (double) r5
            double r11 = r11 * r5
            double r2 = r2 - r11
            double r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x00ef
            goto L_0x0103
        L_0x00c9:
            r5 = r6
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L_0x00d3
            if (r9 != r12) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r8 = 0
            goto L_0x00d4
        L_0x00d3:
            r8 = r10
        L_0x00d4:
            if (r8 != 0) goto L_0x00dd
            int r9 = r9 - r2
            int r2 = java.lang.Math.abs(r9)
            if (r2 > r10) goto L_0x00ef
        L_0x00dd:
            if (r3 == r6) goto L_0x00e4
            if (r3 != r12) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r2 = 0
            goto L_0x00e5
        L_0x00e4:
            r2 = r10
        L_0x00e5:
            if (r2 != 0) goto L_0x0103
            int r3 = r3 - r5
            int r2 = java.lang.Math.abs(r3)
            if (r2 > r10) goto L_0x00ef
            goto L_0x0103
        L_0x00ef:
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x00f5
            r2 = r10
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            if (r2 != 0) goto L_0x00fb
            if (r1 != 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0103
            if (r7 == 0) goto L_0x0103
        L_0x0101:
            r8 = 0
            goto L_0x0104
        L_0x0103:
            r8 = r10
        L_0x0104:
            if (r8 == 0) goto L_0x0108
            r5 = r4
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.a(h4.h, f4.b$a, i4.e, int):f4.b$b");
    }

    public final b.a b(h hVar, Object obj, l lVar, x3.b bVar) {
        String str;
        Map map;
        b.a aVar = hVar.f9148e;
        if (aVar != null) {
            return aVar;
        }
        bVar.m();
        List<g<d4.b<? extends Object>, Class<? extends Object>>> list = this.f8580a.getComponents().f16918c;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                str = null;
                break;
            }
            g gVar = list.get(i8);
            d4.b bVar2 = (d4.b) gVar.f8706a;
            if (((Class) gVar.f8707b).isAssignableFrom(obj.getClass())) {
                sf.j.d(bVar2, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                str = bVar2.a(obj, lVar);
                if (str != null) {
                    break;
                }
            }
            i8++;
        }
        bVar.n();
        if (str == null) {
            return null;
        }
        Map<String, m.b> map2 = hVar.D.f9210a;
        boolean isEmpty = map2.isEmpty();
        t tVar = t.f8979a;
        if (isEmpty) {
            map = tVar;
        } else {
            map = new LinkedHashMap();
            for (Map.Entry<String, m.b> value : map2.entrySet()) {
                ((m.b) value.getValue()).getClass();
            }
        }
        List<k4.b> list2 = hVar.f9155l;
        if (list2.isEmpty() && map.isEmpty()) {
            return new b.a(str, tVar);
        }
        LinkedHashMap Y = y.Y(map);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Y.put(q.a("coil#transformation_", i10), list2.get(i10).b());
            }
            Y.put("coil#transformation_size", lVar.f9198d.toString());
        }
        return new b.a(str, Y);
    }
}
