package t8;

import a9.e;
import ad.n;
import ag.m;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import cb.b;
import cb.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioBottomSheet;
import com.quickkonnect.silencio.ui.tabs.shop.ShopFragment;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import gf.q;
import id.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jd.h;
import jf.f;
import rd.u;
import sf.j;
import wc.i;
import xc.p;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15446b;

    public /* synthetic */ a(Object obj, int i8) {
        this.f15445a = i8;
        this.f15446b = obj;
    }

    public final void onClick(View view) {
        UserModel userModel;
        int i8 = this.f15445a;
        boolean z10 = true;
        Object obj = this.f15446b;
        switch (i8) {
            case 1:
                e eVar = (e) obj;
                EditText editText = eVar.f140i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 2:
                ChoosePasswordBottomSheet choosePasswordBottomSheet = (ChoosePasswordBottomSheet) obj;
                int i10 = ChoosePasswordBottomSheet.V0;
                j.f(choosePasswordBottomSheet, "this$0");
                m.c(choosePasswordBottomSheet).o();
                return;
            case 3:
                CodeBottomSheet codeBottomSheet = (CodeBottomSheet) obj;
                int i11 = CodeBottomSheet.U0;
                j.f(codeBottomSheet, "this$0");
                m.c(codeBottomSheet).o();
                return;
            case 4:
                CreateAccountBottomSheet createAccountBottomSheet = (CreateAccountBottomSheet) obj;
                int i12 = CreateAccountBottomSheet.W0;
                j.f(createAccountBottomSheet, "this$0");
                m.c(createAccountBottomSheet).o();
                return;
            case 5:
                EmailBottomSheet emailBottomSheet = (EmailBottomSheet) obj;
                int i13 = EmailBottomSheet.W0;
                j.f(emailBottomSheet, "this$0");
                m.c(emailBottomSheet).o();
                return;
            case 6:
                ForgotPasswordBottomSheet forgotPasswordBottomSheet = (ForgotPasswordBottomSheet) obj;
                int i14 = ForgotPasswordBottomSheet.V0;
                j.f(forgotPasswordBottomSheet, "this$0");
                m.c(forgotPasswordBottomSheet).o();
                return;
            case 7:
                ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = (ForgotPasswordEmailBottomSheet) obj;
                int i15 = ForgotPasswordEmailBottomSheet.V0;
                j.f(forgotPasswordEmailBottomSheet, "this$0");
                if (forgotPasswordEmailBottomSheet.U0) {
                    b.D(d.I(forgotPasswordEmailBottomSheet), (f.b) null, 0, new i(forgotPasswordEmailBottomSheet, (jf.d<? super i>) null), 3);
                    return;
                }
                return;
            case 8:
                LoginBottomSheet loginBottomSheet = (LoginBottomSheet) obj;
                int i16 = LoginBottomSheet.W0;
                j.f(loginBottomSheet, "this$0");
                if (loginBottomSheet.U0) {
                    LoginViewModel u02 = loginBottomSheet.u0();
                    u02.getClass();
                    b.D(gc.b.o(u02), (f.b) null, 0, new p(u02, (jf.d<? super p>) null), 3);
                    return;
                }
                return;
            case 9:
                RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = (RegisterOtpVerificationBottomSheet) obj;
                int i17 = RegisterOtpVerificationBottomSheet.V0;
                j.f(registerOtpVerificationBottomSheet, "this$0");
                RegisterOtpVerficationViewModel v02 = registerOtpVerificationBottomSheet.v0();
                String countryCode = registerOtpVerificationBottomSheet.u0().f17937a.getCountryCode();
                String str = countryCode == null ? "" : countryCode;
                String phone = registerOtpVerificationBottomSheet.u0().f17937a.getPhone();
                VerifyNumberRequestModel verifyNumberRequestModel = new VerifyNumberRequestModel(str, phone == null ? "" : phone, (String) null, (String) null, (String) null, (String) null, 60, (sf.e) null);
                v02.getClass();
                b.D(gc.b.o(v02), (f.b) null, 0, new zc.b(v02, verifyNumberRequestModel, (jf.d<? super zc.b>) null), 3);
                return;
            case 10:
                RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = (RegisterEmailOtpVerificationBottomSheet) obj;
                int i18 = RegisterEmailOtpVerificationBottomSheet.W0;
                j.f(registerEmailOtpVerificationBottomSheet, "this$0");
                b.D(d.I(registerEmailOtpVerificationBottomSheet), (f.b) null, 0, new n(registerEmailOtpVerificationBottomSheet, (jf.d<? super n>) null), 3);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet = (ClaimCoinPlaceIndoorBottomSheet) obj;
                int i19 = ClaimCoinPlaceIndoorBottomSheet.T0;
                j.f(claimCoinPlaceIndoorBottomSheet, "this$0");
                m.c(claimCoinPlaceIndoorBottomSheet).o();
                return;
            case 12:
                ClaimCoinPlaceOutdoorBottomSheet claimCoinPlaceOutdoorBottomSheet = (ClaimCoinPlaceOutdoorBottomSheet) obj;
                int i20 = ClaimCoinPlaceOutdoorBottomSheet.T0;
                j.f(claimCoinPlaceOutdoorBottomSheet, "this$0");
                ArrayList P0 = q.P0((Collection) claimCoinPlaceOutdoorBottomSheet.u0().f6931g.getValue());
                String str2 = (String) claimCoinPlaceOutdoorBottomSheet.u0().f6932h.getValue();
                P0.remove("Other");
                if (str2.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    P0.add(str2);
                }
                b3.m c3 = m.c(claimCoinPlaceOutdoorBottomSheet);
                ClaimCoinRequestModel claimCoinRequestModel = ((c) claimCoinPlaceOutdoorBottomSheet.S0.getValue()).f9657a;
                String str3 = (String) q.v0(P0);
                ClaimCoinRequestModel copy$default = ClaimCoinRequestModel.copy$default(claimCoinRequestModel, (String) null, (String) null, str3 == null ? "" : str3, (List) null, (Double) null, 27, (Object) null);
                j.f(copy$default, "claimCoin");
                c3.n(new id.d(copy$default));
                return;
            case 13:
                ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet = (ClaimCoinSourceIndoorBottomSheet) obj;
                int i21 = ClaimCoinSourceIndoorBottomSheet.U0;
                j.f(claimCoinSourceIndoorBottomSheet, "this$0");
                ArrayList P02 = q.P0((Collection) claimCoinSourceIndoorBottomSheet.u0().f6950h.getValue());
                String str4 = (String) claimCoinSourceIndoorBottomSheet.u0().f6951i.getValue();
                P02.remove("Other");
                if (str4.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    P02.add(str4);
                }
                ClaimCoinSourceIndoorViewModel u03 = claimCoinSourceIndoorBottomSheet.u0();
                ClaimCoinRequestModel copy$default2 = ClaimCoinRequestModel.copy$default(((jd.f) claimCoinSourceIndoorBottomSheet.S0.getValue()).f9984a, (String) null, (String) null, (String) null, P02, (Double) null, 23, (Object) null);
                u03.getClass();
                j.f(copy$default2, "claimCoinRequestModel");
                b.D(gc.b.o(u03), (f.b) null, 0, new h(u03, copy$default2, (jf.d<? super h>) null), 3);
                return;
            case 14:
                ProfileFragment profileFragment = (ProfileFragment) obj;
                int i22 = ProfileFragment.I0;
                j.f(profileFragment, "this$0");
                ProfileViewModel o02 = profileFragment.o0();
                File file = profileFragment.D0;
                if (file == null) {
                    z10 = false;
                }
                o02.getClass();
                b.D(gc.b.o(o02), (f.b) null, 0, new u(o02, z10, file, (jf.d<? super u>) null), 3);
                return;
            case 15:
                HomeFragment homeFragment = (HomeFragment) obj;
                int i23 = HomeFragment.E0;
                j.f(homeFragment, "this$0");
                a3.a aVar = homeFragment.C0;
                if (aVar != null) {
                    aVar.c(new Intent("com.quickkonnect.silencio.side_menu"));
                    return;
                }
                return;
            case 16:
                AskSilencioBottomSheet askSilencioBottomSheet = (AskSilencioBottomSheet) obj;
                int i24 = AskSilencioBottomSheet.N0;
                j.f(askSilencioBottomSheet, "this$0");
                m.c(askSilencioBottomSheet).o();
                return;
            case 17:
                ShopFragment shopFragment = (ShopFragment) obj;
                int i25 = ShopFragment.E0;
                j.f(shopFragment, "this$0");
                Intent intent = new Intent("com.quickkonnect.silencio.bottom_nav");
                intent.putExtra("BOTTOM_NAV_BROADCAST_NAME", "wallet");
                a3.a aVar2 = shopFragment.C0;
                if (aVar2 != null) {
                    aVar2.c(intent);
                    return;
                }
                return;
            default:
                WalletFragment walletFragment = (WalletFragment) obj;
                int i26 = WalletFragment.F0;
                j.f(walletFragment, "this$0");
                List d10 = walletFragment.o0().f7157i.d();
                if (d10 != null && (userModel = (UserModel) q.x0(0, d10)) != null) {
                    String string = walletFragment.e0().getString(R.string.invite_string_formatter, new Object[]{userModel.getNickName()});
                    j.e(string, "requireContext().getStri…g_formatter, it.nickName)");
                    Context e02 = walletFragment.e0();
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.TEXT", string);
                    e02.startActivity(Intent.createChooser(intent2, "Share using"));
                    return;
                }
                return;
        }
    }
}
