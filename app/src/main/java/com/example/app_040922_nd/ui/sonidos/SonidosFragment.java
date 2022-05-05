package com.example.app_040922_nd.ui.sonidos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentSonidosBinding;

public class SonidosFragment extends Fragment {

    private FragmentSonidosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SonidosViewModel sonidosViewModel =
                new ViewModelProvider(this).get(SonidosViewModel.class);

        binding = FragmentSonidosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //--------------------------------
        final ImageView ib_uno = binding.ibUno;
        final ImageButton ib_dos = binding.ibDos;
        final ImageButton ib_tres = binding.ibTres;
        final ImageButton ib_cuatro = binding.ibCuatro;
        final ImageButton ib_cinco = binding.ibCinco;
        final ImageButton ib_seis = binding.ibSeis;
        final ImageButton ib_ocho = binding.ibOcho;
        final ImageButton ib_nueve = binding.ibNueve;
        final ImageButton ib_unouno = binding.ibUnouno;

        ib_uno.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.suno); mp.start(); }});
        ib_dos.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.sdos); mp.start(); }});
        ib_tres.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.stres); mp.start(); }});
        ib_cuatro.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.scuatro); mp.start(); }});
        ib_cinco.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.scinco); mp.start(); }});
        ib_seis.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.sseis); mp.start(); }});
        ib_ocho.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.socho); mp.start(); }});
        ib_nueve.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.snueve); mp.start(); }});
        ib_unouno.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.sdiez); mp.start(); }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}