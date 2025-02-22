package b7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3272a;

    public b(Context context) {
        this.f3272a = context;
    }

    @ResultIgnorabilityUnspecified
    public final ApplicationInfo a(int i8, String str) {
        return this.f3272a.getPackageManager().getApplicationInfo(str, i8);
    }

    @ResultIgnorabilityUnspecified
    public final PackageInfo b(int i8, String str) {
        return this.f3272a.getPackageManager().getPackageInfo(str, i8);
    }

    public final boolean c() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3272a;
        if (callingUid == myUid) {
            return a.v(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
