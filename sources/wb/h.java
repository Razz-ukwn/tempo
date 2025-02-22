package wb;

import android.os.Parcelable;
import com.lassi.presentation.cameraview.controls.a;
import ub.x;

public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f16672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f16673b = 0.0f;

    public h(float f10) {
        this.f16672a = f10;
    }

    public final boolean a(x xVar) {
        Parcelable.Creator<a> creator = a.CREATOR;
        float a10 = a.C0082a.a(xVar.f15991a, xVar.f15992b).a();
        float f10 = this.f16672a;
        float f11 = this.f16673b;
        return a10 >= f10 - f11 && a10 <= f10 + f11;
    }
}
