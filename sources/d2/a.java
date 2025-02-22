package d2;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.quickkonnect.silencio.R;
import d2.i0;
import e2.i;
import e2.j;
import e2.m;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f7185c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f7186a;

    /* renamed from: b  reason: collision with root package name */
    public final C0112a f7187b;

    /* renamed from: d2.a$a  reason: collision with other inner class name */
    public static final class C0112a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f7188a;

        public C0112a(a aVar) {
            this.f7188a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7188a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            j b10 = this.f7188a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f7800a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7188a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            i iVar = new i(accessibilityNodeInfo);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            boolean z10 = true;
            Class<Boolean> cls = Boolean.class;
            Object obj3 = null;
            if (Build.VERSION.SDK_INT >= 28) {
                obj = Boolean.valueOf(i0.m.d(view));
            } else {
                obj = view.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            boolean z11 = bool != null && bool.booleanValue();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z11);
            } else {
                Bundle a10 = i.b.a(accessibilityNodeInfo);
                if (a10 != null) {
                    a10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z11 | (a10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & true) ? 1 : 0);
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                obj2 = Boolean.valueOf(i0.m.c(view));
            } else {
                obj2 = view.getTag(R.id.tag_accessibility_heading);
                if (!cls.isInstance(obj2)) {
                    obj2 = null;
                }
            }
            Boolean bool2 = (Boolean) obj2;
            boolean z12 = bool2 != null && bool2.booleanValue();
            if (i8 >= 28) {
                accessibilityNodeInfo.setHeading(z12);
            } else {
                Bundle a11 = i.b.a(accessibilityNodeInfo);
                if (a11 != null) {
                    a11.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z12 ? 2 : 0) | (a11.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -3));
                }
            }
            CharSequence e10 = i0.e(view);
            if (i8 >= 28) {
                accessibilityNodeInfo.setPaneTitle(e10);
            } else {
                i.b.a(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e10);
            }
            if (i8 < 30) {
                z10 = false;
            }
            if (z10) {
                obj3 = i0.o.a(view);
            } else {
                Object tag = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag)) {
                    obj3 = tag;
                }
            }
            iVar.p((CharSequence) obj3);
            this.f7188a.d(view, iVar);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                iVar.b((i.a) list.get(i10));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7188a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f7188a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f7188a.g(view, i8, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i8) {
            this.f7188a.h(view, i8);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f7188a.i(view, accessibilityEvent);
        }
    }

    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i8, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i8, bundle);
        }
    }

    public a() {
        this(f7185c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7186a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public j b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f7186a, view);
        if (a10 != null) {
            return new j(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f7186a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, i iVar) {
        this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f7186a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7186a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i8, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            i.a aVar = (i.a) list.get(i10);
            if (aVar.a() == i8) {
                m mVar = aVar.f7796d;
                if (mVar != null) {
                    Class<? extends m.a> cls = aVar.f7795c;
                    if (cls != null) {
                        try {
                            ((m.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = mVar.a(view);
                }
            } else {
                i10++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f7186a, view, i8, bundle);
        }
        if (z10 || i8 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z10;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i11)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                int i12 = 0;
                while (true) {
                    if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i12])) {
                        z11 = true;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            z11 = false;
            if (z11) {
                clickableSpan.onClick(view);
                z12 = true;
            }
        }
        return z12;
    }

    public void h(View view, int i8) {
        this.f7186a.sendAccessibilityEvent(view, i8);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f7186a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7186a = accessibilityDelegate;
        this.f7187b = new C0112a(this);
    }
}
