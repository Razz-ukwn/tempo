package com.google.android.gms.common.api;

import ag.m;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.util.Arrays;
import t6.b;
import u6.o;
import v6.a;

public final class Status extends a implements h, ReflectedParcelable {
    public static final Status B = new Status(0, (String) null);
    public static final Status C = new Status(14, (String) null);
    public static final Parcelable.Creator<Status> CREATOR = new m();
    public static final Status D = new Status(8, (String) null);
    public static final Status E = new Status(15, (String) null);
    public static final Status F = new Status(16, (String) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f4175a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4176b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4177c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f4178d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4179e;

    static {
        new Status(-1, (String) null);
        new Status(17, (String) null);
        new Status(18, (String) null);
    }

    public Status() {
        throw null;
    }

    public Status(int i8, int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f4175a = i8;
        this.f4176b = i10;
        this.f4177c = str;
        this.f4178d = pendingIntent;
        this.f4179e = bVar;
    }

    public Status(int i8, String str) {
        this(1, i8, str, (PendingIntent) null, (b) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
        r0 = r4.f4175a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.f4175a
            int r2 = r3.f4175a
            if (r2 != r0) goto L_0x0034
            int r0 = r3.f4176b
            int r2 = r4.f4176b
            if (r0 != r2) goto L_0x0034
            java.lang.String r0 = r3.f4177c
            java.lang.String r2 = r4.f4177c
            boolean r0 = u6.o.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            android.app.PendingIntent r0 = r3.f4178d
            android.app.PendingIntent r2 = r4.f4178d
            boolean r0 = u6.o.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            t6.b r0 = r3.f4179e
            t6.b r4 = r4.f4179e
            boolean r4 = u6.o.a(r0, r4)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            return r4
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4175a), Integer.valueOf(this.f4176b), this.f4177c, this.f4178d, this.f4179e});
    }

    public final Status p() {
        return this;
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        String str = this.f4177c;
        if (str == null) {
            int i8 = this.f4176b;
            switch (i8) {
                case IntegrityErrorCode.API_NOT_AVAILABLE /*-1*/:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = q.a("unknown status code: ", i8);
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f4178d, "resolution");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f4176b);
        m.n(parcel, 2, this.f4177c);
        m.m(parcel, 3, this.f4178d, i8);
        m.m(parcel, 4, this.f4179e, i8);
        m.j(parcel, 1000, this.f4175a);
        m.E(parcel, s10);
    }
}
