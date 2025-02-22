package s1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import t1.a;

public final class c0 implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Intent> f14476a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f14477b;

    public c0(Context context) {
        this.f14477b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f14477b;
        ArrayList<Intent> arrayList = this.f14476a;
        int size = arrayList.size();
        try {
            for (Intent b10 = l.b(context, componentName); b10 != null; b10 = l.b(context, b10.getComponent())) {
                arrayList.add(size, b10);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void b() {
        ArrayList<Intent> arrayList = this.f14476a;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = a.f15323a;
            a.C0282a.a(this.f14477b, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f14476a.iterator();
    }
}
