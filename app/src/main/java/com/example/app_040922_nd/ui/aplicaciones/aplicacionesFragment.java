package com.example.app_040922_nd.ui.aplicaciones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.databinding.FragmentAplicacionesBinding;

public class aplicacionesFragment extends Fragment {

    private FragmentAplicacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aplicacionesViewModel abriraplicacionesViewModel =
                new ViewModelProvider(this).get(aplicacionesViewModel.class);

        binding = FragmentAplicacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageButton ib_whatsapp = binding.ibWhatsapp;
        final ImageButton ib_facebook = binding.ibFacebook;
        final ImageButton ib_gallery = binding.ibGallery;
        final ImageButton ib_messenger = binding.ibMessenger;
        final ImageButton ib_maps = binding.ibMaps;
        final ImageButton ib_health = binding.ibHealth;

        ib_whatsapp.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent whatsapp = getActivity().getPackageManager().getLaunchIntentForPackage("com.whatsapp"); startActivity(whatsapp); }});
        ib_facebook.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent facebook = getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana"); startActivity(facebook); }});
        ib_gallery.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent gallery = getActivity().getPackageManager().getLaunchIntentForPackage("com.android.gallery3d"); startActivity(gallery); }});
        ib_messenger.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent messenger = getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.orca"); startActivity(messenger); }});
        ib_maps.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent maps = getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps"); startActivity(maps); }});
        ib_health.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent health = getActivity().getPackageManager().getLaunchIntentForPackage("com.huawei.health"); startActivity(health); }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}