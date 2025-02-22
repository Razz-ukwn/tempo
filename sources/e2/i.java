package e2;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import e2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f7779a;

    /* renamed from: b  reason: collision with root package name */
    public int f7780b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f7781c = -1;

    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f7782e = new a(1, (String) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f7783f = new a(2, (String) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f7784g = new a(16, (String) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f7785h = new a(64, (String) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f7786i = new a(128, (String) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f7787j = new a(4096, (String) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f7788k = new a(8192, (String) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f7789l = new a(262144, (String) null);
        public static final a m = new a(524288, (String) null);

        /* renamed from: n  reason: collision with root package name */
        public static final a f7790n = new a(1048576, (String) null);

        /* renamed from: o  reason: collision with root package name */
        public static final a f7791o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (m) null, (Class) null);

        /* renamed from: p  reason: collision with root package name */
        public static final a f7792p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (m) null, (Class) null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f7793a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7794b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends m.a> f7795c;

        /* renamed from: d  reason: collision with root package name */
        public final m f7796d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, (String) null);
            new a(8, (String) null);
            new a(32, (String) null);
            Class<m.b> cls = m.b.class;
            new a(256, (Class) cls);
            new a(512, (Class) cls);
            Class<m.c> cls2 = m.c.class;
            new a(1024, (Class) cls2);
            new a(2048, (Class) cls2);
            new a(16384, (String) null);
            new a(32768, (String) null);
            new a(65536, (String) null);
            new a(131072, m.g.class);
            new a(2097152, m.h.class);
            int i8 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (m) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (m) null, m.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (m) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (m) null, (Class) null);
            new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (String) null, (m) null, (Class) null);
            new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (String) null, (m) null, (Class) null);
            new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (String) null, (m) null, (Class) null);
            new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (String) null, (m) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (m) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (m) null, m.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (String) null, (m) null, m.d.class);
            new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (String) null, (m) null, (Class) null);
            new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (String) null, (m) null, (Class) null);
            new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (String) null, (m) null, (Class) null);
            new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (String) null, (m) null, (Class) null);
            new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (String) null, (m) null, (Class) null);
            new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (String) null, (m) null, (Class) null);
            new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (String) null, (m) null, (Class) null);
            if (i8 >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction, 16908376, (String) null, (m) null, (Class) null);
        }

        public a(int i8, String str) {
            this((Object) null, i8, str, (m) null, (Class) null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7793a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7793a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f7793a;
            Object obj3 = this.f7793a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f7793a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String d10 = i.d(this.f7794b);
            if (d10.equals("ACTION_UNKNOWN") && b() != null) {
                d10 = b().toString();
            }
            sb2.append(d10);
            return sb2.toString();
        }

        public a(int i8, Class cls) {
            this((Object) null, i8, (String) null, (m) null, cls);
        }

        public a(Object obj, int i8, String str, m mVar, Class cls) {
            this.f7794b = i8;
            this.f7796d = mVar;
            if (obj == null) {
                this.f7793a = new AccessibilityNodeInfo.AccessibilityAction(i8, str);
            } else {
                this.f7793a = obj;
            }
            this.f7795c = cls;
        }
    }

    public static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7797a;

        public c(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f7797a = collectionInfo;
        }

        public static c a(int i8, int i10, int i11) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i10, false, i11));
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7798a;

        public d(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f7798a = collectionItemInfo;
        }

        public static d a(int i8, int i10, int i11, int i12, boolean z10, boolean z11) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i10, i11, i12, z10, z11));
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7799a;

        public e(AccessibilityNodeInfo.RangeInfo rangeInfo) {
            this.f7799a = rangeInfo;
        }

        public static e a(float f10, float f11, float f12) {
            return new e(AccessibilityNodeInfo.RangeInfo.obtain(1, f10, f11, f12));
        }
    }

    public i(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7779a = accessibilityNodeInfo;
    }

    public static String d(int i8) {
        if (i8 == 1) {
            return "ACTION_FOCUS";
        }
        if (i8 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i8) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i8) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i8) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i8) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void a(int i8) {
        this.f7779a.addAction(i8);
    }

    public final void b(a aVar) {
        this.f7779a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7793a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        ArrayList<Integer> integerArrayList = b.a(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.a(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void e(Rect rect) {
        this.f7779a.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f7779a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f7781c == iVar.f7781c && this.f7780b == iVar.f7780b;
    }

    public final CharSequence f() {
        return this.f7779a.getHintText();
    }

    public final int g() {
        return this.f7779a.getMovementGranularities();
    }

    public final CharSequence h() {
        int i8 = y1.a.f17113a;
        boolean z10 = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        return z10 ? accessibilityNodeInfo.getStateDescription() : b.a(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final CharSequence i() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        if (!z10) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList c3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i8 = 0; i8 < c3.size(); i8++) {
            spannableString.setSpan(new a(((Integer) c12.get(i8)).intValue(), this, b.a(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c3.get(i8)).intValue(), ((Integer) c10.get(i8)).intValue(), ((Integer) c11.get(i8)).intValue());
        }
        return spannableString;
    }

    public final void j(CharSequence charSequence) {
        this.f7779a.setClassName(charSequence);
    }

    public final void k(c cVar) {
        this.f7779a.setCollectionInfo(cVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) cVar.f7797a);
    }

    public final void l(d dVar) {
        this.f7779a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) dVar.f7798a);
    }

    public final void m(CharSequence charSequence) {
        this.f7779a.setContentDescription(charSequence);
    }

    public final void n(e eVar) {
        this.f7779a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) eVar.f7799a);
    }

    public final void o(boolean z10) {
        this.f7779a.setScrollable(z10);
    }

    public final void p(CharSequence charSequence) {
        int i8 = y1.a.f17113a;
        boolean z10 = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        if (z10) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            b.a(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void q(CharSequence charSequence) {
        this.f7779a.setText(charSequence);
    }

    public final void r(AndroidComposeView androidComposeView, int i8) {
        this.f7779a.setTraversalAfter(androidComposeView, i8);
    }

    public final void s(AndroidComposeView androidComposeView, int i8) {
        this.f7779a.setTraversalBefore(androidComposeView, i8);
    }

    public final String toString() {
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        e(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7779a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(i());
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(y1.a.a() ? accessibilityNodeInfo.getUniqueId() : b.a(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add(new a(actionList.get(i8), 0, (String) null, (m) null, (Class) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            String d10 = d(aVar.a());
            if (d10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                d10 = aVar.b().toString();
            }
            sb2.append(d10);
            if (i10 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
