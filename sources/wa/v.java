package wa;

import ag.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import t.x2;

public final class v extends v6.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f16650a;

    /* renamed from: b  reason: collision with root package name */
    public a f16651b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16652a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16653b;

        public a(x2 x2Var) {
            this.f16652a = x2Var.l("gcm.n.title");
            x2Var.i("gcm.n.title");
            Object[] h3 = x2Var.h("gcm.n.title");
            if (h3 != null) {
                String[] strArr = new String[h3.length];
                for (int i8 = 0; i8 < h3.length; i8++) {
                    strArr[i8] = String.valueOf(h3[i8]);
                }
            }
            this.f16653b = x2Var.l("gcm.n.body");
            x2Var.i("gcm.n.body");
            Object[] h10 = x2Var.h("gcm.n.body");
            if (h10 != null) {
                String[] strArr2 = new String[h10.length];
                for (int i10 = 0; i10 < h10.length; i10++) {
                    strArr2[i10] = String.valueOf(h10[i10]);
                }
            }
            x2Var.l("gcm.n.icon");
            if (TextUtils.isEmpty(x2Var.l("gcm.n.sound2"))) {
                x2Var.l("gcm.n.sound");
            }
            x2Var.l("gcm.n.tag");
            x2Var.l("gcm.n.color");
            x2Var.l("gcm.n.click_action");
            x2Var.l("gcm.n.android_channel_id");
            x2Var.g();
            x2Var.l("gcm.n.image");
            x2Var.l("gcm.n.ticker");
            x2Var.d("gcm.n.notification_priority");
            x2Var.d("gcm.n.visibility");
            x2Var.d("gcm.n.notification_count");
            x2Var.c("gcm.n.sticky");
            x2Var.c("gcm.n.local_only");
            x2Var.c("gcm.n.default_sound");
            x2Var.c("gcm.n.default_vibrate_timings");
            x2Var.c("gcm.n.default_light_settings");
            x2Var.j();
            x2Var.f();
            x2Var.m();
        }
    }

    public v(Bundle bundle) {
        this.f16650a = bundle;
    }

    public final a w() {
        if (this.f16651b == null) {
            Bundle bundle = this.f16650a;
            if (x2.n(bundle)) {
                this.f16651b = new a(new x2(bundle));
            }
        }
        return this.f16651b;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.h(parcel, 2, this.f16650a);
        m.E(parcel, s10);
    }
}
