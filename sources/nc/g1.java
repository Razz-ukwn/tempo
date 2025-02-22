package nc;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public abstract class g1 extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final MaterialButton S;
    public final MaterialCardView T;
    public final MaterialCardView U;
    public final Guideline V;
    public final TextView W;

    public g1(Object obj, View view, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, Guideline guideline, TextView textView) {
        super(0, view, obj);
        this.S = materialButton;
        this.T = materialCardView;
        this.U = materialCardView2;
        this.V = guideline;
        this.W = textView;
    }
}
