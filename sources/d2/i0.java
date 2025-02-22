package d2;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.quickkonnect.silencio.R;
import d2.a;
import d2.f;
import d2.j1;
import e2.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, d1> f7217a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f7218b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7219c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7220d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final e0 f7221e = new e0();

    /* renamed from: f  reason: collision with root package name */
    public static final a f7222f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f7223a = new WeakHashMap<>();

        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f7223a;
                for (Map.Entry next : weakHashMap.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        i0.h(view, z10 ? 16 : 32);
                        weakHashMap.put(view, Boolean.valueOf(z10));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f7224a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f7225b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7226c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7227d;

        public b(int i8, Class<T> cls, int i10, int i11) {
            this.f7224a = i8;
            this.f7225b = cls;
            this.f7227d = i10;
            this.f7226c = i11;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t2);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f7226c) {
                return b(view);
            }
            T tag = view.getTag(this.f7224a);
            if (this.f7225b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t2) {
            if (Build.VERSION.SDK_INT >= this.f7226c) {
                c(view, t2);
            } else if (f(d(view), t2)) {
                View.AccessibilityDelegate d10 = i0.d(view);
                a aVar = d10 == null ? null : d10 instanceof a.C0112a ? ((a.C0112a) d10).f7188a : new a(d10);
                if (aVar == null) {
                    aVar = new a();
                }
                i0.n(view, aVar);
                view.setTag(this.f7224a, t2);
                i0.h(view, this.f7227d);
            }
        }

        public abstract boolean f(T t2, T t10);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i8, Bundle bundle) {
            return view.performAccessibilityAction(i8, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i8, int i10, int i11, int i12) {
            view.postInvalidateOnAnimation(i8, i10, i11, i12);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i8) {
            view.setImportantForAccessibility(i8);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i8) {
            view.setLabelFor(i8);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i8) {
            view.setLayoutDirection(i8);
        }

        public static void k(View view, int i8, int i10, int i11, int i12) {
            view.setPaddingRelative(i8, i10, i11, i12);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i8);
        }

        public static void f(View view, int i8) {
            view.setAccessibilityLiveRegion(i8);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i8) {
            accessibilityEvent.setContentChangeTypes(i8);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public j1 f7228a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f7229b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ z f7230c;

            public a(View view, z zVar) {
                this.f7229b = view;
                this.f7230c = zVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j1 h3 = j1.h(windowInsets, view);
                int i8 = Build.VERSION.SDK_INT;
                z zVar = this.f7230c;
                if (i8 < 30) {
                    i.a(windowInsets, this.f7229b);
                    if (h3.equals(this.f7228a)) {
                        return zVar.a(view, h3).g();
                    }
                }
                this.f7228a = h3;
                j1 a10 = zVar.a(view, h3);
                if (i8 >= 30) {
                    return a10.g();
                }
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                h.c(view);
                return a10.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static j1 b(View view, j1 j1Var, Rect rect) {
            WindowInsets g10 = j1Var.g();
            if (g10 != null) {
                return j1.h(view.computeSystemWindowInsets(g10, rect), view);
            }
            rect.setEmpty();
            return j1Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i8, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i8, i10, iArr, iArr2);
        }

        public static boolean f(View view, int i8, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i8, i10, i11, i12, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static j1 j(View view) {
            if (j1.a.f7241d && view.isAttachedToWindow()) {
                try {
                    Object obj = j1.a.f7238a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) j1.a.f7239b.get(obj);
                        Rect rect2 = (Rect) j1.a.f7240c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i8 = Build.VERSION.SDK_INT;
                            j1.e dVar = i8 >= 30 ? new j1.d() : i8 >= 29 ? new j1.c() : new j1.b();
                            dVar.c(v1.e.a(rect.left, rect.top, rect.right, rect.bottom));
                            dVar.d(v1.e.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            j1 b10 = dVar.b();
                            b10.f7237a.q(b10);
                            b10.f7237a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, z zVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, zVar);
            }
            if (zVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, zVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i8) {
            return view.startNestedScroll(i8);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static j1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j1 h3 = j1.h(rootWindowInsets, (View) null);
            j1.k kVar = h3.f7237a;
            kVar.q(h3);
            kVar.d(view.getRootView());
            return h3;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i8) {
            view.setScrollIndicators(i8);
        }

        public static void d(View view, int i8, int i10) {
            view.setScrollIndicators(i8, i10);
        }
    }

    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i8) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i8);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class l {
        public static void a(View view, Collection<View> collection, int i8) {
            view.addKeyboardNavigationClusters(collection, i8);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i8) {
            return view.keyboardNavigationClusterSearch(view2, i8);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i8) {
            view.setImportantForAutofill(i8);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i8) {
            view.setNextClusterForwardId(i8);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class m {
        public static void a(View view, r rVar) {
            o.f fVar = (o.f) view.getTag(R.id.tag_unhandled_key_listeners);
            if (fVar == null) {
                fVar = new o.f();
                view.setTag(R.id.tag_unhandled_key_listeners, fVar);
            }
            Objects.requireNonNull(rVar);
            p0 p0Var = new p0(rVar);
            fVar.put(rVar, p0Var);
            view.addOnUnhandledKeyEventListener(p0Var);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            o.f fVar = (o.f) view.getTag(R.id.tag_unhandled_key_listeners);
            if (fVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) fVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i8) {
            return view.requireViewById(i8);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i10);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static f b(View view, f fVar) {
            ContentInfo c3 = fVar.f7199a.c();
            Objects.requireNonNull(c3);
            ContentInfo a10 = view.performReceiveContent(c3);
            if (a10 == null) {
                return null;
            }
            return a10 == c3 ? fVar : new f(new f.d(a10));
        }

        public static void c(View view, String[] strArr, a0 a0Var) {
            if (a0Var == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(a0Var));
            }
        }
    }

    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f7231a;

        public q(a0 a0Var) {
            this.f7231a = a0Var;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            f fVar = new f(new f.d(contentInfo));
            f a10 = this.f7231a.a(view, fVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == fVar) {
                return contentInfo;
            }
            ContentInfo c3 = a10.f7199a.c();
            Objects.requireNonNull(c3);
            return c3;
        }
    }

    public interface r {
        boolean a();
    }

    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f7232d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f7233a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f7234b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f7235c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f7233a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static d1 a(View view) {
        if (f7217a == null) {
            f7217a = new WeakHashMap<>();
        }
        d1 d1Var = f7217a.get(view);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(view);
        f7217a.put(view, d1Var2);
        return d1Var2;
    }

    public static j1 b(View view, j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            WindowInsets a10 = h.a(view, g10);
            if (!a10.equals(g10)) {
                return j1.h(a10, view);
            }
        }
        return j1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f7232d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f7233a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f7232d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f7233a == null) {
                        sVar.f7233a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f7232d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f7233a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f7233a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f7234b == null) {
                    sVar.f7234b = new SparseArray<>();
                }
                sVar.f7234b.put(keyCode, new WeakReference(a10));
            }
        }
        return a10 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f7219c) {
            return null;
        }
        if (f7218b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7218b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7219c = true;
                return null;
            }
        }
        try {
            Object obj = f7218b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7219c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = m.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i10 = 32;
            if (g.a(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i10 = 2048;
                }
                obtain.setEventType(i10);
                g.g(obtain, i8);
                if (z10) {
                    obtain.getText().add(e(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i8 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i8);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i8);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                }
            }
        }
    }

    public static j1 i(View view, j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            WindowInsets b10 = h.b(view, g10);
            if (!b10.equals(g10)) {
                return j1.h(b10, view);
            }
        }
        return j1Var;
    }

    public static f j(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, fVar);
        }
        a0 a0Var = (a0) view.getTag(R.id.tag_on_receive_content_listener);
        b0 b0Var = f7221e;
        if (a0Var != null) {
            f a10 = a0Var.a(view, fVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof b0) {
                b0Var = (b0) view;
            }
            return b0Var.a(a10);
        }
        if (view instanceof b0) {
            b0Var = (b0) view;
        }
        return b0Var.a(fVar);
    }

    public static void k(View view, int i8) {
        ArrayList f10 = f(view);
        for (int i10 = 0; i10 < f10.size(); i10++) {
            if (((i.a) f10.get(i10)).a() == i8) {
                f10.remove(i10);
                return;
            }
        }
    }

    public static void l(View view, i.a aVar, e2.m mVar) {
        if (mVar == null) {
            k(view, aVar.a());
            h(view, 0);
            return;
        }
        i.a aVar2 = new i.a((Object) null, aVar.f7794b, (String) null, mVar, aVar.f7795c);
        View.AccessibilityDelegate d10 = d(view);
        a aVar3 = d10 == null ? null : d10 instanceof a.C0112a ? ((a.C0112a) d10).f7188a : new a(d10);
        if (aVar3 == null) {
            aVar3 = new a();
        }
        n(view, aVar3);
        k(view, aVar2.a());
        f(view).add(aVar2);
        h(view, 0);
    }

    public static void m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i8, 0);
        }
    }

    public static void n(View view, a aVar) {
        if (aVar == null && (d(view) instanceof a.C0112a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f7187b);
    }

    public static void o(View view, CharSequence charSequence) {
        new g0().e(view, charSequence);
        a aVar = f7222f;
        if (charSequence != null) {
            aVar.f7223a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f7223a.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }
}
