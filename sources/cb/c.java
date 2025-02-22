package cb;

import ag.a0;
import ag.f2;
import ag.g0;
import ag.w1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Log;
import androidx.fragment.app.q;
import cg.e;
import cg.f;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.quickkonnect.silencio.R;
import e5.g;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jg.b;
import jg.f0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.t0;
import l5.a;
import o.h;
import p4.d;
import q7.e2;
import q7.g2;
import s6.u;
import sf.j;

public class c implements s, b, e2, Continuation, d, g, dh {
    public static final /* synthetic */ c B = new c();

    /* renamed from: a  reason: collision with root package name */
    public static final c f3885a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3886b = {R.attr.ccpDialog_allowSearch, R.attr.ccpDialog_background, R.attr.ccpDialog_backgroundColor, R.attr.ccpDialog_cornerRadius, R.attr.ccpDialog_fastScroller_bubbleColor, R.attr.ccpDialog_fastScroller_bubbleTextAppearance, R.attr.ccpDialog_fastScroller_handleColor, R.attr.ccpDialog_initialScrollToSelection, R.attr.ccpDialog_keyboardAutoPopup, R.attr.ccpDialog_rippleEnable, R.attr.ccpDialog_searchEditTextTint, R.attr.ccpDialog_showCloseIcon, R.attr.ccpDialog_showFastScroller, R.attr.ccpDialog_showFlag, R.attr.ccpDialog_showNameCode, R.attr.ccpDialog_showPhoneCode, R.attr.ccpDialog_showTitle, R.attr.ccpDialog_textColor, R.attr.ccp_areaCodeDetectedCountry, R.attr.ccp_arrowColor, R.attr.ccp_arrowSize, R.attr.ccp_autoDetectCountry, R.attr.ccp_autoDetectLanguage, R.attr.ccp_autoFormatNumber, R.attr.ccp_clickable, R.attr.ccp_contentColor, R.attr.ccp_countryAutoDetectionPref, R.attr.ccp_countryPreference, R.attr.ccp_customMasterCountries, R.attr.ccp_defaultLanguage, R.attr.ccp_defaultNameCode, R.attr.ccp_defaultPhoneCode, R.attr.ccp_excludedCountries, R.attr.ccp_flagBorderColor, R.attr.ccp_hintExampleNumber, R.attr.ccp_hintExampleNumberType, R.attr.ccp_internationalFormattingOnly, R.attr.ccp_padding, R.attr.ccp_rememberLastSelection, R.attr.ccp_rippleEnable, R.attr.ccp_selectionMemoryTag, R.attr.ccp_showArrow, R.attr.ccp_showFlag, R.attr.ccp_showFullName, R.attr.ccp_showNameCode, R.attr.ccp_showPhoneCode, R.attr.ccp_textGravity, R.attr.ccp_textSize, R.attr.ccp_useDummyEmojiForPreview, R.attr.ccp_useFlagEmoji};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3887c = {R.attr.fastscroll__bubbleColor, R.attr.fastscroll__bubbleTextAppearance, R.attr.fastscroll__handleColor};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3888d = {R.attr.cameraAudio, R.attr.cameraAudioBitRate, R.attr.cameraAutoFocusResetDelay, R.attr.cameraExperimental, R.attr.cameraFacing, R.attr.cameraFlash, R.attr.cameraGestureLongTap, R.attr.cameraGesturePinch, R.attr.cameraGestureScrollHorizontal, R.attr.cameraGestureScrollVertical, R.attr.cameraGestureTap, R.attr.cameraGrid, R.attr.cameraGridColor, R.attr.cameraHdr, R.attr.cameraMode, R.attr.cameraPictureSizeAspectRatio, R.attr.cameraPictureSizeBiggest, R.attr.cameraPictureSizeMaxArea, R.attr.cameraPictureSizeMaxHeight, R.attr.cameraPictureSizeMaxWidth, R.attr.cameraPictureSizeMinArea, R.attr.cameraPictureSizeMinHeight, R.attr.cameraPictureSizeMinWidth, R.attr.cameraPictureSizeSmallest, R.attr.cameraPlaySounds, R.attr.cameraPreview, R.attr.cameraSnapshotMaxHeight, R.attr.cameraSnapshotMaxWidth, R.attr.cameraVideoBitRate, R.attr.cameraVideoCodec, R.attr.cameraVideoMaxDuration, R.attr.cameraVideoMaxSize, R.attr.cameraVideoSizeAspectRatio, R.attr.cameraVideoSizeBiggest, R.attr.cameraVideoSizeMaxArea, R.attr.cameraVideoSizeMaxHeight, R.attr.cameraVideoSizeMaxWidth, R.attr.cameraVideoSizeMinArea, R.attr.cameraVideoSizeMinHeight, R.attr.cameraVideoSizeMinWidth, R.attr.cameraVideoSizeSmallest, R.attr.cameraWhiteBalance};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3889e = {R.attr.cropAspectRatioX, R.attr.cropAspectRatioY, R.attr.cropAutoZoomEnabled, R.attr.cropBackgroundColor, R.attr.cropBorderCornerColor, R.attr.cropBorderCornerLength, R.attr.cropBorderCornerOffset, R.attr.cropBorderCornerThickness, R.attr.cropBorderLineColor, R.attr.cropBorderLineThickness, R.attr.cropFixAspectRatio, R.attr.cropFlipHorizontally, R.attr.cropFlipVertically, R.attr.cropGuidelines, R.attr.cropGuidelinesColor, R.attr.cropGuidelinesThickness, R.attr.cropInitialCropWindowPaddingRatio, R.attr.cropMaxCropResultHeightPX, R.attr.cropMaxCropResultWidthPX, R.attr.cropMaxZoom, R.attr.cropMinCropResultHeightPX, R.attr.cropMinCropResultWidthPX, R.attr.cropMinCropWindowHeight, R.attr.cropMinCropWindowWidth, R.attr.cropMultiTouchEnabled, R.attr.cropSaveBitmapToInstanceState, R.attr.cropScaleType, R.attr.cropShape, R.attr.cropShowCropOverlay, R.attr.cropShowProgressBar, R.attr.cropSnapRadius, R.attr.cropTouchRadius};

    public /* synthetic */ c() {
    }

    public static final long f(float f10, float f11) {
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f11)) & 4294967295L) | (floatToIntBits << 32);
        int i8 = h0.g.f9088d;
        return floatToIntBits2;
    }

    public static final u h(f fVar) {
        dg.f fVar2;
        f g10;
        cg.f.f4023g.getClass();
        int i8 = f.a.f4025b;
        if (1 >= i8) {
            i8 = 1;
        }
        int i10 = i8 - 1;
        boolean z10 = fVar instanceof dg.f;
        e eVar = e.f4020a;
        if (!z10 || (g10 = fVar2.g()) == null) {
            return new u(i10, jf.g.f10014a, eVar, fVar);
        }
        e eVar2 = (fVar2 = (dg.f) fVar).f7539c;
        int i11 = fVar2.f7538b;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            i10 = i11;
        } else if (eVar2 != eVar || i11 == 0) {
            i10 = 0;
        }
        return new u(i10, fVar2.f7537a, eVar2, g10);
    }

    public static SimpleDateFormat i(int i8, int i10) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i8 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i8 == 1) {
            str = "MMMM d, yyyy";
        } else if (i8 == 2) {
            str = "MMM d, yyyy";
        } else if (i8 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(q.a("Unknown DateFormat style: ", i8));
        }
        sb2.append(str);
        sb2.append(" ");
        if (i10 == 0 || i10 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i10 == 2) {
            str2 = "h:mm:ss a";
        } else if (i10 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(q.a("Unknown DateFormat style: ", i10));
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    public static final f2 j(g0 g0Var, jf.f fVar, kotlinx.coroutines.flow.f fVar2, j0 j0Var, t0 t0Var, Object obj) {
        int i8 = j.a(t0Var, t0.a.f10645a) ? 1 : 4;
        c0 c0Var = new c0(t0Var, fVar2, j0Var, obj, (jf.d<? super c0>) null);
        jf.f b10 = a0.b(g0Var, fVar);
        f2 w1Var = i8 == 2 ? new w1(b10, c0Var) : new f2(b10, true);
        w1Var.C0(i8, w1Var, c0Var);
        return w1Var;
    }

    public static void k(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Animator animator = (Animator) arrayList.get(i8);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final h l(o.g gVar) {
        j.g(gVar, "receiver$0");
        return new h(gVar);
    }

    public static /* synthetic */ boolean m(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static /* synthetic */ boolean n(String str, Object obj) {
        return str == obj || (str != null && str.equals(obj));
    }

    public boolean a(Object obj, File file, p4.h hVar) {
        try {
            a.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    public void c(f0 f0Var, jg.c0 c0Var) {
    }

    public void d() {
    }

    public Object g() {
        return new ArrayDeque();
    }

    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().i());
    }

    public /* synthetic */ c(int i8) {
    }
}
