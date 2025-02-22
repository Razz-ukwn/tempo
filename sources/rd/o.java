package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.p000firebaseauthapi.sh;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import ff.m;
import rf.a;
import sf.k;

public final class o extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14236a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(ProfileFragment profileFragment) {
        super(0);
        this.f14236a = profileFragment;
    }

    public final Object d() {
        int i8 = ProfileFragment.I0;
        ProfileFragment profileFragment = this.f14236a;
        b.a aVar = new b.a(profileFragment.e0());
        View inflate = LayoutInflater.from(profileFragment.e0()).inflate(R.layout.delete_account_alert, (ViewGroup) null, false);
        int i10 = R.id.btn_delete;
        MaterialButton materialButton = (MaterialButton) cb.b.x(inflate, R.id.btn_delete);
        if (materialButton != null) {
            i10 = R.id.cancel_delete;
            MaterialButton materialButton2 = (MaterialButton) cb.b.x(inflate, R.id.cancel_delete);
            if (materialButton2 != null) {
                i10 = R.id.et_code;
                EditText editText = (EditText) cb.b.x(inflate, R.id.et_code);
                if (editText != null) {
                    i10 = R.id.tv_delete_subtitle;
                    TextView textView = (TextView) cb.b.x(inflate, R.id.tv_delete_subtitle);
                    if (textView != null) {
                        i10 = R.id.tv_delete_title;
                        if (((TextView) cb.b.x(inflate, R.id.tv_delete_title)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            sh shVar = new sh(constraintLayout, materialButton, materialButton2, editText, textView);
                            AlertController.b bVar = aVar.f681a;
                            bVar.f675p = constraintLayout;
                            bVar.f674o = 0;
                            b a10 = aVar.a();
                            editText.addTextChangedListener(new r(shVar));
                            materialButton.setOnClickListener(new d(profileFragment, a10));
                            materialButton2.setOnClickListener(new sc.a(a10, 13));
                            a10.show();
                            return m.f8717a;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
