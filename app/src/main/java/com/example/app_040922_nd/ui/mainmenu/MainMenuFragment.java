package com.example.app_040922_nd.ui.mainmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.databinding.FragmentMainmenuBinding;

public class MainMenuFragment extends Fragment {

    private FragmentMainmenuBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        MainMenuViewModel mainMenuViewModel =
                new ViewModelProvider(this).get(MainMenuViewModel.class);

        binding = FragmentMainmenuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        /*final TextView textView = binding.textHome;// textView.setTypeface(ResourcesCompat.getFont(null, R.font.montserrat_alternates_light));
        mainMenuViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}