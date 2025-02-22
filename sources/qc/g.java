package qc;

import android.content.Intent;
import android.os.Parcelable;
import bh.a;
import cb.b;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import com.quickkonnect.silencio.models.request.measure.VoiceRecordingSamples;
import com.quickkonnect.silencio.service.measuring.MeasuringService;
import ff.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.service.measuring.MeasuringService$start$2", f = "MeasuringService.kt", l = {}, m = "invokeSuspend")
public final class g extends i implements p<Double, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ double f13496a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringService f13497b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(MeasuringService measuringService, d<? super g> dVar) {
        super(2, dVar);
        this.f13497b = measuringService;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        g gVar = new g(this.f13497b, dVar);
        gVar.f13496a = ((Number) obj).doubleValue();
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(Double.valueOf(((Number) obj).doubleValue()), (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        List<String> coordinates;
        b.J(obj);
        double d10 = this.f13496a;
        boolean z10 = 20.0d <= d10 && d10 <= 120.0d;
        double d11 = 0.0d;
        MeasuringService measuringService = this.f13497b;
        if (z10) {
            Date date = new Date();
            measuringService.C = d10;
            StartLocation startLocation = measuringService.D;
            if (!(startLocation == null || (coordinates = startLocation.getCoordinates()) == null)) {
                ArrayList arrayList = measuringService.F;
                VoiceRecordingSamples voiceRecordingSamples = r1;
                VoiceRecordingSamples voiceRecordingSamples2 = new VoiceRecordingSamples(new StartLocation("Point", coordinates, (Float) null, 4, (sf.e) null), d10, date.getTime(), (Float) null, 8, (sf.e) null);
                arrayList.add(voiceRecordingSamples);
            }
        } else {
            measuringService.C = 0.0d;
        }
        if (measuringService.F.size() >= 1255) {
            measuringService.stopForeground(1);
            measuringService.stopSelf();
        }
        Double d12 = measuringService.E;
        if ((d12 != null ? d12.doubleValue() : 0.0d) >= 8.33d) {
            if (measuringService.G == null) {
                measuringService.G = new Long(System.currentTimeMillis());
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l10 = measuringService.G;
            if (currentTimeMillis - (l10 != null ? l10.longValue() : System.currentTimeMillis()) > 15000 && !measuringService.H) {
                measuringService.H = true;
                measuringService.stopForeground(1);
                measuringService.stopSelf();
            }
        } else {
            measuringService.G = null;
        }
        a.C0053a aVar = a.f3654a;
        StringBuilder sb2 = new StringBuilder("=== speed limit seconds ");
        long currentTimeMillis2 = System.currentTimeMillis();
        Long l11 = measuringService.G;
        sb2.append(currentTimeMillis2 - (l11 != null ? l11.longValue() : System.currentTimeMillis()));
        aVar.b(sb2.toString(), new Object[0]);
        Intent intent = new Intent("RECORD");
        intent.putExtra("DB", measuringService.C);
        intent.putExtra("POINTS", (Parcelable[]) measuringService.F.toArray(new VoiceRecordingSamples[0]));
        Double d13 = measuringService.E;
        if (d13 != null) {
            d11 = d13.doubleValue();
        }
        intent.putExtra("SPEED", d11);
        intent.putExtra("SPEED_CAP_REACHED", measuringService.H);
        a3.a aVar2 = measuringService.f6686d;
        if (aVar2 != null) {
            aVar2.c(intent);
        }
        return m.f8717a;
    }
}
