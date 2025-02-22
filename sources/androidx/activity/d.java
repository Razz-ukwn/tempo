package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.b0;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f582b;

    public /* synthetic */ d(Object obj, int i8) {
        this.f581a = i8;
        this.f582b = obj;
    }

    public final Bundle a() {
        int i8 = this.f581a;
        Object obj = this.f582b;
        switch (i8) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.H;
                bVar.getClass();
                HashMap hashMap = bVar.f619c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(bVar.f621e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f624h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f617a);
                return bundle;
            default:
                return b0.a((b0) obj);
        }
    }
}
