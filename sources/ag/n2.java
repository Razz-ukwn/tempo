package ag;

import android.content.Context;
import android.widget.Toast;
import cb.c;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.c6;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.google.android.gms.internal.p000firebaseauthapi.k0;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.gms.internal.p000firebaseauthapi.uc;
import com.google.android.gms.internal.p000firebaseauthapi.wc;
import com.google.android.gms.internal.p000firebaseauthapi.xc;
import com.quickkonnect.silencio.R;
import d5.b;
import f1.f;
import f1.g;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import jf.e;
import jf.f;
import kf.a;
import p4.h;
import q7.e2;
import q7.g2;
import r4.w;
import rf.p;
import sf.y;
import z0.t;

public final class n2 implements b, e2, t {
    public static final int[] B = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] C = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};
    public static final int[] D = {16843065, R.attr.hideAnimationBehavior, R.attr.indicatorColor, R.attr.minHideDelay, R.attr.showAnimationBehavior, R.attr.showDelay, R.attr.trackColor, R.attr.trackCornerRadius, R.attr.trackThickness};
    public static final int[] E = {16843072, R.attr.compatShadowEnabled, R.attr.itemHorizontalTranslationEnabled};
    public static final int[] F = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_significantVelocityThreshold, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.shouldRemoveExpandedCorners};
    public static final int[] G = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final int[] H = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] I = {R.attr.indicatorDirectionCircular, R.attr.indicatorInset, R.attr.indicatorSize};
    public static final int[] J = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] K = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] L = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] M = {R.attr.behavior_autoHide};
    public static final int[] N = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] O = {16843296, 16843916, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};
    public static final int[] P = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};
    public static final int[] Q = {16842766, R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] R = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] S = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] T = {16843237, R.attr.cardForegroundColor, R.attr.checkedIcon, R.attr.checkedIconGravity, R.attr.checkedIconMargin, R.attr.checkedIconSize, R.attr.checkedIconTint, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.state_dragged, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] U = {16843015, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};
    public static final int[] V = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] W = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] X = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] Y = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] Z = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: a  reason: collision with root package name */
    public static final c f448a = new c(0);

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f449a0 = {16843093, 16843097, 16843173, R.attr.marginHorizontal, R.attr.shapeAppearance};

    /* renamed from: b  reason: collision with root package name */
    public static final n2 f450b = new n2();

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f451b0 = {R.attr.backgroundTint, R.attr.elevation, R.attr.itemActiveIndicatorStyle, R.attr.itemBackground, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemPaddingBottom, R.attr.itemPaddingTop, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu};

    /* renamed from: c  reason: collision with root package name */
    public static Toast f452c;

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f453c0 = {16842931, 16842964, 16842973, 16843039, R.attr.bottomInsetScrimEnabled, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.drawerLayoutCornerSize, R.attr.elevation, R.attr.headerLayout, R.attr.itemBackground, R.attr.itemHorizontalPadding, R.attr.itemIconPadding, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemMaxLines, R.attr.itemRippleColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemShapeFillColor, R.attr.itemShapeInsetBottom, R.attr.itemShapeInsetEnd, R.attr.itemShapeInsetStart, R.attr.itemShapeInsetTop, R.attr.itemTextAppearance, R.attr.itemTextColor, R.attr.itemVerticalPadding, R.attr.menu, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.subheaderColor, R.attr.subheaderInsetEnd, R.attr.subheaderInsetStart, R.attr.subheaderTextAppearance, R.attr.topInsetScrimEnabled};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ n2 f454d = new n2();

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f455d0 = {R.attr.materialCircleRadius};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f456e = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollColor, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f457e0 = {R.attr.insetForeground};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f458f0 = {R.attr.behavior_overlapTop};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f459g0 = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f460h0 = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.coplanarSiblingViewId, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f461i0 = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f462j0 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextAppearance, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f463k0 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f464l0 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f465m0 = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMinSize, R.attr.endIconMode, R.attr.endIconScaleType, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorAccessibilityLiveRegion, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconMinSize, R.attr.startIconScaleType, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f466n0 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public /* synthetic */ n2() {
    }

    public static final long a(float f10, float f11) {
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f11)) & 4294967295L) | (floatToIntBits << 32);
        int i8 = f.f8030c;
        return floatToIntBits2;
    }

    public static final long b(float f10, float f11) {
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f11)) & 4294967295L) | (floatToIntBits << 32);
        int i8 = g.f8034c;
        return floatToIntBits2;
    }

    public static final Object c(m2 m2Var, p pVar) {
        Object obj;
        Object c02;
        f.b d10 = m2Var.f10734c.getContext().d(e.a.f10012a);
        n0 n0Var = d10 instanceof n0 ? (n0) d10 : null;
        if (n0Var == null) {
            n0Var = k0.f428a;
        }
        m2Var.k0(new w0(n0Var.m0(m2Var.f444d, m2Var, m2Var.f389b)));
        boolean z10 = false;
        try {
            y.c(2, pVar);
            obj = pVar.invoke(m2Var, m2Var);
        } catch (Throwable th) {
            obj = new w(th, false);
        }
        a aVar = a.f10464a;
        if (obj == aVar || (c02 = m2Var.c0(obj)) == v1.f499b) {
            return aVar;
        }
        if (c02 instanceof w) {
            Throwable th2 = ((w) c02).f504a;
            if (!(th2 instanceof l2) || ((l2) th2).f437a != m2Var) {
                z10 = true;
            }
            if (z10) {
                throw th2;
            } else if (obj instanceof w) {
                throw ((w) obj).f504a;
            }
        } else {
            obj = v1.m(c02);
        }
        return obj;
    }

    public static int e(int i8) {
        switch (i8) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static xc f(e6 e6Var) {
        s5 s5Var;
        k0 k0Var = new k0();
        uc ucVar = (uc) e6Var.f4514e;
        if (((ArrayList) k0Var.f4674a) != null) {
            k0Var.f4675b = ucVar;
            for (List it : ((ConcurrentMap) e6Var.f4510a).values()) {
                Iterator it2 = it.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c6 c6Var = (c6) it2.next();
                        int i8 = c6Var.f4451h - 2;
                        if (i8 == 1) {
                            s5Var = s5.f4901b;
                        } else if (i8 == 2) {
                            s5Var = s5.f4902c;
                        } else if (i8 == 3) {
                            s5Var = s5.f4903d;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        String str = c6Var.f4449f;
                        if (str.startsWith("type.googleapis.com/google.crypto.")) {
                            str = str.substring(34);
                        }
                        String name = c6Var.f4447d.name();
                        ArrayList arrayList = (ArrayList) k0Var.f4674a;
                        if (arrayList != null) {
                            arrayList.add(new wc(s5Var, c6Var.f4448e, str, name));
                        } else {
                            throw new IllegalStateException("addEntry cannot be called after build()");
                        }
                    }
                }
            }
            c6 c6Var2 = (c6) e6Var.f4512c;
            if (c6Var2 != null) {
                int i10 = c6Var2.f4448e;
                if (((ArrayList) k0Var.f4674a) != null) {
                    k0Var.f4676c = Integer.valueOf(i10);
                } else {
                    throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
                }
            }
            try {
                return k0Var.a();
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
    }

    public w d(w wVar, h hVar) {
        return wVar;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().p());
    }

    public /* synthetic */ n2(Context context) {
        context.getApplicationContext();
    }
}
