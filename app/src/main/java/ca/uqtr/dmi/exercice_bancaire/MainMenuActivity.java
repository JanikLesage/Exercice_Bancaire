package ca.uqtr.dmi.exercice_bancaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ca.uqtr.dmi.exercice_bancaire.databinding.ActivityMainMenuBinding;

public class MainMenuActivity extends AppCompatActivity {
    private ActivityMainMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.FundTransferButton.setOnClickListener(this::onFundTransferButtonClicked);
        binding.PayBillButton.setOnClickListener(this::onBillPaymentButtonClicked);
        binding.LogoutButton.setOnClickListener(this::onLogoutButtonClicked);
    }

    private void onBillPaymentButtonClicked(android.view.View view) {
        Intent intent = new Intent(this, BillPaymentActivity.class);
        startActivity(intent);
    }

    private void onFundTransferButtonClicked(android.view.View view) {
        Intent intent = new Intent(this, FundTransferActivity.class);
        startActivity(intent);
    }

    private void onLogoutButtonClicked(android.view.View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }
}