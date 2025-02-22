package md;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import b3.x;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import java.io.Serializable;
import java.util.Arrays;
import q.n;
import sf.j;

public final class v0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final StopRecordingRequestModel f11438a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11439b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11440c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f11441d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11442e = R.id.action_measuringBottomSheet_to_resultBottomSheet;

    public v0(StopRecordingRequestModel stopRecordingRequestModel, float f10, String str, float[] fArr) {
        this.f11438a = stopRecordingRequestModel;
        this.f11439b = f10;
        this.f11440c = str;
        this.f11441d = fArr;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<StopRecordingRequestModel> cls = StopRecordingRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        StopRecordingRequestModel stopRecordingRequestModel = this.f11438a;
        if (isAssignableFrom) {
            j.d(stopRecordingRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("measureData", stopRecordingRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(stopRecordingRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("measureData", (Serializable) stopRecordingRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putFloat("earnedCoins", this.f11439b);
        bundle.putString("screenShot", this.f11440c);
        bundle.putFloatArray("decibelList", this.f11441d);
        return bundle;
    }

    public final int b() {
        return this.f11442e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return j.a(this.f11438a, v0Var.f11438a) && Float.compare(this.f11439b, v0Var.f11439b) == 0 && j.a(this.f11440c, v0Var.f11440c) && j.a(this.f11441d, v0Var.f11441d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11441d) + x.a(this.f11440c, n.a(this.f11439b, this.f11438a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ActionMeasuringBottomSheetToResultBottomSheet(measureData=" + this.f11438a + ", earnedCoins=" + this.f11439b + ", screenShot=" + this.f11440c + ", decibelList=" + Arrays.toString(this.f11441d) + ')';
    }
}
