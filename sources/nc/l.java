package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel;

public abstract class l extends ViewDataBinding {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f11749h0 = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final MaterialCardView U;
    public final MaterialCardView V;
    public final MaterialCardView W;
    public final MaterialCardView X;
    public final MaterialCardView Y;
    public final EditText Z;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f11750a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f11751b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f11752c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f11753d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f11754e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f11755f0;

    /* renamed from: g0  reason: collision with root package name */
    public ClaimCoinPlaceOutdoorViewModel f11756g0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Object obj, View view, ImageView imageView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
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
        this.Z = editText;
        this.f11750a0 = textView;
        this.f11751b0 = textView2;
        this.f11752c0 = textView3;
        this.f11753d0 = textView4;
        this.f11754e0 = textView5;
        this.f11755f0 = textView6;
    }

    public abstract void w(ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel);
}
