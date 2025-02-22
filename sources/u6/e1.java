package u6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

public final class e1 {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f15789d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f15790a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15791b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15792c;

    public e1(String str, String str2, boolean z10) {
        q.f(str);
        this.f15790a = str;
        q.f(str2);
        this.f15791b = str2;
        this.f15792c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f15790a;
        if (str == null) {
            return new Intent().setComponent((ComponentName) null);
        }
        if (this.f15792c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f15789d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f15791b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return o.a(this.f15790a, e1Var.f15790a) && o.a(this.f15791b, e1Var.f15791b) && o.a((Object) null, (Object) null) && this.f15792c == e1Var.f15792c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15790a, this.f15791b, null, 4225, Boolean.valueOf(this.f15792c)});
    }

    public final String toString() {
        String str = this.f15790a;
        if (str != null) {
            return str;
        }
        q.i((Object) null);
        throw null;
    }
}
