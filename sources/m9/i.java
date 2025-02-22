package m9;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import java.util.Arrays;
import u6.o;
import u6.q;
import z6.f;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f11343a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11344b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11345c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11346d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11347e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11348f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11349g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        q.k(!f.b(str), "ApplicationId must be set.");
        this.f11344b = str;
        this.f11343a = str2;
        this.f11345c = str3;
        this.f11346d = str4;
        this.f11347e = str5;
        this.f11348f = str6;
        this.f11349g = str7;
    }

    public static i a(Context context) {
        l lVar = new l(context);
        String c3 = lVar.c("google_app_id");
        if (TextUtils.isEmpty(c3)) {
            return null;
        }
        return new i(c3, lVar.c("google_api_key"), lVar.c("firebase_database_url"), lVar.c("ga_trackingId"), lVar.c("gcm_defaultSenderId"), lVar.c("google_storage_bucket"), lVar.c("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return o.a(this.f11344b, iVar.f11344b) && o.a(this.f11343a, iVar.f11343a) && o.a(this.f11345c, iVar.f11345c) && o.a(this.f11346d, iVar.f11346d) && o.a(this.f11347e, iVar.f11347e) && o.a(this.f11348f, iVar.f11348f) && o.a(this.f11349g, iVar.f11349g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11344b, this.f11343a, this.f11345c, this.f11346d, this.f11347e, this.f11348f, this.f11349g});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f11344b, "applicationId");
        aVar.a(this.f11343a, "apiKey");
        aVar.a(this.f11345c, "databaseUrl");
        aVar.a(this.f11347e, "gcmSenderId");
        aVar.a(this.f11348f, "storageBucket");
        aVar.a(this.f11349g, "projectId");
        return aVar.toString();
    }
}
