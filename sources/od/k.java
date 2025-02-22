package od;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import b3.x;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import java.io.Serializable;
import java.util.Arrays;
import q.n;
import sf.j;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public final StopRecordingRequestModel f12303a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12304b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12305c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f12306d;

    public k(StopRecordingRequestModel stopRecordingRequestModel, float f10, String str, float[] fArr) {
        this.f12303a = stopRecordingRequestModel;
        this.f12304b = f10;
        this.f12305c = str;
        this.f12306d = fArr;
    }

    public static final k fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(k.class.getClassLoader());
        if (bundle.containsKey("measureData")) {
            Class<StopRecordingRequestModel> cls = StopRecordingRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                StopRecordingRequestModel stopRecordingRequestModel = (StopRecordingRequestModel) bundle.get("measureData");
                if (stopRecordingRequestModel == null) {
                    throw new IllegalArgumentException("Argument \"measureData\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("earnedCoins")) {
                    float f10 = bundle.getFloat("earnedCoins");
                    if (bundle.containsKey("screenShot")) {
                        String string = bundle.getString("screenShot");
                        if (string == null) {
                            throw new IllegalArgumentException("Argument \"screenShot\" is marked as non-null but was passed a null value.");
                        } else if (bundle.containsKey("decibelList")) {
                            float[] floatArray = bundle.getFloatArray("decibelList");
                            if (floatArray != null) {
                                return new k(stopRecordingRequestModel, f10, string, floatArray);
                            }
                            throw new IllegalArgumentException("Argument \"decibelList\" is marked as non-null but was passed a null value.");
                        } else {
                            throw new IllegalArgumentException("Required argument \"decibelList\" is missing and does not have an android:defaultValue");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"screenShot\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    throw new IllegalArgumentException("Required argument \"earnedCoins\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
        } else {
            throw new IllegalArgumentException("Required argument \"measureData\" is missing and does not have an android:defaultValue");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return j.a(this.f12303a, kVar.f12303a) && Float.compare(this.f12304b, kVar.f12304b) == 0 && j.a(this.f12305c, kVar.f12305c) && j.a(this.f12306d, kVar.f12306d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12306d) + x.a(this.f12305c, n.a(this.f12304b, this.f12303a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ResultBottomSheetArgs(measureData=" + this.f12303a + ", earnedCoins=" + this.f12304b + ", screenShot=" + this.f12305c + ", decibelList=" + Arrays.toString(this.f12306d) + ')';
    }
}
