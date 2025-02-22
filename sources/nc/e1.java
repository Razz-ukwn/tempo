package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;

public abstract class e1 extends ViewDataBinding {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f11662l0 = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final MaterialCardView U;
    public final ConstraintLayout V;
    public final EditText W;
    public final EditText X;
    public final EditText Y;
    public final EditText Z;

    /* renamed from: a0  reason: collision with root package name */
    public final EditText f11663a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Guideline f11664b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ImageView f11665c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f11666d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f11667e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f11668f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f11669g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f11670h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TextView f11671i0;

    /* renamed from: j0  reason: collision with root package name */
    public UserModel f11672j0;

    /* renamed from: k0  reason: collision with root package name */
    public ProfileViewModel f11673k0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(Object obj, View view, ImageView imageView, MaterialButton materialButton, MaterialCardView materialCardView, ConstraintLayout constraintLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, Guideline guideline, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(2, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.S = imageView;
        this.T = materialButton;
        this.U = materialCardView;
        this.V = constraintLayout;
        this.W = editText;
        this.X = editText2;
        this.Y = editText3;
        this.Z = editText4;
        this.f11663a0 = editText5;
        this.f11664b0 = guideline;
        this.f11665c0 = imageView2;
        this.f11666d0 = textView;
        this.f11667e0 = textView2;
        this.f11668f0 = textView3;
        this.f11669g0 = textView4;
        this.f11670h0 = textView5;
        this.f11671i0 = textView6;
    }

    public abstract void w(UserModel userModel);

    public abstract void x(ProfileViewModel profileViewModel);
}
