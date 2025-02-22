package sc;

import ad.o;
import ag.m;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.p;
import b3.f0;
import b3.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.f2;
import com.lassi.presentation.cameraview.controls.a;
import com.lassi.presentation.cropper.CropImageView;
import com.lassi.presentation.mediadirectory.LassiMediaPickerActivity;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.request.auth.ResetPasswordRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel;
import com.quickkonnect.silencio.ui.menu.history.HistoryFragment;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.tabs.shop.ShopFragment;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel;
import dd.h;
import ed.l;
import gf.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.d;
import jf.f;
import md.d0;
import md.e0;
import q6.a;
import sf.e;
import sf.j;
import t.w2;
import t1.a;
import zc.c;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f14907b;

    public /* synthetic */ b(int i8, p pVar) {
        this.f14906a = i8;
        this.f14907b = pVar;
    }

    public final void onClick(View view) {
        int i8 = this.f14906a;
        boolean z10 = true;
        p pVar = this.f14907b;
        switch (i8) {
            case 0:
                CodeBottomSheet codeBottomSheet = (CodeBottomSheet) pVar;
                int i10 = CodeBottomSheet.U0;
                j.f(codeBottomSheet, "this$0");
                zd.j.a(codeBottomSheet.d0(), "https://discord.gg/AZzXMgpJdt");
                return;
            case 1:
                ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = (ForgotPasswordEmailBottomSheet) pVar;
                int i11 = ForgotPasswordEmailBottomSheet.V0;
                j.f(forgotPasswordEmailBottomSheet, "this$0");
                m.c(forgotPasswordEmailBottomSheet).o();
                return;
            case 2:
                LoginBottomSheet loginBottomSheet = (LoginBottomSheet) pVar;
                int i12 = LoginBottomSheet.W0;
                j.f(loginBottomSheet, "this$0");
                m.c(loginBottomSheet).l(R.id.action_loginBottomSheet_to_forgotPasswordBottomSheet, new Bundle(), (f0) null);
                return;
            case 3:
                RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = (RegisterOtpVerificationBottomSheet) pVar;
                int i13 = RegisterOtpVerificationBottomSheet.V0;
                j.f(registerOtpVerificationBottomSheet, "this$0");
                if (registerOtpVerificationBottomSheet.T0) {
                    RegisterOtpVerficationViewModel v02 = registerOtpVerificationBottomSheet.v0();
                    String countryCode = registerOtpVerificationBottomSheet.u0().f17937a.getCountryCode();
                    String str = countryCode == null ? "" : countryCode;
                    String phone = registerOtpVerificationBottomSheet.u0().f17937a.getPhone();
                    VerifyNumberRequestModel verifyNumberRequestModel = new VerifyNumberRequestModel(str, phone == null ? "" : phone, (String) null, (String) null, (String) null, (String) null, 60, (e) null);
                    v02.getClass();
                    cb.b.D(gc.b.o(v02), (f.b) null, 0, new c(v02, verifyNumberRequestModel, (d<? super c>) null), 3);
                    return;
                }
                return;
            case 4:
                RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = (RegisterEmailOtpVerificationBottomSheet) pVar;
                int i14 = RegisterEmailOtpVerificationBottomSheet.W0;
                j.f(registerEmailOtpVerificationBottomSheet, "this$0");
                if (registerEmailOtpVerificationBottomSheet.T0) {
                    androidx.appcompat.app.b bVar = registerEmailOtpVerificationBottomSheet.U0;
                    if (bVar != null) {
                        bVar.show();
                        RegisterEmailOtpVerficationViewModel v03 = registerEmailOtpVerificationBottomSheet.v0();
                        EmailRequestModel emailRequestModel = new EmailRequestModel(((o) registerEmailOtpVerificationBottomSheet.S0.getValue()).f315a.getEmail(), (String) null, (String) null, (String) null, 14, (e) null);
                        v03.getClass();
                        cb.b.D(gc.b.o(v03), (f.b) null, 0, new ad.c(v03, emailRequestModel, (d<? super ad.c>) null), 3);
                        return;
                    }
                    j.l("loadingAlert");
                    throw null;
                }
                return;
            case 5:
                RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) pVar;
                int i15 = RegisterBottomSheet.X0;
                j.f(registerBottomSheet, "this$0");
                a aVar = registerBottomSheet.T0;
                if (aVar != null) {
                    registerBottomSheet.startActivityForResult(aVar.d(), registerBottomSheet.U0);
                    return;
                } else {
                    j.l("mGoogleSignInClient");
                    throw null;
                }
            case 6:
                ResetPasswordBottomSheet resetPasswordBottomSheet = (ResetPasswordBottomSheet) pVar;
                int i16 = ResetPasswordBottomSheet.V0;
                j.f(resetPasswordBottomSheet, "this$0");
                if (resetPasswordBottomSheet.U0) {
                    ResetPasswordViewModel u02 = resetPasswordBottomSheet.u0();
                    ResetPasswordRequestModel resetPasswordRequestModel = new ResetPasswordRequestModel(((dd.f) resetPasswordBottomSheet.S0.getValue()).f7516a, (String) resetPasswordBottomSheet.u0().f6877h.getValue(), (String) resetPasswordBottomSheet.u0().f6878i.getValue());
                    u02.getClass();
                    cb.b.D(gc.b.o(u02), (f.b) null, 0, new h(u02, resetPasswordRequestModel, (d<? super h>) null), 3);
                    return;
                }
                return;
            case 7:
                VerificationBottomSheet verificationBottomSheet = (VerificationBottomSheet) pVar;
                int i17 = VerificationBottomSheet.W0;
                j.f(verificationBottomSheet, "this$0");
                cb.b.D(cb.d.I(verificationBottomSheet), (f.b) null, 0, new l(verificationBottomSheet, (d<? super l>) null), 3);
                return;
            case 8:
                ClaimCoinPlaceOutdoorBottomSheet claimCoinPlaceOutdoorBottomSheet = (ClaimCoinPlaceOutdoorBottomSheet) pVar;
                int i18 = ClaimCoinPlaceOutdoorBottomSheet.T0;
                j.f(claimCoinPlaceOutdoorBottomSheet, "this$0");
                m.c(claimCoinPlaceOutdoorBottomSheet).o();
                return;
            case 9:
                ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet = (ClaimCoinSourceIndoorBottomSheet) pVar;
                int i19 = ClaimCoinSourceIndoorBottomSheet.U0;
                j.f(claimCoinSourceIndoorBottomSheet, "this$0");
                m.c(claimCoinSourceIndoorBottomSheet).o();
                return;
            case 10:
                ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet = (ClaimCoinSourceOutdoorBottomSheet) pVar;
                int i20 = ClaimCoinSourceOutdoorBottomSheet.U0;
                j.f(claimCoinSourceOutdoorBottomSheet, "this$0");
                ArrayList P0 = q.P0((Collection) claimCoinSourceOutdoorBottomSheet.u0().f6970h.getValue());
                String str2 = (String) claimCoinSourceOutdoorBottomSheet.u0().f6971i.getValue();
                P0.remove("Other");
                if (str2.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    P0.add(str2);
                }
                ClaimCoinSourceOutdoorViewModel u03 = claimCoinSourceOutdoorBottomSheet.u0();
                ClaimCoinRequestModel copy$default = ClaimCoinRequestModel.copy$default(((kd.f) claimCoinSourceOutdoorBottomSheet.S0.getValue()).f10419a, (String) null, (String) null, (String) null, P0, (Double) null, 23, (Object) null);
                u03.getClass();
                j.f(copy$default, "claimCoinRequestModel");
                cb.b.D(gc.b.o(u03), (f.b) null, 0, new kd.h(u03, copy$default, (d<? super kd.h>) null), 3);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                HowToMeasureBottomSheet howToMeasureBottomSheet = (HowToMeasureBottomSheet) pVar;
                int i21 = HowToMeasureBottomSheet.S0;
                j.f(howToMeasureBottomSheet, "this$0");
                zd.j.a(howToMeasureBottomSheet.d0(), "https://www.silencio.network/academy");
                return;
            case 12:
                MeasuringBottomSheet measuringBottomSheet = (MeasuringBottomSheet) pVar;
                int i22 = MeasuringBottomSheet.f6988h1;
                j.f(measuringBottomSheet, "this$0");
                String string = measuringBottomSheet.e0().getString(R.string.alert_title);
                j.e(string, "requireContext().getString(R.string.alert_title)");
                String string2 = measuringBottomSheet.e0().getString(R.string.cancel_recording_popup);
                j.e(string2, "requireContext().getStri…g.cancel_recording_popup)");
                zd.d.d(measuringBottomSheet, string, string2, "Yes", "Continue Measurement", true, new d0(measuringBottomSheet), e0.f11395a);
                return;
            case 13:
                PopupBottomSheet popupBottomSheet = (PopupBottomSheet) pVar;
                int i23 = PopupBottomSheet.T0;
                j.f(popupBottomSheet, "this$0");
                if (((Boolean) ((PopupViewModel) popupBottomSheet.R0.getValue()).f7055g.getValue()).booleanValue()) {
                    g gVar = popupBottomSheet.S0;
                    if (((nd.c) gVar.getValue()).f11893a) {
                        SharedPreferences.Editor editor = zd.h.f17951b;
                        if (editor != null) {
                            editor.putBoolean("SHOW_CAP_LIMIT_POPUP", true);
                            SharedPreferences.Editor editor2 = zd.h.f17951b;
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
                    if (((nd.c) gVar.getValue()).f11894b) {
                        SharedPreferences.Editor editor3 = zd.h.f17951b;
                        if (editor3 != null) {
                            editor3.putBoolean("SHOW_MIC_INTERRUPT_POPUP", true);
                            SharedPreferences.Editor editor4 = zd.h.f17951b;
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
                }
                m.c(popupBottomSheet).o();
                return;
            case 14:
                HistoryFragment historyFragment = (HistoryFragment) pVar;
                int i24 = HistoryFragment.E0;
                j.f(historyFragment, "this$0");
                a3.a aVar2 = historyFragment.D0;
                if (aVar2 != null) {
                    aVar2.c(new Intent("com.quickkonnect.silencio.side_menu"));
                }
                m.c(historyFragment).o();
                return;
            case 15:
                ProfileFragment profileFragment = (ProfileFragment) pVar;
                int i25 = ProfileFragment.I0;
                j.f(profileFragment, "this$0");
                androidx.activity.result.c<Intent> cVar = profileFragment.B0;
                if (cVar != null) {
                    w2 w2Var = new w2(profileFragment.e0());
                    rb.a aVar3 = (rb.a) w2Var.f15269b;
                    aVar3.getClass();
                    aVar3.I = 3;
                    rb.a aVar4 = (rb.a) w2Var.f15269b;
                    aVar4.G = 1;
                    aVar4.F = 1;
                    CropImageView.c cVar2 = CropImageView.c.f6551a;
                    aVar4.getClass();
                    aVar4.L = cVar2;
                    Object obj = t1.a.f15323a;
                    ((rb.a) w2Var.f15269b).f14187b = a.d.a((Context) w2Var.f15268a, R.color.color_primary);
                    ((rb.a) w2Var.f15269b).f14186a = a.d.a((Context) w2Var.f15268a, R.color.color_primary);
                    ((rb.a) w2Var.f15269b).f14189d = a.d.a((Context) w2Var.f15268a, R.color.color_primary);
                    Parcelable.Creator<com.lassi.presentation.cameraview.controls.a> creator = com.lassi.presentation.cameraview.controls.a.CREATOR;
                    ((rb.a) w2Var.f15269b).N = a.C0082a.a(1, 1);
                    rb.a aVar5 = (rb.a) w2Var.f15269b;
                    aVar5.O = true;
                    aVar5.P = true;
                    rb.a aVar6 = rb.a.V;
                    aVar6.f14186a = aVar5.f14186a;
                    aVar6.f14187b = aVar5.f14187b;
                    aVar6.f14188c = aVar5.f14188c;
                    aVar6.f14189d = aVar5.f14189d;
                    aVar6.f14190e = aVar5.f14190e;
                    ArrayList<nb.b> arrayList = aVar5.E;
                    j.f(arrayList, "<set-?>");
                    aVar6.E = arrayList;
                    int i26 = aVar5.F;
                    f2.a(i26, "<set-?>");
                    aVar6.F = i26;
                    aVar6.G = aVar5.G;
                    aVar6.H = aVar5.H;
                    int i27 = aVar5.I;
                    f2.a(i27, "<set-?>");
                    aVar6.I = i27;
                    aVar6.J = aVar5.J;
                    aVar6.K = aVar5.K;
                    aVar6.B = aVar5.B;
                    aVar6.C = aVar5.C;
                    aVar6.D = aVar5.D;
                    CropImageView.c cVar3 = aVar5.L;
                    j.f(cVar3, "<set-?>");
                    aVar6.L = cVar3;
                    List<String> list = aVar5.M;
                    j.f(list, "<set-?>");
                    aVar6.M = list;
                    aVar6.N = aVar5.N;
                    aVar6.O = aVar5.O;
                    aVar6.P = aVar5.P;
                    aVar6.Q = aVar5.Q;
                    aVar6.R = aVar5.R;
                    aVar6.S = aVar5.S;
                    aVar6.T = aVar5.T;
                    aVar6.U = aVar5.U;
                    cVar.a(new Intent((Context) w2Var.f15268a, LassiMediaPickerActivity.class));
                    return;
                }
                j.l("lassiResult");
                throw null;
            case 16:
                ShopFragment shopFragment = (ShopFragment) pVar;
                int i28 = ShopFragment.E0;
                j.f(shopFragment, "this$0");
                a3.a aVar7 = shopFragment.B0;
                if (aVar7 != null) {
                    aVar7.c(new Intent("com.quickkonnect.silencio.side_menu"));
                    return;
                }
                return;
            default:
                WalletFragment walletFragment = (WalletFragment) pVar;
                int i29 = WalletFragment.F0;
                j.f(walletFragment, "this$0");
                WalletViewModel o02 = walletFragment.o0();
                o02.getClass();
                cb.b.D(gc.b.o(o02), (f.b) null, 0, new yd.q(o02, (d<? super yd.q>) null), 3);
                return;
        }
    }
}
