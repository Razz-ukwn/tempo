package e2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7800a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final j f7801a;

        public a(j jVar) {
            this.f7801a = jVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            i a10 = this.f7801a.a(i8);
            if (a10 == null) {
                return null;
            }
            return a10.f7779a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i8) {
            this.f7801a.getClass();
            return null;
        }

        public final boolean performAction(int i8, int i10, Bundle bundle) {
            return this.f7801a.c(i8, i10, bundle);
        }
    }

    public static class b extends a {
        public b(j jVar) {
            super(jVar);
        }

        public final AccessibilityNodeInfo findFocus(int i8) {
            i b10 = this.f7801a.b(i8);
            if (b10 == null) {
                return null;
            }
            return b10.f7779a;
        }
    }

    public static class c extends b {
        public c(j jVar) {
            super(jVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f7801a.getClass();
        }
    }

    public j() {
        this.f7800a = new c(this);
    }

    public i a(int i8) {
        return null;
    }

    public i b(int i8) {
        return null;
    }

    public boolean c(int i8, int i10, Bundle bundle) {
        return false;
    }

    public j(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f7800a = accessibilityNodeProvider;
    }
}
