package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.quickkonnect.silencio.R;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int N = 0;
    public final Chip M;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            int i8 = TimePickerView.N;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).f5798c.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.M = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        if (view == this && i8 == 0) {
            this.M.sendAccessibilityEvent(8);
        }
    }
}
