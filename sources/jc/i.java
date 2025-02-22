package jc;

import androidx.lifecycle.j0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.MainViewModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterViewModel;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel;
import com.quickkonnect.silencio.ui.measure.result.ResultViewModel;
import com.quickkonnect.silencio.ui.menu.history.HistoryViewModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel;
import com.quickkonnect.silencio.ui.tabs.home.HomeViewModel;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel;
import com.quickkonnect.silencio.ui.tabs.shop.ShopViewModel;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel;
import java.util.Collections;
import java.util.Map;
import r3.s;

public final class i extends f0 {
    public a A;
    public a B;
    public a C;

    /* renamed from: a  reason: collision with root package name */
    public a f9927a;

    /* renamed from: b  reason: collision with root package name */
    public a f9928b;

    /* renamed from: c  reason: collision with root package name */
    public a f9929c;

    /* renamed from: d  reason: collision with root package name */
    public a f9930d;

    /* renamed from: e  reason: collision with root package name */
    public a f9931e;

    /* renamed from: f  reason: collision with root package name */
    public a f9932f;

    /* renamed from: g  reason: collision with root package name */
    public a f9933g;

    /* renamed from: h  reason: collision with root package name */
    public a f9934h;

    /* renamed from: i  reason: collision with root package name */
    public a f9935i;

    /* renamed from: j  reason: collision with root package name */
    public a f9936j;

    /* renamed from: k  reason: collision with root package name */
    public a f9937k;

    /* renamed from: l  reason: collision with root package name */
    public a f9938l;
    public a m;

    /* renamed from: n  reason: collision with root package name */
    public a f9939n;

    /* renamed from: o  reason: collision with root package name */
    public a f9940o;

    /* renamed from: p  reason: collision with root package name */
    public a f9941p;

    /* renamed from: q  reason: collision with root package name */
    public a f9942q;

    /* renamed from: r  reason: collision with root package name */
    public a f9943r;

    /* renamed from: s  reason: collision with root package name */
    public a f9944s;

    /* renamed from: t  reason: collision with root package name */
    public a f9945t;

    /* renamed from: u  reason: collision with root package name */
    public a f9946u;

    /* renamed from: v  reason: collision with root package name */
    public a f9947v;

    /* renamed from: w  reason: collision with root package name */
    public a f9948w;

    /* renamed from: x  reason: collision with root package name */
    public a f9949x;

    /* renamed from: y  reason: collision with root package name */
    public a f9950y;

    /* renamed from: z  reason: collision with root package name */
    public a f9951z;

    public static final class a<T> implements ef.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final g f9952a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9953b;

        public a(g gVar, int i8) {
            this.f9952a = gVar;
            this.f9953b = i8;
        }

        public final T get() {
            g gVar = this.f9952a;
            int i8 = this.f9953b;
            switch (i8) {
                case 0:
                    return new AskSilencioViewModel(z.a(gVar.f9908a));
                case 1:
                    return new ChangePasswordViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 2:
                    return new ChoosePasswordViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 3:
                    return new ClaimCoinPlaceIndoorViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 4:
                    return new ClaimCoinPlaceOutdoorViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 5:
                    return new ClaimCoinSourceIndoorViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 6:
                    return new ClaimCoinSourceOutdoorViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 7:
                    return new CodeViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 8:
                    return new CreateAccountViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 9:
                    return new EmailViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 10:
                    return new ForgotPasswordEmailViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case ModuleDescriptor.MODULE_VERSION:
                    return new ForgotPasswordViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 12:
                    return new HistoryViewModel(z.a(gVar.f9908a), gVar.f9920n.get());
                case 13:
                    return new HomeViewModel(z.a(gVar.f9908a), gVar.f9922p.get(), gVar.f9915h.get());
                case 14:
                    return new HowToMeasureViewModel(z.a(gVar.f9908a));
                case 15:
                    return new LoginViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 16:
                    return new MainViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 17:
                    return new MeasuringViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 18:
                    return new PhoneNumberViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 19:
                    return new PopupViewModel(z.a(gVar.f9908a));
                case 20:
                    return new ProfileViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 21:
                    return new RegisterEmailOtpVerficationViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 22:
                    return new RegisterOtpVerficationViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 23:
                    return new RegisterViewModel(z.a(gVar.f9908a), gVar.f9917j.get(), gVar.f9915h.get());
                case 24:
                    return new ResetPasswordViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 25:
                    return new ResultViewModel(z.a(gVar.f9908a), gVar.f9919l.get());
                case 26:
                    return new ShopViewModel(z.a(gVar.f9908a), gVar.f9922p.get());
                case 27:
                    return new VerificationViewModel(z.a(gVar.f9908a), gVar.f9915h.get());
                case 28:
                    return new WalletViewModel(z.a(gVar.f9908a), gVar.f9922p.get(), gVar.f9917j.get());
                default:
                    throw new AssertionError(i8);
            }
        }
    }

    public i(g gVar, d dVar) {
        this.f9927a = new a(gVar, 0);
        this.f9928b = new a(gVar, 1);
        this.f9929c = new a(gVar, 2);
        this.f9930d = new a(gVar, 3);
        this.f9931e = new a(gVar, 4);
        this.f9932f = new a(gVar, 5);
        this.f9933g = new a(gVar, 6);
        this.f9934h = new a(gVar, 7);
        this.f9935i = new a(gVar, 8);
        this.f9936j = new a(gVar, 9);
        this.f9937k = new a(gVar, 10);
        this.f9938l = new a(gVar, 11);
        this.m = new a(gVar, 12);
        this.f9939n = new a(gVar, 13);
        this.f9940o = new a(gVar, 14);
        this.f9941p = new a(gVar, 15);
        this.f9942q = new a(gVar, 16);
        this.f9943r = new a(gVar, 17);
        this.f9944s = new a(gVar, 18);
        this.f9945t = new a(gVar, 19);
        this.f9946u = new a(gVar, 20);
        this.f9947v = new a(gVar, 21);
        this.f9948w = new a(gVar, 22);
        this.f9949x = new a(gVar, 23);
        this.f9950y = new a(gVar, 24);
        this.f9951z = new a(gVar, 25);
        this.A = new a(gVar, 26);
        this.B = new a(gVar, 27);
        this.C = new a(gVar, 28);
    }

    public final Map<String, ef.a<j0>> a() {
        s sVar = new s();
        sVar.e("com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel", this.f9927a);
        sVar.e("com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel", this.f9928b);
        sVar.e("com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel", this.f9929c);
        sVar.e("com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel", this.f9930d);
        sVar.e("com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel", this.f9931e);
        sVar.e("com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel", this.f9932f);
        sVar.e("com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel", this.f9933g);
        sVar.e("com.quickkonnect.silencio.ui.auth.code.CodeViewModel", this.f9934h);
        sVar.e("com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel", this.f9935i);
        sVar.e("com.quickkonnect.silencio.ui.auth.email.EmailViewModel", this.f9936j);
        sVar.e("com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel", this.f9937k);
        sVar.e("com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel", this.f9938l);
        sVar.e("com.quickkonnect.silencio.ui.menu.history.HistoryViewModel", this.m);
        sVar.e("com.quickkonnect.silencio.ui.tabs.home.HomeViewModel", this.f9939n);
        sVar.e("com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel", this.f9940o);
        sVar.e("com.quickkonnect.silencio.ui.auth.login.LoginViewModel", this.f9941p);
        sVar.e("com.quickkonnect.silencio.MainViewModel", this.f9942q);
        sVar.e("com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel", this.f9943r);
        sVar.e("com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel", this.f9944s);
        sVar.e("com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel", this.f9945t);
        sVar.e("com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel", this.f9946u);
        sVar.e("com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel", this.f9947v);
        sVar.e("com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel", this.f9948w);
        sVar.e("com.quickkonnect.silencio.ui.auth.register.RegisterViewModel", this.f9949x);
        sVar.e("com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel", this.f9950y);
        sVar.e("com.quickkonnect.silencio.ui.measure.result.ResultViewModel", this.f9951z);
        sVar.e("com.quickkonnect.silencio.ui.tabs.shop.ShopViewModel", this.A);
        sVar.e("com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel", this.B);
        sVar.e("com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel", this.C);
        return ((Map) sVar.f13862a).isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map) sVar.f13862a);
    }
}
