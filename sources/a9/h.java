package a9;

import ag.m;
import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import b3.f0;
import cb.b;
import cd.s;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.ChangePasswordRequestModel;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.location.CalimCoinLoacationBottomSheet;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureBottomSheet;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import com.quickkonnect.silencio.ui.tabs.map.popup.MapPopupBottomSheet;
import gd.a;
import java.util.List;
import jf.d;
import jf.f;
import nc.j0;
import sc.i;
import sd.g;
import sf.j;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f145b;

    public /* synthetic */ h(Object obj, int i8) {
        this.f144a = i8;
        this.f145b = obj;
    }

    public final void onClick(View view) {
        int i8 = this.f144a;
        Object obj = this.f145b;
        switch (i8) {
            case 0:
                ((n) obj).u();
                return;
            case 1:
                ChoosePasswordBottomSheet choosePasswordBottomSheet = (ChoosePasswordBottomSheet) obj;
                int i10 = ChoosePasswordBottomSheet.V0;
                j.f(choosePasswordBottomSheet, "this$0");
                m.c(choosePasswordBottomSheet).l(R.id.action_choosePasswordBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 2:
                CodeBottomSheet codeBottomSheet = (CodeBottomSheet) obj;
                int i11 = CodeBottomSheet.U0;
                j.f(codeBottomSheet, "this$0");
                CodeViewModel u02 = codeBottomSheet.u0();
                u02.getClass();
                b.D(gc.b.o(u02), (f.b) null, 0, new i(u02, (d<? super i>) null), 3);
                return;
            case 3:
                CreateAccountBottomSheet createAccountBottomSheet = (CreateAccountBottomSheet) obj;
                int i12 = CreateAccountBottomSheet.W0;
                j.f(createAccountBottomSheet, "this$0");
                m.c(createAccountBottomSheet).l(R.id.action_createAccountBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 4:
                EmailBottomSheet emailBottomSheet = (EmailBottomSheet) obj;
                int i13 = EmailBottomSheet.W0;
                j.f(emailBottomSheet, "this$0");
                m.c(emailBottomSheet).l(R.id.action_emailBottomSheet_to_loginBottomSheet, new Bundle(), (f0) null);
                return;
            case 5:
                PhoneNumberBottomSheet phoneNumberBottomSheet = (PhoneNumberBottomSheet) obj;
                int i14 = PhoneNumberBottomSheet.V0;
                j.f(phoneNumberBottomSheet, "this$0");
                if (phoneNumberBottomSheet.T0) {
                    PhoneNumberViewModel u03 = phoneNumberBottomSheet.u0();
                    j0 j0Var = phoneNumberBottomSheet.Q0;
                    j.c(j0Var);
                    String selectedCountryCodeWithPlus = j0Var.V.getSelectedCountryCodeWithPlus();
                    j.e(selectedCountryCodeWithPlus, "binding.ccpCountryCode.selectedCountryCodeWithPlus");
                    u03.getClass();
                    b.D(gc.b.o(u03), (f.b) null, 0, new bd.i(u03, selectedCountryCodeWithPlus, (d<? super bd.i>) null), 3);
                    return;
                }
                return;
            case 6:
                RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) obj;
                int i15 = RegisterBottomSheet.X0;
                j.f(registerBottomSheet, "this$0");
                b3.m c3 = m.c(registerBottomSheet);
                RegisterUserRequestModel registerUserRequestModel = registerBottomSheet.u0().f3989a;
                j.f(registerUserRequestModel, "registerUser");
                c3.n(new s(registerUserRequestModel));
                return;
            case 7:
                VerificationBottomSheet verificationBottomSheet = (VerificationBottomSheet) obj;
                int i16 = VerificationBottomSheet.W0;
                j.f(verificationBottomSheet, "this$0");
                m.c(verificationBottomSheet).o();
                return;
            case 8:
                CalimCoinLoacationBottomSheet calimCoinLoacationBottomSheet = (CalimCoinLoacationBottomSheet) obj;
                int i17 = CalimCoinLoacationBottomSheet.N0;
                j.f(calimCoinLoacationBottomSheet, "this$0");
                b3.m c10 = m.c(calimCoinLoacationBottomSheet);
                ClaimCoinRequestModel copy$default = ClaimCoinRequestModel.copy$default(((a) calimCoinLoacationBottomSheet.M0.getValue()).f8951a, (String) null, "indoors", (String) null, (List) null, (Double) null, 29, (Object) null);
                j.f(copy$default, "claimCoin");
                c10.n(new gd.b(copy$default));
                return;
            case 9:
                HowToMeasureBottomSheet howToMeasureBottomSheet = (HowToMeasureBottomSheet) obj;
                int i18 = HowToMeasureBottomSheet.S0;
                j.f(howToMeasureBottomSheet, "this$0");
                m.c(howToMeasureBottomSheet).o();
                return;
            case 10:
                ProfileFragment profileFragment = (ProfileFragment) obj;
                int i19 = ProfileFragment.I0;
                j.f(profileFragment, "this$0");
                profileFragment.p0();
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                ChangePasswordBottomSheet changePasswordBottomSheet = (ChangePasswordBottomSheet) obj;
                int i20 = ChangePasswordBottomSheet.T0;
                j.f(changePasswordBottomSheet, "this$0");
                ChangePasswordViewModel u04 = changePasswordBottomSheet.u0();
                ChangePasswordRequestModel changePasswordRequestModel = new ChangePasswordRequestModel((String) changePasswordBottomSheet.u0().f7105j.getValue(), (String) changePasswordBottomSheet.u0().f7104i.getValue());
                u04.getClass();
                b.D(gc.b.o(u04), (f.b) null, 0, new g(u04, changePasswordRequestModel, (d<? super g>) null), 3);
                return;
            case 12:
                HomeFragment homeFragment = (HomeFragment) obj;
                int i21 = HomeFragment.E0;
                j.f(homeFragment, "this$0");
                zd.j.a(homeFragment.d0(), "https://www.videoask.com/fqrg8ofpm");
                return;
            case 13:
                MapFragment mapFragment = (MapFragment) obj;
                int i22 = MapFragment.B0;
                j.f(mapFragment, "this$0");
                e6 e6Var = mapFragment.f7126v0;
                j.c(e6Var);
                ((WebView) e6Var.f4511b).evaluateJavascript("setloaction(" + mapFragment.f7129y0 + ", " + mapFragment.f7130z0 + ')', (ValueCallback) null);
                return;
            default:
                MapPopupBottomSheet mapPopupBottomSheet = (MapPopupBottomSheet) obj;
                int i23 = MapPopupBottomSheet.N0;
                j.f(mapPopupBottomSheet, "this$0");
                m.c(mapPopupBottomSheet).o();
                return;
        }
    }
}
