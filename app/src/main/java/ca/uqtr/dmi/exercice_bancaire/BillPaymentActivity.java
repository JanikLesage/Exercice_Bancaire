package ca.uqtr.dmi.exercice_bancaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ca.uqtr.dmi.exercice_bancaire.databinding.ActivityBillPaymentBinding;

public class BillPaymentActivity extends AppCompatActivity {
    private ActivityBillPaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBillPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.BackButton.setOnClickListener(this::onBackButtonClicked);
        binding.PayButton.setOnClickListener(this::onPayButtonClicked);
    }

    private void onBackButtonClicked(android.view.View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    private void onPayButtonClicked(android.view.View view) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}