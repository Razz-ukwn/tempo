package t;

import com.google.android.gms.internal.p000firebaseauthapi.p0;
import gf.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sf.j;
import z6.f;

public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final List f15222a;

    public r1(int i8, List list) {
        if (i8 != 2) {
            j.f(list, "list");
            this.f15222a = list;
        } else if (!list.isEmpty()) {
            this.f15222a = Collections.unmodifiableList(list);
        } else {
            this.f15222a = Collections.emptyList();
        }
    }

    public static r1 d(JSONArray jSONArray) {
        p0 p0Var;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new r1(2, new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            if (jSONObject == null) {
                p0Var = new p0();
            } else {
                p0Var = new p0(f.a(jSONObject.optString("federatedId", (String) null)), f.a(jSONObject.optString("displayName", (String) null)), f.a(jSONObject.optString("photoUrl", (String) null)), f.a(jSONObject.optString("providerId", (String) null)), f.a(jSONObject.optString("phoneNumber", (String) null)), f.a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(p0Var);
        }
        return new r1(2, arrayList);
    }

    public final void a(int i8) {
        List list = this.f15222a;
        if (!(!list.isEmpty()) || !(((Number) list.get(0)).intValue() == i8 || ((Number) list.get(list.size() - 1)).intValue() == i8)) {
            int size = list.size();
            list.add(Integer.valueOf(i8));
            while (size > 0) {
                int i10 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) list.get(i10)).intValue();
                if (i8 <= intValue) {
                    break;
                }
                list.set(size, Integer.valueOf(intValue));
                size = i10;
            }
            list.set(size, Integer.valueOf(i8));
        }
    }

    public final void b(String str) {
        this.f15222a.add(str);
    }

    public final int c() {
        int intValue;
        List list = this.f15222a;
        if (list.size() > 0) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, q.B0(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i8 = 0;
                while (i8 < size2) {
                    int intValue3 = ((Number) list.get(i8)).intValue();
                    int i10 = (i8 + 1) * 2;
                    int i11 = i10 - 1;
                    int intValue4 = ((Number) list.get(i11)).intValue();
                    if (i10 < size && (intValue = ((Number) list.get(i10)).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        list.set(i8, Integer.valueOf(intValue));
                        list.set(i10, Integer.valueOf(intValue3));
                        i8 = i10;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        list.set(i8, Integer.valueOf(intValue4));
                        list.set(i11, Integer.valueOf(intValue3));
                        i8 = i11;
                    }
                }
            }
            return intValue2;
        }
        e0.c("Set is empty".toString());
        throw null;
    }

    public r1(int i8) {
        if (i8 != 2) {
            this.f15222a = new ArrayList();
        } else {
            this.f15222a = new ArrayList();
        }
    }

    public /* synthetic */ r1() {
        this.f15222a = new ArrayList(29);
    }
}
