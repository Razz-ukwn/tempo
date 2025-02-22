package q7;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.i2;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k2;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.n2;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.ob;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.x3;
import h0.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class v6 extends n6 {
    public v6(t6 t6Var) {
        super(t6Var);
    }

    public static c7 A(c7 c7Var, byte[] bArr) {
        s6 s6Var;
        s6 s6Var2 = s6.f5516b;
        if (s6Var2 == null) {
            synchronized (s6.class) {
                s6Var = s6.f5516b;
                if (s6Var == null) {
                    s6Var = a7.b();
                    s6.f5516b = s6Var;
                }
            }
            s6Var2 = s6Var;
        }
        if (s6Var2 != null) {
            c7Var.getClass();
            c7Var.i(bArr, bArr.length, s6Var2);
            return c7Var;
        }
        c7Var.getClass();
        c7Var.i(bArr, bArr.length, s6.f5517c);
        return c7Var;
    }

    public static ArrayList E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i8 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j10 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static HashMap F(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(F((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Object obj2 = arrayList2.get(i8);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(F((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(F((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public static boolean H(int i8, k7 k7Var) {
        if (i8 >= k7Var.size() * 64) {
            return false;
        }
        return ((1 << (i8 % 64)) & ((Long) k7Var.get(i8 / 64)).longValue()) != 0;
    }

    public static boolean J(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void L(e3 e3Var, String str, Long l10) {
        List r10 = e3Var.r();
        int i8 = 0;
        while (true) {
            if (i8 >= r10.size()) {
                i8 = -1;
                break;
            } else if (str.equals(((j3) r10.get(i8)).z())) {
                break;
            } else {
                i8++;
            }
        }
        i3 x10 = j3.x();
        x10.n(str);
        if (l10 instanceof Long) {
            x10.m(l10.longValue());
        }
        if (i8 >= 0) {
            e3Var.l();
            f3.C((f3) e3Var.f5179b, i8, (j3) x10.j());
            return;
        }
        e3Var.o(x10);
    }

    public static final j3 m(f3 f3Var, String str) {
        for (j3 j3Var : f3Var.B()) {
            if (j3Var.z().equals(str)) {
                return j3Var;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable n(f3 f3Var, String str) {
        j3 m = m(f3Var, str);
        if (m == null) {
            return null;
        }
        if (m.Q()) {
            return m.A();
        }
        if (m.O()) {
            return Long.valueOf(m.w());
        }
        if (m.M()) {
            return Double.valueOf(m.t());
        }
        if (m.v() <= 0) {
            return null;
        }
        List<j3> B = m.B();
        ArrayList arrayList = new ArrayList();
        for (j3 j3Var : B) {
            if (j3Var != null) {
                Bundle bundle = new Bundle();
                for (j3 j3Var2 : j3Var.B()) {
                    if (j3Var2.Q()) {
                        bundle.putString(j3Var2.z(), j3Var2.A());
                    } else if (j3Var2.O()) {
                        bundle.putLong(j3Var2.z(), j3Var2.w());
                    } else if (j3Var2.M()) {
                        bundle.putDouble(j3Var2.z(), j3Var2.t());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void q(int i8, StringBuilder sb2) {
        for (int i10 = 0; i10 < i8; i10++) {
            sb2.append("  ");
        }
    }

    public static final String r(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void s(StringBuilder sb2, String str, t3 t3Var) {
        if (t3Var != null) {
            q(3, sb2);
            sb2.append(str);
            sb2.append(" {\n");
            if (t3Var.u() != 0) {
                q(4, sb2);
                sb2.append("results: ");
                int i8 = 0;
                for (Long l10 : t3Var.B()) {
                    int i10 = i8 + 1;
                    if (i8 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l10);
                    i8 = i10;
                }
                sb2.append(10);
            }
            if (t3Var.w() != 0) {
                q(4, sb2);
                sb2.append("status: ");
                int i11 = 0;
                for (Long l11 : t3Var.D()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l11);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (t3Var.t() != 0) {
                q(4, sb2);
                sb2.append("dynamic_filter_timestamps: {");
                int i13 = 0;
                for (d3 d3Var : t3Var.A()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(d3Var.A() ? Integer.valueOf(d3Var.t()) : null);
                    sb2.append(":");
                    sb2.append(d3Var.z() ? Long.valueOf(d3Var.u()) : null);
                    i13 = i14;
                }
                sb2.append("}\n");
            }
            if (t3Var.v() != 0) {
                q(4, sb2);
                sb2.append("sequence_filter_timestamps: {");
                int i15 = 0;
                for (v3 v3Var : t3Var.C()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(v3Var.B() ? Integer.valueOf(v3Var.u()) : null);
                    sb2.append(": [");
                    int i17 = 0;
                    for (Long longValue : v3Var.y()) {
                        long longValue2 = longValue.longValue();
                        int i18 = i17 + 1;
                        if (i17 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i17 = i18;
                    }
                    sb2.append("]");
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            q(3, sb2);
            sb2.append("}\n");
        }
    }

    public static final void t(StringBuilder sb2, int i8, String str, Object obj) {
        if (obj != null) {
            q(i8 + 1, sb2);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    public static final void u(StringBuilder sb2, int i8, String str, i2 i2Var) {
        if (i2Var != null) {
            q(i8, sb2);
            sb2.append(str);
            sb2.append(" {\n");
            if (i2Var.z()) {
                int E = i2Var.E();
                t(sb2, i8, "comparison_type", E != 1 ? E != 2 ? E != 3 ? E != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (i2Var.B()) {
                t(sb2, i8, "match_as_float", Boolean.valueOf(i2Var.y()));
            }
            if (i2Var.A()) {
                t(sb2, i8, "comparison_value", i2Var.v());
            }
            if (i2Var.D()) {
                t(sb2, i8, "min_comparison_value", i2Var.x());
            }
            if (i2Var.C()) {
                t(sb2, i8, "max_comparison_value", i2Var.w());
            }
            q(i8, sb2);
            sb2.append("}\n");
        }
    }

    public static int v(n3 n3Var, String str) {
        for (int i8 = 0; i8 < ((o3) n3Var.f5179b).t1(); i8++) {
            if (str.equals(((o3) n3Var.f5179b).I1(i8).y())) {
                return i8;
            }
        }
        return -1;
    }

    public static Bundle x(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(x((Map) arrayList.get(i8), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q7.s z(com.google.android.gms.internal.measurement.b r8) {
        /*
            java.util.HashMap r0 = r8.f5162c
            r1 = 1
            android.os.Bundle r0 = x(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "app"
        L_0x001c:
            r5 = r1
            java.lang.String r1 = r8.f5160a
            java.lang.String[] r2 = cb.e.Y
            java.lang.String[] r3 = cb.e.f3894a0
            java.lang.String r1 = b1.b.p(r1, r2, r3)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = r8.f5160a
        L_0x002b:
            r3 = r1
            q7.s r1 = new q7.s
            q7.q r4 = new q7.q
            r4.<init>(r0)
            long r6 = r8.f5161b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.v6.z(com.google.android.gms.internal.measurement.b):q7.s");
    }

    public final String B(m3 m3Var) {
        StringBuilder c3 = e.c("\nbatch {\n");
        for (o3 o3Var : m3Var.w()) {
            if (o3Var != null) {
                q(1, c3);
                c3.append("bundle {\n");
                if (o3Var.g1()) {
                    t(c3, 1, "protocol_version", Integer.valueOf(o3Var.q1()));
                }
                kc.b();
                x3 x3Var = (x3) this.f13121a;
                if (x3Var.C.r(o3Var.K1(), g2.f13045l0) && o3Var.j1()) {
                    t(c3, 1, "session_stitching_token", o3Var.E());
                }
                t(c3, 1, "platform", o3Var.C());
                if (o3Var.c1()) {
                    t(c3, 1, "gmp_version", Long.valueOf(o3Var.y1()));
                }
                if (o3Var.o1()) {
                    t(c3, 1, "uploading_gmp_version", Long.valueOf(o3Var.E1()));
                }
                if (o3Var.a1()) {
                    t(c3, 1, "dynamite_version", Long.valueOf(o3Var.w1()));
                }
                if (o3Var.X0()) {
                    t(c3, 1, "config_version", Long.valueOf(o3Var.u1()));
                }
                t(c3, 1, "gmp_app_id", o3Var.z());
                t(c3, 1, "admob_app_id", o3Var.J1());
                t(c3, 1, "app_id", o3Var.K1());
                t(c3, 1, "app_version", o3Var.u());
                if (o3Var.V0()) {
                    t(c3, 1, "app_version_major", Integer.valueOf(o3Var.S()));
                }
                t(c3, 1, "firebase_instance_id", o3Var.y());
                if (o3Var.Z0()) {
                    t(c3, 1, "dev_cert_hash", Long.valueOf(o3Var.v1()));
                }
                t(c3, 1, "app_store", o3Var.t());
                if (o3Var.n1()) {
                    t(c3, 1, "upload_timestamp_millis", Long.valueOf(o3Var.D1()));
                }
                if (o3Var.k1()) {
                    t(c3, 1, "start_timestamp_millis", Long.valueOf(o3Var.B1()));
                }
                if (o3Var.b1()) {
                    t(c3, 1, "end_timestamp_millis", Long.valueOf(o3Var.x1()));
                }
                if (o3Var.f1()) {
                    t(c3, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(o3Var.A1()));
                }
                if (o3Var.e1()) {
                    t(c3, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(o3Var.z1()));
                }
                t(c3, 1, "app_instance_id", o3Var.L1());
                t(c3, 1, "resettable_device_id", o3Var.D());
                t(c3, 1, "ds_id", o3Var.x());
                if (o3Var.d1()) {
                    t(c3, 1, "limited_ad_tracking", Boolean.valueOf(o3Var.r0()));
                }
                t(c3, 1, "os_version", o3Var.B());
                t(c3, 1, "device_model", o3Var.w());
                t(c3, 1, "user_default_language", o3Var.F());
                if (o3Var.m1()) {
                    t(c3, 1, "time_zone_offset_minutes", Integer.valueOf(o3Var.s1()));
                }
                if (o3Var.W0()) {
                    t(c3, 1, "bundle_sequential_index", Integer.valueOf(o3Var.S0()));
                }
                if (o3Var.i1()) {
                    t(c3, 1, "service_upload", Boolean.valueOf(o3Var.s0()));
                }
                t(c3, 1, "health_monitor", o3Var.A());
                if (o3Var.h1()) {
                    t(c3, 1, "retry_counter", Integer.valueOf(o3Var.r1()));
                }
                if (o3Var.Y0()) {
                    t(c3, 1, "consent_signals", o3Var.v());
                }
                ob.a();
                if (x3Var.C.r((String) null, g2.f13068x0) && o3Var.l1()) {
                    t(c3, 1, "target_os_version", Long.valueOf(o3Var.C1()));
                }
                l7<x3> I = o3Var.I();
                if (I != null) {
                    for (x3 x3Var2 : I) {
                        if (x3Var2 != null) {
                            q(2, c3);
                            c3.append("user_property {\n");
                            t(c3, 2, "set_timestamp_millis", x3Var2.K() ? Long.valueOf(x3Var2.v()) : null);
                            t(c3, 2, "name", x3Var.I.f(x3Var2.y()));
                            t(c3, 2, "string_value", x3Var2.z());
                            t(c3, 2, "int_value", x3Var2.J() ? Long.valueOf(x3Var2.u()) : null);
                            t(c3, 2, "double_value", x3Var2.I() ? Double.valueOf(x3Var2.t()) : null);
                            q(2, c3);
                            c3.append("}\n");
                        }
                    }
                }
                l7<b3> G = o3Var.G();
                if (G != null) {
                    for (b3 b3Var : G) {
                        if (b3Var != null) {
                            q(2, c3);
                            c3.append("audience_membership {\n");
                            if (b3Var.D()) {
                                t(c3, 2, "audience_id", Integer.valueOf(b3Var.t()));
                            }
                            if (b3Var.E()) {
                                t(c3, 2, "new_audience", Boolean.valueOf(b3Var.C()));
                            }
                            s(c3, "current_data", b3Var.w());
                            if (b3Var.F()) {
                                s(c3, "previous_data", b3Var.x());
                            }
                            q(2, c3);
                            c3.append("}\n");
                        }
                    }
                }
                l7<f3> H = o3Var.H();
                if (H != null) {
                    for (f3 f3Var : H) {
                        if (f3Var != null) {
                            q(2, c3);
                            c3.append("event {\n");
                            t(c3, 2, "name", x3Var.I.d(f3Var.A()));
                            if (f3Var.M()) {
                                t(c3, 2, "timestamp_millis", Long.valueOf(f3Var.w()));
                            }
                            if (f3Var.L()) {
                                t(c3, 2, "previous_timestamp_millis", Long.valueOf(f3Var.v()));
                            }
                            if (f3Var.K()) {
                                t(c3, 2, "count", Integer.valueOf(f3Var.t()));
                            }
                            if (f3Var.u() != 0) {
                                o(c3, 2, (l7) f3Var.B());
                            }
                            q(2, c3);
                            c3.append("}\n");
                        }
                    }
                }
                q(1, c3);
                c3.append("}\n");
            }
        }
        c3.append("}\n");
        return c3.toString();
    }

    public final String C(k2 k2Var) {
        StringBuilder c3 = e.c("\nproperty_filter {\n");
        if (k2Var.C()) {
            t(c3, 0, "filter_id", Integer.valueOf(k2Var.t()));
        }
        t(c3, 0, "property_name", ((x3) this.f13121a).I.f(k2Var.x()));
        String r10 = r(k2Var.z(), k2Var.A(), k2Var.B());
        if (!r10.isEmpty()) {
            t(c3, 0, "filter_type", r10);
        }
        p(c3, 1, k2Var.u());
        c3.append("}\n");
        return c3.toString();
    }

    public final List D(k7 k7Var, List list) {
        int i8;
        ArrayList arrayList = new ArrayList(k7Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            k4 k4Var = this.f13121a;
            if (intValue < 0) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.E.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    s2 s2Var2 = ((x3) k4Var).E;
                    x3.l(s2Var2);
                    s2Var2.E.d(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i8 = size;
            size = i10;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i8);
    }

    public final void G(i3 i3Var, Object obj) {
        i3Var.l();
        j3.E((j3) i3Var.f5179b);
        i3Var.l();
        j3.G((j3) i3Var.f5179b);
        i3Var.l();
        j3.I((j3) i3Var.f5179b);
        i3Var.l();
        j3.L((j3) i3Var.f5179b);
        if (obj instanceof String) {
            i3Var.l();
            j3.D((j3) i3Var.f5179b, (String) obj);
        } else if (obj instanceof Long) {
            i3Var.m(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            i3Var.l();
            j3.H((j3) i3Var.f5179b, doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    i3 x10 = j3.x();
                    for (String next : bundle.keySet()) {
                        i3 x11 = j3.x();
                        x11.n(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            x11.m(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            x11.l();
                            j3.D((j3) x11.f5179b, (String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            x11.l();
                            j3.H((j3) x11.f5179b, doubleValue2);
                        }
                        x10.l();
                        j3.J((j3) x10.f5179b, (j3) x11.j());
                    }
                    if (((j3) x10.f5179b).v() > 0) {
                        arrayList.add((j3) x10.j());
                    }
                }
            }
            i3Var.l();
            j3.K((j3) i3Var.f5179b, arrayList);
        } else {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.B.c(obj, "Ignoring invalid (type) event param value");
        }
    }

    public final boolean I(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        ((x3) this.f13121a).J.getClass();
        return Math.abs(System.currentTimeMillis() - j10) > j11;
    }

    public final byte[] K(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.B.c(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final boolean l() {
        return false;
    }

    public final void o(StringBuilder sb2, int i8, l7 l7Var) {
        if (l7Var != null) {
            int i10 = i8 + 1;
            Iterator it = l7Var.iterator();
            while (it.hasNext()) {
                j3 j3Var = (j3) it.next();
                if (j3Var != null) {
                    q(i10, sb2);
                    sb2.append("param {\n");
                    Double d10 = null;
                    t(sb2, i10, "name", j3Var.P() ? ((x3) this.f13121a).I.e(j3Var.z()) : null);
                    t(sb2, i10, "string_value", j3Var.Q() ? j3Var.A() : null);
                    t(sb2, i10, "int_value", j3Var.O() ? Long.valueOf(j3Var.w()) : null);
                    if (j3Var.M()) {
                        d10 = Double.valueOf(j3Var.t());
                    }
                    t(sb2, i10, "double_value", d10);
                    if (j3Var.v() > 0) {
                        o(sb2, i10, (l7) j3Var.B());
                    }
                    q(i10, sb2);
                    sb2.append("}\n");
                }
            }
        }
    }

    public final void p(StringBuilder sb2, int i8, e2 e2Var) {
        String str;
        if (e2Var != null) {
            q(i8, sb2);
            sb2.append("filter {\n");
            if (e2Var.A()) {
                t(sb2, i8, "complement", Boolean.valueOf(e2Var.z()));
            }
            if (e2Var.C()) {
                t(sb2, i8, "param_name", ((x3) this.f13121a).I.e(e2Var.x()));
            }
            if (e2Var.D()) {
                int i10 = i8 + 1;
                n2 w10 = e2Var.w();
                if (w10 != null) {
                    q(i10, sb2);
                    sb2.append("string_filter {\n");
                    if (w10.B()) {
                        switch (w10.C()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        t(sb2, i10, "match_type", str);
                    }
                    if (w10.A()) {
                        t(sb2, i10, "expression", w10.w());
                    }
                    if (w10.z()) {
                        t(sb2, i10, "case_sensitive", Boolean.valueOf(w10.y()));
                    }
                    if (w10.t() > 0) {
                        q(i10 + 1, sb2);
                        sb2.append("expression_list {\n");
                        for (String append : w10.x()) {
                            q(i10 + 2, sb2);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    q(i10, sb2);
                    sb2.append("}\n");
                }
            }
            if (e2Var.B()) {
                u(sb2, i8 + 1, "number_filter", e2Var.v());
            }
            q(i8, sb2);
            sb2.append("}\n");
        }
    }

    public final long w(byte[] bArr) {
        x3 x3Var = (x3) this.f13121a;
        a7 a7Var = x3Var.H;
        x3.j(a7Var);
        a7Var.i();
        MessageDigest q10 = a7.q();
        if (q10 != null) {
            return a7.l0(q10.digest(bArr));
        }
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.B.b("Failed to get MD5");
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = ((q7.x3) r4.f13121a).E;
        q7.x3.l(r5);
        r5.B.b("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable y(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x0030
        L_0x001c:
            q7.k4 r5 = r4.f13121a     // Catch:{ all -> 0x001a }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ all -> 0x001a }
            q7.s2 r5 = r5.E     // Catch:{ all -> 0x001a }
            q7.x3.l(r5)     // Catch:{ all -> 0x001a }
            q7.q2 r5 = r5.B     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.b(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x0030:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.v6.y(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
