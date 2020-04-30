package com.cralos.customcomponents.fragments.databinding.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.cralos.customcomponents.R;
import com.cralos.customcomponents.databinding.FragmentDatabindingBinding;
import com.cralos.customcomponents.fragments.databinding.interfaces.OnClickComponentB;
import com.cralos.customcomponents.fragments.databinding.models.DatosComponenteB;

public class FragmentDataBinding extends Fragment implements OnClickComponentB {
    public static final String TAG = FragmentDataBinding.class.getSimpleName();

    /**
     * BINDING
     */
    private FragmentDatabindingBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_databinding, container, false);

        DatosComponenteB datosComponenteB = new DatosComponenteB("TITULO DEL COMPONENTE B", "MENSAJE DEL COMPONENTE B");
        binding.componentB.setOnClickComponentBlistener(this);
        binding.componentB.setDatosComponenteB(datosComponenteB);

        return binding.getRoot();
    }

    @Override
    public void onClickB(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
