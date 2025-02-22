package cb;

import ag.c0;
import ag.e1;
import ag.g2;
import ag.k0;
import ag.n0;
import ag.n1;
import ag.r0;
import ag.s0;
import ag.v1;
import ag.w;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.r1;
import androidx.fragment.app.q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.l;
import b3.f0;
import b3.g0;
import cg.e;
import cg.f;
import cg.n;
import cg.u;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.k7;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.n7;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.o7;
import com.google.android.gms.internal.p000firebaseauthapi.p7;
import com.google.android.gms.internal.p000firebaseauthapi.wd;
import com.quickkonnect.silencio.R;
import dg.i;
import dg.o;
import gf.s;
import he.a;
import i3.x;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import jf.e;
import jf.f;
import jf.g;
import jg.k;
import jg.r;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.x0;
import kotlinx.coroutines.flow.z;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.b;
import kotlinx.coroutines.scheduling.c;
import mb.a;
import q7.e2;
import s0.a0;
import s0.b1;
import sf.j;
import sf.y;
import t.b3;
import t.e0;
import t.h;
import t.j1;
import t.s2;
import t.t2;
import t.w2;

public class d implements s, ka, k, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f3890a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ d f3891b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final d f3892c = new d();

    public static String A(List list) {
        j.f(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        int size = list.size();
        int i8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            boolean z10 = true;
            i8++;
            if (i8 > 1) {
                sb2.append(",");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append(String.valueOf(obj));
            }
        }
        sb2.append("");
        String sb3 = sb2.toString();
        j.e(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.a(r2, r0) == r1) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(kotlinx.coroutines.flow.x0 r6, rf.p r7, jf.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.b0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.b0 r0 = (kotlinx.coroutines.flow.b0) r0
            int r1 = r0.f10508e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10508e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.b0 r0 = new kotlinx.coroutines.flow.b0
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f10507d
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10508e
            kotlinx.coroutines.internal.v r3 = m9.b.f11323d
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            kotlinx.coroutines.flow.a0 r6 = r0.f10506c
            sf.v r7 = r0.f10505b
            rf.p r0 = r0.f10504a
            cb.b.J(r8)     // Catch:{ a -> 0x002f }
            goto L_0x0064
        L_0x002f:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L_0x005e
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            cb.b.J(r8)
            sf.v r8 = new sf.v
            r8.<init>()
            r8.f14957a = r3
            kotlinx.coroutines.flow.a0 r2 = new kotlinx.coroutines.flow.a0
            r2.<init>(r7, r8)
            r0.f10504a = r7     // Catch:{ a -> 0x005b }
            r0.f10505b = r8     // Catch:{ a -> 0x005b }
            r0.f10506c = r2     // Catch:{ a -> 0x005b }
            r0.f10508e = r4     // Catch:{ a -> 0x005b }
            java.lang.Object r6 = r6.a(r2, r0)     // Catch:{ a -> 0x005b }
            if (r6 != r1) goto L_0x0062
            goto L_0x0068
        L_0x005b:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L_0x005e:
            kotlinx.coroutines.flow.g<?> r1 = r0.f7525a
            if (r1 != r6) goto L_0x007d
        L_0x0062:
            r0 = r7
            r7 = r8
        L_0x0064:
            T r1 = r7.f14957a
            if (r1 == r3) goto L_0x0069
        L_0x0068:
            return r1
        L_0x0069:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.B(kotlinx.coroutines.flow.x0, rf.p, jf.d):java.lang.Object");
    }

    public static final f C(p pVar, b bVar) {
        if (bVar.d(n1.b.f447a) == null) {
            return j.a(bVar, g.f10014a) ? pVar : pVar instanceof o ? o.a.a((o) pVar, bVar, 0, (e) null, 6) : new i(pVar, bVar, 0, (e) null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + bVar).toString());
    }

    public static final String D(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(format, *args)");
        return format;
    }

    public static Object E(Class cls, Object obj) {
        if (obj instanceof a) {
            return cls.cast(obj);
        }
        if (obj instanceof he.b) {
            return E(cls, ((he.b) obj).g());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), a.class, he.b.class}));
    }

    public static HashMap F() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        HashMap hashMap2 = hashMap;
        ArrayList c3 = d.a.c(arrayList, "VI", 1, hashMap2, arrayList, 2);
        c3.add("RU");
        c3.add("KZ");
        hashMap.put(7, c3);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, androidx.activity.result.d.d(34, hashMap, androidx.activity.result.d.d(33, hashMap, androidx.activity.result.d.d(32, hashMap, androidx.activity.result.d.d(31, hashMap, androidx.activity.result.d.d(30, hashMap, androidx.activity.result.d.d(27, hashMap, androidx.activity.result.d.d(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, androidx.activity.result.d.d(41, hashMap, androidx.activity.result.d.d(40, hashMap, androidx.activity.result.d.d(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, androidx.activity.result.d.d(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, androidx.activity.result.d.d(58, hashMap, androidx.activity.result.d.d(57, hashMap, androidx.activity.result.d.d(56, hashMap, androidx.activity.result.d.d(55, hashMap, androidx.activity.result.d.d(54, hashMap, androidx.activity.result.d.d(53, hashMap, androidx.activity.result.d.d(52, hashMap, androidx.activity.result.d.d(51, hashMap, androidx.activity.result.d.d(49, hashMap, androidx.activity.result.d.d(48, hashMap, androidx.activity.result.d.d(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList c10 = d.a.c(arrayList7, "CX", 61, hashMap2, arrayList7, 1);
        ArrayList c11 = d.a.c(c10, "ID", 62, hashMap2, c10, 1);
        ArrayList c12 = d.a.c(c11, "PH", 63, hashMap2, c11, 1);
        ArrayList c13 = d.a.c(c12, "NZ", 64, hashMap2, c12, 1);
        ArrayList c14 = d.a.c(c13, "SG", 65, hashMap2, c13, 1);
        ArrayList c15 = d.a.c(c14, "TH", 66, hashMap2, c14, 1);
        ArrayList c16 = d.a.c(c15, "JP", 81, hashMap2, c15, 1);
        ArrayList c17 = d.a.c(c16, "KR", 82, hashMap2, c16, 1);
        ArrayList c18 = d.a.c(c17, "VN", 84, hashMap2, c17, 1);
        ArrayList c19 = d.a.c(c18, "CN", 86, hashMap2, c18, 1);
        ArrayList c20 = d.a.c(c19, "TR", 90, hashMap2, c19, 1);
        ArrayList c21 = d.a.c(c20, "IN", 91, hashMap2, c20, 1);
        ArrayList c22 = d.a.c(c21, "PK", 92, hashMap2, c21, 1);
        ArrayList c23 = d.a.c(c22, "AF", 93, hashMap2, c22, 1);
        ArrayList c24 = d.a.c(c23, "LK", 94, hashMap2, c23, 1);
        ArrayList c25 = d.a.c(c24, "MM", 95, hashMap2, c24, 1);
        ArrayList c26 = d.a.c(c25, "IR", 98, hashMap2, c25, 1);
        ArrayList c27 = d.a.c(c26, "SS", 211, hashMap2, c26, 2);
        c27.add("MA");
        c27.add("EH");
        hashMap.put(212, c27);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, androidx.activity.result.d.d(260, hashMap, androidx.activity.result.d.d(258, hashMap, androidx.activity.result.d.d(257, hashMap, androidx.activity.result.d.d(256, hashMap, androidx.activity.result.d.d(255, hashMap, androidx.activity.result.d.d(254, hashMap, androidx.activity.result.d.d(253, hashMap, androidx.activity.result.d.d(252, hashMap, androidx.activity.result.d.d(251, hashMap, androidx.activity.result.d.d(250, hashMap, androidx.activity.result.d.d(249, hashMap, androidx.activity.result.d.d(248, hashMap, androidx.activity.result.d.d(247, hashMap, androidx.activity.result.d.d(246, hashMap, androidx.activity.result.d.d(245, hashMap, androidx.activity.result.d.d(244, hashMap, androidx.activity.result.d.d(243, hashMap, androidx.activity.result.d.d(242, hashMap, androidx.activity.result.d.d(241, hashMap, androidx.activity.result.d.d(240, hashMap, androidx.activity.result.d.d(239, hashMap, androidx.activity.result.d.d(238, hashMap, androidx.activity.result.d.d(237, hashMap, androidx.activity.result.d.d(236, hashMap, androidx.activity.result.d.d(235, hashMap, androidx.activity.result.d.d(234, hashMap, androidx.activity.result.d.d(233, hashMap, androidx.activity.result.d.d(232, hashMap, androidx.activity.result.d.d(231, hashMap, androidx.activity.result.d.d(230, hashMap, androidx.activity.result.d.d(229, hashMap, androidx.activity.result.d.d(228, hashMap, androidx.activity.result.d.d(227, hashMap, androidx.activity.result.d.d(226, hashMap, androidx.activity.result.d.d(225, hashMap, androidx.activity.result.d.d(224, hashMap, androidx.activity.result.d.d(223, hashMap, androidx.activity.result.d.d(222, hashMap, androidx.activity.result.d.d(221, hashMap, androidx.activity.result.d.d(220, hashMap, androidx.activity.result.d.d(218, hashMap, androidx.activity.result.d.d(216, hashMap, androidx.activity.result.d.d(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, androidx.activity.result.d.d(268, hashMap, androidx.activity.result.d.d(267, hashMap, androidx.activity.result.d.d(266, hashMap, androidx.activity.result.d.d(265, hashMap, androidx.activity.result.d.d(264, hashMap, androidx.activity.result.d.d(263, hashMap, androidx.activity.result.d.d(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, androidx.activity.result.d.d(356, hashMap, androidx.activity.result.d.d(355, hashMap, androidx.activity.result.d.d(354, hashMap, androidx.activity.result.d.d(353, hashMap, androidx.activity.result.d.d(352, hashMap, androidx.activity.result.d.d(351, hashMap, androidx.activity.result.d.d(350, hashMap, androidx.activity.result.d.d(299, hashMap, androidx.activity.result.d.d(298, hashMap, androidx.activity.result.d.d(297, hashMap, androidx.activity.result.d.d(291, hashMap, androidx.activity.result.d.d(290, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, androidx.activity.result.d.d(508, hashMap, androidx.activity.result.d.d(507, hashMap, androidx.activity.result.d.d(506, hashMap, androidx.activity.result.d.d(505, hashMap, androidx.activity.result.d.d(504, hashMap, androidx.activity.result.d.d(503, hashMap, androidx.activity.result.d.d(502, hashMap, androidx.activity.result.d.d(501, hashMap, androidx.activity.result.d.d(500, hashMap, androidx.activity.result.d.d(423, hashMap, androidx.activity.result.d.d(421, hashMap, androidx.activity.result.d.d(420, hashMap, androidx.activity.result.d.d(389, hashMap, androidx.activity.result.d.d(387, hashMap, androidx.activity.result.d.d(386, hashMap, androidx.activity.result.d.d(385, hashMap, androidx.activity.result.d.d(383, hashMap, androidx.activity.result.d.d(382, hashMap, androidx.activity.result.d.d(381, hashMap, androidx.activity.result.d.d(380, hashMap, androidx.activity.result.d.d(378, hashMap, androidx.activity.result.d.d(377, hashMap, androidx.activity.result.d.d(376, hashMap, androidx.activity.result.d.d(375, hashMap, androidx.activity.result.d.d(374, hashMap, androidx.activity.result.d.d(373, hashMap, androidx.activity.result.d.d(372, hashMap, androidx.activity.result.d.d(371, hashMap, androidx.activity.result.d.d(370, hashMap, androidx.activity.result.d.d(359, hashMap, androidx.activity.result.d.d(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList c28 = d.a.c(arrayList12, "MF", 590, hashMap2, arrayList12, 1);
        ArrayList c29 = d.a.c(c28, "BO", 591, hashMap2, c28, 1);
        ArrayList c30 = d.a.c(c29, "GY", 592, hashMap2, c29, 1);
        ArrayList c31 = d.a.c(c30, "EC", 593, hashMap2, c30, 1);
        ArrayList c32 = d.a.c(c31, "GF", 594, hashMap2, c31, 1);
        ArrayList c33 = d.a.c(c32, "PY", 595, hashMap2, c32, 1);
        ArrayList c34 = d.a.c(c33, "MQ", 596, hashMap2, c33, 1);
        ArrayList c35 = d.a.c(c34, "SR", 597, hashMap2, c34, 1);
        ArrayList c36 = d.a.c(c35, "UY", 598, hashMap2, c35, 2);
        c36.add("CW");
        c36.add("BQ");
        hashMap.put(599, c36);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, androidx.activity.result.d.d(996, hashMap, androidx.activity.result.d.d(995, hashMap, androidx.activity.result.d.d(994, hashMap, androidx.activity.result.d.d(993, hashMap, androidx.activity.result.d.d(992, hashMap, androidx.activity.result.d.d(979, hashMap, androidx.activity.result.d.d(977, hashMap, androidx.activity.result.d.d(976, hashMap, androidx.activity.result.d.d(975, hashMap, androidx.activity.result.d.d(974, hashMap, androidx.activity.result.d.d(973, hashMap, androidx.activity.result.d.d(972, hashMap, androidx.activity.result.d.d(971, hashMap, androidx.activity.result.d.d(970, hashMap, androidx.activity.result.d.d(968, hashMap, androidx.activity.result.d.d(967, hashMap, androidx.activity.result.d.d(966, hashMap, androidx.activity.result.d.d(965, hashMap, androidx.activity.result.d.d(964, hashMap, androidx.activity.result.d.d(963, hashMap, androidx.activity.result.d.d(962, hashMap, androidx.activity.result.d.d(961, hashMap, androidx.activity.result.d.d(960, hashMap, androidx.activity.result.d.d(888, hashMap, androidx.activity.result.d.d(886, hashMap, androidx.activity.result.d.d(883, hashMap, androidx.activity.result.d.d(882, hashMap, androidx.activity.result.d.d(881, hashMap, androidx.activity.result.d.d(880, hashMap, androidx.activity.result.d.d(878, hashMap, androidx.activity.result.d.d(870, hashMap, androidx.activity.result.d.d(856, hashMap, androidx.activity.result.d.d(855, hashMap, androidx.activity.result.d.d(853, hashMap, androidx.activity.result.d.d(852, hashMap, androidx.activity.result.d.d(850, hashMap, androidx.activity.result.d.d(808, hashMap, androidx.activity.result.d.d(800, hashMap, androidx.activity.result.d.d(692, hashMap, androidx.activity.result.d.d(691, hashMap, androidx.activity.result.d.d(690, hashMap, androidx.activity.result.d.d(689, hashMap, androidx.activity.result.d.d(688, hashMap, androidx.activity.result.d.d(687, hashMap, androidx.activity.result.d.d(686, hashMap, androidx.activity.result.d.d(685, hashMap, androidx.activity.result.d.d(683, hashMap, androidx.activity.result.d.d(682, hashMap, androidx.activity.result.d.d(681, hashMap, androidx.activity.result.d.d(680, hashMap, androidx.activity.result.d.d(679, hashMap, androidx.activity.result.d.d(678, hashMap, androidx.activity.result.d.d(677, hashMap, androidx.activity.result.d.d(676, hashMap, androidx.activity.result.d.d(675, hashMap, androidx.activity.result.d.d(674, hashMap, androidx.activity.result.d.d(673, hashMap, androidx.activity.result.d.d(672, hashMap, androidx.activity.result.d.d(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static final n1 G(jf.f fVar) {
        int i8 = n1.f446f;
        n1 n1Var = (n1) fVar.d(n1.b.f447a);
        if (n1Var != null) {
            return n1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + fVar).toString());
    }

    public static final int H(List list) {
        j.f(list, "<this>");
        return list.size() - 1;
    }

    public static final LifecycleCoroutineScopeImpl I(androidx.lifecycle.p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        j.f(pVar, "<this>");
        androidx.lifecycle.j b10 = pVar.b();
        j.f(b10, "<this>");
        while (true) {
            AtomicReference<Object> atomicReference = b10.f2275a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                g2 f10 = f();
                c cVar = s0.f480a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(b10, f10.n0(m.f10728a.J0()));
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    c cVar2 = s0.f480a;
                    b.D(lifecycleCoroutineScopeImpl, m.f10728a.J0(), 0, new l(lifecycleCoroutineScopeImpl, (jf.d<? super l>) null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final ag.l J(jf.d dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.f)) {
            return new ag.l(1, dVar);
        }
        ag.l k10 = ((kotlinx.coroutines.internal.f) dVar).k();
        if (k10 != null) {
            if (!k10.z()) {
                k10 = null;
            }
            if (k10 != null) {
                return k10;
            }
        }
        return new ag.l(2, dVar);
    }

    public static final j2.b K(View view) {
        j2.b bVar = (j2.b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar != null) {
            return bVar;
        }
        j2.b bVar2 = new j2.b();
        view.setTag(R.id.pooling_container_listener_holder_tag, bVar2);
        return bVar2;
    }

    public static final c0 L(i3.p pVar) {
        j.f(pVar, "<this>");
        Map<String, Object> map = pVar.f9517k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = pVar.f9508b;
            if (executor != null) {
                if (executor instanceof r0) {
                    r0 r0Var = (r0) executor;
                }
                obj = new e1(executor);
                map.put("QueryDispatcher", obj);
            } else {
                j.l("internalQueryExecutor");
                throw null;
            }
        }
        return (c0) obj;
    }

    public static final c0 M(i3.p pVar) {
        j.f(pVar, "<this>");
        Map<String, Object> map = pVar.f9517k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            x xVar = pVar.f9509c;
            if (xVar != null) {
                if (xVar instanceof r0) {
                    r0 r0Var = (r0) xVar;
                }
                obj = new e1(xVar);
                map.put("TransactionDispatcher", obj);
            } else {
                j.l("internalTransactionExecutor");
                throw null;
            }
        }
        return (c0) obj;
    }

    public static final void N(h hVar, rf.p pVar) {
        j.f(hVar, "composer");
        j.f(pVar, "composable");
        y.c(2, pVar);
        pVar.invoke(hVar, 1);
    }

    public static final List O(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List P(Object... objArr) {
        j.f(objArr, "elements");
        return objArr.length > 0 ? gf.l.R(objArr) : s.f8978a;
    }

    public static final ArrayList Q(Object... objArr) {
        j.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new gf.j(objArr, true));
    }

    public static final t.n1 R(Object obj, s2 s2Var) {
        j.f(s2Var, "policy");
        int i8 = t.a.f14979a;
        return new t.n1(obj, s2Var);
    }

    public static final f0 T(rf.l lVar) {
        j.f(lVar, "optionsBuilder");
        g0 g0Var = new g0();
        lVar.invoke(g0Var);
        boolean z10 = g0Var.f3061b;
        f0.a aVar = g0Var.f3060a;
        aVar.getClass();
        aVar.getClass();
        int i8 = g0Var.f3062c;
        boolean z11 = g0Var.f3063d;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new f0(z10, false, i8, false, z11, aVar.f3053a, aVar.f3054b, aVar.f3055c, aVar.f3056d);
    }

    public static final void U(rf.l lVar, rf.l lVar2, rf.a aVar) {
        w2 w2Var = t2.f15234a;
        j.f(lVar, "start");
        j.f(lVar2, "done");
        w2 w2Var2 = t2.f15234a;
        u.d dVar = (u.d) w2Var2.f();
        if (dVar == null) {
            dVar = new u.d(new ff.g[16]);
            w2Var2.h(dVar);
        }
        try {
            dVar.b(new ff.g(lVar, lVar2));
            aVar.d();
        } finally {
            dVar.k(dVar.f15640c - 1);
        }
    }

    public static void V(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof r1) {
                    editorInfo.hintText = ((r1) parent).a();
                    return;
                }
            }
        }
    }

    public static final List W(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : O(list.get(0)) : s.f8978a;
    }

    public static byte[] X(InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i10 = 0;
        while (i10 < i8) {
            int read = inputStream.read(bArr, i10, i8 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(q.a("Not enough bytes to read: ", i8));
            }
        }
        return bArr;
    }

    public static byte[] Y(FileInputStream fileInputStream, int i8, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i8) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
            }
            if (i11 != i8) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i11);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e10) {
            throw new IllegalStateException(e10.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long Z(InputStream inputStream, int i8) {
        byte[] X = X(inputStream, i8);
        long j10 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j10 += ((long) (X[i10] & 255)) << (i10 * 8);
        }
        return j10;
    }

    public static int a0(InputStream inputStream) {
        return (int) Z(inputStream, 2);
    }

    public static final Object b0(Object obj) {
        return obj instanceof w ? b.u(((w) obj).f504a) : obj;
    }

    public static final j1 c0(Object obj, h hVar) {
        hVar.c(-1058319986);
        e0.b bVar = e0.f15020a;
        hVar.c(-492369756);
        Object d10 = hVar.d();
        if (d10 == h.a.f15061a) {
            d10 = R(obj, b3.f14997a);
            hVar.n(d10);
        }
        hVar.o();
        j1 j1Var = (j1) d10;
        j1Var.setValue(obj);
        hVar.o();
        return j1Var;
    }

    public static cg.a d(int i8, e eVar, int i10) {
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        int i11 = i10 & 2;
        e eVar2 = e.f4020a;
        if (i11 != 0) {
            eVar = eVar2;
        }
        int i12 = 1;
        if (i8 == -2) {
            if (eVar == eVar2) {
                cg.f.f4023g.getClass();
                i12 = f.a.f4025b;
            }
            return new cg.d(i12, eVar, (rf.l) null);
        } else if (i8 != -1) {
            return i8 != 0 ? i8 != Integer.MAX_VALUE ? (i8 == 1 && eVar == e.f4021b) ? new cg.m((rf.l) null) : new cg.d(i8, eVar, (rf.l) null) : new n((rf.l) null) : eVar == eVar2 ? new u((rf.l) null) : new cg.d(1, eVar, (rf.l) null);
        } else {
            if (eVar == eVar2) {
                z10 = true;
            }
            if (z10) {
                return new cg.m((rf.l) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static final b1 d0(a0 a0Var) {
        j.f(a0Var, "<this>");
        b1 b1Var = a0Var.D;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final h0.d e(long j10, long j11) {
        return new h0.d(h0.c.b(j10), h0.c.c(j10), h0.g.b(j11) + h0.c.b(j10), h0.g.a(j11) + h0.c.c(j10));
    }

    public static final void e0(int i8, int i10, Object[] objArr) {
        j.f(objArr, "<this>");
        while (i8 < i10) {
            objArr[i8] = null;
            i8++;
        }
    }

    public static g2 f() {
        return new g2((n1) null);
    }

    public static final void f0(qb.c cVar) {
        j.f(cVar, "<this>");
        cVar.i(new a.b());
    }

    public static final String g0(Object obj) {
        j.f(obj, "obj");
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        j.e(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }

    public static final long h(float f10, float f11) {
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f11)) & 4294967295L) | (floatToIntBits << 32);
        int i8 = f1.m.f8046a;
        return floatToIntBits2;
    }

    public static final Object h0(kotlinx.coroutines.internal.s sVar, kotlinx.coroutines.internal.s sVar2, rf.p pVar) {
        Object obj;
        Object c02;
        try {
            y.c(2, pVar);
            obj = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            obj = new w(th, false);
        }
        kf.a aVar = kf.a.f10464a;
        if (obj == aVar || (c02 = sVar.c0(obj)) == v1.f499b) {
            return aVar;
        }
        if (!(c02 instanceof w)) {
            return v1.m(c02);
        }
        throw ((w) c02).f504a;
    }

    public static final void i(int i8, List list) {
        int size = list.size();
        if (i8 < 0 || i8 >= size) {
            throw new IndexOutOfBoundsException(androidx.activity.result.d.b("Index ", i8, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void i0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void j(int i8, int i10, List list) {
        int size = list.size();
        if (i8 > i10) {
            throw new IllegalArgumentException(androidx.activity.result.d.b("Indices are out of order. fromIndex (", i8, ") is greater than toIndex (", i10, ")."));
        } else if (i8 < 0) {
            throw new IndexOutOfBoundsException(d.a.a("fromIndex (", i8, ") is less than 0."));
        } else if (i10 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final void k(mg.a aVar, mg.c cVar, String str) {
        mg.d.f11491h.getClass();
        Logger logger = mg.d.f11493j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f11486b);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f11480a);
        logger.fine(sb2.toString());
    }

    public static final void l(StringBuilder sb2, Object obj, rf.l lVar) {
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append(String.valueOf(obj));
        }
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, long j10, int i8) {
        byte[] bArr = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) ((int) ((j10 >> (i10 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new gf.j(objArr, true));
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        l0(byteArrayOutputStream, (long) i8, 2);
    }

    public static final Object[] n(int i8) {
        if (i8 >= 0) {
            return new Object[i8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static kotlinx.coroutines.flow.f o(kotlinx.coroutines.flow.f fVar, int i8) {
        e eVar;
        int i10;
        e eVar2 = e.f4020a;
        if (i8 >= 0 || i8 == -2 || i8 == -1) {
            if (i8 == -1) {
                eVar = e.f4021b;
                i10 = 0;
            } else {
                i10 = i8;
                eVar = eVar2;
            }
            return fVar instanceof o ? o.a.a((o) fVar, (b) null, i10, eVar, 1) : new i(fVar, (b) null, i10, eVar, 2);
        }
        throw new IllegalArgumentException(q.a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i8).toString());
    }

    public static final hf.a p(hf.a aVar) {
        if (aVar.f9310e == null) {
            aVar.e();
            aVar.f9309d = true;
            return aVar;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable r(jf.d r4, kotlinx.coroutines.flow.f r5, kotlinx.coroutines.flow.g r6) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.q
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.q r0 = (kotlinx.coroutines.flow.q) r0
            int r1 = r0.f10619c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10619c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.q r0 = new kotlinx.coroutines.flow.q
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.f10618b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10619c
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sf.v r5 = r0.f10617a
            cb.b.J(r4)     // Catch:{ all -> 0x0029 }
            goto L_0x004c
        L_0x0029:
            r4 = move-exception
            r1 = r4
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            cb.b.J(r4)
            sf.v r4 = new sf.v
            r4.<init>()
            kotlinx.coroutines.flow.r r2 = new kotlinx.coroutines.flow.r     // Catch:{ all -> 0x004e }
            r2.<init>(r6, r4)     // Catch:{ all -> 0x004e }
            r0.f10617a = r4     // Catch:{ all -> 0x004e }
            r0.f10619c = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r5.a(r2, r0)     // Catch:{ all -> 0x004e }
            if (r4 != r1) goto L_0x004c
            goto L_0x008b
        L_0x004c:
            r1 = 0
            goto L_0x008b
        L_0x004e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L_0x0051:
            T r4 = r5.f14957a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L_0x0060
            boolean r6 = sf.j.a(r4, r1)
            if (r6 == 0) goto L_0x0060
            r6 = r3
            goto L_0x0061
        L_0x0060:
            r6 = r5
        L_0x0061:
            if (r6 != 0) goto L_0x0098
            jf.f r6 = r0.getContext()
            ag.n1$b r0 = ag.n1.b.f447a
            jf.f$b r6 = r6.d(r0)
            ag.n1 r6 = (ag.n1) r6
            if (r6 == 0) goto L_0x0087
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0078
            goto L_0x0087
        L_0x0078:
            java.util.concurrent.CancellationException r6 = r6.F()
            if (r6 == 0) goto L_0x0085
            boolean r6 = sf.j.a(r6, r1)
            if (r6 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r3 = r5
        L_0x0086:
            r5 = r3
        L_0x0087:
            if (r5 != 0) goto L_0x0098
            if (r4 != 0) goto L_0x008c
        L_0x008b:
            return r1
        L_0x008c:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x0094
            androidx.fragment.app.z0.c(r4, r1)
            throw r4
        L_0x0094:
            androidx.fragment.app.z0.c(r1, r4)
            throw r1
        L_0x0098:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.r(jf.d, kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.g):java.io.Serializable");
    }

    public static int s(Context context, String str) {
        int i8;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = s1.g.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            Class cls = AppOpsManager.class;
            if (!(Process.myUid() == myUid && c2.b.a(context.getPackageName(), packageName))) {
                i8 = s1.g.c((AppOpsManager) s1.g.a(context, cls), d10, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = s1.h.c(context);
                i8 = s1.h.a(c3, d10, Binder.getCallingUid(), packageName);
                if (i8 == 0) {
                    i8 = s1.h.a(c3, d10, myUid, s1.h.b(context));
                }
            } else {
                i8 = s1.g.c((AppOpsManager) s1.g.a(context, cls), d10, packageName);
            }
            if (i8 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final Object t(kotlinx.coroutines.flow.f fVar, rf.p pVar, jf.d dVar) {
        int i8 = z.f10695a;
        Object a10 = o(new dg.j(new kotlinx.coroutines.flow.y(pVar, (jf.d<? super kotlinx.coroutines.flow.y>) null), fVar, g.f10014a, -2, e.f4020a), 0).a(dg.q.f7580a, dVar);
        kf.a aVar = kf.a.f10464a;
        if (a10 != aVar) {
            a10 = ff.m.f8717a;
        }
        return a10 == aVar ? a10 : ff.m.f8717a;
    }

    public static byte[] u(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static final kotlinx.coroutines.flow.c v(cg.f fVar) {
        return new kotlinx.coroutines.flow.c(fVar, true);
    }

    public static final Object x(long j10, jf.d dVar) {
        if (j10 <= 0) {
            return ff.m.f8717a;
        }
        ag.l lVar = new ag.l(1, e9.c.g(dVar));
        lVar.t();
        if (j10 < Long.MAX_VALUE) {
            f.b d10 = lVar.f435e.d(e.a.f10012a);
            n0 n0Var = d10 instanceof n0 ? (n0) d10 : null;
            if (n0Var == null) {
                n0Var = k0.f428a;
            }
            n0Var.f0(j10, lVar);
        }
        Object s10 = lVar.s();
        return s10 == kf.a.f10464a ? s10 : ff.m.f8717a;
    }

    public static final kotlinx.coroutines.flow.f y(kotlinx.coroutines.flow.f fVar) {
        l.b bVar = kotlinx.coroutines.flow.l.f10579a;
        if (fVar instanceof x0) {
            return fVar;
        }
        l.b bVar2 = kotlinx.coroutines.flow.l.f10579a;
        l.a aVar = kotlinx.coroutines.flow.l.f10580b;
        if (fVar instanceof kotlinx.coroutines.flow.e) {
            kotlinx.coroutines.flow.e eVar = (kotlinx.coroutines.flow.e) fVar;
            if (eVar.f10535b == bVar2 && eVar.f10536c == aVar) {
                return fVar;
            }
        }
        return new kotlinx.coroutines.flow.e(fVar);
    }

    public static final void z(jf.f fVar) {
        n1 n1Var = (n1) fVar.d(n1.b.f447a);
        if (n1Var != null && !n1Var.c()) {
            throw n1Var.F();
        }
    }

    public c a(nb nbVar) {
        ab abVar = p7.f4809a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                wd w10 = wd.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    n7 n7Var = n7.f4753d;
                    int c3 = w10.x().c();
                    if (!(c3 == 16 || c3 == 24)) {
                        if (c3 != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(c3)}));
                        }
                    }
                    Integer valueOf = Integer.valueOf(c3);
                    Integer num = 12;
                    Integer num2 = 16;
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    int zza = mgVar.zza();
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                }
                            }
                        }
                        n7Var = n7.f4752c;
                    } else {
                        n7Var = n7.f4751b;
                    }
                    if (valueOf == null) {
                        throw new GeneralSecurityException("Key size is not set");
                    } else if (num == null) {
                        throw new GeneralSecurityException("IV size is not set");
                    } else if (num2 != null) {
                        int intValue = valueOf.intValue();
                        num.intValue();
                        num2.intValue();
                        o7 o7Var = new o7(intValue, n7Var);
                        k7 k7Var = new k7();
                        k7Var.f4683a = o7Var;
                        k7Var.f4684b = r3.s.i(w10.x().m());
                        k7Var.f4685c = ((lb) nbVar).B;
                        return k7Var.a();
                    } else {
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                } else {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
            } catch (com.google.android.gms.internal.p000firebaseauthapi.w2 unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
    }

    public void b(r rVar, List list) {
        j.f(rVar, "url");
    }

    public void c(r rVar) {
        j.f(rVar, "url");
    }

    public Object g() {
        return new ConcurrentSkipListMap();
    }

    public void j0(String str) {
        if (q(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void k0(String str, Exception exc) {
        if (q(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    public boolean q(int i8) {
        return 4 <= i8 || Log.isLoggable("FirebaseCrashlytics", i8);
    }

    public void w(String str) {
        if (q(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public Object zza() {
        List list = q7.g2.f13022a;
        return Integer.valueOf((int) aa.f5157b.zza().zzf());
    }
}
