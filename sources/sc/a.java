package sc;

import ag.m;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import b3.f0;
import cb.b;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.location.CalimCoinLoacationBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureBottomSheet;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel;
import com.quickkonnect.silencio.ui.menu.history.detail.HistoryDetailsFragment;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import com.quickkonnect.silencio.ui.tabs.map.popup.MapPopupBottomSheet;
import ed.q;
import gd.c;
import java.util.List;
import jf.d;
import jf.f;
import sf.j;
import zd.h;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14905b;

    public /* synthetic */ a(Object obj, int i8) {
        this.f14904a = i8;
        this.f14905b = obj;
    }

    public final void onClick(View view) {
        int i8 = this.f14904a;
        Object obj = this.f14905b;
        switch (i8) {
            case 0:
                CodeBottomSheet codeBottomSheet = (CodeBottomSheet) obj;
                int i10 = CodeBottomSheet.U0;
                j.f(codeBottomSheet, "this$0");
                m.c(codeBottomSheet).l(R.id.action_codeBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 1:
                LoginBottomSheet loginBottomSheet = (LoginBottomSheet) obj;
                int i11 = LoginBottomSheet.W0;
                j.f(loginBottomSheet, "this$0");
                m.c(loginBottomSheet).o();
                return;
            case 2:
                RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = (RegisterOtpVerificationBottomSheet) obj;
                int i12 = RegisterOtpVerificationBottomSheet.V0;
                j.f(registerOtpVerificationBottomSheet, "this$0");
                m.c(registerOtpVerificationBottomSheet).o();
                return;
            case 3:
                RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = (RegisterEmailOtpVerificationBottomSheet) obj;
                int i13 = RegisterEmailOtpVerificationBottomSheet.W0;
                j.f(registerEmailOtpVerificationBottomSheet, "this$0");
                m.c(registerEmailOtpVerificationBottomSheet).o();
                return;
            case 4:
                PhoneNumberBottomSheet phoneNumberBottomSheet = (PhoneNumberBottomSheet) obj;
                int i14 = PhoneNumberBottomSheet.V0;
                j.f(phoneNumberBottomSheet, "this$0");
                m.c(phoneNumberBottomSheet).l(R.id.action_phoneNumberBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 5:
                RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) obj;
                int i15 = RegisterBottomSheet.X0;
                j.f(registerBottomSheet, "this$0");
                m.c(registerBottomSheet).l(R.id.action_registerBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 6:
                ResetPasswordBottomSheet resetPasswordBottomSheet = (ResetPasswordBottomSheet) obj;
                int i16 = ResetPasswordBottomSheet.V0;
                j.f(resetPasswordBottomSheet, "this$0");
                m.c(resetPasswordBottomSheet).o();
                return;
            case 7:
                VerificationBottomSheet verificationBottomSheet = (VerificationBottomSheet) obj;
                int i17 = VerificationBottomSheet.W0;
                j.f(verificationBottomSheet, "this$0");
                if (verificationBottomSheet.T0) {
                    VerificationViewModel w02 = verificationBottomSheet.w0();
                    VerifyNumberRequestModel verifyNumberRequestModel = verificationBottomSheet.v0().f7965a;
                    String str = verificationBottomSheet.v0().f7966b;
                    w02.getClass();
                    j.f(verifyNumberRequestModel, "verifyNumberRequestModel");
                    j.f(str, "registrationType");
                    b.D(gc.b.o(w02), (f.b) null, 0, new q(w02, str, verifyNumberRequestModel, (d<? super q>) null), 3);
                    return;
                }
                return;
            case 8:
                CalimCoinLoacationBottomSheet calimCoinLoacationBottomSheet = (CalimCoinLoacationBottomSheet) obj;
                int i18 = CalimCoinLoacationBottomSheet.N0;
                j.f(calimCoinLoacationBottomSheet, "this$0");
                b3.m c3 = m.c(calimCoinLoacationBottomSheet);
                ClaimCoinRequestModel copy$default = ClaimCoinRequestModel.copy$default(((gd.a) calimCoinLoacationBottomSheet.M0.getValue()).f8951a, (String) null, "outdoors", (String) null, (List) null, (Double) null, 29, (Object) null);
                j.f(copy$default, "claimCoin");
                c3.n(new c(copy$default));
                return;
            case 9:
                ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet = (ClaimCoinSourceOutdoorBottomSheet) obj;
                int i19 = ClaimCoinSourceOutdoorBottomSheet.U0;
                j.f(claimCoinSourceOutdoorBottomSheet, "this$0");
                m.c(claimCoinSourceOutdoorBottomSheet).o();
                return;
            case 10:
                HowToMeasureBottomSheet howToMeasureBottomSheet = (HowToMeasureBottomSheet) obj;
                int i20 = HowToMeasureBottomSheet.S0;
                j.f(howToMeasureBottomSheet, "this$0");
                if (((Boolean) ((HowToMeasureViewModel) howToMeasureBottomSheet.R0.getValue()).f6987g.getValue()).booleanValue()) {
                    SharedPreferences.Editor editor = h.f17951b;
                    if (editor != null) {
                        editor.putBoolean("HOW_TO_MEASURE", true);
                        SharedPreferences.Editor editor2 = h.f17951b;
                        if (editor2 != null) {
                            editor2.commit();
                        } else {
                            j.l("editor");
                            throw null;
                        }
                    } else {
                        j.l("editor");
                        throw null;
                    }
                }
                m.c(howToMeasureBottomSheet).l(R.id.action_howToMeasureBottomSheet_to_measuringBottomSheet, new Bundle(), (f0) null);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                HistoryDetailsFragment historyDetailsFragment = (HistoryDetailsFragment) obj;
                int i21 = HistoryDetailsFragment.C0;
                j.f(historyDetailsFragment, "this$0");
                m.c(historyDetailsFragment).o();
                return;
            case 12:
                ProfileFragment profileFragment = (ProfileFragment) obj;
                int i22 = ProfileFragment.I0;
                j.f(profileFragment, "this$0");
                m.c(profileFragment).l(R.id.action_profileFragment_to_changePasswordBottomSheet, new Bundle(), (f0) null);
                return;
            case 13:
                androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) obj;
                int i23 = ProfileFragment.I0;
                j.f(bVar, "$dialog");
                bVar.dismiss();
                return;
            case 14:
                MapFragment mapFragment = (MapFragment) obj;
                int i24 = MapFragment.B0;
                j.f(mapFragment, "this$0");
                m.c(mapFragment).l(R.id.action_mapFragment_to_infoBottomSheet, new Bundle(), (f0) null);
                return;
            default:
                MapPopupBottomSheet mapPopupBottomSheet = (MapPopupBottomSheet) obj;
                int i25 = MapPopupBottomSheet.N0;
                j.f(mapPopupBottomSheet, "this$0");
                if (((Boolean) ((wd.b) mapPopupBottomSheet.M0.getValue()).f16705g.getValue()).booleanValue()) {
                    SharedPreferences.Editor editor3 = h.f17951b;
                    if (editor3 != null) {
                        editor3.putBoolean("DONT_SHOW_MAP_LIMIT_POPUP", true);
                        SharedPreferences.Editor editor4 = h.f17951b;
                        if (editor4 != null) {
                            editor4.commit();
                        } else {
                            j.l("editor");
                            throw null;
                        }
                    } else {
                        j.l("editor");
                        throw null;
                    }
                }
                m.c(mapPopupBottomSheet).o();
                return;
        }
    }
}
