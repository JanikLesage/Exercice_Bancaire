package ca.uqtr.dmi.exercice_bancaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ca.uqtr.dmi.exercice_bancaire.databinding.ActivityFundTransferBinding;

public class FundTransferActivity extends AppCompatActivity {
    private ActivityFundTransferBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFundTransferBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.BackButton.setOnClickListener(this::onBackButtonClicked);
        binding.TransferButton.setOnClickListener(this::onTransferButtonClicked);
    }

    private void onBackButtonClicked(android.view.View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    private void onTransferButtonClicked(android.view.View view) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}