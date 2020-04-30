package com.cralos.customcomponents.fragments.nodatabinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cralos.customcomponents.R;
import com.cralos.customcomponents.fragments.nodatabinding.component.ComponentA;

public class FragmentNoDataBinding extends Fragment implements OnClickComponentA {
    public static final String TAG = FragmentNoDataBinding.class.getSimpleName();

    private ComponentA componentA;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_no_databinding, container, false);
        componentA = view.findViewById(R.id.componentA);
        componentA.setOnClickComponentAlistener(this);
        componentA.setDataComponentA("Titulo ejemplo","El mesaje del componente a");
        return view;
    }

    @Override
    public void onClickComponentA(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
