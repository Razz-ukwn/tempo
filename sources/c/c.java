package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import c.a;
import d2.f1;
import ff.g;
import gf.l;
import gf.m;
import gf.t;
import gf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import sf.j;

public final class c extends a<String[], Map<String, Boolean>> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0054a b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0054a(t.f8979a);
        }
        int length = strArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (!(t1.a.a(componentActivity, strArr[i8]) == 0)) {
                z10 = false;
                break;
            }
            i8++;
        }
        if (!z10) {
            return null;
        }
        int B = f1.B(strArr.length);
        if (B < 16) {
            B = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(B);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0054a(linkedHashMap);
    }

    public final Object c(Intent intent, int i8) {
        t tVar = t.f8979a;
        if (i8 != -1 || intent == null) {
            return tVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return tVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i10] == 0));
        }
        ArrayList b02 = l.b0(stringArrayExtra);
        Iterator it = b02.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(m.n0(b02), m.n0(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new g(it.next(), it2.next()));
        }
        return y.V(arrayList2);
    }
}
