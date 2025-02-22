package jc;

import ee.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import t.r1;

public final class b extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f9899a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9900b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9901c = this;

    public b(g gVar, d dVar) {
        this.f9899a = gVar;
        this.f9900b = dVar;
    }

    public final a.c a() {
        r1 r1Var = new r1();
        r1Var.b("com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.code.CodeViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.email.EmailViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.menu.history.HistoryViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.tabs.home.HomeViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.login.LoginViewModel");
        r1Var.b("com.quickkonnect.silencio.MainViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.register.RegisterViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.measure.result.ResultViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.tabs.shop.ShopViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel");
        r1Var.b("com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel");
        List list = r1Var.f15222a;
        return new a.c(list.isEmpty() ? Collections.emptySet() : list.size() == 1 ? Collections.singleton(list.get(0)) : Collections.unmodifiableSet(new HashSet(list)), new h(this.f9899a, this.f9900b));
    }

    public final void b() {
    }

    public final e c() {
        return new e(this.f9899a, this.f9900b, this.f9901c);
    }
}
