package com.cralos.customcomponents.fragments.nodatabinding.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.cralos.customcomponents.R;
import com.cralos.customcomponents.fragments.nodatabinding.OnClickComponentA;

public class ComponentA extends ConstraintLayout implements View.OnClickListener {

    /**
     * components
     */
    private TextView txvComponentTitle, txvComponentMessage;
    private Button btnComponentOk;

    /**
     * onClick
     */
    private OnClickComponentA clickComponentA;

    public ComponentA(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponentA();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnComponentOK:
                clickButtoonOk();
                break;
        }
    }

    private void initComponentA() {
        View.inflate(getContext(), R.layout.my_component_a, this);

        /**findViewById*/
        txvComponentTitle = findViewById(R.id.txvComponentTitle);
        txvComponentMessage = findViewById(R.id.txvComponentMessage);
        btnComponentOk = findViewById(R.id.btnComponentOK);
        btnComponentOk.setOnClickListener(this);
    }

    public void setDataComponentA(String title, String message) {
        txvComponentTitle.setText(title);
        txvComponentMessage.setText(message);
    }

    private void clickButtoonOk() {
        if (clickComponentA != null) {
            clickComponentA.onClickComponentA("Mensaje desde el componente");
        }
    }

    public void setOnClickComponentAlistener(OnClickComponentA onClickComponentAlistener) {
        this.clickComponentA = onClickComponentAlistener;
    }

}
