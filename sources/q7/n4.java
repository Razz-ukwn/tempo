package q7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import u6.q;

public final class n4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13220a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13221b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13222c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13223d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f13224e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13225f;

    /* renamed from: g  reason: collision with root package name */
    public final a1 f13226g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13227h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f13228i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13229j;

    public n4(Context context, a1 a1Var, Long l10) {
        q.i(context);
        Context applicationContext = context.getApplicationContext();
        q.i(applicationContext);
        this.f13220a = applicationContext;
        this.f13228i = l10;
        if (a1Var != null) {
            this.f13226g = a1Var;
            this.f13221b = a1Var.B;
            this.f13222c = a1Var.f5145e;
            this.f13223d = a1Var.f5144d;
            this.f13227h = a1Var.f5143c;
            this.f13225f = a1Var.f5142b;
            this.f13229j = a1Var.D;
            Bundle bundle = a1Var.C;
            if (bundle != null) {
                this.f13224e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
