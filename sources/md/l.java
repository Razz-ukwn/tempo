package md;

import com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import sf.k;
import zd.g;

public final class l extends k implements rf.l<g<StartRecordingResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11411a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11411a = measuringBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r2 = zf.i.o0(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            zd.g r12 = (zd.g) r12
            boolean r0 = r12 instanceof zd.g.a
            r1 = 0
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet r10 = r11.f11411a
            if (r0 == 0) goto L_0x0038
            java.lang.String r4 = r12.f17949b
            if (r4 == 0) goto L_0x002c
            android.content.Context r12 = r10.e0()
            r0 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r3 = r12.getString(r0)
            java.lang.String r12 = "getString(R.string.alert_title)"
            sf.j.e(r3, r12)
            java.lang.String r5 = "OK"
            r6 = 0
            r7 = 0
            md.i r8 = new md.i
            r8.<init>(r10)
            md.j r9 = md.j.f11406a
            r2 = r10
            zd.d.d(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x002c:
            nc.i0 r12 = r10.Q0
            sf.j.c(r12)
            com.google.android.material.button.MaterialButton r12 = r12.f11706c
            r12.setEnabled(r1)
            goto L_0x00c0
        L_0x0038:
            boolean r0 = r12 instanceof zd.g.b
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r12 instanceof zd.g.c
            if (r0 == 0) goto L_0x004c
            nc.i0 r12 = r10.Q0
            sf.j.c(r12)
            com.google.android.material.button.MaterialButton r12 = r12.f11706c
            r12.setEnabled(r1)
            goto L_0x00c0
        L_0x004c:
            boolean r0 = r12 instanceof zd.g.d
            if (r0 == 0) goto L_0x00c0
            T r0 = r12.f17948a
            com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel r0 = (com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel) r0
            if (r0 == 0) goto L_0x0075
            com.quickkonnect.silencio.models.response.measure.StartRecordingModel r0 = r0.getData()
            if (r0 == 0) goto L_0x0075
            com.quickkonnect.silencio.models.response.measure.StartRecordingCreatedDataModel r0 = r0.getCreatedData()
            if (r0 == 0) goto L_0x0075
            int r2 = com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.f6988h1
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel r2 = r10.B0()
            kotlinx.coroutines.flow.y0 r2 = r2.f7028y
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = ""
        L_0x0072:
            r2.setValue(r0)
        L_0x0075:
            T r12 = r12.f17948a
            com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel r12 = (com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel) r12
            if (r12 == 0) goto L_0x00b2
            com.quickkonnect.silencio.models.response.measure.StartRecordingModel r12 = r12.getData()
            if (r12 == 0) goto L_0x00b2
            int r0 = com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.f6988h1
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel r0 = r10.B0()
            java.lang.String r2 = r12.getCoinsPerMinute()
            r3 = 0
            if (r2 == 0) goto L_0x0099
            java.lang.Float r2 = zf.i.o0(r2)
            if (r2 == 0) goto L_0x0099
            float r2 = r2.floatValue()
            goto L_0x009a
        L_0x0099:
            r2 = r3
        L_0x009a:
            r0.A = r2
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel r0 = r10.B0()
            java.lang.String r12 = r12.getCoinsPerSecond()
            if (r12 == 0) goto L_0x00b0
            java.lang.Float r12 = zf.i.o0(r12)
            if (r12 == 0) goto L_0x00b0
            float r3 = r12.floatValue()
        L_0x00b0:
            r0.B = r3
        L_0x00b2:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r12 = cb.d.I(r10)
            md.k r0 = new md.k
            r2 = 0
            r0.<init>(r10, r2)
            r3 = 3
            cb.b.D(r12, r2, r1, r0, r3)
        L_0x00c0:
            ff.m r12 = ff.m.f8717a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: md.l.invoke(java.lang.Object):java.lang.Object");
    }
}
