package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel;

public abstract class p extends ViewDataBinding {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f11800j0 = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final MaterialCardView U;
    public final MaterialCardView V;
    public final MaterialCardView W;
    public final MaterialCardView X;
    public final MaterialCardView Y;
    public final MaterialCardView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final EditText f11801a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f11802b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f11803c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f11804d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f11805e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f11806f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f11807g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f11808h0;

    /* renamed from: i0  reason: collision with root package name */
    public ClaimCoinSourceOutdoorViewModel f11809i0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Object obj, View view, ImageView imageView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, MaterialCardView materialCardView6, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
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
        this.f11801a0 = editText;
        this.f11802b0 = textView;
        this.f11803c0 = textView2;
        this.f11804d0 = textView3;
        this.f11805e0 = textView4;
        this.f11806f0 = textView5;
        this.f11807g0 = textView6;
        this.f11808h0 = textView7;
    }

    public abstract void w(ClaimCoinSourceOutdoorViewModel claimCoinSourceOutdoorViewModel);
}
