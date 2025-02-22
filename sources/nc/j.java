package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel;

public abstract class j extends ViewDataBinding {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f11717k0 = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final MaterialCardView U;
    public final MaterialCardView V;
    public final MaterialCardView W;
    public final MaterialCardView X;
    public final MaterialCardView Y;
    public final MaterialCardView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final MaterialCardView f11718a0;

    /* renamed from: b0  reason: collision with root package name */
    public final EditText f11719b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f11720c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f11721d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f11722e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f11723f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f11724g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f11725h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TextView f11726i0;

    /* renamed from: j0  reason: collision with root package name */
    public ClaimCoinPlaceIndoorViewModel f11727j0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Object obj, View view, ImageView imageView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, MaterialCardView materialCardView6, MaterialCardView materialCardView7, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(2, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.S = imageView;
        this.T = materialButton;
        this.U = materialCardView;
        this.V = materialCardView2;
        this.W = materialCardView3;
        this.X = materialCardView4;
        this.Y = materialCardView5;
        this.Z = materialCardView6;
        this.f11718a0 = materialCardView7;
        this.f11719b0 = editText;
        this.f11720c0 = textView;
        this.f11721d0 = textView2;
        this.f11722e0 = textView3;
        this.f11723f0 = textView4;
        this.f11724g0 = textView5;
        this.f11725h0 = textView6;
        this.f11726i0 = textView7;
    }

    public abstract void w(ClaimCoinPlaceIndoorViewModel claimCoinPlaceIndoorViewModel);
}
