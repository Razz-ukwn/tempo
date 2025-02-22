package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.quickkonnect.silencio.R;
import e2.i;
import ff.m;
import gf.q;
import gf.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import rf.l;
import s0.a0;
import s0.p1;
import s0.q1;
import v0.k;
import v0.p;
import v0.r;
import v0.w;

public final class s extends d2.a {
    public static final int[] G = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public final LinkedHashMap A;
    public f B;
    public boolean C;
    public final androidx.activity.j D;
    public final ArrayList E;
    public final h F;

    /* renamed from: d  reason: collision with root package name */
    public final AndroidComposeView f1416d;

    /* renamed from: e  reason: collision with root package name */
    public int f1417e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f1418f;

    /* renamed from: g  reason: collision with root package name */
    public final q f1419g;

    /* renamed from: h  reason: collision with root package name */
    public final r f1420h;

    /* renamed from: i  reason: collision with root package name */
    public List<AccessibilityServiceInfo> f1421i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f1422j;

    /* renamed from: k  reason: collision with root package name */
    public final e2.j f1423k;

    /* renamed from: l  reason: collision with root package name */
    public int f1424l;
    public final o.g<o.g<CharSequence>> m;

    /* renamed from: n  reason: collision with root package name */
    public final o.g<Map<CharSequence, Integer>> f1425n;

    /* renamed from: o  reason: collision with root package name */
    public int f1426o;

    /* renamed from: p  reason: collision with root package name */
    public Integer f1427p;

    /* renamed from: q  reason: collision with root package name */
    public final o.b<a0> f1428q;

    /* renamed from: r  reason: collision with root package name */
    public final cg.a f1429r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1430s;

    /* renamed from: t  reason: collision with root package name */
    public e f1431t;

    /* renamed from: u  reason: collision with root package name */
    public Map<Integer, u2> f1432u;

    /* renamed from: v  reason: collision with root package name */
    public final o.b<Integer> f1433v;

    /* renamed from: w  reason: collision with root package name */
    public final HashMap<Integer, Integer> f1434w;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap<Integer, Integer> f1435x;

    /* renamed from: y  reason: collision with root package name */
    public final String f1436y;

    /* renamed from: z  reason: collision with root package name */
    public final String f1437z;

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f1438a;

        public a(s sVar) {
            this.f1438a = sVar;
        }

        public final void onViewAttachedToWindow(View view) {
            sf.j.f(view, "view");
            s sVar = this.f1438a;
            sVar.f1418f.addAccessibilityStateChangeListener(sVar.f1419g);
            sVar.f1418f.addTouchExplorationStateChangeListener(sVar.f1420h);
        }

        public final void onViewDetachedFromWindow(View view) {
            sf.j.f(view, "view");
            s sVar = this.f1438a;
            sVar.f1422j.removeCallbacks(sVar.D);
            q qVar = sVar.f1419g;
            AccessibilityManager accessibilityManager = sVar.f1418f;
            accessibilityManager.removeAccessibilityStateChangeListener(qVar);
            accessibilityManager.removeTouchExplorationStateChangeListener(sVar.f1420h);
        }
    }

    public static final class b {
        public static final void a(e2.i iVar, p pVar) {
            sf.j.f(iVar, "info");
            sf.j.f(pVar, "semanticsNode");
            if (i0.a(pVar)) {
                v0.a aVar = (v0.a) k.a(pVar.f16074f, v0.i.f16047e);
                if (aVar != null) {
                    iVar.b(new i.a(16908349, aVar.f16036a));
                }
            }
        }
    }

    public static final class c {
        public static final void a(e2.i iVar, p pVar) {
            sf.j.f(iVar, "info");
            sf.j.f(pVar, "semanticsNode");
            if (i0.a(pVar)) {
                w wVar = v0.i.f16057p;
                v0.j jVar = pVar.f16074f;
                v0.a aVar = (v0.a) k.a(jVar, wVar);
                if (aVar != null) {
                    iVar.b(new i.a(16908358, aVar.f16036a));
                }
                v0.a aVar2 = (v0.a) k.a(jVar, v0.i.f16059r);
                if (aVar2 != null) {
                    iVar.b(new i.a(16908359, aVar2.f16036a));
                }
                v0.a aVar3 = (v0.a) k.a(jVar, v0.i.f16058q);
                if (aVar3 != null) {
                    iVar.b(new i.a(16908360, aVar3.f16036a));
                }
                v0.a aVar4 = (v0.a) k.a(jVar, v0.i.f16060s);
                if (aVar4 != null) {
                    iVar.b(new i.a(16908361, aVar4.f16036a));
                }
            }
        }
    }

    public final class d extends AccessibilityNodeProvider {
        public d() {
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            sf.j.f(accessibilityNodeInfo, "info");
            sf.j.f(str, "extraDataKey");
            s.this.j(i8, accessibilityNodeInfo, str, bundle);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r4 = (r4 = r4.f1212a).b();
         */
        /* JADX WARNING: Removed duplicated region for block: B:413:0x08ef  */
        /* JADX WARNING: Removed duplicated region for block: B:414:0x08f1  */
        /* JADX WARNING: Removed duplicated region for block: B:423:0x0904  */
        /* JADX WARNING: Removed duplicated region for block: B:424:0x0908  */
        /* JADX WARNING: Removed duplicated region for block: B:429:0x0927  */
        /* JADX WARNING: Removed duplicated region for block: B:434:0x094d  */
        /* JADX WARNING: Removed duplicated region for block: B:437:0x095d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                androidx.compose.ui.platform.s r2 = androidx.compose.ui.platform.s.this
                androidx.compose.ui.platform.AndroidComposeView r3 = r2.f1416d
                androidx.compose.ui.platform.AndroidComposeView$b r4 = r3.getViewTreeOwners()
                if (r4 == 0) goto L_0x001d
                androidx.lifecycle.p r4 = r4.f1212a
                if (r4 == 0) goto L_0x001d
                androidx.lifecycle.j r4 = r4.b()
                if (r4 == 0) goto L_0x001d
                androidx.lifecycle.j$b r4 = r4.b()
                goto L_0x001e
            L_0x001d:
                r4 = 0
            L_0x001e:
                androidx.lifecycle.j$b r5 = androidx.lifecycle.j.b.f2277a
                if (r4 != r5) goto L_0x0023
                goto L_0x003c
            L_0x0023:
                android.view.accessibility.AccessibilityNodeInfo r4 = android.view.accessibility.AccessibilityNodeInfo.obtain()
                e2.i r5 = new e2.i
                r5.<init>(r4)
                java.util.Map r6 = r2.q()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r23)
                java.lang.Object r6 = r6.get(r7)
                androidx.compose.ui.platform.u2 r6 = (androidx.compose.ui.platform.u2) r6
                if (r6 != 0) goto L_0x003f
            L_0x003c:
                r4 = 0
                goto L_0x097d
            L_0x003f:
                r7 = -1
                v0.p r8 = r6.f1476a
                if (r1 != r7) goto L_0x0058
                java.util.WeakHashMap<android.view.View, d2.d1> r9 = d2.i0.f7217a
                android.view.ViewParent r9 = d2.i0.d.f(r3)
                boolean r10 = r9 instanceof android.view.View
                if (r10 == 0) goto L_0x0051
                android.view.View r9 = (android.view.View) r9
                goto L_0x0052
            L_0x0051:
                r9 = 0
            L_0x0052:
                r5.f7780b = r7
                r4.setParent(r9)
                goto L_0x007a
            L_0x0058:
                v0.p r9 = r8.h()
                if (r9 == 0) goto L_0x097e
                v0.p r9 = r8.h()
                sf.j.c(r9)
                v0.q r10 = r3.getSemanticsOwner()
                v0.p r10 = r10.a()
                int r10 = r10.f16075g
                int r9 = r9.f16075g
                if (r9 != r10) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r7 = r9
            L_0x0075:
                r5.f7780b = r7
                r4.setParent(r3, r7)
            L_0x007a:
                r5.f7781c = r1
                r4.setSource(r3, r1)
                android.graphics.Rect r6 = r6.f1477b
                int r7 = r6.left
                float r7 = (float) r7
                int r9 = r6.top
                float r9 = (float) r9
                long r9 = d2.f1.f(r7, r9)
                long r9 = r3.j(r9)
                int r7 = r6.right
                float r7 = (float) r7
                int r6 = r6.bottom
                float r6 = (float) r6
                long r6 = d2.f1.f(r7, r6)
                long r6 = r3.j(r6)
                android.graphics.Rect r11 = new android.graphics.Rect
                float r12 = h0.c.b(r9)
                double r12 = (double) r12
                double r12 = java.lang.Math.floor(r12)
                float r12 = (float) r12
                int r12 = (int) r12
                float r9 = h0.c.c(r9)
                double r9 = (double) r9
                double r9 = java.lang.Math.floor(r9)
                float r9 = (float) r9
                int r9 = (int) r9
                float r10 = h0.c.b(r6)
                double r13 = (double) r10
                double r13 = java.lang.Math.ceil(r13)
                float r10 = (float) r13
                int r10 = (int) r10
                float r6 = h0.c.c(r6)
                double r6 = (double) r6
                double r6 = java.lang.Math.ceil(r6)
                float r6 = (float) r6
                int r6 = (int) r6
                r11.<init>(r12, r9, r10, r6)
                r4.setBoundsInScreen(r11)
                java.lang.String r6 = "semanticsNode"
                sf.j.f(r8, r6)
                boolean r6 = r8.f16072d
                r7 = 1
                if (r6 != 0) goto L_0x00f1
                java.util.List r6 = r8.i()
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x00f1
                s0.a0 r6 = r8.f16071c
                androidx.compose.ui.platform.t r9 = androidx.compose.ui.platform.t.f1462a
                s0.a0 r6 = androidx.compose.ui.platform.i0.e(r6, r9)
                if (r6 != 0) goto L_0x00f1
                r6 = r7
                goto L_0x00f2
            L_0x00f1:
                r6 = 0
            L_0x00f2:
                java.lang.String r9 = "android.view.View"
                r5.j(r9)
                v0.w<v0.g> r9 = v0.r.f16093p
                v0.j r10 = r8.f16074f
                java.lang.Object r9 = v0.k.a(r10, r9)
                v0.g r9 = (v0.g) r9
                r11 = 4
                r12 = 2
                if (r9 == 0) goto L_0x019c
                boolean r13 = r8.f16072d
                if (r13 != 0) goto L_0x0113
                java.util.List r13 = r8.i()
                boolean r13 = r13.isEmpty()
                if (r13 == 0) goto L_0x019a
            L_0x0113:
                int r13 = r9.f16042a
                if (r13 != r11) goto L_0x0119
                r11 = r7
                goto L_0x011a
            L_0x0119:
                r11 = 0
            L_0x011a:
                java.lang.String r14 = "AccessibilityNodeInfo.roleDescription"
                if (r11 == 0) goto L_0x0136
                android.content.Context r11 = r3.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r12 = 2131952104(0x7f1301e8, float:1.9540641E38)
                java.lang.String r11 = r11.getString(r12)
                android.os.Bundle r12 = e2.i.b.a(r4)
                r12.putCharSequence(r14, r11)
                goto L_0x019a
            L_0x0136:
                if (r13 != r12) goto L_0x013a
                r11 = r7
                goto L_0x013b
            L_0x013a:
                r11 = 0
            L_0x013b:
                if (r11 == 0) goto L_0x0154
                android.content.Context r11 = r3.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r12 = 2131952102(0x7f1301e6, float:1.9540637E38)
                java.lang.String r11 = r11.getString(r12)
                android.os.Bundle r12 = e2.i.b.a(r4)
                r12.putCharSequence(r14, r11)
                goto L_0x019a
            L_0x0154:
                if (r13 != 0) goto L_0x0158
                r11 = r7
                goto L_0x0159
            L_0x0158:
                r11 = 0
            L_0x0159:
                r12 = 5
                if (r11 == 0) goto L_0x015f
                java.lang.String r11 = "android.widget.Button"
                goto L_0x018a
            L_0x015f:
                if (r13 != r7) goto L_0x0163
                r11 = r7
                goto L_0x0164
            L_0x0163:
                r11 = 0
            L_0x0164:
                if (r11 == 0) goto L_0x0169
                java.lang.String r11 = "android.widget.CheckBox"
                goto L_0x018a
            L_0x0169:
                r11 = 3
                if (r13 != r11) goto L_0x016e
                r11 = r7
                goto L_0x016f
            L_0x016e:
                r11 = 0
            L_0x016f:
                if (r11 == 0) goto L_0x0174
                java.lang.String r11 = "android.widget.RadioButton"
                goto L_0x018a
            L_0x0174:
                if (r13 != r12) goto L_0x0178
                r11 = r7
                goto L_0x0179
            L_0x0178:
                r11 = 0
            L_0x0179:
                if (r11 == 0) goto L_0x017e
                java.lang.String r11 = "android.widget.ImageView"
                goto L_0x018a
            L_0x017e:
                r11 = 6
                if (r13 != r11) goto L_0x0183
                r11 = r7
                goto L_0x0184
            L_0x0183:
                r11 = 0
            L_0x0184:
                if (r11 == 0) goto L_0x0189
                java.lang.String r11 = "android.widget.Spinner"
                goto L_0x018a
            L_0x0189:
                r11 = 0
            L_0x018a:
                if (r13 != r12) goto L_0x018e
                r12 = r7
                goto L_0x018f
            L_0x018e:
                r12 = 0
            L_0x018f:
                if (r12 == 0) goto L_0x0197
                if (r6 != 0) goto L_0x0197
                boolean r12 = r10.f16062b
                if (r12 == 0) goto L_0x019a
            L_0x0197:
                r5.j(r11)
            L_0x019a:
                ff.m r11 = ff.m.f8717a
            L_0x019c:
                boolean r11 = androidx.compose.ui.platform.i0.g(r8)
                if (r11 == 0) goto L_0x01a7
                java.lang.String r11 = "android.widget.EditText"
                r5.j(r11)
            L_0x01a7:
                v0.j r11 = r8.g()
                v0.w<java.util.List<x0.a>> r12 = v0.r.f16095r
                boolean r11 = r11.b(r12)
                if (r11 == 0) goto L_0x01b8
                java.lang.String r11 = "android.widget.TextView"
                r5.j(r11)
            L_0x01b8:
                android.content.Context r11 = r3.getContext()
                java.lang.String r11 = r11.getPackageName()
                r4.setPackageName(r11)
                r4.setImportantForAccessibility(r7)
                java.util.List r7 = r8.i()
                int r11 = r7.size()
                r12 = 0
            L_0x01cf:
                android.view.accessibility.AccessibilityNodeInfo r13 = r5.f7779a
                if (r12 >= r11) goto L_0x0209
                java.lang.Object r14 = r7.get(r12)
                v0.p r14 = (v0.p) r14
                java.util.Map r15 = r2.q()
                int r0 = r14.f16075g
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r0 = r15.containsKey(r0)
                if (r0 == 0) goto L_0x0204
                androidx.compose.ui.platform.a1 r0 = r3.getAndroidViewsHandler$ui_release()
                java.util.HashMap r0 = r0.getLayoutNodeToHolder()
                s0.a0 r15 = r14.f16071c
                java.lang.Object r0 = r0.get(r15)
                g1.a r0 = (g1.a) r0
                if (r0 == 0) goto L_0x01ff
                r13.addChild(r0)
                goto L_0x0204
            L_0x01ff:
                int r0 = r14.f16075g
                r13.addChild(r3, r0)
            L_0x0204:
                int r12 = r12 + 1
                r0 = r22
                goto L_0x01cf
            L_0x0209:
                int r0 = r2.f1424l
                if (r0 != r1) goto L_0x0217
                r0 = 1
                r13.setAccessibilityFocused(r0)
                e2.i$a r0 = e2.i.a.f7786i
                r5.b(r0)
                goto L_0x0220
            L_0x0217:
                r0 = 0
                r13.setAccessibilityFocused(r0)
                e2.i$a r0 = e2.i.a.f7785h
                r5.b(r0)
            L_0x0220:
                z0.f$a r0 = r3.getFontFamilyResolver()
                x0.a r7 = androidx.compose.ui.platform.s.s(r10)
                if (r7 == 0) goto L_0x0233
                f1.c r11 = r3.getDensity()
                android.text.SpannableString r7 = c1.a.a(r7, r11, r0)
                goto L_0x0234
            L_0x0233:
                r7 = 0
            L_0x0234:
                java.lang.CharSequence r7 = androidx.compose.ui.platform.s.H(r7)
                android.text.SpannableString r7 = (android.text.SpannableString) r7
                v0.w<java.util.List<x0.a>> r11 = v0.r.f16095r
                java.lang.Object r11 = v0.k.a(r10, r11)
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L_0x0255
                java.lang.Object r11 = gf.q.v0(r11)
                x0.a r11 = (x0.a) r11
                if (r11 == 0) goto L_0x0255
                f1.c r12 = r3.getDensity()
                android.text.SpannableString r0 = c1.a.a(r11, r12, r0)
                goto L_0x0256
            L_0x0255:
                r0 = 0
            L_0x0256:
                java.lang.CharSequence r0 = androidx.compose.ui.platform.s.H(r0)
                android.text.SpannableString r0 = (android.text.SpannableString) r0
                if (r7 == 0) goto L_0x025f
                goto L_0x0260
            L_0x025f:
                r7 = r0
            L_0x0260:
                r5.q(r7)
                v0.w<java.lang.String> r0 = v0.r.f16101x
                boolean r7 = r10.b(r0)
                if (r7 == 0) goto L_0x0278
                r7 = 1
                r4.setContentInvalid(r7)
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r13.setError(r0)
            L_0x0278:
                v0.w<java.lang.String> r0 = v0.r.f16080b
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r5.p(r0)
                v0.w<w0.a> r0 = v0.r.f16099v
                java.lang.Object r0 = v0.k.a(r10, r0)
                w0.a r0 = (w0.a) r0
                if (r0 == 0) goto L_0x030b
                r7 = 1
                r13.setCheckable(r7)
                int r0 = r0.ordinal()
                if (r0 == 0) goto L_0x02e1
                if (r0 == r7) goto L_0x02b7
                r7 = 2
                if (r0 == r7) goto L_0x029e
                goto L_0x0309
            L_0x029e:
                java.lang.CharSequence r0 = r5.h()
                if (r0 != 0) goto L_0x0309
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r7 = 2131951860(0x7f1300f4, float:1.9540146E38)
                java.lang.String r0 = r0.getString(r7)
                r5.p(r0)
                goto L_0x0309
            L_0x02b7:
                r0 = 0
                r13.setChecked(r0)
                if (r9 != 0) goto L_0x02be
                goto L_0x02c5
            L_0x02be:
                int r0 = r9.f16042a
                r7 = 2
                if (r0 != r7) goto L_0x02c5
                r0 = 1
                goto L_0x02c6
            L_0x02c5:
                r0 = 0
            L_0x02c6:
                if (r0 == 0) goto L_0x0309
                java.lang.CharSequence r0 = r5.h()
                if (r0 != 0) goto L_0x0309
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r7 = 2131952008(0x7f130188, float:1.9540447E38)
                java.lang.String r0 = r0.getString(r7)
                r5.p(r0)
                goto L_0x0309
            L_0x02e1:
                r13.setChecked(r7)
                if (r9 != 0) goto L_0x02e7
                goto L_0x02ee
            L_0x02e7:
                int r0 = r9.f16042a
                r7 = 2
                if (r0 != r7) goto L_0x02ee
                r0 = 1
                goto L_0x02ef
            L_0x02ee:
                r0 = 0
            L_0x02ef:
                if (r0 == 0) goto L_0x0309
                java.lang.CharSequence r0 = r5.h()
                if (r0 != 0) goto L_0x0309
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r7 = 2131952012(0x7f13018c, float:1.9540455E38)
                java.lang.String r0 = r0.getString(r7)
                r5.p(r0)
            L_0x0309:
                ff.m r0 = ff.m.f8717a
            L_0x030b:
                v0.w<java.lang.Boolean> r0 = v0.r.f16098u
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 == 0) goto L_0x035d
                boolean r0 = r0.booleanValue()
                if (r9 != 0) goto L_0x031c
                goto L_0x0323
            L_0x031c:
                int r7 = r9.f16042a
                r9 = 4
                if (r7 != r9) goto L_0x0323
                r7 = 1
                goto L_0x0324
            L_0x0323:
                r7 = 0
            L_0x0324:
                if (r7 == 0) goto L_0x032a
                r13.setSelected(r0)
                goto L_0x035b
            L_0x032a:
                r7 = 1
                r13.setCheckable(r7)
                r13.setChecked(r0)
                java.lang.CharSequence r7 = r5.h()
                if (r7 != 0) goto L_0x035b
                if (r0 == 0) goto L_0x0349
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r7 = 2131952083(0x7f1301d3, float:1.9540599E38)
                java.lang.String r0 = r0.getString(r7)
                goto L_0x0358
            L_0x0349:
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r7 = 2131952007(0x7f130187, float:1.9540445E38)
                java.lang.String r0 = r0.getString(r7)
            L_0x0358:
                r5.p(r0)
            L_0x035b:
                ff.m r0 = ff.m.f8717a
            L_0x035d:
                boolean r0 = r10.f16062b
                if (r0 == 0) goto L_0x036b
                java.util.List r0 = r8.i()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0380
            L_0x036b:
                v0.w<java.util.List<java.lang.String>> r0 = v0.r.f16079a
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x037c
                java.lang.Object r0 = gf.q.v0(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x037d
            L_0x037c:
                r0 = 0
            L_0x037d:
                r5.m(r0)
            L_0x0380:
                v0.w<java.lang.String> r0 = v0.r.f16094q
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x03ad
                r7 = r8
            L_0x038b:
                if (r7 == 0) goto L_0x03a7
                v0.w<java.lang.Boolean> r9 = v0.s.f16110a
                v0.j r11 = r7.f16074f
                boolean r12 = r11.b(r9)
                if (r12 == 0) goto L_0x03a2
                java.lang.Object r7 = r11.c(r9)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                goto L_0x03a8
            L_0x03a2:
                v0.p r7 = r7.h()
                goto L_0x038b
            L_0x03a7:
                r7 = 0
            L_0x03a8:
                if (r7 == 0) goto L_0x03ad
                r4.setViewIdResourceName(r0)
            L_0x03ad:
                v0.w<ff.m> r0 = v0.r.f16086h
                java.lang.Object r0 = v0.k.a(r10, r0)
                ff.m r0 = (ff.m) r0
                java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
                r9 = 28
                if (r0 == 0) goto L_0x03d8
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r9) goto L_0x03c4
                r0 = 1
                r13.setHeading(r0)
                goto L_0x03d6
            L_0x03c4:
                android.os.Bundle r0 = e2.i.b.a(r13)
                if (r0 == 0) goto L_0x03d6
                r9 = 0
                int r9 = r0.getInt(r7, r9)
                r9 = r9 & -3
                r9 = r9 | 2
                r0.putInt(r7, r9)
            L_0x03d6:
                ff.m r0 = ff.m.f8717a
            L_0x03d8:
                boolean r0 = androidx.compose.ui.platform.i0.c(r8)
                r4.setPassword(r0)
                boolean r0 = androidx.compose.ui.platform.i0.g(r8)
                r4.setEditable(r0)
                boolean r0 = androidx.compose.ui.platform.i0.a(r8)
                r13.setEnabled(r0)
                v0.w<java.lang.Boolean> r0 = v0.r.f16089k
                boolean r9 = r10.b(r0)
                r13.setFocusable(r9)
                boolean r9 = r13.isFocusable()
                if (r9 == 0) goto L_0x0418
                java.lang.Object r0 = r10.c(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r13.setFocused(r0)
                boolean r0 = r13.isFocused()
                if (r0 == 0) goto L_0x0414
                r0 = 2
                r5.a(r0)
                goto L_0x0418
            L_0x0414:
                r0 = 1
                r5.a(r0)
            L_0x0418:
                s0.s0 r0 = r8.b()
                if (r0 == 0) goto L_0x0423
                boolean r0 = r0.m0()
                goto L_0x0424
            L_0x0423:
                r0 = 0
            L_0x0424:
                if (r0 != 0) goto L_0x0430
                v0.w<ff.m> r0 = v0.r.m
                boolean r0 = r10.b(r0)
                if (r0 != 0) goto L_0x0430
                r0 = 1
                goto L_0x0431
            L_0x0430:
                r0 = 0
            L_0x0431:
                r13.setVisibleToUser(r0)
                v0.w<v0.e> r0 = v0.r.f16088j
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.e r0 = (v0.e) r0
                if (r0 == 0) goto L_0x0444
                r0 = 1
                r4.setLiveRegion(r0)
                ff.m r0 = ff.m.f8717a
            L_0x0444:
                r0 = 0
                r13.setClickable(r0)
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16044b
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                r9 = 16
                if (r0 == 0) goto L_0x0479
                v0.w<java.lang.Boolean> r11 = v0.r.f16098u
                java.lang.Object r11 = v0.k.a(r10, r11)
                java.lang.Boolean r12 = java.lang.Boolean.TRUE
                boolean r11 = sf.j.a(r11, r12)
                r12 = r11 ^ 1
                r13.setClickable(r12)
                boolean r12 = androidx.compose.ui.platform.i0.a(r8)
                if (r12 == 0) goto L_0x0477
                if (r11 != 0) goto L_0x0477
                e2.i$a r11 = new e2.i$a
                java.lang.String r0 = r0.f16036a
                r11.<init>((int) r9, (java.lang.String) r0)
                r5.b(r11)
            L_0x0477:
                ff.m r0 = ff.m.f8717a
            L_0x0479:
                r0 = 0
                r13.setLongClickable(r0)
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16045c
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                r11 = 32
                if (r0 == 0) goto L_0x049f
                r12 = 1
                r13.setLongClickable(r12)
                boolean r12 = androidx.compose.ui.platform.i0.a(r8)
                if (r12 == 0) goto L_0x049d
                e2.i$a r12 = new e2.i$a
                java.lang.String r0 = r0.f16036a
                r12.<init>((int) r11, (java.lang.String) r0)
                r5.b(r12)
            L_0x049d:
                ff.m r0 = ff.m.f8717a
            L_0x049f:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16050h
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x04b7
                e2.i$a r11 = new e2.i$a
                r12 = 16384(0x4000, float:2.2959E-41)
                java.lang.String r0 = r0.f16036a
                r11.<init>((int) r12, (java.lang.String) r0)
                r5.b(r11)
                ff.m r0 = ff.m.f8717a
            L_0x04b7:
                boolean r0 = androidx.compose.ui.platform.i0.a(r8)
                if (r0 == 0) goto L_0x0516
                v0.w<v0.a<rf.l<x0.a, java.lang.Boolean>>> r0 = v0.i.f16049g
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x04d5
                e2.i$a r11 = new e2.i$a
                r12 = 2097152(0x200000, float:2.938736E-39)
                java.lang.String r0 = r0.f16036a
                r11.<init>((int) r12, (java.lang.String) r0)
                r5.b(r11)
                ff.m r0 = ff.m.f8717a
            L_0x04d5:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16051i
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x04ed
                e2.i$a r11 = new e2.i$a
                r12 = 65536(0x10000, float:9.18355E-41)
                java.lang.String r0 = r0.f16036a
                r11.<init>((int) r12, (java.lang.String) r0)
                r5.b(r11)
                ff.m r0 = ff.m.f8717a
            L_0x04ed:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16052j
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0516
                boolean r11 = r13.isFocused()
                if (r11 == 0) goto L_0x0514
                androidx.compose.ui.platform.l r11 = r3.getClipboardManager()
                boolean r11 = r11.a()
                if (r11 == 0) goto L_0x0514
                e2.i$a r11 = new e2.i$a
                r12 = 32768(0x8000, float:4.5918E-41)
                java.lang.String r0 = r0.f16036a
                r11.<init>((int) r12, (java.lang.String) r0)
                r5.b(r11)
            L_0x0514:
                ff.m r0 = ff.m.f8717a
            L_0x0516:
                java.lang.String r0 = androidx.compose.ui.platform.s.r(r8)
                if (r0 == 0) goto L_0x0525
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0523
                goto L_0x0525
            L_0x0523:
                r0 = 0
                goto L_0x0526
            L_0x0525:
                r0 = 1
            L_0x0526:
                if (r0 != 0) goto L_0x058a
                int r0 = r2.p(r8)
                int r11 = r2.o(r8)
                r4.setTextSelection(r0, r11)
                v0.w<v0.a<rf.q<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>>> r0 = v0.i.f16048f
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                e2.i$a r11 = new e2.i$a
                if (r0 == 0) goto L_0x0542
                java.lang.String r0 = r0.f16036a
                goto L_0x0543
            L_0x0542:
                r0 = 0
            L_0x0543:
                r12 = 131072(0x20000, float:1.83671E-40)
                r11.<init>((int) r12, (java.lang.String) r0)
                r5.b(r11)
                r0 = 256(0x100, float:3.59E-43)
                r5.a(r0)
                r0 = 512(0x200, float:7.175E-43)
                r5.a(r0)
                r0 = 11
                r13.setMovementGranularities(r0)
                v0.w<java.util.List<java.lang.String>> r0 = v0.r.f16079a
                java.lang.Object r0 = v0.k.a(r10, r0)
                java.util.List r0 = (java.util.List) r0
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L_0x056f
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x056d
                goto L_0x056f
            L_0x056d:
                r0 = 0
                goto L_0x0570
            L_0x056f:
                r0 = 1
            L_0x0570:
                if (r0 == 0) goto L_0x058a
                v0.w<v0.a<rf.l<java.util.List<x0.g>, java.lang.Boolean>>> r0 = v0.i.f16043a
                boolean r0 = r10.b(r0)
                if (r0 == 0) goto L_0x058a
                boolean r0 = androidx.compose.ui.platform.i0.b(r8)
                if (r0 != 0) goto L_0x058a
                int r0 = r5.g()
                r0 = r0 | 4
                r0 = r0 | r9
                r13.setMovementGranularities(r0)
            L_0x058a:
                int r0 = android.os.Build.VERSION.SDK_INT
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.lang.CharSequence r11 = r5.i()
                if (r11 == 0) goto L_0x05a0
                int r11 = r11.length()
                if (r11 != 0) goto L_0x059e
                goto L_0x05a0
            L_0x059e:
                r11 = 0
                goto L_0x05a1
            L_0x05a0:
                r11 = 1
            L_0x05a1:
                if (r11 != 0) goto L_0x05b0
                v0.w<v0.a<rf.l<java.util.List<x0.g>, java.lang.Boolean>>> r11 = v0.i.f16043a
                boolean r11 = r10.b(r11)
                if (r11 == 0) goto L_0x05b0
                java.lang.String r11 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
                r9.add(r11)
            L_0x05b0:
                v0.w<java.lang.String> r11 = v0.r.f16094q
                boolean r11 = r10.b(r11)
                if (r11 == 0) goto L_0x05bd
                java.lang.String r11 = "androidx.compose.ui.semantics.testTag"
                r9.add(r11)
            L_0x05bd:
                boolean r11 = r9.isEmpty()
                java.lang.String r12 = "info.unwrap()"
                if (r11 != 0) goto L_0x05cd
                androidx.compose.ui.platform.j r11 = androidx.compose.ui.platform.j.f1335a
                sf.j.e(r13, r12)
                r11.a(r13, r9)
            L_0x05cd:
                v0.w<v0.f> r9 = v0.r.f16081c
                java.lang.Object r9 = v0.k.a(r10, r9)
                v0.f r9 = (v0.f) r9
                if (r9 == 0) goto L_0x0716
                v0.w<v0.a<rf.l<java.lang.Float, java.lang.Boolean>>> r11 = v0.i.f16047e
                boolean r14 = r10.b(r11)
                if (r14 == 0) goto L_0x05e5
                java.lang.String r14 = "android.widget.SeekBar"
                r5.j(r14)
                goto L_0x05ea
            L_0x05e5:
                java.lang.String r14 = "android.widget.ProgressBar"
                r5.j(r14)
            L_0x05ea:
                v0.f r14 = v0.f.f16038d
                float r15 = r9.f16039a
                r16 = r4
                wf.b<java.lang.Float> r4 = r9.f16040b
                if (r9 == r14) goto L_0x06ab
                java.lang.Comparable r9 = r4.b()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                java.lang.Comparable r14 = r4.c()
                java.lang.Number r14 = (java.lang.Number) r14
                float r14 = r14.floatValue()
                e2.i$e r9 = e2.i.e.a(r9, r14, r15)
                r5.n(r9)
                java.lang.CharSequence r9 = r5.h()
                if (r9 != 0) goto L_0x06a8
                java.lang.Comparable r9 = r4.c()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                java.lang.Comparable r14 = r4.b()
                java.lang.Number r14 = (java.lang.Number) r14
                float r14 = r14.floatValue()
                float r9 = r9 - r14
                r14 = 0
                int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r9 != 0) goto L_0x0631
                r9 = 1
                goto L_0x0632
            L_0x0631:
                r9 = 0
            L_0x0632:
                if (r9 == 0) goto L_0x0638
                r17 = r12
                r9 = r14
                goto L_0x065e
            L_0x0638:
                java.lang.Comparable r9 = r4.b()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                float r9 = r15 - r9
                java.lang.Comparable r17 = r4.c()
                java.lang.Number r17 = (java.lang.Number) r17
                float r17 = r17.floatValue()
                java.lang.Comparable r18 = r4.b()
                java.lang.Number r18 = (java.lang.Number) r18
                float r18 = r18.floatValue()
                float r17 = r17 - r18
                float r9 = r9 / r17
                r17 = r12
            L_0x065e:
                r12 = 1065353216(0x3f800000, float:1.0)
                float r9 = d2.f1.p(r9, r14, r12)
                int r14 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r14 != 0) goto L_0x066a
                r14 = 1
                goto L_0x066b
            L_0x066a:
                r14 = 0
            L_0x066b:
                if (r14 == 0) goto L_0x066f
                r9 = 0
                goto L_0x067b
            L_0x066f:
                int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r12 != 0) goto L_0x0675
                r12 = 1
                goto L_0x0676
            L_0x0675:
                r12 = 0
            L_0x0676:
                r14 = 100
                if (r12 == 0) goto L_0x067d
                r9 = r14
            L_0x067b:
                r12 = 1
                goto L_0x068b
            L_0x067d:
                float r12 = (float) r14
                float r9 = r9 * r12
                int r9 = q4.a.g(r9)
                r12 = 99
                r14 = 1
                int r9 = d2.f1.q(r9, r14, r12)
                r12 = r14
            L_0x068b:
                android.content.Context r14 = r3.getContext()
                android.content.res.Resources r14 = r14.getResources()
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r18 = 0
                r12[r18] = r9
                r9 = 2131952106(0x7f1301ea, float:1.9540645E38)
                java.lang.String r9 = r14.getString(r9, r12)
                r5.p(r9)
                goto L_0x06c5
            L_0x06a8:
                r17 = r12
                goto L_0x06c5
            L_0x06ab:
                r17 = r12
                java.lang.CharSequence r9 = r5.h()
                if (r9 != 0) goto L_0x06c5
                android.content.Context r9 = r3.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r12 = 2131951859(0x7f1300f3, float:1.9540144E38)
                java.lang.String r9 = r9.getString(r12)
                r5.p(r9)
            L_0x06c5:
                boolean r9 = r10.b(r11)
                if (r9 == 0) goto L_0x071a
                boolean r9 = androidx.compose.ui.platform.i0.a(r8)
                if (r9 == 0) goto L_0x071a
                java.lang.Comparable r9 = r4.c()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                java.lang.Comparable r11 = r4.b()
                java.lang.Number r11 = (java.lang.Number) r11
                float r11 = r11.floatValue()
                int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r12 >= 0) goto L_0x06ea
                r9 = r11
            L_0x06ea:
                int r9 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r9 >= 0) goto L_0x06f3
                e2.i$a r9 = e2.i.a.f7787j
                r5.b(r9)
            L_0x06f3:
                java.lang.Comparable r9 = r4.b()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                java.lang.Comparable r4 = r4.c()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x070c
                r9 = r4
            L_0x070c:
                int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r4 <= 0) goto L_0x071a
                e2.i$a r4 = e2.i.a.f7788k
                r5.b(r4)
                goto L_0x071a
            L_0x0716:
                r16 = r4
                r17 = r12
            L_0x071a:
                androidx.compose.ui.platform.s.b.a(r5, r8)
                t0.c.c(r5, r8)
                t0.c.d(r5, r8)
                v0.w<v0.h> r4 = v0.r.f16091n
                java.lang.Object r4 = v0.k.a(r10, r4)
                v0.h r4 = (v0.h) r4
                v0.w<v0.a<rf.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r9 = v0.i.f16046d
                java.lang.Object r9 = v0.k.a(r10, r9)
                v0.a r9 = (v0.a) r9
                if (r4 == 0) goto L_0x0744
                if (r9 == 0) goto L_0x0744
                boolean r0 = t0.c.b(r8)
                if (r0 != 0) goto L_0x0742
                java.lang.String r0 = "android.widget.HorizontalScrollView"
                r5.j(r0)
            L_0x0742:
                r0 = 0
                throw r0
            L_0x0744:
                v0.w<v0.h> r4 = v0.r.f16092o
                java.lang.Object r4 = v0.k.a(r10, r4)
                v0.h r4 = (v0.h) r4
                if (r4 == 0) goto L_0x075d
                if (r9 == 0) goto L_0x075d
                boolean r0 = t0.c.b(r8)
                if (r0 != 0) goto L_0x075b
                java.lang.String r0 = "android.widget.ScrollView"
                r5.j(r0)
            L_0x075b:
                r0 = 0
                throw r0
            L_0x075d:
                r4 = 29
                if (r0 < r4) goto L_0x0764
                androidx.compose.ui.platform.s.c.a(r5, r8)
            L_0x0764:
                v0.w<java.lang.String> r4 = v0.r.f16082d
                java.lang.Object r4 = v0.k.a(r10, r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r9 = 28
                if (r0 < r9) goto L_0x0774
                r13.setPaneTitle(r4)
                goto L_0x077d
            L_0x0774:
                android.os.Bundle r0 = e2.i.b.a(r13)
                java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r0.putCharSequence(r9, r4)
            L_0x077d:
                boolean r0 = androidx.compose.ui.platform.i0.a(r8)
                if (r0 == 0) goto L_0x08cc
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16053k
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x079b
                e2.i$a r4 = new e2.i$a
                r8 = 262144(0x40000, float:3.67342E-40)
                java.lang.String r0 = r0.f16036a
                r4.<init>((int) r8, (java.lang.String) r0)
                r5.b(r4)
                ff.m r0 = ff.m.f8717a
            L_0x079b:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16054l
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x07b3
                e2.i$a r4 = new e2.i$a
                r8 = 524288(0x80000, float:7.34684E-40)
                java.lang.String r0 = r0.f16036a
                r4.<init>((int) r8, (java.lang.String) r0)
                r5.b(r4)
                ff.m r0 = ff.m.f8717a
            L_0x07b3:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.m
                java.lang.Object r0 = v0.k.a(r10, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x07cb
                e2.i$a r4 = new e2.i$a
                r8 = 1048576(0x100000, float:1.469368E-39)
                java.lang.String r0 = r0.f16036a
                r4.<init>((int) r8, (java.lang.String) r0)
                r5.b(r4)
                ff.m r0 = ff.m.f8717a
            L_0x07cb:
                v0.w<java.util.List<v0.d>> r0 = v0.i.f16056o
                boolean r4 = r10.b(r0)
                if (r4 == 0) goto L_0x08cc
                java.lang.Object r0 = r10.c(r0)
                java.util.List r0 = (java.util.List) r0
                int r4 = r0.size()
                r8 = 32
                if (r4 >= r8) goto L_0x08c4
                o.g r4 = new o.g
                r4.<init>()
                java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                r8.<init>()
                o.g<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r9 = r2.f1425n
                boolean r11 = r9.f(r1)
                int[] r12 = androidx.compose.ui.platform.s.G
                if (r11 == 0) goto L_0x088f
                r11 = 0
                java.lang.Object r11 = r9.h(r1, r11)
                java.util.Map r11 = (java.util.Map) r11
                java.util.ArrayList r12 = gf.l.g0(r12)
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                int r15 = r0.size()
                r18 = 0
                r19 = r3
                r3 = r18
            L_0x080f:
                if (r3 >= r15) goto L_0x085d
                java.lang.Object r18 = r0.get(r3)
                r20 = r15
                r15 = r18
                v0.d r15 = (v0.d) r15
                sf.j.c(r11)
                r15.getClass()
                r18 = r7
                r7 = 0
                boolean r21 = r11.containsKey(r7)
                if (r21 == 0) goto L_0x084f
                java.lang.Object r15 = r11.get(r7)
                java.lang.Integer r15 = (java.lang.Integer) r15
                sf.j.c(r15)
                r21 = r11
                int r11 = r15.intValue()
                r4.i(r11, r7)
                r8.put(r7, r15)
                r12.remove(r15)
                e2.i$a r11 = new e2.i$a
                int r15 = r15.intValue()
                r11.<init>((int) r15, (java.lang.String) r7)
                r5.b(r11)
                goto L_0x0854
            L_0x084f:
                r21 = r11
                r14.add(r15)
            L_0x0854:
                int r3 = r3 + 1
                r7 = r18
                r15 = r20
                r11 = r21
                goto L_0x080f
            L_0x085d:
                r18 = r7
                int r0 = r14.size()
                r3 = 0
            L_0x0864:
                if (r3 >= r0) goto L_0x08bb
                java.lang.Object r7 = r14.get(r3)
                v0.d r7 = (v0.d) r7
                java.lang.Object r11 = r12.get(r3)
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                r7.getClass()
                r7 = 0
                r4.i(r11, r7)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
                r8.put(r7, r15)
                e2.i$a r15 = new e2.i$a
                r15.<init>((int) r11, (java.lang.String) r7)
                r5.b(r15)
                int r3 = r3 + 1
                goto L_0x0864
            L_0x088f:
                r19 = r3
                r18 = r7
                int r3 = r0.size()
                r7 = 0
            L_0x0898:
                if (r7 >= r3) goto L_0x08bb
                java.lang.Object r11 = r0.get(r7)
                v0.d r11 = (v0.d) r11
                r14 = r12[r7]
                r11.getClass()
                r11 = 0
                r4.i(r14, r11)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
                r8.put(r11, r15)
                e2.i$a r15 = new e2.i$a
                r15.<init>((int) r14, (java.lang.String) r11)
                r5.b(r15)
                int r7 = r7 + 1
                goto L_0x0898
            L_0x08bb:
                o.g<o.g<java.lang.CharSequence>> r0 = r2.m
                r0.i(r1, r4)
                r9.i(r1, r8)
                goto L_0x08d0
            L_0x08c4:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Can't have more than 32 custom actions for one widget"
                r0.<init>(r1)
                throw r0
            L_0x08cc:
                r19 = r3
                r18 = r7
            L_0x08d0:
                java.lang.CharSequence r0 = r13.getContentDescription()
                if (r0 != 0) goto L_0x08f1
                java.lang.CharSequence r0 = r5.i()
                if (r0 != 0) goto L_0x08f1
                java.lang.CharSequence r0 = r5.f()
                if (r0 != 0) goto L_0x08f1
                java.lang.CharSequence r0 = r5.h()
                if (r0 != 0) goto L_0x08f1
                boolean r0 = r13.isCheckable()
                if (r0 == 0) goto L_0x08ef
                goto L_0x08f1
            L_0x08ef:
                r0 = 0
                goto L_0x08f2
            L_0x08f1:
                r0 = 1
            L_0x08f2:
                boolean r3 = r10.f16062b
                if (r3 != 0) goto L_0x08fd
                if (r6 == 0) goto L_0x08fb
                if (r0 == 0) goto L_0x08fb
                goto L_0x08fd
            L_0x08fb:
                r0 = 0
                goto L_0x08fe
            L_0x08fd:
                r0 = 1
            L_0x08fe:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 28
                if (r3 < r4) goto L_0x0908
                r13.setScreenReaderFocusable(r0)
                goto L_0x091b
            L_0x0908:
                android.os.Bundle r3 = e2.i.b.a(r13)
                if (r3 == 0) goto L_0x091b
                r4 = 0
                r6 = r18
                int r4 = r3.getInt(r6, r4)
                r4 = r4 & -2
                r0 = r0 | r4
                r3.putInt(r6, r0)
            L_0x091b:
                java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r2.f1434w
                java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
                java.lang.Object r3 = r0.get(r3)
                if (r3 == 0) goto L_0x094d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x093f
                int r0 = r0.intValue()
                r3 = r19
                r5.s(r3, r0)
                ff.m r0 = ff.m.f8717a
                goto L_0x0941
            L_0x093f:
                r3 = r19
            L_0x0941:
                r0 = r17
                sf.j.e(r13, r0)
                java.lang.String r4 = r2.f1436y
                r6 = 0
                r2.j(r1, r13, r4, r6)
                goto L_0x0951
            L_0x094d:
                r0 = r17
                r3 = r19
            L_0x0951:
                java.util.HashMap<java.lang.Integer, java.lang.Integer> r4 = r2.f1435x
                java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
                java.lang.Object r6 = r4.get(r6)
                if (r6 == 0) goto L_0x097b
                java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
                java.lang.Object r4 = r4.get(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L_0x0972
                int r4 = r4.intValue()
                r5.r(r3, r4)
                ff.m r3 = ff.m.f8717a
            L_0x0972:
                sf.j.e(r13, r0)
                java.lang.String r0 = r2.f1437z
                r3 = 0
                r2.j(r1, r13, r0, r3)
            L_0x097b:
                r4 = r16
            L_0x097d:
                return r4
            L_0x097e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "semanticsNode "
                java.lang.String r3 = " has null parent"
                java.lang.String r1 = d.a.a(r2, r1, r3)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.d.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: s0.s0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: s0.s0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: s0.s0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: s0.s0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: s0.s0} */
        /* JADX WARNING: type inference failed for: r9v27, types: [java.lang.String] */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x050b, code lost:
            if (r0 != 16) goto L_0x0599;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:333:0x05ec  */
        /* JADX WARNING: Removed duplicated region for block: B:363:0x063d  */
        /* JADX WARNING: Removed duplicated region for block: B:364:0x0640  */
        /* JADX WARNING: Removed duplicated region for block: B:404:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:460:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:465:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0164  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean performAction(int r20, int r21, android.os.Bundle r22) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = r19
                r3 = r22
                androidx.compose.ui.platform.s r4 = androidx.compose.ui.platform.s.this
                java.util.Map r5 = r4.q()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
                java.lang.Object r5 = r5.get(r6)
                androidx.compose.ui.platform.u2 r5 = (androidx.compose.ui.platform.u2) r5
                r6 = 0
                if (r5 == 0) goto L_0x0696
                v0.p r5 = r5.f1476a
                if (r5 != 0) goto L_0x0021
                goto L_0x0696
            L_0x0021:
                r7 = 65536(0x10000, float:9.18355E-41)
                r8 = 12
                r9 = 0
                r15 = 1
                r10 = 64
                r11 = -2147483648(0xffffffff80000000, float:-0.0)
                androidx.compose.ui.platform.AndroidComposeView r12 = r4.f1416d
                if (r1 == r10) goto L_0x0667
                r10 = 128(0x80, float:1.794E-43)
                if (r1 == r10) goto L_0x0654
                r7 = 256(0x100, float:3.59E-43)
                r10 = 512(0x200, float:7.175E-43)
                r11 = 2
                int r14 = r5.f16075g
                v0.j r13 = r5.f16074f
                if (r1 == r7) goto L_0x04a9
                if (r1 == r10) goto L_0x04a9
                r7 = 16384(0x4000, float:2.2959E-41)
                if (r1 == r7) goto L_0x048d
                r7 = 131072(0x20000, float:1.83671E-40)
                if (r1 == r7) goto L_0x0465
                boolean r7 = androidx.compose.ui.platform.i0.a(r5)
                if (r7 != 0) goto L_0x0050
                goto L_0x0696
            L_0x0050:
                if (r1 == r15) goto L_0x0449
                if (r1 == r11) goto L_0x0432
                f1.j r7 = f1.j.f8040b
                switch(r1) {
                    case 16: goto L_0x024d;
                    case 32: goto L_0x0231;
                    case 4096: goto L_0x0270;
                    case 8192: goto L_0x0270;
                    case 32768: goto L_0x0215;
                    case 65536: goto L_0x01f9;
                    case 262144: goto L_0x01dd;
                    case 524288: goto L_0x01c1;
                    case 1048576: goto L_0x01a5;
                    case 2097152: goto L_0x0178;
                    case 16908342: goto L_0x00a3;
                    case 16908349: goto L_0x0073;
                    default: goto L_0x0059;
                }
            L_0x0059:
                switch(r1) {
                    case 16908344: goto L_0x0270;
                    case 16908345: goto L_0x0270;
                    case 16908346: goto L_0x0270;
                    case 16908347: goto L_0x0270;
                    default: goto L_0x005c;
                }
            L_0x005c:
                switch(r1) {
                    case 16908358: goto L_0x03f0;
                    case 16908359: goto L_0x03d4;
                    case 16908360: goto L_0x03b8;
                    case 16908361: goto L_0x039c;
                    default: goto L_0x005f;
                }
            L_0x005f:
                o.g<o.g<java.lang.CharSequence>> r3 = r4.m
                java.lang.Object r0 = r3.h(r0, r9)
                o.g r0 = (o.g) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.h(r1, r9)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 != 0) goto L_0x040c
                goto L_0x0696
            L_0x0073:
                if (r3 == 0) goto L_0x0696
                java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r1 = r3.containsKey(r0)
                if (r1 != 0) goto L_0x007f
                goto L_0x0696
            L_0x007f:
                v0.w<v0.a<rf.l<java.lang.Float, java.lang.Boolean>>> r1 = v0.i.f16047e
                java.lang.Object r1 = v0.k.a(r13, r1)
                v0.a r1 = (v0.a) r1
                if (r1 == 0) goto L_0x0696
                T r1 = r1.f16037b
                rf.l r1 = (rf.l) r1
                if (r1 == 0) goto L_0x0696
                float r0 = r3.getFloat(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = r1.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x00a3:
                v0.p r0 = r5.h()
                if (r0 == 0) goto L_0x00b8
                v0.j r1 = r0.g()
                if (r1 == 0) goto L_0x00b8
                v0.w<v0.a<rf.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r3 = v0.i.f16046d
                java.lang.Object r1 = v0.k.a(r1, r3)
                v0.a r1 = (v0.a) r1
                goto L_0x00b9
            L_0x00b8:
                r1 = r9
            L_0x00b9:
                if (r0 == 0) goto L_0x00d3
                if (r1 == 0) goto L_0x00be
                goto L_0x00d3
            L_0x00be:
                v0.p r0 = r0.h()
                if (r0 == 0) goto L_0x00b8
                v0.j r1 = r0.g()
                if (r1 == 0) goto L_0x00b8
                v0.w<v0.a<rf.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r3 = v0.i.f16046d
                java.lang.Object r1 = v0.k.a(r1, r3)
                v0.a r1 = (v0.a) r1
                goto L_0x00b9
            L_0x00d3:
                if (r0 != 0) goto L_0x00d7
                goto L_0x0696
            L_0x00d7:
                s0.a0 r3 = r0.f16071c
                s0.p0 r4 = r3.V
                s0.r r4 = r4.f14401b
                h0.d r4 = com.google.android.gms.internal.p000firebaseauthapi.g.b(r4)
                s0.p0 r3 = r3.V
                s0.r r3 = r3.f14401b
                s0.s0 r3 = r3.d0()
                if (r3 == 0) goto L_0x00f2
                long r10 = h0.c.f9068b
                long r10 = r3.p0(r10)
                goto L_0x00f4
            L_0x00f2:
                long r10 = h0.c.f9068b
            L_0x00f4:
                h0.d r3 = r4.c(r10)
                s0.s0 r4 = r5.b()
                if (r4 == 0) goto L_0x010e
                boolean r8 = r4.l0()
                if (r8 == 0) goto L_0x0105
                r9 = r4
            L_0x0105:
                if (r9 == 0) goto L_0x010e
                long r10 = h0.c.f9068b
                long r8 = r9.p0(r10)
                goto L_0x0110
            L_0x010e:
                long r8 = h0.c.f9068b
            L_0x0110:
                s0.s0 r4 = r5.b()
                if (r4 == 0) goto L_0x0119
                long r10 = r4.f12811c
                goto L_0x011b
            L_0x0119:
                r10 = 0
            L_0x011b:
                long r10 = b3.l0.e(r10)
                h0.d r4 = cb.d.e(r8, r10)
                v0.w<v0.h> r8 = v0.r.f16091n
                v0.j r0 = r0.f16074f
                java.lang.Object r8 = v0.k.a(r0, r8)
                v0.h r8 = (v0.h) r8
                v0.w<v0.h> r8 = v0.r.f16092o
                java.lang.Object r0 = v0.k.a(r0, r8)
                v0.h r0 = (v0.h) r0
                float r0 = r4.f9074a
                float r8 = r3.f9074a
                float r0 = r0 - r8
                float r8 = r4.f9076c
                float r9 = r3.f9076c
                float r8 = r8 - r9
                float r0 = androidx.compose.ui.platform.s.v(r0, r8)
                s0.a0 r5 = r5.f16071c
                f1.j r5 = r5.K
                if (r5 != r7) goto L_0x014a
                goto L_0x014b
            L_0x014a:
                r15 = r6
            L_0x014b:
                if (r15 == 0) goto L_0x014e
                float r0 = -r0
            L_0x014e:
                float r5 = r4.f9075b
                float r7 = r3.f9075b
                float r5 = r5 - r7
                float r4 = r4.f9077d
                float r3 = r3.f9077d
                float r4 = r4 - r3
                float r3 = androidx.compose.ui.platform.s.v(r5, r4)
                if (r1 == 0) goto L_0x0696
                T r1 = r1.f16037b
                rf.p r1 = (rf.p) r1
                if (r1 == 0) goto L_0x0696
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                java.lang.Object r0 = r1.invoke(r0, r3)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x0178:
                if (r3 == 0) goto L_0x0180
                java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
                java.lang.String r9 = r3.getString(r0)
            L_0x0180:
                v0.w<v0.a<rf.l<x0.a, java.lang.Boolean>>> r0 = v0.i.f16049g
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.l r0 = (rf.l) r0
                if (r0 == 0) goto L_0x0696
                x0.a r1 = new x0.a
                if (r9 != 0) goto L_0x0196
                java.lang.String r9 = ""
            L_0x0196:
                r1.<init>(r9)
                java.lang.Object r0 = r0.invoke(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x01a5:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.m
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x01c1:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16054l
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x01dd:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16053k
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x01f9:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16051i
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x0215:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16052j
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x0231:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16045c
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x024d:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r1 = v0.i.f16044b
                java.lang.Object r1 = v0.k.a(r13, r1)
                v0.a r1 = (v0.a) r1
                if (r1 == 0) goto L_0x0264
                T r1 = r1.f16037b
                rf.a r1 = (rf.a) r1
                if (r1 == 0) goto L_0x0264
                java.lang.Object r1 = r1.d()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L_0x0265
            L_0x0264:
                r1 = r9
            L_0x0265:
                androidx.compose.ui.platform.s.z(r4, r0, r15, r9, r8)
                if (r1 == 0) goto L_0x0696
                boolean r6 = r1.booleanValue()
                goto L_0x0696
            L_0x0270:
                r0 = 4096(0x1000, float:5.74E-42)
                if (r1 != r0) goto L_0x0276
                r0 = r15
                goto L_0x0277
            L_0x0276:
                r0 = r6
            L_0x0277:
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r1 != r3) goto L_0x027d
                r3 = r15
                goto L_0x027e
            L_0x027d:
                r3 = r6
            L_0x027e:
                r4 = 16908345(0x1020039, float:2.387739E-38)
                if (r1 != r4) goto L_0x0285
                r4 = r15
                goto L_0x0286
            L_0x0285:
                r4 = r6
            L_0x0286:
                r8 = 16908347(0x102003b, float:2.3877394E-38)
                if (r1 != r8) goto L_0x028d
                r8 = r15
                goto L_0x028e
            L_0x028d:
                r8 = r6
            L_0x028e:
                r10 = 16908344(0x1020038, float:2.3877386E-38)
                if (r1 != r10) goto L_0x0295
                r10 = r15
                goto L_0x0296
            L_0x0295:
                r10 = r6
            L_0x0296:
                r11 = 16908346(0x102003a, float:2.3877392E-38)
                if (r1 != r11) goto L_0x029d
                r1 = r15
                goto L_0x029e
            L_0x029d:
                r1 = r6
            L_0x029e:
                if (r4 != 0) goto L_0x02a9
                if (r8 != 0) goto L_0x02a9
                if (r0 != 0) goto L_0x02a9
                if (r3 == 0) goto L_0x02a7
                goto L_0x02a9
            L_0x02a7:
                r11 = r6
                goto L_0x02aa
            L_0x02a9:
                r11 = r15
            L_0x02aa:
                if (r10 != 0) goto L_0x02b5
                if (r1 != 0) goto L_0x02b5
                if (r0 != 0) goto L_0x02b5
                if (r3 == 0) goto L_0x02b3
                goto L_0x02b5
            L_0x02b3:
                r1 = r6
                goto L_0x02b6
            L_0x02b5:
                r1 = r15
            L_0x02b6:
                if (r0 != 0) goto L_0x02ba
                if (r3 == 0) goto L_0x0329
            L_0x02ba:
                v0.w<v0.f> r0 = v0.r.f16081c
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.f r0 = (v0.f) r0
                v0.w<v0.a<rf.l<java.lang.Float, java.lang.Boolean>>> r12 = v0.i.f16047e
                java.lang.Object r12 = v0.k.a(r13, r12)
                v0.a r12 = (v0.a) r12
                if (r0 == 0) goto L_0x0329
                if (r12 == 0) goto L_0x0329
                wf.b<java.lang.Float> r1 = r0.f16040b
                java.lang.Comparable r4 = r1.c()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                java.lang.Comparable r5 = r1.b()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x02e9
                r4 = r5
            L_0x02e9:
                java.lang.Comparable r5 = r1.b()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                java.lang.Comparable r1 = r1.c()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r7 <= 0) goto L_0x0302
                r5 = r1
            L_0x0302:
                float r4 = r4 - r5
                int r1 = r0.f16041c
                if (r1 <= 0) goto L_0x0309
                int r1 = r1 + r15
                goto L_0x030b
            L_0x0309:
                r1 = 20
            L_0x030b:
                float r1 = (float) r1
                float r4 = r4 / r1
                if (r3 == 0) goto L_0x0310
                float r4 = -r4
            L_0x0310:
                T r1 = r12.f16037b
                rf.l r1 = (rf.l) r1
                if (r1 == 0) goto L_0x0696
                float r0 = r0.f16039a
                float r0 = r0 + r4
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = r1.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x0329:
                s0.a0 r0 = r5.f16071c
                s0.p0 r5 = r0.V
                s0.r r5 = r5.f14401b
                h0.d r5 = com.google.android.gms.internal.p000firebaseauthapi.g.b(r5)
                float r12 = r5.f9076c
                float r14 = r5.f9074a
                float r12 = r12 - r14
                float r14 = r5.f9077d
                float r5 = r5.f9075b
                float r14 = r14 - r5
                long r16 = cb.c.f(r12, r14)
                v0.w<v0.a<rf.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r5 = v0.i.f16046d
                java.lang.Object r5 = v0.k.a(r13, r5)
                v0.a r5 = (v0.a) r5
                if (r5 != 0) goto L_0x034d
                goto L_0x0696
            L_0x034d:
                v0.w<v0.h> r5 = v0.r.f16091n
                java.lang.Object r5 = v0.k.a(r13, r5)
                v0.h r5 = (v0.h) r5
                r12 = 0
                if (r5 == 0) goto L_0x037b
                if (r11 == 0) goto L_0x037b
                float r5 = h0.g.b(r16)
                if (r4 != 0) goto L_0x0362
                if (r3 == 0) goto L_0x0363
            L_0x0362:
                float r5 = -r5
            L_0x0363:
                f1.j r0 = r0.K
                if (r0 != r7) goto L_0x0368
                goto L_0x0369
            L_0x0368:
                r15 = r6
            L_0x0369:
                if (r15 == 0) goto L_0x0370
                if (r4 != 0) goto L_0x036f
                if (r8 == 0) goto L_0x0370
            L_0x036f:
                float r5 = -r5
            L_0x0370:
                int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
                if (r0 < 0) goto L_0x037a
                int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
                if (r0 > 0) goto L_0x0379
                goto L_0x037b
            L_0x0379:
                throw r9
            L_0x037a:
                throw r9
            L_0x037b:
                v0.w<v0.h> r0 = v0.r.f16092o
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.h r0 = (v0.h) r0
                if (r0 == 0) goto L_0x0696
                if (r1 == 0) goto L_0x0696
                float r0 = h0.g.a(r16)
                if (r10 != 0) goto L_0x038f
                if (r3 == 0) goto L_0x0390
            L_0x038f:
                float r0 = -r0
            L_0x0390:
                int r1 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r1 < 0) goto L_0x039b
                int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r0 > 0) goto L_0x039a
                goto L_0x0696
            L_0x039a:
                throw r9
            L_0x039b:
                throw r9
            L_0x039c:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16060s
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x03b8:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16058q
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x03d4:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16059r
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x03f0:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16057p
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x040c:
                v0.w<java.util.List<v0.d>> r1 = v0.i.f16056o
                java.lang.Object r1 = v0.k.a(r13, r1)
                java.util.List r1 = (java.util.List) r1
                if (r1 != 0) goto L_0x0418
                goto L_0x0696
            L_0x0418:
                int r3 = r1.size()
                r4 = r6
            L_0x041d:
                if (r4 >= r3) goto L_0x0696
                java.lang.Object r5 = r1.get(r4)
                v0.d r5 = (v0.d) r5
                r5.getClass()
                boolean r5 = sf.j.a(r9, r0)
                if (r5 != 0) goto L_0x0431
                int r4 = r4 + 1
                goto L_0x041d
            L_0x0431:
                throw r9
            L_0x0432:
                v0.w<java.lang.Boolean> r0 = v0.r.f16089k
                java.lang.Object r0 = v0.k.a(r13, r0)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                boolean r0 = sf.j.a(r0, r1)
                if (r0 == 0) goto L_0x0696
                g0.j r0 = r12.getFocusOwner()
                r0.k(r6)
                goto L_0x0695
            L_0x0449:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16055n
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x0465:
                if (r3 == 0) goto L_0x0471
                java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
                r1 = -1
                int r16 = r3.getInt(r0, r1)
                r0 = r16
                goto L_0x0473
            L_0x0471:
                r1 = -1
                r0 = r1
            L_0x0473:
                if (r3 == 0) goto L_0x047c
                java.lang.String r7 = "ACTION_ARGUMENT_SELECTION_END_INT"
                int r13 = r3.getInt(r7, r1)
                goto L_0x047d
            L_0x047c:
                r13 = -1
            L_0x047d:
                boolean r0 = r4.E(r5, r0, r13, r6)
                if (r0 == 0) goto L_0x048a
                int r1 = r4.w(r14)
                androidx.compose.ui.platform.s.z(r4, r1, r6, r9, r8)
            L_0x048a:
                r6 = r0
                goto L_0x0696
            L_0x048d:
                v0.w<v0.a<rf.a<java.lang.Boolean>>> r0 = v0.i.f16050h
                java.lang.Object r0 = v0.k.a(r13, r0)
                v0.a r0 = (v0.a) r0
                if (r0 == 0) goto L_0x0696
                T r0 = r0.f16037b
                rf.a r0 = (rf.a) r0
                if (r0 == 0) goto L_0x0696
                java.lang.Object r0 = r0.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x0696
            L_0x04a9:
                if (r3 == 0) goto L_0x0696
                java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
                int r0 = r3.getInt(r0)
                java.lang.String r8 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
                boolean r3 = r3.getBoolean(r8)
                if (r1 != r7) goto L_0x04bb
                r1 = r15
                goto L_0x04bc
            L_0x04bb:
                r1 = r6
            L_0x04bc:
                java.lang.Integer r8 = r4.f1427p
                if (r8 != 0) goto L_0x04c1
                goto L_0x04c7
            L_0x04c1:
                int r8 = r8.intValue()
                if (r14 == r8) goto L_0x04d0
            L_0x04c7:
                r8 = -1
                r4.f1426o = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
                r4.f1427p = r8
            L_0x04d0:
                java.lang.String r8 = androidx.compose.ui.platform.s.r(r5)
                if (r8 == 0) goto L_0x04df
                int r14 = r8.length()
                if (r14 != 0) goto L_0x04dd
                goto L_0x04df
            L_0x04dd:
                r14 = r6
                goto L_0x04e0
            L_0x04df:
                r14 = r15
            L_0x04e0:
                if (r14 == 0) goto L_0x04e4
                goto L_0x0696
            L_0x04e4:
                java.lang.String r14 = androidx.compose.ui.platform.s.r(r5)
                if (r14 == 0) goto L_0x04f4
                int r17 = r14.length()
                if (r17 != 0) goto L_0x04f1
                goto L_0x04f4
            L_0x04f1:
                r17 = r6
                goto L_0x04f6
            L_0x04f4:
                r17 = r15
            L_0x04f6:
                if (r17 == 0) goto L_0x04fa
                goto L_0x0599
            L_0x04fa:
                java.lang.String r7 = "view.context.resources.configuration.locale"
                if (r0 == r15) goto L_0x05c2
                if (r0 == r11) goto L_0x059b
                java.lang.String r7 = "text"
                r11 = 4
                if (r0 == r11) goto L_0x0528
                r12 = 8
                if (r0 == r12) goto L_0x050f
                r12 = 16
                if (r0 == r12) goto L_0x0528
                goto L_0x0599
            L_0x050f:
                androidx.compose.ui.platform.f r9 = androidx.compose.ui.platform.f.f1286c
                if (r9 != 0) goto L_0x051a
                androidx.compose.ui.platform.f r9 = new androidx.compose.ui.platform.f
                r9.<init>(r6)
                androidx.compose.ui.platform.f.f1286c = r9
            L_0x051a:
                androidx.compose.ui.platform.f r9 = androidx.compose.ui.platform.f.f1286c
                java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"
                sf.j.d(r9, r11)
                sf.j.f(r14, r7)
                r9.f1258a = r14
                goto L_0x05e8
            L_0x0528:
                v0.w<v0.a<rf.l<java.util.List<x0.g>, java.lang.Boolean>>> r12 = v0.i.f16043a
                boolean r18 = r13.b(r12)
                if (r18 != 0) goto L_0x0531
                goto L_0x0599
            L_0x0531:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.lang.Object r12 = r13.c(r12)
                v0.a r12 = (v0.a) r12
                T r12 = r12.f16037b
                rf.l r12 = (rf.l) r12
                if (r12 == 0) goto L_0x0549
                java.lang.Object r12 = r12.invoke(r10)
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                goto L_0x054a
            L_0x0549:
                r12 = r9
            L_0x054a:
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r9 = sf.j.a(r12, r9)
                if (r9 == 0) goto L_0x0599
                java.lang.Object r9 = r10.get(r6)
                x0.g r9 = (x0.g) r9
                java.lang.String r10 = "layoutResult"
                if (r0 != r11) goto L_0x0579
                androidx.compose.ui.platform.d r11 = androidx.compose.ui.platform.d.f1271d
                if (r11 != 0) goto L_0x0567
                androidx.compose.ui.platform.d r11 = new androidx.compose.ui.platform.d
                r11.<init>()
                androidx.compose.ui.platform.d.f1271d = r11
            L_0x0567:
                androidx.compose.ui.platform.d r11 = androidx.compose.ui.platform.d.f1271d
                java.lang.String r12 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"
                sf.j.d(r11, r12)
                sf.j.f(r14, r7)
                sf.j.f(r9, r10)
                r11.f1258a = r14
                r11.f1272c = r9
                goto L_0x0597
            L_0x0579:
                androidx.compose.ui.platform.e r11 = androidx.compose.ui.platform.e.f1274e
                if (r11 != 0) goto L_0x0584
                androidx.compose.ui.platform.e r11 = new androidx.compose.ui.platform.e
                r11.<init>()
                androidx.compose.ui.platform.e.f1274e = r11
            L_0x0584:
                androidx.compose.ui.platform.e r11 = androidx.compose.ui.platform.e.f1274e
                java.lang.String r12 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"
                sf.j.d(r11, r12)
                sf.j.f(r14, r7)
                sf.j.f(r9, r10)
                r11.f1258a = r14
                r11.f1275c = r9
                r11.f1276d = r5
            L_0x0597:
                r9 = r11
                goto L_0x05e8
            L_0x0599:
                r9 = 0
                goto L_0x05e8
            L_0x059b:
                android.content.Context r9 = r12.getContext()
                android.content.res.Resources r9 = r9.getResources()
                android.content.res.Configuration r9 = r9.getConfiguration()
                java.util.Locale r9 = r9.locale
                sf.j.e(r9, r7)
                androidx.compose.ui.platform.h r7 = androidx.compose.ui.platform.h.f1292d
                if (r7 != 0) goto L_0x05b7
                androidx.compose.ui.platform.h r7 = new androidx.compose.ui.platform.h
                r7.<init>(r9)
                androidx.compose.ui.platform.h.f1292d = r7
            L_0x05b7:
                androidx.compose.ui.platform.h r9 = androidx.compose.ui.platform.h.f1292d
                java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"
                sf.j.d(r9, r7)
                r9.e(r14)
                goto L_0x05e8
            L_0x05c2:
                android.content.Context r9 = r12.getContext()
                android.content.res.Resources r9 = r9.getResources()
                android.content.res.Configuration r9 = r9.getConfiguration()
                java.util.Locale r9 = r9.locale
                sf.j.e(r9, r7)
                androidx.compose.ui.platform.c r7 = androidx.compose.ui.platform.c.f1266d
                if (r7 != 0) goto L_0x05de
                androidx.compose.ui.platform.c r7 = new androidx.compose.ui.platform.c
                r7.<init>(r9)
                androidx.compose.ui.platform.c.f1266d = r7
            L_0x05de:
                androidx.compose.ui.platform.c r9 = androidx.compose.ui.platform.c.f1266d
                java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"
                sf.j.d(r9, r7)
                r9.e(r14)
            L_0x05e8:
                if (r9 != 0) goto L_0x05ec
                goto L_0x0696
            L_0x05ec:
                int r7 = r4.o(r5)
                r10 = -1
                if (r7 != r10) goto L_0x05fb
                if (r1 == 0) goto L_0x05f7
                r7 = r6
                goto L_0x05fb
            L_0x05f7:
                int r7 = r8.length()
            L_0x05fb:
                if (r1 == 0) goto L_0x0602
                int[] r7 = r9.a(r7)
                goto L_0x0606
            L_0x0602:
                int[] r7 = r9.b(r7)
            L_0x0606:
                if (r7 != 0) goto L_0x060a
                goto L_0x0696
            L_0x060a:
                r11 = r7[r6]
                r12 = r7[r15]
                if (r3 == 0) goto L_0x0635
                v0.w<java.util.List<java.lang.String>> r3 = v0.r.f16079a
                boolean r3 = r13.b(r3)
                if (r3 != 0) goto L_0x0621
                v0.w<x0.a> r3 = v0.r.f16096s
                boolean r3 = r13.b(r3)
                if (r3 == 0) goto L_0x0621
                r6 = r15
            L_0x0621:
                if (r6 == 0) goto L_0x0635
                int r3 = r4.p(r5)
                r6 = -1
                if (r3 != r6) goto L_0x062f
                if (r1 == 0) goto L_0x062e
                r3 = r11
                goto L_0x062f
            L_0x062e:
                r3 = r12
            L_0x062f:
                if (r1 == 0) goto L_0x0633
                r6 = r12
                goto L_0x063b
            L_0x0633:
                r6 = r11
                goto L_0x063b
            L_0x0635:
                if (r1 == 0) goto L_0x0639
                r3 = r12
                goto L_0x063a
            L_0x0639:
                r3 = r11
            L_0x063a:
                r6 = r3
            L_0x063b:
                if (r1 == 0) goto L_0x0640
                r9 = 256(0x100, float:3.59E-43)
                goto L_0x0642
            L_0x0640:
                r9 = 512(0x200, float:7.175E-43)
            L_0x0642:
                androidx.compose.ui.platform.s$e r1 = new androidx.compose.ui.platform.s$e
                long r13 = android.os.SystemClock.uptimeMillis()
                r7 = r1
                r8 = r5
                r10 = r0
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r4.f1431t = r1
                r4.E(r5, r3, r6, r15)
                goto L_0x0695
            L_0x0654:
                int r1 = r4.f1424l
                if (r1 != r0) goto L_0x065a
                r1 = r15
                goto L_0x065b
            L_0x065a:
                r1 = r6
            L_0x065b:
                if (r1 == 0) goto L_0x0696
                r4.f1424l = r11
                r12.invalidate()
                r1 = 0
                androidx.compose.ui.platform.s.z(r4, r0, r7, r1, r8)
                goto L_0x0695
            L_0x0667:
                android.view.accessibility.AccessibilityManager r1 = r4.f1418f
                boolean r3 = r1.isEnabled()
                if (r3 == 0) goto L_0x0677
                boolean r1 = r1.isTouchExplorationEnabled()
                if (r1 == 0) goto L_0x0677
                r1 = r15
                goto L_0x0678
            L_0x0677:
                r1 = r6
            L_0x0678:
                if (r1 != 0) goto L_0x067b
                goto L_0x0696
            L_0x067b:
                int r1 = r4.f1424l
                if (r1 != r0) goto L_0x0681
                r3 = r15
                goto L_0x0682
            L_0x0681:
                r3 = r6
            L_0x0682:
                if (r3 != 0) goto L_0x0696
                r3 = 0
                if (r1 == r11) goto L_0x068a
                androidx.compose.ui.platform.s.z(r4, r1, r7, r3, r8)
            L_0x068a:
                r4.f1424l = r0
                r12.invalidate()
                r1 = 32768(0x8000, float:4.5918E-41)
                androidx.compose.ui.platform.s.z(r4, r0, r1, r3, r8)
            L_0x0695:
                r6 = r15
            L_0x0696:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.d.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final p f1440a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1441b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1442c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1443d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1444e;

        /* renamed from: f  reason: collision with root package name */
        public final long f1445f;

        public e(p pVar, int i8, int i10, int i11, int i12, long j10) {
            this.f1440a = pVar;
            this.f1441b = i8;
            this.f1442c = i10;
            this.f1443d = i11;
            this.f1444e = i12;
            this.f1445f = j10;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final p f1446a;

        /* renamed from: b  reason: collision with root package name */
        public final v0.j f1447b;

        /* renamed from: c  reason: collision with root package name */
        public final LinkedHashSet f1448c = new LinkedHashSet();

        public f(p pVar, Map<Integer, u2> map) {
            sf.j.f(pVar, "semanticsNode");
            sf.j.f(map, "currentSemanticsNodes");
            this.f1446a = pVar;
            this.f1447b = pVar.f16074f;
            List<p> i8 = pVar.i();
            int size = i8.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = i8.get(i10);
                if (map.containsKey(Integer.valueOf(pVar2.f16075g))) {
                    this.f1448c.add(Integer.valueOf(pVar2.f16075g));
                }
            }
        }
    }

    @lf.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2024, 2054}, m = "boundsUpdatesEventLoop")
    public static final class g extends lf.c {
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public s f1449a;

        /* renamed from: b  reason: collision with root package name */
        public o.b f1450b;

        /* renamed from: c  reason: collision with root package name */
        public cg.h f1451c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f1452d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s f1453e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(s sVar, jf.d<? super g> dVar) {
            super(dVar);
            this.f1453e = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1452d = obj;
            this.B |= Integer.MIN_VALUE;
            return this.f1453e.k(this);
        }
    }

    public static final class h extends sf.k implements l<t2, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f1454a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(s sVar) {
            super(1);
            this.f1454a = sVar;
        }

        public final Object invoke(Object obj) {
            t2 t2Var = (t2) obj;
            sf.j.f(t2Var, "it");
            s sVar = this.f1454a;
            sVar.getClass();
            if (t2Var.j()) {
                sVar.f1416d.getSnapshotObserver().a(t2Var, sVar.F, new e0(sVar, t2Var));
            }
            return m.f8717a;
        }
    }

    public static final class i extends sf.k implements l<a0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f1455a = new i();

        public i() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r2.f16062b == true) goto L_0x001a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r2) {
            /*
                r1 = this;
                s0.a0 r2 = (s0.a0) r2
                java.lang.String r0 = "it"
                sf.j.f(r2, r0)
                s0.p1 r2 = gc.b.n(r2)
                if (r2 == 0) goto L_0x0019
                v0.j r2 = s0.q1.a(r2)
                if (r2 == 0) goto L_0x0019
                boolean r2 = r2.f16062b
                r0 = 1
                if (r2 != r0) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.i.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class j extends sf.k implements l<a0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f1456a = new j();

        public j() {
            super(1);
        }

        public final Object invoke(Object obj) {
            a0 a0Var = (a0) obj;
            sf.j.f(a0Var, "it");
            return Boolean.valueOf(gc.b.n(a0Var) != null);
        }
    }

    public s(AndroidComposeView androidComposeView) {
        sf.j.f(androidComposeView, "view");
        this.f1416d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        sf.j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f1418f = accessibilityManager;
        this.f1419g = new q(this);
        this.f1420h = new r(this);
        this.f1421i = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f1422j = new Handler(Looper.getMainLooper());
        this.f1423k = new e2.j(new d());
        this.f1424l = Integer.MIN_VALUE;
        this.m = new o.g<>();
        this.f1425n = new o.g<>();
        this.f1426o = -1;
        this.f1428q = new o.b<>();
        this.f1429r = cb.d.d(-1, (cg.e) null, 6);
        this.f1430s = true;
        t tVar = t.f8979a;
        this.f1432u = tVar;
        this.f1433v = new o.b<>();
        this.f1434w = new HashMap<>();
        this.f1435x = new HashMap<>();
        this.f1436y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f1437z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A = new LinkedHashMap();
        this.B = new f(androidComposeView.getSemanticsOwner().a(), tVar);
        androidComposeView.addOnAttachStateChangeListener(new a(this));
        this.D = new androidx.activity.j(this, 2);
        this.E = new ArrayList();
        this.F = new h(this);
    }

    public static final void G(ArrayList arrayList, LinkedHashMap linkedHashMap, s sVar, boolean z10, p pVar) {
        arrayList.add(pVar);
        v0.j g10 = pVar.g();
        w wVar = r.f16090l;
        boolean z11 = !sf.j.a((Boolean) k.a(g10, wVar), Boolean.FALSE) && (sf.j.a((Boolean) k.a(pVar.g(), wVar), Boolean.TRUE) || pVar.g().b(r.f16084f) || pVar.g().b(v0.i.f16046d));
        boolean z12 = pVar.f16070b;
        if (z11) {
            linkedHashMap.put(Integer.valueOf(pVar.f16075g), sVar.F(q.P0(pVar.f(!z12, false)), z10));
            return;
        }
        List<p> f10 = pVar.f(!z12, false);
        int size = f10.size();
        for (int i8 = 0; i8 < size; i8++) {
            G(arrayList, linkedHashMap, sVar, z10, f10.get(i8));
        }
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i8 = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i8 = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i8);
        sf.j.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    public static String r(p pVar) {
        x0.a aVar;
        if (pVar == null) {
            return null;
        }
        w wVar = r.f16079a;
        v0.j jVar = pVar.f16074f;
        if (jVar.b(wVar)) {
            return cb.d.A((List) jVar.c(wVar));
        }
        if (i0.g(pVar)) {
            x0.a s10 = s(jVar);
            if (s10 != null) {
                return s10.f16819a;
            }
            return null;
        }
        List list = (List) k.a(jVar, r.f16095r);
        if (list == null || (aVar = (x0.a) q.v0(list)) == null) {
            return null;
        }
        return aVar.f16819a;
    }

    public static x0.a s(v0.j jVar) {
        return (x0.a) k.a(jVar, r.f16096s);
    }

    public static final float v(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    public static /* synthetic */ void z(s sVar, int i8, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        sVar.y(i8, i10, num, (List<String>) null);
    }

    public final void A(int i8, int i10, String str) {
        AccessibilityEvent m10 = m(w(i8), 32);
        m10.setContentChangeTypes(i10);
        if (str != null) {
            m10.getText().add(str);
        }
        x(m10);
    }

    public final void B(int i8) {
        e eVar = this.f1431t;
        if (eVar != null) {
            p pVar = eVar.f1440a;
            if (i8 == pVar.f16075g) {
                if (SystemClock.uptimeMillis() - eVar.f1445f <= 1000) {
                    AccessibilityEvent m10 = m(w(pVar.f16075g), 131072);
                    m10.setFromIndex(eVar.f1443d);
                    m10.setToIndex(eVar.f1444e);
                    m10.setAction(eVar.f1441b);
                    m10.setMovementGranularity(eVar.f1442c);
                    m10.getText().add(r(pVar));
                    x(m10);
                }
            } else {
                return;
            }
        }
        this.f1431t = null;
    }

    public final void C(p pVar, f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<p> i8 = pVar.i();
        int size = i8.size();
        int i10 = 0;
        while (true) {
            a0 a0Var = pVar.f16071c;
            if (i10 < size) {
                p pVar2 = i8.get(i10);
                if (q().containsKey(Integer.valueOf(pVar2.f16075g))) {
                    LinkedHashSet linkedHashSet2 = fVar.f1448c;
                    int i11 = pVar2.f16075g;
                    if (!linkedHashSet2.contains(Integer.valueOf(i11))) {
                        u(a0Var);
                        return;
                    }
                    linkedHashSet.add(Integer.valueOf(i11));
                }
                i10++;
            } else {
                for (Number intValue : fVar.f1448c) {
                    if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                        u(a0Var);
                        return;
                    }
                }
                List<p> i12 = pVar.i();
                int size2 = i12.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    p pVar3 = i12.get(i13);
                    if (q().containsKey(Integer.valueOf(pVar3.f16075g))) {
                        Object obj = this.A.get(Integer.valueOf(pVar3.f16075g));
                        sf.j.c(obj);
                        C(pVar3, (f) obj);
                    }
                }
                return;
            }
        }
    }

    public final void D(a0 a0Var, o.b<Integer> bVar) {
        a0 e10;
        p1 n2;
        if (a0Var.y() && !this.f1416d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(a0Var)) {
            p1 n10 = gc.b.n(a0Var);
            if (n10 == null) {
                a0 e11 = i0.e(a0Var, j.f1456a);
                n10 = e11 != null ? gc.b.n(e11) : null;
                if (n10 == null) {
                    return;
                }
            }
            if (!(q1.a(n10).f16062b || (e10 = i0.e(a0Var, i.f1455a)) == null || (n2 = gc.b.n(e10)) == null)) {
                n10 = n2;
            }
            int i8 = s0.i.e(n10).f14312b;
            if (bVar.add(Integer.valueOf(i8))) {
                z(this, w(i8), 2048, 1, 8);
            }
        }
    }

    public final boolean E(p pVar, int i8, int i10, boolean z10) {
        String r10;
        w wVar = v0.i.f16048f;
        v0.j jVar = pVar.f16074f;
        boolean z11 = false;
        if (jVar.b(wVar) && i0.a(pVar)) {
            rf.q qVar = (rf.q) ((v0.a) jVar.c(wVar)).f16037b;
            if (qVar != null) {
                return ((Boolean) qVar.e(Integer.valueOf(i8), Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        } else if ((i8 == i10 && i10 == this.f1426o) || (r10 = r(pVar)) == null) {
            return false;
        } else {
            if (i8 < 0 || i8 != i10 || i10 > r10.length()) {
                i8 = -1;
            }
            this.f1426o = i8;
            if (r10.length() > 0) {
                z11 = true;
            }
            int i11 = pVar.f16075g;
            int w10 = w(i11);
            Integer num = null;
            Integer valueOf = z11 ? Integer.valueOf(this.f1426o) : null;
            Integer valueOf2 = z11 ? Integer.valueOf(this.f1426o) : null;
            if (z11) {
                num = Integer.valueOf(r10.length());
            }
            x(n(w10, valueOf, valueOf2, num, r10));
            B(i11);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f3, code lost:
        if (r2 != false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList F(java.util.ArrayList r20, boolean r21) {
        /*
            r19 = this;
            r0 = r21
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r20.size()
            r5 = 0
        L_0x0011:
            if (r5 >= r3) goto L_0x0023
            r6 = r20
            java.lang.Object r7 = r6.get(r5)
            v0.p r7 = (v0.p) r7
            r8 = r19
            G(r2, r1, r8, r0, r7)
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            r8 = r19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = cb.d.H(r2)
            if (r5 < 0) goto L_0x0118
            r7 = 0
        L_0x0031:
            java.lang.Object r9 = r2.get(r7)
            v0.p r9 = (v0.p) r9
            if (r7 == 0) goto L_0x00f6
            h0.d r10 = r9.e()
            h0.d r11 = r9.e()
            int r12 = cb.d.H(r3)
            if (r12 < 0) goto L_0x00f0
            r13 = 0
        L_0x0048:
            java.lang.Object r14 = r3.get(r13)
            ff.g r14 = (ff.g) r14
            A r14 = r14.f8706a
            h0.d r14 = (h0.d) r14
            float r15 = r14.f9075b
            float r4 = r14.f9077d
            int r16 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r16 < 0) goto L_0x005d
            r16 = 1
            goto L_0x005f
        L_0x005d:
            r16 = 0
        L_0x005f:
            float r6 = r10.f9075b
            r17 = r2
            float r2 = r11.f9077d
            if (r16 != 0) goto L_0x00a2
            int r16 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r16 < 0) goto L_0x006e
            r16 = 1
            goto L_0x0070
        L_0x006e:
            r16 = 0
        L_0x0070:
            if (r16 != 0) goto L_0x00a2
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            float r15 = r15.floatValue()
            java.lang.Float r16 = java.lang.Float.valueOf(r6)
            float r8 = r16.floatValue()
            float r8 = java.lang.Math.max(r15, r8)
            java.lang.Float r15 = java.lang.Float.valueOf(r4)
            float r15 = r15.floatValue()
            java.lang.Float r16 = java.lang.Float.valueOf(r2)
            r18 = r10
            float r10 = r16.floatValue()
            float r10 = java.lang.Math.min(r15, r10)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a4
            r8 = 1
            goto L_0x00a5
        L_0x00a2:
            r18 = r10
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            if (r8 == 0) goto L_0x00e4
            h0.d r8 = new h0.d
            float r10 = r14.f9074a
            r11 = 0
            float r10 = java.lang.Math.max(r10, r11)
            float r11 = r14.f9075b
            float r6 = java.lang.Math.max(r11, r6)
            float r11 = r14.f9076c
            r12 = 2139095040(0x7f800000, float:Infinity)
            float r11 = java.lang.Math.min(r11, r12)
            float r2 = java.lang.Math.min(r4, r2)
            r8.<init>(r10, r6, r11, r2)
            ff.g r2 = new ff.g
            java.lang.Object r4 = r3.get(r13)
            ff.g r4 = (ff.g) r4
            B r4 = r4.f8707b
            r2.<init>(r8, r4)
            r3.set(r13, r2)
            java.lang.Object r2 = r3.get(r13)
            ff.g r2 = (ff.g) r2
            B r2 = r2.f8707b
            java.util.List r2 = (java.util.List) r2
            r2.add(r9)
            r2 = 1
            goto L_0x00f3
        L_0x00e4:
            if (r13 == r12) goto L_0x00f2
            int r13 = r13 + 1
            r8 = r19
            r2 = r17
            r10 = r18
            goto L_0x0048
        L_0x00f0:
            r17 = r2
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r2 != 0) goto L_0x010e
            goto L_0x00f8
        L_0x00f6:
            r17 = r2
        L_0x00f8:
            h0.d r2 = r9.e()
            ff.g r4 = new ff.g
            r6 = 1
            v0.p[] r8 = new v0.p[r6]
            r6 = 0
            r8[r6] = r9
            java.util.ArrayList r6 = cb.d.Q(r8)
            r4.<init>(r2, r6)
            r3.add(r4)
        L_0x010e:
            if (r7 == r5) goto L_0x0118
            int r7 = r7 + 1
            r8 = r19
            r2 = r17
            goto L_0x0031
        L_0x0118:
            r2 = 2
            rf.l[] r4 = new rf.l[r2]
            androidx.compose.ui.platform.f0 r5 = androidx.compose.ui.platform.f0.f1287a
            r6 = 0
            r4[r6] = r5
            androidx.compose.ui.platform.g0 r5 = androidx.compose.ui.platform.g0.f1288a
            r6 = 1
            r4[r6] = r5
            if.a r4 = d2.f1.s(r4)
            gf.n.o0(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.size()
            r6 = 0
        L_0x0136:
            if (r6 >= r5) goto L_0x01c0
            java.lang.Object r7 = r3.get(r6)
            ff.g r7 = (ff.g) r7
            B r8 = r7.f8707b
            java.util.List r8 = (java.util.List) r8
            r9 = 4
            rf.l[] r10 = new rf.l[r9]
            androidx.compose.ui.platform.a0 r11 = androidx.compose.ui.platform.a0.f1254a
            r12 = 0
            r10[r12] = r11
            androidx.compose.ui.platform.b0 r11 = androidx.compose.ui.platform.b0.f1260a
            r12 = 1
            r10[r12] = r11
            androidx.compose.ui.platform.c0 r11 = androidx.compose.ui.platform.c0.f1268a
            r10[r2] = r11
            r11 = 3
            androidx.compose.ui.platform.d0 r12 = androidx.compose.ui.platform.d0.f1273a
            r10[r11] = r12
            if.a r10 = d2.f1.s(r10)
            if (r0 == 0) goto L_0x0176
            rf.l[] r9 = new rf.l[r9]
            androidx.compose.ui.platform.w r10 = androidx.compose.ui.platform.w.f1484a
            r12 = 0
            r9[r12] = r10
            androidx.compose.ui.platform.x r10 = androidx.compose.ui.platform.x.f1500a
            r12 = 1
            r9[r12] = r10
            androidx.compose.ui.platform.y r10 = androidx.compose.ui.platform.y.f1512a
            r9[r2] = r10
            androidx.compose.ui.platform.z r10 = androidx.compose.ui.platform.z.f1530a
            r9[r11] = r10
            if.a r10 = d2.f1.s(r9)
        L_0x0176:
            s0.z r9 = s0.a0.f14309h0
            androidx.compose.ui.platform.u r11 = new androidx.compose.ui.platform.u
            r11.<init>(r10, r9)
            androidx.compose.ui.platform.v r9 = new androidx.compose.ui.platform.v
            r9.<init>(r11)
            gf.n.o0(r8, r9)
            B r7 = r7.f8707b
            java.util.List r7 = (java.util.List) r7
            int r8 = r7.size()
            r9 = 0
        L_0x018e:
            if (r9 >= r8) goto L_0x01ba
            java.lang.Object r10 = r7.get(r9)
            v0.p r10 = (v0.p) r10
            int r11 = r10.f16075g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r1.get(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x01aa
            java.util.Collection r11 = (java.util.Collection) r11
            r10 = r11
            r11 = 1
            r13 = 0
            goto L_0x01b4
        L_0x01aa:
            r11 = 1
            v0.p[] r12 = new v0.p[r11]
            r13 = 0
            r12[r13] = r10
            java.util.ArrayList r10 = cb.d.Q(r12)
        L_0x01b4:
            r4.addAll(r10)
            int r9 = r9 + 1
            goto L_0x018e
        L_0x01ba:
            r11 = 1
            r13 = 0
            int r6 = r6 + 1
            goto L_0x0136
        L_0x01c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.F(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void I(int i8) {
        int i10 = this.f1417e;
        if (i10 != i8) {
            this.f1417e = i8;
            z(this, i8, 128, (Integer) null, 12);
            z(this, i10, 256, (Integer) null, 12);
        }
    }

    public final e2.j b(View view) {
        sf.j.f(view, "host");
        return this.f1423k;
    }

    public final void j(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        p pVar;
        String str2;
        u2 u2Var = q().get(Integer.valueOf(i8));
        if (u2Var != null && (pVar = u2Var.f1476a) != null) {
            String r10 = r(pVar);
            if (sf.j.a(str, this.f1436y)) {
                Integer num = this.f1434w.get(Integer.valueOf(i8));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (sf.j.a(str, this.f1437z)) {
                Integer num2 = this.f1435x.get(Integer.valueOf(i8));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                w wVar = v0.i.f16043a;
                v0.j jVar = pVar.f16074f;
                if (!jVar.b(wVar) || bundle == null || !sf.j.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    w wVar2 = r.f16094q;
                    if (jVar.b(wVar2) && bundle != null && sf.j.a(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) k.a(jVar, wVar2)) != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                        return;
                    }
                    return;
                }
                int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i11 > 0 && i10 >= 0) {
                    if (i10 < (r10 != null ? r10.length() : Integer.MAX_VALUE)) {
                        ArrayList arrayList = new ArrayList();
                        l lVar = (l) ((v0.a) jVar.c(wVar)).f16037b;
                        if (sf.j.a(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                            x0.g gVar = (x0.g) arrayList.get(0);
                            ArrayList arrayList2 = new ArrayList();
                            if (i11 <= 0) {
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            } else {
                                gVar.getClass();
                                throw null;
                            }
                        } else {
                            return;
                        }
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x00b5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066 A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072 A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(jf.d<? super ff.m> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.platform.s.g
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.platform.s$g r0 = (androidx.compose.ui.platform.s.g) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.s$g r0 = new androidx.compose.ui.platform.s$g
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f1452d
            kf.a r1 = kf.a.f10464a
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            cg.h r2 = r0.f1451c
            o.b r5 = r0.f1450b
            androidx.compose.ui.platform.s r6 = r0.f1449a
            cb.b.J(r12)     // Catch:{ all -> 0x00b5 }
        L_0x002f:
            r12 = r5
            r5 = r2
            goto L_0x0057
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003a:
            cg.h r2 = r0.f1451c
            o.b r5 = r0.f1450b
            androidx.compose.ui.platform.s r6 = r0.f1449a
            cb.b.J(r12)     // Catch:{ all -> 0x00b5 }
            goto L_0x006a
        L_0x0044:
            cb.b.J(r12)
            o.b r12 = new o.b     // Catch:{ all -> 0x00bf }
            r12.<init>()     // Catch:{ all -> 0x00bf }
            cg.a r2 = r11.f1429r     // Catch:{ all -> 0x00bf }
            r2.getClass()     // Catch:{ all -> 0x00bf }
            cg.a$a r5 = new cg.a$a     // Catch:{ all -> 0x00bf }
            r5.<init>(r2)     // Catch:{ all -> 0x00bf }
            r6 = r11
        L_0x0057:
            r0.f1449a = r6     // Catch:{ all -> 0x00b5 }
            r0.f1450b = r12     // Catch:{ all -> 0x00b5 }
            r0.f1451c = r5     // Catch:{ all -> 0x00b5 }
            r0.B = r4     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = r5.a(r0)     // Catch:{ all -> 0x00b5 }
            if (r2 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r10 = r5
            r5 = r12
            r12 = r2
            r2 = r10
        L_0x006a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x00b5 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x00b5 }
            if (r12 == 0) goto L_0x00b7
            r2.next()     // Catch:{ all -> 0x00b5 }
            boolean r12 = r6.t()     // Catch:{ all -> 0x00b5 }
            o.b<s0.a0> r7 = r6.f1428q
            if (r12 == 0) goto L_0x00a1
            int r12 = r7.f12013c     // Catch:{ all -> 0x00b5 }
            r8 = 0
        L_0x0080:
            if (r8 >= r12) goto L_0x0091
            java.lang.Object[] r9 = r7.f12012b     // Catch:{ all -> 0x00b5 }
            r9 = r9[r8]     // Catch:{ all -> 0x00b5 }
            sf.j.c(r9)     // Catch:{ all -> 0x00b5 }
            s0.a0 r9 = (s0.a0) r9     // Catch:{ all -> 0x00b5 }
            r6.D(r9, r5)     // Catch:{ all -> 0x00b5 }
            int r8 = r8 + 1
            goto L_0x0080
        L_0x0091:
            r5.clear()     // Catch:{ all -> 0x00b5 }
            boolean r12 = r6.C     // Catch:{ all -> 0x00b5 }
            if (r12 != 0) goto L_0x00a1
            r6.C = r4     // Catch:{ all -> 0x00b5 }
            android.os.Handler r12 = r6.f1422j     // Catch:{ all -> 0x00b5 }
            androidx.activity.j r8 = r6.D     // Catch:{ all -> 0x00b5 }
            r12.post(r8)     // Catch:{ all -> 0x00b5 }
        L_0x00a1:
            r7.clear()     // Catch:{ all -> 0x00b5 }
            r0.f1449a = r6     // Catch:{ all -> 0x00b5 }
            r0.f1450b = r5     // Catch:{ all -> 0x00b5 }
            r0.f1451c = r2     // Catch:{ all -> 0x00b5 }
            r0.B = r3     // Catch:{ all -> 0x00b5 }
            r7 = 100
            java.lang.Object r12 = cb.d.x(r7, r0)     // Catch:{ all -> 0x00b5 }
            if (r12 != r1) goto L_0x002f
            return r1
        L_0x00b5:
            r12 = move-exception
            goto L_0x00c1
        L_0x00b7:
            o.b<s0.a0> r12 = r6.f1428q
            r12.clear()
            ff.m r12 = ff.m.f8717a
            return r12
        L_0x00bf:
            r12 = move-exception
            r6 = r11
        L_0x00c1:
            o.b<s0.a0> r0 = r6.f1428q
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s.k(jf.d):java.lang.Object");
    }

    public final void l(int i8, long j10, boolean z10) {
        w wVar;
        Collection<u2> values = q().values();
        sf.j.f(values, "currentSemanticsNodes");
        if (!h0.c.a(j10, h0.c.f9070d)) {
            if (!Float.isNaN(h0.c.b(j10)) && !Float.isNaN(h0.c.c(j10))) {
                if (z10) {
                    wVar = r.f16092o;
                } else if (!z10) {
                    wVar = r.f16091n;
                } else {
                    throw new ff.e();
                }
                Iterable<u2> iterable = values;
                if (!((Collection) iterable).isEmpty()) {
                    for (u2 u2Var : iterable) {
                        Rect rect = u2Var.f1477b;
                        sf.j.f(rect, "<this>");
                        if ((h0.c.b(j10) >= ((float) rect.left) && h0.c.b(j10) < ((float) rect.right) && h0.c.c(j10) >= ((float) rect.top) && h0.c.c(j10) < ((float) rect.bottom)) && ((v0.h) k.a(u2Var.f1476a.g(), wVar)) != null) {
                            if (i8 < 0) {
                                throw null;
                            }
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
    }

    public final AccessibilityEvent m(int i8, int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        sf.j.e(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f1416d;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i8);
        u2 u2Var = q().get(Integer.valueOf(i8));
        if (u2Var != null) {
            obtain.setPassword(i0.c(u2Var.f1476a));
        }
        return obtain;
    }

    public final AccessibilityEvent n(int i8, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent m10 = m(i8, 8192);
        if (num != null) {
            m10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            m10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            m10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            m10.getText().add(charSequence);
        }
        return m10;
    }

    public final int o(p pVar) {
        w<List<String>> wVar = r.f16079a;
        v0.j jVar = pVar.f16074f;
        if (!jVar.b(wVar)) {
            w wVar2 = r.f16097t;
            if (jVar.b(wVar2)) {
                return x0.h.a(((x0.h) jVar.c(wVar2)).f16908a);
            }
        }
        return this.f1426o;
    }

    public final int p(p pVar) {
        w<List<String>> wVar = r.f16079a;
        v0.j jVar = pVar.f16074f;
        if (!jVar.b(wVar)) {
            w wVar2 = r.f16097t;
            if (jVar.b(wVar2)) {
                return (int) (((x0.h) jVar.c(wVar2)).f16908a >> 32);
            }
        }
        return this.f1426o;
    }

    public final Map<Integer, u2> q() {
        if (this.f1430s) {
            this.f1430s = false;
            v0.q semanticsOwner = this.f1416d.getSemanticsOwner();
            sf.j.f(semanticsOwner, "<this>");
            p a10 = semanticsOwner.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a0 a0Var = a10.f16071c;
            if (a0Var.M && a0Var.y()) {
                Region region = new Region();
                h0.d d10 = a10.d();
                region.set(new Rect(q4.a.g(d10.f9074a), q4.a.g(d10.f9075b), q4.a.g(d10.f9076c), q4.a.g(d10.f9077d)));
                i0.f(region, a10, linkedHashMap, a10);
            }
            this.f1432u = linkedHashMap;
            HashMap<Integer, Integer> hashMap = this.f1434w;
            hashMap.clear();
            HashMap<Integer, Integer> hashMap2 = this.f1435x;
            hashMap2.clear();
            u2 u2Var = q().get(-1);
            p pVar = u2Var != null ? u2Var.f1476a : null;
            sf.j.c(pVar);
            int i8 = 1;
            ArrayList F2 = F(q.P0(pVar.f(!pVar.f16070b, false)), pVar.f16071c.K == f1.j.f8040b);
            int H = cb.d.H(F2);
            if (1 <= H) {
                while (true) {
                    int i10 = ((p) F2.get(i8 - 1)).f16075g;
                    int i11 = ((p) F2.get(i8)).f16075g;
                    hashMap.put(Integer.valueOf(i10), Integer.valueOf(i11));
                    hashMap2.put(Integer.valueOf(i11), Integer.valueOf(i10));
                    if (i8 == H) {
                        break;
                    }
                    i8++;
                }
            }
        }
        return this.f1432u;
    }

    public final boolean t() {
        if (this.f1418f.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.f1421i;
            sf.j.e(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void u(a0 a0Var) {
        if (this.f1428q.add(a0Var)) {
            this.f1429r.o(m.f8717a);
        }
    }

    public final int w(int i8) {
        if (i8 == this.f1416d.getSemanticsOwner().a().f16075g) {
            return -1;
        }
        return i8;
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!t()) {
            return false;
        }
        AndroidComposeView androidComposeView = this.f1416d;
        return androidComposeView.getParent().requestSendAccessibilityEvent(androidComposeView, accessibilityEvent);
    }

    public final boolean y(int i8, int i10, Integer num, List<String> list) {
        if (i8 == Integer.MIN_VALUE || !t()) {
            return false;
        }
        AccessibilityEvent m10 = m(i8, i10);
        if (num != null) {
            m10.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            m10.setContentDescription(cb.d.A(list));
        }
        return x(m10);
    }
}
