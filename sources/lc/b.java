package lc;

import ah.a;
import ah.o;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.request.measure.MeasureStartRecordingRequestModel;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import jf.d;
import yg.b0;

public interface b {
    @o("user/audio/stop-v2")
    Object a(@a StopRecordingRequestModel stopRecordingRequestModel, d<? super b0<StopRecordingResponseModel>> dVar);

    @o("user/audio/start")
    Object b(@a MeasureStartRecordingRequestModel measureStartRecordingRequestModel, d<? super b0<StartRecordingResponseModel>> dVar);

    @o("user/audio/screenshot")
    Object c(@a jg.b0 b0Var, d<? super b0<BaseResponse>> dVar);

    @o("user/question/survey-v2")
    Object d(@a ClaimCoinRequestModel claimCoinRequestModel, d<? super b0<StopRecordingResponseModel>> dVar);
}
