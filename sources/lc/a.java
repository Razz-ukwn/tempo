package lc;

import ah.f;
import ah.n;
import ah.o;
import com.quickkonnect.silencio.models.request.UpdateCheckRequestModel;
import com.quickkonnect.silencio.models.request.auth.ChangePasswordRequestModel;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.request.auth.LoginWithGoogleRequestModel;
import com.quickkonnect.silencio.models.request.auth.LoginWithPhoneRequestModel;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel;
import com.quickkonnect.silencio.models.request.auth.ResetPasswordRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyEmailRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyInviteCodeRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyNickNameRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.UpdateCheckResponse;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.NickNameResponse;
import com.quickkonnect.silencio.models.response.auth.VerifyInviteCodeResponse;
import jf.d;
import yg.b0;

public interface a {
    @f("user/wallet/isOnline")
    Object a(d<? super b0<BaseResponse>> dVar);

    @o("user/auth/verifycode")
    Object b(@ah.a VerifyNumberRequestModel verifyNumberRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/resetPassword")
    Object c(@ah.a VerifyNumberRequestModel verifyNumberRequestModel, d<? super b0<BaseResponse>> dVar);

    @o("user/auth/loginUser-v2")
    Object d(@ah.a LoginWithPhoneRequestModel loginWithPhoneRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/forgotPassword")
    Object e(@ah.a ResetPasswordRequestModel resetPasswordRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/registerUserWithPhone-v2")
    Object f(@ah.a RegisterUserRequestModel registerUserRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("admin/version/check")
    Object g(@ah.a UpdateCheckRequestModel updateCheckRequestModel, d<? super b0<UpdateCheckResponse>> dVar);

    @o("user/auth/verify-email-code")
    Object h(@ah.a EmailRequestModel emailRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/verifyInviteCode")
    Object i(@ah.a VerifyInviteCodeRequestModel verifyInviteCodeRequestModel, d<? super b0<VerifyInviteCodeResponse>> dVar);

    @n("user/auth/deleteAccount")
    Object j(d<? super b0<BaseResponse>> dVar);

    @n("user/auth/editProfile")
    Object k(@ah.a jg.b0 b0Var, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/verifyResetPasswordCode")
    Object l(@ah.a VerifyNumberRequestModel verifyNumberRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/verifyEmail")
    Object m(@ah.a RegisterWithGoogleRequestModel registerWithGoogleRequestModel, d<? super b0<BaseResponse>> dVar);

    @o("user/auth/changePassword")
    Object n(@ah.a ChangePasswordRequestModel changePasswordRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/loginWithGoogle")
    Object o(@ah.a LoginWithGoogleRequestModel loginWithGoogleRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/nickNameVerify")
    Object p(@ah.a VerifyNickNameRequestModel verifyNickNameRequestModel, d<? super b0<NickNameResponse>> dVar);

    @o("user/auth/reset-password-email")
    Object q(@ah.a EmailRequestModel emailRequestModel, d<? super b0<BaseResponse>> dVar);

    @o("user/auth/validate-email")
    Object r(@ah.a EmailRequestModel emailRequestModel, d<? super b0<BaseResponse>> dVar);

    @o("user/auth/registerUserWithGoogle")
    Object s(@ah.a RegisterWithGoogleRequestModel registerWithGoogleRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/validatePhone-v2")
    Object t(@ah.a VerifyNumberRequestModel verifyNumberRequestModel, d<? super b0<BaseResponse>> dVar);

    @o("user/verify-reset-password-code-email")
    Object u(@ah.a VerifyEmailRequestModel verifyEmailRequestModel, d<? super b0<LoginWithPhoneResponseModel>> dVar);

    @o("user/auth/validatePhone-v2")
    Object v(@ah.a VerifyNumberRequestModel verifyNumberRequestModel, d<? super b0<BaseResponse>> dVar);
}
