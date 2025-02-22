package qc;

import android.location.Location;
import cb.b;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import com.quickkonnect.silencio.service.measuring.MeasuringService;
import ff.m;
import jf.d;
import lf.e;
import rf.p;

@e(c = "com.quickkonnect.silencio.service.measuring.MeasuringService$start$4", f = "MeasuringService.kt", l = {}, m = "invokeSuspend")
public final class i extends lf.i implements p<Location, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f13499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringService f13500b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(MeasuringService measuringService, d<? super i> dVar) {
        super(2, dVar);
        this.f13500b = measuringService;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        i iVar = new i(this.f13500b, dVar);
        iVar.f13499a = obj;
        return iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((Location) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        Location location = (Location) this.f13499a;
        Double d10 = new Double(((double) location.getSpeed()) - ((double) location.getSpeedAccuracyMetersPerSecond()));
        MeasuringService measuringService = this.f13500b;
        measuringService.E = d10;
        measuringService.D = new StartLocation("Point", cb.d.P(String.valueOf(location.getLongitude()), String.valueOf(location.getLatitude())), (Float) null, 4, (sf.e) null);
        return m.f8717a;
    }
}
