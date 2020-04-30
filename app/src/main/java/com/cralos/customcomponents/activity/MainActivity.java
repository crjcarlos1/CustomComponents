package com.cralos.customcomponents.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cralos.customcomponents.R;
import com.cralos.customcomponents.fragments.databinding.view.FragmentDataBinding;
import com.cralos.customcomponents.fragments.nodatabinding.FragmentNoDataBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragmentDataBinding();
    }

    private void showFragmentDataBinding() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentDataBinding.TAG);
        transaction.add(R.id.containerFragments, new FragmentDataBinding(), FragmentDataBinding.TAG).commit();
    }

    private void showFragmentNoDataBinding() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentNoDataBinding.TAG);
        transaction.add(R.id.containerFragments, new FragmentNoDataBinding(), FragmentNoDataBinding.TAG).commit();
    }
}
