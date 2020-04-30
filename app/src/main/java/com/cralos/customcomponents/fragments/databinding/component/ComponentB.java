package com.cralos.customcomponents.fragments.databinding.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.cralos.customcomponents.R;
import com.cralos.customcomponents.databinding.MyComponentBBinding;
import com.cralos.customcomponents.fragments.databinding.interfaces.OnClickComponentB;
import com.cralos.customcomponents.fragments.databinding.models.DatosComponenteB;

public class ComponentB extends ConstraintLayout implements View.OnClickListener {

    /**
     * binding
     */
    private MyComponentBBinding binding;

    /**
     * onClick
     */
    private OnClickComponentB onClickComponentB;

    public ComponentB(Context context, AttributeSet attrs) {
        super(context, attrs);
        initComponentB();
    }

    private void initComponentB() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        binding = MyComponentBBinding.inflate(inflater, this, true);
        binding.btnComponentBOK.setOnClickListener(this);
    }

    public void setDatosComponenteB(DatosComponenteB datosComponenteB) {
        binding.setDatos(datosComponenteB);
    }

    public void setOnClickComponentBlistener(OnClickComponentB onClickComponentBlistener) {
        this.onClickComponentB = onClickComponentBlistener;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnComponentBOK:
                onClickB();
                break;
        }
    }

    private void onClickB() {
        if (onClickComponentB != null) {
            onClickComponentB.onClickB("Mensaje desde B");
        }
    }
}
