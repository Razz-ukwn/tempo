package ag;

import cb.c;
import cb.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.ae;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.q1;
import com.google.android.gms.internal.p000firebaseauthapi.q7;
import com.google.android.gms.internal.p000firebaseauthapi.s7;
import com.google.android.gms.internal.p000firebaseauthapi.t7;
import com.google.android.gms.internal.p000firebaseauthapi.u7;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import gf.l;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import jg.m;
import q7.e2;
import q7.g2;
import sf.j;
import t.w2;
import t9.e;
import t9.v;
import wg.i;

public final class d implements s, ka, m, e, e2 {
    public static final String[] B = {"items"};
    public static final String[] C = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final Object[] D = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f406a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ d f407b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ d f408c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f409d = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f410e = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    public static final boolean c(int i8, int i10, int i11, byte[] bArr, byte[] bArr2) {
        j.f(bArr, "a");
        j.f(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i8] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void d(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static b f(Status status) {
        return status.f4178d != null ? new g(status) : new b(status);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(java.util.List r4, jf.d r5) {
        /*
            boolean r0 = r5 instanceof ag.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ag.c r0 = (ag.c) r0
            int r1 = r0.f401c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f401c = r1
            goto L_0x0018
        L_0x0013:
            ag.c r0 = new ag.c
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f400b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f401c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.f399a
            cb.b.J(r5)
            goto L_0x003a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            cb.b.J(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            ag.n1 r5 = (ag.n1) r5
            r0.f399a = r4
            r0.f401c = r3
            java.lang.Object r5 = r5.e0(r0)
            if (r5 != r1) goto L_0x003a
            return r1
        L_0x0051:
            ff.m r4 = ff.m.f8717a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.d.h(java.util.List, jf.d):java.lang.Object");
    }

    public static final int i(i iVar, int i8) {
        j.f(iVar, "<this>");
        return i8 == -1234567890 ? iVar.d() : i8;
    }

    public static final Object[] j(Collection collection) {
        j.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = D;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i8 = 0;
        while (true) {
            int i10 = i8 + 1;
            objArr2[i8] = it.next();
            if (i10 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i11);
                j.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i10);
                j.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i8 = i10;
        }
    }

    public static final Object[] k(Collection collection, Object[] objArr) {
        Object[] objArr2;
        j.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i8 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i10 = i8 + 1;
                    objArr2[i8] = it.next();
                    if (i10 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i11);
                        j.e(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i10);
                        j.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i8 = i10;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static String l() {
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb2.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb2.append("-");
                sb2.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb2.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb2.append("-");
                    sb2.append(country2);
                }
            }
        }
        return sb2.toString();
    }

    public static String m(q1 q1Var) {
        StringBuilder sb2 = new StringBuilder(q1Var.c());
        for (int i8 = 0; i8 < q1Var.c(); i8++) {
            byte a10 = q1Var.a(i8);
            if (a10 == 34) {
                sb2.append("\\\"");
            } else if (a10 == 39) {
                sb2.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a10 >= 32 && a10 <= 126) {
                            sb2.append((char) a10);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            sb2.append((char) ((a10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static byte[] n(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i8 = 0; i8 < 16; i8++) {
                byte b10 = bArr[i8];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i8] = b11;
                if (i8 < 15) {
                    bArr2[i8] = (byte) (((bArr[i8 + 1] >> 7) & 1) | b11);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public c a(nb nbVar) {
        s7 s7Var;
        ab abVar = u7.f4985a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                ae w10 = ae.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    w2 w2Var = new w2(0);
                    int c3 = w10.x().c();
                    if (c3 != 16) {
                        if (c3 != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(c3)}));
                        }
                    }
                    w2Var.f15268a = Integer.valueOf(c3);
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                s7Var = s7.f4908d;
                            } else if (ordinal != 4) {
                                int zza = mgVar.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            }
                        }
                        s7Var = s7.f4907c;
                    } else {
                        s7Var = s7.f4906b;
                    }
                    w2Var.f15269b = s7Var;
                    t7 i8 = w2Var.i();
                    q7 q7Var = new q7();
                    q7Var.f4839a = i8;
                    q7Var.f4840b = r3.s.i(w10.x().m());
                    q7Var.f4841c = ((lb) nbVar).B;
                    return q7Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (com.google.android.gms.internal.p000firebaseauthapi.w2 unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
    }

    public List b(String str) {
        j.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            j.e(allByName, "getAllByName(hostname)");
            return l.f0(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(j.k(str, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public Object e(v vVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(vVar);
    }

    public Object g() {
        return new TreeMap();
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzp());
    }
}
