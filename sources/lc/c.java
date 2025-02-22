package lc;

import ah.f;
import ah.t;
import com.quickkonnect.silencio.models.response.menu.HistoryResponse;
import com.quickkonnect.silencio.models.response.menu.MeasurementResponse;
import jf.d;
import yg.b0;

public interface c {
    @f("user/audio/measurement")
    Object a(d<? super b0<MeasurementResponse>> dVar);

    @f("user/audio/history")
    Object b(@t("pageNo") int i8, @t("pageLimit") int i10, d<? super b0<HistoryResponse>> dVar);
}
