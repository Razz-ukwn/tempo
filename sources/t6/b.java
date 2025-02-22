package t6;

import ag.m;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.util.Arrays;
import u6.o;
import v6.a;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    public static final b f15377e = new b(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f15378a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15379b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f15380c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15381d;

    public b() {
        throw null;
    }

    public b(int i8) {
        this(1, i8, (PendingIntent) null, (String) null);
    }

    public b(int i8, int i10, PendingIntent pendingIntent, String str) {
        this.f15378a = i8;
        this.f15379b = i10;
        this.f15380c = pendingIntent;
        this.f15381d = str;
    }

    public static String w(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case IntegrityErrorCode.API_NOT_AVAILABLE:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case ModuleDescriptor.MODULE_VERSION:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return d.a.a("UNKNOWN_ERROR_CODE(", i8, ")");
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (t6.b) r5;
        r1 = r5.f15379b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof t6.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t6.b r5 = (t6.b) r5
            int r1 = r5.f15379b
            int r3 = r4.f15379b
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.f15380c
            android.app.PendingIntent r3 = r5.f15380c
            boolean r1 = u6.o.a(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r4.f15381d
            java.lang.String r5 = r5.f15381d
            boolean r5 = u6.o.a(r1, r5)
            if (r5 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15379b), this.f15380c, this.f15381d});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(w(this.f15379b), "statusCode");
        aVar.a(this.f15380c, "resolution");
        aVar.a(this.f15381d, "message");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15378a);
        m.j(parcel, 2, this.f15379b);
        m.m(parcel, 3, this.f15380c, i8);
        m.n(parcel, 4, this.f15381d);
        m.E(parcel, s10);
    }

    public b(int i8, PendingIntent pendingIntent) {
        this(1, i8, pendingIntent, (String) null);
    }
}
