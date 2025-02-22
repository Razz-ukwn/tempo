package l2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import d2.d1;
import d2.i0;
import e2.i;
import e2.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l2.b;

public abstract class a extends d2.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f10926n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0203a f10927o = new C0203a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f10928p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f10929d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f10930e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f10931f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f10932g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f10933h;

    /* renamed from: i  reason: collision with root package name */
    public final View f10934i;

    /* renamed from: j  reason: collision with root package name */
    public c f10935j;

    /* renamed from: k  reason: collision with root package name */
    public int f10936k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f10937l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    public class C0203a implements b.a<i> {
    }

    public class b {
    }

    public class c extends j {
        public c() {
        }

        public final i a(int i8) {
            return new i(AccessibilityNodeInfo.obtain(a.this.n(i8).f7779a));
        }

        public final i b(int i8) {
            a aVar = a.this;
            int i10 = i8 == 2 ? aVar.f10936k : aVar.f10937l;
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i10);
        }

        public final boolean c(int i8, int i10, Bundle bundle) {
            int i11;
            a aVar = a.this;
            View view = aVar.f10934i;
            if (i8 != -1) {
                boolean z10 = true;
                if (i10 == 1) {
                    return aVar.p(i8);
                }
                if (i10 == 2) {
                    return aVar.j(i8);
                }
                boolean z11 = false;
                if (i10 == 64) {
                    AccessibilityManager accessibilityManager = aVar.f10933h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i11 = aVar.f10936k) != i8) {
                        if (i11 != Integer.MIN_VALUE) {
                            aVar.f10936k = Integer.MIN_VALUE;
                            aVar.f10934i.invalidate();
                            aVar.q(i11, 65536);
                        }
                        aVar.f10936k = i8;
                        view.invalidate();
                        aVar.q(i8, 32768);
                        return z10;
                    }
                } else if (i10 != 128) {
                    Chip.b bVar = (Chip.b) aVar;
                    if (i10 == 16) {
                        Chip chip = Chip.this;
                        if (i8 == 0) {
                            return chip.performClick();
                        }
                        if (i8 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.D;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z11 = true;
                            }
                            if (chip.O) {
                                chip.N.q(1, 1);
                            }
                        }
                    }
                    return z11;
                } else if (aVar.f10936k == i8) {
                    aVar.f10936k = Integer.MIN_VALUE;
                    view.invalidate();
                    aVar.q(i8, 65536);
                    return z10;
                }
                z10 = false;
                return z10;
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            return i0.d.j(view, i10, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f10934i = view;
            this.f10933h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.d.c(view) == 0) {
                i0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final j b(View view) {
        if (this.f10935j == null) {
            this.f10935j = new c();
        }
        return this.f10935j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.f5809e;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f5828m0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        iVar.j(chip.getAccessibilityClassName());
        iVar.q(chip.getText());
    }

    public final boolean j(int i8) {
        if (this.f10937l != i8) {
            return false;
        }
        this.f10937l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i8 == 1) {
            Chip chip = Chip.this;
            chip.I = false;
            chip.refreshDrawableState();
        }
        q(i8, 8);
        return true;
    }

    public final i k(int i8) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        iVar.j("android.view.View");
        Rect rect = f10926n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        iVar.f7780b = -1;
        View view = this.f10934i;
        obtain.setParent(view);
        o(i8, iVar);
        if (iVar.i() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f10930e;
        iVar.e(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                iVar.f7781c = i8;
                obtain.setSource(view, i8);
                boolean z10 = false;
                if (this.f10936k == i8) {
                    obtain.setAccessibilityFocused(true);
                    iVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    iVar.a(64);
                }
                boolean z11 = this.f10937l == i8;
                if (z11) {
                    iVar.a(2);
                } else if (obtain.isFocusable()) {
                    iVar.a(1);
                }
                obtain.setFocused(z11);
                int[] iArr = this.f10932g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.f10929d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    iVar.e(rect3);
                    if (iVar.f7780b != -1) {
                        i iVar2 = new i(AccessibilityNodeInfo.obtain());
                        for (int i10 = iVar.f7780b; i10 != -1; i10 = iVar2.f7780b) {
                            iVar2.f7780b = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo = iVar2.f7779a;
                            accessibilityNodeInfo.setParent(view, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            o(i10, iVar2);
                            iVar2.e(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f10931f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f7779a;
                        accessibilityNodeInfo2.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
                return iVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0153 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            o.g r4 = new o.g
            r4.<init>()
            r6 = 0
        L_0x0014:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0038
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            e2.i r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.i(r8, r7)
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0038:
            int r3 = r0.f10937l
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.h(r3, r6)
            e2.i r3 = (e2.i) r3
        L_0x0047:
            r9 = 1
            l2.a$a r10 = f10927o
            l2.a$b r11 = f10928p
            android.view.View r12 = r0.f10934i
            r13 = 2
            if (r1 == r9) goto L_0x015c
            if (r1 == r13) goto L_0x015c
            r13 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L_0x006c
            if (r1 == r15) goto L_0x006c
            if (r1 == r14) goto L_0x006c
            if (r1 != r13) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006c:
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            int r5 = r0.f10937l
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L_0x0080
            e2.i r2 = r0.n(r5)
            r2.e(r9)
        L_0x007e:
            r12 = 0
            goto L_0x00b3
        L_0x0080:
            if (r2 == 0) goto L_0x0086
            r9.set(r2)
            goto L_0x007e
        L_0x0086:
            int r2 = r12.getWidth()
            int r5 = r12.getHeight()
            if (r1 == r6) goto L_0x00af
            if (r1 == r15) goto L_0x00aa
            if (r1 == r14) goto L_0x00a3
            if (r1 != r13) goto L_0x009d
            r5 = 0
            r12 = -1
            r9.set(r5, r12, r2, r12)
            r12 = r5
            goto L_0x00b3
        L_0x009d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x00a3:
            r2 = 0
            r12 = -1
            r9.set(r12, r2, r12, r5)
            r12 = r2
            goto L_0x00b3
        L_0x00aa:
            r12 = 0
            r9.set(r12, r5, r2, r5)
            goto L_0x00b3
        L_0x00af:
            r12 = 0
            r9.set(r2, r12, r2, r5)
        L_0x00b3:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r9)
            if (r1 == r6) goto L_0x00e6
            if (r1 == r15) goto L_0x00dc
            if (r1 == r14) goto L_0x00d1
            if (r1 != r13) goto L_0x00cb
            int r5 = r9.height()
            r6 = 1
            int r5 = r5 + r6
            int r5 = -r5
            r2.offset(r12, r5)
            goto L_0x00ef
        L_0x00cb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x00d1:
            r6 = 1
            int r5 = r9.width()
            int r5 = r5 + r6
            int r5 = -r5
            r2.offset(r5, r12)
            goto L_0x00ef
        L_0x00dc:
            r6 = 1
            int r5 = r9.height()
            int r5 = r5 + r6
            r2.offset(r12, r5)
            goto L_0x00ef
        L_0x00e6:
            r6 = 1
            int r5 = r9.width()
            int r5 = r5 + r6
            r2.offset(r5, r12)
        L_0x00ef:
            r11.getClass()
            int r5 = r4.j()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = r12
            r16 = 0
        L_0x00fe:
            if (r8 >= r5) goto L_0x0156
            java.lang.Object r11 = r4.k(r8)
            e2.i r11 = (e2.i) r11
            if (r11 != r3) goto L_0x0109
            goto L_0x0153
        L_0x0109:
            r10.getClass()
            r11.e(r6)
            boolean r13 = l2.b.c(r1, r9, r6)
            if (r13 != 0) goto L_0x0116
            goto L_0x014b
        L_0x0116:
            boolean r13 = l2.b.c(r1, r9, r2)
            if (r13 != 0) goto L_0x011d
            goto L_0x0149
        L_0x011d:
            boolean r13 = l2.b.a(r1, r9, r6, r2)
            if (r13 == 0) goto L_0x0124
            goto L_0x0149
        L_0x0124:
            boolean r13 = l2.b.a(r1, r9, r2, r6)
            if (r13 == 0) goto L_0x012b
            goto L_0x014b
        L_0x012b:
            int r13 = l2.b.d(r1, r9, r6)
            int r14 = l2.b.e(r1, r9, r6)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r13 = l2.b.d(r1, r9, r2)
            int r15 = l2.b.e(r1, r9, r2)
            int r17 = r13 * 13
            int r17 = r17 * r13
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L_0x014b
        L_0x0149:
            r13 = 1
            goto L_0x014c
        L_0x014b:
            r13 = r12
        L_0x014c:
            if (r13 == 0) goto L_0x0153
            r2.set(r6)
            r16 = r11
        L_0x0153:
            int r8 = r8 + 1
            goto L_0x00fe
        L_0x0156:
            r2 = r12
            r1 = r16
            r3 = -1
            goto L_0x01cb
        L_0x015c:
            r2 = 0
            java.util.WeakHashMap<android.view.View, d2.d1> r5 = d2.i0.f7217a
            int r5 = d2.i0.e.d(r12)
            r6 = 1
            if (r5 != r6) goto L_0x0168
            r5 = 1
            goto L_0x0169
        L_0x0168:
            r5 = r2
        L_0x0169:
            r11.getClass()
            int r6 = r4.j()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            r9 = r2
        L_0x0176:
            if (r9 >= r6) goto L_0x0184
            java.lang.Object r11 = r4.k(r9)
            e2.i r11 = (e2.i) r11
            r8.add(r11)
            int r9 = r9 + 1
            goto L_0x0176
        L_0x0184:
            l2.b$b r6 = new l2.b$b
            r6.<init>(r5, r10)
            java.util.Collections.sort(r8, r6)
            r5 = 1
            if (r1 == r5) goto L_0x01b0
            if (r1 != r13) goto L_0x01a8
            int r1 = r8.size()
            if (r3 != 0) goto L_0x0199
            r12 = -1
            goto L_0x019d
        L_0x0199:
            int r12 = r8.lastIndexOf(r3)
        L_0x019d:
            int r12 = r12 + r5
            if (r12 >= r1) goto L_0x01a6
            java.lang.Object r6 = r8.get(r12)
            r3 = -1
            goto L_0x01c5
        L_0x01a6:
            r3 = -1
            goto L_0x01c4
        L_0x01a8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b0:
            int r1 = r8.size()
            if (r3 != 0) goto L_0x01b7
            goto L_0x01bb
        L_0x01b7:
            int r1 = r8.indexOf(r3)
        L_0x01bb:
            r3 = -1
            int r1 = r1 + r3
            if (r1 < 0) goto L_0x01c4
            java.lang.Object r6 = r8.get(r1)
            goto L_0x01c5
        L_0x01c4:
            r6 = 0
        L_0x01c5:
            r16 = r6
            e2.i r16 = (e2.i) r16
            r1 = r16
        L_0x01cb:
            if (r1 != 0) goto L_0x01ce
            goto L_0x01f1
        L_0x01ce:
            boolean r5 = r4.f12034a
            if (r5 == 0) goto L_0x01d5
            r4.g()
        L_0x01d5:
            r5 = r2
        L_0x01d6:
            int r2 = r4.f12037d
            if (r5 >= r2) goto L_0x01e5
            java.lang.Object[] r2 = r4.f12036c
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01e2
            r8 = r5
            goto L_0x01e6
        L_0x01e2:
            int r5 = r5 + 1
            goto L_0x01d6
        L_0x01e5:
            r8 = r3
        L_0x01e6:
            boolean r1 = r4.f12034a
            if (r1 == 0) goto L_0x01ed
            r4.g()
        L_0x01ed:
            int[] r1 = r4.f12035b
            r7 = r1[r8]
        L_0x01f1:
            boolean r1 = r0.p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.m(int, android.graphics.Rect):boolean");
    }

    public final i n(int i8) {
        if (i8 != -1) {
            return k(i8);
        }
        View view = this.f10934i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        i iVar = new i(obtain);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iVar.f7779a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return iVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i8, i iVar);

    public final boolean p(int i8) {
        int i10;
        View view = this.f10934i;
        if ((!view.isFocused() && !view.requestFocus()) || (i10 = this.f10937l) == i8) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i8 == Integer.MIN_VALUE) {
            return false;
        }
        this.f10937l = i8;
        Chip.b bVar = (Chip.b) this;
        if (i8 == 1) {
            Chip chip = Chip.this;
            chip.I = true;
            chip.refreshDrawableState();
        }
        q(i8, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.f10934i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f10933h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            android.view.View r0 = r5.f10934i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            e2.i r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.i()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f7779a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            e2.l.a(r7, r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.q(int, int):void");
    }
}
