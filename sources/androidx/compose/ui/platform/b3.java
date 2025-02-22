package androidx.compose.ui.platform;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.q;
import cg.e;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.quickkonnect.silencio.R;
import j2.a;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.internal.v;
import q7.e2;
import q7.g2;

public final class b3 implements a, e2, Continuation {
    public static final /* synthetic */ b3 B = new b3();
    public static final int[] C = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};
    public static final int[] D = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};
    public static final int[] E = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
    public static final int[] F = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
    public static final int[] G = {16843173, 16844052};
    public static final /* synthetic */ b3 H = new b3();

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1261a = {16842755};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1262b = {16842755};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1263c = {R.attr.defaultNavHost};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1264d = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    /* renamed from: e  reason: collision with root package name */
    public static final v f1265e = new v("NO_VALUE");

    public static final p0 a(int i8, int i10, e eVar) {
        boolean z10 = true;
        if (i8 >= 0) {
            if (i10 >= 0) {
                if (i8 <= 0 && i10 <= 0 && eVar != e.f4020a) {
                    z10 = false;
                }
                if (z10) {
                    int i11 = i10 + i8;
                    if (i11 < 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    return new p0(i8, i11, eVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + eVar).toString());
            }
            throw new IllegalArgumentException(q.a("extraBufferCapacity cannot be negative, but was ", i10).toString());
        }
        throw new IllegalArgumentException(q.a("replay cannot be negative, but was ", i8).toString());
    }

    public static int b(int i8) {
        if (i8 != 1) {
            return i8 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    public Object zza() {
        List list = g2.f13022a;
        return Integer.valueOf((int) aa.f5157b.zza().m());
    }
}
