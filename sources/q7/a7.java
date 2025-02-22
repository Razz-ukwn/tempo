package q7;

import ag.d;
import ag.m;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b7.c;
import cb.e;
import com.google.android.gms.internal.measurement.u0;
import d.a;
import gc.b;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import t6.f;
import t6.i;
import u6.q;

public final class a7 extends j4 {
    public static final String[] C = {"firebase_", "google_", "ga_"};
    public static final String[] D = {"_err"};
    public Integer B = null;

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f12905c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f12906d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f12907e;

    public a7(x3 x3Var) {
        super(x3Var);
    }

    public static boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean X(String str) {
        q.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Y(android.content.Context r4) {
        /*
            u6.q.i(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a7.Y(android.content.Context):boolean");
    }

    public static boolean Z(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            q.i(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public static byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean b0(int i8, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i8);
        return true;
    }

    public static boolean e0(String str, String[] strArr) {
        q.i(strArr);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str2 = strArr[i8];
            if (str == str2 || (str != null && str.equals(str2))) {
                return true;
            }
        }
        return false;
    }

    public static long l0(byte[] bArr) {
        q.i(bArr);
        int length = bArr.length;
        int i8 = 0;
        if (length > 0) {
            int i10 = length - 1;
            long j10 = 0;
            while (i10 >= 0 && i10 >= bArr.length - 8) {
                j10 += (((long) bArr[i10]) & 255) << i8;
                i8 += 8;
                i10--;
            }
            return j10;
        }
        throw new IllegalStateException();
    }

    public static String p(String str, int i8, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i8) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i8))).concat("...");
        }
        return null;
    }

    public static MessageDigest q() {
        int i8 = 0;
        while (i8 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i8++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList s(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f12926a);
            bundle.putString("origin", cVar.f12927b);
            bundle.putLong("creation_timestamp", cVar.f12929d);
            bundle.putString("name", cVar.f12928c.f13410b);
            Object w10 = cVar.f12928c.w();
            q.i(w10);
            m.D(bundle, w10);
            bundle.putBoolean("active", cVar.f12930e);
            String str = cVar.B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            s sVar = cVar.C;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f13311a);
                q qVar = sVar.f13312b;
                if (qVar != null) {
                    bundle.putBundle("timed_out_event_params", qVar.w());
                }
            }
            bundle.putLong("trigger_timeout", cVar.D);
            s sVar2 = cVar.E;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f13311a);
                q qVar2 = sVar2.f13312b;
                if (qVar2 != null) {
                    bundle.putBundle("triggered_event_params", qVar2.w());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f12928c.f13411c);
            bundle.putLong("time_to_live", cVar.F);
            s sVar3 = cVar.G;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f13311a);
                q qVar3 = sVar3.f13312b;
                if (qVar3 != null) {
                    bundle.putBundle("expired_event_params", qVar3.w());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void v(f5 f5Var, Bundle bundle, boolean z10) {
        if (!(bundle == null || f5Var == null)) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = f5Var.f13000a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = f5Var.f13001b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", f5Var.f13002c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && f5Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void z(z6 z6Var, String str, int i8, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        b0(i8, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", (long) i10);
        }
        z6Var.b(str, bundle);
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
                k4 k4Var = this.f13121a;
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.G.d(((x3) k4Var).I.e(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final void B(u0 u0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void C(u0 u0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void D(u0 u0Var, Bundle bundle) {
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void E(u0 u0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning byte array to wrapper");
        }
    }

    public final void F(u0 u0Var, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i8);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning int value to wrapper");
        }
    }

    public final void G(u0 u0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning long value to wrapper");
        }
    }

    public final void H(String str, u0 u0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning string value to wrapper");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r22
            r11 = r23
            if (r10 != 0) goto L_0x000b
            return
        L_0x000b:
            q7.k4 r0 = r8.f13121a
            r12 = r0
            q7.x3 r12 = (q7.x3) r12
            q7.f r0 = r12.C
            com.google.android.gms.internal.measurement.fb r1 = com.google.android.gms.internal.measurement.fb.f5276b
            com.google.android.gms.internal.measurement.g5 r1 = r1.f5277a
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.gb r1 = (com.google.android.gms.internal.measurement.gb) r1
            r1.zza()
            q7.k4 r1 = r0.f13121a
            q7.x3 r1 = (q7.x3) r1
            q7.f r1 = r1.C
            q7.f2 r2 = q7.g2.f13060t0
            r13 = 0
            boolean r1 = r1.r(r13, r2)
            r14 = 231100000(0xdc64e60, float:1.222156E-30)
            if (r1 == 0) goto L_0x0044
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.a7 r0 = r0.H
            q7.x3.j(r0)
            boolean r0 = r0.V(r14)
            if (r0 == 0) goto L_0x0044
            r0 = 35
            r7 = r0
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
        L_0x0054:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r0 = r16.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r11 == 0) goto L_0x006c
            boolean r0 = r11.contains(r6)
            if (r0 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r0 = 0
            goto L_0x007a
        L_0x006c:
            if (r24 != 0) goto L_0x0073
            int r0 = r8.i0(r6)
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x007a
            int r0 = r8.h0(r6)
        L_0x007a:
            if (r0 == 0) goto L_0x008c
            r1 = 3
            if (r0 != r1) goto L_0x0081
            r1 = r6
            goto L_0x0082
        L_0x0081:
            r1 = r13
        L_0x0082:
            r8.u(r10, r0, r6, r1)
            r10.remove(r6)
            r4 = r13
            r13 = r7
            goto L_0x0181
        L_0x008c:
            java.lang.Object r0 = r10.get(r6)
            boolean r0 = T(r0)
            if (r0 == 0) goto L_0x00a9
            q7.s2 r0 = r12.E
            q7.x3.l(r0)
            java.lang.String r1 = "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name"
            q7.q2 r0 = r0.G
            r5 = r21
            r0.e(r1, r9, r5, r6)
            r0 = 22
            r15 = r6
            r13 = r7
            goto L_0x00c4
        L_0x00a9:
            r5 = r21
            java.lang.Object r3 = r10.get(r6)
            r18 = 0
            r0 = r19
            r1 = r20
            r2 = r6
            r4 = r22
            r5 = r23
            r15 = r6
            r6 = r24
            r13 = r7
            r7 = r18
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7)
        L_0x00c4:
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00da
            java.lang.Object r1 = r10.get(r15)
            r8.u(r10, r0, r15, r1)
            r10.remove(r15)
            goto L_0x0180
        L_0x00da:
            boolean r0 = X(r15)
            if (r0 == 0) goto L_0x0180
            java.lang.String[] r0 = ag.d.C
            boolean r0 = e0(r15, r0)
            if (r0 != 0) goto L_0x0180
            int r0 = r17 + 1
            boolean r1 = r8.V(r14)
            r2 = 23
            if (r1 != 0) goto L_0x0111
            q7.s2 r1 = r12.E
            q7.x3.l(r1)
            q7.n2 r3 = r12.I
            java.lang.String r3 = r3.d(r9)
            q7.n2 r4 = r12.I
            java.lang.String r4 = r4.b(r10)
            java.lang.String r5 = "Item array not supported on client's version of Google Play Services (Android Only)"
            q7.q2 r1 = r1.D
            r1.d(r3, r4, r5)
            b0(r2, r10)
            r10.remove(r15)
            goto L_0x017c
        L_0x0111:
            if (r0 <= r13) goto L_0x017c
            com.google.android.gms.internal.measurement.fb r1 = com.google.android.gms.internal.measurement.fb.f5276b
            com.google.android.gms.internal.measurement.g5 r1 = r1.f5277a
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.gb r1 = (com.google.android.gms.internal.measurement.gb) r1
            r1.zza()
            q7.f r1 = r12.C
            q7.f2 r3 = q7.g2.f13060t0
            r4 = 0
            boolean r1 = r1.r(r4, r3)
            if (r1 == 0) goto L_0x015d
            q7.s2 r1 = r12.E
            q7.x3.l(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Item can't contain more than "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = " item-scoped custom params"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            q7.n2 r3 = r12.I
            java.lang.String r3 = r3.d(r9)
            q7.n2 r5 = r12.I
            java.lang.String r5 = r5.b(r10)
            q7.q2 r1 = r1.D
            r1.d(r3, r5, r2)
            r1 = 28
            b0(r1, r10)
            r10.remove(r15)
            goto L_0x017d
        L_0x015d:
            q7.s2 r1 = r12.E
            q7.x3.l(r1)
            q7.n2 r3 = r12.I
            java.lang.String r3 = r3.d(r9)
            q7.n2 r5 = r12.I
            java.lang.String r5 = r5.b(r10)
            java.lang.String r6 = "Item cannot contain custom parameters"
            q7.q2 r1 = r1.D
            r1.d(r3, r5, r6)
            b0(r2, r10)
            r10.remove(r15)
            goto L_0x017d
        L_0x017c:
            r4 = 0
        L_0x017d:
            r17 = r0
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            r7 = r13
            r13 = r4
            goto L_0x0054
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a7.I(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final boolean J(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        k4 k4Var = this.f13121a;
        if (!isEmpty) {
            q.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            x3 x3Var = (x3) k4Var;
            if (TextUtils.isEmpty(x3Var.f13421b)) {
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.D.c(s2.r(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            q.i(str2);
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.D.c(s2.r(str2), "Invalid admob_app_id. Analytics disabled.");
            return false;
        } else {
            x3 x3Var2 = (x3) k4Var;
            if (TextUtils.isEmpty(x3Var2.f13421b)) {
                s2 s2Var3 = x3Var2.E;
                x3.l(s2Var3);
                s2Var3.D.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean K(int i8, String str, String str2) {
        k4 k4Var = this.f13121a;
        if (str2 == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.D.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i8) {
            return true;
        } else {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.D.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r13 = this;
            r6 = r13
            r7 = r15
            r0 = r16
            r1 = r17
            r13.i()
            boolean r2 = T(r16)
            java.lang.String r3 = "param"
            r4 = 0
            q7.k4 r8 = r6.f13121a
            if (r2 == 0) goto L_0x00aa
            if (r20 == 0) goto L_0x00a7
            java.lang.String[] r2 = ag.d.B
            boolean r2 = e0(r15, r2)
            if (r2 != 0) goto L_0x0021
            r0 = 20
            return r0
        L_0x0021:
            r2 = r8
            q7.x3 r2 = (q7.x3) r2
            q7.x5 r5 = r2.u()
            r5.i()
            r5.j()
            boolean r9 = r5.q()
            if (r9 != 0) goto L_0x0035
            goto L_0x004a
        L_0x0035:
            q7.k4 r5 = r5.f13121a
            q7.x3 r5 = (q7.x3) r5
            q7.a7 r5 = r5.H
            q7.x3.j(r5)
            int r5 = r5.k0()
            r9 = 200900(0x310c4, float:2.81521E-40)
            if (r5 >= r9) goto L_0x004a
            r0 = 25
            return r0
        L_0x004a:
            r2.getClass()
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0056
            r9 = r0
            android.os.Parcelable[] r9 = (android.os.Parcelable[]) r9
            int r9 = r9.length
            goto L_0x0061
        L_0x0056:
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 == 0) goto L_0x00aa
            r9 = r0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
        L_0x0061:
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 <= r10) goto L_0x00aa
            q7.s2 r11 = r2.E
            q7.x3.l(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "Parameter array is too long; discarded. Value kind, name, array length"
            q7.q2 r11 = r11.G
            r11.e(r12, r3, r15, r9)
            r2.getClass()
            if (r5 == 0) goto L_0x008a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r10) goto L_0x00a3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r15, r2)
            goto L_0x00a3
        L_0x008a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a3
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r10) goto L_0x00a3
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r10)
            r5.<init>(r2)
            r1.putParcelableArrayList(r15, r5)
        L_0x00a3:
            r1 = 17
            r9 = r1
            goto L_0x00ab
        L_0x00a7:
            r0 = 21
            return r0
        L_0x00aa:
            r9 = r4
        L_0x00ab:
            boolean r1 = W(r14)
            if (r1 != 0) goto L_0x00c1
            boolean r1 = W(r15)
            if (r1 == 0) goto L_0x00b8
            goto L_0x00c1
        L_0x00b8:
            r1 = r8
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            r1 = 100
            goto L_0x00c9
        L_0x00c1:
            r1 = r8
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c9:
            boolean r1 = r13.O(r3, r15, r1, r0)
            if (r1 == 0) goto L_0x00d0
            return r9
        L_0x00d0:
            if (r20 == 0) goto L_0x0158
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e5
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.I(r1, r2, r3, r4, r5)
            goto L_0x0157
        L_0x00e5:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0119
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00ee:
            if (r12 >= r11) goto L_0x0157
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0109
            q7.x3 r8 = (q7.x3) r8
            q7.s2 r1 = r8.E
            q7.x3.l(r1)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            q7.q2 r1 = r1.G
            r1.d(r0, r15, r2)
            goto L_0x0158
        L_0x0109:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.I(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x00ee
        L_0x0119:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0158
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = r4
        L_0x0125:
            if (r12 >= r11) goto L_0x0157
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0147
            q7.x3 r8 = (q7.x3) r8
            q7.s2 r1 = r8.E
            q7.x3.l(r1)
            if (r0 == 0) goto L_0x013d
            java.lang.Class r0 = r0.getClass()
            goto L_0x013f
        L_0x013d:
            java.lang.String r0 = "null"
        L_0x013f:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            q7.q2 r1 = r1.G
            r1.d(r0, r15, r2)
            goto L_0x0158
        L_0x0147:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.I(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x0125
        L_0x0157:
            return r9
        L_0x0158:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a7.L(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final void M() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                s2 s2Var = ((x3) this.f13121a).E;
                x3.l(s2Var);
                s2Var.E.b("Utils falling back to Random for random id");
            }
        }
        this.f12906d.set(nextLong);
    }

    public final boolean N(String str, String[] strArr, String[] strArr2, String str2) {
        k4 k4Var = this.f13121a;
        if (str2 == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.D.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = C;
        for (int i8 = 0; i8 < 3; i8++) {
            if (str2.startsWith(strArr3[i8])) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.D.d(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !e0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && e0(str2, strArr2)) {
            return true;
        }
        s2 s2Var3 = ((x3) k4Var).E;
        x3.l(s2Var3);
        s2Var3.D.d(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean O(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i8) {
                s2 s2Var = ((x3) this.f13121a).E;
                x3.l(s2Var);
                s2Var.G.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean P(String str, String str2) {
        k4 k4Var = this.f13121a;
        if (str2 == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.D.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.D.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    s2 s2Var3 = ((x3) k4Var).E;
                    x3.l(s2Var3);
                    s2Var3.D.d(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    s2 s2Var4 = ((x3) k4Var).E;
                    x3.l(s2Var4);
                    s2Var4.D.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean Q(String str, String str2) {
        k4 k4Var = this.f13121a;
        if (str2 == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.D.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.D.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                s2 s2Var3 = ((x3) k4Var).E;
                x3.l(s2Var3);
                s2Var3.D.d(str, str2, "Name must start with a letter. Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    s2 s2Var4 = ((x3) k4Var).E;
                    x3.l(s2Var4);
                    s2Var4.D.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean R(String str) {
        i();
        x3 x3Var = (x3) this.f13121a;
        if (c.a(x3Var.f13419a).f3272a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.I.c(str, "Permission not granted");
        return false;
    }

    public final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        x3 x3Var = (x3) this.f13121a;
        String j10 = x3Var.C.j("debug.firebase.analytics.app");
        x3Var.getClass();
        return j10.equals(str);
    }

    public final boolean U(Context context, String str) {
        Signature[] signatureArr;
        k4 k4Var = this.f13121a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = c.a(context).b(64, str);
            if (b10 == null || (signatureArr = b10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.B.c(e10, "Error obtaining certificate");
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.c(e11, "Package name not found");
            return true;
        }
    }

    public final boolean V(int i8) {
        Boolean bool = ((x3) this.f13121a).u().f13434e;
        return k0() >= i8 / 1000 || (bool != null && !bool.booleanValue());
    }

    public final int c0(String str) {
        boolean equals = "_ldl".equals(str);
        k4 k4Var = this.f13121a;
        if (equals) {
            ((x3) k4Var).getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            ((x3) k4Var).getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            ((x3) k4Var).getClass();
            return 100;
        } else {
            ((x3) k4Var).getClass();
            return 36;
        }
    }

    public final Object d0(int i8, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return p(obj.toString(), i8, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle o02 = o0((Bundle) parcelable);
                    if (!o02.isEmpty()) {
                        arrayList.add(o02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int f0(Object obj, String str) {
        return "_ldl".equals(str) ? O("user property referrer", str, c0(str), obj) : O("user property", str, c0(str), obj) ? 0 : 7;
    }

    public final int g0(String str) {
        if (!P("event", str)) {
            return 2;
        }
        if (!N("event", e.Y, e.Z, str)) {
            return 13;
        }
        ((x3) this.f13121a).getClass();
        return !K(40, "event", str) ? 2 : 0;
    }

    public final int h0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((x3) this.f13121a).getClass();
        return !K(40, "event param", str) ? 3 : 0;
    }

    public final int i0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((x3) this.f13121a).getClass();
        return !K(40, "event param", str) ? 3 : 0;
    }

    public final boolean j() {
        return true;
    }

    public final int j0(String str) {
        if (!P("user property", str)) {
            return 6;
        }
        if (!N("user property", b.J, (String[]) null, str)) {
            return 15;
        }
        ((x3) this.f13121a).getClass();
        return !K(24, "user property", str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int k0() {
        if (this.B == null) {
            f fVar = f.f15396b;
            Context context = ((x3) this.f13121a).f13419a;
            fVar.getClass();
            AtomicBoolean atomicBoolean = i.f15402a;
            int i8 = 0;
            try {
                i8 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.B = Integer.valueOf(i8 / 1000);
        }
        return this.B.intValue();
    }

    public final Object m(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i8 = 256;
        k4 k4Var = this.f13121a;
        if (equals) {
            ((x3) k4Var).getClass();
            return d0(256, obj, true, true);
        }
        if (W(str)) {
            ((x3) k4Var).getClass();
        } else {
            ((x3) k4Var).getClass();
            i8 = 100;
        }
        return d0(i8, obj, false, true);
    }

    public final long m0() {
        long andIncrement;
        long j10;
        if (this.f12906d.get() == 0) {
            synchronized (this.f12906d) {
                long nanoTime = System.nanoTime();
                ((x3) this.f13121a).J.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i8 = this.f12907e + 1;
                this.f12907e = i8;
                j10 = nextLong + ((long) i8);
            }
            return j10;
        }
        synchronized (this.f12906d) {
            this.f12906d.compareAndSet(-1, 1);
            andIncrement = this.f12906d.getAndIncrement();
        }
        return andIncrement;
    }

    public final Object n(Object obj, String str) {
        return "_ldl".equals(str) ? d0(c0(str), obj, true, false) : d0(c0(str), obj, false, false);
    }

    public final Bundle n0(boolean z10, Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str8 = uri2.getQueryParameter("utm_campaign");
                    str7 = uri2.getQueryParameter("utm_source");
                    str6 = uri2.getQueryParameter("utm_medium");
                    str5 = uri2.getQueryParameter("gclid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    str = z10 ? uri2.getQueryParameter("sfmc_id") : null;
                } else {
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z10 || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("campaign", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("source", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("medium", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (z10 && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                s2 s2Var = ((x3) this.f13121a).E;
                x3.l(s2Var);
                s2Var.E.c(e10, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        } else {
            return null;
        }
    }

    public final String o() {
        byte[] bArr = new byte[16];
        r().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final Bundle o0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object m = m(bundle.get(next), next);
                if (m == null) {
                    k4 k4Var = this.f13121a;
                    s2 s2Var = ((x3) k4Var).E;
                    x3.l(s2Var);
                    s2Var.G.c(((x3) k4Var).I.e(next), "Param value can't be null");
                } else {
                    A(bundle2, next, m);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle p0(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.lang.String[] r0 = cb.e.f3896b0
            boolean r12 = e0(r9, r0)
            if (r10 == 0) goto L_0x00ec
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>(r10)
            q7.k4 r0 = r8.f13121a
            r14 = r0
            q7.x3 r14 = (q7.x3) r14
            q7.f r0 = r14.C
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.a7 r0 = r0.H
            q7.x3.j(r0)
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            boolean r0 = r0.V(r1)
            if (r0 == 0) goto L_0x0031
            r0 = 100
            goto L_0x0033
        L_0x0031:
            r0 = 25
        L_0x0033:
            r15 = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r21.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0045:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r11 == 0) goto L_0x005e
            boolean r0 = r11.contains(r7)
            if (r0 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r0 = r17
            goto L_0x006d
        L_0x005e:
            if (r23 != 0) goto L_0x0065
            int r0 = r8.i0(r7)
            goto L_0x0067
        L_0x0065:
            r0 = r17
        L_0x0067:
            if (r0 != 0) goto L_0x006d
            int r0 = r8.h0(r7)
        L_0x006d:
            if (r0 == 0) goto L_0x007d
            r1 = 3
            if (r0 != r1) goto L_0x0074
            r1 = r7
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            r8.u(r13, r0, r7, r1)
            r13.remove(r7)
            goto L_0x00e8
        L_0x007d:
            java.lang.Object r3 = r10.get(r7)
            r0 = r19
            r1 = r20
            r2 = r7
            r4 = r13
            r5 = r22
            r6 = r23
            r11 = r7
            r7 = r12
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 17
            if (r0 != r1) goto L_0x009b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.u(r13, r1, r11, r0)
            goto L_0x00b7
        L_0x009b:
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x00b7
            r1 = 21
            if (r0 != r1) goto L_0x00ab
            r7 = r9
            goto L_0x00ac
        L_0x00ab:
            r7 = r11
        L_0x00ac:
            java.lang.Object r1 = r10.get(r11)
            r8.u(r13, r0, r7, r1)
            r13.remove(r11)
            goto L_0x00e8
        L_0x00b7:
            boolean r0 = X(r11)
            if (r0 == 0) goto L_0x00e8
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00e6
            java.lang.String r1 = "Event can't contain more than "
            java.lang.String r2 = " params"
            java.lang.String r1 = d.a.a(r1, r15, r2)
            q7.s2 r2 = r14.E
            q7.x3.l(r2)
            q7.n2 r3 = r14.I
            java.lang.String r3 = r3.d(r9)
            q7.n2 r4 = r14.I
            java.lang.String r4 = r4.b(r10)
            q7.q2 r2 = r2.D
            r2.d(r3, r4, r1)
            r1 = 5
            b0(r1, r13)
            r13.remove(r11)
        L_0x00e6:
            r18 = r0
        L_0x00e8:
            r11 = r22
            goto L_0x0045
        L_0x00ec:
            r13 = 0
        L_0x00ed:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a7.p0(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final s q0(String str, Bundle bundle, String str2, long j10, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (g0(str) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str2);
            Bundle p02 = p0(str, bundle2, Collections.singletonList("_o"), true);
            if (z10) {
                p02 = o0(p02);
            }
            q.i(p02);
            return new s(str, new q(p02), str2, j10);
        }
        x3 x3Var = (x3) this.f13121a;
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.B.c(x3Var.I.f(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom r() {
        i();
        if (this.f12905c == null) {
            this.f12905c = new SecureRandom();
        }
        return this.f12905c;
    }

    public final void t(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.E.c(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void u(Bundle bundle, int i8, String str, Object obj) {
        if (b0(i8, bundle)) {
            ((x3) this.f13121a).getClass();
            bundle.putString("_ev", p(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    a7 a7Var = ((x3) this.f13121a).H;
                    x3.j(a7Var);
                    a7Var.A(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void x(Parcelable[] parcelableArr, int i8, boolean z10) {
        q.i(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (X(str) && !e0(str, d.C) && (i10 = i10 + 1) > i8) {
                    k4 k4Var = this.f13121a;
                    if (z10) {
                        x3 x3Var = (x3) k4Var;
                        s2 s2Var = x3Var.E;
                        x3.l(s2Var);
                        s2Var.D.d(x3Var.I.e(str), x3Var.I.b(bundle), "Param can't contain more than " + i8 + " item-scoped custom parameters");
                        b0(28, bundle);
                    } else {
                        x3 x3Var2 = (x3) k4Var;
                        s2 s2Var2 = x3Var2.E;
                        x3.l(s2Var2);
                        s2Var2.D.d(x3Var2.I.e(str), x3Var2.I.b(bundle), "Param cannot contain item-scoped custom parameters");
                        b0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void y(t2 t2Var, int i8) {
        Bundle bundle = t2Var.f13335d;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (X(str) && (i10 = i10 + 1) > i8) {
                String a10 = a.a("Event can't contain more than ", i8, " params");
                x3 x3Var = (x3) this.f13121a;
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.D.d(x3Var.I.d(t2Var.f13332a), x3Var.I.b(bundle), a10);
                b0(5, bundle);
                bundle.remove(str);
            }
        }
    }
}
