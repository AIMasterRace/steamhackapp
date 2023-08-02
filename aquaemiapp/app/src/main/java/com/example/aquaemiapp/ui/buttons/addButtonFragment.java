package com.example.aquaemiapp.ui.buttons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aquaemiapp.databinding.FragmentAddButtonBinding;
import com.example.aquaemiapp.databinding.FragmentMapBinding;
import com.example.aquaemiapp.ui.map.MapViewModel;

public class addButtonFragment extends Fragment {

    private FragmentAddButtonBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAddButtonBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view,
                              Bundle savedInstanceState){

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}