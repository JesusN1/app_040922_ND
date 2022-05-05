package com.example.app_040922_nd.ui.calculadora;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.databinding.FragmentCalculadoraBinding;

import org.mariuszgromada.math.mxparser.Expression;


public class CalculadoraFragment extends Fragment {

    private FragmentCalculadoraBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CalculadoraViewModel calculadoraViewModel = new ViewModelProvider(this).get(CalculadoraViewModel.class);

        binding = FragmentCalculadoraBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //--------------------------------
        final TextView tv_upOperation = binding.tv1;
        final TextView tv_downRes = binding.tv2;


        final Button btn_clear = binding.btnClear;
        final Button btn_del = binding.btnDel;

        final Button btn_opRoot = binding.btnRaiz;
        final Button btn_opPer = binding.btnP;
        final Button btn_opMul = binding.btnPor;
        final Button btn_opDiv = binding.btnDiv;
        final Button btn_opAdd = binding.btnSum;
        final Button btn_opMin = binding.btnRest;
        final Button btn_equal = binding.btnCalc;
        final Button btn_dot = binding.btnPunt;

        final Button btn_n0 = binding.btn0;
        final Button btn_n1 = binding.btn1;
        final Button btn_n2 = binding.btn2;
        final Button btn_n3 = binding.btn3;
        final Button btn_n4 = binding.btn4;
        final Button btn_n5 = binding.btn5;
        final Button btn_n6 = binding.btn6;
        final Button btn_n7 = binding.btn7;
        final Button btn_n8 = binding.btn8;
        final Button btn_n9 = binding.btn9;
        //

        btn_clear.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {tv_upOperation.setText(""); tv_downRes.setText("");}});
        btn_del.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            if (!tv_upOperation.getText().toString().isEmpty()){tv_upOperation.setText(tv_upOperation.getText().toString().substring(0, tv_upOperation.getText().toString().length()-1));}
        }});
        btn_n0.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            checkChar("number", "0");
        }});
        btn_n1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "1"); }});
        btn_n2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "2"); }});
        btn_n3.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "3"); }});
        btn_n4.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "4"); }});
        btn_n5.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "5"); }});
        btn_n6.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "6"); }});
        btn_n7.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "7"); }});
        btn_n8.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "8"); }});
        btn_n9.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("number", "9"); }});

        btn_opPer.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", "%"); }});
        btn_opMul.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", "x"); }});
        btn_opDiv.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", "÷"); }});
        btn_opAdd.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", "+"); }});
        btn_opMin.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", "-"); }});
        btn_dot.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { checkChar("operator", ","); }});
        btn_equal.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            String replacedString = tv_upOperation.getText().toString();
            replacedString = replacedString.replace('÷','/');
            replacedString = replacedString.replace('x','*');
            replacedString = replacedString.replace(',','.');
            replacedString = replacedString.replace("(","*(");
            Expression exp = new Expression(replacedString);
            tv_downRes.setText(String.valueOf(exp.calculate()));
            checkChar("operator", "=");
        }});
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    public void checkChar(String inType, String value){
        final TextView tv_upOperation = binding.tv1;

        if (inType.equals("number")) {
            tv_upOperation.setText(String.format("%s%s", tv_upOperation.getText(), value));
        }
        else {
            if (!tv_upOperation.getText().toString().isEmpty()){
                String lc = tv_upOperation.getText().toString().substring(tv_upOperation.getText().toString().length() - 1);    // Ultimo caracter

                if (inType.equals("operator")){
                    if (lc.equals("0") || lc.equals("1") || lc.equals("2") || lc.equals("3") || lc.equals("4") || lc.equals("5") || lc.equals("6") || lc.equals("7") || lc.equals("8") || lc.equals("9")) {
                        tv_upOperation.setText(String.format("%s%s", tv_upOperation.getText(), value));
                    }
                }
            }
        }
    }
}