package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.x;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.lassi.presentation.cropper.CropImageActivity;
import com.lassi.presentation.cropper.CropImageView;
import com.quickkonnect.silencio.R;
import d0.g;
import g0.k;
import g0.o;
import g0.r;
import g0.s;
import g0.v;
import g0.y;
import h0.d;
import j1.g;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l1.c;
import l1.e;
import q7.e2;
import q7.g2;
import rb.a;
import rf.l;
import s0.i;
import sf.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gf  reason: invalid package */
public final class gf implements e2, SuccessContinuation {
    public static final int[] B = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};
    public static final int[] C = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};
    public static final int[] D = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};
    public static final int[] E = {R.attr.onHide, R.attr.onShow};
    public static final int[] F = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};
    public static final int[] G = {16842960, R.attr.constraints};
    public static final int[] H = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};
    public static final int[] I = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};
    public static final /* synthetic */ gf J = new gf();
    public static final /* synthetic */ gf K = new gf();
    public static final char[] L = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] M = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f4582a = new boolean[3];

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4583b = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4584c = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4585d = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4586e = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 >= r2) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5 <= r14) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r4 >= r13) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        if (r15 <= r12) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(h0.d r16, h0.d r17, h0.d r18, int r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = b(r3, r2, r0)
            if (r4 != 0) goto L_0x00f6
            boolean r4 = b(r3, r1, r0)
            if (r4 != 0) goto L_0x0016
            goto L_0x00f6
        L_0x0016:
            r6 = 3
            if (r3 != r6) goto L_0x001b
            r7 = 1
            goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            java.lang.String r8 = "This function should only be used for 2-D focus search"
            r9 = 6
            r10 = 5
            r11 = 4
            float r12 = r2.f9075b
            float r13 = r2.f9077d
            float r14 = r2.f9074a
            float r2 = r2.f9076c
            float r15 = r0.f9077d
            float r4 = r0.f9075b
            float r5 = r0.f9076c
            float r0 = r0.f9074a
            if (r7 == 0) goto L_0x0038
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x005d
            goto L_0x005b
        L_0x0038:
            if (r3 != r11) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            if (r7 == 0) goto L_0x0044
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x005d
            goto L_0x005b
        L_0x0044:
            if (r3 != r10) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            if (r7 == 0) goto L_0x0050
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x005d
            goto L_0x005b
        L_0x0050:
            if (r3 != r9) goto L_0x0054
            r7 = 1
            goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            if (r7 == 0) goto L_0x00ec
            int r7 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x005d
        L_0x005b:
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            if (r7 != 0) goto L_0x0062
            goto L_0x00ea
        L_0x0062:
            if (r3 != r6) goto L_0x0066
            r7 = 1
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            if (r7 != 0) goto L_0x00ea
            if (r3 != r11) goto L_0x006d
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r7 == 0) goto L_0x0072
            goto L_0x00ea
        L_0x0072:
            if (r3 != r6) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r7 == 0) goto L_0x007e
            float r1 = r1.f9076c
            r7 = r1
            r1 = r0
            goto L_0x009f
        L_0x007e:
            if (r3 != r11) goto L_0x0082
            r7 = 1
            goto L_0x0083
        L_0x0082:
            r7 = 0
        L_0x0083:
            if (r7 == 0) goto L_0x0089
            float r1 = r1.f9074a
            r7 = r5
            goto L_0x009f
        L_0x0089:
            if (r3 != r10) goto L_0x008d
            r7 = 1
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0095
            float r1 = r1.f9077d
            r7 = r1
            r1 = r4
            goto L_0x009f
        L_0x0095:
            if (r3 != r9) goto L_0x0099
            r7 = 1
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            if (r7 == 0) goto L_0x00e0
            float r1 = r1.f9075b
            r7 = r15
        L_0x009f:
            float r1 = r1 - r7
            r7 = 0
            float r1 = java.lang.Math.max(r7, r1)
            if (r3 != r6) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00af
            r13 = r0
            r12 = r14
            goto L_0x00ca
        L_0x00af:
            if (r3 != r11) goto L_0x00b3
            r0 = 1
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r13 = r2
            r12 = r5
            goto L_0x00ca
        L_0x00b9:
            if (r3 != r10) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x00c2
            r13 = r4
            goto L_0x00ca
        L_0x00c2:
            if (r3 != r9) goto L_0x00c6
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 == 0) goto L_0x00d6
            r12 = r15
        L_0x00ca:
            float r13 = r13 - r12
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r13)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f6
            goto L_0x00ea
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            r5 = 1
            goto L_0x00f7
        L_0x00ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.gf.a(h0.d, h0.d, h0.d, int):boolean");
    }

    public static final boolean b(int i8, d dVar, d dVar2) {
        if (!((i8 == 3) || i8 == 4)) {
            if (!((i8 == 5) || i8 == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (dVar.f9076c <= dVar2.f9074a || dVar.f9074a >= dVar2.f9076c) {
                return false;
            }
        } else if (dVar.f9077d <= dVar2.f9075b || dVar.f9075b >= dVar2.f9077d) {
            return false;
        }
        return true;
    }

    public static void c(x xVar, Uri uri) {
        File file;
        j.f(xVar, "activity");
        j.f(uri, "source");
        a aVar = a.V;
        com.lassi.presentation.cropper.d dVar = new com.lassi.presentation.cropper.d();
        dVar.f6617d = CropImageView.d.f6555b;
        dVar.f6618d0 = 100 - aVar.R;
        dVar.f6611a = aVar.L;
        com.lassi.presentation.cameraview.controls.a aVar2 = aVar.N;
        if (aVar2 != null) {
            dVar.I = aVar2.f6450a;
            dVar.J = aVar2.f6451b;
            dVar.H = true;
        }
        File i8 = i(xVar);
        i8.getAbsolutePath();
        if (!i8.exists()) {
            new File(i8.getPath()).mkdirs();
        } else {
            i8.getPath();
        }
        Uri uri2 = null;
        try {
            file = f(xVar);
        } catch (IOException e10) {
            e10.toString();
            file = null;
        }
        if (file != null) {
            uri2 = Uri.fromFile(file);
            Objects.toString(uri2);
        }
        dVar.f6614b0 = uri2;
        dVar.f6626k0 = aVar.P;
        dVar.f6627l0 = aVar.O;
        dVar.a();
        dVar.a();
        Intent intent = new Intent();
        intent.setClass(xVar, CropImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", uri);
        bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", dVar);
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
        xVar.startActivityForResult(intent, 203);
    }

    public static String d(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i8 = 0; i8 < length; i8++) {
            char[] cArr = L;
            sb2.append(cArr[(bArr[i8] & 240) >>> 4]);
            sb2.append(cArr[bArr[i8] & 15]);
        }
        return sb2.toString();
    }

    public static void e(e eVar, j1.d dVar, l1.d dVar2) {
        dVar2.f10869p = -1;
        dVar2.f10871q = -1;
        int i8 = eVar.V[0];
        int[] iArr = dVar2.V;
        if (i8 != 2 && iArr[0] == 4) {
            c cVar = dVar2.K;
            int i10 = cVar.f10832g;
            int r10 = eVar.r();
            c cVar2 = dVar2.M;
            int i11 = r10 - cVar2.f10832g;
            cVar.f10834i = dVar.k(cVar);
            cVar2.f10834i = dVar.k(cVar2);
            dVar.d(cVar.f10834i, i10);
            dVar.d(cVar2.f10834i, i11);
            dVar2.f10869p = 2;
            dVar2.f10843b0 = i10;
            int i12 = i11 - i10;
            dVar2.X = i12;
            int i13 = dVar2.f10849e0;
            if (i12 < i13) {
                dVar2.X = i13;
            }
        }
        if (eVar.V[1] != 2 && iArr[1] == 4) {
            c cVar3 = dVar2.L;
            int i14 = cVar3.f10832g;
            int l10 = eVar.l();
            c cVar4 = dVar2.N;
            int i15 = l10 - cVar4.f10832g;
            cVar3.f10834i = dVar.k(cVar3);
            cVar4.f10834i = dVar.k(cVar4);
            dVar.d(cVar3.f10834i, i14);
            dVar.d(cVar4.f10834i, i15);
            if (dVar2.f10847d0 > 0 || dVar2.f10859j0 == 8) {
                c cVar5 = dVar2.O;
                g k10 = dVar.k(cVar5);
                cVar5.f10834i = k10;
                dVar.d(k10, dVar2.f10847d0 + i14);
            }
            dVar2.f10871q = 2;
            dVar2.f10845c0 = i14;
            int i16 = i15 - i14;
            dVar2.Y = i16;
            int i17 = dVar2.f10851f0;
            if (i16 < i17) {
                dVar2.Y = i17;
            }
        }
    }

    public static File f(Context context) {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        j.e(format, "SimpleDateFormat(\"yyyyMM…Locale.US).format(Date())");
        File i8 = i(context);
        File createTempFile = File.createTempFile("IMG-" + format + '_', ".jpeg", i8);
        j.e(createTempFile, "createTempFile(\n        …/* directory */\n        )");
        return createTempFile;
    }

    public static final boolean g(int i8, int i10) {
        return (i8 & i10) == i10;
    }

    public static final s h(u.d dVar, d dVar2, int i8) {
        d dVar3;
        boolean z10 = i8 == 3;
        float f10 = dVar2.f9074a;
        float f11 = dVar2.f9076c;
        if (z10) {
            dVar3 = dVar2.b((f11 - f10) + ((float) 1), 0.0f);
        } else {
            if (i8 == 4) {
                dVar3 = dVar2.b(-((f11 - f10) + ((float) 1)), 0.0f);
            } else {
                boolean z11 = i8 == 5;
                float f12 = dVar2.f9075b;
                float f13 = dVar2.f9077d;
                if (z11) {
                    dVar3 = dVar2.b(0.0f, (f13 - f12) + ((float) 1));
                } else {
                    if (i8 == 6) {
                        dVar3 = dVar2.b(0.0f, -((f13 - f12) + ((float) 1)));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        int i10 = dVar.f15640c;
        s sVar = null;
        if (i10 > 0) {
            T[] tArr = dVar.f15638a;
            int i11 = 0;
            do {
                s sVar2 = (s) tArr[i11];
                if (v.d(sVar2)) {
                    d b10 = v.b(sVar2);
                    if (j(i8, b10, dVar2) && (!j(i8, dVar3, dVar2) || a(dVar2, b10, dVar3, i8) || (!a(dVar2, dVar3, b10, i8) && k(i8, dVar2, b10) < k(i8, dVar2, dVar3)))) {
                        sVar = sVar2;
                        dVar3 = b10;
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        return sVar;
    }

    public static File i(Context context) {
        String str;
        File filesDir = context.getApplicationContext().getFilesDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(filesDir);
        sb2.append(File.separator);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i8 = applicationInfo.labelRes;
        if (i8 == 0) {
            str = applicationInfo.nonLocalizedLabel.toString();
        } else {
            str = context.getString(i8);
            j.e(str, "context.getString(\n            stringId\n        )");
        }
        sb2.append(str);
        File file = new File(sb2.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final boolean j(int i8, d dVar, d dVar2) {
        boolean z10 = i8 == 3;
        float f10 = dVar.f9074a;
        float f11 = dVar.f9076c;
        float f12 = dVar2.f9074a;
        float f13 = dVar2.f9076c;
        if (!z10) {
            if (!(i8 == 4)) {
                boolean z11 = i8 == 5;
                float f14 = dVar.f9075b;
                float f15 = dVar.f9077d;
                float f16 = dVar2.f9075b;
                float f17 = dVar2.f9077d;
                if (!z11) {
                    if (!(i8 == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    } else if ((f16 < f14 || f17 <= f14) && f17 < f15) {
                        return true;
                    }
                } else if ((f17 > f15 || f16 >= f15) && f16 > f14) {
                    return true;
                }
            } else if ((f12 < f10 || f13 <= f10) && f13 < f11) {
                return true;
            }
        } else if ((f13 > f11 || f12 >= f11) && f12 > f10) {
            return true;
        }
        return false;
    }

    public static final long k(int i8, d dVar, d dVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = i8;
        d dVar3 = dVar;
        d dVar4 = dVar2;
        boolean z10 = i10 == 3;
        float f14 = dVar3.f9077d;
        float f15 = dVar3.f9075b;
        float f16 = dVar3.f9076c;
        float f17 = dVar3.f9074a;
        float f18 = dVar4.f9075b;
        float f19 = dVar4.f9077d;
        float f20 = dVar4.f9074a;
        float f21 = dVar4.f9076c;
        if (z10) {
            f11 = f17;
            f10 = f21;
        } else {
            if (i10 == 4) {
                f10 = f16;
                f11 = f20;
            } else {
                if (i10 == 5) {
                    f11 = f15;
                    f10 = f19;
                } else {
                    if (i10 == 6) {
                        f10 = f14;
                        f11 = f18;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = (long) Math.abs(Math.max(0.0f, f11 - f10));
        if ((i10 == 3) || i10 == 4) {
            f13 = (float) 2;
            f12 = ((f14 - f15) / f13) + f15;
        } else {
            if ((i10 == 5) || i10 == 6) {
                f13 = (float) 2;
                f12 = ((f16 - f17) / f13) + f17;
                f19 = f21;
                f18 = f20;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = (long) Math.abs(f12 - (((f19 - f18) / f13) + f18));
        return (abs2 * abs2) + (((long) 13) * abs * abs);
    }

    public static final boolean l(s sVar, s sVar2, int i8, l lVar) {
        s h3;
        u.d dVar = new u.d(new s[16]);
        g.c cVar = sVar.f7177a;
        if (cVar.F) {
            u.d dVar2 = new u.d(new g.c[16]);
            g.c cVar2 = cVar.f7181e;
            if (cVar2 == null) {
                i.a(dVar2, cVar);
            } else {
                dVar2.b(cVar2);
            }
            while (dVar2.i()) {
                g.c cVar3 = (g.c) dVar2.k(dVar2.f15640c - 1);
                if ((cVar3.f7179c & 1024) == 0) {
                    i.a(dVar2, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.f7178b & 1024) == 0) {
                            cVar3 = cVar3.f7181e;
                        } else if (cVar3 instanceof s) {
                            dVar.b((s) cVar3);
                        }
                    }
                }
            }
            if (!dVar.i() || (h3 = h(dVar, v.b(sVar2), i8)) == null) {
                return false;
            }
            h3.C();
            return ((Boolean) lVar.invoke(h3)).booleanValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final Boolean m(s sVar, int i8, k.b bVar) {
        d dVar;
        boolean z10;
        int ordinal = sVar.G.ordinal();
        T t2 = null;
        boolean z11 = true;
        boolean z12 = false;
        if (ordinal != 0) {
            if (ordinal == 1) {
                s c3 = v.c(sVar);
                if (c3 != null) {
                    int ordinal2 = c3.G.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            Boolean m = m(c3, i8, bVar);
                            if (!j.a(m, Boolean.FALSE)) {
                                return m;
                            }
                            c3.C().f8771j.getClass();
                            o oVar = o.f8774b;
                            if (j.a(oVar, oVar)) {
                                oVar = null;
                            }
                            if (oVar == null) {
                                if (c3.G == r.f8778b) {
                                    s a10 = v.a(c3);
                                    if (a10 != null) {
                                        if (!l(sVar, a10, i8, bVar)) {
                                            Boolean bool = (Boolean) g0.a.a(sVar, i8, new y(sVar, a10, i8, bVar));
                                            z11 = bool != null ? bool.booleanValue() : false;
                                        }
                                        return Boolean.valueOf(z11);
                                    }
                                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                                }
                                throw new IllegalStateException("Check failed.".toString());
                            } else if (j.a(oVar, o.f8775c)) {
                                return null;
                            } else {
                                return Boolean.valueOf(oVar.a(bVar));
                            }
                        } else if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new ff.e();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    if (!l(sVar, c3, i8, bVar)) {
                        Boolean bool2 = (Boolean) g0.a.a(sVar, i8, new y(sVar, c3, i8, bVar));
                        z11 = bool2 != null ? bool2.booleanValue() : false;
                    }
                    return Boolean.valueOf(z11);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    sVar.C();
                    return (Boolean) bVar.invoke(sVar);
                }
                throw new ff.e();
            }
        }
        sVar.C().f8770i.getClass();
        o oVar2 = o.f8774b;
        if (j.a(oVar2, oVar2)) {
            oVar2 = null;
        }
        if (oVar2 == null) {
            u.d dVar2 = new u.d(new s[16]);
            if (sVar.s().F) {
                u.d dVar3 = new u.d(new g.c[16]);
                g.c cVar = sVar.s().f7181e;
                if (cVar == null) {
                    i.a(dVar3, sVar.s());
                } else {
                    dVar3.b(cVar);
                }
                while (dVar3.i()) {
                    g.c cVar2 = (g.c) dVar3.k(dVar3.f15640c - 1);
                    if ((cVar2.f7179c & 1024) != 0) {
                        g.c cVar3 = cVar2;
                        while (true) {
                            if (cVar3 == null) {
                                break;
                            }
                            if ((cVar3.f7178b & 1024) != 0) {
                                if (cVar3 instanceof s) {
                                    s sVar2 = (s) cVar3;
                                    sVar2.C();
                                    dVar2.b(sVar2);
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    break;
                                }
                            }
                            cVar3 = cVar3.f7181e;
                        }
                    }
                    i.a(dVar3, cVar2);
                }
                int i10 = dVar2.f15640c;
                if (i10 <= 1) {
                    if (i10 != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        t2 = dVar2.f15638a[0];
                    }
                    s sVar3 = (s) t2;
                    if (sVar3 != null) {
                        z12 = ((Boolean) bVar.invoke(sVar3)).booleanValue();
                    }
                } else {
                    if (i8 == 7) {
                        i8 = 4;
                    }
                    if ((i8 == 4) || i8 == 6) {
                        d b10 = v.b(sVar);
                        float f10 = b10.f9074a;
                        float f11 = b10.f9075b;
                        dVar = new d(f10, f11, f10, f11);
                    } else {
                        if (!(i8 == 3) && i8 != 5) {
                            z11 = false;
                        }
                        if (z11) {
                            d b11 = v.b(sVar);
                            float f12 = b11.f9076c;
                            float f13 = b11.f9077d;
                            dVar = new d(f12, f13, f12, f13);
                        } else {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                    }
                    s h3 = h(dVar2, dVar, i8);
                    if (h3 != null) {
                        z12 = ((Boolean) bVar.invoke(h3)).booleanValue();
                    }
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } else if (!j.a(oVar2, o.f8775c)) {
            z12 = oVar2.a(bVar);
        }
        return Boolean.valueOf(z12);
    }

    public static /* synthetic */ String n(int i8) {
        return i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? i8 != 6 ? "UNRECOGNIZED" : "DHKEM_P521_HKDF_SHA512" : "DHKEM_P384_HKDF_SHA384" : "DHKEM_P256_HKDF_SHA256" : "DHKEM_X25519_HKDF_SHA256" : "KEM_UNKNOWN";
    }

    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i8 = s6.c.f14749h;
        return bundle != null && bundle.containsKey("google.messenger") ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().r());
    }
}
