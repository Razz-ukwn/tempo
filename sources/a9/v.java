package a9;

import ag.m;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import cb.b;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.location.CalimCoinLoacationBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioBottomSheet;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel;
import com.quickkonnect.silencio.ui.tabs.map.info.InfoBottomSheet;
import com.quickkonnect.silencio.ui.tabs.shop.ShopFragment;
import gf.q;
import hd.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.d;
import jf.f;
import q6.a;
import rc.f;
import rc.i;
import rd.o;
import rd.p;
import sf.j;
import uc.h;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f205b;

    public /* synthetic */ v(Object obj, int i8) {
        this.f204a = i8;
        this.f205b = obj;
    }

    public final void onClick(View view) {
        boolean z10 = false;
        int i8 = this.f204a;
        Object obj = this.f205b;
        switch (i8) {
            case 0:
                w wVar = (w) obj;
                EditText editText = wVar.f207f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = wVar.f207f;
                    if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z10 = true;
                    }
                    if (z10) {
                        wVar.f207f.setTransformationMethod((TransformationMethod) null);
                    } else {
                        wVar.f207f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        wVar.f207f.setSelection(selectionEnd);
                    }
                    wVar.q();
                    return;
                }
                return;
            case 1:
                ChoosePasswordBottomSheet choosePasswordBottomSheet = (ChoosePasswordBottomSheet) obj;
                int i10 = ChoosePasswordBottomSheet.V0;
                j.f(choosePasswordBottomSheet, "this$0");
                if (choosePasswordBottomSheet.T0) {
                    ChoosePasswordViewModel u02 = choosePasswordBottomSheet.u0();
                    u02.getClass();
                    RegisterUserRequestModel registerUserRequestModel = ((f) choosePasswordBottomSheet.S0.getValue()).f14201a;
                    j.f(registerUserRequestModel, "registerUserRequestModel");
                    b.D(gc.b.o(u02), (f.b) null, 0, new i(u02, registerUserRequestModel, (d<? super i>) null), 3);
                    return;
                }
                return;
            case 2:
                CodeBottomSheet codeBottomSheet = (CodeBottomSheet) obj;
                int i11 = CodeBottomSheet.U0;
                j.f(codeBottomSheet, "this$0");
                if (codeBottomSheet.S0) {
                    CodeViewModel u03 = codeBottomSheet.u0();
                    u03.getClass();
                    b.D(gc.b.o(u03), (f.b) null, 0, new sc.j(u03, (d<? super sc.j>) null), 3);
                    return;
                }
                return;
            case 3:
                CreateAccountBottomSheet createAccountBottomSheet = (CreateAccountBottomSheet) obj;
                int i12 = CreateAccountBottomSheet.W0;
                j.f(createAccountBottomSheet, "this$0");
                if (createAccountBottomSheet.T0) {
                    CreateAccountViewModel v02 = createAccountBottomSheet.v0();
                    v02.getClass();
                    b.D(gc.b.o(v02), (f.b) null, 0, new tc.v(v02, (d<? super tc.v>) null), 3);
                    return;
                }
                return;
            case 4:
                EmailBottomSheet emailBottomSheet = (EmailBottomSheet) obj;
                int i13 = EmailBottomSheet.W0;
                j.f(emailBottomSheet, "this$0");
                if (emailBottomSheet.T0) {
                    b.D(cb.d.I(emailBottomSheet), (f.b) null, 0, new h(emailBottomSheet, (d<? super h>) null), 3);
                    return;
                }
                return;
            case 5:
                ForgotPasswordBottomSheet forgotPasswordBottomSheet = (ForgotPasswordBottomSheet) obj;
                int i14 = ForgotPasswordBottomSheet.V0;
                j.f(forgotPasswordBottomSheet, "this$0");
                if (forgotPasswordBottomSheet.U0) {
                    b.D(cb.d.I(forgotPasswordBottomSheet), (f.b) null, 0, new vc.i(forgotPasswordBottomSheet, (d<? super vc.i>) null), 3);
                    return;
                }
                return;
            case 6:
                LoginBottomSheet loginBottomSheet = (LoginBottomSheet) obj;
                int i15 = LoginBottomSheet.W0;
                j.f(loginBottomSheet, "this$0");
                a aVar = loginBottomSheet.S0;
                if (aVar != null) {
                    loginBottomSheet.startActivityForResult(aVar.d(), loginBottomSheet.T0);
                    return;
                } else {
                    j.l("mGoogleSignInClient");
                    throw null;
                }
            case 7:
                PhoneNumberBottomSheet phoneNumberBottomSheet = (PhoneNumberBottomSheet) obj;
                int i16 = PhoneNumberBottomSheet.V0;
                j.f(phoneNumberBottomSheet, "this$0");
                m.c(phoneNumberBottomSheet).o();
                return;
            case 8:
                RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) obj;
                int i17 = RegisterBottomSheet.X0;
                j.f(registerBottomSheet, "this$0");
                m.c(registerBottomSheet).o();
                return;
            case 9:
                CalimCoinLoacationBottomSheet calimCoinLoacationBottomSheet = (CalimCoinLoacationBottomSheet) obj;
                int i18 = CalimCoinLoacationBottomSheet.N0;
                j.f(calimCoinLoacationBottomSheet, "this$0");
                m.c(calimCoinLoacationBottomSheet).o();
                return;
            case 10:
                ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet = (ClaimCoinPlaceIndoorBottomSheet) obj;
                int i19 = ClaimCoinPlaceIndoorBottomSheet.T0;
                j.f(claimCoinPlaceIndoorBottomSheet, "this$0");
                ArrayList P0 = q.P0((Collection) claimCoinPlaceIndoorBottomSheet.u0().f6914g.getValue());
                String str = (String) claimCoinPlaceIndoorBottomSheet.u0().f6915h.getValue();
                P0.remove("Other");
                if (str.length() > 0) {
                    z10 = true;
                }
                if (z10) {
                    P0.add(str);
                }
                b3.m c3 = m.c(claimCoinPlaceIndoorBottomSheet);
                ClaimCoinRequestModel claimCoinRequestModel = ((c) claimCoinPlaceIndoorBottomSheet.S0.getValue()).f9303a;
                String str2 = (String) q.v0(P0);
                if (str2 == null) {
                    str2 = "";
                }
                ClaimCoinRequestModel copy$default = ClaimCoinRequestModel.copy$default(claimCoinRequestModel, (String) null, (String) null, str2, (List) null, (Double) null, 27, (Object) null);
                j.f(copy$default, "claimCoin");
                c3.n(new hd.d(copy$default));
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                ProfileFragment profileFragment = (ProfileFragment) obj;
                int i20 = ProfileFragment.I0;
                j.f(profileFragment, "this$0");
                zd.d.d(profileFragment, "Delete Account", "Are you sure you want to delete account?", "Yes", "No", true, new o(profileFragment), p.f14237a);
                return;
            case 12:
                ChangePasswordBottomSheet changePasswordBottomSheet = (ChangePasswordBottomSheet) obj;
                int i21 = ChangePasswordBottomSheet.T0;
                j.f(changePasswordBottomSheet, "this$0");
                m.c(changePasswordBottomSheet).o();
                return;
            case 13:
                HomeFragment homeFragment = (HomeFragment) obj;
                int i22 = HomeFragment.E0;
                j.f(homeFragment, "this$0");
                Intent intent = new Intent("com.quickkonnect.silencio.bottom_nav");
                intent.putExtra("BOTTOM_NAV_BROADCAST_NAME", "wallet");
                a3.a aVar2 = homeFragment.D0;
                if (aVar2 != null) {
                    aVar2.c(intent);
                    return;
                }
                return;
            case 14:
                AskSilencioBottomSheet askSilencioBottomSheet = (AskSilencioBottomSheet) obj;
                int i23 = AskSilencioBottomSheet.N0;
                j.f(askSilencioBottomSheet, "this$0");
                if (((Boolean) ((AskSilencioViewModel) askSilencioBottomSheet.M0.getValue()).f7125g.getValue()).booleanValue()) {
                    SharedPreferences.Editor editor = zd.h.f17951b;
                    if (editor != null) {
                        editor.putBoolean("ASK_SILENCIO", true);
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
                m.c(askSilencioBottomSheet).o();
                zd.j.a(askSilencioBottomSheet.d0(), "https://www.videoask.com/fqrg8ofpm");
                return;
            case 15:
                InfoBottomSheet infoBottomSheet = (InfoBottomSheet) obj;
                int i24 = InfoBottomSheet.M0;
                j.f(infoBottomSheet, "this$0");
                m.c(infoBottomSheet).o();
                return;
            default:
                ShopFragment shopFragment = (ShopFragment) obj;
                int i25 = ShopFragment.E0;
                j.f(shopFragment, "this$0");
                zd.j.a(shopFragment.d0(), "https://www.silencio.network/roadmap");
                return;
        }
    }
}
