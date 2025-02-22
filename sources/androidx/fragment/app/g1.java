package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final /* synthetic */ class g1 {
    public static final void a(int i8, View view) {
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 == 0) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            } else if (i10 == 1) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
            } else if (i10 == 2) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
            } else if (i10 == 3) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        } else {
            throw null;
        }
    }

    public static int b(int i8) {
        if (i8 == 0) {
            return 2;
        }
        if (i8 == 4) {
            return 4;
        }
        if (i8 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(q.a("Unknown visibility ", i8));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static Map d(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void e(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static /* synthetic */ String f(int i8) {
        return i8 == 1 ? "REMOVED" : i8 == 2 ? "VISIBLE" : i8 == 3 ? "GONE" : i8 == 4 ? "INVISIBLE" : "null";
    }
}
