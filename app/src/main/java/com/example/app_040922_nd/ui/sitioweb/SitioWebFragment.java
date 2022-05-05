package com.example.app_040922_nd.ui.sitioweb;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentSitiowebBinding;
import com.example.app_040922_nd.ui.sitioweb.SitioWebViewModel;

public class SitioWebFragment extends Fragment {

    private FragmentSitiowebBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SitioWebViewModel sitiowebViewModel =
                new ViewModelProvider(this).get(SitioWebViewModel.class);

        binding = FragmentSitiowebBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webvurl = binding.webv;
        WebSettings webSettings = webvurl.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        EditText edt_url = binding.edtUrl;
        Button btn_buscar = binding.btnBuscar;

        webvurl.loadUrl("https://www.uandina.edu.pe/");

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                webvurl.setWebViewClient(new WebViewClient());
                webvurl.loadUrl("http://" + edt_url.getText().toString());
            }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}