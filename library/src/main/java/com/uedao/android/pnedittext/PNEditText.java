/**
 * Copyright © 2016 by dodo All Rights reserved.
 */
package com.uedao.android.pnedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * 正负EditText
 *
 * @author <a href="mailto:lhuibo@gmail.com">dodo</a> 2016/01/27
 * @version ${Id}
 */
public class PNEditText extends LinearLayout {

    public PNEditText(Context context) {
        super(context);
        init(context, null, 0);
    }

    public PNEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    /*public PNEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }*/

    private void init(Context context, AttributeSet attrs, int defStyle) {
        View view = View.inflate(context, R.layout.layout_pnedittext, null);
        addView(view);
    }
}
