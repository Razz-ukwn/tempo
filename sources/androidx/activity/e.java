package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f583a;

    public /* synthetic */ e(ComponentActivity componentActivity) {
        this.f583a = componentActivity;
    }

    public final void a() {
        ComponentActivity componentActivity = this.f583a;
        Bundle a10 = componentActivity.f551e.f10968b.a("android:support:activity-result");
        if (a10 != null) {
            ComponentActivity.b bVar = componentActivity.H;
            bVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                bVar.f621e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                bVar.f617a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = bVar.f624h;
                bundle2.putAll(bundle);
                for (int i8 = 0; i8 < stringArrayList.size(); i8++) {
                    String str = stringArrayList.get(i8);
                    HashMap hashMap = bVar.f619c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = bVar.f618b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i8).intValue();
                    String str2 = stringArrayList.get(i8);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}
