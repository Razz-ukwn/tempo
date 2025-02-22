package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import m8.v;

public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f6111d0 || !(view instanceof TabLayout.i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.i iVar = (TabLayout.i) view;
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int b10 = (int) v.b(iVar.getContext(), 24);
        if (contentWidth < b10) {
            contentWidth = b10;
        }
        int right = (iVar.getRight() + iVar.getLeft()) / 2;
        int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
        int i8 = contentWidth / 2;
        return new RectF((float) (right - i8), (float) (bottom - (contentHeight / 2)), (float) (i8 + right), (float) ((right / 2) + bottom));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(v7.a.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, v7.a.b(f10, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
