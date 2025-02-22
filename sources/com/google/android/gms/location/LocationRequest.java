package com.google.android.gms.location;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h0.e;
import java.util.Arrays;
import k7.q;
import k7.y;
import n7.p;
import org.checkerframework.dataflow.qual.Pure;
import z6.h;

public final class LocationRequest extends v6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new p();
    public final int B;
    public final float C;
    public final boolean D;
    public final long E;
    public final int F;
    public final int G;
    public final String H;
    public final boolean I;
    public final WorkSource J;
    public final q K;

    /* renamed from: a  reason: collision with root package name */
    public final int f5640a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5641b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5642c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5643d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5644e;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    public static String x(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = y.f10394a;
        synchronized (sb3) {
            sb3.setLength(0);
            y.a(j10, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r9 = (com.google.android.gms.location.LocationRequest) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.location.LocationRequest
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationRequest r9 = (com.google.android.gms.location.LocationRequest) r9
            int r0 = r9.f5640a
            int r2 = r8.f5640a
            if (r2 != r0) goto L_0x008c
            r0 = 105(0x69, float:1.47E-43)
            r3 = 1
            if (r2 != r0) goto L_0x0014
            r0 = r3
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x001f
            long r4 = r8.f5641b
            long r6 = r9.f5641b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
        L_0x001f:
            long r4 = r8.f5642c
            long r6 = r9.f5642c
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            boolean r0 = r8.w()
            boolean r2 = r9.w()
            if (r0 != r2) goto L_0x008c
            boolean r0 = r8.w()
            if (r0 == 0) goto L_0x003f
            long r4 = r8.f5643d
            long r6 = r9.f5643d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
        L_0x003f:
            long r4 = r8.f5644e
            long r6 = r9.f5644e
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            int r0 = r8.B
            int r2 = r9.B
            if (r0 != r2) goto L_0x008c
            float r0 = r8.C
            float r2 = r9.C
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            boolean r0 = r8.D
            boolean r2 = r9.D
            if (r0 != r2) goto L_0x008c
            int r0 = r8.F
            int r2 = r9.F
            if (r0 != r2) goto L_0x008c
            int r0 = r8.G
            int r2 = r9.G
            if (r0 != r2) goto L_0x008c
            boolean r0 = r8.I
            boolean r2 = r9.I
            if (r0 != r2) goto L_0x008c
            android.os.WorkSource r0 = r8.J
            android.os.WorkSource r2 = r9.J
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r8.H
            java.lang.String r2 = r9.H
            boolean r0 = u6.o.a(r0, r2)
            if (r0 == 0) goto L_0x008c
            k7.q r0 = r8.K
            k7.q r9 = r9.K
            boolean r9 = u6.o.a(r0, r9)
            if (r9 == 0) goto L_0x008c
            return r3
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5640a), Long.valueOf(this.f5641b), Long.valueOf(this.f5642c), this.J});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder c3 = e.c("Request[");
        boolean z10 = false;
        int i8 = this.f5640a;
        boolean z11 = i8 == 105;
        long j10 = this.f5641b;
        if (z11) {
            c3.append(m.A(i8));
        } else {
            c3.append("@");
            if (w()) {
                y.a(j10, c3);
                c3.append("/");
                y.a(this.f5643d, c3);
            } else {
                y.a(j10, c3);
            }
            c3.append(" ");
            c3.append(m.A(i8));
        }
        boolean z12 = i8 == 105;
        long j11 = this.f5642c;
        if (z12 || j11 != j10) {
            c3.append(", minUpdateInterval=");
            c3.append(x(j11));
        }
        float f10 = this.C;
        if (((double) f10) > 0.0d) {
            c3.append(", minUpdateDistance=");
            c3.append(f10);
        }
        if (i8 == 105) {
            z10 = true;
        }
        long j12 = this.E;
        if (!z10 ? j12 != j10 : j12 != Long.MAX_VALUE) {
            c3.append(", maxUpdateAge=");
            c3.append(x(j12));
        }
        long j13 = this.f5644e;
        if (j13 != Long.MAX_VALUE) {
            c3.append(", duration=");
            y.a(j13, c3);
        }
        int i10 = this.B;
        if (i10 != Integer.MAX_VALUE) {
            c3.append(", maxUpdates=");
            c3.append(i10);
        }
        int i11 = this.G;
        if (i11 != 0) {
            c3.append(", ");
            if (i11 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i11 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else if (i11 == 2) {
                str2 = "THROTTLE_NEVER";
            } else {
                throw new IllegalArgumentException();
            }
            c3.append(str2);
        }
        int i12 = this.F;
        if (i12 != 0) {
            c3.append(", ");
            if (i12 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i12 == 1) {
                str = "GRANULARITY_COARSE";
            } else if (i12 == 2) {
                str = "GRANULARITY_FINE";
            } else {
                throw new IllegalArgumentException();
            }
            c3.append(str);
        }
        if (this.D) {
            c3.append(", waitForAccurateLocation");
        }
        if (this.I) {
            c3.append(", bypass");
        }
        String str3 = this.H;
        if (str3 != null) {
            c3.append(", moduleId=");
            c3.append(str3);
        }
        WorkSource workSource = this.J;
        if (!h.b(workSource)) {
            c3.append(", ");
            c3.append(workSource);
        }
        q qVar = this.K;
        if (qVar != null) {
            c3.append(", impersonation=");
            c3.append(qVar);
        }
        c3.append(']');
        return c3.toString();
    }

    @Pure
    public final boolean w() {
        long j10 = this.f5643d;
        return j10 > 0 && (j10 >> 1) >= this.f5641b;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f5640a);
        m.k(parcel, 2, this.f5641b);
        m.k(parcel, 3, this.f5642c);
        m.j(parcel, 6, this.B);
        parcel.writeInt(262151);
        parcel.writeFloat(this.C);
        m.k(parcel, 8, this.f5643d);
        m.g(parcel, 9, this.D);
        m.k(parcel, 10, this.f5644e);
        m.k(parcel, 11, this.E);
        m.j(parcel, 12, this.F);
        m.j(parcel, 13, this.G);
        m.n(parcel, 14, this.H);
        m.g(parcel, 15, this.I);
        m.m(parcel, 16, this.J, i8);
        m.m(parcel, 17, this.K, i8);
        m.E(parcel, s10);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5645a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5646b;

        /* renamed from: c  reason: collision with root package name */
        public long f5647c;

        /* renamed from: d  reason: collision with root package name */
        public final long f5648d;

        /* renamed from: e  reason: collision with root package name */
        public long f5649e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5650f;

        /* renamed from: g  reason: collision with root package name */
        public float f5651g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5652h;

        /* renamed from: i  reason: collision with root package name */
        public long f5653i;

        /* renamed from: j  reason: collision with root package name */
        public int f5654j;

        /* renamed from: k  reason: collision with root package name */
        public int f5655k;

        /* renamed from: l  reason: collision with root package name */
        public String f5656l;
        public boolean m;

        /* renamed from: n  reason: collision with root package name */
        public WorkSource f5657n;

        /* renamed from: o  reason: collision with root package name */
        public final q f5658o;

        public a(int i8, long j10) {
            u6.q.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            m.z(i8);
            this.f5645a = i8;
            this.f5646b = j10;
            this.f5647c = -1;
            this.f5648d = 0;
            this.f5649e = Long.MAX_VALUE;
            this.f5650f = Integer.MAX_VALUE;
            this.f5651g = 0.0f;
            this.f5652h = true;
            this.f5653i = -1;
            this.f5654j = 0;
            this.f5655k = 0;
            this.f5656l = null;
            this.m = false;
            this.f5657n = null;
            this.f5658o = null;
        }

        public final LocationRequest a() {
            int i8 = this.f5645a;
            long j10 = this.f5646b;
            long j11 = this.f5647c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i8 != 105) {
                j11 = Math.min(j11, j10);
            }
            long j12 = this.f5648d;
            long j13 = this.f5646b;
            long max = Math.max(j12, j13);
            long j14 = this.f5649e;
            int i10 = this.f5650f;
            float f10 = this.f5651g;
            long j15 = j14;
            boolean z10 = this.f5652h;
            long j16 = this.f5653i;
            long j17 = j16 == -1 ? j13 : j16;
            int i11 = this.f5654j;
            int i12 = this.f5655k;
            String str = this.f5656l;
            boolean z11 = this.m;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f5657n);
            return new LocationRequest(i8, j10, j11, max, Long.MAX_VALUE, j15, i10, f10, z10, j17, i11, i12, str, z11, workSource, this.f5658o);
        }

        public final void b(int i8) {
            boolean z10;
            int i10;
            if (i8 == 0 || i8 == 1) {
                i10 = i8;
            } else {
                i10 = 2;
                if (i8 != 2) {
                    i10 = i8;
                    z10 = false;
                    u6.q.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                    this.f5654j = i8;
                }
            }
            z10 = true;
            u6.q.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
            this.f5654j = i8;
        }

        public final void c(long j10) {
            u6.q.b(j10 == -1 || j10 >= 0, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f5647c = j10;
        }

        public final void d(int i8) {
            boolean z10;
            if (!(i8 == 0 || i8 == 1)) {
                if (i8 == 2) {
                    i8 = 2;
                } else {
                    z10 = false;
                    u6.q.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i8));
                    this.f5655k = i8;
                }
            }
            z10 = true;
            u6.q.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i8));
            this.f5655k = i8;
        }

        public a(LocationRequest locationRequest) {
            this.f5645a = locationRequest.f5640a;
            this.f5646b = locationRequest.f5641b;
            this.f5647c = locationRequest.f5642c;
            this.f5648d = locationRequest.f5643d;
            this.f5649e = locationRequest.f5644e;
            this.f5650f = locationRequest.B;
            this.f5651g = locationRequest.C;
            this.f5652h = locationRequest.D;
            this.f5653i = locationRequest.E;
            this.f5654j = locationRequest.F;
            this.f5655k = locationRequest.G;
            this.f5656l = locationRequest.H;
            this.m = locationRequest.I;
            this.f5657n = locationRequest.J;
            this.f5658o = locationRequest.K;
        }
    }

    public LocationRequest(int i8, long j10, long j11, long j12, long j13, long j14, int i10, float f10, boolean z10, long j15, int i11, int i12, String str, boolean z11, WorkSource workSource, q qVar) {
        long j16;
        this.f5640a = i8;
        long j17 = j10;
        this.f5641b = j17;
        this.f5642c = j11;
        this.f5643d = j12;
        if (j13 == Long.MAX_VALUE) {
            j16 = j14;
        } else {
            j16 = Math.min(Math.max(1, j13 - SystemClock.elapsedRealtime()), j14);
        }
        this.f5644e = j16;
        this.B = i10;
        this.C = f10;
        this.D = z10;
        this.E = j15 != -1 ? j15 : j17;
        this.F = i11;
        this.G = i12;
        this.H = str;
        this.I = z11;
        this.J = workSource;
        this.K = qVar;
    }
}
